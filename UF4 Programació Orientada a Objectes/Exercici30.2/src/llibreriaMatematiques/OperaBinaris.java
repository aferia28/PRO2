/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package llibreriaMatematiques;

/**
 *
 * @author adrianferialopez
 */
public class OperaBinaris {
    
    public int suma(int num1, int num2){
        int total;
        
        total = num1 + num2;
        
        return total;
    }
    
    public int producte(int num1, int num2){
        int total;
        
        total = num1*num2;
        
        return total;
    }
    
    public float quocient(int num1, int num2){
        int s = 0;
        int totalcociente = 0;
        
        while(s+num1<=num2) 
        { 
        s=s+num1; 
        totalcociente++; 
        }
        
        return totalcociente;
    }
    
    public float resto(int num1, int num2){
        int s = 0;
        int totalcociente = 0;
        int totalresiduo = 0;
        
        while(s+num1<=num2) 
        { 
        s=s+num1; 
        totalcociente++; 
        }        
        
        totalresiduo = num2 - totalcociente * num1; 
        
        return totalresiduo;

    }
    
     
}
