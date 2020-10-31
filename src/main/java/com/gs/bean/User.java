package com.gs.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_test")
public class User implements Serializable {

    @Id
    @Column(name = "t_id")
    private Integer t_id;
    private String ename;
    private Double salary;
    private String hiredate;
}