/*
Realitza un programa que permeti les següents accions:

- Afegir un objecte a la llista a partir de l'element actual
- canviar la posició de l'element actual, un cap a l'esquerra
- canviar la posició de l'element actual, un cap a la dreta
- canviar la posició de l'element actual al principi de tot
- canviar la posició de l'element actual al final de tot
- Eliminar l'objecte contingut en la posició actual
- Sortir del programa

Fer-ho en una HashSet
 */
 
package pkg47.pkg3hashset;

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
        
        HashSet<Estudiante> lista = new HashSet();
        Iterator it = lista.iterator();
        int op;
        
        do{
            op = menu();
            switch(op){
                case 1:
                    agefirObjecte(lista, it);
                    break;
                case 2:
                    moureEsquerra();
                    break;
                case 3:
                    moureDreta(lista,it);
                    break;
                case 4:
                    mourePrincipi();
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
    
    public static void agefirObjecte(HashSet<Estudiante> lista, Iterator it){
        
        String nom = Teclado.leerString("Intodueix el nom de l'estudiant: ");
        int edat = Teclado.leerInt("Introdueix el la edat de l'estudiant: ");
        
        Estudiante estudiante1 = new Estudiante(nom, edat);
        
        lista.add(estudiante1);// Añadimos desde el set, porque un HashSet es como un saco. Metemos los elementos de forma "aleatoria".

        
    }
    
    
    public static void moureEsquerra(){
  
         System.out.println("Amb HashSet no es pot moure cap a l'esquerra.");
        
    }
    
    public static void moureDreta(HashSet<Estudiante> lista, Iterator it){
        
        if(lista.isEmpty())
        {
            System.out.println("Primer introdueix un Estudiant...");
        }else
        {
            if(it.hasNext()) //Si hi ha un element a la dreta...
            {
                it.next(); //mourem una posicio a la dreta com diu l'enunciat.
            }
        }
        
    }    
    
    public static void mourePrincipi(){
        
        System.out.println("Amb HashSet no es pot moure cap a l'esquerra.");
    }
    
    public static void moureFinal(Iterator it){
        
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public static void eliminar(HashSet<Estudiante> lista, Iterator it){

        if(lista.isEmpty()){
            System.out.println("Introduce primero algún objeto");
        }else{
            
            it.remove();
        }
    }
}