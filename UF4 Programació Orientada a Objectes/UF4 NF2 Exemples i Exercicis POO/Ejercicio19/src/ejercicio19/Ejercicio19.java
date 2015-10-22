/*
Crear una classe Ordinador amb els següents atributs:
- Nom del PC.
- Velocitat del processador (en MHz).
- Capacitat de memòria (en MB).
- Capacitat del disc dur (en GB)
- Tamany de la pantalla (en polsades)
- Si porta lector de CD/DVD (sí o no)

Crear un constructor amb tots els paràmetres, els setters i getters respectius, així com les classes toString, equals 
(només es compararà el nom) i clone.

Crear una classe Principal, i al seu mètode main, crear 3 ordinadors diferents (amb dades indicades al programa) i un 
4art igual al primer. Mostrar les dades per pantalla (amb toString), comparar-los (amb equals) i clonar un ordinador 
(amb clone).
 */
package ejercicio19;
import java.util.Scanner;

/**
 *
 * @author adrianferialopez
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner dades = new Scanner(System.in);
        
        Ordinador pcs[] = new Ordinador[4];
        
        for(int i=0; i <= 2; i++)
        {
            pcs[i] = new Ordinador();
            
            System.out.println("Nom del PC: ");
            pcs[i].setNom(dades.next());
            System.out.println("Velocidat del processador: ");
            pcs[i].setVelpro(dades.nextDouble());
            System.out.println("Memoria RAM: ");
            pcs[i].setRam(dades.nextInt());
            System.out.println("Capacitat del HDD: ");
            pcs[i].setDiscoduro(dades.nextShort());
            System.out.println("Tamany de la Pantalla(Polzades): ");
            pcs[i].setPantalla(dades.nextDouble());
            System.out.println("DVD/CD: (true/false)");
            pcs[i].setDvd(dades.nextBoolean());
        }
        System.out.println("\n\n");
        pcs[3] = pcs[0].clone();
       
        System.out.println("\n-----------------------");
        
        for(int i = 0; i <= 2; i++)
        {
            
              System.out.println(pcs[i].toString());
              System.out.println("\n-----------------------");
//            System.out.println("PC" + (i+1) + ": " + pcs[i].getNom() + "\n");
//            System.out.println("Velocitat del processador" + ": " + pcs[i].getVelpro()+ "\n");
//            System.out.println("Memoria RAM" + ": " + pcs[i].getRam()+ "\n");
//            System.out.println("Capacitat del HDD" + ": " + pcs[i].getDiscoduro()+ "\n");
//            System.out.println("Pantalla" + ": " + pcs[i].getPantalla()+ "polzades" + "\n");
//            
//            if(pcs[i].isDvd() == true)
//            {
//                System.out.println("L'ordinador te DVD/CD");
//            }else{
//                System.out.println("L'ordinador no porta DVD/CD");
//            }
                 
        }
        
        comparar(pcs[0], "PC1", pcs[1], "PC2");
        
    }
    
    private static void comparar(Ordinador a, String nomA, Ordinador b, String nomB)
    {
        if(a.equals(b))
        {
            System.out.println(nomA + " i " + nomB + " són iguals (equals)");
        }else
        {
            System.out.println(nomA + " i " + nomB + " són diferents (equals)");
        }
    }
    
}
