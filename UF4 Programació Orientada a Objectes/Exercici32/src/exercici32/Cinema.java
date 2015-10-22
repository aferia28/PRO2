/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici32;

/**
 *
 * @author adrianferialopez
 */
public class Cinema extends Edifici{

    
    public Cinema(String nom, int nplantes, double sup) {
        super(nom, nplantes, sup);
    }

    @Override
    public void calcularCostVigilancia() {
        int nvigilants = (int) Math.ceil(getSup() / 3000);
        double precio = nvigilants*1300;
        
        System.out.println("Para limpiar el Hotel harán falta " + nvigilants + "vigilantes");
        System.out.println("Y tendrá un precio de " + precio + "euros");
    }
    
    public void projectarSessio(int nassistens, double preuentrada){
        
        System.out.println("S'han recaptat " + nassistens*preuentrada + " euros.");
        
    }
    
}
