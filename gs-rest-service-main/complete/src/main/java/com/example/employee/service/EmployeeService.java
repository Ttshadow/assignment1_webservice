package com.example.employee.service;

import com.example.employee.module.Address;
import com.example.employee.module.Department;
import com.example.employee.module.Employee;

import java.util.ArrayList;

public class EmployeeService {
    public static ArrayList<Employee> employees = new ArrayList<>();

    public ArrayList<Employee> showAllEmployee(){

        Employee e1 = new Employee(1,"Harry","Potter","Sales",
                new Address(123,"Churchill Plaza","Montreal","Canada"),
                new Department(11,"Marketing Department"));
        Employee e2 = new Employee(2,"Hermione","Granger","Accounting",
                new Address(456,"47th Avenue","Montreal","Canada"),
                new Department(22,"Financial Department"));
        Employee e3 = new Employee(3,"Ron","Weasley","sales",
                new Address(789,"Chairing Cross Rd","Montreal","Canada"),
                new Department(33,"Technical Department"));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        return employees;
    }

    public Employee findEmployeeById(int id){
        for (Employee e : employees){
            if (e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
}
