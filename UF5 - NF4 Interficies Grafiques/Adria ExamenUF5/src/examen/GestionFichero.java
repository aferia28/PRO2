/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author adrianferialopez
 */
public class GestionFichero {
    
    public static void escribirArchivo(String nombreFichero, HashSet partidos)
    {
        File f = new File(nombreFichero);
        
        FileWriter flujoSalida = null;
        BufferedWriter salida = null;
        
        try{
            flujoSalida = new FileWriter(f);
            salida = new BufferedWriter(flujoSalida);
            
//            String equipLocal = p.getEquipoLocal();
//            salida.write(equipLocal+"::");
//            String equipVisit = p.getEquipoVisitante();
//            salida.write(equipVisit+"::");
//            
//            int golLocal = p.getGolLocal();
//            salida.write(Integer.toString(golLocal)+"::");
//            int golVisit = p.getGolVisitante();
//            salida.write(Integer.toString(golVisit)+"");
//            salida.newLine();
            
                Iterator it = partidos.iterator();
                while(it.hasNext())
                {
                    String partido = it.next().toString();
                    salida.write(partido);
                    salida.newLine();
            
                }
            
            
        }catch(IOException e)
        {   
            System.out.println("Problema escribiendo el archivo..");
        }finally{
            try{
                salida.close();
                flujoSalida.close();
            }catch(IOException e){
                System.out.println("Error cerrando el archivo..");
            }
        }
        
        
    }
    
    public static HashSet leerFichero(String nombreFichero)
    {
        Partido p;
        String strPartido;
        HashSet<Partido> partidos = new HashSet<>();
        
        BufferedReader entrada = null;
        
        try{
            entrada = new BufferedReader(new FileReader(nombreFichero));
            
            while((strPartido = entrada.readLine()) != null)
            {
                String[] parSplit = strPartido.split("::");
                String equipoLocal = parSplit[0];
                int golesLocal;
                golesLocal = Integer.parseInt(parSplit[2]);
                String equipoVisitante = parSplit[1];
                int golesVisitante;
                golesVisitante = Integer.parseInt(parSplit[3]);
                
                p = new Partido(equipoLocal, equipoVisitante, golesLocal, golesVisitante);
                partidos.add(p);
                
//                Iterator it = partidos.iterator();
//                while(it.hasNext())
//                {
//                    System.out.println(it.next());
//                }
            }
            
        }catch(FileNotFoundException e)
        {
            System.out.println("Error: No existe el fichero. ");
            e.printStackTrace();
        }catch(IOException e)
        {
            System.out.println("ERROR al leer el fichero");
        }finally{
            try{
                if(entrada != null)
                {
                    entrada.close();
                }
            }catch(IOException e){
                System.out.println("ERROr al cerrar el fichero.");
            }
        }
        return partidos;
    }
}
