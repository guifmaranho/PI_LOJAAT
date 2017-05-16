package Loja_Instrumentos.mock;

import Loja_Instrumentos.model.produto.Instrumentos;
import java.util.ArrayList;
import java.util.List;

//Mock de Quarto. Realiza operações de mock com o quarto
public class MockProduto {
    private static int totalProdutos = 0;
    /** Armazena a lista de quartos inseridos para manipulação. #MOCK **/    
    private static List<Instrumentos> listaProdutos = new ArrayList<>();

    //Insere um quarto no mock "listaProdutos"
    public static void inserir(Instrumentos prod)
            throws Exception {
        prod.setId(totalProdutos++);
        listaProdutos.add(prod);
    }

    //Realiza a atualização dos dados de um quarto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Quarto"
    public static void atualizar(Instrumentos quartoProcura)
            throws Exception {
        if (quartoProcura != null && quartoProcura.getId() != null && !listaProdutos.isEmpty()) {
            for (Instrumentos quartoCli : listaProdutos) {
                if (quartoCli != null && quartoCli.getId() == quartoProcura.getId()) {
                    quartoCli.setAndar(quartoProcura.getAndar());
                    quartoCli.setNumero(quartoProcura.getNumero());
                    quartoCli.setTipo(quartoProcura.getTipo());
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
                Instrumentos quartoLi = listaProdutos.get(i);
                if (quartoLi != null && quartoLi.getId() == id) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os quartos
    public static List<Instrumentos> listar()
            throws Exception {        
        //Retorna a lista de quartos 
        return listaProdutos;
    }

    //Procura um quarto na lista, de acordo com o numero
    //do quarto passado como parâmetro
    public static List<Instrumentos> procurar(Long valor)
            throws Exception {
        List<Instrumentos> listaResultado = new ArrayList<Instrumentos>();
        
        if (valor != null && !listaProdutos.isEmpty()) {
            for (Instrumentos quartoLi : listaProdutos) {
                if (quartoLi != null && quartoLi.getNumero() != null &&
                    quartoLi.getAndar() != null) {
                    if (quartoLi.getNumero() == valor ||
                        quartoLi.getAndar() == valor) {
                        listaResultado.add(quartoLi);
                    }
                }
            }
        }
        
        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um quarto da lista
    public static Instrumentos obter(Integer id)
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
