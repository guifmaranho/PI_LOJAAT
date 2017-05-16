package Loja_Instrumentos.ui.venda;

import Loja_Instrumentos.model.clientes.Cliente;
import Loja_Instrumentos.model.quartos.Quarto;
import Loja_Instrumentos.model.reserva.ItemReserva;
import Loja_Instrumentos.model.reserva.Reserva;
import Loja_Instrumentos.service.cliente.ServicoCliente;
import Loja_Instrumentos.service.quarto.ServicoQuarto;
import Loja_Instrumentos.service.reserva.ServicoReserva;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de reserva de quartos
 */
public class Venda extends javax.swing.JInternalFrame {

    //Construtor e inicialização de componentes
    public Venda() {
        initComponents();
        
        //Faz com que a coluna do ID não seja mostrada ao usuário.
        tabelaClientes.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaClientes.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaClientes.getColumnModel().getColumn(0).setWidth(0);

        tabelaQuartos.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaQuartos.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaQuartos.getColumnModel().getColumn(0).setWidth(0);

        tabelaItensReserva.getColumnModel().getColumn(0).setMinWidth(0);
        tabelaItensReserva.getColumnModel().getColumn(0).setMaxWidth(0);
        tabelaItensReserva.getColumnModel().getColumn(0).setWidth(0);

        //Inicializa os campos de datas e valor
        inicializarDatas();        
        inicializarValor();
    }

    //Código gerado do GUI Builder
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCancelar = new javax.swing.JButton();
        buttonConcluirReserva = new javax.swing.JButton();
        painelCliente = new javax.swing.JPanel();
        tabelaClientesScroll = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        labelPesquisaCliente = new javax.swing.JLabel();
        fieldPesquisaCliente = new javax.swing.JTextField();
        buttonPesquisarCliente = new javax.swing.JButton();
        painelQuartos = new javax.swing.JPanel();
        labelPesquisarQuarto = new javax.swing.JLabel();
        fFieldPesquisaQuarto = new javax.swing.JTextField();
        buttonPesquisarQuarto = new javax.swing.JButton();
        scrollTabelaQuartos = new javax.swing.JScrollPane();
        tabelaQuartos = new javax.swing.JTable();
        buttonAdReserva = new javax.swing.JButton();
        buttonRemovReserva = new javax.swing.JButton();
        labelPesquisarQuarto1 = new javax.swing.JLabel();
        fFieldQtdeQuartos = new javax.swing.JTextField();
        buttonAltQtdePessoas = new javax.swing.JButton();
        scrollTabelaQuartos1 = new javax.swing.JScrollPane();
        tabelaQuartos1 = new javax.swing.JTable();
        painelReserva = new javax.swing.JPanel();
        labelValorTotal = new javax.swing.JLabel();
        fieldValorTotal = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Venda");
        setMinimumSize(new java.awt.Dimension(718, 514));

