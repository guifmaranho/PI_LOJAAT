/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja_Instrumentos.exceptions;

/**
 *
 * @author Fernando
 */
public class VendaException extends Exception {

    //Construtor de exceções que permite informar uma mensagem
    public VendaException(String message) {
        super(message);
    }
}
