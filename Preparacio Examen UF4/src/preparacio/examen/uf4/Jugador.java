/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacio.examen.uf4;

import java.util.Objects;

/**
 *
 * @author adrianferialopez
 */
public abstract class Jugador {
    
    private String nombre;
    private byte dorsal;
    private Equipo equipo;
    protected static String nivel = "Profesional";
    protected float sueldo = 1000000;

    public Jugador(String nombre, byte dorsal, Equipo equipo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.equipo = equipo;
        //this.sueldo = this.sueldo;
        //this.nivel = this.nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public static String getNivel() {
        return nivel;
    }

    public static void setNivel(String nivel) {
        Jugador.nivel = nivel;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", dorsal=" + dorsal + ", equipo=" + equipo + ", sueldo=" + sueldo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Jugador other = (Jugador) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (this.dorsal != other.dorsal) {
            return false;
        }
        return true;
    }
    
     //metodo abstracto, cada tipo de jugador (portero/defensa/delantero) tendrá su propio metodo para calcular
    // el sueldo.
    
    public abstract void calcularSueldo();
    
}
