/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacio.examen.uf4;

import java.util.ArrayList;

/**
 *
 * @author adrianferialopez
 */
public class Equipo {
    
    private String nombre;
    private String nombreEstadio;
    private int capacidadEstadio;
    private ArrayList<Jugador> jugadores;
    private final String liga = "BBVA";

    public Equipo(String nombre, String nombreEstadio, int capacidadEstadio, ArrayList<Jugador> jugadores) {
        this.nombre = nombre;
        this.nombreEstadio = nombreEstadio;
        this.capacidadEstadio = capacidadEstadio;
        this.jugadores = jugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

    public int getCapacidadEstadio() {
        return capacidadEstadio;
    }

    public void setCapacidadEstadio(int capacidadEstadio) {
        this.capacidadEstadio = capacidadEstadio;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
}
