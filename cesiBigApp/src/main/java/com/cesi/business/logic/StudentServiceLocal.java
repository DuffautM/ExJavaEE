/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.business.logic;

import javax.ejb.Local;

/**
 *
 * @author maxime
 */
@Local
public interface StudentServiceLocal {
    public void addStudent(String firstname, String lastname);
    public void addAuthenticationInformations(String email, String pwd);
    public void save();  
}
