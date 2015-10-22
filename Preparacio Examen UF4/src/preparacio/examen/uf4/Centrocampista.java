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
public class Centrocampista extends Jugador{
    
    private byte asistencias;

    public Centrocampista(byte asistencias, String nombre, byte dorsal, Equipo equipo) {
        super(nombre, dorsal, equipo);
        this.asistencias = asistencias;
        //this.sueldo = 1000000;
        calcularSueldo();
        //this.nivel = this.nivel;
    }

    public byte getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(byte asistencias) {
        this.asistencias = asistencias;
    }
    
    public void calcularSueldo(){
        
        if(this.asistencias > 20)
        {
            this.sueldo += 750000; 
        }
    }
}
