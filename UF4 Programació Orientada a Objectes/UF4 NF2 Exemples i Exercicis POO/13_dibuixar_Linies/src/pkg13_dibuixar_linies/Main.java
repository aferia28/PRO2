/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_dibuixar_linies;

/** EXEMPLE Constructor
 * 
 * Els constructors són uns mètodes especials que pot tenir una classe. Són especials
 * doncs són cridats automàticament cada vegada que s'instància un objecte d'aquella
 * classe, es a dir quan es fa un new.
 * 
 * El seu nom és el mateix que el de la classe i no pot retornar cap valor, ni tampoc
 * es pot especificar la paraula reservada void. Així un constructor té la següent 
 * capçalera:
 * 
 *    ambit_visibilitat nom_de_la_classe([possibles paràmetres])
 * 
 * La seva principal utilitat es donar valor inicial a les dades de l'objecte, quan 
 * es reserva memòria per aquest objecte.
 * 
 * Quan en una classe no hi ha un constructor, Java assumeix un per defecte que té 
 * aquesta capçalera:
 * 
 *   public nomClasse()
 * 
 * En aquest cas Java inicialitza els atributs.
 * 
 * Quan el programador defineix un constructor, el constructor per defecte que té
 * Java s'elimina i es substituit per/pels constructor/s definit/s pel programador.
 *
 * @author JMBoneu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Entrem en el programa");
        
        System.out.println("Declaro un objecte de tipus línia, valor 15");
        Linia obj1=new Linia(15); // constructor
        
        System.out.println("Declaro un altre objecte tipus línia, valor 8");
        Linia obj2=new Linia(8);
        
        System.out.println("Ha finalitzat el programa");
        
    }
}
