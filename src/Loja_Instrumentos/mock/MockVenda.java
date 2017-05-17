package Loja_Instrumentos.mock;

import Loja_Instrumentos.model.venda.ItemProduto;
import Loja_Instrumentos.model.venda.ProdutoVenda;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//Mock de Reserva. Realiza operações de mock com o reserva
public class MockVenda {

    private static int totalVendas = 0;
    /**
     * Armazena a lista de reservas inseridas para manipulação. #MOCK *
     */
    private static List<ProdutoVenda> listaVendas = new ArrayList<ProdutoVenda>();

    //Insere uma reserva no mock "listaReservas"
    public static void inserirVenda(ProdutoVenda venda)
            throws Exception {
        //Atribui um ID automático para as reservas (sequencial)
        venda.setId(totalVendas++);

        //Atribui um id automático para os itens de reserva desta reserva
        //(sequencial)
        int seqVenda = 0;
        for (ItemProduto produto : venda.getListaItem()) {
            produto.setId(seqVenda++);
        }

        //Adiciona a reserva no mock
        listaVendas.add(venda);
    }
}
