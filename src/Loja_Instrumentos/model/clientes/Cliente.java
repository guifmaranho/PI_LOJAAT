package Loja_Instrumentos.model.clientes;

import java.util.Date;

//Classe de negócio de cliente
public class Cliente {
    // Atributos
    private int id;
    private Date dataDeCadastro;
    private String nome;
    private int cspfOuCnpj;
    private String endereco;
    private int numeroEnd;
    private String bairro;
    private String complemento;
    private int cep;
    // contato
    private int telefone;
    private int telefoneContato;
    private int Celular;
    private int CelularContato;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(int cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroEnd() {
        return numeroEnd;
    }

    public void setNumeroEnd(int numeroEnd) {
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

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(int telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public int getCelularContato() {
        return CelularContato;
    }

    public void setCelularContato(int CelularContato) {
        this.CelularContato = CelularContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


/*testestestelkajsdhfkjashdfkljlh
aksjdfhalksjdfh
asdkjfh
aklsjdhf
teste
*/