/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Paquet
package cine;

/**
 * @author Adrián Feria López
 * @author Carlos J. García Carmona
 */

public class ExcepcioFilaIncorrecta extends Exception
{
    // Constructors
    ExcepcioFilaIncorrecta()
    {
        
    }
    
    ExcepcioFilaIncorrecta(String missatge)
    {
        super(missatge);
    }
}
