/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirleercsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author joan
 */
public class EscribirLeerCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestionFichero gf = new GestionFichero();
        Alumne a1 = new Alumne("Toni", "andreu", 25);
        Alumne a2 = new Alumne("Pere", "andreu", 27);
        gf.EscribeEnTextoCSV("Alumnes.csv", false, a1); //Primer parametro: Nombre que tendrá el fichero. 
                                                       //Segundo parametro: Si quieres que te añada lineas, o te lo borre y cree uno nuevo. 
                                                            //Si el parametro es false, siempre creará un nuevo archivo, borrando el anterior.
                                                            //Si es true, añadirá a continuación lo que le pasemos en el tercer parametro.
                                                       //Tercer parametro: Objeto que va a escribir.
        gf.EscribeEnTextoCSV("Alumnes.csv", true, a2);
        gf.leerDeCSV("Alumnes.csv");
     
   } 
 
}
