/*
Escriu un programa que demani les dades de 3 alumnes. D'aquests alumnes, ens interessa el nom i l'edat. Posteriorment,
el programa ha de visualitzar la mitja d'edat dels 3 alumnes.
 */
package ejercicio121;
import java.util.Scanner;

/**
 *
 * @author adrianferialopez
 */
public class Ejercicio121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre;
        short edad, i;
        
        alumne alum[] = new alumne[3];
        
        Scanner dades = new Scanner(System.in);
        
        for(i=0; i<alum.length; i++)
        {
            System.out.println("Nom: ");
            nombre = dades.next();
            System.out.println("Edad: ");
            edad = dades.nextShort();
            
            alum[i] = new alumne(nombre, edad);
            
        }
        
        int media = (alum[0].getEdad() + alum[1].getEdad() + alum[2].getEdad()) / 3;
        
        System.out.println("La media de edades es de : " + media);
    }
    
}
