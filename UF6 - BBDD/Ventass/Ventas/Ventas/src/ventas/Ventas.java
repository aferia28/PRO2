/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author jserrano
 */
public class Ventas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection conn;
        conn = ConexionDB.GetConnection();

        if (conn != null) {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
        //Ventas bd = new Ventas();
        float precio_venta = 0;
        try {
            precio_venta = recuperarPrecioVenta(1,conn);
            if (precio_venta > 0) {
                System.out.println(precio_venta);
            } else {
                System.out.println("No s'ha trobat l'adreça buscada");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static float recuperarPrecioVenta(Integer preu,Connection conn) throws Exception {
        float precio=0;

        try {
            Statement st = conn.createStatement();
            /*MySQL*/       //String consulta = "Select * from persones where nom = \"" + nom + "\";    ";
/*TOTS */ String consulta = "Select * from tproducto where codProducto = '" + preu + "';"; /*TOTS=MySQL+Access+SQLServer*/
            ResultSet rs = st.executeQuery(consulta);
            if (rs.next()) {
                //String nom2 = rs.getString("nom");
                //String adr = rs.getString("adressa");
                //String telefon = rs.getString("telefon");
                //byte edat = rs.getByte("edat");
                precio = rs.getFloat("precioCompra");

                //adressa = new Adressa(nom, adr, telefon, edat);
            }
            return precio;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("Error en la connexió amb la base de dades");
        }


    }
    /*public ArrayList<Adressa> recuperarAdreces(String nom) throws Exception
     {
     ArrayList<Adressa> adreces = new ArrayList<Adressa>();

     try
     {
     Statement st = conn.createStatement();
     /*MySQL*/       //String consulta = "SELECT * FROM persones WHERE nom LIKE \"%" + nom + "%\";";
/*TOTS */      /*String consulta = "SELECT * FROM persones WHERE nom LIKE \'%" + nom + "%\';";			
     ResultSet rs = st.executeQuery(consulta);
     while(rs.next())
     {
     String nom2 = rs.getString("nom");
     String adr = rs.getString("adressa");
     String telefon = rs.getString("telefon");
     byte edat = rs.getByte("edat");

     Adressa adressa = new Adressa(nom2, adr, telefon, edat);
     adreces.add(adressa);
     }
     }
     catch(SQLException e)
     {
     e.printStackTrace();
     throw new Exception("Error en la connexió amb la base de dades"); 
     }

     return adreces;
     }*/

}
