package Loja_Instrumentos.model.validador.produto;

import Loja_Instrumentos.exceptions.QuartoException;
import Loja_Instrumentos.model.quartos.Quarto;

//Validador de Quarto
public class ValidadorProduto {
    public static  void validar(Quarto quarto) throws QuartoException {
        //Realização de validações de negócio
        if (quarto == null) {
            throw new QuartoException("Não foi informado um quarto");
        }
        if (quarto.getNumero() == null || quarto.getNumero() <= 0) {
            throw new QuartoException("O número do quarto precisa ser "
                + "um valor positivo e maior que zero.");
        }
        if (quarto.getAndar() == null || quarto.getAndar() <= 0) {
            throw new QuartoException("O número do andar precisa ser "
                + "um valor positivo e maior que zero.");
        }
        if (quarto.getTipo() == null || "".equals(quarto.getTipo())
                || (!quarto.getTipo().equals("Simples"))
                && !quarto.getTipo().equals("Luxo")) {
            throw new QuartoException("É necessário informar o "
                    + "tipo do quarto");
        }
        if (quarto.getSituacao()== null || "".equals(quarto.getSituacao())
                || (!quarto.getSituacao().equals("Vago"))
                && !quarto.getSituacao().equals("Alugado")) {
            throw new QuartoException("É necessário informar a "
                    + "situação do quarto");
        }
    }
}
