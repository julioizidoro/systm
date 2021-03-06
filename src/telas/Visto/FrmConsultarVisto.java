/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Visto;

import controller.FormaPagamentoController;
import controller.FornecedorController;
import controller.OrcamentoController;
import controller.ParcelamentoPagamentoController;
import controller.VendasController;
import controller.VistosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cambio;
import model.Cliente;
import model.Controlevistos;
import model.Formapagamento;
import model.Fornecedor;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Parcelamentopagamento;
import model.Unidadenegocio;
import model.Usuario;
import model.Vendas;
import model.Vistos;
import model.view.Viewvendasvisto;
import Singleton.ConexaoSingleton;
import telas.Cancelamento.FrmCancelamento;
import telas.ContasReceber.FrmConsultaContasReceber;
import telas.Cursos.FrmConsultarCursos;
import telas.PesquisaProdutos.FrmPesquisarProdutos;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;
import util.relatoriosJasper;

/**
 *
 * @author Wolverine
 */
public class FrmConsultarVisto extends javax.swing.JFrame implements IVistoConsulta{
    
    private List<Viewvendasvisto> listaVendas;
    private ConsultaVendasTableModel modelVendas;
    private UsuarioLogadoBean usuarioLogadoBean;
    List<Cambio> listaCambio;
    private int linha;

    /**
     * Creates new form FrmConsultarCursos
     */
    public FrmConsultarVisto(UsuarioLogadoBean usuarioLogadoBean, List<Cambio> listaCambio) {
        this.listaCambio = listaCambio;
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelVendas();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vendasSegurojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        imprimirjButton = new javax.swing.JButton();
        imprimirjButton4 = new javax.swing.JButton();
        imprimirjButton1 = new javax.swing.JButton();
        FecharrjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomeClientejTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Vistos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        vendasSegurojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Data Inscrição", "Curso", "Unidade", "Agente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        vendasSegurojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendasSegurojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vendasSegurojTable);
        if (vendasSegurojTable.getColumnModel().getColumnCount() > 0) {
            vendasSegurojTable.getColumnModel().getColumn(0).setResizable(false);
            vendasSegurojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            vendasSegurojTable.getColumnModel().getColumn(1).setResizable(false);
            vendasSegurojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            vendasSegurojTable.getColumnModel().getColumn(2).setResizable(false);
            vendasSegurojTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            vendasSegurojTable.getColumnModel().getColumn(3).setResizable(false);
            vendasSegurojTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            vendasSegurojTable.getColumnModel().getColumn(4).setResizable(false);
            vendasSegurojTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Nova");
        AdicionarjButton3.setToolTipText("Nova Emissão de Visto");
        AdicionarjButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton3.setName(""); // NOI18N
        AdicionarjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
        AdicionarjButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarjButton3ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(AdicionarjButton3);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Emissão de Visto");
        EditarjButton.setEnabled(false);
        EditarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        EditarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        EditarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        EditarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EditarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(EditarjButton);

        excluirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/cancelar.png"))); // NOI18N
        excluirjButton.setText("Cancelar");
        excluirjButton.setToolTipText("Cancelar Emissão de Visto");
        excluirjButton.setEnabled(false);
        excluirjButton.setFocusable(false);
        excluirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        excluirjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        excluirjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        excluirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(excluirjButton);
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        imprimirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/imprimir.png"))); // NOI18N
        imprimirjButton.setText("Imprimir");
        imprimirjButton.setToolTipText("Imprimir Documentos");
        imprimirjButton.setEnabled(false);
        imprimirjButton.setFocusable(false);
        imprimirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imprimirjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imprimirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(imprimirjButton);

        imprimirjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/cambio.png"))); // NOI18N
        imprimirjButton4.setText("Boleto");
        imprimirjButton4.setToolTipText("Gerar Boleto");
        imprimirjButton4.setFocusable(false);
        imprimirjButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imprimirjButton4.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton4.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton4.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imprimirjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButton4ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(imprimirjButton4);

        imprimirjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pesquisar.png"))); // NOI18N
        imprimirjButton1.setText("Pesquisar");
        imprimirjButton1.setToolTipText("Pesquisa Ficha Visto Consular");
        imprimirjButton1.setFocusable(false);
        imprimirjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imprimirjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imprimirjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButton1ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(imprimirjButton1);

        FecharrjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        FecharrjButton.setText("Fechar");
        FecharrjButton.setToolTipText("Fechar");
        FecharrjButton.setFocusable(false);
        FecharrjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FecharrjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        FecharrjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        FecharrjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        FecharrjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FecharrjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharrjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(FecharrjButton);

        jLabel1.setText("Nome do Cliente:");

        nomeClientejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nomeClientejTextFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (usuarioLogadoBean.getAcesso().getVistoAdicionar()==1){
            if (listaCambio!=null){
                new FrmVisto(0, usuarioLogadoBean, this);
            }else {
                JOptionPane.showMessageDialog(rootPane, "Cambio do dia ainda não liberado");
            }
        }else JOptionPane.showMessageDialog(rootPane,"Acesso Negado");
        
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getVistoEditar()== 1) {
            int linha = vendasSegurojTable.getSelectedRow();
            if (linha >= 0) {
                new FrmVisto(listaVendas.get(linha).getIdvendas(), usuarioLogadoBean, this);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getVistoExcluir() == 1) {
            int linha = vendasSegurojTable.getSelectedRow();
            if (linha >= 0) {
                boolean resultado = JOptionPane.showConfirmDialog(null, "Confirma Cancelamento?", "Cancelar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
                if (resultado) {
                    int idCliente = listaVendas.get(linha).getIdcliente();
                    int idvenda = listaVendas.get(linha).getIdvendas();
                    String curso = "Visto";
                    String pais = listaVendas.get(linha).getPaisDestino();
                    String motivo = JOptionPane.showInputDialog("Motivo do Cancelamento");
                    CancelarVenda(listaVendas.get(linha).getIdvendas(), listaVendas.get(linha).getNomeCliente(), Formatacao.ConvercaoDataPadrao(listaVendas.get(linha).getDataVenda()), motivo);
                    JOptionPane.showMessageDialog(rootPane, "Ficha de Vistos Cancelada");
                    new FrmCancelamento(usuarioLogadoBean, idvenda, idCliente, curso);
                    carregarModelVendas();
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void imprimirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButtonActionPerformed
        linha = vendasSegurojTable.getSelectedRow();
        if (linha >= 0) {
            new FrmEscolherRelatorios(this, true, this);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecione um visto");
        }
    }//GEN-LAST:event_imprimirjButtonActionPerformed

    private void vendasSegurojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendasSegurojTableMouseClicked
        EditarjButton.setEnabled(true);
        excluirjButton.setEnabled(true);
        imprimirjButton.setEnabled(true);
    }//GEN-LAST:event_vendasSegurojTableMouseClicked

    private void FecharrjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButtonActionPerformed

    private void imprimirjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButton1ActionPerformed
        new FrmPesquisarProdutos(this, usuarioLogadoBean);
    }//GEN-LAST:event_imprimirjButton1ActionPerformed

    private void nomeClientejTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomeClientejTextFieldKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            carregarModelVendas();
        }
    }//GEN-LAST:event_nomeClientejTextFieldKeyPressed

