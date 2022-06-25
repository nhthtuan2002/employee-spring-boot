package com.example.baithispringboot.entity;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "employee")

public class Employee {
    @Id
    private int id;
    private String name;
    private String wage;
}
