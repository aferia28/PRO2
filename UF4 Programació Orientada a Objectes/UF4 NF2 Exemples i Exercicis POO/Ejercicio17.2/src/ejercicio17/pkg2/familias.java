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
public class familias {
    
    miembro miembro_familia[] = new miembro[4];
    String direccion;

    public familias(){
        
    }
    public familias(String direccion) {
        this.direccion = direccion;
    }
    
    

    public miembro[] getMiembro_familia() {
        return miembro_familia;
    }

    public void setMiembro_familia(miembro[] miembro_familia) {
        this.miembro_familia = miembro_familia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
        
}
