package Loja_Instrumentos.model.validador.cliente;

import Loja_Instrumentos.exceptions.ClienteException;
import Loja_Instrumentos.model.clientes.Cliente;

//Validador de dados do cliente
public class ValidadorCliente {

    public void validar(Cliente cliente) throws ClienteException {
        //Realização de validações de negócio
        if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        if (Cliente.getNome() == null || "".equals(Cliente.getNome())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getCpfOuCnpj() == 0 || "".equals(Cliente.getCpfOuCnpj())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getEndereco() == null || "".equals(Cliente.getEndereco())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getNumeroEnd() == 0 || "".equals(Cliente.getNumeroEnd())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getBairro() == null || "".equals(Cliente.getBairro())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getComplemento() == null || "".equals(Cliente.getComplemento())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getCep() == 0 || "".equals(Cliente.getCep())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getTelefone() == 0 || "".equals(Cliente.getTelefone())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getTelefoneContato() == 0 || "".equals(Cliente.getTelefoneContato())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getCelular() == 0 || "".equals(Cliente.getCelular())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getCelular() == 0 || "".equals(Cliente.getCelular())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getCelularContato() == 0 || "".equals(Cliente.getCelularContato())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
        if (Cliente.getEmail() == null || "".equals(Cliente.getEmail())) {
            throw new ClienteException("É necessário informar um nome de cliente");
        }
    }
}
