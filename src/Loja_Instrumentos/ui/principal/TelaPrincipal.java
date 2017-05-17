/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Loja_Instrumentos.ui.principal;

import Loja_Instrumentos.ui.cliente.TelaCadastroCliente;
import Loja_Instrumentos.ui.cliente.TelaConsultaCliente;
import Loja_Instrumentos.ui.produtos.TelaCadastroDeProdutos;
import Loja_Instrumentos.ui.produtos.TelaConsultaModificaProduto;
import Loja_Instrumentos.ui.venda.TelaDeVenda;
import Loja_Instrumentos.ui.venda.TelaRelatorioDeVendas;
import java.awt.Dimension;
import javax.swing.JInternalFrame;

/**
 *
 * @author Fernando
 */
public class TelaPrincipal extends javax.swing.JFrame {

    private TelaCadastroCliente cadastrarCliente = null;
    private TelaConsultaCliente consultarClientes = null;
    private TelaCadastroDeProdutos cadastrarProduto = null;
    private TelaConsultaModificaProduto consultarProduto = null;
    private TelaDeVenda fazerVenda = null;
    private TelaRelatorioDeVendas relatorioVendas = null;

    public TelaPrincipal() {
        initComponents();
        //Faz com que a janela seja aberta no meio da tela
        this.setLocationRelativeTo(null);
    }

    public TelaCadastroCliente getCadastrarCliente() {
        return cadastrarCliente;
    }

    public void setCadastrarCliente(TelaCadastroCliente cadastrarCliente) {
        this.cadastrarCliente = cadastrarCliente;
    }

    public TelaConsultaCliente getConsultarClientes() {
        return consultarClientes;
    }

    public void setConsultarClientes(TelaConsultaCliente consultarClientes) {
        this.consultarClientes = consultarClientes;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuClientes = new javax.swing.JMenu();
        menuCadastrarCliente = new javax.swing.JMenuItem();
        menuConsultarOuAlterarCliente = new javax.swing.JMenuItem();
        menuProdutos = new javax.swing.JMenu();
        menuCadastrarProdutos = new javax.swing.JMenuItem();
        menuConsultarOuAlterarrProdutos = new javax.swing.JMenuItem();
        menuVenda = new javax.swing.JMenu();
        menuVender = new javax.swing.JMenuItem();
        menuRelatorio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja de Instrumentos\n");
        setFocusableWindowState(false);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1057, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 696, Short.MAX_VALUE)
        );

        jMenuBar1.setToolTipText("");

        MenuClientes.setText("Cliente");
        MenuClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClientesActionPerformed(evt);
            }
        });

        menuCadastrarCliente.setText("Cadastrar");
        menuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(menuCadastrarCliente);

        menuConsultarOuAlterarCliente.setText("Consultar ou Alterar");
        menuConsultarOuAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarOuAlterarClienteActionPerformed(evt);
            }
        });
        MenuClientes.add(menuConsultarOuAlterarCliente);

        jMenuBar1.add(MenuClientes);

        menuProdutos.setText("Produto");

        menuCadastrarProdutos.setText("Cadastrar");
        menuCadastrarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadastrarProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuCadastrarProdutos);

        menuConsultarOuAlterarrProdutos.setText("Consultar ou Alterar");
        menuConsultarOuAlterarrProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarOuAlterarrProdutosActionPerformed(evt);
            }
        });
        menuProdutos.add(menuConsultarOuAlterarrProdutos);

        jMenuBar1.add(menuProdutos);

        menuVenda.setBorder(null);
        menuVenda.setText("Vender");

        menuVender.setText("Vender");
        menuVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVenderActionPerformed(evt);
            }
        });
        menuVenda.add(menuVender);

        menuRelatorio.setText("Relatório");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        menuVenda.add(menuRelatorio);

        jMenuBar1.add(menuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConsultarOuAlterarrProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarOuAlterarrProdutosActionPerformed

        if (consultarProduto == null || !consultarProduto.isDisplayable()) {
            consultarProduto = new TelaConsultaModificaProduto();
            desktop.add(consultarProduto);
            openFrameInCenter(consultarProduto);
        }
        consultarProduto.toFront();

    }//GEN-LAST:event_menuConsultarOuAlterarrProdutosActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
       if (relatorioVendas == null || !relatorioVendas.isDisplayable()) {
            relatorioVendas = new TelaRelatorioDeVendas();
            desktop.add(relatorioVendas);
            openFrameInCenter(relatorioVendas);
        }
        relatorioVendas.toFront();
    }//GEN-LAST:event_menuRelatorioActionPerformed

    private void MenuClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClientesActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_MenuClientesActionPerformed

    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }
    private void menuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarClienteActionPerformed
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {
            cadastrarCliente = new TelaCadastroCliente();
            desktop.add(cadastrarCliente);
            openFrameInCenter(cadastrarCliente);
        }
        cadastrarCliente.toFront();
    }//GEN-LAST:event_menuCadastrarClienteActionPerformed

    private void menuConsultarOuAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarOuAlterarClienteActionPerformed
        if (consultarClientes == null || !consultarClientes.isDisplayable()) {
            consultarClientes = new TelaConsultaCliente();
            desktop.add(consultarClientes);
            openFrameInCenter(consultarClientes);
        }
        consultarClientes.toFront();        // TODO add your handling code here:
    }//GEN-LAST:event_menuConsultarOuAlterarClienteActionPerformed

    private void menuCadastrarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadastrarProdutosActionPerformed
        if (cadastrarProduto == null || !cadastrarProduto.isDisplayable()) {
            cadastrarProduto = new TelaCadastroDeProdutos();
            desktop.add(cadastrarProduto);
            openFrameInCenter(cadastrarProduto);
        }
        cadastrarProduto.toFront();

    }//GEN-LAST:event_menuCadastrarProdutosActionPerformed

    private void menuVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVenderActionPerformed

        if (fazerVenda == null || !fazerVenda.isDisplayable()) {
            fazerVenda = new TelaDeVenda();
            desktop.add(fazerVenda);
            openFrameInCenter(fazerVenda);
        }
        fazerVenda.toFront();

    }//GEN-LAST:event_menuVenderActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuClientes;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuCadastrarCliente;
    private javax.swing.JMenuItem menuCadastrarProdutos;
    private javax.swing.JMenuItem menuConsultarOuAlterarCliente;
    private javax.swing.JMenuItem menuConsultarOuAlterarrProdutos;
    private javax.swing.JMenu menuProdutos;
    private javax.swing.JMenuItem menuRelatorio;
    private javax.swing.JMenu menuVenda;
    private javax.swing.JMenuItem menuVender;
    // End of variables declaration//GEN-END:variables
}
