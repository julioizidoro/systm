/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProdutosOrcamento;

import controller.FiltroOrcamentoProdutoController;
import controller.ProdutoOrcamentoController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Filtroorcamentoproduto;
import model.Produtos;
import model.Produtosorcamento;
import telas.Produto.FrmConsultaProduto;
import telas.Usuarios.UsuarioLogadoBean;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaProdutosOrcamento extends javax.swing.JFrame implements IProdutoOrcamento{
    
    private List<Produtosorcamento> listaProduto;
    private ConsultaProdutosOrcamentoTableModel modelProduto;
    private UsuarioLogadoBean usuarioLogadoBean;
    private String tipo;
    private int linha=0;
    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmConsultaProdutosOrcamento(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelProduto(descricaojTextField.getText());
        limitarJText();
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
        jLabel1 = new javax.swing.JLabel();
        descricaojTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProdutosOrcamentojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        AdicionarjButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator1 = new javax.swing.JToolBar.Separator();
        AdicionarProdutojButton = new javax.swing.JButton();
        verProdutojButton = new javax.swing.JButton();
        FecharrjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Produtos Orçamento");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pesquisar Descrição Produto");

        descricaojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                descricaojTextFieldKeyReleased(evt);
            }
        });

        ProdutosOrcamentojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProdutosOrcamentojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProdutosOrcamentojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProdutosOrcamentojTable);
        ProdutosOrcamentojTable.getColumnModel().getColumn(0).setResizable(false);
        ProdutosOrcamentojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        ProdutosOrcamentojTable.getColumnModel().getColumn(1).setResizable(false);
        ProdutosOrcamentojTable.getColumnModel().getColumn(1).setPreferredWidth(300);

        BarradeTarefasjToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        AdicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton.setText("Novo");
        AdicionarjButton.setToolTipText("Adicionar Produto Orçamento");
        AdicionarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setName(""); // NOI18N
        AdicionarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(AdicionarjButton);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Produto Orçamento");
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
        BarradeTarefasjToolBar.add(EditarjButton);
        BarradeTarefasjToolBar.add(SeparadordeTarefasjSeparator1);

        AdicionarProdutojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/RELACIONAR.png"))); // NOI18N
        AdicionarProdutojButton.setText("Relacionar");
        AdicionarProdutojButton.setToolTipText("Relacionar Produtos");
        AdicionarProdutojButton.setFocusable(false);
        AdicionarProdutojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarProdutojButton.setMaximumSize(new java.awt.Dimension(80, 90));
        AdicionarProdutojButton.setMinimumSize(new java.awt.Dimension(80, 90));
        AdicionarProdutojButton.setName(""); // NOI18N
        AdicionarProdutojButton.setPreferredSize(new java.awt.Dimension(80, 90));
        AdicionarProdutojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarProdutojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarProdutojButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(AdicionarProdutojButton);

        verProdutojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/excluir.png"))); // NOI18N
        verProdutojButton.setText("Remover");
        verProdutojButton.setToolTipText("Listar Produtos");
        verProdutojButton.setFocusable(false);
        verProdutojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verProdutojButton.setMaximumSize(new java.awt.Dimension(80, 90));
        verProdutojButton.setMinimumSize(new java.awt.Dimension(80, 90));
        verProdutojButton.setName(""); // NOI18N
        verProdutojButton.setPreferredSize(new java.awt.Dimension(80, 90));
        verProdutojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        verProdutojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verProdutojButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(verProdutojButton);

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
        BarradeTarefasjToolBar.add(FecharrjButton);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(descricaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(82, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(74, 74, 74)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descricaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarProdutojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarProdutojButtonActionPerformed
        linha = ProdutosOrcamentojTable.getSelectedRow();
        if (linha>=0){
            new FrmConsultaProduto(usuarioLogadoBean, this, "relacionar");
        }
    }//GEN-LAST:event_AdicionarProdutojButtonActionPerformed

    private void FecharrjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getProdutoOrcamentoEditar()==1){
            int linha = ProdutosOrcamentojTable.getSelectedRow();
            if (linha>=0){
                new FrmCadastrarProdutoOrcamento(listaProduto.get(linha), this);
            }else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um produto orçamento");
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void AdicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getProdutoOrcamentoAdicionar()==1){
            new FrmCadastrarProdutoOrcamento(null, this);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_AdicionarjButtonActionPerformed

    private void ProdutosOrcamentojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProdutosOrcamentojTableMouseClicked
        if (evt.getClickCount()==1){
            EditarjButton.setEnabled(true);
        }
    }//GEN-LAST:event_ProdutosOrcamentojTableMouseClicked

    private void descricaojTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descricaojTextFieldKeyReleased
        carregarModelProduto(descricaojTextField.getText());
    }//GEN-LAST:event_descricaojTextFieldKeyReleased

    private void verProdutojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verProdutojButtonActionPerformed
        linha = ProdutosOrcamentojTable.getSelectedRow();
        if (linha>=0){
            new FrmConsultaProduto(usuarioLogadoBean, this, "remover");
        }
    }//GEN-LAST:event_verProdutojButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarProdutojButton;
    private javax.swing.JButton AdicionarjButton;
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton;
    private javax.swing.JTable ProdutosOrcamentojTable;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator1;
    private javax.swing.JTextField descricaojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton verProdutojButton;
    // End of variables declaration//GEN-END:variables

    public void carregarModelProduto(String nome){
        ProdutoOrcamentoController  produtoOrcamentoController = new ProdutoOrcamentoController();
        listaProduto = produtoOrcamentoController.listarProdutoOrcamento(descricaojTextField.getText());
        if (listaProduto==null){
            listaProduto = new ArrayList<Produtosorcamento>();
        }
        modelProduto = new ConsultaProdutosOrcamentoTableModel(listaProduto);
        ProdutosOrcamentojTable.setModel(modelProduto);
        ProdutosOrcamentojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        ProdutosOrcamentojTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        ProdutosOrcamentojTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelProduto("");
    }

    @Override
    public void setProdutoOrcamento(Produtos produto) {
        FiltroOrcamentoProdutoController filtroOrcamentoProdutoController = new FiltroOrcamentoProdutoController();
        Filtroorcamentoproduto filtro = new Filtroorcamentoproduto();
        filtro.setProdutos(produto);
        filtro.setProdutosorcamento(listaProduto.get(linha));
        filtroOrcamentoProdutoController.salvar(filtro);
    }

    @Override
    public void produtoExcluir(Produtos produto) {
        if (produto!=null){
            int linha = ProdutosOrcamentojTable.getSelectedRow();
            if (linha>=0){
                FiltroOrcamentoProdutoController filtroOrcamentoProdutoController = new FiltroOrcamentoProdutoController();
                Filtroorcamentoproduto filtro = filtroOrcamentoProdutoController.pesquisar(produto.getIdprodutos(), listaProduto.get(linha).getIdprodutosOrcamento());
                if (filtro!=null){
                    filtroOrcamentoProdutoController.excluir(filtro.getIdfiltroOrcamentoProduto());
                    carregarModelProduto("");
                }
            }
        }
    }
    public void limitarJText(){
        descricaojTextField.setDocument(new LimiteTextoJedit(50));
    }
}