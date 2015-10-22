/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvordenar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

/**
 *
 * @author adrianferialopez
 */
public class GestionFichero {
    
    public ArrayList leerFicheroCSV(String nombreFichero) throws ParseException{
        
        ArrayList<Persona> arrayPersonas = new ArrayList<>();
        BufferedReader entrada = null;
        
        try{
            entrada = new BufferedReader(new FileReader(nombreFichero));
            
            String linea, dniStr, fechaStr;
            entrada.readLine();//leemos la primera linea sin tratarla. Es la cabecera.
            int dni;
            
            while((linea = entrada.readLine()) != null)
            {
                Persona p = new Persona();
                StringTokenizer str = new StringTokenizer(linea, ";");
                
                p.setNombre(str.nextToken());
                p.setApellido(str.nextToken());
                dniStr = str.nextToken();
                dni = Integer.parseInt(dniStr);
                p.setDni(dni);
                /*
                fechaStr = str.nextToken();
                Date datParsed = d.parse(fechaStr);
                cal.setTime(datParsed);
                p.setFechaNacimiento(cal);*/
                arrayPersonas.add(p);
                
                System.out.println(p);
                
            }
            if(entrada != null)
            {
                entrada.close();
            }
        }catch(FileNotFoundException ex)
        {
            System.out.println("No existe el fichero");
            ex.printStackTrace();
        }catch(IOException ex)
        {
            System.out.println("Error de lectura");
            ex.printStackTrace();
        } finally {
            try{
                if(entrada!= null){
                    entrada.close();
                    return arrayPersonas;
                }
            }catch(IOException ex){
                System.out.println("Problemas cerrando el fichero.");
                return arrayPersonas;
            }
        }
        return arrayPersonas;
    }
    
    public void escribirFicheroCSV(String nombreFichero, boolean anyadir, Persona p)
    {
        File f;
        
        f = new File(nombreFichero);
        boolean encabezado = false;
        
        if(f.exists() && !anyadir)
        {
            f.delete();
            encabezado = true;
        }
        if(!f.exists())
        {
            encabezado = true;
        }
        
        FileWriter flujoSalida = null;
        BufferedWriter salida = null;
        
        try
        {
            flujoSalida = new FileWriter(f, anyadir);
            salida = new BufferedWriter(flujoSalida);
            
            if(encabezado)
            {
                salida.write("nombre;apellido;dni");
                salida.newLine();
            }
            
            String nombre = p.getNombre();
            salida.write(nombre + ";");
            String apellido = p.getApellido();
            salida.write(apellido + ";");
            int dni = p.getDni();
            salida.write(Integer.toString(dni));
            
            salida.newLine();
        }
        catch(IOException e)
        {
            System.out.println("Error en la Escritura");
            e.printStackTrace();
        }finally {
            try{
                salida.close();
                flujoSalida.close();
            }catch(IOException ex){
                System.out.println("Problemas para cerrar el archivo.");
            }
        }
        
    }
    
}
