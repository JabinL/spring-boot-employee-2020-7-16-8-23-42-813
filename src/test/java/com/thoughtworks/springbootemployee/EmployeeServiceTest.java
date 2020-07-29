package com.thoughtworks.springbootemployee;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.repository.EmployeeRepository;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTest {

    @Mock
    EmployeeService employeeService;
    @Mock
    EmployeeRepository employeeRepository;

    @Test
    public void should_return_3_employees_when_query_employee_by_page_give_4_employees_and_page_1_page_size_3(){

        //given
        List<Employee> employees = new ArrayList<>();
        for(int i=0; i<4; i++){
            Employee employee = new Employee();
            employee.setId(i+1);
            employees.add(employee);
        }
        Mockito.when(employeeRepository.getEmployees()).thenReturn(employees);
        //when
        List<Employee > employeesOfpage1 = employeeService.queryEmployeesByPage(1,4);
        //then

        assertEquals(3,employeesOfpage1.size());
    }

}
