/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Paquet
package cine;

// Imports


/**
 * @author Carlos J. García Carmona
 * @author adrianferialopez
 */

public class Cine
{    
    // Atributs
    private byte files;
    private byte seients;  
    GestioButaques butaques;

    // Constructors
    public Cine() throws ExcepcioFilaIncorrecta, ExcepcioSeientIncorrecte
    {
        butaques = new GestioButaques();
        
        demanarDadesInicials();
    }
    
    // Getters
    public byte getFiles()
    {
        return files;
    }

    public byte getSeients()
    {
        return seients;
    }
    
    public void iniciar() throws ExcepcioButacaOcupada, ExcepcioButacaLliure
    {    
        byte opcio;
        
        do
        {
            opcio = menu();
            switch(opcio)
            {   
                case 1:
                    opcioMostrarButaques();
                    break;
                case 2:
                    opcioMostrarButaquesPersona();
                    break;
                case 3:
                    opcioReservarButaca();
                    break;
                case 4:
                    opcioAnularReserva();
                    break;
                case 5:
                    opcioAnularReservaPersona();
                    break;                   
                default:
                    System.err.println("Opció incorrecta");
                    break;
                case 0:
                    System.out.println("\nADÉU!\n");
                    break;
            }
        }while(opcio != 0);   
    }
    
    private static byte menu()
    {		
	System.out.println("\n\nMENÚ PRINCIPAL\n");	
	System.out.println("1. Mostrar totes les butaques reservades");
	System.out.println("2. Mostrar les butaques reservades per una persona");
	System.out.println("3. Reservar una butaca"); 
        System.out.println("4. Anular la reserva d'una butaca");
        System.out.println("5. Anular totes les reserves d'una persona");
        System.out.println("0. Sortir");
        System.out.println("\n");
        
        byte opcio = Teclado.leerByte("Opció: ");
	System.out.println("\n");
        
	return opcio;
    }
    
    private void demanarDadesInicials()
    {
        boolean error = false;
        
        do
        {
            try
            {
                byte filesDemanades = Teclado.leerByte("Primerament introdueix les files que té el cinema: ");

                if(filesDemanades < 1)
                {
                    error = true;
                    throw new ExcepcioFilaIncorrecta("El número de files no pot ser < 1.");
                }
                else
                {
                    files = filesDemanades;
                    error = false;
                }
            }
            catch(ExcepcioFilaIncorrecta excepcio)
            {
                System.err.println(excepcio.getMessage());
            }
        }
        while(error);
        
        do
        {
            try
            {
                byte seientsDemanats = Teclado.leerByte("OK! Ara introdueix quants seients té cada fila: ");

                if(seientsDemanats < 1)
                {
                    error = true;
                    throw new ExcepcioSeientIncorrecte("El número de seients per fila no pot ser < 1.");
                }
                else
                {
                    seients = seientsDemanats;
                    error = false;
                }
            }
            catch(ExcepcioSeientIncorrecte excepcio)
            {
                System.err.println(excepcio.getMessage());
            }
        }
        while(error);
        
        System.out.println("\n Files i seients establerts per al cinema.");
    }

    private String introduirPersona()
    {    
        boolean error = false;
        String nomPersona = "";
        
        do
        {
            try
            {
                nomPersona = Teclado.leerString("Introdueix el nom: ");
                
                if(!nomPersona.matches(".*\\d.*")) // Regex (Regular expression) qualsevol dígit a l'String
                {
                    error = false;
                }
                else
                {
                    throw new ExcepcioNomPersonaIncorrecte("El nom no pot contenir valors numèrics.");
                }
            }
            catch(ExcepcioNomPersonaIncorrecte excepcio)
            {
                System.err.println(excepcio.getMessage());
                error = true;
            }
        }
        while(error);
        
        return nomPersona;
    }

