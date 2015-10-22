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
public class Taxi extends MitjaTransport {

        private final double baixadaBandera = 2.2;
        private final double preuEquipatge = 1.2;
        private final double preuKm = 1.2;
        private int maletas;

    public Taxi(float distancia, int maletas) {
        super(30, distancia);
        this.maletas = maletas;
    }

    @Override
    public float calcularPreu() {
        float preu = (float) (baixadaBandera + (maletas*preuEquipatge) + (getDistancia()*preuKm));
        return preu;
    }
}
