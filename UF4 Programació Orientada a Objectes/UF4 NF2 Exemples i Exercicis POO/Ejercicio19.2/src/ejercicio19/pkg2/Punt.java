/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19.pkg2;

/**
 *
 * @author adrianferialopez
 */
public class Punt {
    
    int posicioX;
    int posicioY;

    public Punt(int x, int y) {
        this.posicioX = x;
        this.posicioY = y;
    }
    
    public Punt(){
        this.posicioX = 0;
        this.posicioY = 0;
        setPosicioX(0);
    }

    public int getPosicioX() {
        return posicioX;
    }

    public void setPosicioX(int posicioX) {
        this.posicioX = posicioX;
    }

    public int getPosicioY() {
        return posicioY;
    }

    public void setPosicioY(int posicioY) {
        this.posicioY = posicioY;
    }
    
    @Override
    public Punt clone()
    {
        return new Punt(posicioX,posicioY);
    }

    @Override
    public String toString() {
        return "Punt{" + "posicioX= " + posicioX + ", posicioY= " + posicioY + '}';
    }
    
}
