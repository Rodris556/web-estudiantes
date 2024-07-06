package com.univerm.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Estudiante")
public class EstudianteEntity {
    @Id
    @Column (name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre")
    private String name;
    @Column(name = "lastname")
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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
}
