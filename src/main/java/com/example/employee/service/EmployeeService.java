package com.example.employee.service;

import com.example.employee.Beans.Employee;

public interface EmployeeService {
    public Employee saveEmloyee(Employee employee);
    public Employee searchEmployee (int eno);
    public int updateEmployee(Employee employee);
    public int deleteEmployee(int eno);
}
