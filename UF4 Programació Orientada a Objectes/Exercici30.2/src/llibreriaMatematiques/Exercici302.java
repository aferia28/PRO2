/*
Crea un projecte amb el nom "projecteUtilitats". En aquest projecte, crea dos paquets amb la finalitat de classificar
les utilitats per funcionalitat.

En un paquet anomenat "llibreriaMatematiques", insereix dues classes que realitzaran operacions matemàtiques:

- Una classe anomenada "Divisors" que conté 2 mètodes:
  -- Un mètode que rep un número i visualitza tots els divisors positius que té aquest número enter.
  -- Un mètode que rep un úmero i comprova si el número és un número primer (només es divisible per si mateix i la
     unitat).

- Una classe anomenada "OperaBinaris" que té els següents mètodes:
  -- Un mètode que rep dos números i retorna la suma.
  -- Un mètode que rep dos números i retorna el producte.
  -- Un mètode que rep dos números i retorna el quocient de la divisió sencera.
  -- Un mètode que rep dos números i retorna el rest de la divisió sencera.
  -- Un mètode que rep un número i retorna el factorial del número. 

En un altre paquet anomenat "paquetLectura" tindràs la classe encarregada de l'entrada des de teclat, validada.
  -- afegeix un mètode al "paquetLectura" que rebi una cadena de caràcters a mostrar i validi una entrada del tipus (S/N)
     servirà per preguntes de l'estil:
                       Vols continuar (s/n)?
 */
package llibreriaMatematiques;
import paquetLectura.Teclat;
/**
 *
 * @author adrianferialopez
 */
public class Exercici302 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Divisors calcdivisor = new Divisors();
        OperaBinaris opera = new OperaBinaris();
        int opcio;
        int num1 = 0;
        int num2 = 0;
        
        do
        {
            opcio = opcionsMenu();
            switch(opcio)
            {   
                case 1:
                    int numero = Teclat.leerInt("Introdueix un numero: ");
                    calcdivisor.divisors(numero);
                    break;
                case 2:
                    int numero2 = Teclat.leerInt("Introdueix un numero: ");
                    calcdivisor.esPrimer(numero2);
                    break;
                case 3:
                    num1 = introduir();
                    num2 = introduir();
                    System.out.println("Resultat: " + opera.suma(num1, num2));
                    break;
                case 4:
                    num1 = introduir();
                    num2 = introduir();
                    System.out.println("Resultat: " + opera.producte(num1, num2));
                    break;
                case 5:
                    num1 = introduir();
                    num2 = introduir();
                    System.out.println("Resultat: " + opera.quocient(num1, num2));
                    break;
                case 6:
                    num1 = introduir();
                    num2 = introduir();
                    System.out.println("Resultat: " + opera.resto(num1, num2));
                    break;                    
                default:
                        System.out.println("ADEU!");
                    break;
            }
        }while(opcio != 0);        

    }
    
    	private static int opcionsMenu()
	{
		
		System.out.println("MENÚ PRINCIPAL\n");
		
		System.out.println("1. Mostrar els divisors de dos numeros");
		System.out.println("2. Comprobar si un numero es primer o no");
		System.out.println("3. Suma de dos numeros"); 
                System.out.println("4. Producte de dos numeros");
                System.out.println("5. Comprobar el quocient d'una divisio");
                System.out.println("6. Comrpobar el rest de la divisio entera");
                System.out.println("0. Sortir");
		
		int opcio = Teclat.leerInt("Opció:");
		
		return opcio;
	}    
        
        private static int introduir(){
            
             int num = Teclat.leerInt("Introdueix un numero:");
            
            return num;

        }
}
