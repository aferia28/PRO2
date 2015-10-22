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
public class Autobus extends MitjaTransport {

    protected final double preuZona = 1.2;
    protected int zones;
    
    public Autobus(float distancia, int zones) {
        super(20, distancia);
        this.zones = zones;
    }

    @Override
    public float calcularPreu() {
        float preu = (float) (preuZona*zones);
        return preu;
    }
    
}
