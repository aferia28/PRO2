/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg36_excepcio_per_divisio_per_zero;
import java.util.*; // Necessitem aquest paquet per les funcions de randomització

/** EXEMPLE EXCEPCIÓ PER DIVISIÓ PER ZERO
 *
 * @author JMBoneu
 */


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dades = new Scanner(System.in);
        //Random r = new Random();
        //int a = r.nextInt(3);
        int b = 7;
        int c;
        
        System.out.println("Introdueix un numero. Aquest numero es dividira per 7.");
        int a = dades.nextInt();
        // També podem fer saltar l'excepció comprovant nosaltres si el divisor
        // és zero.
         
       /* if(a == 0)
        {
          throw new ArithmeticException("Divisió per zero!!!");
        }*/
        // descomentar aquestes línies per veure-ho 
        
        try // ponemos el try cuando pensamos que algún metodo puede lanzar un error.
        {
            c = b / a;
            System.out.println("c = " + c);
        } 
        catch (Exception e)  // Si "a" toma valor 0, no se podrá realizar la división y saltará esta excepción.
        {
            System.out.println("Divisió per zero: " + e.toString());
        }
    }
}
