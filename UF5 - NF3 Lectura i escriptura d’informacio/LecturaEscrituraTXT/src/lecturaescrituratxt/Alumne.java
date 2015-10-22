/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaescrituratxt;

//import java.io.BufferedWriter;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
/**
 *
 * @author jserrano
 */
public class Alumne {
    private String nom;
    private int edat;

    public Alumne() {};
    
    public String getNom()
    {
        return nom;
    }
    public int getEdat()
    {
        return edat;
    }
    public void setNom(String nom)
    {
        this.nom=nom;
    }
    public void setEdat(int edat)
    {
        this.edat=edat;
    }
    public Alumne(String nom, int edat)
    {
        this.nom=nom;
        this.edat=edat;
    }
    
    @Override
    public String toString()
    {
        return (nom+" "+edat);
    }
}
