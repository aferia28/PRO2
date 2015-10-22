/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaordinador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author adrianferialopez
 */
public class GestionFichero {
    
    //creamos el metodo escribirFichero donde le pasaremos por parametro el nombre del fichero(como se guardara), un booleano para saber si escribiremos o no, y el objeto que queremos escribir en el fichero.
    public void escribirFichero(String nombreFichero, boolean anyadir, Ordinador ord)
    {
        File f = new File(nombreFichero);
        
        //si el fichero ya existe, o anyadir(que lo pasamos como paremtro cuando llamamos a la funcion) es falso -> eliminamos el fichero.
        if(f.exists() && !anyadir)
        {
            f.delete();
        }
        
        //escribir con buffered linea a linea.
        FileWriter flujoSalida = null;
        BufferedWriter salida = null;
        
        try{
            
            flujoSalida = new FileWriter(f, anyadir);//
            salida = new BufferedWriter(flujoSalida);
            
            float proc = ord.getProc();
            salida.write(Float.toString(proc));
            salida.newLine();
            
            float memoria = ord.getMemoria();
            salida.write(Float.toString(memoria));
            salida.newLine();
            
            float hdd = ord.getHdd();
            salida.write(Float.toString(hdd));
            salida.newLine();
            
            String placa = ord.getPlaca();
            salida.write(placa);
            salida.newLine();
            
            
        }catch(IOException ex)
        {
            System.err.println("Error de escritura");
        }finally{
            try{
                
                salida.close();
                flujoSalida.close();
                
            }catch(IOException ex){
                System.out.println("Problemas cerrando el fichero en la escritura");
            }
        }
    }
    
    public void leerFichero(String nombreFichero) //pasamos por parametro el fichero que vamos a leer.
    {
        Ordinador ord;
        float proc, memoria, hdd;
        
        String placa, procStr, memoriaStr, hddStr;
        
        ArrayList<Ordinador> arrayOrd = new ArrayList<Ordinador>();
        
        BufferedReader entrada = null;
        try{
            entrada = new BufferedReader(new FileReader(nombreFichero));
            while((procStr = entrada.readLine()) != null)
            {
                proc = Float.parseFloat(procStr);
                
                memoriaStr = entrada.readLine();
                memoria = Float.parseFloat(memoriaStr);
                
                hddStr = entrada.readLine();
                hdd = Float.parseFloat(hddStr);
                
                placa = entrada.readLine();
                
                ord = new Ordinador(proc, memoria, hdd, placa, true);
                arrayOrd.add(ord);
            }
            
            System.out.println("Imprimiendo ArrayList de Ordenadores");
            ListIterator it = arrayOrd.listIterator();
            
            while(it.hasNext())
            {
                System.out.println(it.next().toString());
            }
            
        }catch(FileNotFoundException e)
        {
            System.out.println("No existe el fichero.!");
        }
        catch(IOException e)
        {
            System.out.println("ERROR de lectura.");
        } finally{
            try{
                if(entrada != null)
                entrada.close();
            }catch(IOException e){
                System.out.println("ERROR a la hora de cerrar el fichero");
            }
        }
        
    }
    
}
