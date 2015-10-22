/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escola;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import java.io.File;

/**
 *
 * @author adrianferialopez
 */
public class Escola {

        private static final String nomArxiu = "escola";

    public static void main(String[] args) {
        
		// Creem la base de dades
		ObjectContainer bd = Db4oEmbedded.openFile(nomArxiu);
		
		// Afegim les dades a la base de dades
		afegirDadesBD(bd);
		
		consultaAnimals(bd);
		consultaClassesAnimals(bd);
		consulta3(bd);	
		consulta4(bd);	
		consulta5(bd);	
		consulta6(bd);	
		consulta7(bd);	
		consulta8(bd);	
		consulta9(bd);	
		// Tanquem la base de dades
		bd.close();
		
		// Eliminem la base de dades per evitar repeticions en la següent execució
		File f = new File(nomArxiu);
		f.delete();        
    }
    
}
