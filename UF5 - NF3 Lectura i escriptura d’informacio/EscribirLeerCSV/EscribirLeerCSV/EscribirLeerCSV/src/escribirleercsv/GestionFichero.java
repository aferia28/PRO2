/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirleercsv;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author jserrano
 */
public class GestionFichero {

    public GestionFichero() {
    }

    public void leerDeCSV(String nombreFichero) {
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(nombreFichero));

            String linea;
            entrada.readLine();//La primera línea la descarto porque es la cabecera
                               //readLine lee el documento por lineas. En esta linea, leemos la primera, y como sabemos que es la cabecera, no la tratamos. 
                               //Más adelante, si que trataremos las siguientes. 
            String edatStr;
            int edat;

            //Mientras haya líneas
            while ((linea = entrada.readLine()) != null) {
                Alumne a = new Alumne();
                StringTokenizer str = new StringTokenizer(linea, ";");


                a.setNom(str.nextToken());
                a.setApellido(str.nextToken());
                edatStr = str.nextToken();
                edat = Integer.parseInt(edatStr);
                a.setEdat(edat);

                //Imprmir a
                System.out.println(a);
            }
            //Cerrar el fichero
            if (entrada != null) {
                entrada.close();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("No existe el fichero");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error de Lectura");
            ex.printStackTrace();
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException ex) {
                System.out.println("Problemas cerrando el fichero");
            }
        }
    }

    public void EscribeEnTextoCSV(String nombreFichero, boolean anyadir, Alumne al) {
        
        File f;//Siempre hay que instanciar un fichero nuevo.
        
        f = new File(nombreFichero); //Recibe como parametro el nombre del fichero que va a tener.
        boolean encabezado = false;
        if (f.exists() && !anyadir) {//Si el archivo existe y el booleano es false. Borrará y creará uno nuevo.
            f.delete();
            encabezado = true;
        }
        if (!f.exists()) { //Si no existe, crearemos uno nuevo.
            encabezado = true;
        }
        //Escribir con buffer para hacerlo línea a línea
        FileWriter flujoSalida = null; // Instanciamos flujoSalida a partir de FileWriter. 
        BufferedWriter salida = null; // Y también salida a raiz de BufferedWriter, esto hará que escribamos linea a linea.
        try {
            flujoSalida = new FileWriter(f, anyadir); //Dos Parametros, el primero, el archivo donde escribiremos, el segundo; si en true añadiremos a continuación, si es false creará uno nuevo.
            salida = new BufferedWriter(flujoSalida);
            if (encabezado) {
                salida.write("nom;apellido;edat");
                salida.newLine();
            }
            String nom = al.getNom();
            salida.write(nom + ";");
            String apellido = al.getApellido();
            salida.write(apellido + ";");
            int edat = al.getEdat();
            salida.write(Integer.toString(edat));

            salida.newLine();

        } catch (IOException ex) {
            System.out.println("Error de Escritura");
            ex.printStackTrace();
        } finally {
            try {
                salida.close();
                flujoSalida.close();
            } catch (IOException ex) {
                System.out.println("Problemas cerrando el fichero");
                //ex.printStackTrace();
            }
        }

    }
}
