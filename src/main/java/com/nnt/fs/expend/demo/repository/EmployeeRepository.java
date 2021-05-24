package com.nnt.fs.expend.demo.repository;

import com.nnt.fs.expend.demo.model.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query( value = "select e from Employee  e order by e.createdDate desc")
    List<Employee> findAllAndOrderByCreatedDate();


}
