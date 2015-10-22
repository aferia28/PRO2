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
public class PersonalNoDocent extends Persona{
    
    private String tasca;

    public PersonalNoDocent(String tasca, String nom, String cognom, String nif, int dia, int mes, int any, String adre, String tel) {
        super(nom, cognom, nif, dia, mes, any, adre, tel);
        this.tasca = tasca;
    }

    public String getTasca() {
        return tasca;
    }

    public void setTasca(String tasca) {
        this.tasca = tasca;
    }    
    
}
