package Loja_Instrumentos.exceptions;


//Indica uma exceção de reserva
public class ReservaException extends Exception {
    
    //Construtor de exceções que permite informar uma mensagem
    public ReservaException(String message) {
        super(message);
    }
}
