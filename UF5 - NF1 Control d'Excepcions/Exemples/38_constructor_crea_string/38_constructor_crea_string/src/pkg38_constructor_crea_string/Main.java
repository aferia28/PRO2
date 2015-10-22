/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg38_constructor_crea_string;

/**
 *
 * @author JMBoneu
 */

// -------------------- Class de gestió d'Excepció pròpia
class ExempleExcepcions2 extends Exception
{
        ExempleExcepcions2(){}
        ExempleExcepcions2(String s)
        {
            super(s);
        }
} 

public class Main
{
    // ............................................
    public void f() throws ExempleExcepcions2
    {
        System.err.println("Es llança una excepció des de f"); throw new ExempleExcepcions2();
    }

    // ............................................
    public void g() throws ExempleExcepcions2
    {
        System.err.println("Es llança una excepció des de g");
        throw new ExempleExcepcions2(" Generada en g()");
    }

    // ............................................
    public static void main(String[] args)
    {
        Main p = new Main();

        try
        {
            p.f();
        } 
        catch(ExempleExcepcions2 e)
        {
            e.printStackTrace();
            
        }

        try
        {
            p.g();
        } 
        catch(ExempleExcepcions2 e)
        {
            e.printStackTrace();
            // Per capturar el missatge enviat al constructor de l'excepció:
            System.err.println("Message: "+e.getMessage());
            System.err.println("toString: "+e.toString());
            /* SORTIDA PER PANTALLA:
               Message:  Generada en g()
               toString: pkg38_constructor_crea_string.ExempleExcepcions2:  Generada en g()
             */
        }
    }
}
