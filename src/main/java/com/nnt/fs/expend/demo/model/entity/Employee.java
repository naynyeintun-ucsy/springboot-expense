package com.nnt.fs.expend.demo.model.entity;

import com.nnt.fs.expend.demo.constant.TableNames;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table (name = TableNames.EMPLOYEE)
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "USER_ID")
    Long userId;

    @Column (name = "FIRST_NAME")
    String firstName;


    @Column (name = "LAST_NAME")
    String lastName;

    @Column (name = "EMAIL")
    String email;

    @Column (name = "MOBILE")
    String mobile;

    @Column (name = "SALARY")
    BigDecimal salary;

}
