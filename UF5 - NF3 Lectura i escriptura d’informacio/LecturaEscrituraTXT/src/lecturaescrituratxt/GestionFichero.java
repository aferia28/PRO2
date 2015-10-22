/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaescrituratxt;

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
 * @author jserrano
 */
public class GestionFichero {

    public void EscribeEnFicheroTexto(String nombreFichero, boolean anyadir, Alumne a) {
        File f;
        f = new File(nombreFichero);
        //Si el fichero existe y anyadir es false, elimina el fichero para
        //que no haya datos antiguos
        if (f.exists() && !anyadir) {
            f.delete();
        }
        //Escribir con buffer para hacerlo línea a línea
        FileWriter flujoSalida = null;
        BufferedWriter salida = null;
        try {
            flujoSalida = new FileWriter(f, anyadir);
            salida = new BufferedWriter(flujoSalida);
            /*Escribo nom en el fichero, hago un salto de línea y escribo edat,
             es necesario pasar edat a String*/
            String nom = a.getNom();
            salida.write(nom);
            salida.newLine();
            int edat = a.getEdat();
            salida.write(Integer.toString(edat));
            salida.newLine();

        } catch (IOException ex) {
            System.err.println("Error de escritura");
            //ex.printStackTrace();
        } finally {
            try {
                salida.close();
                flujoSalida.close();
            } catch (IOException ex) {
                System.out.println("Problemas cerrando el fichero en la escritura");
                //ex.printStackTrace();
            }
        }
    }

    public static void leerArchivoTXT(String nombreFichero) {

        Alumne a;
        String nom, edadStr;
        int edat;
        ArrayList<Alumne> Alum = new ArrayList<Alumne>();

        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader(nombreFichero));

            //Mientras haya líneas
            while ((nom = entrada.readLine()) != null) {

                edadStr = entrada.readLine();
                edat = Integer.parseInt(edadStr);

                //Pasar campos al objeto a
                a = new Alumne(nom, edat);
                Alum.add(a);
                //Imprmir a
                //System.out.println(a);
            }

            System.out.println("Imprimiendo ArrayList");
            ListIterator it = Alum.listIterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }

        } catch (FileNotFoundException ex) {
            System.err.println("No existe el fichero");
            //ex.printStackTrace();
        } catch (IOException ex) {
            System.err.println("Error de Lectura");
            //ex.printStackTrace();
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
}
