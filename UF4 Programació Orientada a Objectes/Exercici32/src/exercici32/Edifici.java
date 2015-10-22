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
public abstract class Edifici { 
    
    protected final String nom;
    protected final int nplantes; // els atributs de la clase abstracta, han de ser protected.
    protected final double sup;

    public Edifici(String nom, int nplantes, double sup) {
        this.nom = nom;
        this.nplantes = nplantes;
        this.sup = sup;
    }

    public String getNom() {
        return nom;
    }

    public int getNplantes() {
        return nplantes;
    }

    public double getSup() {
        return sup;
    }
    
    public void limpiar(){
        
        double tiempo = sup / 5 + (0.5*(nplantes-1));
        double precio = tiempo * 30;
        
        System.out.println("------------------------------------------------------------");
        System.out.println("El tiempo que se tarda en limpiar el edificio es: " + tiempo);
        System.out.println("El precio de limpiar el edificio es: " + precio);
        System.out.println("------------------------------------------------------------");        
        
    }
    
    public abstract void calcularCostVigilancia(); //lo implementamos aqui, pero en cada classe derivada de Edifici se definirá el metodo.
    
}
