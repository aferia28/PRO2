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
import java.util.Iterator;
import java.util.ListIterator;
import java.util.StringTokenizer;

/**
 *
 * @author joan
 */
public class Profesores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inicio();


    }

    public static void inicio() {
        try {
            ArrayList<Departamento> departamentos = GestioArxius.llegirDepartaments();
            GestioArxius.llegirProfesors(departamentos);



            boolean salir = false;

            do {
                switch (menu()) {
                    case 1:
                        departamentos(departamentos); //la funcion departamentos, solo muestra los departamentos existentes. (lista)
                        mostrar_depar(departamentos); // mostrar membres del departament
                        break;
                    case 2:
                        departamentos(departamentos);
                        coordi_depar(departamentos);
                        break;
                    case 3:
                        departamentos(departamentos);
                        mostrar_tutor(departamentos);
                        break;
                    case 4:
                        departamentos(departamentos);
                        mostrar_despacho(departamentos);
                        break;
                    case 0:
                        System.out.println("Ha salido de la aplicación");
                        salir = true;
                        break;
                }
            } while (salir == false);


        } catch (Exception e) {
            System.out.println("Error en gestion de departamentos");
        }
    }

    public static int menu() {
        int opcio = -1;
        boolean out = false;

        while (!out) {

            System.out.println("\n*****Menú Principal*****");
            System.out.println("1- Mostrar los integrantes de un departamento");
            System.out.println("2- Mostrar el coordinador de un departamento");
            System.out.println("3- Mostrar el tutor de un curso");
            System.out.println("4- Mostrar el despacho de un departamento");
            System.out.println("0- Salir");
            opcio = Teclat.getInt("\nEscolleig la teva opcio: ");

            if (opcio >= 0 && opcio <= 4) {
                out = true;

            }

        }
        return opcio;
    }

    public static void coordi_depar(ArrayList departamentos) {

        ListIterator<Departamento> itr = departamentos.listIterator();

        System.out.println("\nDe que departamento quieres conocer el coordinador? ");
        String dep = Teclat.getString("Nombre: ");
        while (itr.hasNext()) {
            Departamento depar = (Departamento) itr.next();
            String nombre_dept = depar.getNombre();

            //Enseño el coordinador del departamento elegido
            if (nombre_dept.equalsIgnoreCase(dep)) {
                Iterator<Profesor> profe = depar.getProfesors().iterator();
                while (profe.hasNext()) {
                    Profesor prof = (Profesor) profe.next();
                    String cargo = prof.getCargo();
                    //Enseña al coordinador de informática
                    if (cargo.equalsIgnoreCase("coordinador")) {
                        System.out.println(prof);

                    }

                }


            }

        }
    }

    public static void mostrar_depar(ArrayList departamentos) {

        ListIterator<Departamento> itr = departamentos.listIterator();

        System.out.println("\nDe que departamento quieres conocer los miembros? ");
        String dep = Teclat.getString("Nombre: ");
        while (itr.hasNext()) {
            Departamento depar = (Departamento) itr.next();
            String nombre_depar = depar.getNombre();
            if (nombre_depar.equalsIgnoreCase(dep)) {
                Iterator<Profesor> profe = depar.getProfesors().iterator();
                while (profe.hasNext()) {

                    System.out.println(profe.next());
                }
            }
        }

    }

    public static void mostrar_tutor(ArrayList departamentos) {

        ListIterator<Departamento> itr = departamentos.listIterator();

        System.out.println("\nDe que departamento quieres es el curso? ");
        String dep = Teclat.getString("Nombre: ");
        System.out.println("\nDe que curso quieres conocer el tutor? ");
        String curso = Teclat.getString("Curso: ");
        while (itr.hasNext()) {
            Departamento depar = (Departamento) itr.next();
            String nombre_depar = depar.getNombre();
            if (nombre_depar.equalsIgnoreCase(dep)) {
                Iterator<Profesor> profe = depar.getProfesors().iterator();
                while (profe.hasNext()) {
                    Profesor prof = (Profesor) profe.next();
                    String tutor = prof.getTutor();
                    if (tutor.equalsIgnoreCase(curso)) {
                        System.out.println(prof);
                    }

                }
            }
        }

    }

    public static void mostrar_despacho(ArrayList departamentos) {
        
        ListIterator<Departamento> itr = departamentos.listIterator();
        
        System.out.println("De que departamento quiere conocer el despacho?");
        String departamento = Teclat.getString();
        //Comparo si los departamentos del arrayList tienen algun nombre de
        //departamento igual al introducido por teclado, si es así, imprimo el
        //departamento por pantalla
        while(itr.hasNext()){
            Departamento depar = (Departamento) itr.next();
            String nombre_depar = depar.getNombre();
            if(nombre_depar.equalsIgnoreCase(departamento)){
                String despacho = depar.getDespacho();
                System.out.println(despacho);
            }
        }
    }

    public static void departamentos(ArrayList departamentos) {
        ListIterator<Departamento> itr = departamentos.listIterator();
        //Enseño los departamentos existentes
        System.out.println("\nListado de departamentos existentes\n");
        while (itr.hasNext()) {
            Departamento depar = (Departamento) itr.next();
            System.out.println(depar.getNombre());
        }
        //Pongo el iterador al principio para que cuando vuelva otra vez
        //al menú principal, printe de nuevo todos los departamentos
        //es mejor crear el ListIterator cada vez (mas rapido q recorrer rebobinar el arraylist)
        //while (itr.hasPrevious()) {
        //    itr.previous();
        //}
    }
}
