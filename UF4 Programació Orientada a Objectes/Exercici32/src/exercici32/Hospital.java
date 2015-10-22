/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici32;

/**
 *private int nmalalts;
 * @author adrianferialopez
 */
public class Hospital extends Edifici{

    int nmalalts;
    
    public Hospital(String nom, int nplantes, double sup, int nmalalts) {
        super(nom, nplantes, sup);
        this.nmalalts = nmalalts;
    }

    @Override
    public void calcularCostVigilancia() { //Metodo implementado en la clase Edificio pero cada clase extends de Edificio lo implementa de una forma distinta.
        int nvigilants = (int) (getSup() / 1000);
        double precio = (nvigilants * 1300);
        
        System.out.println("Para limpiar el Hotel harán falta " + nvigilants + "vigilantes");
        System.out.println("Y tendrá un precio de " + precio + "euros");
    }
    
    public void repartidDinar(){
        
        System.out.println("S'estan repartint " + nmalalts + " racions.");
        System.out.println("----------------------------------------------");
    }
    
}
