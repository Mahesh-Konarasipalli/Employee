package com.example.employee.controller;

import com.example.employee.Beans.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showWelcomepage() {
        return "welcome";
    }
    @RequestMapping (value="/addpage" , method= RequestMethod.GET)
    public String ShowAddEmployee(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "addpage";
    }
    @RequestMapping(value = "/searchpage", method = RequestMethod.GET)
    public String SearchEmployee(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "search";
    }
    @RequestMapping(value = "/updatepage" , method= RequestMethod.GET)
    public String showUpdatepage(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "update";
    }
    @RequestMapping(value = "/deletepage" , method= RequestMethod.GET)
    public String ShowDeletepage(ModelMap model) {
        model.addAttribute("employee", new Employee());
        return "Delete";
    }
    @RequestMapping(value = "/delete" , method= RequestMethod.POST)
    public String DeleteEmployee(@RequestParam("eno") int eno, ModelMap model) {
        Employee emp = employeeService.searchEmployee(eno);
        if(emp == null){
            model.addAttribute("status", "Employee not found");
        }else{
            int rowCount = employeeService.deleteEmployee(eno);
            if(rowCount == 1){
                model.addAttribute("status", "Employee deleted successfully");
            }else {
                model.addAttribute("status", "Employee not found");
            }
        }
        return "status";
    }
    @RequestMapping(value = "/edit" , method= RequestMethod.POST)
    public String editEmployee(@RequestParam("eno") int eno, ModelMap model) {
        Employee emp = employeeService.searchEmployee(eno);
        if (emp == null) {
            model.addAttribute("status", "Employee not found");
            return "status";
        }else {
            model.addAttribute("employee", emp);
            return "editform";
        }
    }
    @RequestMapping(value = "/updated" , method= RequestMethod.POST)
    public String updateEmployee(Employee employee, ModelMap model) {
        int rowCount = employeeService.updateEmployee(employee);
        if (rowCount == 1) {
            model.addAttribute("status", "Employee updated successfully");
        }else {
            model.addAttribute("status", "Employee not updated");
        }
        return "status";
    }
    @RequestMapping(value = "/search" , method= RequestMethod.POST)
    public String ShowEmployee(ModelMap model, Employee employee) {
        Employee emp = employeeService.searchEmployee(employee.getEno());
        if (emp == null) {
            model.addAttribute("status", "Employee not found");
            return "status";
        }else {
            model.addAttribute("employee", emp);
            return "employeeDetails";
        }
    }
    @RequestMapping(value = "/add" , method= RequestMethod.POST)
    public String addEmployee(Employee employee, ModelMap model) {
        Employee emp = employeeService.searchEmployee(employee.getEno());
        if (emp == null) {
            Employee emp1 = employeeService.saveEmloyee(employee);
            if (emp1 != null) {
                model.addAttribute("status", "Employee Added Success");
            }else {
                model.addAttribute("status", "Employee Adding is Failed");
            }
        }else {
            model.addAttribute("status", "Employee Already Exist");
        }
        return "status";
    }
}
