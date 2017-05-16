package Loja_Instrumentos.model.venda;

import Loja_Instrumentos.model.clientes.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//Classe de negócio de reserva
public class Produto {
    //Atributos de negócio
    private Integer id;
    private Cliente cliente;
    private Date dataCheckin;
    private Date dataCheckout;
    private Double valorTotal;
    private List<ItemProduto> listaItemReserva = new ArrayList<ItemProduto>();

    //Métodos de acesso
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDataCheckin() {
        return dataCheckin;
    }

    public void setDataCheckin(Date dataCheckin) {
        this.dataCheckin = dataCheckin;
    }

    public Date getDataCheckout() {
        return dataCheckout;
    }

    public void setDataCheckout(Date dataCheckout) {
        this.dataCheckout = dataCheckout;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemProduto> getListaItemReserva() {
        return listaItemReserva;
    }

    public void setListaItemReserva(List<ItemProduto> listaItemReserva) {
        this.listaItemReserva = listaItemReserva;
    }

    
}
