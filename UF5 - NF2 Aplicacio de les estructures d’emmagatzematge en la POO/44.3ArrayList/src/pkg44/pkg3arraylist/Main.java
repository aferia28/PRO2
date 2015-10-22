/*
Crear un programa que:

- Llegeixi una frase per teclat.
- Guardi cadascuna de les paraules de la frase com a un element d'un ArrayList.
- Mostri cada element de l'ArrayList en cada línia.

 */
package pkg44.pkg3arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author adrianferialopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String texto = Teclado.leerString("Introdueix una frase: ");
           String[] array = texto.split(" "); // metodo split() separa en una array los elementos entre espacios.(En este caso espacios porque es lo que le hemos pasado)
                                             //Lo guardamos en una array con nombre "array"
           ArrayList<String> lista = new ArrayList(Arrays.asList(array)); // "Arrays.asList(array)" la convierte en una lista, y creamos una arrayList a raiz de esta lista.
           
           
           for(int i = 0; i<lista.size(); i++) // en el bucle printamos cada palabra de la arrayList.
           {
               System.out.println(lista.get(i));
           }
    }
    
}
