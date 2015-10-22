/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17.pkg1;

/**
 *
 * @author adrianferialopez
 */
public class miembro {
    
    String nombre;
    static String direccion;
    short edad;

    public miembro(String nombre, String direccion, short edad) {
        this.nombre = nombre;
        miembro.direccion = direccion;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
    
    
}
