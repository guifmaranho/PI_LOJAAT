package Loja_Instrumentos.mock;

import Loja_Instrumentos.model.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;

//Mock de Cliente. Realiza operações de mock com o cliente. 
public class MockCliente {
    private int totalClientes = 0;
    /** Armazena a lista de clientes inseridos para manipulação. #MOCK **/    
    private List<Cliente> listaClientes = new ArrayList<Cliente>();
    
    //Insere um cliente no mock "listaClientes"
    public void inserir(Cliente cliente)
            throws Exception {
        cliente.setId(totalClientes++);
        listaClientes.add(cliente);
    }

    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public void atualizar(Cliente clienteProcura)
            throws Exception {
    /*   if (clienteProcura != null && clienteProcura.getId() != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getId() == clienteProcura.getId()) {
                    clienteLi.setGenero(clienteProcura.getGenero());
                    clienteLi.setDataNascimento(clienteProcura.getDataNascimento());
                    clienteLi.setNome(clienteProcura.getNome());
                    clienteLi.setSobrenome(clienteProcura.getSobrenome());
                    break;
                }
            }
        }
    }*/

    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
    public void excluir(Integer id) throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente clienteLi = listaClientes.get(i);
                if (clienteLi != null && clienteLi.getId() == id) {
                    listaClientes.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os clientes
    public List<Cliente> listar()
            throws Exception {       
        //Retorna a lista de clientes
        return listaClientes;
    }

    //Procura um cliente no mock, de acordo com o nome
    //passado como parâmetro
    public List<Cliente> procurar(String valor)
            throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if (valor != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getNome() != null) {
                    if (clienteLi.getNome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(clienteLi);
                    }
                }
            }
        }
        
        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um cliente da lista
    public Cliente obter(Integer id)
            throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getId() == id) {
                    return listaClientes.get(i);
                }                
            }
        }
        return null;
    }
}