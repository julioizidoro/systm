/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Trainee.Valores;

import controller.CambioController;
import controller.ProdutoOrcamentoController;
import controller.ValorTraineeController;
import controller.ValorWorkController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedorcidade;
import model.Moedas;
import model.Produtosorcamento;
import model.Valorestrainee;
import model.Valoreswork;
import telas.Fornecedor.FrmConsultaFornecedor;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmCadastrarValoresTrainee extends javax.swing.JFrame implements IValoresTrainee{
    
    private Fornecedorcidade fornecedorCidade;
    private Valorestrainee valoresTrainee;
    private UsuarioLogadoBean usuarioLogadoBean;

    /**
     * Creates new form FrmCadastrarValoresHighSchool
     */
    public FrmCadastrarValoresTrainee(UsuarioLogadoBean usuarioLogadoBean, Valorestrainee valores) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.valoresTrainee = valores;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBox();
        iniciaizarDados();
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
        fornecedorjTextField = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        duracaojTextField = new javax.swing.JTextField();
        valornetjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        moedasVendasjComboBox = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        produtojComboBox = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valorgrossjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        moedasComissaojComboBox = new javax.swing.JComboBox();
        valorPremiumjTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        valorExpressjTextField = new javax.swing.JTextField();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Valores Trainee");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Fornecedor");

        fornecedorjTextField.setEditable(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
        jButton7.setText("Selecionar");
        jButton7.setToolTipText("Selecionar Fornecedor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setText("Período");

        valornetjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valornetjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valornetjTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Valor Net");

        jLabel5.setText("Moeda");

        jLabel6.setText("Produto Orçamento");

        jLabel7.setText("Valor Gross");

        valorgrossjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorgrossjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorgrossjTextFieldKeyTyped(evt);
            }
        });

        jLabel8.setText("Moeda Comissão");

        valorPremiumjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorPremiumjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorPremiumjTextFieldKeyTyped(evt);
            }
        });

        jLabel9.setText("Comissão Premium");

        jLabel10.setText("Comissão Express");

        valorExpressjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorExpressjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorExpressjTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(duracaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(valornetjTextField))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(valorgrossjTextField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fornecedorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moedasVendasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(produtojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moedasComissaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorPremiumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorExpressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fornecedorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(duracaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorgrossjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valornetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(produtojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moedasVendasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moedasComissaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorExpressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(valorPremiumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton5.setText("Confirmar");
        jButton5.setToolTipText("Confirma Cadastro");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.setToolTipText("Cancela Cadastro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(jButton6)
                .addGap(86, 86, 86))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new FrmConsultaFornecedor(usuarioLogadoBean, this, usuarioLogadoBean.getParametrosprodutos().getTrainee());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String msg = validarDados();
        if (msg.length() < 5) {
            valoresTrainee.setDescricao(duracaojTextField.getText());
            Moedas moeda = (Moedas) moedasVendasjComboBox.getSelectedItem();
            valoresTrainee.setMoedas(moeda);
            moeda = (Moedas) moedasComissaojComboBox.getSelectedItem();
            valoresTrainee.setMoedas1(moeda);
            valoresTrainee.setFornecedorcidade(fornecedorCidade);
            valoresTrainee.setValornet(Formatacao.formatarStringfloat(valornetjTextField.getText()));
            valoresTrainee.setValorgross(Formatacao.formatarStringfloat(valorgrossjTextField.getText()));
            valoresTrainee.setComissaoexpress(Formatacao.formatarStringfloat(valorExpressjTextField.getText()));
            valoresTrainee.setComissaopremium(Formatacao.formatarStringfloat(valorPremiumjTextField.getText()));
            Produtosorcamento produto = (Produtosorcamento) produtojComboBox.getSelectedItem();
            valoresTrainee.setProdutosorcamento(produto);
            ValorTraineeController valorTraineeController = new ValorTraineeController();
            valorTraineeController.salvar(valoresTrainee);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void valornetjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valornetjTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321-,";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valornetjTextFieldKeyTyped

    private void valorgrossjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorgrossjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorgrossjTextFieldKeyTyped

    private void valorPremiumjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorPremiumjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorPremiumjTextFieldKeyTyped

    private void valorExpressjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorExpressjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorExpressjTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duracaojTextField;
    private javax.swing.JTextField fornecedorjTextField;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JComboBox moedasComissaojComboBox;
    private javax.swing.JComboBox moedasVendasjComboBox;
    private javax.swing.JComboBox produtojComboBox;
    private javax.swing.JTextField valorExpressjTextField;
    private javax.swing.JTextField valorPremiumjTextField;
    private javax.swing.JTextField valorgrossjTextField;
    private javax.swing.JTextField valornetjTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFornecedor(Fornecedorcidade fornecedorCidade) {
        if (fornecedorCidade!=null){
            this.fornecedorCidade= fornecedorCidade;
            fornecedorjTextField.setText(fornecedorCidade.getFornecedor().getNome());
        }
    }

    @Override
    public void setModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void iniciaizarDados(){
        if (valoresTrainee!=null){
            duracaojTextField.setText(valoresTrainee.getDescricao());
            valornetjTextField.setText(Formatacao.formatarFloatString(valoresTrainee.getValornet()));
            valornetjTextField.setText(Formatacao.formatarFloatString(valoresTrainee.getValorgross()));
            valorExpressjTextField.setText(Formatacao.formatarFloatString(valoresTrainee.getComissaoexpress()));
            valorPremiumjTextField.setText(Formatacao.formatarFloatString(valoresTrainee.getComissaopremium()));
            moedasVendasjComboBox.setSelectedItem(valoresTrainee.getMoedas());
            moedasComissaojComboBox.setSelectedItem(valoresTrainee.getMoedas1());
            produtojComboBox.setSelectedItem(valoresTrainee.getProdutosorcamento());
        }else {
            valoresTrainee = new Valorestrainee();
        }
    }
    
    public String validarDados(){
        String msg ="";
        if (duracaojTextField.getText().length()==0){
            msg = msg + "Campo Destino não preenchido\r\n";
        }
        if (valornetjTextField.getText().length()==0){
            msg = msg + "Campo valor não preenchido\r\n";
        }
        if (fornecedorCidade==null){
            msg = msg + "Fornecedor não informada\r\n";
        }
        return msg;
    }
    
    public void carregarComboBox(){
        ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
        List<Produtosorcamento> listaProdutos = produtoOrcamentoController.listarProdutoOrcamento("");
        if (listaProdutos!=null){
            produtojComboBox = Formatacao.preencherComobox(listaProdutos, produtojComboBox, false, null);
        }
        CambioController cambioController = new CambioController();
        List<Moedas> listaMoedas = cambioController.listaMoedas();
        moedasVendasjComboBox = Formatacao.preencherComobox(listaMoedas, moedasVendasjComboBox, false, null);
        moedasComissaojComboBox = Formatacao.preencherComobox(listaMoedas, moedasComissaojComboBox, false, null);
    }
    
    public void limitarJText(){
        duracaojTextField.setDocument(new LimiteTextoJedit(50));
    }
}
