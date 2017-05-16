package Loja_Instrumentos.service.venda;

import Loja_Instrumentos.exceptions.DataSourceException;
import Loja_Instrumentos.exceptions.ReservaException;
import Loja_Instrumentos.mock.MockVenda;
import Loja_Instrumentos.model.produto.Instrumentos;
import Loja_Instrumentos.model.venda.ItemProduto;
import Loja_Instrumentos.model.venda.Produto;
import Loja_Instrumentos.model.validador.venda.ValidadorVenda;
import Loja_Instrumentos.service.produtos.ServicoProduto;
import java.util.Date;
import java.util.List;

//Classe de serviço de reserva
public class ServicoVenda {

    //Insere um reserva na fonte de dados
    public static void fazerReserva(Produto prod)
            throws ReservaException, DataSourceException {

        //Chama o validador para verificar o reserva
        ValidadorReserva.validar(prod);

        try {
            //Marca os quartos da reserva como alugados
            for (ItemReserva itemReserva : prod.getListaItemReserva()) {
                Quarto quartoAlugado = itemReserva.getQuartoAlugado();
                quartoAlugado.setSituacao("Alugado");
                ServicoQuarto.atualizarQuarto(quartoAlugado);
            }
            
            //Realiza a chamada de inserção na fonte de dados
            MockVenda.inserirReserva(prod);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    //Obtém a lista de reservas no período
    public static List<Reserva> listarReservaPeriodo(Date dataCheckin, Date dataCheckout)
            throws ReservaException, DataSourceException {

        try {           
            //Realiza a chamada de listagem na fonte de dados
            return MockVenda.listarReservasPeriodo(dataCheckin, dataCheckout);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
