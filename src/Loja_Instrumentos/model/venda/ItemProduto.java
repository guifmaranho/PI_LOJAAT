package Loja_Instrumentos.model.venda;



//Classe de negócio de itens de reserva
public class ItemProduto {
    //Atributos de negócio
    private Integer id;
    private ProdutoVenda itemaVenda;
    private Integer quantidadeItens;

    //Métodos de acesso
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ProdutoVenda getItemaVenda() {
        return itemaVenda;
    }

    public void setItemaVenda(ProdutoVenda itemaVenda) {
        this.itemaVenda = itemaVenda;
    }

    public Integer getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(Integer quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }   
}
