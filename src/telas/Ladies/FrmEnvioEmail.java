/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Ladies;




import controller.ClienteController;
import controller.FormaPagamentoController;
import controller.ParcelamentoPagamentoController;
import controller.VendasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Formapagamento;
import model.Parcelamentopagamento;
import model.Vendas;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;
import util.relatoriosJasperPDF;

/**
 *
 * @author Wolverine
 */
public class FrmEnvioEmail extends javax.swing.JFrame {
    
    private UsuarioLogadoBean usuarioLogadoBean;
    private Vendas venda;
    private Cliente cliente;
    private String nomeArquivoFicha;
    private String nomeArquivoContrato;
    private String nomeArquivoRecibo;
    /**
     * Creates new form NewJFrame
     */
    public FrmEnvioEmail(int idVendas, UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.nomeArquivoContrato = null;
        this.nomeArquivoFicha = null;
        this.nomeArquivoRecibo = null;
        initComponents();
        localizarDados(idVendas);
        dejLabel.setText("De : " + usuarioLogadoBean.getUsuario().getEmail());
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
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
        parajTextField = new javax.swing.JTextField();
        CCjTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textojTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        fichajCheckBox = new javax.swing.JCheckBox();
        contratojCheckBox = new javax.swing.JCheckBox();
        recibojCheckBox = new javax.swing.JCheckBox();
        dejLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        assuntojTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        senhajPasswordField = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Envio de E-mail");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Para");

        jLabel2.setText("CC");

        textojTextArea.setColumns(20);
        textojTextArea.setRows(5);
        jScrollPane1.setViewportView(textojTextArea);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Anexos em PDF"));

        fichajCheckBox.setText("Ficha");

        contratojCheckBox.setText("Contrato");

        recibojCheckBox.setText("Recibo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fichajCheckBox)
                .addGap(30, 30, 30)
                .addComponent(contratojCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(recibojCheckBox)
                .addGap(34, 34, 34))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fichajCheckBox)
                    .addComponent(contratojCheckBox)
                    .addComponent(recibojCheckBox)))
        );

        dejLabel.setText("De :");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/anexar.png"))); // NOI18N
        jButton4.setText("Anexar");
        jButton4.setToolTipText("Enviar e-mail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setText("Assunto");

        jLabel4.setText("Senha do E-mail");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dejLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(parajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CCjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(assuntojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(senhajPasswordField))))
                        .addGap(99, 99, 99))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(dejLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(parajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assuntojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhajPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/enviar.png"))); // NOI18N
        jButton1.setText("Enviar");
        jButton1.setToolTipText("Enviar e-mail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton2.setText("Fechar");
        jButton2.setToolTipText("Cancela impressões");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton1)
                .addGap(36, 36, 36)
                .addComponent(jButton2)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msg = " ";
        if (msg.length()<5){
            char[] s = senhajPasswordField.getPassword();
            String senha="";
            for (int i=0;i<s.length;i++){
                senha+= s[i];
            }
            Formatacao f = new Formatacao();
            f.enviarEmailProdutos(parajTextField.getText(), CCjTextField.getText(), senha, usuarioLogadoBean.getUsuario().getEmail(),
                    assuntojTextField.getText(), textojTextArea.getText() , nomeArquivoFicha, nomeArquivoContrato, nomeArquivoRecibo);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (fichajCheckBox.isSelected()){
            gerarFicha();
        }
        if (contratojCheckBox.isSelected()){
            gerarContrato();
        }
        if (recibojCheckBox.isSelected()){
            gerarRecibo();
        }
        JOptionPane.showMessageDialog(rootPane, "Arquivo(s) Anexado(s) com Sucesso");
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CCjTextField;
    private javax.swing.JTextField assuntojTextField;
    private javax.swing.JCheckBox contratojCheckBox;
    private javax.swing.JLabel dejLabel;
    private javax.swing.JCheckBox fichajCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField parajTextField;
    private javax.swing.JCheckBox recibojCheckBox;
    private javax.swing.JPasswordField senhajPasswordField;
    private javax.swing.JTextArea textojTextArea;
    // End of variables declaration//GEN-END:variables

    public void localizarDados(int idVenda){
        VendasController vendasController = new VendasController();
        this.venda = vendasController.consultarVendas(idVenda);
        if (venda!=null){
            ClienteController clienteController = new ClienteController();
            cliente = clienteController.consultar(venda.getCliente());
            if (cliente!=null){
                parajTextField.setText(cliente.getEmail());
            }
        }
     }
    
    private void gerarFicha() {
        nomeArquivoFicha = "ficha" + String.valueOf(venda.getIdvendas()) + "cliente" + String.valueOf(cliente.getIdcliente()) + ".pdf";
        String localIni = System.getProperty("user.dir");
        localIni = "\\" + nomeArquivoFicha;
        String url = ("telas/Ladies/Relatorios/FichaLadiesPagina01.jasper");
            Map parameters = new HashMap();
            try {
                parameters.put("idvendas", venda.getIdvendas());
                parameters.put("SUBREPORT_DIR", "telas/Ladies/Relatorios/");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
                ex.printStackTrace();
            }
        new relatoriosJasperPDF(url, parameters, nomeArquivoFicha);
    }
    
    public void gerarContrato(){
        nomeArquivoContrato = "contrato" + String.valueOf(venda.getIdvendas()) + "cliente" + String.valueOf(cliente.getIdcliente()) + ".pdf";
        String localIni = System.getProperty("user.dir");
        localIni = "\\" + nomeArquivoContrato;
        String url = ("telas/Ladies/Relatorios/contratoLadiesPagina01.jasper");
            Map parameters = new HashMap();
            try {
                parameters.put("idvendas", venda.getIdvendas());
                parameters.put("SUBREPORT_DIR","telas/Ladies/Relatorios/");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
                ex.printStackTrace();
            }
            new relatoriosJasperPDF(url, parameters, nomeArquivoContrato);
    }
    
    public void gerarRecibo(){
        nomeArquivoRecibo = "recibo" + String.valueOf(venda.getIdvendas()) + "cliente" + String.valueOf(cliente.getIdcliente()) + ".pdf";
        String localIni = System.getProperty("user.dir");
        localIni = "\\" + nomeArquivoRecibo;
        float valorRecibo = 0.0f;
            String url = ("telas/Recibo/reciboPagamento.jasper");
            FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
            Formapagamento forma = formaPagamentoController.consultar(venda.getIdvendas());
            ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
            List<Parcelamentopagamento> listaParcelamento = parcelamentoPagamentoController.listar(forma.getIdformaPagamento());
            if (listaParcelamento!=null){
                for(int i=0;i<listaParcelamento.size();i++){
                    if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Dinheiro")){
                        valorRecibo = valorRecibo + listaParcelamento.get(i).getValorParcelamento();
                    }
                    if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("cheque")){
                        valorRecibo = valorRecibo + listaParcelamento.get(i).getValorParcelamento();
                    }
                    if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("depósito")){
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
                parameters.put("idvendas", venda.getIdvendas());
                String valorExtenso = Formatacao.valorPorExtenso(valorRecibo);
                parameters.put("valorExtenso", valorExtenso);
                parameters.put("valorRecibo", valorRecibo);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Não foi possível gerar o relatório " + ex);
                ex.printStackTrace();
            }
            new relatoriosJasperPDF(url, parameters, nomeArquivoRecibo);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Sem recibo para imprimir");
        }
    }
    
    
    
   
}
