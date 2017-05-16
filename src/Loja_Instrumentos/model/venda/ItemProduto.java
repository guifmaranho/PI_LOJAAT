package Loja_Instrumentos.model.venda;

import Loja_Instrumentos.model.quartos.Quarto;

//Classe de negócio de itens de reserva (quarto + quantidade de pessoas)
public class ItemProduto {
    //Atributos de negócio
    private Integer id;
    private Quarto quartoAlugado;
    private Integer quantidadePessoas;

    //Métodos de acesso
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Quarto getQuartoAlugado() {
        return quartoAlugado;
    }

    public void setQuartoAlugado(Quarto quartoAlugado) {
        this.quartoAlugado = quartoAlugado;
    }

    public Integer getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(Integer quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }   
}
