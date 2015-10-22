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
public class Portero extends Jugador {
    
    private byte golesEncajados;

    public Portero(byte golesEncajados, String nombre, byte dorsal, Equipo equipo) {
        super(nombre, dorsal, equipo);
        this.golesEncajados = golesEncajados;
        //this.sueldo = 1000000;
        calcularSueldo();
        //this.nivel = this.nivel;
    }

    public byte getGolesEncajados() {
        return golesEncajados;
    }

    public void setGolesEncajados(byte golesEncajados) {
        this.golesEncajados = golesEncajados;
    }
    
    public void calcularSueldo(){
        
        if(golesEncajados < 20)
        {
            this.sueldo += 500000;
        }
    }
    
}
