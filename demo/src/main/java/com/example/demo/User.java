package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="users")
public class  User {
    @Id
    public int id;
    @Column
    public String name;
    @Column
    public int age;
    @Column
    public String tp;
}
