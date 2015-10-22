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
public class Metro extends MitjaTransport {

    protected final double preuBillet = 1.5;
    protected int parades;
        
    public Metro(float distancia, int zones) {
        super(25, distancia);
        this.parades = parades;
    }

    @Override
    public float calcularPreu() {
       return (float) preuBillet;
    }
    
    
}
