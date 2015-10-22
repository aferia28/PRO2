
package exercicipatrimoni;

/**
 * Conté la classe Monument on es troben totes les dades d' una comunitat, com 
 * el seu id i el seu nom.
 * @author 
 */
public class Comunitat
{
	//Atributs=================================================================
	/** Id identificatiu de la comunitat. */
	private int id;
	/** Nom de la comunitat. */
	private String nom;
	//=========================================================================
	/**
	 * Constructor parametritzat de la classe Comunitat.
	 * @param id Id identificatiu de la comunitat.
	 * @param nom Nom de la comunitat.
	 */
	public Comunitat(int id, String nom)
	{
		this.id = id;
		this.nom = nom;
	}
	//=========================================================================
	//Getters==================================================================
	/**
	 * Retorna el id de la comunitat.
	 * @return int Id de la comunitat.
	 */
	public int getId()
	{
		return this.id;
	}
	/**
	 * Retorna el nom de la comunitat.
	 * @return String Nom la comunitat.
	 */
	public String getNom()
	{
		return this.nom;
	}
	//=========================================================================
	//Setters=================================================================
	/**
	 * Estableix el id de la comunitat.
	 * @param id Id de la comunitat.
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * Estableix el nom de la comunitat.
	 * @param nom Nom de la comunitat.
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	//=========================================================================
}
