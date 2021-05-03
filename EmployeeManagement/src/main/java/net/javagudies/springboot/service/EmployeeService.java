package net.javagudies.springboot.service;

import java.util.List;

import net.javagudies.springboot.model.Employee;


public interface EmployeeService {
    List < Employee > getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}