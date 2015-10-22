/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio102;

/**
 *
 * @author adrianferialopez
 */
public class alumne {
    
    String nom;
    short edad;
    String curs;

    public alumne(String nom, short edad, String curs) {
        this.nom = nom;
        this.edad = edad;
        this.curs = curs;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }
    
    
    
}
