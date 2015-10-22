/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import java.util.Objects;

/**
 *
 * @author adrianferialopez
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String equipo;//asignatura
    private String cargo; //Team Manager o Director Tecnico
    
    public Persona(){}

    public Persona(String nombre, String apellido, String equipo, String cargo, String jefe) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.equipo = equipo;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "| Apellido:" + apellido + "| Cargo:" + cargo + "| Equipo=" + equipo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nombre);
        hash = 13 * hash + Objects.hashCode(this.apellido);
        hash = 13 * hash + Objects.hashCode(this.cargo);
        hash = 13 * hash + Objects.hashCode(this.equipo);
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
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
    
    
}
