/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirleercsv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author joan
 */
public class Alumne {
             
    private String nom;
    private String apellido;
    private int edat;
    
    public Alumne() {};
    public Alumne (String nom,
                   String apellido,
                   int edat){
        this.nom = nom;
        this.apellido = apellido;
        this.edat = edat;

    }
    
    public String getNom()
    {
        return nom;
    }
    public String getApellido(){
        return apellido;
    }
    public int getEdat()
    {
        return edat;
    }
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setEdat(int edat)
    {
        this.edat=edat;
    }
    
    public String toString()
    {
        return (nom+" "+apellido+" "+edat);
    }
}
