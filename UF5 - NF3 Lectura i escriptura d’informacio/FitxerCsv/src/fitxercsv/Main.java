/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitxercsv;

import java.text.ParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Ivan Martin Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        int opcion;
        GestionFichero gf = new GestionFichero();
        List<Persona> people = gf.leerDeCSV("People.csv");
        ListIterator ite = people.listIterator();
        
        do{
            //opcion=0;
            opcion=menu();
            switch (opcion){
                case 1:
                    name_AtoZ(people);
                    ite = people.listIterator();
                    break;
                    
                case 2:
                    name_ZtoA(people);
                    ite = people.listIterator();
                    break;
                    
                case 3:
                    lastname_AtoZ(people);
                    ite = people.listIterator();
                    break;
                    
                case 4:
                    lastname_ZtoA(people);
                    ite = people.listIterator();
                    break;
                    
                case 5:
                    DNI_Asc(people);
                    ite = people.listIterator();
                    break;
                    
                case 6:
                    DNI_Desc(people);
                    ite = people.listIterator();
                    break;
                    
                case 7:
                    Naixement_Asc(people);
                    ite = people.listIterator();
                    break;
                    
                case 8:
                    Naixement_Desc(people);
                    ite = people.listIterator();
                    break;
                    
                case 9:
                    System.out.println("\n======MOSTRAR PERSONAS======");
                    while(ite.hasNext()){
                        System.out.println(ite.next().toString());
                    }
                    System.out.println("");
                    break;
                    
                case 0:
                    System.out.println("======FINAL DEL PROGRAMA======");
                    break;
                default:
                    System.out.println("Opcio erronea");
                    break;
            }
        }while(opcion!=0);
    }
    private static int menu(){
        int opcion;
        System.out.println("======TRACTAMENT DE FITXERS CSV======");
        System.out.println("1. Ordenar fitxer per nom de la A a la Z");
        System.out.println("2. Ordenar fitxer per nom de la Z a la A");
        System.out.println("3. Ordenar fitxer per cognom de la A a la Z");
        System.out.println("4. Ordenar fitxer per cognom de la Z a la A");
        System.out.println("5. Ordenar fitxer per numero de DNI ascendent");
        System.out.println("6. Ordenar fitxer per numero de DNI descendent");
        System.out.println("7. Ordenar fitxer per data de naixement ascendent");
        System.out.println("8. Ordenar fitxer per data de naixement descendent");
        System.out.println("9. Mostrar personas");
        System.out.println("0. Sortir de la aplicacio");
        opcion = Teclado.leerInt("Opcio: ");
        return opcion;
    }
    
    private static void name_AtoZ(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNom().compareTo(p2.getNom());
            }
        });
    }
    private static void name_ZtoA(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getNom().compareTo(p1.getNom());
            }
        });
    }
    
    private static void lastname_AtoZ(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getCognom().compareTo(p2.getCognom());
            }
        });
    }
    
    private static void lastname_ZtoA(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getCognom().compareTo(p1.getCognom());
            }
        });
    }
    
    private static void DNI_Asc(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNIF().compareTo(p2.getNIF());
            }
        });
    }
    
    private static void DNI_Desc(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getNIF().compareTo(p1.getNIF());
            }
        });
    }
    
    private static void Naixement_Asc(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p1.getNIF().compareTo(p2.getNIF());
            }
        });
    }
    
    private static void Naixement_Desc(List people){
        Collections.sort(people, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return p2.getNIF().compareTo(p1.getNIF());
            }
        }); 
    }
    
    
    /*
        Este codigo es para añadir personas al fichero
    
        Calendar calendar = Calendar.getInstance();
        calendar.set(1991, 1, 17);
        Persona p1 = new Persona("Sergio", "Andres", "63", calendar.getTime() );
        people.add(p1);
        
        calendar.set(1982, 5, 8);
        Persona p2 = new Persona("David", "Sancho", "11", calendar.getTime());
        people.add(p2);
        
        calendar.set(2000, 11, 11);
        Persona p3 = new Persona("Arely", "Darlene", "28", calendar.getTime());
        people.add(p3);
        ListIterator iter = people.listIterator();
        gf.EscribeEnTextoCSV("People.csv", true, p1);
        gf.EscribeEnTextoCSV("People.csv", true, p2);
        gf.EscribeEnTextoCSV("People.csv", true, p3);
    */
}
