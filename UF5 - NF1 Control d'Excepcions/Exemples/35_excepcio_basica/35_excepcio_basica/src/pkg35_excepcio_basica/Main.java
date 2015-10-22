/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg35_excepcio_basica;
import java.util.Scanner;

/** EXCEPCIONS BÀSIQUES: fer saltar una excepció amb throw new nomExcepció
 *
 * @author JMBoneu
 */


public class Main {

    public static int quadrat(int num)
    {
        int resultat;
        if(num > 46340) //Si num que introducimos es mayor a 46340 saltara el throw new.
        {
            System.out.println("ERROR DE TIPO -->>"); //
            throw new ArithmeticException();
        }
        resultat = num * num;
        return resultat;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int q;
        Scanner dades = new Scanner(System.in);
        
        System.out.println("Introdueix un numero");
        q = dades.nextInt();
        
        int resultat=0;

        System.out.println("Modifica en el codi el valor de la variable q="+q+" per fer proves\n");
        System.out.println("Si q es > 46340 saltarà l'excepció\n");
        
        resultat=quadrat(q);
        
        
        // si es produeix una excepcio aquest codi no s'executa
        System.out.println("El quadrat del numero introduit esta dins del rang de tipus INT.\n");
        System.out.println("Si vols veure com salta l'error, el numero haurá de ser > 46340\n.\n");
        System.out.println("Modifica en el codi el valor de la variable q="+q+" per fer proves\n");
        
        System.out.println("El quadrat de "+q+" es "+resultat);
        
        System.out.println("El programa ha finalitzat");
    }
}
