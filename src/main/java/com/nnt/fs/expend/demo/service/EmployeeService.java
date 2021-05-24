package com.nnt.fs.expend.demo.service;

import com.nnt.fs.expend.demo.model.entity.Employee;
import com.nnt.fs.expend.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAllAndOrderByCreatedDate();
    }

    public Page<Employee> findAll(Pageable pageable){
        return employeeRepository.findAll(pageable);
    }

    public Employee findById(long id){
        return employeeRepository.findById(id).orElse(null);
    }

    public Employee save (Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteById(long id){
        employeeRepository.deleteById(id);
    }
}
