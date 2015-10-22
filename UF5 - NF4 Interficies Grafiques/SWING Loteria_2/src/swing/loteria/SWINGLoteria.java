/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.loteria;

import java.util.ArrayList;

/**
 *
 * @author adrianferialopez
 */
public class SWINGLoteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExepcioArrayBuit, ExepcioApostaInexistent, ExepcioApostaExistent {
     
        ArrayList<Aposta> apostes = new ArrayList<>() ;
        
        Interfaz_loteria interfaz = new Interfaz_loteria();
        interfaz.setVisible(true);
        
//        apostes = GestioArxiu.leerFichero("apostes.txt");
//        if(!apostes.isEmpty())
//        {
//            AplicacioApostes app = new AplicacioApostes(apostes);
//            app.iniciar();
//            GestioArxiu.escribirArxiu("apostes.txt", apostes);
//        }
//        else
//            System.out.println("Ruta Incorrecte");
    }
    
}
