/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Paquet
package cine;

// Imports
import java.util.ArrayList;

/**
 * @author Carlos J. García Carmona
 * @author adrianferialopez
 */

public class GestioButaques
{    
    // Atributs
    private ArrayList<Butaca> vButaques;

    // Constructors
    public GestioButaques()
    {    
        vButaques = new ArrayList<>();
    }

    // Getters
    public ArrayList<Butaca> getvButaques()
    {
        return vButaques;
    }
    
    // Mètodes propis
    public byte buscarButaca(byte fila, byte seient)
    {
        // Es crea una butaca amb les dades a comparar
        Butaca butaca = new Butaca(fila, seient);

        // Recorre el vector posició a posició en busca de la butaca demanada
        for(byte posicio = 0; posicio < vButaques.size(); posicio++)
        {
            if(vButaques.get(posicio).equals(butaca))
            {
                return posicio; // Si la butaca existeix, retorna la seva posició al vector
            }
        }
        return -1; // La butaca no existeix al vector
    }
    
    public void afegirButaca(Butaca novaButaca) throws ExcepcioButacaOcupada
    {
        byte posicioButaca = buscarButaca(novaButaca.getFila(), novaButaca.getSeient());
        
        if(posicioButaca == -1) // La novaButaca encara no s'ha reservat
        {
            vButaques.add(novaButaca); // S'afegeix al vector de Butaques
        }
        else // S'ha retornat la posició de la butaca, per tant, ja estava reservada
        {
            throw new ExcepcioButacaOcupada("\nHo sentim, aquesta butaca ja ha estat reservada.");
        }
    }
    
    public void eliminarButaca(byte fila, byte seient) throws ExcepcioButacaLliure
    {
        byte posicioButaca = buscarButaca(fila, seient);
            
        // Si no s'ha trobat la butaca demanada...
        if(posicioButaca == -1)
        {
            throw new ExcepcioButacaLliure("\nAquesta butaca encara no ha estat reservada.");
        }
        else
        {
            System.out.println("Butaca anulada -> " + vButaques.get(posicioButaca).toString());
            vButaques.remove(posicioButaca);
        }
    }
}
