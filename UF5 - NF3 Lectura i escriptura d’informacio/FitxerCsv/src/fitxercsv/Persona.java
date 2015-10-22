/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxercsv;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;




/**
 *
 * @author Ivan Martin Lopez
 * Classe ordinador, que tingui com atributs: Processador, memoria, HDD, Placa Base i si té unitat de cd o no.
 */
public class Persona {
    private String nom;
    private String cognom;
    private String NIF;
    private Date data_naix;
    
    public Persona(){
        
    }
    
    public Persona (String nom, String cognom, String NIF, Date data_naix){
        this.nom = nom;
        this.cognom = cognom;
        this.NIF = NIF;
        this.data_naix = data_naix;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return the cognom
     */
    public String getCognom() {
        return cognom;
    }

    /**
     * @return the NIF
     */
    public String getNIF() {
        return NIF;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param cognom the cognom to set
     */
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    /**
     * @param NIF the NIF to set
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data_naix;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data_naix = data;
    }
    
    @Override
    public String toString() {
        Format formatter = new SimpleDateFormat("dd-MM-yyyy");
        String s = formatter.format(getData());
        
        return nom + " - " + cognom + " - " + NIF + " - " + s;
    }
    
}