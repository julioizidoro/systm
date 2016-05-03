/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.PesquisaProdutos;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import model.Cliente;
import model.Unidadenegocio;
import model.Usuario;
import telas.Aupair.IConsultaAupair;
import telas.Cliente.FrmConsultaCliente;
import telas.Cursos.IConsultaCursos;
import telas.HighSchool.IConsultaHighSchool;
import telas.Ladies.IConsultaLadies;
import telas.OrcamentoCurso.IConsultaOrcamento;
import telas.ProgramasTeens.IConsultaProgramasTeens;
import telas.SeguroViagem.ISeguroConsulta;
import telas.Trainee.IConsultaTrainee;
import telas.UnidadeNegocio.FrmConsultaUnidadeNegocio;
import telas.Usuarios.FrmConsultarUsuario;
import telas.Usuarios.UsuarioLogadoBean;
import telas.Visto.IVistoConsulta;
import telas.Voluntariado.IConsultaVoluntariado;
import telas.Work.IConsultaWork;

/**
 *
 * @author Wolverine
 */
public class FrmPesquisarProdutos extends javax.swing.JFrame implements IPesquisaProdutos{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private IConsultaCursos telaCursos;
    private Cliente cliente;
    private Unidadenegocio unidade;
    private Usuario consultor;
    private UsuarioLogadoBean usarioLogadoBean;
    private IConsultaAupair telaAupair;
    private IConsultaHighSchool telaHighSchool;
    private IConsultaLadies telaLadies;
    private IConsultaOrcamento telaOrcamento;
    private IConsultaProgramasTeens telaProgramasTeens;
    private ISeguroConsulta telaSeguro;
    private IVistoConsulta telaVisto;
    private IConsultaWork telaWork;
    private IConsultaVoluntariado telaVoluntariado;
    private IConsultaTrainee telaTrainee;

    /**
     * Creates new form FrmPesquisarProdutos
     */
    
    public FrmPesquisarProdutos(IConsultaWork telaWork, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaWork = telaWork;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(IConsultaVoluntariado telaVoluntariado, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaVoluntariado = telaVoluntariado;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(IConsultaTrainee telaTrainee, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaTrainee = telaTrainee;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    
    public FrmPesquisarProdutos(IVistoConsulta telaVisto, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaVisto = telaVisto;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(ISeguroConsulta telaSeguro, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaSeguro = telaSeguro;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    
    public FrmPesquisarProdutos(IConsultaProgramasTeens telaProgramasTeens, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaProgramasTeens = telaProgramasTeens;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    
    public FrmPesquisarProdutos(IConsultaCursos telaCursos, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaCursos = telaCursos;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(IConsultaAupair telaAupair, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaAupair = telaAupair;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(IConsultaHighSchool telaHighSchool, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaHighSchool = telaHighSchool;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(IConsultaLadies telaLadies, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaLadies = telaLadies;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
        }
        this.setVisible(true);
    }
    
    public FrmPesquisarProdutos(IConsultaOrcamento telaOrcamento, UsuarioLogadoBean usuarioLogadoBean) {
        this.telaOrcamento = telaOrcamento;
        this.usarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            unidadejButton.setEnabled(false);
            unidadejTextField.setEnabled(false);
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
        jLabel1 = new javax.swing.JLabel();
        clientejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        unidadejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        consultorjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    dataTerminojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel5 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
unidadejButton = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jLabel6 = new javax.swing.JLabel();
situacaojComboBox = new javax.swing.JComboBox();
jPanel2 = new javax.swing.JPanel();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Pesquisar");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

jLabel1.setText("Cliente");

jLabel2.setText("Unidade");

jLabel3.setText("Consultor");

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

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton1.setText("Selecionar");
    jButton1.setToolTipText("Selecionar Cliente");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
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

    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton3.setText("Selecionar");
    jButton3.setToolTipText("Selecionar Consultor");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    jLabel6.setText("Situação");

    situacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TODAS", "CANCELADA", "FINALIZADA", "PROCESSO" }));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(situacaojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(clientejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(unidadejTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(consultorjTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(unidadejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel6))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(clientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2)
            .addGap(1, 1, 1)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(unidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(unidadejButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel3)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(consultorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(situacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(23, 23, 23)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(27, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton4)
                .addComponent(jButton5))
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataIniciojDateChooserFocusGained

    }//GEN-LAST:event_dataIniciojDateChooserFocusGained

    private void dataTerminojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminojDateChooserFocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (telaCursos!=null){
            telaCursos.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaAupair!=null){
            telaAupair.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaHighSchool!=null){
            telaHighSchool.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaLadies!=null){
            telaLadies.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaOrcamento!=null){
            telaOrcamento.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate());
        }
        if (telaProgramasTeens!=null){
            this.telaProgramasTeens.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaSeguro!=null){
            this.telaSeguro.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaVisto!=null){
            telaVisto.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaWork!=null){
            telaWork.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if (telaVoluntariado!=null){
            telaVoluntariado.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        if(telaTrainee!=null){
            telaTrainee.setPesquisa(cliente, unidade, consultor, dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate(), situacaojComboBox.getSelectedItem().toString());
        }
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmConsultaCliente(usarioLogadoBean, this);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void unidadejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unidadejButtonActionPerformed

        new FrmConsultaUnidadeNegocio(this);
    }//GEN-LAST:event_unidadejButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new FrmConsultarUsuario(this, this.usarioLogadoBean);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField clientejTextField;
    private javax.swing.JTextField consultorjTextField;
    private com.toedter.calendar.JDateChooser dataIniciojDateChooser;
    private com.toedter.calendar.JDateChooser dataTerminojDateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox situacaojComboBox;
    private javax.swing.JButton unidadejButton;
    private javax.swing.JTextField unidadejTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            clientejTextField.setText(cliente.getNome());
        }
    }

    @Override
    public void setUnidade(Unidadenegocio unidade) {
        if (unidade!=null){
            this.unidade = unidade;
            unidadejTextField.setText(unidade.getNomeFantasia());
        }
    }

    @Override
    public void setConsultor(Usuario usuario) {
        if (usuario!=null){
            this.consultor = usuario;
            consultorjTextField.setText(usuario.getNome());
        }
    }
}
