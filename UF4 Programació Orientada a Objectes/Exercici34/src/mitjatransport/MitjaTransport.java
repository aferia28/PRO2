/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitjatransport;

/**
 *
 * @author adrianferialopez
 */
public abstract class MitjaTransport {
    
    float velmitja;
    private float distancia;

    public MitjaTransport(float velmitja, float distancia) {
        this.velmitja = velmitja;
        this.distancia = distancia;
    }

    public float getVelmitja() {
        return velmitja;
    }

    public float getDistancia() {
        return distancia;
    }
    
    public abstract float calcularPreu();
    
    public float calcularTemps(){
        
        float temps = (distancia / velmitja) * 60;
        
        return temps;               
    }
    
}
