/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Paquet
package cine;

/**
 * @author Carlos J. García Carmona
 * @author adrianferialopez
 */

public class Butaca
{  
    // Atributs
    private byte fila; // fila on està la butaca
    private byte seient; // número de la butaca
    private String persona; // persona que ha reservat la butaca

    // Constructors
    public Butaca(byte fila, byte seient, String persona)
    {
        this.fila = fila;
        this.seient = seient;
        this.persona = persona;
    }
    
    public Butaca(byte fila, byte seient)
    {
        this.fila = fila;
        this.seient = seient;
    }

    // Getters
    public byte getFila()
    {
        return fila;
    }

    public byte getSeient()
    {
        return seient;
    }

    public String getPersona()
    {
        return persona;
    }
    
    // Mètodes propis
    public boolean equals(Butaca butacaAcomparar)
    {   
        return this.getFila() == butacaAcomparar.getFila() && this.getSeient() == butacaAcomparar.getSeient();  
    }

    @Override
    public String toString()
    {
        return "Fila: " + fila + ", Seient: " + seient + ", Persona: " + persona;
    }
}
