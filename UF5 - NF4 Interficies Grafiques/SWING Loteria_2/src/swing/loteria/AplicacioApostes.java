/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.loteria;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author adrianferialopez
 */
public class AplicacioApostes {
    
    GestioArrayApostes gApostes;
    
    AplicacioApostes(ArrayList apostes)
    {
        gApostes = new GestioArrayApostes(apostes);
    }
    
    public void iniciar() throws ExepcioArrayBuit, ExepcioApostaInexistent, ExepcioApostaExistent{
        
        int op;
        do{
            op = menu();
            switch(op){
                case 1:
                        try{
                        mostrarApostes();
                        }catch(ExepcioArrayBuit e)
                        {
                            System.out.println("");
                            System.out.println("L'array esta buit.");
                        }
                    break;
                case 2:
                    mostrarAposta();
                    break;
                case 3:
                    afegirAposta();
                    break;
                case 4:
                    eliminarAposta();
                    //eliminar aposta. Falta metodo eliminarAposta, sino cuando la modificamos, se añadirá una nueva en lugar de modificiar(ya que el modificar elimina y luego añade.)
                    break;
                case 5:
                    modificarAposta();
                    break;
                case 6:
                    calcularTotalApostes();
                    break;
                case 0:
                    System.out.println("ADEUUU");
                    break;
            }
            
        }while(op != 0);
    }
    
    public int menu(){
        
        System.out.println("");
        System.out.println("MENU PRINCIPAL");
        System.out.println("");
        System.out.println("1 - Mostrar totes les apostes.");
        System.out.println("2 - Mostrar una aposta.");
        System.out.println("3 - Afegir una aposta.");
        System.out.println("4 - Eliminar una aposta.");
        System.out.println("5 - Modificar una aposta.");
        System.out.println("6 - Calcular total apostes.");
        System.out.println("0 - Sortir");
        
        int opcio = Teclat.leerInt("Opcio: \n");
        
        return opcio;
    }
    
    public void mostrarApostes() throws ExepcioArrayBuit{
        
        System.out.println("### MOSTRAR TOTES LES APOSTES ###");
        
        ArrayList apostes = gApostes.getArrayApostes();
        
        if(apostes.isEmpty()){
            throw new ExepcioArrayBuit();
        }else{
        
            ListIterator it = apostes.listIterator();

            while(it.hasNext()){
                System.out.println(it.next().toString());
            }
        }
    }
    
    public void mostrarAposta() throws ExepcioArrayBuit, ExepcioApostaInexistent{
        
        System.out.println("### MOSTRAR APOSTA ###");
        
        Double preuAposta;
        
        String nom = Teclat.leerString("Introdueix el nom de l'apostant: ");
        preuAposta = gApostes.recuperarAposta(nom);
        
        System.out.println("L'aposta de " + nom + " es de " + preuAposta + " euros");
        
    }
    
    public void afegirAposta() throws ExepcioApostaExistent{
        
        Aposta a;
        
        System.out.println("### AFEGIR APOSTA ###");
        
        String nom = Teclat.leerString("Nom: ");
        Double aposta = Teclat.leerDouble("Introdueix la cuantitat: ");
        
        a = new Aposta(nom, aposta);
        
        if(a.getAposta()%20 != 0)
        {
         System.out.println("Aposta NO afegida. L'aposta ha de ser multiple de 20.");   
        }else{
         gApostes.afegirAposta(a);   
        }
    }
    
    public void modificarAposta() throws ExepcioArrayBuit, ExepcioApostaInexistent, ExepcioApostaExistent{
        
        System.out.println("### MODIFICAR APOSTA ###");
        
        String nom = Teclat.leerString("Introduexi el nom de la persona Apostant.");
        double aposta = gApostes.recuperarAposta(nom);
        
        System.out.println("APOSTA: Nom: " + nom + "\n" + "Quantitat apostada: " + aposta);
        
        double novaAposta = Teclat.leerDouble("Quina es la nova cuantitat que vols apostar: ");
        
        if(novaAposta != 0 && novaAposta > 20)
        {
            gApostes.eliminarAposta(nom); //eliminamos la apuesta anterior y añadimos la nueva.
            gApostes.afegirAposta(new Aposta(nom,novaAposta));
        }
    }
    
    public void calcularTotalApostes(){
        
        System.out.println("### CALCULAR TOTAL APOSTES ###");
        
        double totalApostes=0;
        
        ArrayList<Aposta> arrayApostes = gApostes.getArrayApostes();
        
        Iterator<Aposta> it = arrayApostes.iterator();
        while(it.hasNext()){
            
            totalApostes = totalApostes+it.next().getAposta();
        }
        System.out.println("");
        System.out.println("La suma total de les apostes es de: "+totalApostes);
    }
    
    public void eliminarAposta() throws ExepcioArrayBuit, ExepcioApostaInexistent{
        
        System.out.println("### ELIMINAR APOSTA ###");
        
        String nom = Teclat.leerString("Escriu el nom de l'apostant que vols eliminar: ");
        try{
            
            gApostes.eliminarAposta(nom);
            System.out.println("Aposta eliminada correctament.");
            
        }catch(ExepcioApostaInexistent e)
        {
            System.out.println("");
            System.out.println("Aquesta persona no te cap aposta registrada.");
        }
    }
}
