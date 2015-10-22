/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package profesores;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author joan
 */
public class GestioArxius {

    public static final String NOM_ARXIU = "departamentos.csv";

    public static ArrayList<Departamento> llegirDepartaments() {
        // ArrayList amb els clubs llegits
        ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

        try {
            // Obrim l'arxiu per llegir línia a línia
            FileReader fr = new FileReader(NOM_ARXIU);
            BufferedReader entrada = new BufferedReader(fr);

            String linea;
            while ((linea = entrada.readLine()) != null) {
                Departamento d = new Departamento();
                StringTokenizer str = new StringTokenizer(linea, ";");


                d.setNombre(str.nextToken());
                d.setDespacho(str.nextToken());
                departamentos.add(d);

            }

            // Tanquem l'arxiu
            entrada.close();
            fr.close();
        } catch (Exception e) {
            System.out.println("No s'ha pogut llegir l'arxiu: " + NOM_ARXIU);
            e.printStackTrace();
        }

        return departamentos;
    }

    public static void llegirProfesors(ArrayList<Departamento> departamentos) {
        // ArrayList amb els jugadors llegits
        //ArrayList<Profesor> profesors = new ArrayList<Profesor>();

        try {
            for (Departamento departamentoActual : departamentos) {
                GestioArxius.llegirProfesors(departamentoActual);
            }
        } catch (Exception e) {
            System.out.println("No s'ha pogut llegir l'arxiu");

        }
    }

    /**
     * Donat un departament, llegeix un arxiu de text amb els seus profesors
     */
    public static void llegirProfesors(Departamento departamento) {
        // ArrayList amb els jugadors llegits
        ArrayList<Profesor> profesors = new ArrayList<Profesor>();
        String filename = departamento.getNombre().replace(" ", "_").concat(".csv");

        try {
            FileReader fr = new FileReader(filename);
            BufferedReader entrada = new BufferedReader(fr);

            String linea;

            //Mientras haya líneas
            while ((linea = entrada.readLine()) != null) {
                Profesor p = new Profesor();
                StringTokenizer str = new StringTokenizer(linea, ";");


                p.setNombre(str.nextToken());
                p.setApellido(str.nextToken());
                p.setAsignatura(str.nextToken());
                p.setCargo(str.nextToken());

                //Compruebo si el campo tutor está lleno en el archivo, sino
                //hiciera esta comprobación no podría abrir el archivo
                boolean tutor = str.hasMoreTokens();

                if (tutor == false) {
                    p.setTutor("No es tutor");
                } else {
                    p.setTutor(str.nextToken());
                }

                profesors.add(p);
                //Imprmir a
                //System.out.println(p);
            }


            // Tanquem l'arxiu
            entrada.close();
            fr.close();

            departamento.setProfesors(profesors);

        } catch (Exception e) {
            System.out.println("No s'ha pogut llegir l'arxiu " + filename);
        }
    }
}
