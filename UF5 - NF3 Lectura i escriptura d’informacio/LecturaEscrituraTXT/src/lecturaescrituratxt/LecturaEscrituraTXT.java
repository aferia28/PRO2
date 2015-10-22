/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaescrituratxt;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author jserrano
 */
public class LecturaEscrituraTXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumne a1 = new Alumne("Toni", 25);
        Alumne a2 = new Alumne("Pere", 27);
        GestionFichero gf = new GestionFichero();
        //guardo los dos Alumnos en el fichero Alumnes.txt
        gf.EscribeEnFicheroTexto("Alumnes.txt", false, a1);
        gf.EscribeEnFicheroTexto("Alumnes.txt", false, a2);
        //leo el archivo Alumnes.txt
        gf.leerArchivoTXT("Alumnes.txt");
    }  
}
