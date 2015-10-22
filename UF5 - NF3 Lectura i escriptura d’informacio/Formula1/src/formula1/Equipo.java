/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import java.util.*;

/**
 *
 * @author adrianferialopez
 */
public class Equipo {
        
        private String nombre;
        private String ciudad;
        ArrayList<Persona> personal;

    public Equipo() {
    }

    public Equipo(String nombre, String ciudad, ArrayList<Persona> personal) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.personal = personal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Persona> personal) {
        this.personal = personal;
    }

    @Override
    public String toString() {
        return "Equips{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", personal=" + personal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.ciudad);
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
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) {
            return false;
        }
        return true;
    }
        
        
}
