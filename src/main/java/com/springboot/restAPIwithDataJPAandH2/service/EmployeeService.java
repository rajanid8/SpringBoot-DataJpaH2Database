package com.springboot.restAPIwithDataJPAandH2.service;

import com.springboot.restAPIwithDataJPAandH2.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void saveEmployee(Employee employee);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);
}
