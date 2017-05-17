package Loja_Instrumentos.model.validador.venda;

import Loja_Instrumentos.exceptions.VendaException;
import Loja_Instrumentos.model.venda.ItemProduto;
import Loja_Instrumentos.model.venda.ProdutoVenda;


//Validador de Reserva
public class ValidadorVenda {

    public static void validar(ProdutoVenda venda) throws VendaException {
        //Realização de validações de negócio
        if (venda == null) {
            throw new VendaException("A venda não é válida");
        }
        if (venda.getCliente() == null) {
            throw new VendaException("Um cliente não foi selecionado "
                    + "nesta venda");
        }
        if (venda.getListaItem() == null
                || venda.getListaItem().isEmpty()) {
            throw new VendaException("É preciso definir pelo menos um produto "
                    + "para a venda");
        }
        //Valida os itens da reserva
        for (ItemProduto itemproduto : venda.getListaItem()) {
            if (itemproduto == null || itemproduto.getItemaVenda() == null) {
                throw new VendaException("Um item não foi corretamente "
                        + "associado a venda");
            }

            if (itemproduto.getQuantidadeItens() == null) {
                throw new VendaException("Não foi definida a quantidade de "
                        + "itens para venda ");
            }
            if (itemproduto.getQuantidadeItens() <= 0) {
                throw new VendaException("A quantidade de "
                        + "itens não foi corretamente definida para o item "
                        + itemproduto.getItemaVenda().getId());
            }

        }

    }
}
