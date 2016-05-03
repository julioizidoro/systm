/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Visto;

import telas.Cursos.*;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;

/**
 *
 * @author Wolverine
 */
public class FrmEscolherRelatorios extends javax.swing.JDialog {
    
    private IVistoConsulta telaConsulta;

    /**
     * Creates new form FrmEscolherRelatorios
     */
    public FrmEscolherRelatorios(java.awt.Frame parent, boolean modal, IVistoConsulta telaConsulta) {
        super(parent, modal);
        this.telaConsulta = telaConsulta;
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

        relatoriobuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        termoContratacaojCheckBox = new javax.swing.JCheckBox();
        recibojCheckBox = new javax.swing.JCheckBox();
        termoCienciajCheckBox = new javax.swing.JCheckBox();
        declaracaoIsencaojCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Impressão");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        relatoriobuttonGroup.add(termoContratacaojCheckBox);
        termoContratacaojCheckBox.setText("Termo de Contratação");

        relatoriobuttonGroup.add(recibojCheckBox);
        recibojCheckBox.setText("Recibo");

        relatoriobuttonGroup.add(termoCienciajCheckBox);
        termoCienciajCheckBox.setText("Termo de Ciência");

        relatoriobuttonGroup.add(declaracaoIsencaojCheckBox);
        declaracaoIsencaojCheckBox.setText("Declaração de Isenção");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(termoContratacaojCheckBox)
                    .addComponent(recibojCheckBox))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(declaracaoIsencaojCheckBox)
                    .addComponent(termoCienciajCheckBox))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(termoContratacaojCheckBox)
                    .addComponent(termoCienciajCheckBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(recibojCheckBox)
                    .addComponent(declaracaoIsencaojCheckBox))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton1.setText("Confirma");
        jButton1.setToolTipText("Confirma impressão");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton2.setText("Cancela");
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
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean termoCiencia = false;
        boolean termoContratacao = false;
        boolean recibo = false;
        boolean declaracaoIsencao = false;
        if (termoContratacaojCheckBox.isSelected()){
            termoContratacao = true;
        } else if (recibojCheckBox.isSelected()){
            recibo = true;
        }else if (termoCienciajCheckBox.isSelected()){
            termoCiencia = true;
        }else if (declaracaoIsencaojCheckBox.isSelected()){
            declaracaoIsencao=true;
        }
        this.dispose();
        this.telaConsulta.setImpressao(termoContratacao, termoCiencia, recibo, declaracaoIsencao);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox declaracaoIsencaojCheckBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox recibojCheckBox;
    private javax.swing.ButtonGroup relatoriobuttonGroup;
    private javax.swing.JCheckBox termoCienciajCheckBox;
    private javax.swing.JCheckBox termoContratacaojCheckBox;
    // End of variables declaration//GEN-END:variables
}