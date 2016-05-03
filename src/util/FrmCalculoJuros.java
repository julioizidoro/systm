/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import controller.CoeficienteJurosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import model.Coeficientejuros;
import telas.Aupair.IAupair;
import telas.Cursos.ICursos;
import telas.HighSchool.IHighSchool;
import telas.Ladies.ILadies;
import telas.SeguroViagem.ISeguro;
import telas.Trainee.ITrainee;
import telas.Visto.IVistos;
import telas.Voluntariado.IVoluntariado;
import telas.Work.IWorkTravel;

/**
 *
 * @author Wolverine
 */
public class FrmCalculoJuros extends javax.swing.JFrame {
    
    private Float valorTotal;
    private Float valorJuros03;
    private Float valorJuros04;
    private IAupair telaAupair;
    private ICursos telaCurso;
    private ILadies telaLadies;
    private ISeguro telaSeguro;
    private IVistos telaVistos;
    private IWorkTravel telaWork;
    private IHighSchool telaHighSchool;
    private IVoluntariado telaVoluntariado;
    private ITrainee telaTrainee;
    
    

    /**
     * Creates new form FrmCalculoJuros
     */
    public FrmCalculoJuros(IVoluntariado telaVoluntariado, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaVoluntariado = telaVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(IAupair telaAupair, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaAupair = telaAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(ITrainee telaTrainee, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaTrainee = telaTrainee;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(ICursos telaCursos, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaCurso = telaCursos;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(ILadies telaLadies, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaLadies = telaLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(IHighSchool telaHighSchool, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaHighSchool = telaHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(ISeguro telaSeguro, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaSeguro = telaSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(IVistos telaVistos, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaVistos = telaVistos;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }   
    
    public FrmCalculoJuros(IWorkTravel telaWork, Float valorTotal) {
        this.valorTotal = valorTotal;
        this.telaWork = telaWork;
        initComponents();
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
        jPanel7 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        percEntrada03jTextField = new javax.swing.JTextField();
        valorEntrada03jTextField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        percSaldo03jTextField = new javax.swing.JTextField();
        valorSaldo03jTextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        numeroParcelas03jComboBox = new javax.swing.JComboBox();
        jLabel39 = new javax.swing.JLabel();
        valorParcela03jTextField = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        numeroParcelasjComboBox = new javax.swing.JComboBox();
        valorParcelaFinanciamentojTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculo de Juros");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opção 03 - Parcelamento em cartão de crédito em até 12X*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10))); // NOI18N

        jLabel28.setText("% Entrada");

        percEntrada03jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        percEntrada03jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                percEntrada03jTextFieldKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                percEntrada03jTextFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                percEntrada03jTextFieldKeyTyped(evt);
            }
        });

        valorEntrada03jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorEntrada03jTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                valorEntrada03jTextFieldKeyPressed(evt);
            }
        });

        jLabel29.setText("Valor da Entrada R$");

        jLabel31.setText("% Saldo");

        percSaldo03jTextField.setEditable(false);
        percSaldo03jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        valorSaldo03jTextField.setEditable(false);
        valorSaldo03jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel33.setText("Saldo Parcelar");

        numeroParcelas03jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        numeroParcelas03jComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                numeroParcelas03jComboBoxItemStateChanged(evt);
            }
        });

        jLabel39.setText("Nº Parcelas ");

        valorParcela03jTextField.setEditable(false);
        valorParcela03jTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel40.setText("Valor da Parcela");

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton5.setText("Confirmar");
        jButton5.setToolTipText("Confirma valor dos juros opção 03");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addComponent(percSaldo03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorSaldo03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(percEntrada03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(valorEntrada03jTextField)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(numeroParcelas03jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(valorParcela03jTextField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(0, 151, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percEntrada03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorEntrada03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroParcelas03jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33)
                    .addComponent(jLabel40))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percSaldo03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorSaldo03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorParcela03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opção 4 - Parcelamento em cheque, boleto ou débito em conta em até 24X via financeira*", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10))); // NOI18N

        jLabel34.setText("Numero de Parcelas");

        numeroParcelasjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        numeroParcelasjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                numeroParcelasjComboBoxItemStateChanged(evt);
            }
        });

        valorParcelaFinanciamentojTextField.setEditable(false);
        valorParcelaFinanciamentojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel35.setText("Valor da Parcela R$");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton7.setText("Confirmar");
        jButton7.setToolTipText("Confirma valor dos juros opção 04");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel35))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(numeroParcelasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(valorParcelaFinanciamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jButton7)))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorParcelaFinanciamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroParcelasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel36.setText("(parcelado em cheque via financeira)");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel36)
                .addContainerGap(392, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(215, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.setToolTipText("Cancela Ficha de Curso");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(80, 80, 80))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
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

    private void percEntrada03jTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_percEntrada03jTextFieldKeyReleased
        double percentual = 0;
        if (percEntrada03jTextField.getText().length()>0){
            percentual = Formatacao.formatarStringDouble(percEntrada03jTextField.getText());
        }
        Double saldo = 0.0;
        Double valorEntrada=0.0;
        if (percentual>0){
            valorEntrada = valorTotal * (percentual/100);
            saldo = 100- percentual;
            Double valorSaldo = valorTotal - valorEntrada;
            valorEntrada03jTextField.setText(Formatacao.formatarFloatString(valorEntrada.floatValue()));
            valorSaldo03jTextField.setText(Formatacao.formatarDoubleString(valorSaldo));
            percSaldo03jTextField.setText(Formatacao.formatarFloatString(saldo.floatValue()));
        }
    }//GEN-LAST:event_percEntrada03jTextFieldKeyReleased

    private void percEntrada03jTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_percEntrada03jTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_percEntrada03jTextFieldKeyTyped

    private void numeroParcelas03jComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numeroParcelas03jComboBoxItemStateChanged
        String numero = numeroParcelas03jComboBox.getSelectedItem().toString();
        Integer numeroParcelas = Integer.parseInt(numero);
        float valorSaldo =0;
        if (numeroParcelas>0){
            if(valorSaldo03jTextField.getText().length()>0){
                valorSaldo = Formatacao.formatarStringfloat(valorSaldo03jTextField.getText());
                if (valorSaldo>0){
                    valorJuros03 = valorSaldo;
                    CoeficienteJurosController coneficienteJurosController = new CoeficienteJurosController();
                    Coeficientejuros  cf = coneficienteJurosController.consultar(numeroParcelas);
                    valorSaldo = (float) (valorSaldo * cf.getCoeficiente());
                    valorJuros03 = (valorSaldo * numeroParcelas)-valorJuros03;
                    valorParcela03jTextField.setText(Formatacao.formatarFloatString(valorSaldo));
                }
            }
        }
    }//GEN-LAST:event_numeroParcelas03jComboBoxItemStateChanged

    private void numeroParcelasjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numeroParcelasjComboBoxItemStateChanged
        String numero = numeroParcelasjComboBox.getSelectedItem().toString();
        Integer numeroParcelas = Integer.parseInt(numero);
        if (numeroParcelas>0){
            valorJuros04 = valorTotal;
            CoeficienteJurosController coneficienteJurosController = new CoeficienteJurosController();
            Coeficientejuros  cf = coneficienteJurosController.consultar(numeroParcelas);
            Double valor = valorTotal * cf.getCoeficiente();
            valorJuros04 = (valor.floatValue() * numeroParcelas) - valorJuros04;
            valorParcelaFinanciamentojTextField.setText(Formatacao.formatarFloatString(valor.floatValue()));
        }

    }//GEN-LAST:event_numeroParcelasjComboBoxItemStateChanged

    private void percEntrada03jTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_percEntrada03jTextFieldKeyPressed
        
    }//GEN-LAST:event_percEntrada03jTextFieldKeyPressed

    private void valorEntrada03jTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorEntrada03jTextFieldKeyPressed
        Double valorEntrada = 0.0;
        if (valorEntrada03jTextField.getText().length()>0){
            valorEntrada = Formatacao.formatarStringDouble(valorEntrada03jTextField.getText());
        }
        Double saldo = 0.0;
        Double percentual=0.0;
        if (valorEntrada >0){
            percentual = (valorEntrada * 100)/ valorTotal;
            saldo = 100- percentual;
            Double valorSaldo = valorTotal - valorEntrada;
            percEntrada03jTextField.setText(Formatacao.formatarFloatString(percentual.floatValue()));
            valorSaldo03jTextField.setText(Formatacao.formatarDoubleString(valorSaldo));
            percSaldo03jTextField.setText(Formatacao.formatarFloatString(saldo.floatValue()));
        }
    }//GEN-LAST:event_valorEntrada03jTextFieldKeyPressed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (telaAupair!=null){
            this.telaAupair.setValorJuros(this.valorJuros03);
        }else if (telaCurso!=null){
            this.telaCurso.setValorJuros(valorJuros03);
        }else if (telaHighSchool!=null){
            this.telaHighSchool.setValorJuros(valorJuros03);
        }else if (telaLadies!=null){
            this.telaLadies.setValorJuros(valorJuros03);
        }else if (telaSeguro!=null){
            this.telaSeguro.setValorJuros(valorJuros03);
        }else if (telaVistos!=null){
            this.telaVistos.setValorJuros(valorJuros03);
        }else if (telaWork!=null){
            this.telaWork.setValorJuros(valorJuros03);
        }else if (telaVoluntariado!=null){
            this.telaVoluntariado.setValorJuros(valorJuros03);
        }else if (telaTrainee!=null){
            this.telaTrainee.setValorJuros(valorJuros03);
        }
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (telaAupair!=null){
            this.telaAupair.setValorJuros(this.valorJuros04);
        }else if (telaCurso!=null){
            this.telaCurso.setValorJuros(valorJuros04);
        }else if (telaHighSchool!=null){
            this.telaHighSchool.setValorJuros(valorJuros04);
        }else if (telaLadies!=null){
            this.telaLadies.setValorJuros(valorJuros04);
        }else if (telaSeguro!=null){
            this.telaSeguro.setValorJuros(valorJuros04);
        }else if (telaVistos!=null){
            this.telaVistos.setValorJuros(valorJuros04);
        }else if (telaWork!=null){
            this.telaWork.setValorJuros(valorJuros04);
        }else if (telaVoluntariado!=null){
            this.telaVoluntariado.setValorJuros(valorJuros04);
        }else if (telaTrainee!=null){
            this.telaTrainee.setValorJuros(valorJuros04);
        }
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JComboBox numeroParcelas03jComboBox;
    private javax.swing.JComboBox numeroParcelasjComboBox;
    private javax.swing.JTextField percEntrada03jTextField;
    private javax.swing.JTextField percSaldo03jTextField;
    private javax.swing.JTextField valorEntrada03jTextField;
    private javax.swing.JTextField valorParcela03jTextField;
    private javax.swing.JTextField valorParcelaFinanciamentojTextField;
    private javax.swing.JTextField valorSaldo03jTextField;
    // End of variables declaration//GEN-END:variables
}
