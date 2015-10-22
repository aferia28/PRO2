/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.loteria;

/**
 *
 * @author adrianferialopez
 */
public class ExepcioApostaInexistent extends Exception {
    
    ExepcioApostaInexistent(){};
    ExepcioApostaInexistent(String s){
        super(s);
    }
}
