/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19.pkg2;
import java.util.Scanner;

/**
 *
 * @author adrianferialopez
 */
public class Ejercicio192 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dades = new Scanner(System.in);
        int radi;
        
        Cercle c1 = new Cercle();
        Punt p1 = new Punt();
        System.out.println("Introduce un vvalor para posicionX");        
        p1.setPosicioX(dades.nextInt());
        
        System.out.println("Introduce un valor para posicionY");
        p1.setPosicioY(dades.nextInt());
        
        System.out.println("Introdueix el radi del cercle");
        radi = dades.nextInt();
        //c1.setRadi(dades.nextInt());
        
        Cercle c2 = new Cercle(2,4,8);
        c1 = new Cercle(p1, radi);
        
        
        // TODO code application logic here
    }
    

}
