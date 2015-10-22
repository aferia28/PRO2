/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profesores;

import java.util.ArrayList;

/**
 *
 * @author joan
 */
public class Departamento {
    private String Nombre;
    private String Despacho;
    ArrayList<Profesor> profesors;

    public Departamento() {
    }

    
    public Departamento(String Nombre, String Despacho, ArrayList<Profesor> profesors) {
        this.Nombre = Nombre;
        this.Despacho = Despacho;
        this.profesors = profesors;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getDespacho() {
        return Despacho;
    }

    public ArrayList<Profesor> getProfesors() {
        return profesors;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setDespacho(String Despacho) {
        this.Despacho = Despacho;
    }

    public void setProfesors(ArrayList<Profesor> profesors) {
        this.profesors = profesors;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.Nombre != null ? this.Nombre.hashCode() : 0);
        hash = 17 * hash + (this.Despacho != null ? this.Despacho.hashCode() : 0);
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
        final Departamento other = (Departamento) obj;
        if ((this.Nombre == null) ? (other.Nombre != null) : !this.Nombre.equals(other.Nombre)) {
            return false;
        }
        if ((this.Despacho == null) ? (other.Despacho != null) : !this.Despacho.equals(other.Despacho)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Departamento: " + "Nombre=" + Nombre + ", Despacho=" + Despacho + ", profesors=" + profesors;
    }
    
}
