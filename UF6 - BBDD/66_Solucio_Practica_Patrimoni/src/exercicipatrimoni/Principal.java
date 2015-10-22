
package exercicipatrimoni;

import javax.swing.JOptionPane;

/**
 * Conté la classe Principal que conté el mètode main.
 * @author 
 */
public class Principal
{
	//=========================================================================
    /**
	 * Mètode main. Aquest es el primer mètode que s' iniciara al principi del 
	 * programa.
	 * @param args Arguments de la línia de comandament.
	 */
	public static void main(String[] args)
	{
        try 
        {
            BaseDades bd = new BaseDades();
            
            // Crea un nou objecte de la classe FinestraPrincipal
            FinestraPrincipal fp = new FinestraPrincipal(bd);
            fp.iniciar();
        } 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, 
										  e.toString(),
										  "Error!",
										  JOptionPane.ERROR_MESSAGE);
        }
        	
	}
    //=========================================================================
}