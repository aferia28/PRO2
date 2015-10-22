/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg39_excepcio_amb_finally;
import java.util.*;


/** Exemple EXCEPCIÓ amb finally
 *
 * @author JMBoneu
 */

public class Main
{
    public static void main(String[] args)
    {
        Random r = new Random();
        int num = 0;
        try
        {
            num = r.nextInt(4);
            int vector[] = {1, 2};
            if(vector[num] == 1)
            {
                System.out.println(vector[num]);
            } 
            else
            {
                System.out.println("Posició = " + num);
            }
        }
        catch(Exception e)
        {
            System.err.println("Excepció genèrica");
        } 
        finally
        {
            System.err.println("dins del finally. Num val : " + num);
        }
    }
}