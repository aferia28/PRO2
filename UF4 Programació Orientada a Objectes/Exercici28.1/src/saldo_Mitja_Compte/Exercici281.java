/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saldo_Mitja_Compte;

import saldo_Major_Compte.Compte;
import saldo_Major_Compte.Teclat;

/**
 *
 * @author adrianferialopez
 */
public class Exercici281 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Teclat teclado = new Teclat();
        Compte cuenta[] = new Compte[3];
        
        for(int i = 0; i < 3; i++)
        {
            cuenta[i] = new Compte();
            cuenta[i].setNom(teclado.leerString("Titular de la cuenta: "));
            cuenta[i].setNcuenta(Teclat.leerString("Numero de CCC: "));
            cuenta[i].setSaldo(Teclat.leerFloat("Saldo de la cuenta: "));
            System.out.println("------------------");
        }
        
        float saldomedio = 0;
        for(int i = 0; i<cuenta.length;i++)
        {
            saldomedio += cuenta[i].getSaldo();
        }
        float saldomediototal = saldomedio / 3;
        System.out.println("\n");
        System.out.println("Cuentas con saldo mayor al de la media\n------------------------");
        
        for(int i = 0; i<cuenta.length; i++)
        {
            if(cuenta[i].getSaldo() > saldomediototal)
            {
                System.out.println("Titular: " + cuenta[i].getNom() + "\n" + "Saldo: " + cuenta[i].getSaldo() + "\n" 
                + "Num. Cuenta: " + cuenta[i].getNcuenta());
            }
        }
        
        
    }
    
}
