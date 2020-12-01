package com.liang.springboottest.polo;

import lombok.Data;
import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
@Data
public class Firstcase {
    @Id
    private Long id;
    private String name;
    private Boolean gender;
    private String address;
    private String qq;
    private String email;
}
