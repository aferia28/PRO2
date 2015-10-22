
package exercicipatrimoni;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Conté la classe BaseDades que s' encarrega de entrar a la base de dades de 
 * SQL i recuperar, modificar o eliminar les seves dades.
 * @author 
 */
public class BaseDades
{
	/** Atribut que serveix de connector per a la BD. */
	private Connection conn;	
	//=========================================================================	
	/**
	 * Constructor parametritzat de la clase BaseDades. s'encarrega 
	 * d' inicicialitzar la classe i fer possible la connexió amb la BD.
	 * @throws ClassNotFoundException Excepció de classe no trobada.
	 * @throws InstantiationException Excepció d'instanciació.
	 * @throws IllegalAccessException Excepció d' accès il·legal.
	 * @throws SQLException Excepció SQL.
	 */
	public BaseDades() throws ClassNotFoundException, InstantiationException, 
           IllegalAccessException, SQLException
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String url = "jdbc:mysql://localhost:8889/patrimoni";
			String nomUsuari = "root";
			String password = "root";
			conn = DriverManager.getConnection(url, nomUsuari, password);
		}
		catch(ClassNotFoundException e)
		{
			throw new ClassNotFoundException("Classe no trobada");
		}
		catch(InstantiationException e)
		{
			throw new InstantiationException("Instanciacio no realitzada");
		}
		catch(IllegalAccessException e)
		{
			throw new IllegalAccessException("Accés il·legal");
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'ha pogut connectar amb la "
                                   + "base de dades");
		}
	}
	//=========================================================================		
	/**
	 * Mètode que s' encarrega de recuperar tots els registres de la taula
	 * monuments i els enmagatzema en un arraylist de monuments.
	 * @return ArrayList<Monument> ArrayList amb els monument.
	 * @throws SQLException Excepció SQL.
	 */
	public ArrayList<Monument> recuperarMonuments() throws SQLException
	{
		ArrayList<Monument> monuments = new ArrayList<>();

		try
		{
			Statement st = conn.createStatement();
			
			String consulta = "SELECT * FROM monuments;";
			ResultSet rs = st.executeQuery(consulta);
			while(rs.next())
			{
				int idMonument       = rs.getInt("id_monument");
				String nomMonument   = rs.getString("nom_monument");
				int anyAlta          = rs.getInt("any_alta");
				char idTipus	     = rs.getString("id_tipus").charAt(0);
				int idComunitat      = rs.getInt("id_comunitat");
				String nomFoto	     = rs.getString("nom_foto");			               
                
				String nomComunitat = recuperarComunitat(idComunitat).getNom();
				Comunitat comunitat = new Comunitat(idComunitat, nomComunitat);
				String nomTipus = recuperarTipus(idTipus).getNom();
                TipusMonument tipus = new TipusMonument(idTipus, nomTipus);
				
				Monument monument = new Monument(idMonument, nomMonument, 
                                            anyAlta, tipus, comunitat, nomFoto);
				monuments.add(monument);
			}
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'han pogut recuperar els monuments " +
					               "de la taula monuments.");
		}

		return monuments;
	}
    //=========================================================================	
	/**
	 * Mètode que s' encarrega de recuperar tots els registres de la taula
	 * comunitats i els enmagatzema en un arraylist de comunitats.
	 * @return ArrayList<Comunitat> ArrayList amb les comunitats.
	 * @throws SQLException Excepció SQL.
	 */
	public ArrayList<Comunitat> recuperarComunitats() throws SQLException
	{
		ArrayList<Comunitat> comunitats = new ArrayList<>();

		try
		{
			Statement st = conn.createStatement();
			
			String consulta = "SELECT * FROM comunitats;";
			ResultSet rs = st.executeQuery(consulta);
			
			while(rs.next())
			{
				int idComunitat      = rs.getInt("id_comunitat");
				String nom           = rs.getString("nom_comunitat");
				
				Comunitat comunitat = new Comunitat(idComunitat, nom);
                comunitats.add(comunitat);
			}
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'han pogut recuperar les comunitats " +
					               "de la taula comunitats.");
		}

		return comunitats;
	}
	//=========================================================================	
	/**
	 * Mètode que s' encarrega de recuperar una comunitat de la taula comunitats
	 * de la BD enviant com a paràmetre el id de la comunitat.
	 * @param id Id identificatiu de la comunitat.
	 * @return Comunitat Comunitat amb l' id corresponent.
	 * @throws SQLException Excepcio SQL.
	 */
	public Comunitat recuperarComunitat(int id) throws SQLException
	{
		Comunitat comunitat = null;

		try
		{
			Statement st = conn.createStatement();
			
			String consulta = "SELECT * FROM comunitats WHERE id_comunitat = " 
                              + id + ";";
			ResultSet rs = st.executeQuery(consulta);
			
			if(rs.next())
			{
				int idComunitat      = rs.getInt("id_comunitat");
				String nom           = rs.getString("nom_comunitat");
				
				comunitat = new Comunitat(id, nom);
			}
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'ha pogut recuperar la comunitat " +
					               "de la taula comunitats.");
		}

		return comunitat;
	}
    //=========================================================================	
	/**
	 * Mètode que s' encarrega de recuperar tots els registres de la taula
	 * tipus i els enmagatzema en un arraylist de TipusMonument.
	 * @return ArrayList<TipusMonument> ArrayList amb els tipus de monument.
	 * @throws SQLException Excepció SQL.
	 */
	public ArrayList<TipusMonument> recuperarTipus() throws SQLException
	{
		ArrayList<TipusMonument> tipusMonuments = new ArrayList<>();

		try
		{
			Statement st = conn.createStatement();
			
			String consulta = "SELECT * FROM tipus;";
			ResultSet rs = st.executeQuery(consulta);
			
			while(rs.next())
			{
				char id	             = rs.getString("id_tipus").charAt(0);
				String nomTipus      = rs.getString("nom_tipus");
				
				TipusMonument tipus = new TipusMonument(id, nomTipus);
                tipusMonuments.add(tipus);
			}
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'ha pogut recuperar el tipus de "
                                   + "monument de la taula tipus.");
		}

		return tipusMonuments;
	}
	//=========================================================================	
	/**
	 * Mètode que s' encarrega de recuperar un tipus de monument de la taula 
     * tipus de la BD enviant com a paràmetre el id del tipus que es vol 
     * recuperar.
	 * @param idTipus Id del tipus que es vol recuperar.
	 * @return TipusMonument Tipus de monument amd l'ID pertinent.
	 * @throws SQLException Excepcio SQL.
	 */
	public TipusMonument recuperarTipus(char idTipus) throws SQLException
	{
		TipusMonument tipus = null;

		try
		{
			Statement st = conn.createStatement();
			
			String consulta = "SELECT * FROM tipus WHERE id_tipus =\'"
                              + idTipus +"\';";
			ResultSet rs = st.executeQuery(consulta);
			
			if(rs.next())
			{
				char id	             = rs.getString("id_tipus").charAt(0);
				String nomTipus      = rs.getString("nom_tipus");
				
				tipus = new TipusMonument(id, nomTipus);
			}
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'ha pogut recuperar el tipus de "
                                   + "monument de la taula tipus.");
		}

		return tipus;
	}
	//=========================================================================	
	/**
	 * Mètode que s' encarrega d' insertar un monument a la taula monuments de 
	 * la BD enviant-li com a paràmetre el monument que es vol insertar.
	 * @param monument Monument que es vol insertar a la BD.
	 * @throws SQLException Excepció SQL.
	 */
	public void insertarMonument(Monument monument) throws SQLException
	{
		try
		{
			Statement st = conn.createStatement();

            String nomMonument = monument.getNom();
            int anyAlta = monument.getAnyAlta();
            char idTipus = monument.getTipus().getId();
            int idComunitat = monument.getComunitat().getId();
            String nomFoto = monument.getNomFoto();         
            
			String consulta = "INSERT INTO monuments (nom_monument, any_alta, "
                              + "id_tipus, id_comunitat, nom_foto) VALUES"
					          + "(\"" + nomMonument + "\", " + anyAlta + ", \'" 
                              + idTipus + "\', "+ idComunitat + ", \"" 
                              + nomFoto + "\");";
			st.executeUpdate(consulta);
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'ha pogut insertar el monument en " +
					               "la base de dades.");
		}		
	}
	//=========================================================================	
	/**
	 * Mètode que s' encarrega d' eliminar un monument donat per paràmetre de la 
	 * taula monuments de la BD.
	 * @param monument Monument que es vol eliminar de la BD.
	 * @return int Nùmero de resultats que ha donat la consulta.
	 * @throws SQLException  Excepció SQL.
	 */
	public int eliminarMonument(Monument monument) throws SQLException
	{
		int monumentsEliminats = 0;
		
		try
		{
			Statement st = conn.createStatement();
			
			String consulta = "DELETE FROM monuments WHERE id_monument = " 
							  + monument.getId() + ";";
			
			monumentsEliminats = st.executeUpdate(consulta);
		}
		catch(SQLException e)
		{
			throw new SQLException("No s'ha pogut eliminar el monument en " +
								   "la base de dades");
		}
		
		return monumentsEliminats;
	}
	//=========================================================================
}
