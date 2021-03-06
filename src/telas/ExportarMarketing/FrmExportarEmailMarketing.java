/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ExportarMarketing;

import Singleton.ConexaoSingleton;
import controller.ExportarMarketingController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import telas.FrmSalvarAquivo;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmExportarEmailMarketing extends javax.swing.JFrame implements IExportarMarketing{
    
    private UsuarioLogadoBean usuarioLogadoBean;

    /**
     * Creates new form FrmExportarEmailMarketing
     */
    public FrmExportarEmailMarketing(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
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

        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        imprimirjButton3 = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        FecharrjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        imprimirjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/exportar.png"))); // NOI18N
        imprimirjButton3.setText("Exportar");
        imprimirjButton3.setToolTipText("Exportar para  Excel");
        imprimirjButton3.setFocusable(false);
        imprimirjButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imprimirjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
        imprimirjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
        imprimirjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
        imprimirjButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        imprimirjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirjButton3ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(imprimirjButton3);
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 194, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimirjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirjButton3ActionPerformed
        new FrmSalvarAquivo(this);
    }//GEN-LAST:event_imprimirjButton3ActionPerformed

    private void FecharrjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton FecharrjButton;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JButton imprimirjButton3;
    // End of variables declaration//GEN-END:variables

    public void exportarExcel(String caminho, String nomeArquivo) {
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
        int idunidade = 0;
        if (!usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("Gerencial")){
            idunidade = usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio();
        }
        ExportarMarketingController exportarMarketingController = new ExportarMarketingController();
        exportarMarketingController.ExportarExcel(nomeArquivo, local, porta, senha, banco, usuario, caminho, idunidade);
    }
}
