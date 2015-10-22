/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola_db4o;

import java.util.Date;

/**
 *
 * @author adrianferialopez
 */
public class Alumne extends Persona {
    
    private String nom_grup;

    public Alumne(String nom, String cognom, String nif, int dia, int mes, int any, String adre, String tel, String nom_grup) {
        super(nom, cognom, nif, dia, mes, any, adre, tel);
        this.nom_grup = nom_grup;
    }

    public String getNom_grup() {
        return nom_grup;
    }

    public void setNom_grup(String nom_grup) {
        this.nom_grup = nom_grup;
    }

    @Override
    public String toString() {
        return super.getNom();
    }
    
    
}
