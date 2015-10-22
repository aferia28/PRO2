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
public class Hotel extends Edifici {

    private int nhab;
    
    public Hotel(String nom, int nplantes, double sup, int nhab) {
        super(nom, nplantes, sup);
        this.nhab = nhab;
    }

    @Override
    public void calcularCostVigilancia() {
        int nvigilants = (int) (getSup() / 1000);
        double precio = (nvigilants * 1300) + (500*nvigilants);
        
        System.out.println("Para limpiar el Hotel harán falta " + nvigilants + "vigilantes");
        System.out.println("Y tendrá un precio de " + precio + "euros");
    }
    
    public void calcularCostNateja(){
        int npersones = nhab/20;
        
        double cost = npersones * 1000;
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Para limpiar el Hotel, nos hacen falta " + npersones + "miembros");
        System.out.println("El total necesario para el sueldo de estos miembros son " + cost + "euros");
        System.out.println("------------------------------------------------------------");
    }
   
}
