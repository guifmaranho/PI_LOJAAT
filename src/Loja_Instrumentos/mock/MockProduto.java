package Loja_Instrumentos.mock;

import Loja_Instrumentos.model.produto.Produto;
import java.util.ArrayList;
import java.util.List;

//Mock de Quarto. Realiza operações de mock com o quarto
public class MockProduto {

    private static int totalProdutos = 0;
    /**
     * Armazena a lista de quartos inseridos para manipulação. #MOCK *
     */
    private static List<Produto> listaProdutos = new ArrayList<>();

    //Insere um quarto no mock "listaProdutos"
    public static void inserir(Produto prod)
            throws Exception {
        prod.setId(totalProdutos++);
        listaProdutos.add(prod);
    }

    //Realiza a atualização dos dados de um quarto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Quarto"
    public static void atualizar(Produto produtoProcura)
            throws Exception {
        if (produtoProcura != null && produtoProcura.getId() != null && !listaProdutos.isEmpty()) {
            for (Produto instrumento : listaProdutos) {
                if (instrumento != null && instrumento.getId() == produtoProcura.getId()) {
                    instrumento.setDataDeCadastro(produtoProcura.getDataDeCadastro());
                    instrumento.setNome(produtoProcura.getNome());
                    instrumento.setTipo(produtoProcura.getTipo());
                    instrumento.setMarca(produtoProcura.getMarca());
                    instrumento.setModelo(produtoProcura.getModelo());
                    instrumento.setDescricao(produtoProcura.getDescricao());
                    instrumento.setPreco(produtoProcura.getPreco());
                    instrumento.setEstoque(produtoProcura.getEstoque());
                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto instrumento = listaProdutos.get(i);
                if (instrumento != null && instrumento.getId() == id) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os quartos
    public static List<Produto> listar()
            throws Exception {
        //Retorna a lista de quartos 
        return listaProdutos;
    }

    //Procura um quarto na lista, de acordo com o numero
    //do quarto passado como parâmetro
    public static List<Produto> procurar(Integer valor, String valorNome)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();

        if (valor != null && !listaProdutos.isEmpty()) {
            for (Produto instrumento : listaProdutos) {
                if (instrumento != null && instrumento.getId() != null
                        && instrumento.getNome() != null) {
                    if (instrumento.getId() == valor
                            || instrumento.getNome().toUpperCase().contains(valorNome.toUpperCase())) {
                        listaResultado.add(instrumento);
                        {
                            listaResultado.add(instrumento);
                        }
                    }
                }
            }

            //Retorna a lista de clientes encontrados
            return listaResultado;
        }

        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um quarto da lista
    public static Produto obter(Integer id)
            throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i) != null && listaProdutos.get(i).getId() == id) {
                    return listaProdutos.get(i);
                }
            }
        }
        return null;
    }
}
