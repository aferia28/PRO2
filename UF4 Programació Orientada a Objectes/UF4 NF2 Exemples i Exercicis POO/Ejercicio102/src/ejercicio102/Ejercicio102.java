/*
Escriu un programa que demani les dades de 5 alumnes que estan matriculats en una escola. Aquesta 
escola té dos cursos de formació, on 3 alumnes estan apuntats en un curs i els altres 2 en l'altre 
curs.

D'aquests alumnes ens interessa: nom del curs on està matriculat, nom i edat.

Com sabem que hi ha 3 alumnes matriculats en un curs i 2 en l'altre, el nom d'aquests cursos es demanarà
una sola vegada. Posteriorment, s'assignarà el nom d'aquests cursos als alumnes que correspongui. Per 
suposat, per cada alumne es demanarà el seu nom i edat.

seguidament es visualitzarà les dades dels 5 alumnes.

 */
package ejercicio102;
import java.util.Scanner;

/**
 *
 * @author adrianferialopez
 */
public class Ejercicio102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nom, curso;
        short i, edad;
        alumne alum[] = new alumne[5];
        
        Scanner dades = new Scanner(System.in);
        
        for(i=0; i<alum.length; i++)
        {
            System.out.println("Nom: ");
            nom = dades.next();
            System.out.println("Edad: ");
            edad = dades.nextShort();
            
            if(i == 2 || i == 4)
            {
                curso = "DAM1A";
            }else
            {
                curso = "DAW1A";
            } 
            
            alum[i] = new alumne(nom, edad, curso);
        }
        
        
        System.out.println("-------------------------------------");
        
        for(i=0; i<alum.length; i++)
        {
            System.out.println(alum[i].getNom() + ", " + alum[i].getEdad() + ": " + alum[i].getCurs() + "\n");
        }
        
    }
    
}
