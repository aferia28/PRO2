/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17.pkg2;

import java.util.Scanner;

/**
 *
 * @author adrianferialopez
 */
public class Ejercicio172 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        familias familias1[] = new familias[3]; //Instancia array (3) de familias
        
        Scanner dades = new Scanner(System.in);
        
        for(int i = 0; i<familias1.length; i++)
        {
            familias1[i] = new familias(); //Indicamos que familias1[i] van a ser del tipo familias.
            System.out.println("Introduce la direccion de la familia " + (i+1));
            //dire = dades.next();
            familias1[i].setDireccion(dades.next());
            
            for(int j = 0; j<familias1[i].miembro_familia.length; j++)
            {
                familias1[i].miembro_familia[j] = new miembro();
                System.out.println("Nombre: ");
                //nombre = dades.next();
                familias1[i].miembro_familia[j].setNombre(dades.next()); // le pasamos el valor de la variable directamente con el SET.
                System.out.println("Edad: ");
                //edad = dades.nextShort();
                familias1[i].miembro_familia[j].setEdad(dades.nextShort());
                
                //familias1[i].miembro_familia[j]; = new miembro(nombre,edad);
            }
            
        }
        
        for(int i = 0; i<familias1.length; i ++)
        {
            System.out.println("Familia " + (i+1) + ": \n" + familias1[i].getDireccion() + "\n");
            for(int j = 0; j<familias1[i].miembro_familia.length; j ++)
            {
                System.out.println("Nombre: " + familias1[i].miembro_familia[j].getNombre() + "\n");
                System.out.println("Edad: " + familias1[i].miembro_familia[j].getEdad() + "\n");
            }
        } 
    }
    
}
