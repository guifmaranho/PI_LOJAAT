package Loja_Instrumentos.model.validador.cliente;

import Loja_Instrumentos.exceptions.ClienteException;
import Loja_Instrumentos.model.clientes.Cliente;

//Validador de dados do cliente
public class ValidadorCliente {

    public static void validar(Cliente cliente) throws ClienteException {
        //Realização de validações de negócio
        if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("É necessário informar "
                    + "um nome de cliente");

        }

        if (cliente.getCpfOuCnpj() == null || "".equals(cliente.getCpfOuCnpj())) {
            throw new ClienteException("É necessário informar "
                    + "o CPF/CNPJ do cliente");

        }

        if (cliente.getNascimento() == null) {
            throw new ClienteException("É necessário informar um "
                    + "valor de idade válido");
        }
        if (cliente.getGenero() == null || "".equals(cliente.getGenero())
                || (!cliente.getGenero().equals("Masculino"))
                && !cliente.getGenero().equals("Feminino")) {
            throw new ClienteException("É necessário informar o "
                    + "gênero do cliente");
        }
        if (cliente.getEstadoCivil() == null || "".equals(cliente.getEstadoCivil())
                || (!cliente.getGenero().equals("Solteiro(a)"))
                && !cliente.getGenero().equals("Casado(a)")
                && !cliente.getGenero().equals("Viuvo(a)")
                && !cliente.getGenero().equals("Divorciado(a)")) {
            throw new ClienteException("É necessário informar o "
                    + "estado civil do cliente");
        }
        if (cliente.getCep() == null) {
            throw new ClienteException("Não foi informado o CEP do cliente");
        }
        if (cliente.getTelefone() == null) {
            throw new ClienteException("Não foi informado o contato do cliente");
        }
        if (cliente.getCelular() == null) {
            throw new ClienteException("Não foi informado o celular do cliente");
        }
        if (cliente.getEmail() == null) {
            throw new ClienteException("Não foi informado o email do cliente");
        }

    }
}
