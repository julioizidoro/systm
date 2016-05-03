/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos.Controle;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.UsuarioController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import model.Cliente;
import model.Fornecedor;
import model.Fornecedorcidade;
import model.Unidadenegocio;
import model.Usuario;
import telas.Cliente.FrmConsultaCliente;
import telas.Fornecedor.FrmConsultaFornecedor;
import telas.UnidadeNegocio.FrmConsultaUnidadeNegocio;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmFiltrarControleCurso extends javax.swing.JFrame implements IControleCurso{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Fornecedorcidade fornecedorcidade;
    private Cliente cliente;
    private UsuarioLogadoBean usuarioLogadoBean;
    private IControleCurso telaControleCursos;
    private Unidadenegocio unidadeNegocio;

    /**
     * Creates new form FrmFiltrarControleCurso
     */
    public FrmFiltrarControleCurso(UsuarioLogadoBean usuarioLogadoBean, IControleCurso telaControleCursos) {
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        this.telaControleCursos = telaControleCursos;
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitatJText();
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
        clientejTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        escolajTextField = new javax.swing.JTextField();
        unidadejButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        paisjTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        dataEmbarqueIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    dataEmbarqueFinaljDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jPanel3 = new javax.swing.JPanel();
dataPrevisaoIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    dataPrevisaoFinaljDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jPanel5 = new javax.swing.JPanel();
situacaojComboBox = new javax.swing.JComboBox();
jLabel6 = new javax.swing.JLabel();
consultorjComboBox = new javax.swing.JComboBox();
jLabel7 = new javax.swing.JLabel();
unidadejButton1 = new javax.swing.JButton();
unidadeNegociojTextField = new javax.swing.JTextField();
jPanel4 = new javax.swing.JPanel();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle(" Filtrar Controle de Curso");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

jLabel1.setText("Cliente");

clientejTextField.setEditable(false);

jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
jButton1.setText("Selecionar");
jButton1.setToolTipText("Selecionar Cliente");
jButton1.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
    }
    });

    jLabel2.setText("Escola");

    escolajTextField.setEditable(false);
    escolajTextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            escolajTextFieldActionPerformed(evt);
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

    jLabel3.setText("País");

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Data de Embarque"));

    dataEmbarqueIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataEmbarqueIniciojDateChooserFocusGained(evt);
        }
    });

    jLabel4.setText("Data Inicial");

    jLabel5.setText("Data Final");

    dataEmbarqueFinaljDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataEmbarqueFinaljDateChooserFocusGained(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(dataEmbarqueIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dataEmbarqueFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel5)))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dataEmbarqueIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dataEmbarqueFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 11, Short.MAX_VALUE))
    );

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Previsão de Pagamento"));

    dataPrevisaoIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataPrevisaoIniciojDateChooserFocusGained(evt);
        }
    });

    jLabel8.setText("Data Inicial");

    jLabel9.setText("Data Final");

    dataPrevisaoFinaljDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataPrevisaoFinaljDateChooserFocusGained(evt);
        }
    });

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(dataPrevisaoIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dataPrevisaoFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel9))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dataPrevisaoIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dataPrevisaoFinaljDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 11, Short.MAX_VALUE))
    );

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Situação"));

    situacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todas", "Cancelado", "Embarcado", "Finalizado", "Processo", "Standby", " " }));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(situacaojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(situacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    jLabel6.setText("Consultor");

    jLabel7.setText("Uninade Négocio");

    unidadejButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    unidadejButton1.setText("Selecionar");
    unidadejButton1.setToolTipText("Selecionar Unidade Négocio");
    unidadejButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            unidadejButton1ActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(escolajTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                                .addComponent(clientejTextField, javax.swing.GroupLayout.Alignment.LEADING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unidadejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(paisjTextField)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(unidadeNegociojTextField)
                                    .addGap(18, 18, 18)
                                    .addComponent(unidadejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(consultorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))))
                    .addGap(276, 276, 276))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(9, 9, 9)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(clientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel2)
            .addGap(4, 4, 4)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(escolajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(unidadejButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(consultorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(unidadejButton1)
                .addComponent(unidadeNegociojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(paisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
    jButton4.setText("Confirmar");
    jButton4.setToolTipText("Confirma Pesquisa");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
    jButton5.setText("Cancelar");
    jButton5.setToolTipText("Cancela Pesquisa");
    jButton5.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton5ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(27, Short.MAX_VALUE))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton4)
                .addComponent(jButton5))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(121, 121, 121))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unidadejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadejButtonActionPerformed
        new FrmConsultaFornecedor(usuarioLogadoBean, this, usuarioLogadoBean.getParametrosprodutos().getCursos());
    }//GEN-LAST:event_unidadejButtonActionPerformed

    private void escolajTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolajTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_escolajTextFieldActionPerformed

    private void dataEmbarqueIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEmbarqueIniciojDateChooserFocusGained

    }//GEN-LAST:event_dataEmbarqueIniciojDateChooserFocusGained

    private void dataEmbarqueFinaljDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEmbarqueFinaljDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEmbarqueFinaljDateChooserFocusGained

    private void dataPrevisaoIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataPrevisaoIniciojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPrevisaoIniciojDateChooserFocusGained

    private void dataPrevisaoFinaljDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataPrevisaoFinaljDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPrevisaoFinaljDateChooserFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int idConsultor=0;
        if (unidadeNegocio!=null){
            String consultor = consultorjComboBox.getSelectedItem().toString();
            if (!consultor.equalsIgnoreCase("Selecione")){
                Usuario usuario = (Usuario) consultorjComboBox.getSelectedItem();
                idConsultor= usuario.getIdusuario();
            }
        }
        this.telaControleCursos.setFiltrarControleCurso(cliente, fornecedorcidade, paisjTextField.getText(), dataEmbarqueIniciojDateChooser.getDate()
                , dataEmbarqueFinaljDateChooser.getDate(), dataPrevisaoIniciojDateChooser.getDate(), dataPrevisaoFinaljDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString(), idConsultor, unidadeNegocio);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.telaControleCursos.cancelarFiltroCurso();
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void unidadejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadejButton1ActionPerformed
        new FrmConsultaUnidadeNegocio(this);
    }//GEN-LAST:event_unidadejButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientejTextField;
    private javax.swing.JComboBox consultorjComboBox;
    private com.toedter.calendar.JDateChooser dataEmbarqueFinaljDateChooser;
    private com.toedter.calendar.JDateChooser dataEmbarqueIniciojDateChooser;
    private com.toedter.calendar.JDateChooser dataPrevisaoFinaljDateChooser;
    private com.toedter.calendar.JDateChooser dataPrevisaoIniciojDateChooser;
    private javax.swing.JTextField escolajTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField paisjTextField;
    private javax.swing.JComboBox situacaojComboBox;
    private javax.swing.JTextField unidadeNegociojTextField;
    private javax.swing.JButton unidadejButton;
    private javax.swing.JButton unidadejButton1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            clientejTextField.setText(cliente.getNome());
        }
    }

    @Override
    public void setEscola(Fornecedorcidade fornecedorcidade) {
        if (fornecedorcidade!=null){
            this.fornecedorcidade = fornecedorcidade;
            escolajTextField.setText(fornecedorcidade.getFornecedor().getNome());
        }
    }


    @Override
    public void cancelarFiltroCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void exportarExcel(String caminho, String nomeArquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNumeroColuna(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void limitatJText(){
        paisjTextField.setDocument(new LimiteTextoJedit(50));
    }

    
    
    public void carregarConsultor(){
        if (unidadeNegocio!=null){
            UsuarioController usuarioController = new UsuarioController();
            List<Usuario> lista = usuarioController.listaUsuarioUnidade(unidadeNegocio.getIdunidadeNegocio());
            if (lista!=null){
                consultorjComboBox = Formatacao.preencherComobox(lista, consultorjComboBox, true, "Selecione");
            }
        }
    }

    @Override
    public void setUnidadeNegocio(Unidadenegocio unidadeNegocio) {
        if (unidadeNegocio!=null){
            this.unidadeNegocio = unidadeNegocio;
            unidadeNegociojTextField.setText(unidadeNegocio.getNomeFantasia());
            carregarConsultor();
        }
    }

    @Override
    public void setDocAnexado(String tipoArquivo, int idVenda, int idControle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFiltrarControleCurso(Cliente cliente, Fornecedorcidade fornecedorcidade, String pais, Date dataEmbarqueInicial, Date dataEmbarqueFinal, Date dataPosicaoInicial, Date dataPosicaoFinal, String situacao, int idConsultor, Unidadenegocio unidadeNegocio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}