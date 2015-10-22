
package exercicipatrimoni;

/**
 * Conté la classe TipusMonument on es troben totes les dades d' un tipus de
 * monument com el seu id i el seu nom.
 * @author 
 */
public class TipusMonument
{
	//Atributs=================================================================
	/** Id identificatiu del tipus de monument. */
	private char id;
	/** Nom del tipus de monument. */
	private String nom;
	//=========================================================================
	/**
	 * Constructor parametritzat de la classe 
	 * @param id Id identificatiu del tipus de monument.
	 * @param nom Nom del tipus de monument.
	 */
	public TipusMonument(char id, String nom)
	{
		this.id = id;
		this.nom = nom;
	}
	//=========================================================================
	//Getters==================================================================
	/**
	 * Retorna el id del tipus de monument.
	 * @return char Id del tipus de monument.
	 */
	public char getId()
	{
		return this.id;
	}
	/**
	 * Retorna el nom del tipus de monument.
	 * @return String Nom del tipus de monument.
	 */
	public String getNom()
	{
		return this.nom;
	}
	//=========================================================================
	//Setters=================================================================
	/**
	 * Estableix el id del tipus de monument.
	 * @param id Id del tipus de monument.
	 */
	public void setId(char id)
	{
		this.id = id;
	}
	/**
	 * Estableix el nom del tipus de monument.
	 * @param nom Nom del tipus de monument.
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	//=========================================================================
}