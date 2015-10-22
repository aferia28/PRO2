/* =============================================================================
 * Aplicació:		ExempleExcepcions
 * Arxiu:			CharacterFormatException.java
 * Autor:			José Luis García Mañas
 * Data de creació:	28/10/2011
 * Descripció:		Conté la classe CharacterFormatException, utilitzada quan
 *					es produeix un error en llegir una cadena que no conté un
 *					únic caràcter
 * ========================================================================== */

// Paquet
package prova;

// Classe CharacterFormatException
public class CharacterFormatException extends Exception
{
	// Constructors
	public CharacterFormatException(){}
	public CharacterFormatException(String s){super(s);}
}
// =============================================================================