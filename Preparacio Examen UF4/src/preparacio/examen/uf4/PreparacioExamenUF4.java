/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparacio.examen.uf4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author adrianferialopez
 */
public class PreparacioExamenUF4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcio;
        ArrayList<Jugador> jugadores = new ArrayList();
        Equipo barca = new Equipo("FCBarcelona", "Camp Nou", 100000, jugadores);
        
        
        do{
            opcio=menu();
            switch(opcio){
                case 1:
                    System.out.println("*** Añadir Portero ***\n");
                    añadirPortero(jugadores, barca);
                    break;
                case 2:
                    System.out.println("*** Añadir Defensa ***\n");
                    añadirDefensa(jugadores, barca);
                    break;
                case 3:
                    System.out.println("*** Añadir Centrocampista ***\n");
                    añadirCentrocampista(jugadores, barca);
                    break;
                case 4:
                    System.out.println("*** Añadir Delantero ***\n");
                    añadirDelantero(jugadores, barca);
                    break;
                case 5:
                    System.out.println("***Mostrar Jugadores ***\n");
                    mostrarJugadores(jugadores);
                    break;
                case 6:
                    System.out.println("*** Eliminar Jugador ***\n");
                    break;
                case 7:
                    System.out.println("*** Modificar Sueldo ***\n");
                    break;
                case 0:
                    System.out.println("SORTINT DE LA APLICACIÓ...");
                    break;
            }
            
            
        }while(opcio!=0);
        
    }
    
    public static int menu(){
        int op;
        
        System.out.println("\n1- Añadir Portero");
        System.out.println("2- Añadir Defensa");
        System.out.println("3- Añadir Centrocampista");
        System.out.println("4- Añadir Delantero");
        System.out.println("5- Mostrar Jugadores");
        System.out.println("6- Eliminar Jugadores");
        System.out.println("7- Modificar Sueldo");
        System.out.println("0- Sortir");
        
        op = Teclat.leerInt("Opcio: ");
        
        return op;
    }
    
    private static boolean comprobar(String nombre, byte dorsal, ArrayList jugadores){
        Iterator<Jugador> it=jugadores.iterator();
        
        boolean result=true;
        
        while(it.hasNext() && result==true){
            Jugador jugador = it.next();
            
            if(jugador.getNombre().equals(nombre) && jugador.getDorsal() == dorsal){
                System.out.println("ERROR! Aquest jugador ja existeix!");
                result=false;
            }
        }
        return result;
    }
    
    public static void añadirPortero(ArrayList<Jugador> jugadores, Equipo barca){
        
        String nombre = Teclat.leerString("Nombre del portero: ");
        byte dorsal = Teclat.leerByte("Dorsal del portero: ");
        byte golesEncajados = Teclat.leerByte("Goles encajados: ");
        
        boolean resul = comprobar(nombre, dorsal, jugadores);
        
        if(resul == true)
        {
            Portero p = new Portero(golesEncajados, nombre, dorsal, barca);
            jugadores.add(p);
        }
        
    }
    
    public static void añadirDefensa(ArrayList<Jugador> jugadores, Equipo barca){
        
        String nombre = Teclat.leerString("Nombre del portero: ");
        byte dorsal = Teclat.leerByte("Dorsal del portero: ");
        byte faltas = Teclat.leerByte("Faltas realizadaS: ");
        
        boolean resul = comprobar(nombre, dorsal, jugadores);
        
        if(resul == true)
        {
            Defensa d = new Defensa(faltas, nombre, dorsal, barca);
            jugadores.add(d);
        }
    }
    
    public static void añadirCentrocampista(ArrayList<Jugador> jugadores, Equipo barca){
        
        String nombre = Teclat.leerString("Nombre del portero: ");
        byte dorsal = Teclat.leerByte("Dorsal del portero: ");
        byte asistencias = Teclat.leerByte("Asistencias: ");
        
        boolean resul = comprobar(nombre, dorsal, jugadores);
        
        if(resul == true){
            Centrocampista c = new Centrocampista(asistencias, nombre, dorsal, barca);
            jugadores.add(c);
        }
    }
    
    public static void añadirDelantero(ArrayList<Jugador> jugadores, Equipo barca){
        
        String nombre = Teclat.leerString("Nombre del portero: ");
        byte dorsal = Teclat.leerByte("Dorsal del portero: ");
        byte goles = Teclat.leerByte("Goles: ");
        
        boolean resul = comprobar(nombre, dorsal, jugadores);
        
        if(resul == true){
            Delantero del = new Delantero(goles, nombre, dorsal, barca);
            jugadores.add(del);
        }
    }
    
    public static void mostrarJugadores(ArrayList<Jugador> jugadores){
        
        Iterator<Jugador> it = jugadores.iterator();
        
        while(it.hasNext()){
            
            Jugador jugador = it.next();
            if(jugador != null)
            {
                System.out.println(jugador.toString());
            }
        }
    }
    
    
    
}
