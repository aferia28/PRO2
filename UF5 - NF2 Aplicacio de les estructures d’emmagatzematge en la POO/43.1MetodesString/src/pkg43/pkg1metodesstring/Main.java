/*
Crear un programa que llegeixi un text per teclat, i mostri un menú amb tots els mètodes de la classe String,
per provar-los i comprovar el seu funcionament. Si fa falta demanar algún caràcter o cadena més demana'l.

Els mètodes de la classe String són: 
equals, equalsIgnoreCase, compareTo, length, toUpperCase, toLowerCase, charAt, indexOf, lastIndexOf, substring, 
endsWith, startsWith, valueOf, trim
 */
package pkg43.pkg1metodesstring;

/**
 *
 * @author adrianferialopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op;
        
        System.out.println("Exercici practic Metodes classe String");
        System.out.println("---------------------------------------\n");
        
        String texto = Teclado.leerString("Introdueix un text: ");
        
        do{
            op = menu();
            switch(op){
                case 1:
                    metodeLength(texto);
                    break;
                case 2:
                    equalsIgnore(texto);
                    break;
                case 3: 
                    metodeEquals(texto);
                    break;
                case 4:
                    metodeCompareTo(texto);
                    break;
                case 5:
                    metodeToUpperCase(texto);
                    break;
                case 6:
                    metodeToLowerCase(texto);
                    break;
                case 7:
                    metodeCharAt(texto);
                    break;
                case 8:
                    metodeIndexOf(texto);
                    break;
                case 9:
                    metodeLastIndexOf(texto);
                    break;
                case 10:
                    metodeSubstring(texto);
                    break;
                case 11:
                    metodeEndsWith(texto);
                    break;
                case 12:
                    metodeStartsWith(texto);
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 0:
                    System.out.println("ADEU!");
                    break;
            }
        }while(op != 0);
        
    }
    
    public static int menu(){
        /*
        equals, equalsIgnoreCase, compareTo, length, toUpperCase, toLowerCase, charAt, indexOf, lastIndexOf, substring, 
endsWith, startsWith, valueOf, trim
        */
        System.out.println("Quin metode vols utilitzar amb aquest text: ");
        System.out.println("--------------------------------------------\n");
        
        
        System.out.println("1. Metode length");
        System.out.println("2. Metode equalsIgnoreCase");
        System.out.println("3. Metode equals");
        System.out.println("4. Metode compareTo");
        System.out.println("5. Metode toUpperCase");
        System.out.println("6. Metode toLowerCase");
        System.out.println("7. Metode charAt");
        System.out.println("8. Metode indexOf");
        System.out.println("9. Metode lastIndexOf");
        System.out.println("10. Metode subString");
        System.out.println("11. Metode endsWith");
        System.out.println("12. Metode startsWitdh");
        System.out.println("13. Metode valueOf");
        System.out.println("14. Metode trim");
        System.out.println("0. Sortir");
        
        int opcio = Teclado.leerInt("Opcio: \n");
        
        return opcio;
    }
    
    public static void metodeLength(String texto){
        
        System.out.println("El metode lenght() retorna el numero de caracters que te el text.\n");
        
        int n_caracters = texto.length();
        
        System.out.println("El text te " + n_caracters + "caracters.\n");
    }
    
    public static void equalsIgnore(String texto){
        
        System.out.println("El metode equalsIgnoreCase compara dues cadenes sense tenir en compte maiuscules o minuscules.\n");
        
        String textoNuevo = Teclado.leerString("Introdueix el text a comparar: ");
        
        boolean iguales = texto.equalsIgnoreCase(textoNuevo);
        
        if(iguales == true){
            System.out.println("Els dos textos son iguals.");
        }else
        {
            System.out.println("Els textos son diferents.\n");
        }
    }
    
    public static void metodeEquals(String texto){
        
        System.out.println("El metode equals() compara dues cadenes tenint en compte maiuscules i minuscules\n");
        
        String nuevoTexto = Teclado.leerString("Introdueix el text a comparar: ");
        
        boolean iguales = texto.equals(nuevoTexto);
        
        if(iguales == true){
            System.out.println("Els dos textos son iguals.");
        }else{
            System.out.println("Els textos son diferents.\n");
        }
        
    }
    
    public static void metodeCompareTo(String texto){
        
        System.out.println("El metode compareTo retornara una valor enter. Manor que 0 si la cadena argument es lexicográficament major que "
                + "la cadena a comparar, 0 si son iguals, i major que 0 si es menor\n");
        
        String textoNuevo = Teclado.leerString("Introdueix el text a comparar: ");
        int resultado = texto.compareTo(textoNuevo);
        
        if(resultado < 0){
            System.out.println("El primer text es major que el segon..\n");
        }else if(resultado > 0){
            System.out.println("El segon text es major que el primer..\n");
        }else if(resultado == 0){
            System.out.println("Els textos son iguals.\n");
        }
    }
    
    public static void metodeToUpperCase(String texto){
        
        System.out.println("Aquest metode retorna la cadena en maiuscules.\n");
        String textoNuevo = texto.toUpperCase();
        System.out.println(textoNuevo);
        System.out.println("\n");
    }
    
    public static void metodeToLowerCase(String texto){
        
        System.out.println("Aquest metode retorna la cadena en minuscules.\n");
        String textoNuevo = texto.toLowerCase();
        System.out.println(textoNuevo);
        System.out.println("\n");
    }
    
    public static void metodeCharAt(String texto){
        
        System.out.println("Aquest metode retorna el caracter que ocupi la posicio que li pasem per parametre\n");
        
        int index = Teclado.leerInt("Posicio: ");
        char c = texto.charAt(index);
        
        System.out.println("A la posicio " + index + " tenim el seguent caracter: " + c + "\n");
    }
    
    public static void metodeIndexOf(String texto){
        
        System.out.println("Aquest metode retornarà la posició mediant un integer on es trobi el primer caracter que li hem pasat com a parametre.\n");
        
        char c = Teclado.leerChar("Caracter a buscar: ");
        int ind = texto.indexOf(c);
        
        System.out.println("El caracter que has introduit, esta a la posició " + ind + ".\n");
    }
    
    public static void metodeLastIndexOf(String texto){
        
        System.out.println("Aquest metode retornarà la posició mediant un integer on es trobi la ultima ocurrencia del caracter que li hem pasat com a parametre.\n");
        
        char c = Teclado.leerChar("Caracter a buscar: ");
        int ind = texto.lastIndexOf(c);
        
        System.out.println("La ultima ocurrencia del caracter introduit es troba a la posició " + ind + ". \n");
    }
    
    public static void metodeSubstring(String texto){
        
        System.out.println("Aquest metode retorna una String. Aquesta string anirà desde el parametre que li hem pasar (int), fins al final de la primera cadena.\n");
        System.out.println("També podem pasar-li 2 parametres que delimitaran la string que retornarà el metode.\n");
        
        System.out.println("Substring() amb 1 parametre.");
        int ind = Teclado.leerInt("Introdueix la posicio des de on vulguis que retorni la String.");
        String nova_String = texto.substring(ind);
        System.out.println(nova_String + "\n");
        
        System.out.println("Substring amb 2 parametres.");
        int ind1 = Teclado.leerInt("Introdueix el numero desde on començara la substring.");
        int ind2 = Teclado.leerInt("A on acabara la nova String:");
        
        String nova_String2 = texto.substring(ind1, ind2);
        System.out.println(nova_String2 + "\n");
        
    }
    
    public static void metodeEndsWith(String texto){
        
        System.out.println("Aquest metode retoranrà true si la cadena que li pasem per parametre al metode esta en la cadena on utilitzarem el"
                + "metode. Retornarà false si no hi es.");
        
        String texto2 = Teclado.leerString("Introdueix el text que vols utilitzar amb el metode: ");
        boolean endswith = texto.endsWith(texto2);
        
        System.out.println("Retorna: " + endswith + "\n");
    } 
    
    public static void metodeStartsWith(String texto){
        
        System.out.println("Este método tiene dos variantes, así como las pruebas de si una cadena comienza con el prefijo"
                + " especificado comenzar un índice especificado o por defecto al principio.");
        
        String texto2 = Teclado.leerString("Introdueix la cadena que vols utilitzar amb el metode: \n");
        int index = Teclado.leerInt("On vols saber si comença la cadena: ");
        
        boolean startswith = texto.startsWith(texto2, index);
        
        System.out.println("Retorna: " + startswith + "\n");
    }
    
}
