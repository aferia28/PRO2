/*
Escriu un programa que demani les dades a tres alumnes. D'aquests 3 alumnes ens interessa: 
nom i edat. Sabem que aquests alumnes tenen la mateixa edat; amb el que, aquesta dada es demanarà 
una sola vegada per assignar-li a cadascun dels alumnes. Per això demanarem l'edat en el main i 
se l'enviarem a cada objecte.
Posteriorment, el programa visualitzarà les dades dels tres alumnes.
 */
package ejercicio.pkg10.pkg1;
import java.util.Scanner;
/**
 *
 * @author adrianferialopez
 */
public class Ejercicio101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int i,edad;
        String nombre;
        alumne alum[] = new alumne[2];
        
        Scanner dades = new Scanner(System.in);
        System.out.println("Que edad tienen los alumnos?\n");
        edad = dades.nextInt(); 
        
        for(i=0; i<alum.length;i++)
        {
            System.out.println("Introduce el nombre del alumno " + (i+1) +";");
            nombre = dades.next(); //¿Porque si pongo nextLine(), me pregunta seguidamente el nombre de los Alumnos?
            
            alum[i] = new alumne(nombre,edad);
        }
        
        for(i=0; i<alum.length; i++)
        {
            System.out.println("Alumno_" + (i+1) + ": " + alum[i].getNom() + ", " + alum[i].getEdat()); // que printe la edad tambien.
        }
        // TODO code application logic here
    }
    
}
