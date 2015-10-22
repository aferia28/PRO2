/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.loteria;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class GestioArxiu {
    
    public static void escribirArxiu(String nomFichero, ArrayList apostes)
    {
        File f = new File(nomFichero);
        
        FileWriter flujoSalida = null;
        BufferedWriter salida = null;
        
        try{
            flujoSalida = new FileWriter(f);
            salida = new BufferedWriter(flujoSalida);
            
            ListIterator it = apostes.listIterator();
            while(it.hasNext())
            {
                String apo = it.next().toString();
                salida.write(apo);
                salida.newLine();
            }
            
            
        }catch(IOException e)
        {
            System.out.println("ERROR AL ESCRIBIR EL ARCHIVO.");
            e.printStackTrace();
        }finally{
            try{
                salida.close();
                flujoSalida.close();
            }catch(IOException e)
            {
                System.out.println("Problema cerrando el archivo.");
            }
        }
        
    }
    
    public static ArrayList leerFichero(String nomFichero)
    {
        Aposta a;
        String apo;
        
        ArrayList<Aposta> apostes = new ArrayList<>();
        
        BufferedReader entrada = null;
        
        try{
            entrada = new BufferedReader(new FileReader(nomFichero));
            
            while((apo = entrada.readLine()) != null)
            {
            
                String[] apoSplit = apo.split("-");
                String nom = apoSplit[0];
                double qaposta;
                qaposta = Double.parseDouble(apoSplit[1]);

                a = new Aposta(nom, qaposta);
                apostes.add(a);
            }
            //imprimir arraylist
            //devolder arraylist return
            
        }catch(FileNotFoundException e){
            System.out.println("ERROR:No existe el fichero.");
        } catch(IOException e)
        {
            System.out.println("ERROR AL LEER EL FICHERO.");
        } finally{
            try{
                if(entrada != null){
                    entrada.close();
                }
            }catch(IOException e){
                System.out.println("Problemas cerrando el fichero.");
            }
        }
        return apostes;
    }
}
