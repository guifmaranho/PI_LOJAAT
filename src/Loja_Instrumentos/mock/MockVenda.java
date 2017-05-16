package Loja_Instrumentos.mock;

import Loja_Instrumentos.model.reserva.ItemReserva;
import Loja_Instrumentos.model.reserva.Reserva;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

//Mock de Reserva. Realiza operações de mock com o reserva
public class MockVenda {
    private static int totalReservas = 0;
    /** Armazena a lista de reservas inseridas para manipulação. #MOCK **/    
    private static List<Reserva> listaReservas = new ArrayList<Reserva>();

    //Insere uma reserva no mock "listaReservas"
    public static void inserirReserva(Reserva reserva)
            throws Exception {
        //Atribui um ID automático para as reservas (sequencial)
        reserva.setId(totalReservas++);
        
        //Atribui um id automático para os itens de reserva desta reserva
        //(sequencial)
        int seqIReserva = 0;
        for (ItemReserva ir : reserva.getListaItemReserva()) {
            ir.setId(seqIReserva++);
        }
        
        //Adiciona a reserva no mock
        listaReservas.add(reserva);
    }

    //Lista todos as reservas no período
    public static List<Reserva> listarReservasPeriodo(Date dataCheckin, Date dataCheckout)
            throws Exception {
        //Lista para armazenamento dos resultados e retorno
        List<Reserva> listaResultado = new ArrayList<Reserva>();
        
        //Configura as datas com o horário do começo e do fim do dia, a fim
        //de evitar conflitos com horário
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataCheckin);
        calendar.set(Calendar.HOUR_OF_DAY, 0);  
        calendar.set(Calendar.MINUTE, 0);  
        calendar.set(Calendar.SECOND, 0);  
        calendar.set(Calendar.MILLISECOND, 0);
        dataCheckin = calendar.getTime();
        calendar = Calendar.getInstance();
        calendar.setTime(dataCheckout);
        calendar.set(Calendar.HOUR_OF_DAY, 23);  
        calendar.set(Calendar.MINUTE, 59);  
        calendar.set(Calendar.SECOND, 59);  
        calendar.set(Calendar.MILLISECOND, 999);
        dataCheckout = calendar.getTime();
        
        //Itera as reservas e encontra reservas no período
        for (Reserva reserva : listaReservas) {
            if (dataCheckin.before(reserva.getDataCheckin()) &&
                    dataCheckout.after(reserva.getDataCheckout())) {
                listaResultado.add(reserva);
            }
        }
        
        //Retorna o resultado
        return listaResultado;
    }
}