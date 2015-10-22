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
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    //eliminar aposta. Falta metodo eliminarAposta, sino cuando la modificamos, se añadirá una nueva en lugar de modificiar(ya que el modificar elimina y luego añade.)
                    break;
                case 5:
                    
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
    
    public String mostrarApostes() throws ExepcioArrayBuit{
        
        String salida ="";
        ArrayList apostes = gApostes.getArrayApostes();
        
        if(apostes.isEmpty()){
            throw new ExepcioArrayBuit();
        }else{
        
            ListIterator<Aposta> it = apostes.listIterator();

            while(it.hasNext()){
                Aposta a = it.next();
                salida += a.toString() + "\n";
            }
        }
        return salida;
    }
    
    public String mostrarAposta(String nom) throws ExepcioArrayBuit, ExepcioApostaInexistent{
        
        Double preuAposta;
        
        preuAposta = gApostes.recuperarAposta(nom);
        
        return("L'aposta de " + nom + " es de " + preuAposta + " euros");
        
    }
    
    public String afegirAposta(String nom,Double aposta) throws ExepcioApostaExistent{
        
        Aposta a;

        a = new Aposta(nom, aposta);
        
        if(a.getAposta()%20 != 0)
        {
         return "Aposta NO afegida. L'aposta ha de ser multiple de 20.";   
        }else{
         gApostes.afegirAposta(a);
         return "Aposta afegida";
        }
    }
    
    public String modificarAposta(String nom, double aposta) throws ExepcioArrayBuit, ExepcioApostaInexistent, ExepcioApostaExistent{
        
        if(aposta != 0 && aposta > 20)
        {
            gApostes.eliminarAposta(nom); //eliminamos la apuesta anterior y añadimos la nueva.
            gApostes.afegirAposta(new Aposta(nom,aposta));
        }
        
        return "Aposta modificada";
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
    
    public String eliminarAposta(String nom) throws ExepcioArrayBuit, ExepcioApostaInexistent{

        try{
            
            gApostes.eliminarAposta(nom);
            return "Aposta eliminada correctament.";
            
        }catch(ExepcioApostaInexistent e)
        {
            return "Aquesta persona no te cap aposta registrada.";
        }
    }
}
