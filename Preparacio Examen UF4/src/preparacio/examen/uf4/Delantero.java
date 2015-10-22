/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacio.examen.uf4;

/**
 *
 * @author adrianferialopez
 */
public class Delantero extends Jugador{
    
    private byte goles;

    public Delantero(byte goles, String nombre, byte dorsal, Equipo equipo) {
        super(nombre, dorsal, equipo);
        this.goles = goles;
        //this.sueldo = 1000000;
        calcularSueldo();
        //this.nivel = this.nivel;
    }

    public byte getGoles() {
        return goles;
    }

    public void setGoles(byte goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Delantero{" + "goles=" + goles + '}';
    }
    
    public void calcularSueldo(){
        
        if(this.goles > 30)
        {
            this.sueldo *= 2;
        }
    }
    
}
