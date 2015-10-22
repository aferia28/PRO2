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
public class Defensa extends Jugador{
    
    private byte faltas;

    public Defensa(byte faltas, String nombre, byte dorsal, Equipo equipo) {
        super(nombre, dorsal, equipo);
        this.faltas = faltas;
        //this.sueldo = 1000000;
        calcularSueldo();
        //this.nivel = this.nivel;
    }

    public byte getFaltas() {
        return faltas;
    }

    public void setFaltas(byte faltas) {
        this.faltas = faltas;
    }
    
    public void calcularSueldo(){
        
        if(this.faltas < 25)
        {
            this.sueldo += 550000;
        }
    }
    
}
