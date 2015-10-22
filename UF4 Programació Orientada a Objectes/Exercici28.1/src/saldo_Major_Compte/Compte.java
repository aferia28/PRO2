/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldo_Major_Compte;

/**
 *
 * @author adrianferialopez
 */
public class Compte {
    
    private String nom;
    private String ncuenta;
    private float saldo;
    
    public Compte(){
    }

    public Compte(String nom, String ncuenta, float saldo) {
        this.nom = nom;
        this.ncuenta = ncuenta;
        this.saldo = saldo;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNcuenta() {
        return ncuenta;
    }

    public void setNcuenta(String ncuenta) {
        this.ncuenta = ncuenta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
}
