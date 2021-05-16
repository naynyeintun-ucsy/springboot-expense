package com.nnt.fs.expend.demo.controller;

import com.nnt.fs.expend.demo.model.entity.Employee;
import com.nnt.fs.expend.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping (value = "/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }

    @GetMapping (value = "/employee/{id}")
    public Employee findById(@PathVariable long id){
        return employeeService.findById(id);
    }


    @PostMapping (value = "/employee")
    public Employee  createEmployee(@RequestBody Employee employee){
        return employeeService.save(employee);
    }


    @PutMapping (value = "/employee")
    public Employee updateEmployee (@RequestBody Employee employee){
        Employee oldEmployee = employeeService.findById(employee.getUserId());

        if(oldEmployee == null){
            return  createEmployee(employee);
        }
       else {
           oldEmployee.setEmail(employee.getEmail());
           oldEmployee.setFirstName(employee.getFirstName());
           oldEmployee.setLastName(employee.getLastName());
           oldEmployee.setMobile(employee.getMobile());
           oldEmployee.setSalary(employee.getSalary());
           return employeeService.save(oldEmployee);
        }
    }

    @DeleteMapping (value = "/employee/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteById(id);
    }
}
