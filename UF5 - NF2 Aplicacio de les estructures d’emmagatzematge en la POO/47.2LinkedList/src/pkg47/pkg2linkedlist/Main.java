/*
Realitza un programa que permeti les següents accions:

- Afegir un objecte a la llista a partir de l'element actual
- canviar la posició de l'element actual, un cap a l'esquerra
- canviar la posició de l'element actual, un cap a la dreta
- canviar la posició de l'element actual al principi de tot
- canviar la posició de l'element actual al final de tot
- Eliminar l'objecte contingut en la posició actual
- Sortir del programa

Fer-ho en una LinkedList
 */
package pkg47.pkg2linkedlist;

import java.util.*;

/**
 *
 * @author adrianferialopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        LinkedList<Estudiante> lista = new LinkedList(); //La arrayList cada vez que añade un objeto lo añade seguidamente.
        ListIterator it = lista.listIterator();//El listiterator, siempre se queda en la posición siguiente al ultimo objeto añadido.
        int op;
        
        do{
            op = menu();
            switch(op){
                case 1:
                    agefirObjecte(lista, it);
                    break;
                case 2:
                    moureEsquerra(lista,it);
                    break;
                case 3:
                    moureDreta(lista,it);
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
    
    public static void agefirObjecte(LinkedList<Estudiante> lista, ListIterator it){
        
        String nom = Teclado.leerString("Intodueix el nom de l'estudiant: ");
        int edat = Teclado.leerInt("Introdueix el la edat de l'estudiant: ");
        
        Estudiante estudiante1 = new Estudiante(nom, edat);
        
        if(lista.isEmpty()) //Si la lista esta vacia, simplemente introducimos al estudiante.
        {
            lista.add(estudiante1);
        }else //Si la lista no esta vacio, añadimos el estudiante mediante el iterator. El elemento se añadira en la posición donde se encuentre el iterator.
        {
            it.add(estudiante1);
        }
       
        while(it.hasNext())//colocamos el itarator en la ultima posición.
        {
            it.next();
        }
        
        
        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
    
    public static void moureEsquerra(LinkedList<Estudiante> lista, ListIterator it){
        
        if(lista.isEmpty())
        {
            System.out.println("Primer introdueix un Estudiant...");
        }else
        {
            if(it.hasPrevious()) //si hi ha un objecte a l'esquerra, moute a l'esquerra..
            {
                it.previous();
            }else //Si no hi ha cap (estara al principi de la llista)..
            {
                while(it.hasNext()) //farem que vagi al final..es a dir, donara la volta.
                {
                    it.next();
                }
            }
        }
        
    }
    
    public static void moureDreta(LinkedList<Estudiante> lista, ListIterator it){
        
        if(lista.isEmpty())
        {
            System.out.println("Primer introdueix un Estudiant...");
        }else
        {
            if(it.hasNext()) //Si hi ha un element a la dreta...
            {
                it.next(); //mourem una posicio a la dreta com diu l'enunciat.
            }else //Si no hi cap element a la dreta..
            {
                while(it.hasPrevious()) //Mourem l'iterator al principi..(Mentre hagi un element a la esquerra.. mourem a la esquerra, d'aquesta manera arribarem al principi.)
                {
                    it.previous();
                }
            }
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
    
    public static void eliminar(LinkedList<Estudiante> lista, ListIterator it){

        if(lista.isEmpty()){
            System.out.println("Introduce primero algún objeto");
        }else{
            /*La primera vegada que elimina un objecte elimina l'ultima posició
             * de larraylist, si la ultima cosa que havies fet era introduir un 
             * objecte a larraylist. Llavors la segona vegada que elimines un 
             * objecte, eliminies el de la primera posició de larraylist degut
             * a que ara l'iterador apunta a la primera posició de larraylist 
             */
            if(!it.hasPrevious()){
                lista.remove(it.nextIndex());
            }else{
                lista.remove(it.nextIndex()-1);
            }
        }
    }
}
