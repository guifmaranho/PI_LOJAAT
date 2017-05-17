package Loja_Instrumentos.model.venda;

import Loja_Instrumentos.model.clientes.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;



//Classe de negócio de reserva
public class ProdutoVenda {
    //Atributos de negócio
    private Integer id;
    private Cliente cliente;
    private Date dataCompra;
    private Double valorTotal;
    private List<ItemProduto> listaItem = new ArrayList<ItemProduto>();

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

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ItemProduto> getListaItem() {
        return listaItem;
    }

    public void setListaItem(List<ItemProduto> listaItem) {
        this.listaItem = listaItem;
    }

    
}
