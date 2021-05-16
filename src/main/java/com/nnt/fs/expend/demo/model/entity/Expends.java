package com.nnt.fs.expend.demo.model.entity;

import com.nnt.fs.expend.demo.constant.TableNames;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import java.math.BigDecimal;



@Entity
@Table (name = TableNames.EXPENDS)
@Getter
@Setter
public class Expends {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    long id;


    @Column (name = "AMOUNT")
    BigDecimal amount;


    @Column (name = "EXPENDS")
    String expends;

    @Column (name = "DESCRIPTION")
    String description;


}
