/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Relatorios.Vendas;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.ProdutoController;
import controller.VendasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Produtos;
import model.Unidadenegocio;
import model.Usuario;
import Singleton.ConexaoSingleton;
import telas.FrmSalvarAquivo;
import telas.UnidadeNegocio.FrmConsultaUnidadeNegocio;
import telas.Usuarios.FrmConsultarUsuario;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;
import util.relatoriosJasper;

/**
 *
 * @author Wolverine
 */
public class FrmRelatorioCanalPublicidade extends javax.swing.JFrame implements IMapaVendas{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Unidadenegocio unidadeNegocio;
    private Usuario usuario;
    private Produtos produtos;
    private UsuarioLogadoBean usuarioLogadoBean;
    private String sql;

    /**
     * Creates new form FrmRelatorioVendas
     */
    public FrmRelatorioCanalPublicidade(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComgoProduto();
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejTextField.setEnabled(false);
            unidadejButton.setEnabled(false);
        }
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
        unidadejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        consultorjTextField = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        unidadejButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    dataTerminojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel5 = new javax.swing.JLabel();
jLabel6 = new javax.swing.JLabel();
produtojComboBox = new javax.swing.JComboBox();
jPanel4 = new javax.swing.JPanel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Relatório Canal de Publicidade");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

jLabel2.setText("Unidade");

jLabel3.setText("Consultor");

jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
jButton3.setText("Selecionar");
jButton3.setToolTipText("Selecionar Consultor");
jButton3.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton3ActionPerformed(evt);
    }
    });

    unidadejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    unidadejButton.setText("Selecionar");
    unidadejButton.setToolTipText("Selecionar Unidade Négocio");
    unidadejButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            unidadejButtonActionPerformed(evt);
        }
    });

    jLabel4.setText("Data Inicio");

    dataIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataIniciojDateChooserFocusGained(evt);
        }
    });

    dataTerminojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataTerminojDateChooserFocusGained(evt);
        }
    });

    jLabel5.setText("Data Término");

    jLabel6.setText("Produto");

    produtojComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            produtojComboBoxItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(produtojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(consultorjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel6))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(unidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(unidadejButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jButton3)
                .addComponent(consultorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 6, Short.MAX_VALUE)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(produtojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
    jButton1.setText("Confirmar");
    jButton1.setToolTipText("Confirmar Impressão Relatório");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
    jButton2.setText("Cancelar");
    jButton2.setToolTipText("Cancela Impressão do Relatório");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/icone_excel.gif"))); // NOI18N
    jButton4.setText("Excel");
    jButton4.setToolTipText("Exportar para Excel");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jButton1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
            .addComponent(jButton2)
            .addGap(34, 34, 34))
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE)))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton1)
                .addComponent(jButton2))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new FrmConsultarUsuario(this, usuarioLogadoBean);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void unidadejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadejButtonActionPerformed

        new FrmConsultaUnidadeNegocio(this);
    }//GEN-LAST:event_unidadejButtonActionPerformed

    private void dataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataIniciojDateChooserFocusGained

    }//GEN-LAST:event_dataIniciojDateChooserFocusGained

    private void dataTerminojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminojDateChooserFocusGained

    private void produtojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_produtojComboBoxItemStateChanged
        Object produto = produtojComboBox.getSelectedItem();
        if (produto instanceof Produtos){
            this.produtos = (Produtos) produtojComboBox.getSelectedItem();
        }else this.produtos = null;
    }//GEN-LAST:event_produtojComboBoxItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String validar = validarDadosRelatorio();
        if (validar.length()<5){
            gerarSqlRelatorioCanalPublicidade("impressora");
        }else {
            JOptionPane.showMessageDialog(rootPane, validar);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String validar = validarDadosRelatorio();
        if (validar.length()<5){
            gerarSqlRelatorioCanalPublicidade("excel");
        }else {
            JOptionPane.showMessageDialog(rootPane, validar);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField consultorjTextField;
    private com.toedter.calendar.JDateChooser dataIniciojDateChooser;
    private com.toedter.calendar.JDateChooser dataTerminojDateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JComboBox produtojComboBox;
    private javax.swing.JButton unidadejButton;
    private javax.swing.JTextField unidadejTextField;
    // End of variables declaration//GEN-END:variables

    public void gerarSqlRelatorioCanalPublicidade(String tipoSaida){
       sql = "Select distinct vendas.idVendas, vendas.dataVenda, vendas.valor,produtos.descricao as descricaoProduto, cliente.nome as nomeCliente, cliente.email, cliente.foneCelular, publicidade.descricao as publcidadeDescricao, usuario.nome as consultor,unidadenegocio.nomeFantasia, moedas.descricao as descricaoMoeda, orcamento.valorCambio,fornecedor.nome as nomeFornecedor\r\n"+
       " from\r\n" +
       " vendas join cliente on vendas.cliente_idcliente = cliente.idcliente\r\n" +
       " join produtos on vendas.produtos_idprodutos = produtos.idprodutos\r\n" +
       " join usuario on vendas.usuario_idusuario = usuario.idusuario\r\n"+
       " join UnidadeNegocio on vendas.unidadeNegocio_idunidadeNegocio = unidadeNegocio.idUnidadeNegocio\r\n" +
       " join fornecedor on vendas.fornecedor_idfornecedor = fornecedor.idfornecedor\r\n" +
       " join orcamento on vendas.idvendas = orcamento.vendas_idvendas\r\n" +
       " join cambio on orcamento.cambio_idcambio = cambio.idcambio\r\n" +
       " join moedas on cambio.moedas_idmoedas = moedas.idmoedas\r\n" +
       " join publicidade on cliente.publicidade_idpublicidade = publicidade.idpublicidade\r\n" +
       " where\r\n" +
       " vendas.dataVenda>='" +  Formatacao.ConvercaoDataSql(dataIniciojDateChooser.getDate()) + "'  and vendas.dataVenda<='" +
       Formatacao.ConvercaoDataSql(dataTerminojDateChooser.getDate()) + "'\r\n";
       if (produtos!=null){
           sql = sql + " and vendas.produtos_idProdutos="  + produtos.getIdprodutos() + "\r\n";
       }
       if (unidadeNegocio!=null){
           sql = sql + " and vendas.UnidadeNegocio_idUnidadeNegocio=" + unidadeNegocio.getIdunidadeNegocio() + "\r\n";
       }
       if (usuario!=null){
           sql = sql + " and vendas.usuario_idusuario=" + usuario.getIdusuario() + "\r\n";
       }
       if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
           sql = sql + " and vendas.UnidadeNegocio_idUnidadeNegocio=" + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio() + "\r\n";
       }
       sql = sql  + "order by vendas.dataVenda";
       if (tipoSaida.equalsIgnoreCase("impressora")){
           imprimirRelatorioMapaVendas(sql);
       }else if (tipoSaida.equalsIgnoreCase("excel")){
           new FrmSalvarAquivo(this);
       }
    }
    
    public void imprimirRelatorioMapaVendas(String sql){
        String url = ("telas/Relatorios/Vendas/reportaCanalPublicidade.jasper");
            Map parameters = new HashMap();
            try {
                parameters.put("sql", sql);
                parameters.put("dataInicial", dataIniciojDateChooser.getDate());
                parameters.put("dataFinal", dataTerminojDateChooser.getDate());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
                ex.printStackTrace();
            }
            new relatoriosJasper(url, parameters);
    }

    @Override
    public void setConsultor(Usuario usuario) {
        if (usuario!=null){
            this.usuario = usuario;
            consultorjTextField.setText(usuario.getNome());
        }else this.usuario = null;
    }

    @Override
    public void setUnidadeNegocio(Unidadenegocio unidadeNegocio) {
        if (unidadeNegocio!=null){
            this.unidadeNegocio = unidadeNegocio;
            unidadejTextField.setText(unidadeNegocio.getNomeFantasia());
        }
    }
    
    public void carregarComgoProduto(){
        ProdutoController produtoController = new ProdutoController();
        List<Produtos> listaProdutos = produtoController.listarProdutos("");
        if (listaProdutos!=null){
            produtojComboBox = Formatacao.preencherComobox(listaProdutos, produtojComboBox, true, "Nenhum Produtos Selecionado");
        }
    }
    
    public String validarDadosRelatorio(){
        String msg="";
        if (dataIniciojDateChooser.getDate()==null){
            msg = msg + "Data inicial inválida\r\n";
        }
        if (dataTerminojDateChooser.getDate()==null){
            msg = msg + "Data término inválida\r\n";
        }
        return msg;
    }

    @Override
    public void exportarExecel(String caminho, String nomeArquivo) {
        String localIni = System.getProperty("user.dir");
        localIni = localIni + "/systm.properties";
        File file = new File(localIni);
        Properties props = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            //lê os dados que estão no arquivo
            props.load(fis);
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(ConexaoSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        String banco = props.getProperty("banco");
        String local = props.getProperty("local");
        String senha = props.getProperty("senha");
        String usuario = props.getProperty("usuario");
        String porta = props.getProperty("porta");
        VendasController vendasController = new VendasController();
        vendasController.ExportarExcel(nomeArquivo, local, porta, senha, banco, usuario, caminho, sql);
    }


}
