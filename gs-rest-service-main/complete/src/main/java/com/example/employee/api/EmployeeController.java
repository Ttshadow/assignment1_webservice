package com.example.employee.api;

import com.example.employee.module.Employee;
import com.example.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmployeeController {
    EmployeeService employeeService = new EmployeeService();

    @GetMapping("/employee")
    public ArrayList<Employee> allEmployees() {
        return employeeService.showAllEmployee();
    }

    @GetMapping("/employee/{id}")
    public Employee findById(@PathVariable int id) {
        return employeeService.findEmployeeById(id);
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }
}
