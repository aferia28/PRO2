/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;

import com.sun.javafx.css.StringStore;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author adrianferialopez
 */
public class GestioArxiu {
    
        public static final String NOM_ARXIU = "equipos.csv";
        
        public static ArrayList<Equipo> leerEquipos(){
            
            ArrayList<Equipo> equipos = new ArrayList<Equipo>();
            
            try{
                FileReader reader = new FileReader(NOM_ARXIU);
                BufferedReader entrada = new BufferedReader(reader);
                
                String linea;
                
                while((linea = entrada.readLine()) != null)
                {
                    Equipo eq = new Equipo();
                    StringTokenizer str = new StringTokenizer(linea, ";");
                    
                    eq.setNombre(str.nextToken());
                    eq.setCiudad(str.nextToken());
                    equipos.add(eq);
                }
                
                entrada.close();
                reader.close();
            }catch(IOException e)
            {
                System.out.println("No s'ha pogut llegir l'arxiu: " + NOM_ARXIU);
                e.printStackTrace();                
            }
            
            return equipos;
        }
        
        public static void leerPersona(ArrayList<Equipo> equipos)
        {
            try{
                for(Equipo equipoActual : equipos)
                {
                    GestioArxiu.leerPersona(equipoActual);
                }
            }catch(Exception e){
                System.out.println("No s'ha pogut llegir l'arxiu");
            }
        }
        
        public static void leerPersona(Equipo equipo)
        {
            ArrayList<Persona> personas = new ArrayList<>();
            String filename = equipo.getNombre().replace(" ", "_").concat(".csv");
            
            try{
                FileReader reader = new FileReader(filename); //abrimos el archivo csv que le pasamos por parametro (sera el nombre de equipo.)
                BufferedReader entrada = new BufferedReader(reader);
                
                String linea;
                
                while((linea = entrada.readLine()) != null)
                {
                    Persona p = new Persona();
                    StringTokenizer str = new StringTokenizer(linea, ";");
                    
                    p.setNombre(str.nextToken());
                    p.setApellido(str.nextToken());
                    p.setEquipo(str.nextToken());
                    p.setCargo(str.nextToken());
                    
                    personas.add(p);
                    
                }
                
                    entrada.close();
                    reader.close();
                    
                    equipo.setPersonal(personas);                
            }catch(Exception e)
            {
                System.out.println("No s'ha pogut llegir l'arxiu " + filename);
            }
        }
        
        
    
}
