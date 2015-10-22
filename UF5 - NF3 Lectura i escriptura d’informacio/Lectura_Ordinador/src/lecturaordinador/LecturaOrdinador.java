/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaordinador;

/**
 *
 * @author adrianferialopez
 */
public class LecturaOrdinador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ordinador ord1 = new Ordinador((float) 2.2, 4, 500, "ASUS FC1200", true);
        Ordinador ord2 = new Ordinador((float) 1.7, 8, 750, "ASUS XCT210", true);
        
        
        GestionFichero gf = new GestionFichero();
        gf.escribirFichero("Ordinador.txt", true, ord1);
        gf.escribirFichero("Ordinador.txt", true, ord2);
        
        gf.leerFichero("Ordinador.txt"); //lectura del fichero
        
    }
    
}
