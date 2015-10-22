/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg41_excepcio_amb_reanudacio;
import java.math.*;
/**
 *
 * @author jmboneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) /*throws Exception*/ {
        // TODO code application logic 
        boolean indexNoValid=true;
        int i; // prendrà numeros entre 0 i 9
        String text[]={"Un","Dos","Tres","Quatre"};
        
        while (indexNoValid)   // no sortirà del while fins que no es generi un valor vàlid (0-3)
        {
            try
            {
                i=(int)Math.round(Math.random()*9);
                System.out.println(text[i]);
                indexNoValid=false;
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Excepció: fora de rang en l'array");
                 //throw new Exception(); //--> generaria una excepció tractable en un nivell superior
                                          // descomentar el throws Exception del main() 
            }
            catch (Exception e)
            {
                System.out.println("Excepció generica: "+e.toString());
            }
        }
    }
}
