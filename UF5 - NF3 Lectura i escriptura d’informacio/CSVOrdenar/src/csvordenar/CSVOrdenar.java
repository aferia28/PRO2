/*
Programa pide cuatr datos: Nombre, Apellido, DNI, fecha de nacimiento.

8 opciones. 2 por cada dato. Una opción que ordene de la A-Z y otra de Z-A (ascendente y descendente.)
 */
package csvordenar;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class CSVOrdenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        GestionFichero gf = new GestionFichero();
        
        Persona p1 = new Persona("Adrian", "Feria", 47278639, null);
        Persona p2 = new Persona("Jose", "Feria", 47278693, null);
        Persona p3 = new Persona("zorge", "Feria", 47278691, null);
        Persona p4 = new Persona("Dorge", "Feria", 47278631, null);
        
        gf.escribirFicheroCSV("Personas.csv", false, p1);
        gf.escribirFicheroCSV("Personas.csv", true, p2);
        gf.escribirFicheroCSV("Personas.csv", true, p3);
        gf.escribirFicheroCSV("Personas.csv", true, p4);
        
        List<Persona> personasCSV = gf.leerFicheroCSV("Personas.csv");
        
        ordenacioArray(personasCSV);
        ListIterator itx = personasCSV.listIterator();

   
        while(itx.hasNext())
        {
            itx.next().toString();
        } 
        //gf.leerFicheroCSV("Personas.csv");
    }
    
    public static void ordenacioArray(List arrayPersonas)
    {
        Collections.sort(arrayPersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona a, Persona b) {
                System.out.println( b.getNombre() );
                System.out.println( a.getNombre() );
                System.out.println( b.getNombre().compareTo(a.getNombre()) );
                return b.getNombre().compareTo(a.getNombre());
            }
        });
    }
}
