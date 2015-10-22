/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxercsv;

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
import java.util.Locale;
import java.util.StringTokenizer;

/**
 *
 * @author Ivan Martin Lopez
 */
public class GestionFichero {
    public void EscribeEnTextoCSV (String nombreFichero, boolean anyadir, Persona p){
        File f;
        f=new File(nombreFichero);
        
        boolean encabezado = false;
        // comprobamos existencia de ficheros, si el fichero es nuevo se debera
        // incluir el encabezado del fichero ("como estara escrito")
        if (f.exists() && !anyadir){
            f.delete();
            encabezado = true;
        }
        if (!f.exists()){
            encabezado = true; 
        }
        // utilizamos el buffer para hacerlo linea a linea
        FileWriter flujoSalida = null;
        BufferedWriter salida = null;
        
        try {
            flujoSalida = new FileWriter(f, anyadir);
            salida = new BufferedWriter(flujoSalida);
            if (encabezado) {
                salida.write("nom;cognom;NIF;data_naix");
                salida.newLine();
            }
            String nom = p.getNom();
            salida.write(nom+";");
            String cognom = p.getCognom();
            salida.write(cognom+";");
            String NIF = p.getNIF();
            salida.write(NIF+";");
            Date data = p.getData();
            salida.write(data.toString());
            
            salida.newLine();
        }catch (IOException ex){
            System.err.println("Error de escritura");
        } finally {
            try {
                salida.close();
                flujoSalida.close();
            } catch (IOException ex){
                System.err.println("Problemas cerrando el fichero");
            }
        }    
    }
    
    public ArrayList leerDeCSV (String nombreFichero) throws ParseException{
        ArrayList<Persona> peoplefromCSV = new ArrayList<>();
        
        BufferedReader entrada = null;
        
        try {
            entrada = new BufferedReader(new FileReader (nombreFichero));
            
            String linea;
            entrada.readLine();
            String dataStr;
            Date data_naix;
            
            while((linea = entrada.readLine()) != null){
                
                Persona p = new Persona();
                StringTokenizer str = new StringTokenizer(linea, ";");
               
                p.setNom(str.nextToken());
                p.setCognom(str.nextToken());
                p.setNIF(str.nextToken());
                
                dataStr=str.nextToken();
                SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd hh:mm:ss Z yyyy", Locale.ENGLISH);
                Date date = formatter.parse(dataStr);
                p.setData(date);
               
                peoplefromCSV.add(p);
                
            }
            if (entrada != null){
                entrada.close();
            }
        } catch (FileNotFoundException ex){
            System.err.println("No existe el fichero");
        } catch (IOException ex){
            System.err.println("Error de lectura");
        } finally {
            try{
                if(entrada != null){
                    entrada.close();
                    return peoplefromCSV;
                }
            } catch (IOException ex) {
                System.out.println("Problemas cerrando el fichero");
                return peoplefromCSV;
            }
            
        }
        return peoplefromCSV;
    }
}






