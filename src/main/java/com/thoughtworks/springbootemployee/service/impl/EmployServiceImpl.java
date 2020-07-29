package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    @Override
    public void addEmployee(Employee employee) {
        employeeRepository.addEmployee(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return null;
    }

    @Override
    public Boolean deleteEmployee(Integer employeeId) {
        return null;
    }

    @Override
    public Boolean updateEmployee(Employee employee) {
        return null;
    }

    @Override
    public Employee getEmployee(Integer id) {
        return null;
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) {
        return null;
    }

    @Override
    public List<Employee> queryEmployeesByPage(Integer page, Integer pageSize) {
        return null;
    }
}
