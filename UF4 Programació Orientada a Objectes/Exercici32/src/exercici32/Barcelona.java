/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercici32;
import java.util.ArrayList;
/**
 *
 * @author adrianferialopez
 */
public class Barcelona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Hospital hospi_vilafranca = new Hospital("Hospital de Vilafranca", 2, 1950, 26);
        Hospital hospi_general = new Hospital("Hospital General de Catalunya", 10, 25350, 315);
        
        Cinema cine_monte = new Cinema("Cinema Montecarlo", 1, 3180);
        Cinema cine_principal = new Cinema("Cinema Principal", 2, 12450);
        
        Hotel hotel_hilton = new Hotel("Hotel Hilton", 22, 73858, 583); //Nom, numero de plantes, superficie y habitacions.
        Hotel hotel_pepita = new Hotel("Hotel Pepita", 3, 593, 12);
        
        ArrayList<Edifici> edificios = new ArrayList(); //Creamos una Arraylist y añadimos todos los edificios.
        edificios.add(hospi_vilafranca);
        edificios.add(hospi_general);
        edificios.add(cine_monte);
        edificios.add(cine_principal);
        edificios.add(hotel_hilton);
        edificios.add(hotel_pepita);
        
        
        hospi_general.repartidDinar(); //Estos métodos los ejecutamos aquí porque es único de cada edificio.
        
       
        hospi_vilafranca.repartidDinar();
        
        
        cine_monte.projectarSessio(20, 7); //le pasamos el numero de asistentes y el precio de la entrada.
        
        
        cine_principal.projectarSessio(45, 7);
        
        
        hotel_hilton.calcularCostNateja();
        
        
        hotel_pepita.calcularCostNateja();

        
        for(int i =0; i<edificios.size(); i++)
        {
            edificios.get(i).calcularCostVigilancia(); //Estos métodos son comunes en todos los edificios, con lo cual los podemos ejecutar con un for.
            edificios.get(i).limpiar();
        }
        
        
    }
    
}
