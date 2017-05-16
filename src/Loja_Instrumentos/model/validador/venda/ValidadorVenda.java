package Loja_Instrumentos.model.validador.venda;

import Loja_Instrumentos.exceptions.ReservaException;
import Loja_Instrumentos.model.reserva.ItemReserva;
import Loja_Instrumentos.model.reserva.Reserva;
import java.util.Calendar;
import java.util.Date;

//Validador de Reserva
public class ValidadorVenda {
    public static  void validar(Reserva reserva) throws ReservaException {
        //Realização de validações de negócio
        if (reserva == null) {
            throw new ReservaException("A reserva não é válida");
        }
        if (reserva.getCliente() == null) {
            throw new ReservaException("Um cliente não foi selecionado "
                + "nesta reserva");
        }
        if (reserva.getListaItemReserva() == null ||
            reserva.getListaItemReserva().isEmpty()) {
            throw new ReservaException("É preciso definir pelo menos um quarto "
                + "para reserva");
        }
        //Valida os itens da reserva
        for(ItemReserva itemReserva : reserva.getListaItemReserva()) {
            if (itemReserva == null || itemReserva.getQuartoAlugado() == null) {
                throw new ReservaException("Um quarto não foi corretamente "
                    + "associado a reserva");                
            }
            if (!itemReserva.getQuartoAlugado().getSituacao().equals("Vago")) {
                throw new ReservaException("O quarto " +
                    itemReserva.getQuartoAlugado().getNumero() + " do andar " +
                    itemReserva.getQuartoAlugado().getAndar() + " não está vago");
            }
            if (itemReserva.getQuantidadePessoas() == null) {
                throw new ReservaException("Não foi definida a quantidade de " +
                    "pessoas para o quarto " +
                    itemReserva.getQuartoAlugado().getNumero() + " do andar " +
                    itemReserva.getQuartoAlugado().getAndar());
            }
            if (itemReserva.getQuantidadePessoas() <= 0) {
                throw new ReservaException("A quantidade de " +
                    "pessoas não foi corretamente definida para o quarto " +
                    itemReserva.getQuartoAlugado().getNumero() + " do andar " +
                    itemReserva.getQuartoAlugado().getAndar());
            }            
            if (reserva.getDataCheckin()== null) {
                throw new ReservaException("A data de check-in precisa ser"
                    + "informada");
            }
            if (reserva.getDataCheckout()== null) {
                throw new ReservaException("A data de check-out precisa ser"
                    + " informada");
            }
            
            //Obtém a data atual em 00:00:00 (evita conflitos com horário)
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 0);  
            calendar.set(Calendar.MINUTE, 0);  
            calendar.set(Calendar.SECOND, 0);  
            calendar.set(Calendar.MILLISECOND, 0);
            Date hoje = calendar.getTime();
            
            if (reserva.getDataCheckin().before(hoje)) {
                throw new ReservaException("A data de check-in precisa ser"
                    + " maior ou igual a data de hoje");
            }
            if (reserva.getDataCheckout().before(hoje)) {
                throw new ReservaException("A data de check-out precisa ser"
                    + " maior ou igual a data de hoje");
            }        
            if (reserva.getDataCheckout().before(reserva.getDataCheckin())) {
                throw new ReservaException("A data de check-out precisa ser"
                    + " maior ou igual a data de check-in");
            }
            if (reserva.getValorTotal() == null) {
                throw new ReservaException("Um valor total precisa ser informado");
            }
            if (reserva.getValorTotal() <= 0) {
                throw new ReservaException("Um valor total maior que zero"
                    + "precisa ser informado");
            }
        }
    }
}