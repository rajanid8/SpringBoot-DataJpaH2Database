package com.springboot.restAPIwithDataJPAandH2.service.impl;

import com.springboot.restAPIwithDataJPAandH2.entity.Employee;
import com.springboot.restAPIwithDataJPAandH2.repository.EmployeeRepository;
import com.springboot.restAPIwithDataJPAandH2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public void setEmployeeRepository(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> retrieveEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    public Employee getEmployee(Long employeeId) {
        //Optional<Employee> optEmp = employeeRepository.findById(employeeId);  //GR
        Optional<Employee> optEmp = Optional.ofNullable(employeeRepository.findOne(employeeId));
        return optEmp.get();
    }

    public void saveEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long employeeId){
       // employeeRepository.deleteById(employeeId);  //GR
        employeeRepository.delete(employeeId);
    }

    public void updateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
