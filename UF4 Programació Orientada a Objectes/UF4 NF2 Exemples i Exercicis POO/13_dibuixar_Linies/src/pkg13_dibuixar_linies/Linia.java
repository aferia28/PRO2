/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13_dibuixar_linies;

/**
 *
 * @author JMBoneu
 */
public class Linia {
    public Linia(int mida)
    {
      int compt;
      
      System.out.print("\t\t");
      for(compt=1; compt<=mida; compt++)
          System.out.print("*");
    }
}
