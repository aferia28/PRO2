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

public class ExcepcioNomPersonaIncorrecte extends Exception
{
    // Constructors
    public ExcepcioNomPersonaIncorrecte()
    {
        
    }

    public ExcepcioNomPersonaIncorrecte(String missatge)
    {
        super(missatge);
    }
}
