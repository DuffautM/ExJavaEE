/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.business.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author maxime
 */
@Entity
@Table(name="etudiants")
public class Student implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long studentId;
    @Column(name="prenom")
    private String firstname;
    @Column(name="nom")
    private String lastname;
    @Column(name="email")
    private String email;
    @Column(name="motdepasse")
    private String password;
    
    public Long getStudentId() {
        return studentId;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    } 
    
}
