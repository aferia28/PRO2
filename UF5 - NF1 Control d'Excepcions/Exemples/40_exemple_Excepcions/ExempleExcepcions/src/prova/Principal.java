/* =============================================================================
 * Aplicació:		ExempleExcepcions
 * Arxiu:			Principal.java
 * Autor:			José Luis García Mañas
 * Data de creació:	28/10/2011
 * Descripció:		Conté la classe Principal, on hi ha un exemple d'utilització
 *					dels blocs try/catch
 * ========================================================================== */

// Paquet
package prova;

// Import
import java.io.IOException;

// Classe Principal
public class Principal
{
	// Mètode main
	public static void main(String[] args)
	{
		// Bloc try
		try
		{
			// Demanem un caràcter i el mostrem per pantalla
			System.out.println("Escriu un caràcter");
			char c = Teclat.llegirCaracter();
			System.out.println("El caràcter es: " + c);
		}
		// Blocs catch
		catch(IOException e)	// Excepció d'entrada/sortida
		{
			System.out.println("Error en la lectura del teclat");
		}
		catch(CharacterFormatException e)	// Excepció "no és un caràcter"
		{
			System.out.println("La dada llegida no és un caràcter");
		}
		catch(Exception e)	// Excepció genèrica
		{
			System.out.println(e.toString());
		}
	}
}
