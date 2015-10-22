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

public class Principal
{
    // Punt d'entrada de l'aplicació
    public static void main(String[] args) throws ExcepcioFilaIncorrecta, ExcepcioSeientIncorrecte, ExcepcioNomPersonaIncorrecte, ExcepcioButacaOcupada, ExcepcioButacaLliure
    {    
        Cine cine = new Cine();
        cine.iniciar();
    }
}
