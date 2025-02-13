package com.example.employee.service;

import com.example.employee.Beans.Employee;
import com.example.employee.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee saveEmloyee(Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        return savedEmployee;
    }

    @Override
    public Employee searchEmployee(int eno) {
        Employee employee = employeeRepository.findEmployeeByEno(eno);
        return employee;
    }

    @Override
    public int updateEmployee(Employee employee) {
        int rowCount = employeeRepository.updateEmployee(employee.getEno(), employee.getEname(),employee.getEsal(), employee.getEaddr());
        return rowCount;
    }

    @Override
    public int deleteEmployee(int eno) {
        int rowCount = employeeRepository.deleteEmployeeByEno(eno);
        return rowCount;
    }
}
