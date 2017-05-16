package Loja_Instrumentos.ui.venda;

import Loja_Instrumentos.model.clientes.Cliente;
import Loja_Instrumentos.model.quartos.Quarto;
import Loja_Instrumentos.model.reserva.ItemReserva;
import Loja_Instrumentos.model.reserva.Reserva;
import Loja_Instrumentos.service.reserva.ServicoReserva;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Tela de geração de um relatório de reservas por período
 */
public class Relatorio extends javax.swing.JInternalFrame {
    
    /**
     * Construtor e inicialização de componentes
     */
    public Relatorio() {
        initComponents();
        inicializarDatas();
    }

    /**
     * Código criado pelo GUI Builder para montagem da tela
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDataInicio = new javax.swing.JLabel();
        scrollTabelaResultados = new javax.swing.JScrollPane();
        tabelaRelatorio = new javax.swing.JTable();
        buttonGerarRelatorio = new javax.swing.JButton();
        labelDataFim = new javax.swing.JLabel();
        fieldDataInicial = new javax.swing.JFormattedTextField();
        fieldDataFinal = new javax.swing.JFormattedTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Relatório de Vendas");

        labelDataInicio.setText("Data de Início: ");

        tabelaRelatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Produto", "Marca", "Tipo", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabelaRelatorio.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        scrollTabelaResultados.setViewportView(tabelaRelatorio);

        buttonGerarRelatorio.setText("Gerar Relatório");
        buttonGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGerarRelatorioActionPerformed(evt);
            }
        });

        labelDataFim.setText("Data Fim: ");

        fieldDataInicial.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        fieldDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelDataInicio)
                        .addGap(2, 2, 2)
                        .addComponent(fieldDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelDataFim)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGerarRelatorio)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fieldDataFinal, fieldDataInicial});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDataInicio)
                    .addComponent(labelDataFim)
                    .addComponent(buttonGerarRelatorio)
                    .addComponent(fieldDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTabelaResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Gera um relatório na tabela
    private void buttonGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGerarRelatorioActionPerformed
        //Obtém as datas configuradas no relatório
        Date dataInicio = (Date) fieldDataInicial.getValue();
        Date dataFinal = (Date) fieldDataFinal.getValue();
        
        try {
            //Obtém a lista das reservas disponíveis no período
            List<Reserva> listaRelatorio =
                ServicoReserva.listarReservaPeriodo(dataInicio, dataFinal);
            
            //Verifica se a lista de reservas não está vazia (não há reservas),
            //situação onde um relatório não pode ser exibido
            if (listaRelatorio == null || listaRelatorio.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Não há dados "
                    + "de reserva para exibição do relatório", "Erro",
                JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            //Obtém os dados de modelo da tabela de relatório
            DefaultTableModel modelRelatorio = (DefaultTableModel) tabelaRelatorio.getModel();
            //Limpa a tabela se houver um relatório já sendo exibido
            modelRelatorio.setRowCount(0);
            
            //Declara um total, a ser utilizado para exibição do total do relatório
            double total = 0;
            //Itera pelas reservas
            for (Reserva reserva : listaRelatorio) {
                //Obtém o cliente da reserva
                Cliente clienteReserva = reserva.getCliente();
                
                //Verifica se o cliente foi definido corretamente na reserva
                if (clienteReserva != null) {
                    //Se um cliente foi definido, monta uma linha da tabela
                    //para exibição de seu nome e a adiciona na tabela
                    Object[] linhaReserva = new Object[8];
                    String nomeCompleto = clienteReserva.getNome() + " "
                            + clienteReserva.getSobrenome();
                    linhaReserva[0] = nomeCompleto;
                    modelRelatorio.addRow(linhaReserva);
                }                
                
                //Obtém a lista de itens de reserva
                List<ItemReserva> listItensReserva = reserva.getListaItemReserva();
                //Verifica se há itens de reserva antes de iterá-los
                if (listItensReserva != null || !listItensReserva.isEmpty()) {
                    //Itera pelos itens de reserva
                    for (ItemReserva itemReserva : listItensReserva) {
                        //Obtém o quarto do item de reserva
                        Quarto quartoAlugado = itemReserva.getQuartoAlugado();
                        //Verifica se o quarto foi corretamente definido
                        if (quartoAlugado != null) {
                            //Se o quarto foi definido, declara uma linha
                            //para exibir suas informações e a adiciona na tabela
                            Object[] linhaItem = new Object[8];
                            linhaItem[1] = quartoAlugado.getNumero();
                            linhaItem[2] = quartoAlugado.getAndar();
                            linhaItem[3] = quartoAlugado.getTipo();
                            linhaItem[4] = itemReserva.getQuantidadePessoas();
                            modelRelatorio.addRow(linhaItem);
                        }                        
                    }                    
                }
                
                //Adiciona mais uma linha com as informações adicionais (data de
                //entrada e saída e valor total da reserva
                Object[] linhaOutros = new Object[8];
                SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");          
                linhaOutros[5] = formatador.format(reserva.getDataCheckin());
                linhaOutros[6] = formatador.format(reserva.getDataCheckout());
                linhaOutros[7] = formatarDoubleEmDinheiro(reserva.getValorTotal());
                total += reserva.getValorTotal();
                modelRelatorio.addRow(linhaOutros);
                
                //Pula uma linha
                Object[] linhaBranca = new Object[8];
                modelRelatorio.addRow(linhaBranca);
            }
            
            //Exibe as informações do total de reservas no período
            Object[] linhaTotal = new Object[8];       
            linhaTotal[0] = "Valor total";
            linhaTotal[7] = formatarDoubleEmDinheiro(total);
            modelRelatorio.addRow(linhaTotal);
        }
        catch(Exception e) {
            //Trata caso aconteça algum erro de fonte de dados (ou outro)
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Erro", e.getMessage(),
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonGerarRelatorioActionPerformed
   
    //Inicializa as datas padrão do relatório (hoje + 30 dias)
    private void inicializarDatas() {
        //Define um formatador de datas
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

        //Define a data inicial de check-in como a data de hoje                
        Date dataCheckin = new Date();
        String dataCheckinFormatada = formatador.format(dataCheckin);
        fieldDataInicial.setText(dataCheckinFormatada);
        fieldDataInicial.setValue(dataCheckin);

        //Define a data inicial de check-out como a data de hoje + 2 dias                
        Date dataCheckout = new Date();
        Calendar calendario = Calendar.getInstance();
        calendario.setTime(dataCheckout);
        calendario.add(Calendar.DAY_OF_MONTH, 30);
        dataCheckout = calendario.getTime();

        String dataCheckoutFormatada = formatador.format(dataCheckout);
        fieldDataFinal.setText(dataCheckoutFormatada);
        fieldDataFinal.setValue(dataCheckout);
    }
    
    //Formata um valor de double em dinheiro (currency)
    private String formatarDoubleEmDinheiro(Double valor) {        
        String valorFormatado = null;
        if (valor != null) {
            NumberFormat formatadorReal = NumberFormat.getCurrencyInstance();
            valorFormatado = formatadorReal.format(valor);
        }        
        return valorFormatado;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonGerarRelatorio;
    private javax.swing.JFormattedTextField fieldDataFinal;
    private javax.swing.JFormattedTextField fieldDataInicial;
    private javax.swing.JLabel labelDataFim;
    private javax.swing.JLabel labelDataInicio;
    private javax.swing.JScrollPane scrollTabelaResultados;
    private javax.swing.JTable tabelaRelatorio;
    // End of variables declaration//GEN-END:variables
}
