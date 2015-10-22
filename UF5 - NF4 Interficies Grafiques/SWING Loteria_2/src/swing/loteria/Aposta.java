/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.loteria;

import java.util.Objects;

/**
 *
 * @author adrianferialopez
 */
public class Aposta {
    
    private String nom;
    private double aposta;

    public Aposta(String nom, double aposta) {
        this.nom = nom;
        this.aposta = aposta;
    }

    public String getNom() {
        return nom;
    }

    public double getAposta() {
        return aposta;
    }

    public void setAposta(double aposta) {
        this.aposta = aposta;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aposta other = (Aposta) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nom + "-" + aposta;
    }
    
    
}
