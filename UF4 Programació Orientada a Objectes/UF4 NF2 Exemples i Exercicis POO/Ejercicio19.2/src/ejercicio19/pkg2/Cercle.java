/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19.pkg2;

/**
 *
 * @author adrianferialopez
 */
public class Cercle {
    
    private Punt centre; //¿?¿?¿¿¿
    private int radi;
    
    public Cercle(){
        this.centre.setPosicioX(0);
        this.centre.setPosicioY(0);
        this.radi = 0;
    }
    
    public Cercle(int x, int y, int radi){
        this.centre.setPosicioX(x);
        this.centre.setPosicioY(y);
        this.radi = radi;
    }
    
    public Cercle(Punt p, int radi){ //¿?¿?¿¿?¿
        this.centre = p; // ¿?¿?¿¿?
        this.radi = radi;
    }

    public Punt getCentre() {
        return centre;
    }

    public void setCentre(Punt centre) {
        this.centre = centre;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    
    public double distanciaCentres(Cercle altreCercle){
        
        
        double d1 = Math.pow(altreCercle.centre.getPosicioX() - this.centre.getPosicioX(), 2);
        double d2 = Math.pow(altreCercle.centre.getPosicioY() - this.centre.getPosicioY(), 2);
        double distancia = Math.sqrt(d1 + d2);
        
        return distancia;
    }
    
    public boolean equals(Cercle altreCercle){
        
        if(this.getCentre() == altreCercle.getCentre() && this.getRadi() == altreCercle.getRadi()) // if(this.centre == altreCerlce.centre)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean sonConcentrics(Cercle altreCercle){
        if(this.getCentre() == altreCercle.getCentre())
            return true;
        else
            return false;
    }
    
    public boolean tenenIgualRadi(Cercle altreCercle){
        if(this.getRadi() == altreCercle.getRadi())
            return true;
        else
            return false;
    }
    
    public boolean sonTangents(Cercle altreCercle){
        /*
        if(distanciaCentres() == sumaRadis())
        {
        return true;
        }
        else
        {
        return false;
        }
        funció que retornará true si dos cercles son tangents. Es toquen en un mateix punt.
        */
    }
    
    public boolean sonSecants(Cercle altreCercle){
        /*
        funció que retornará true si els dos cercles son secants. Es toquen en 2 punts.
        */
    }
    
    public boolean noEsToquen(Cercle altreCercle){
        /*
        funció que retornará true si els dos cercles no es toquen en cap lloc.
        */
    }
    
    @Override
    public Cercle clone(){
        return new Cercle(centre, radi);
    }

    @Override
    public String toString() {
        return "Cercle{" + "centre=" + centre + ", radi=" + radi + '}';
    }


}

        