    private byte introduirFila()
    {    
        boolean error = false;
        byte numFila = 0;
                
        do
        {
            try
            {
                numFila = Teclado.leerByte("Introduiex la fila: ");
                
                if(numFila > 0 && numFila <= files)
                {
                    error = false;
                }
                else
                {
                    throw new ExcepcioFilaIncorrecta("Aquesta fila no existeix al cinema (1~" + files + ")");
                }
            }
            catch(ExcepcioFilaIncorrecta excepcio)
            {
                System.err.println(excepcio.getMessage());
                error = true;
            }
        }
        while(error);
        
        return numFila;
    }
    
    private byte introduirSeient()
    {
        boolean error = false;
        byte numSeient = 0;
        
        do
        {
            try
            {
                numSeient = Teclado.leerByte("Introdueix el seient: ");
                
                if(numSeient > 0 && numSeient <= seients)
                {
                    error = false;
                }
                else
                {
                    throw new ExcepcioSeientIncorrecte("Aquest seient no existeix a la fila (1-" + seients + ")");
                }
            }
            catch(ExcepcioSeientIncorrecte excepcio)
            {
                System.err.println(excepcio.getMessage());
                error = true;
            }
        }
        while(error);
        
        return numSeient;
    }
    
    private void opcioMostrarButaques()
    {    
        System.out.println("\n-------------------------------------");
        System.out.println("Butaques reservades: \n");
        
        // Recorre el vector i guarda per a cada posició un objecte Butaca i el mostra
        for(byte posicio = 0; posicio < butaques.getvButaques().size(); posicio++)
        {
            Butaca butaca = butaques.getvButaques().get(posicio);
            System.out.println(butaca.toString());
        }
        
        System.out.println("-------------------------------------");
    }
    
    private void opcioMostrarButaquesPersona()
    {    
        String nomPersonaReserva = introduirPersona();
        Boolean reservaTrobada = false;
        
        System.out.println("");
        
        for(byte posicio = 0; posicio < butaques.getvButaques().size(); posicio++)
        {
            Butaca butaca = butaques.getvButaques().get(posicio);
            
            // Aquest mètode 'equals' no és el de la classe Butaca, ja que aquest busca el nom de la reserva, i no la fila i el seient
            if(butaca.getPersona().equals(nomPersonaReserva))
            {
                System.out.println(butaca.toString());
                reservaTrobada = true;
            }
        }
        
        if(!reservaTrobada)
        {
            System.out.println("\nCap persona amb aquest nom ha reservat.");
        }
        
    }
    
    private void opcioReservarButaca() throws ExcepcioButacaOcupada
    {   
        byte numFilaReserva = introduirFila();
        byte numSeientReserva = introduirSeient();
        String nomPersonaReserva = introduirPersona();
        
        Butaca butaca = new Butaca(numFilaReserva, numSeientReserva, nomPersonaReserva);
        
        try
        {    
            butaques.afegirButaca(butaca);
            System.out.println("\nReserva realitzada!");
        }
        catch(ExcepcioButacaOcupada excepcio)
        {
            System.err.println(excepcio.getMessage());
        }
    }
    
    private void opcioAnularReserva()
    {
        byte numFila = introduirFila();
        byte numSeient = introduirSeient();
        
        try
        {
            butaques.eliminarButaca(numFila, numSeient);
            System.out.println("\nReserva anulada!");
        }
        catch(ExcepcioButacaLliure excepcio)
        {
            System.err.println(excepcio.getMessage());
        }
    }
    
    private void opcioAnularReservaPersona() throws ExcepcioButacaLliure
    {
        String nomPersona = introduirPersona();
        Boolean reservaTrobada = false;
        
        System.out.println();
        
        for(byte posicio = 0; posicio < butaques.getvButaques().size(); posicio++)
        {
            // Aquest mètode 'equals' no és el de la classe Butaca, ja que aquest busca el nom de la reserva, i no la fila i el seient
            if(butaques.getvButaques().get(posicio).getPersona().equals(nomPersona))
            {
                reservaTrobada = true;
                butaques.eliminarButaca(butaques.getvButaques().get(posicio).getFila(), butaques.getvButaques().get(posicio).getSeient());

                posicio--; // Per compensar el desplaçament en el vector quan s'elimina
            }    
        }
        
        if(!reservaTrobada)
        {
            System.err.println("\nCap persona amb aquest nom ha reservat.");
        }
    }
}
