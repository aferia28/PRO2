/*
Crear un programa que llegeixi una frase per teclat i mostri:
1. El número de paraules que té la frase
2. El número de caràcters que té la frase
3. La primera paraula de la frase
4. L'última paraula de la frase
5. La frase en majúscula
6. La frase en minúscula
 */
package pkg43.pkg3string;

import java.util.StringTokenizer;

/**
 *
 * @author adrianferialopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String texto = Teclado.leerString("Introdueix un text: ");
        
        int n_caracters = texto.length();
        System.out.println("La cadena introduida te " + n_caracters + " caracters.");
        
        
        StringTokenizer st = new StringTokenizer(texto);
        System.out.println("La cadena introduida te " + st.countTokens() + " paraules.");
        
        System.out.println("La primera paraula del text es: " + texto.substring(0, texto.indexOf(" ")) + "\n");
        //El primer parametre es on començara a printar la cadena. El segon(que es un metode) on terminara de printar. 
        //En aquest cas quan trobi un espai, ja que volem retorna només la primera paraula.
        //El indexOf retorna un integer de on es troba el primer espai. Que sera el numero que se li pasará com a segon parametre on haura de acabar de printar.
        
        System.out.println("La ultima paraula del text es: " + texto.substring(texto.lastIndexOf(" ")));
        //En aquest cas la substring que retornará començara a partir del parametre que li pasem. Que en aquest cas sera la posició de on es troba
        //el ultim espai. amb lo qual retornarà la ultima paraula.
        System.out.println("La frase en mayuscula: " + texto.toUpperCase());
        System.out.println("La frase en minusucla: " + texto.toLowerCase());
        
        
    }
    
}
