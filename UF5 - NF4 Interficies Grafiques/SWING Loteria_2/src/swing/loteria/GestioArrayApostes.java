/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.loteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class GestioArrayApostes {

    private static ArrayList<Aposta> arrayApostes;

    public GestioArrayApostes(ArrayList arrayApostes) {
        
        this.arrayApostes = arrayApostes;
    }

    public static ArrayList<Aposta> getArrayApostes() {
        return arrayApostes;
    }
    
    public void afegirAposta(Aposta aposta) throws ExepcioApostaExistent{
        if(estaEnArray(aposta)){ //crear metodo estaEnArray()
            throw new ExepcioApostaExistent(); //crear Excepcion
        }else{
            arrayApostes.add(aposta);
        }
    }
    
    public void eliminarAposta(String nomApostant) throws ExepcioArrayBuit, ExepcioApostaInexistent{
        
        if(arrayApostes.isEmpty())
        {
            throw new ExepcioArrayBuit();
        }
        double qapostada = recuperarAposta(nomApostant);
        System.out.println("La cuantitat apostada de l'apostant " + nomApostant + " es de " + qapostada);
        ListIterator<Aposta> it = arrayApostes.listIterator();
        Aposta a;
        while(it.hasNext())
        {
            a = it.next();
            if(a.getNom().equals(nomApostant))
            {
                it.remove();
            }
        }
        
    }
    
    public double recuperarAposta(String nomApostant) throws ExepcioArrayBuit, ExepcioApostaInexistent{
        
        if(arrayApostes.isEmpty())
        {
            throw new ExepcioArrayBuit(); // crear Excepcion
        }
        else{
            ListIterator<Aposta> it = arrayApostes.listIterator();
            Aposta a;
            while(it.hasNext())
            {
                a = it.next(); //igualamos "a" a la apuesta q esta en it.next
                if(a.getNom().equals(nomApostant)) //con el metodo equals comprobamos si el nombre de la apuesta es igual al nombre q pasamos por parametro.
                {
                    return a.getAposta();// recuperamos la apuesta
                }
            }
            throw new ExepcioApostaInexistent();
        }
    }
    
    public boolean estaEnArray(Aposta aposta)
    {
        Iterator<Aposta> iter = arrayApostes.iterator();
        Aposta a;
        while(iter.hasNext())
        {
            a = iter.next();
            if(a.equals(aposta.getNom()))
                return true;
        }
        return false;
    }
    
    
}

