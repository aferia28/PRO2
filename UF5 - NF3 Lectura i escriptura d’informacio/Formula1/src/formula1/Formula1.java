/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formula1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;


/**
 *
 * @author adrianferialopez
 */
public class Formula1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inicio();
    }
    
    public static void inicio()
    {
        int op;
        try{
            ArrayList<Equipo> equipos = GestioArxiu.leerEquipos();
            
            GestioArxiu.leerPersona(equipos);
            
            
            do{
                op = menu();
                switch(op)
                {
                    case 1:
                        equipos(equipos);
                        mostrar_equipo(equipos);
                        break;
                    case 2:
                        equipos(equipos);
                        mostrar_teamManager(equipos);
                        break;
                    case 3:
                        equipos(equipos);
                        mostrar_directorTecnico(equipos);
                        break;
                    case 4:
                        equipos(equipos);
                        mostrar_piloto(equipos);
                        break;
                    case 5:
                        equipos(equipos);
                        mostrarSede(equipos);
                        break;
                    case 0:
                        System.out.println("Ha salido de la aplicación");
                        break;
                }
                
                
            }while(op != 0);
        }catch (Exception e) {
            System.out.println("Error en gestion de departamentos");
        }
    }
    
    public static int menu(){
            System.out.println("\n*****Menú Principal*****");
            System.out.println("1- Mostrar los integrantes de un equipo");
            System.out.println("2- Mostrar el Team Manager de un equipo");
            System.out.println("3- Mostrar el Diretor Tecnico de un equipo");
            System.out.println("4- Mostrar el piloto de un monoplaza");
            System.out.println("5- Mostrar la sede de un equipo");
            System.out.println("0- Salir");
            
        int opcio = Teclado.leerInt("Opcio: \n");
        
        return opcio;        
    }
    
    public static void mostrar_teamManager(ArrayList equipos)
    {
        ListIterator<Equipo> it = equipos.listIterator();
       
        String director = Teclado.leerString("De que equipo quieres conocer el Team Manager?\nNombre:");
        
        while(it.hasNext())
        {
            Equipo eq = (Equipo) it.next(); //casteamos para que el elemento del iterador sea 100% un equipo
            String nombre_equipo = eq.getNombre(); //recogemos el nombre de este equipo
            
            if(nombre_equipo.equalsIgnoreCase(director)) //comparamos el nombre del equipo del iterador con el que nos ha introducido el usuario
            {                                            // si conciden entramos en el if.   
                Iterator<Persona> itp = eq.getPersonal().iterator(); //Creamos un iterador para el personal del equipo.
                while(itp.hasNext()) //recorremos el personal
                {
                    Persona person = (Persona) itp.next(); //Casteamos para que sean personas. Si no casteamos no funciona :S
                    String cargo = person.getCargo(); //De cada persona del equipo, recogemos el cargo...
                    
                    if(cargo.equalsIgnoreCase("Team Manager")) //si coincide con Team Manager, mostramos a la Persona.
                    {
                        System.out.println(person);
                    }
                }
            }
        }
        
    }
    
    public static void mostrar_equipo(ArrayList equipos)
    {
        ListIterator<Equipo> it = equipos.listIterator();
        
        String nombre = Teclado.leerString("De que equipo quieres conocer los integrantes?\nNombre:");
        while(it.hasNext())
        {
            Equipo eq = (Equipo) it.next();
            String nombre_equipo = eq.getNombre();
            
            if(nombre_equipo.equalsIgnoreCase(nombre))
            {
                Iterator<Persona> itp = eq.getPersonal().iterator();
                while(itp.hasNext())
                {
                    System.out.println(itp.next());
                }
            }
        }
    }
    
    public static void mostrar_directorTecnico(ArrayList equipos)
    {
        ListIterator<Equipo> it = equipos.listIterator();
       
        String director = Teclado.leerString("De que equipo quieres conocer el Director Tecnico?\nNombre:");
        
        while(it.hasNext())
        {
            Equipo eq = (Equipo) it.next(); //casteamos para que el elemento del iterador sea 100% un equipo
            String nombre_equipo = eq.getNombre(); //recogemos el nombre de este equipo
            
            if(nombre_equipo.equalsIgnoreCase(director)) //comparamos el nombre del equipo del iterador con el que nos ha introducido el usuario
            {                                            // si conciden entramos en el if.   
                Iterator<Persona> itp = eq.getPersonal().iterator(); //Creamos un iterador para el personal del equipo.
                while(itp.hasNext()) //recorremos el personal
                {
                    Persona person = (Persona) itp.next(); //Casteamos para que sean personas. Si no casteamos no funciona :S
                    String cargo = person.getCargo(); //De cada persona del equipo, recogemos el cargo...
                    
                    if(cargo.equalsIgnoreCase("Director Tecnico")) //si coincide con Team Manager, mostramos a la Persona.
                    {
                        System.out.println(person);
                    }
                }
            }
        }
        
    }
    
        public static void mostrar_piloto(ArrayList equipos)
        {
            ListIterator<Equipo> it = equipos.listIterator();

            String director = Teclado.leerString("De que equipo quieres conocer los Pilotos?\nNombre:");

            while(it.hasNext())
            {
                Equipo eq = (Equipo) it.next(); //casteamos para que el elemento del iterador sea 100% un equipo
                String nombre_equipo = eq.getNombre(); //recogemos el nombre de este equipo

                if(nombre_equipo.equalsIgnoreCase(director)) //comparamos el nombre del equipo del iterador con el que nos ha introducido el usuario
                {                                            // si conciden entramos en el if.   
                    Iterator<Persona> itp = eq.getPersonal().iterator(); //Creamos un iterador para el personal del equipo.
                    while(itp.hasNext()) //recorremos el personal
                    {
                        Persona person = (Persona) itp.next(); //Casteamos para que sean personas. Si no casteamos no funciona :S
                        String cargo = person.getCargo(); //De cada persona del equipo, recogemos el cargo...

                        if(cargo.equalsIgnoreCase("Piloto")) //si coincide con Team Manager, mostramos a la Persona.
                        {
                            System.out.println(person);
                        }
                    }
                }
            }
        }
    
    public static void equipos(ArrayList equipos)
    {
        ListIterator<Equipo> it = equipos.listIterator();
        System.out.println("Lista de equipos.");
        while(it.hasNext())
        {
            Equipo eq = (Equipo) it.next();
            System.out.println(eq.getNombre());
        }
    }
    
    public static void mostrarSede(ArrayList equipos)
    {
        ListIterator<Equipo> it = equipos.listIterator();
        
        String nombre = Teclado.leerString("De que equipo quieres conocer la Sede?\nNombre");
        while(it.hasNext())
        {
            Equipo eq = (Equipo) it.next();
            String nombre_equipo = eq.getNombre();
            if(nombre_equipo.equalsIgnoreCase(nombre))
            {
                String sede = eq.getCiudad();
                System.out.println(sede);
            }
        }
        
    }

}
