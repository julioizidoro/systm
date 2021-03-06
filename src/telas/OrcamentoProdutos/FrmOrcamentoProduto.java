/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoProdutos;

import static com.lowagie.text.pdf.PdfFileSpecification.url;
import controller.CambioController;
import controller.ParametrosProdutosController;
import controller.ProdutoController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Cambio;
import model.Fornecedor;
import model.Moedas;
import model.Parametrosprodutos;
import model.Produtos;
import telas.Aupair.Valores.FrmConsultaValoresAupair;
import telas.HighSchool.Valores.FrmConsultaValoresHighSchool;
import telas.OrcamentoProdutos.Relatorio.RelOrcamentoProdutoBean;
import telas.Usuarios.UsuarioLogadoBean;
import telas.Work.Valores.FrmConsultaValoresWork;
import util.Formatacao;
import util.relatoriosJasper;

/**
 *
 * @author Wolverine
 */
public class FrmOrcamentoProduto extends javax.swing.JFrame implements IOrcamentoProduto{
    
    private List<OrcamentoProdutoBean> listaProduto;
    private OrcamentoProdutoTableModel modelProduto;
    private Produtos produto;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Date dataCambio;
    private Cambio cambio;
    private float valorCambio;

    /**
     * Creates new form FrmOrcamentoProduto
     */
    public FrmOrcamentoProduto(int produto, UsuarioLogadoBean usuarioLogadoBean, Date dataCambio) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.dataCambio = dataCambio;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarProduto(produto);
        carregarComboMoedas();
        setModel();
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
        descricaoProdutojTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        orcamentojTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        moedaCambiojComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        valorCambiojTextField = new javax.swing.JTextField();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        EditarjButton = new javax.swing.JButton();
        EditarjButton2 = new javax.swing.JButton();
        FecharrjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Orçamento");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Produto");

        descricaoProdutojTextField.setEditable(false);

        orcamentojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Fornecedor", "Cidade", "Pais", "Cambio", "Valor Estrangeira", "Valor Real"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(orcamentojTable);
        if (orcamentojTable.getColumnModel().getColumnCount() > 0) {
            orcamentojTable.getColumnModel().getColumn(0).setResizable(false);
            orcamentojTable.getColumnModel().getColumn(1).setResizable(false);
            orcamentojTable.getColumnModel().getColumn(2).setResizable(false);
            orcamentojTable.getColumnModel().getColumn(3).setResizable(false);
            orcamentojTable.getColumnModel().getColumn(4).setResizable(false);
            orcamentojTable.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel2.setText("Câmbio");

        moedaCambiojComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                moedaCambiojComboBoxItemStateChanged(evt);
            }
        });

        jLabel3.setText("Valor R$");

        valorCambiojTextField.setEditable(false);
        valorCambiojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(descricaoProdutojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(99, 99, 99))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(moedaCambiojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(valorCambiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 50, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descricaoProdutojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moedaCambiojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCambiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Adicionar");
        AdicionarjButton3.setToolTipText("Novo orçamento");
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
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/excluir.png"))); // NOI18N
        EditarjButton.setText("Excluir");
        EditarjButton.setToolTipText("Excluir");
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

        EditarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/imprimir.png"))); // NOI18N
        EditarjButton2.setText("Imprimir");
        EditarjButton2.setToolTipText("Imprimir Orçamento");
        EditarjButton2.setFocusable(false);
        EditarjButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        EditarjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        EditarjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        EditarjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        EditarjButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        EditarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarjButton2ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(EditarjButton2);

        FecharrjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        FecharrjButton1.setText("Fechar");
        FecharrjButton1.setToolTipText("Fechar");
        FecharrjButton1.setFocusable(false);
        FecharrjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FecharrjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FecharrjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharrjButton1ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(FecharrjButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(196, 196, 196)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(196, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(257, 257, 257)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moedaCambiojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_moedaCambiojComboBoxItemStateChanged
        Object obj = moedaCambiojComboBox.getSelectedItem();
        Moedas moeda = null;
        if (obj instanceof Moedas) {
            moeda = (Moedas) obj;
        }
        if (moeda != null) {
            CambioController cambioController = new CambioController();
            cambio = cambioController.consultarCambioMoeda(Formatacao.ConvercaoDataSql(dataCambio), moeda.getIdmoedas());
            if (cambio != null) {
                setCambio(cambio.getValor());
            } else {
                if (!moeda.getDescricao().equalsIgnoreCase("Outras")) {
                    JOptionPane.showMessageDialog(rootPane, "Câmbio não Cadastrado");
                }
            }
        }
    }//GEN-LAST:event_moedaCambiojComboBoxItemStateChanged

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (moedaCambiojComboBox.getSelectedItem().toString().equalsIgnoreCase("Nenhum")) {
            JOptionPane.showMessageDialog(rootPane, "Selecione câmbio primeiro");
        } else {
            ParametrosProdutosController parametrosProdutosController = new ParametrosProdutosController();
            Parametrosprodutos parametrosprodutos = parametrosProdutosController.consultar();
            if (produto.getIdprodutos() == parametrosprodutos.getHighSchool()) {
                new FrmConsultaValoresHighSchool(usuarioLogadoBean, this);
            } else if (produto.getIdprodutos() == parametrosprodutos.getWork()) {
                new FrmConsultaValoresWork(usuarioLogadoBean, this);
            } else if (produto.getIdprodutos() == parametrosprodutos.getAupair()) {
                new FrmConsultaValoresAupair(usuarioLogadoBean, this);
            }
        }
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = orcamentojTable.getSelectedRow();
        if (linha >= 0) {
            listaProduto.remove(linha);
            setModel();
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void EditarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButton2ActionPerformed
        if (listaProduto.size()>0){
            imprimirOrcamentoProduto();
        }else JOptionPane.showMessageDialog(rootPane, "Sem Orçamento para imprimir");
    }//GEN-LAST:event_EditarjButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton EditarjButton2;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTextField descricaoProdutojTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox moedaCambiojComboBox;
    private javax.swing.JTable orcamentojTable;
    private javax.swing.JTextField valorCambiojTextField;
    // End of variables declaration//GEN-END:variables

    public void setModel(){
        if (listaProduto==null){
            listaProduto = new ArrayList<OrcamentoProdutoBean>();
        }
        modelProduto = new OrcamentoProdutoTableModel(listaProduto);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        orcamentojTable.setModel(modelProduto);
        orcamentojTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        orcamentojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        orcamentojTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        orcamentojTable.getColumnModel().getColumn(3).setCellRenderer(renderer);
        orcamentojTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        orcamentojTable.getColumnModel().getColumn(4).setCellRenderer(renderer);
        orcamentojTable.getColumnModel().getColumn(4).setPreferredWidth(80);
        orcamentojTable.getColumnModel().getColumn(5).setCellRenderer(renderer);
        orcamentojTable.getColumnModel().getColumn(5).setPreferredWidth(80);
        orcamentojTable.repaint();
    }
    
    public void carregarComboMoedas(){
        CambioController cambioController = new CambioController();
        List<Moedas> listaMoedas = cambioController.listaMoedas();
        if (listaMoedas!=null){
            moedaCambiojComboBox = Formatacao.preencherComobox(listaMoedas, moedaCambiojComboBox, true, "Nenhum");
        }
    }
    
    public void setCambio(Float valorCambio) {
        valorCambiojTextField.setText(Formatacao.formatarFloatString(valorCambio));
        this.valorCambio = valorCambio;
    }

    @Override
    public void setFornecedor(Fornecedor fornecedor, String descricao, float valorMoedaEstrangeira) {
        if (fornecedor!=null){
            OrcamentoProdutoBean orcamentoProdutoBean = new OrcamentoProdutoBean();
            orcamentoProdutoBean.setNomeFornecedor(fornecedor.getNome());
            orcamentoProdutoBean.setCidadeFornecedor(fornecedor.getCidade());
            orcamentoProdutoBean.setPaisFornecedor(fornecedor.getPais());
            orcamentoProdutoBean.setDescricao(descricao);
            orcamentoProdutoBean.setValorCambio(cambio.getValor());
            orcamentoProdutoBean.setSiglaMoeda(moedaCambiojComboBox.getSelectedItem().toString());
            orcamentoProdutoBean.setValorMoedaEstrangeira(valorMoedaEstrangeira);
            orcamentoProdutoBean.setValorMoedaNacional(valorMoedaEstrangeira * cambio.getValor());
            listaProduto.add(orcamentoProdutoBean);
            setModel();
        }
    }
    
    public void carregarProduto(int idProduto){
        ProdutoController produtoController = new ProdutoController();
        this.produto = produtoController.consultar(idProduto);
        descricaoProdutojTextField.setText(produto.getDescricao());
    }
    
    public void imprimirOrcamentoProduto(){
            RelOrcamentoProdutoBean relOrcamento = new RelOrcamentoProdutoBean();
            relOrcamento.setListaProduto(listaProduto);
            String url = ("telas/OrcamentoProdutos/Relatorio/orcamentoProdutos.jasper");
            Map parameters = new HashMap();
            try {
                parameters.put("nomeFantasia", usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia());
                parameters.put("fone", usuarioLogadoBean.getUnidadeNegocio().getFone());
                parameters.put("produto", descricaoProdutojTextField.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
                ex.printStackTrace();
            }
            new relatoriosJasper(url, parameters, true);
    }

}
