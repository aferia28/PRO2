/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profesores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author joan
 */
public class Profesor {
    private String nombre;
    private String apellido;
    private String asignatura;
    private String cargo;
    private String tutor;
    
    public Profesor(){
        
    }
    
    public Profesor(String nombre, 
                    String apellido, 
                    String asignatura, 
                    String cargo,
                    String tutor){
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura = asignatura;
        this.cargo = cargo;
        this.tutor = tutor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String getCargo() {
        return cargo;
    }
    
    public String getTutor() {
        return tutor;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }
    
    @Override
    public String toString() {
        return "Profesor: " + nombre + ","+ apellido  + "; asignatura=" + 
                asignatura +" ; cargo: "+ cargo + " Tutor: " + tutor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (this.nombre != null ? this.nombre.hashCode() : 0);
        hash = 31 * hash + (this.apellido != null ? this.apellido.hashCode() : 0);
        hash = 31 * hash + (this.asignatura != null ? this.asignatura.hashCode() : 0);
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
        final Profesor other = (Profesor) obj;
        if ((this.nombre == null) ? (other.nombre != null) : !this.nombre.equals(other.nombre)) {
            return false;
        }
        if ((this.apellido == null) ? (other.apellido != null) : !this.apellido.equals(other.apellido)) {
            return false;
        }
        return true;
    }
    
        
}
