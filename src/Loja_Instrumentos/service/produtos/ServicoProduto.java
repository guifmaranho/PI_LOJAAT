package Loja_Instrumentos.service.produtos;

import Loja_Instrumentos.exceptions.DataSourceException;
import Loja_Instrumentos.exceptions.InstrumentoException;
import Loja_Instrumentos.mock.MockProduto;
import Loja_Instrumentos.model.produto.Produto;
import Loja_Instrumentos.model.validador.produto.ValidadorProduto;
import java.util.Calendar;
import java.util.List;



//Classe de serviço de quarto
public class ServicoProduto {

    //Insere um quarto na fonte de dados
    public static void cadastrarProduto(Produto produto)
            throws InstrumentoException, DataSourceException {
        
        //Configura a situação como vago (padrão)
        Calendar calendar = Calendar.getInstance();
        
        produto.setDataDeCadastro(calendar.getTime());
        
        
        //Realiza validações no quarto
        ValidadorProduto.validar(produto);

        
        try {
            //Realiza a chamada de inserção na fonte de dados
            MockProduto.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um quarto na fonte de dados
    public static void atualizarQuarto(Produto produto)
            throws InstrumentoException, DataSourceException {
        
        //Realiza validações no quarto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MockProduto.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um quarto por número na fonte de dados
    public static List<Produto> procurarProduto(Integer numero, String nome)
            throws InstrumentoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (numero == null) {
                return MockProduto.listar();
            } else {
                return MockProduto.procurar(numero, nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o quarto com ID informado do mock
    public static Produto obterQuarto(Integer id)
            throws InstrumentoException, DataSourceException {
        try {
            //Retorna o quarto obtido com o DAO
            return MockProduto.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o quarto com ID informado do mock
    public static void excluirQuarto(Integer id)
            throws InstrumentoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do quarto informado
            MockProduto.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}