package Loja_Instrumentos.model.validador.produto;

import Loja_Instrumentos.exceptions.InstrumentoException;
import Loja_Instrumentos.model.produto.Produto;

//Validador de Quarto
public class ValidadorProduto {

    public static void validar(Produto produto) throws InstrumentoException {
        //Realização de validações de negócio
        if (produto == null) {
            throw new InstrumentoException("Não foi informado um produto");
        }
        if (produto.getNome() == null) {
            throw new InstrumentoException("É necessário informar "
                    + "um nome do produto");
        }

        if (produto.getTipo() == null) {
            throw new InstrumentoException("É necessário informar "
                    + "o tipo de produto");
        }
        if (produto.getMarca() == null) {
            throw new InstrumentoException("É necessário informar "
                    + "a marca do produto");
        }

        if (produto.getPreco() == null) {
            throw new InstrumentoException("É necessário informar "
                    + "o preço do produto");
        }
        if (produto.getTipo() == null || "".equals(produto.getTipo())
                || (!produto.getTipo().equals("Cordas"))
                && !produto.getTipo().equals("Percursão")
                && !produto.getTipo().equals("Teclas")
                && !produto.getTipo().equals("Sopro")
                && !produto.getTipo().equals("Outros")) {
            throw new InstrumentoException("É necessário informar o "
                    + "tipo do produto");
        }

    }
}
