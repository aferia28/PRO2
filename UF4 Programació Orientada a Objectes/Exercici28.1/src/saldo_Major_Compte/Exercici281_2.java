/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldo_Major_Compte;
import saldo_Major_Compte.Compte;

/**
 *
 * @author adrianferialopez
 */
public class Exercici281_2 {
    
        public static void main(String[] args) {
        
        Compte cuenta[] = new Compte[2];
        Teclat teclado = new Teclat();
       
        for(int i = 0; i < 2; i++)
        {
            cuenta[i] = new Compte();
            System.out.println("------------ TITULAR -------------");
           
            cuenta[i].setNom(Teclat.leerString("Introduce el nombre del titular de la cuenta: "));
            cuenta[i].setNcuenta(Teclat.leerString("Numero de CCC: "));
            cuenta[i].setSaldo(Teclat.leerFloat("Saldo de la cuenta: "));

            System.out.println("\n\n");
        }
        
        if(cuenta[0].getSaldo() > cuenta[1].getSaldo())
        {
            System.out.println("Cuenta con mayor saldo: \n");
            System.out.println("Titular: " + cuenta[0].getNom()+ "\n" + "Numero de cuenta: " + cuenta[0].getNcuenta()
                    + "\n" + "Saldo: " + cuenta[0].getSaldo());
        }else
            if(cuenta[1].getSaldo() > cuenta[0].getSaldo())
            {
                System.out.println("Cuenta con mayor saldo: \n");
                System.out.println("Titular: " + cuenta[1].getNom()+ "\n" + "Numero de cuenta: " + cuenta[1].getNcuenta()
                    + "\n" + "Saldo: " + cuenta[1].getSaldo());    
            }else{
                System.out.println("Las dos cuentas tienen el mismo saldo\n");
                for(int i = 0; i <= 1; i++)
                {
                    System.out.println("\n");
                    System.out.println("---------------------");
                    System.out.println("Titular: " + cuenta[i].getNom()+ "\n" + "Numero de cuenta: " + cuenta[i].getNcuenta()
                    + "\n" + "Saldo: " + cuenta[i].getSaldo());
                }
            }
        
    }
        
    
}
