/*	============================================================================
 * Aplicació:		ExempleExcepcions
 * Arxiu:			Teclat.java
 * Autor:			José Luis García Mañas
 * Data de creació:	28/10/2011
 * Descripció:		Conté la classe Teclat, amb diversos mètodes que permeten
 *					recollir dades des del teclat.
 * ========================================================================== */

// Paquet
package prova;

// Import
import java.io.*;

// Classe
public class Teclat
{
    // Atributs
    private static final InputStreamReader isr = new InputStreamReader(System.in);
    private static final BufferedReader br = new BufferedReader(isr);

    // Mètodes
	
	/*
	 * Mètode:		llegirCadena
	 * Paràmetres:	cap
	 * Retorn:		String		La cadena llegida des del teclat
	 * Descripció:	Llegeix una cadena des del teclat i la retorna. Llença una
	 *				Llença una excepció del tipus IOException quan es produeix 
	 *				un error de lectura del teclat.
	 */
    public static String llegirCadena() throws IOException
    {
		// Declaració de variables
		String cadena = "";
		
		// Bloc try
		try
		{
			cadena = br.readLine();	// Llegim una cadena
		}
		// Bloc catch
		catch(IOException e)
		{
			throw new IOException("No s'ha pogut llegir la dada des del teclat");
		}
		
		return cadena;
    }    

	/*
	 * Mètode:		llegirCaracter
	 * Paràmetres:	cap
	 * Retorn:		char		La cadena llegida des del teclat
	 * Descripció:	Llegeix un caràcter des del teclat i la retorna.
	 *				Llença una excepció del tipus IOException quan es produeix 
	 *				un error de lectura del teclat.
	 *				Llença una excepció del tipus CharacterFormatException quan
	 *				el que es llegeix és una cadena de més d'un caràcter.
	 */
    public static char llegirCaracter() throws CharacterFormatException, 
											   IOException
    {
		// Declaració de variables
		String s = "";
		
		// Bloc try
		try
		{
			// Llegim un text des del teclat
			s = llegirCadena();
			
			// Comprovem que el text llegit és un caràcter
			if(s.length() != 1)
			{
				throw new CharacterFormatException("El text llegit no és un " +
						"caràcter");
			}
		}
		catch(IOException e)
		{
			throw e;
		}
		
		// Retornem el caràcter llegit
		return s.charAt(0);
	}
}
// =============================================================================