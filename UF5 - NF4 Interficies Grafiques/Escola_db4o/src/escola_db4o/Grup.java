/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola_db4o;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class Grup {
    
    private String nom;
    private String nif_profe;
    private ArrayList<Alumne> alumnes;

    public Grup(String nom, String nif_profe) {
        this.nom = nom;
        this.nif_profe = nif_profe;
        alumnes = new ArrayList<>();
    }

    
    
    public Grup(String nom, String nif_profe, ArrayList<Alumne> alumnes) {
        this.nom = nom;
        this.nif_profe = nif_profe;
        this.alumnes = alumnes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNif_profe() {
        return nif_profe;
    }

    public void setNif_profe(String nif_profe) {
        this.nif_profe = nif_profe;
    }

    public ArrayList<Alumne> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(ArrayList<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    @Override
    public String toString() {
        return "Grup: " + "nom: " + nom + ", NIF del tutor: " + nif_profe + ", alumnes: " + alumnes;
    }
    
    public void anyadirAlumne (Alumne a){
        alumnes.add(a);
    }
    
    public void eliminarAlumno (Alumne a){
        ListIterator ite = alumnes.listIterator();
        while(ite.hasNext()){
            if (ite.next().equals(a)){
                ite.remove();
            }
        }
    }
    
}
