/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llibreriaMatematiques;
import paquetLectura.Teclat;
/**
 *
 * @author adrianferialopez
 */
public class Divisors {
    
    public void divisors(int numrebut){
        
        for(int i = 1; i<numrebut; i++)
        {
            if((numrebut%i) == 0)
            {
                System.out.println("Divisor de " + numrebut + ": " + i);
            }
        }
        
    }
    
    public void esPrimer(int numrebut){
        
        int a = 0;
        
        for(int i = 1; i<numrebut; i++)
        {
            if((numrebut%i) == 0)
            {
                a++;
            }
        }
        
        if(a==2)
        {
            System.out.println("El numero " + numrebut + " es primo");
        }else{
            System.out.println("El numero " + numrebut + " no es primo");
        }
    }
    
}
