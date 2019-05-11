/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cesi.business.logic;

import javax.ejb.Stateful;
import javax.ejb.Remove;

/**
 *
 * @author maxime
 */
@Stateful
public class StudentService implements StudentServiceLocal {

    @Override
    public void addStudent(String firstname, String lastname) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addAuthenticationInformations(String email, String pwd) {
        System.out.println("ajout    des    informations    d'authentification: "+email+" -"+pwd);
    }

    @Override
    @Remove
    public void save() {
        System.out.println("sauvegarde de l'étudiant créé");
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
