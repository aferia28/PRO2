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
public class Persona {
    
    private String nom;
    private String cognom;
    private String nif;
    private Date data_naixament;
    private String adre;
    private String tel;

    public Persona(String nom, String cognom, String nif, int dia, int mes, int any, String adre, String tel) {
        this.nom = nom;
        this.cognom = cognom;
        this.nif = nif;
        Date data_naixament = new Date (any, mes, dia);
        this.adre = adre;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getData_naixament() {
        return data_naixament;
    }

    public void setData_naixament(Date data_naixament) {
        this.data_naixament = data_naixament;
    }

    public String getAdre() {
        return adre;
    }

    public void setAdre(String adre) {
        this.adre = adre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "\nnom: " + nom + "\ncognom :" + cognom + "\nnif: " + nif + "\ndata_naixament: " + data_naixament + "\nadreça: " + adre + "\ntelefon: " + tel + "\nEs un ";
    }
    
    
}
