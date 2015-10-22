
package exercicipatrimoni;

/**
 * Conté la classe Monument on es troben totes les dades d' un monument, com 
 * el seu id, el seu nom, la comunitat on es troba, el tipus de monument que es, 
 * l' any d'alta i el nom de la foto del monument.
 * @author 
 */
public class Monument
{
	//Atributs=================================================================
	/** Id identificatiu del monument. */
	private int id;
	/** Nom del monument. */
	private String nom;
	/** Any d'alta de quan es va inaugurar el monument. */
	private int anyAlta;
    /** Tipus de monument. */
	private TipusMonument tipus;
	/** Comunitat autònoma os es troba el monument. */
	private Comunitat comunitat;
	/** Nom de la foto del monument. */
	private String nomFoto;
	//=========================================================================
	/**
	 * Constructor parametritzat de la classe Monument.
	 * @param id Id identificatiu del monument.
	 * @param nom Nom del monument.
	 * @param anyAlta Any d'alta de quan es va inaugurar el monument.
     * @param tipus Tipus de monument.
	 * @param comunitat Comunitat autònoma os es troba el monument.
	 * @param nomFoto Nom de la foto del monument.
	 */
	public Monument(int id, String nom, int anyAlta, TipusMonument tipus, 
           Comunitat comunitat, String nomFoto)
	{
		this.id = id;
		this.nom = nom;
		this.anyAlta = anyAlta;
        this.tipus = tipus;
		this.comunitat = comunitat;
		this.nomFoto= nomFoto;
	}
	//=========================================================================
	//Getters==================================================================
	/**
	 * Retorna el id del monument.
	 * @return int Id del monument.
	 */
	public int getId()
	{
		return this.id;
	}
	/**
	 * Retorna el nom del monument.
	 * @return String Nom del monument.
	 */
	public String getNom()
	{
		return this.nom;
	}
	/**
	 * Retorna l' any d'alta de quan es va inaugurar el monument.
	 * @return int Any d'alta de quan es va inaugurar el monument.
	 */
	public int getAnyAlta()
	{
		return this.anyAlta;
	}
    /**
	 * Retorna el tipus de monument.
	 * @return TipusMonument Tipus de monument.
	 */
	public TipusMonument getTipus()
	{
		return this.tipus;
	}
	/**
	 * Retorna la comunitat autònoma os es troba el monument.
	 * @return Comunitat Comunitat autònoma os es troba el monument.
	 */
	public Comunitat getComunitat()
	{
		return this.comunitat;
	}
	/**
	 * Retorna el nom de la foto del monument.
	 * @return String Nom de la foto del monument.
	 */
	public String getNomFoto()
	{
		return this.nomFoto;
	}	
	//=========================================================================
	//Setters=================================================================
	/**
	 * Estableix el id del monument.
	 * @param id Id del monument.
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * Estableix el nom del monument.
	 * @param nom Nom del monument.
	 */
	public void setNom(String nom)
	{
		this.nom = nom;
	}
	/**
	 * Estableix l' any d'alta de quan es va inaugurar el monument.
	 * @param anyAlta Any d'alta de quan es va inaugurar el monument.
	 */
	public void setAnyAlta(int anyAlta)
	{
		this.anyAlta = anyAlta;
	}
    /**
	 * Estableix el tipus de monument.
	 * @param tipus Tipus de monument.
	 */
	public void setTipus(TipusMonument tipus)
	{
		this.tipus = tipus;
	}
	/**
	 * Estableix la comunitat autònoma os es troba el monument.
	 * @param comunitat Comunitat autònoma os es troba el monument.
	 */
	public void setComunitat(Comunitat comunitat)
	{
		this.comunitat = comunitat;
	}
	/**
	 * Estableix el nom de la foto del monument.
	 * @param nomFoto Nom de la foto del monument.
	 */
	public void setNomFoto(String nomFoto)
	{
		this.nomFoto = nomFoto;
	}
	//=========================================================================
}