        buttonCancelar.setText("Fechar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonConcluirReserva.setText("Finalizar");
        buttonConcluirReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConcluirReservaActionPerformed(evt);
            }
        });

        painelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Cliente"));

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CPF/CNPJ", "Contato", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabelaClientesScroll.setViewportView(tabelaClientes);

        labelPesquisaCliente.setText("Pesquisar:");

        buttonPesquisarCliente.setText("Pesquisar");
        buttonPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClienteLayout = new javax.swing.GroupLayout(painelCliente);
        painelCliente.setLayout(painelClienteLayout);
        painelClienteLayout.setHorizontalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tabelaClientesScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                        .addGroup(painelClienteLayout.createSequentialGroup()
                            .addComponent(labelPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fieldPesquisaCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap()))
        );
        painelClienteLayout.setVerticalGroup(
            painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 127, Short.MAX_VALUE)
            .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(painelClienteLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(painelClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelPesquisaCliente)
                        .addComponent(fieldPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonPesquisarCliente))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tabelaClientesScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        painelQuartos.setBorder(javax.swing.BorderFactory.createTitledBorder("Instrumentos"));

        labelPesquisarQuarto.setText("Pesquisar: ");

        buttonPesquisarQuarto.setText("Pesquisar");
        buttonPesquisarQuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPesquisarQuartoActionPerformed(evt);
            }
        });

        tabelaQuartos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Marca", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaQuartos.setViewportView(tabelaQuartos);

        buttonAdReserva.setText("Adic.Produto");
        buttonAdReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdReservaActionPerformed(evt);
            }
        });

        buttonRemovReserva.setText("Remover Produto");
        buttonRemovReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemovReservaActionPerformed(evt);
            }
        });

        labelPesquisarQuarto1.setText("Qtde. de Produtos:");

        fFieldQtdeQuartos.setEditable(false);
        fFieldQtdeQuartos.setBackground(new java.awt.Color(229, 229, 229));
        fFieldQtdeQuartos.setText("0");

        buttonAltQtdePessoas.setText("Alt. Qtde.Produto");
        buttonAltQtdePessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAltQtdePessoasActionPerformed(evt);
            }
        });

        tabelaQuartos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Tipo", "Marca", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabelaQuartos1.setViewportView(tabelaQuartos1);

        javax.swing.GroupLayout painelQuartosLayout = new javax.swing.GroupLayout(painelQuartos);
        painelQuartos.setLayout(painelQuartosLayout);
        painelQuartosLayout.setHorizontalGroup(
            painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelQuartosLayout.createSequentialGroup()
                        .addComponent(labelPesquisarQuarto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fFieldPesquisaQuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonPesquisarQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(labelPesquisarQuarto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fFieldQtdeQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(scrollTabelaQuartos)
                    .addGroup(painelQuartosLayout.createSequentialGroup()
                        .addComponent(buttonAdReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(buttonAltQtdePessoas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonRemovReserva))
                    .addComponent(scrollTabelaQuartos1)))
        );
        painelQuartosLayout.setVerticalGroup(
            painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelQuartosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPesquisarQuarto)
                    .addComponent(buttonPesquisarQuarto)
                    .addComponent(fFieldPesquisaQuarto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPesquisarQuarto1)
                    .addComponent(fFieldQtdeQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabelaQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(painelQuartosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAdReserva)
                    .addComponent(buttonAltQtdePessoas)
                    .addComponent(buttonRemovReserva))
                .addGap(19, 19, 19)
                .addComponent(scrollTabelaQuartos1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        painelReserva.setBorder(javax.swing.BorderFactory.createTitledBorder("TOTAL"));

        labelValorTotal.setText("Valor Total: ");

        fieldValorTotal.setEditable(false);
        fieldValorTotal.setBackground(new java.awt.Color(229, 229, 229));

        javax.swing.GroupLayout painelReservaLayout = new javax.swing.GroupLayout(painelReserva);
        painelReserva.setLayout(painelReservaLayout);
        painelReservaLayout.setHorizontalGroup(
            painelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelReservaLayout.createSequentialGroup()
                .addContainerGap(484, Short.MAX_VALUE)
                .addComponent(labelValorTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelReservaLayout.setVerticalGroup(
            painelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelReservaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValorTotal)
                    .addComponent(fieldValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painelCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painelQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonConcluirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonConcluirReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Listener do botão de pesquisa de clientes
    private void buttonPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarClienteActionPerformed
        //Indicador de resultado da pesquisa
        boolean hasResult = false;

        try {
            //Realiza a pesquisa de clientes no serviço
            List<Cliente> resultado = ServicoCliente.
                    procurarCliente(fieldPesquisaCliente.getText());

            //Obtém o elemento representante do conteúdo da tabela na tela
            DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
            //Indica que a tabela deve excluir todos seus elementos
            //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
            model.setRowCount(0);

            //Verifica se há resultados. Caso afirmativo, popula a tabela
            if (resultado != null && resultado.size() > 0) {
                //Atualizado o indicador, informando que há resultados
                hasResult = true;
                //Percorre a lista de resultados e os adiciona na tabela
                for (int i = 0; i < resultado.size(); i++) {
                    //Obtém o cliente da lista para cada iteração do "for"
                    Cliente cli = resultado.get(i);
                    //Verifica se o cliente é válido
                    if (cli != null) {
                        //Declara uma linha com a quantidade de colunas da
                        //tabela de cliente na tela (5)
                        Object[] row = new Object[5];
                        //Configura cada celula com o valor do cliente
                        row[0] = cli.getId();
                        row[1] = cli.getNome();
                        row[2] = cli.getSobrenome();
                        //Formata a data em um valor de fácil leitura antes
                        //de adicioná-la à tabela
                        SimpleDateFormat
                            formatador = new SimpleDateFormat("dd/MM/yyyy");          
                        row[3] = formatador.format(cli.getDataNascimento());
                        row[4] = cli.getGenero();
                        //Adiciona a linha à tabela
                        model.addRow(row);
                    }
                }
            }
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista de cliente", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa de clientes não tenha resultados
        if (!hasResult) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa de clientes não"
                    + " retornou resultados", "Sem resultados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonPesquisarClienteActionPerformed

    //Listener do botão cancelar
    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    //Trata o clique no botão de alteração
    private void buttonConcluirReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConcluirReservaActionPerformed
        //Chama o serviço de inserção de reserva
        try {
            //Cria uma nova reserva
            Reserva reserva = new Reserva();
            //Declara um novo cliente de reserva (virá do serviço)
            Cliente clienteReserva = null;

            //Obtém a linha selecionada na tabela de resultados
            int linhaSelCli = tabelaClientes.getSelectedRow();

            //Verifica se há linha selecionada na tabela de clientes
            if (linhaSelCli >= 0) {
                clienteReserva = ServicoCliente.
                        obterCliente((Integer) tabelaClientes.getValueAt(linhaSelCli, 0));
            }

            //Verifica se há linha selecionada na tabela de quartos
            DefaultTableModel modelItens = (DefaultTableModel) tabelaItensReserva.getModel();
            if (modelItens.getRowCount() > 0) {
                for (int i = 0; i < modelItens.getRowCount(); i++) {
                    Quarto quarto = ServicoQuarto.obterQuarto((Integer) tabelaItensReserva.getValueAt(i, 0));

                    ItemReserva itemReserva = new ItemReserva();
                    itemReserva.setQuartoAlugado(quarto);
                    itemReserva.setQuantidadePessoas(
                            (Integer) modelItens.getValueAt(i, 4));
                    reserva.getListaItemReserva().add(itemReserva);
                }
            }

            //Atribui um cliente a reserva
            reserva.setCliente(clienteReserva);

            //Preenche informações adicionar da reserva
            reserva.setDataCheckin((Date) fieldDataCheckin.getValue());
            reserva.setDataCheckout((Date) fieldDataCheckout.getValue());
            reserva.setValorTotal(obterValorReserva());

            ServicoReserva.fazerReserva(reserva);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Mostra mensagem de sucesso na criação da reserva
        JOptionPane.showMessageDialog(rootPane, "Reserva efetuada"
                + " com êxito",
                "Reserva efetuada",
                JOptionPane.INFORMATION_MESSAGE);

        //Limpa os campos para uma nova reserva        
        limparTabelas();
        inicializarDatas();
        inicializarValor();
    }//GEN-LAST:event_buttonConcluirReservaActionPerformed

    //Listener para pesquisa de quartos
    private void buttonPesquisarQuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPesquisarQuartoActionPerformed
        //Indicador de resultados da pesquisa de quartos
        boolean hasResult = false;
        //Número do quarto a ser pesquisado/listado
        Long numeroQuartoPesquisa = null;

        //Tenta obtero o número do quarto (tratamento de pesquisa/listagem)
        if (fFieldPesquisaQuarto.getText() != null && !fFieldPesquisaQuarto.getText().equals("")) {
            try {
                //Tenta converter o valor da caixa de texto de pesquisa em long
                numeroQuartoPesquisa = Long.parseLong(fFieldPesquisaQuarto.getText());
            } catch (Exception e) {
                e.printStackTrace();
            }

            //Se um valor foi definido, mas não é long, mostra uma mensagem de erro
            if (numeroQuartoPesquisa == null) {
                JOptionPane.showMessageDialog(rootPane, "É necessário informar um"
                        + "número de quarto válido para realizar a pesquisa",
                        "Número de quarto inválido",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        try {
            //Realiza a pesquisa de quartos com o valor de pesquisa
            List<Quarto> resultado = ServicoQuarto.
                    procurarQuarto(numeroQuartoPesquisa);

            //Obtém o elemento representante do conteúdo da tabela de quartos
            DefaultTableModel model = (DefaultTableModel) tabelaQuartos.getModel();
            //Indica que a tabela deve excluir todos seus elementos
            //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
            model.setRowCount(0);

            //Verifica se não existiram resultados e os adiciona na tabela
            if (resultado != null && resultado.size() > 0) {
                hasResult = true;
                //Percorre a lista de resultados e os adiciona na tabela
                for (int i = 0; i < resultado.size(); i++) {
                    //Obtém cada um dos quartos do resultado
                    Quarto cli = resultado.get(i);
                    if (cli != null) {
                        //Monta cada linha da tabela e preenche as células 
                        //(cada posição do vetor) com os valores do quarto
                        Object[] row = new Object[5];
                        row[0] = cli.getId();
                        row[1] = cli.getNumero();
                        row[2] = cli.getAndar();
                        row[3] = cli.getTipo();
                        row[4] = cli.getSituacao();
                        //Adiciona a linha na tabela
                        model.addRow(row);
                    }
                }
            }
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!hasResult) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa de quarto não "
                    + "retornou resultados ", "Sem resultados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonPesquisarQuartoActionPerformed

    //Trata o clique no botão de adição de quartos a lista de quartos a alugar
    private void buttonAdReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdReservaActionPerformed
        //Salva o item selecionado na tabela de quartos disponíveis
        int row = tabelaQuartos.getSelectedRow();
        //Se houver um item selecionado, inicia verificações antes de adicioná-lo
        //a tabela de quartos disponíveis
        if (row > -1) {
            //Obtém o modelo de dados da tabela de quartos disponíveis
            DefaultTableModel tabelaQuartosModel = ((DefaultTableModel) tabelaQuartos.getModel());
            //Obtém a situação do quarto da linha selecionada
            String situacaoQuarto = (String) tabelaQuartos.getValueAt(row, 4);

            //Só adiciona o quarto na tabela de itens a reservar se este estiver vago
            if (situacaoQuarto != null && situacaoQuarto.equals("Vago")) {
                //Obtém o modelo de dados da tabela de itens reserva
                DefaultTableModel modelItens = (DefaultTableModel) tabelaItensReserva.getModel();
                //Obtém o id do quarto selecionado para aluguel
                Integer idQuartoAAlugar = (Integer) tabelaQuartosModel.getValueAt(row, 0);

                //Se houver algum item na tabela de quartos para aluguel,
                //verifica se o item a ser alugado já não está na lista.
                //Isso evita adição de múltiplas reservas para o mesmo quarto com
                //valores de quantidades de pessoas diferentes
                if (modelItens != null && modelItens.getRowCount() > 0) {
                    //Percorre os quartos já adicionados
                    for (int i = 0; i < modelItens.getRowCount(); i++) {
                        //Obtém o id de cada quarto já alugado
                        Integer idQuartoAlugado = (Integer) modelItens.getValueAt(i, 0);
                        //Verifica se o id não é o mesmo do quarto a adicionar.
                        //Caso afirmativo, mostra uma mensagem de erro e cancela
                        if (idQuartoAAlugar == idQuartoAlugado) {
                            JOptionPane.showMessageDialog(rootPane, "O quarto já "
                                    + "está na reserva ", "Quarto indisponível",
                                    JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                    }
                }

                //Questiona o número de pessoas do aluguel do quarto
                Integer qtdePessoas = null;
                String respQtdePessoas = JOptionPane.showInputDialog(this, "Quantas pessoas?");
                //Se o botão cancelar foi pressionado, cancelar todo o processo
                if (respQtdePessoas == null) {
                    return;
                }
                try {
                    //Trata a resposta do usuário (número de pessoas do quarto)
                    qtdePessoas = Integer.parseInt(respQtdePessoas);
                    //Trata valores de pessoa negativos
                    if (qtdePessoas <= 0) {
                        JOptionPane.showMessageDialog(rootPane, "Quantidade de "
                                + "pessoas inválida", "Quantidade inválida",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                } catch (Exception e) {
                    //Mostra uma mensagem de erro caso o valor da quantidade
                    //de pessoas não seja um inteiro
                    JOptionPane.showMessageDialog(rootPane, "Quantidade de "
                            + "pessoas inválida", "Quantidade inválida",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                //Obtém cada uma das células da linha selecionada na tabela de
                //quartos disponíveis e adiciona os elementos na tabela de
                //quartos a serem alugados
                Object[] rowObj = new Object[tabelaQuartosModel.getColumnCount()];
                for (int col = 0; col < tabelaQuartosModel.getColumnCount(); col++) {
                    rowObj[col] = tabelaQuartosModel.getValueAt(row, col);
                }

                //Adiciona, na última célula, a quantidade de pessoas
                rowObj[tabelaQuartosModel.getColumnCount() - 1] = qtdePessoas;

                //Adiciona a linha na tabela de quartos a alugar
                modelItens.addRow(rowObj);

                //Obtém o tipo do quarto para calcular o valor da reserva
                String tipoQuarto = (String) tabelaQuartos.getValueAt(row, 3);
                
                //Calcula e atualiza o valor da reserva
                double valorQuarto = 0;
                if (tipoQuarto.equals("Simples")) {
                    valorQuarto = 50d;
                } else {
                    valorQuarto = 150d;
                }
                incrementarValorReserva(valorQuarto);
                
                //Atualiza a quantidade total de quartos alugados
                fFieldQtdeQuartos.setText(String.valueOf(modelItens.getRowCount()));
            } else {
                //Mostra uma mensagem de erro caso o quarto não esteja vago
                JOptionPane.showMessageDialog(rootPane, "O quarto não "
                        + "está vago ", "Quarto indisponível",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonAdReservaActionPerformed

    //Altera a quantidade de pessoas do quarto
    private void buttonAltQtdePessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAltQtdePessoasActionPerformed
        //Obtém o item selecionado na tabela de quartos a alugar
        int row = tabelaItensReserva.getSelectedRow();
        //Verifica se há um item selecionado
        if (row > -1) {
            //Obtém o modelo de itens da tabela de quartos a alugar
            DefaultTableModel modelItens = (DefaultTableModel) tabelaItensReserva.getModel();
            //Obtém a quantidade de pessoas atual
            Integer qtdePessoasAtual = (Integer) modelItens.getValueAt(row, 4);

            //Questiona uma nova quantidade de pessoas (iniciando com o valor atual)
            Integer qtdePessoas = null;
            String respQtdePessoas = JOptionPane.showInputDialog(this, "Quantas pessoas?", qtdePessoasAtual);

            //Verifica se o diálogo não foi cancelado
            if (respQtdePessoas == null) {
                return;
            }

            //Trata a resposta da quantidade de pessoas
            try {
                qtdePessoas = Integer.parseInt(respQtdePessoas);
                if (qtdePessoas <= 0) {
                    JOptionPane.showMessageDialog(rootPane, "Quantidade de"
                            + "pessoas inválida", "Quantidade inválida",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Quantidade de"
                        + "pessoas inválida", "Quantidade inválida",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            //Atualiza a quantidade de pessoas na tabela
            modelItens.setValueAt(qtdePessoas, row, 4);
        }
    }//GEN-LAST:event_buttonAltQtdePessoasActionPerformed

    //Remove um quarto da lista de quartos a alugar
    private void buttonRemovReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemovReservaActionPerformed
        //Obtém o item selecionado na tabela de quartos a alugar
        int row = tabelaItensReserva.getSelectedRow();
        //Verifica se há um item selecionado
        if (row > -1) {
            //Obtém o modelo da tabela de itens
            DefaultTableModel modelItens = (DefaultTableModel) tabelaItensReserva.getModel();
            //Remove o item selecionado
            modelItens.removeRow(row);
            //Diminui a quantidade de quartos totais
            fFieldQtdeQuartos.setText(String.valueOf(modelItens.getRowCount()));
        }
    }//GEN-LAST:event_buttonRemovReservaActionPerformed

    //Incrementa o valor da reserva no campo respectivo
    private void incrementarValorReserva(Double value) {
        try {
            //Obtém um formatador para dados monetários
            NumberFormat formatadorReal = NumberFormat.getCurrencyInstance();
            //Converte o valor monetário da caixa de texto em número
            Number numeroAtual = formatadorReal.parse(fieldValorTotal.getText());
            //Obtém um double do número convertido
            Double valorAtual = numeroAtual.doubleValue();

            //Incrementa o valor total da reserva
            valorAtual += value;

            //Reformata o valor incrementado e o atribui novamente ao campo de total
            String valorInicial = formatadorReal.format(valorAtual);
            fieldValorTotal.setText(valorInicial);
        } catch (Exception e) {
            //Exibe possíveis erros relacionados ao desenvolvedor
            e.printStackTrace();
        }
    }
    
    //Decrementa o valor da reserva no campo respectivo
    private void decrementarValorReserva(Double value) {
        try {
            //Obtém um formatador para dados monetários
            NumberFormat formatadorReal = NumberFormat.getCurrencyInstance();
            //Converte o valor monetário da caixa de texto em número
            Number numeroAtual = formatadorReal.parse(fieldValorTotal.getText());
            //Obtém um double do número convertido
            Double valorAtual = numeroAtual.doubleValue();

            //Decrementa o valor total da reserva
            valorAtual -= value;
            
            //Reformata o valor decrementado e o atribui novamente ao campo de total            
            String valorInicial = formatadorReal.format(valorAtual);
            fieldValorTotal.setText(valorInicial);
        } catch (Exception e) {
            //Exibe possíveis erros relacionados ao desenvolvedor
            e.printStackTrace();
        }
    }

    //Obtém o valor total da reserva
    private Double obterValorReserva() {
        //Declaração da variável de retorno
        Double valorAtual = null;
        try {
            //Obtém um formatador de dinheiro
            NumberFormat formatadorReal = NumberFormat.getCurrencyInstance();
            //Converte o valor do campo de total em número com o formatador
            Number numeroAtual = formatadorReal.parse(fieldValorTotal.getText());
            //Obtém um double do valor numerico convertido
            valorAtual = numeroAtual.doubleValue();
        } catch (Exception e) {
            //Exibe possíveis erros relacionados ao desenvolvedor
            e.printStackTrace();
        }
        //Retorna o valor double obtido do campo de texto
        return valorAtual;
    }
    
    //Inicializa os campos de data com valores padrão (hoje + 2 dias)
    private void inicializarDatas() {
        //Define um formatador de datas
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        //Define a data inicial de check-in como a data de hoje                
        Date dataCheckin = new Date();
        String dataCheckinFormatada = formatador.format(dataCheckin);
        fieldDataCheckin.setText(dataCheckinFormatada);
        fieldDataCheckin.setValue(dataCheckin);

        //Define a data inicial de check-out como a data de hoje + 2 dias                
        Date dataCheckout = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataCheckout);
        calendario.add(Calendar.DAY_OF_MONTH, 2);
        dataCheckout = calendario.getTime();

        String dataCheckoutFormatada = formatador.format(dataCheckout);
        fieldDataCheckout.setText(dataCheckoutFormatada);
        fieldDataCheckout.setValue(dataCheckout);
    }
    
    //Inicializa o campo de valor com "0"
    private void inicializarValor() {
        //Define o valor inicial da reserva como R$ 0,00
        fieldValorTotal.setText("0");
        //Obtém um formatador de moeda
        NumberFormat formatadorReal = NumberFormat.getCurrencyInstance();
        //Formata o valor em moeda e o atribui ao campo de total
        String valorInicial = formatadorReal.format(0);
        fieldValorTotal.setText(valorInicial);
    }
    
    //Limpa as tabelas de cliente, quartos e itens de reserva, bem como
    //seus respectivos campos de pesquisa
    private void limparTabelas() {
        //Limpa as tabelas para uma nova reserva
        fieldPesquisaCliente.setText("");
        fFieldPesquisaQuarto.setText("");
        DefaultTableModel modelClientes = (DefaultTableModel) tabelaClientes.getModel();
        modelClientes.setRowCount(0);
        DefaultTableModel modelQuartos = (DefaultTableModel) tabelaQuartos.getModel();
        modelQuartos.setRowCount(0);
        DefaultTableModel modelItens = (DefaultTableModel) tabelaItensReserva.getModel();
        modelItens.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdReserva;
    private javax.swing.JButton buttonAltQtdePessoas;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonConcluirReserva;
    private javax.swing.JButton buttonPesquisarCliente;
    private javax.swing.JButton buttonPesquisarQuarto;
    private javax.swing.JButton buttonRemovReserva;
    private javax.swing.JTextField fFieldPesquisaQuarto;
    private javax.swing.JTextField fFieldQtdeQuartos;
    private javax.swing.JTextField fieldPesquisaCliente;
    private javax.swing.JTextField fieldValorTotal;
    private javax.swing.JLabel labelPesquisaCliente;
    private javax.swing.JLabel labelPesquisarQuarto;
    private javax.swing.JLabel labelPesquisarQuarto1;
    private javax.swing.JLabel labelValorTotal;
    private javax.swing.JPanel painelCliente;
    private javax.swing.JPanel painelQuartos;
    private javax.swing.JPanel painelReserva;
    private javax.swing.JScrollPane scrollTabelaQuartos;
    private javax.swing.JScrollPane scrollTabelaQuartos1;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JScrollPane tabelaClientesScroll;
    private javax.swing.JTable tabelaQuartos;
    private javax.swing.JTable tabelaQuartos1;
    // End of variables declaration//GEN-END:variables
}
