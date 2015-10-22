/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mitjatransport;
import java.util.ArrayList;
/**
 *
 * @author adrianferialopez
 */
public class Exercici34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Taxi taxi_barcelona = new Taxi(55, 2);
       
       Autobus bus_b30 = new Autobus(10, 2);
       
       Metro metro_l2 = new Metro(65, 4);
       
       ArrayList<MitjaTransport> mitjanstransport = new ArrayList();
       mitjanstransport.add(metro_l2);
       mitjanstransport.add(bus_b30);
       mitjanstransport.add(taxi_barcelona);
       
       for(int i = 0; i<mitjanstransport.size(); i++)
       {
           mitjanstransport.get(i).calcularPreu();
           mitjanstransport.get(i).calcularTemps();
       }
       
       mostrar("Metro L2", metro_l2.calcularPreu(), metro_l2.calcularTemps());
       System.out.println("-------------------------");
       mostrar("Autobus B30", bus_b30.calcularPreu(), bus_b30.calcularTemps());
       System.out.println("-------------------------");
       mostrar("Taxi Barcelona", taxi_barcelona.calcularPreu(), taxi_barcelona.calcularTemps());
       
    }
    
    public static void mostrar(String nomVehicle, float preu, float temps)
    {
        System.out.println("Nom del mitja de transport: " + nomVehicle + "\n" + "Preu total: " + preu + "€" + "\n" + "Temps empleat de viatge: " + temps + " minuts");
    }
}
