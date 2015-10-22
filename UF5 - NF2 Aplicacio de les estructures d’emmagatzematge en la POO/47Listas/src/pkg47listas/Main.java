/*
Realitza un programa que permeti les següents accions:

- Afegir un objecte a la llista a partir de l'element actual
- canviar la posició de l'element actual, un cap a l'esquerra
- canviar la posició de l'element actual, un cap a la dreta
- canviar la posició de l'element actual al principi de tot
- canviar la posició de l'element actual al final de tot
- Eliminar l'objecte contingut en la posició actual
- Sortir del programa

Fer-ho en un ArrayList
Fer-ho en una LinkedList
Fer-ho en una HashSet (només les opcions adients)
Fer-ho en un TreeSet (només les opcions adients)

 */
package pkg47listas;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Estudiante> lista = new ArrayList(); //La arrayList cada vez que añade un objeto lo añade seguidamente.
        ListIterator it = lista.listIterator();//El listiterator, siempre se queda en la posición siguiente al ultimo objeto añadido.
        int op;
        
        do{
            op = menu();
            switch(op){
                case 1:
                    agefirObjecte(lista, it);
                    break;
                case 2:
                    moureEsquerra(it);
                    break;
                case 3:
                    moureDreta(it);
                    break;
                case 4:
                    mourePrincipi(it);
                    break;
                case 5:
                    moureFinal(it);
                    break;
                case 6:
                    eliminar(lista, it);
                    break;
                case 0:
                    System.out.println("ADEUUU!!");
                    break;    
            }
            
        }while(op != 0);
        
    }
    
    public static int menu(){
        
        System.out.println("¿A on vols anar a parar?");
        System.out.println("--------------------------------------------\n");
        System.out.println("1. Añadir objecte a la llista. ");
        System.out.println("2. Canviar la posició cap a l'esquerra.");
        System.out.println("3. Canviar la posicio cap a la dreta.");
        System.out.println("4. Canviar la posició al principi de tot.");
        System.out.println("5. Canviar la posició al final de tot.");
        System.out.println("6. Eliminar objecte de la posició actual.");
        System.out.println("0. Sortir");
        
        int opcio = Teclado.leerInt("Opcio: ");
        return opcio;
    }
    
    public static void agefirObjecte(ArrayList<Estudiante> lista, ListIterator it){
        
        String nom = Teclado.leerString("Intodueix el nom de l'estudiant: ");
        int edat = Teclado.leerInt("Introdueix el la edat de l'estudiant: ");
        
        Estudiante estudiante1 = new Estudiante(nom, edat);
        it.add(estudiante1);
        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    
    public static void moureEsquerra(ListIterator it){
        
        if(it.hasPrevious()){
            System.out.println(it.previous());
        }else{
            Estudiante e = null;
            while(it.hasNext())
            {
                e = (Estudiante) it.next();
            }
            System.out.println(e.toString());
        }
    }
    
    public static void moureDreta(ListIterator it){
        
        if(it.hasNext()){
            System.out.println(it.next());
        }else{
            System.out.println("No hi ha cap objecte a la dreta.");
        }
    }    
    
    public static void mourePrincipi(ListIterator it){
        
        while(it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
    
    public static void moureFinal(ListIterator it){
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public static void eliminar(ArrayList<Estudiante> lista, ListIterator it){

        it.remove();
        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
