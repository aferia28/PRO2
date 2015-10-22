/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio17.pkg2;

/**
 *
 * @author adrianferialopez
 */
public class miembro {
    
    String nombre;
    short edad;

    public miembro(String nombre, String direccion, short edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public miembro(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }
    
    
}