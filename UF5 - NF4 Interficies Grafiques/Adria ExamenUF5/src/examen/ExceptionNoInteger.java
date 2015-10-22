/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author adrianferialopez
 */
public class ExceptionNoInteger extends NumberFormatException {

    public ExceptionNoInteger() {
    }

    public ExceptionNoInteger(String message) {
        super(message);
    }
}
