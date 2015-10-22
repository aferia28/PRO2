/*
Escriu un programa que demani les dades dels quatre membres d'una família. Les dades que ens interessa són:
- Nom
- Edat
- Direcció

La direcció de tots els membres de la família serà sempre la mateixa, amb el que aquesta dada només es demanarà una
sola vegada i si canvia la direcció d'un familiar, això afectarà a la resta de la família.

Visualitza les dades de tots els membres de la família.

Posteriorment, la família canvia de direcció amb el que el programa demanarà aquesta nova direcció.

Tornar a visualitzar lesdades de tots els membres de la família amb la finalitat de comprovar que el canvi de direcció
ha afectat a tots els membres. 

Per últim, es visualitzarà la mita d'edat de la família.

 */
package ejercicio17.pkg1;
import java.util.Scanner;
/**
 *
 * @author adrianferialopez
 */
public class Ejercicio171 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombre, dire;
        short edad;
        
        miembro miembro_familia[] = new miembro[4];
        
        Scanner dades = new Scanner(System.in);
        
        System.out.println("¿Donde vive la familia?");
        dire = dades.next();
        
        for(short i= 0; i<miembro_familia.length; i++)
        {
            System.out.println("Nombre: ");
            nombre = dades.next();
            System.out.println("Edad: ");
            edad = dades.nextShort();
            
            miembro_familia[i] = new miembro(nombre, dire, edad);
        }
        
        System.out.println("\nIntegrantes de la familia\n" + "------------------------\n");
        for(short i = 0; i < miembro_familia.length; i++)
        {
            System.out.println(miembro_familia[i].getNombre() + ", " + miembro_familia[i].getEdad() + "\n");
        }
        System.out.println("Dirección: " + miembro_familia[1].getDireccion());
        
        System.out.println("\n\n La familia se ha cambiado de direccion...\n");
        System.out.println("Introduce la nueva direccion de la familia.");
        dire = dades.next();
        
        miembro_familia[1].setDireccion(dire);
        
        System.out.println("La nueva dirección de la familia es: \n");
        System.out.println(miembro_familia[0].getDireccion());
        
    }
    
}
