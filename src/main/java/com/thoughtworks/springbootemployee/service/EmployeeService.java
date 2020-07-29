package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> getEmployees();

    Boolean deleteEmployee(Integer employeeId);

    Boolean updateEmployee(Employee employee);

    Employee getEmployee(Integer id);

    List<Employee> getEmployeesByGender(String gender);

    List<Employee> queryEmployeesByPage(Integer page, Integer pageSize);
}
