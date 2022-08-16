package com.springbootthymeleaf.springboot.thymeleaf.Entities;

import javax.persistence.*;

@Entity
@Table(name = "worker")
public class Worker {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "shift_type")
    private String shift_type;

    public Worker() {
    }

    public Worker(int id, String name, String lastname, String shift_type) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.shift_type = shift_type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getShift_type() {
        return shift_type;
    }

    public void setShift_type(String shift_type) {
        this.shift_type = shift_type;
    }
}
