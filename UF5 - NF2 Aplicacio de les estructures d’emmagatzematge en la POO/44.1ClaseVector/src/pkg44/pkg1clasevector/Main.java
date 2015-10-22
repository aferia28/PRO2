/*
Crear un programa que llegeixi un text i numero (classe) per teclat, i mostri un menú amb tots els mètodes de la classe 
Vector, per provar-los i comprovar el seu funcionament. Si fa falta demanar algún valor més demana'l.

Els mètodes de la classe Vector són: size, removeElement, removeElementAt, removeAllElements, elementAt, indexOf
 */
package pkg44.pkg1clasevector;

/**
 *
 * @author adrianferialopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op;
        
        System.out.println("Exercici practic Metodes classe VEctor");
        System.out.println("---------------------------------------\n");
        
        String texto = Teclado.leerString("Introdueix el text que será tractat");
        int num = Teclado.leerInt("Introdueix un numero: ");
        
        do{
            op = menu();
            switch(op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("ADEU!");
                    break;
            }
            
        }while(op!=0);
    }
    
    public static int menu(){

        System.out.println("Quin metode (Vector) vols utilitzar");
        System.out.println("--------------------------------------------\n");
        
        
        System.out.println("1. Metode size");
        System.out.println("2. Metode removeElement");
        System.out.println("3. Metode removeElementAt");
        System.out.println("4. Metode removeAllElements");
        System.out.println("5. Metode elementAt");
        System.out.println("6. Metode indexOf");
        System.out.println("7. Sortir");
        
        int opcion = Teclado.leerInt("Opcio: \n");
        
        return opcion;        
    }
    
    public static void metodeSize(String texto){
        
        System.out.println("Aquest metode retorna el numero de element del text.");
        
        
    }
    
}
