/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola_db4o;

import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class Professor extends Persona {

    private ArrayList<Grup> grups = new ArrayList();
    
    public Professor(String nom, String cognom, String nif, int dia, int mes, int any, String adre, String tel) {
        super(nom, cognom, nif, dia, mes, any, adre, tel);
    }

    public ArrayList<Grup> getGrups() {
        return grups;
    }

    public void setGrups(ArrayList<Grup> grups) {
        this.grups = grups;
    }
    
    public void anyadirGrup(Grup g){
        grups.add(g);
    }
    
    public void eliminarGrup (Grup g){
        ListIterator ite = grups.listIterator();
        while (ite.hasNext()){
            if (g.equals(ite.next())){
                ite.remove();
            }
        }
    }    
}
