package Loja_Instrumentos.model.clientes;

import java.util.Date;

//Classe de negócio de cliente
public class Cliente {
    // Atributos
    private Integer id;
    private Date dataDeCadastro;
    private String nome;
    private Integer cpfOuCnpj;
    private Date nascimento;
    private String genero;
    private String estadoCivil;
    private String endereco;
    private Integer numeroEnd;
    private String bairro;
    private String complemento;
    private Integer cep;
    private Integer telefone;
    private Integer Celular;
    private String Email;

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataDeCadastro() {
        return dataDeCadastro;
    }

    public void setDataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(Integer cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumeroEnd() {
        return numeroEnd;
    }

    public void setNumeroEnd(Integer numeroEnd) {
        this.numeroEnd = numeroEnd;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getCelular() {
        return Celular;
    }

    public void setCelular(Integer Celular) {
        this.Celular = Celular;
    }

    
   
}
