/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg37_excepcions_personalitzades;

/**
 *
 * @author JMBoneu
 */

   class ExempleExcepcions2 extends Exception 
   { 
   }
public class Main 
{

    public void f() throws ExempleExcepcions2
    {
        System.out.println("3- A l'entrar en p.f()");
        System.out.println("4- Es llança una excepció pròpia");
        throw new ExempleExcepcions2();
        //System.out.println("5- Abans de sortir de p.f()"); // no s'executa mai aquesta línia
    }
    
    public static void main(String[] args)
    {
        Main p = new Main();
        try
        {
            System.out.println("1- Abans de cridar p.f()");
            
            p.f();
            System.out.println("4- Després de cridar p.f()");
        }
        catch(ExempleExcepcions2 e)
        {
            System.err.println("2- Excepció capturada!!!");
        }
        System.out.println("6- Després de tot");
    }
}