    private void imprimirjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButton4ActionPerformed
        int linha = vendasSegurojTable.getSelectedRow();
        if (linha>=0){
            new FrmConsultaContasReceber(listaVendas.get(linha).getIdvendas(), usuarioLogadoBean);
        }else JOptionPane.showMessageDialog(rootPane, "Selecione uma ficha.");

    }//GEN-LAST:event_imprimirjButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JButton imprimirjButton;
    private javax.swing.JButton imprimirjButton1;
    private javax.swing.JButton imprimirjButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTable vendasSegurojTable;
    // End of variables declaration//GEN-END:variables
    public void carregarModelVendas(){
        try {
            ConexaoSingleton.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = null;
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("Gerencial")){
            sql = "Select v from Viewvendasvisto v where v.nomeCliente like '%" + nomeClientejTextField.getText() + "%' and v.produtosIdprodutos=" + usuarioLogadoBean.getParametrosprodutos().getVisto() + " and v.situacao<>'Cancelada' order by v.dataVenda";
        }else {
            sql = "Select v from Viewvendasvisto v where v.idUnidadeNegocio=" + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio() +  
                    " and v.nomeCliente like '%" + nomeClientejTextField.getText() + "%' and v.produtosIdprodutos=" + usuarioLogadoBean.getParametrosprodutos().getVisto() +  " and v.situacao<>'Cancelada' order by v.dataVenda";
        }
        VistosController vistosController = new VistosController();
        listaVendas  = vistosController.listar(sql);
        if (listaVendas==null){
            listaVendas = new ArrayList<Viewvendasvisto>();
        }
        modelVendas = new ConsultaVendasTableModel(listaVendas);
        vendasSegurojTable.setModel(modelVendas);
        vendasSegurojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        vendasSegurojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        vendasSegurojTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        vendasSegurojTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        vendasSegurojTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        vendasSegurojTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelVendas();
    }
    
    public void excluirOrcamanto(int idVenda){
        OrcamentoController orcamentoController = new OrcamentoController();
        Orcamento orcamento = orcamentoController.consultar(idVenda);
        if (orcamento!=null){
            List<Orcamentoprodutosorcamento> listaProdutos = orcamentoController.listarOrcamentoProdutoOrcamento(orcamento.getIdorcamento());
            if (listaProdutos!=null){
                for(int i=0;i<listaProdutos.size();i++){
                    orcamentoController.excluirOrcamentoProdutoOrcamento(listaProdutos.get(i).getIdorcamentoProdutosOrcamento());
                }
            }
            orcamentoController.excluirOrcamento(orcamento.getIdorcamento());
        }
                
    }
    
    public void excluirFormaPagamento(int idVenda){
        FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
        Formapagamento formapagamento = formaPagamentoController.consultar(idVenda);
        if (formapagamento!=null){
            excluirParcelamentoFormaPagamento(formapagamento.getIdformaPagamento());
            formaPagamentoController.excluir(formapagamento.getIdformaPagamento());
        }
    }
    
    public void excluirParcelamentoFormaPagamento(int idFormaPagamento){
        ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
        List<Parcelamentopagamento> listaParcelamentopagamentos = parcelamentoPagamentoController.listar(idFormaPagamento);
        if (listaParcelamentopagamentos!=null){
            for(int i=0;i<listaParcelamentopagamentos.size();i++){
                parcelamentoPagamentoController.excluir(listaParcelamentopagamentos.get(i).getIdparcemlamentoPagamento());
            }
        }
    }
    
    
    public void excluirSeguroViagem(int idVenda){
        VistosController vistosController = new VistosController();
        Vistos visto = vistosController.consultarVistos(idVenda);
        if (visto!=null){
            Controlevistos controle = vistosController.consultarControleVistos(visto.getIdvistos());
            if (controle!=null){
                vistosController.excluirControleVistos(controle);
            }
            vistosController.excluir(visto.getIdvistos());
        }
    }

    
  public void imprimirRecibo() {
        float valorRecibo = 0.0f;
        String url = ("telas/Recibo/reciboPagamento.jasper");
        FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
        Formapagamento forma = formaPagamentoController.consultar(listaVendas.get(linha).getIdvendas());
        ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
        List<Parcelamentopagamento> listaParcelamento = parcelamentoPagamentoController.listar(forma.getIdformaPagamento());
        if (listaParcelamento != null) {
            for (int i = 0; i < listaParcelamento.size(); i++) {
                if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Dinheiro")) {
                    valorRecibo = valorRecibo + listaParcelamento.get(i).getValorParcelamento();
                }
                if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("cheque")) {
                    valorRecibo = valorRecibo + listaParcelamento.get(i).getValorParcelamento();
                }
                if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("depósito")) {
                    valorRecibo = valorRecibo + listaParcelamento.get(i).getValorParcelamento();
                }
                if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Cartão de crédito")) {
                    valorRecibo = valorRecibo + listaParcelamento.get(i).getValorParcelamento();
                }
            }
        }
        if (valorRecibo > 0.0f) {
            Map parameters = new HashMap();
            try {
                parameters.put("idvendas", listaVendas.get(linha).getIdvendas());

                String valorExtenso = Formatacao.valorPorExtenso(valorRecibo);
                parameters.put("valorExtenso", valorExtenso);
                parameters.put("valorRecibo", valorRecibo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
                ex.printStackTrace();
            }
            new relatoriosJasper(url, parameters);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sem recibo para imprimir");
        }
    }

    @Override
    public void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal, String situacao) {
        String sql = null;
        sql = "Select v from Viewvendasvisto v where ";
        boolean primeira = true;
        if (dataInicial!=null){
            sql = sql  + " v.dataVenda>='" + Formatacao.ConvercaoDataSql(dataInicial) + 
                    "' and v.dataVenda<='" + Formatacao.ConvercaoDataSql(dataFinal) + "' ";
            primeira = false;
        }
        if (cliente!=null){
            if (primeira){
                primeira = false;
                sql = sql + " v.idcliente=" + cliente.getIdcliente() + " ";
            }else {
                sql = sql + " and v.idcliente=" + cliente.getIdcliente() + " ";
            }
        } 
        if (!situacao.equalsIgnoreCase("TODAS")){
            if (primeira){
                primeira= false;
                sql = sql + " v.situacao='" + situacao + "' ";
            }else {
                sql = sql + " and v.situacao='" + situacao + "' ";
            }
        }
        if (unidade!=null){
            if (primeira){
                primeira = false;
                sql = sql + " v.idunidadeNegocio=" + unidade.getIdunidadeNegocio() + " ";
            }else {
                sql = sql + " and v.idunidadeNegocio=" + unidade.getIdunidadeNegocio() + " ";
            }
        }
        if (usuario!=null){
            if (primeira){
                primeira = false;
                sql = sql + " v.idusuario=" + usuario.getIdusuario();
            }else {
                sql = sql + " and v.idusuario=" + usuario.getIdusuario();
            }
            
        }
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("Gerencial")){
            sql = sql + " order by v.dataVenda";
        }else {
            sql = sql + " and v.idunidadeNegocio=" + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio() +  " order by v.dataVenda";
        }
        VistosController vistosController = new VistosController();
        listaVendas  = vistosController.listar(sql);
        if (listaVendas==null){
            listaVendas = new ArrayList<Viewvendasvisto>();
        }
        modelVendas = new ConsultaVendasTableModel(listaVendas);
        vendasSegurojTable.setModel(modelVendas);
        vendasSegurojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        vendasSegurojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        vendasSegurojTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        vendasSegurojTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        vendasSegurojTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        vendasSegurojTable.repaint();
    }

    @Override
    public void setImpressao(boolean termoContratacao, boolean termoCiente, boolean recibo, boolean declaracaoIsencao){
        if (termoCiente){
            imprimirTermoCiencia();
        }else if (recibo){
            imprimirRecibo();
        }else if (termoContratacao){
            imprimirTermoContratacao();
        }else if (declaracaoIsencao){
            imprimirDeclaracaoIsencao();
        }
    }
    
    
    public void imprimirTermoContratacao() {
        String url = ("telas/Visto/Relatorios/termoContratacao.jasper");
        Map parameters = new HashMap();
        try{
            parameters.put("idvendas", listaVendas.get(linha).getIdvendas());
            parameters.put("cidade", usuarioLogadoBean.getUnidadeNegocio().getCidade());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
            ex.printStackTrace();
        }
        new relatoriosJasper(url, parameters);
    }
    
    
    public void imprimirTermoCiencia() {
        int idcliente = listaVendas.get(linha).getIdcliente();
        String url = ("telas/Visto/Relatorios/termoCiencia.jasper");
        Map parameters = new HashMap();
        try {
            parameters.put("idcliente", idcliente);
            parameters.put("cidade", usuarioLogadoBean.getUnidadeNegocio().getCidade());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
            ex.printStackTrace();
        }
        new relatoriosJasper(url, parameters);
    }
    
    public void imprimirDeclaracaoIsencao() {
        String url = ("telas/Visto/Relatorios/DeclaracaoIsencao.jasper");
        Map parameters = new HashMap();
        try{
            parameters.put("idcliente", listaVendas.get(linha).getIdcliente());
            parameters.put("cidade", usuarioLogadoBean.getUnidadeNegocio().getCidade());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
            ex.printStackTrace();
        }
        new relatoriosJasper(url, parameters);
    }
    
    public void CancelarVenda(int idVenda, String nomeCliente, String dataInicio, String motivo){
        VendasController vendasController = new VendasController();
        Vendas venda = vendasController.consultarVendas(idVenda);
        if(venda!=null){
             String tipoVenda = "";
            if (venda.getVendasMatriz().equalsIgnoreCase("S")) {
                tipoVenda = "Venda pela Matriz";
            } else {
                tipoVenda = "Venda pela Loja";
            }
            FornecedorController fornecedorController = new FornecedorController();
            Fornecedor fornecedor = fornecedorController.consultar(venda.getFornecedor());
             Formatacao.emitirEmailGerencial(nomeCliente, usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), 
                usuarioLogadoBean.getUsuario().getNome(),  venda, "Ficha Cancelada", Formatacao.formatarFloatString(venda.getValor()), "I", "0,00", "R$",
                fornecedor.getNome(),  venda.getObstm(), dataInicio, " ", tipoVenda, motivo);
            venda.setObsCancelar(motivo);
            venda.setSituacao("CANCELADA");
            venda.setDatacancelamento(new Date());
            venda.setUsuariocancelamento(usuarioLogadoBean.getUsuario().getIdusuario());
            vendasController.salvar(venda);
            VistosController vistosController = new VistosController();
            List<Controlevistos> listaControle = vistosController.consultarControleVistosList(venda.getIdvendas());
            if (listaControle!=null){
                for(int i=0;i<listaControle.size();i++){
                    Controlevistos controle = listaControle.get(i);
                    controle.setSituacao("Cancelado");
                    vistosController.salvar(controle);
                }
            }
            carregarModelVendas();
        }
    }
}
