/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.login;

import controller.AcessoController;
import controller.UsuarioController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import model.Acesso;
import model.Usuario;
import telas.Aupair.IAupair;
import telas.Cursos.ICursos;
import telas.HighSchool.IHighSchool;
import telas.Ladies.ILadies;
import telas.OrcamentoCurso.IOrcamentoCurso;
import telas.ProgramasTeens.IProgramasTeens;
import telas.Voluntariado.IVoluntariado;
import telas.Work.IWorkTravel;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class FrmLiberarAcesso extends javax.swing.JDialog {
    
    private Acesso acesso;
    private ICursos telaCurso;
    private IHighSchool telaHighSchool;
    private IProgramasTeens telaprogramasTeens;
    private IOrcamentoCurso telaOrcamentoCurso;
    private IAupair telaAupair;
    private IWorkTravel telaWork;
    private ILadies telaLadies;
    private IVoluntariado telaVoluntariado;

    /**
     * Creates new form FrmLiberarAcesso
     */
    public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, ICursos telaCurso) {
        super(parent, modal);
        this.telaCurso = telaCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, IVoluntariado telaVoluntariado) {
        super(parent, modal);
        this.telaVoluntariado = telaVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, IHighSchool telaHighSchool) {
        super(parent, modal);
        this.telaHighSchool = telaHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, ILadies telaLadies) {
        super(parent, modal);
        this.telaLadies = telaLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, IProgramasTeens telaprogramasTeens) {
        super(parent, modal);
        this.telaprogramasTeens =telaprogramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
     public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, IOrcamentoCurso telaOrcamentoCurso) {
        super(parent, modal);
        this.telaprogramasTeens =telaprogramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
     
     
     public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, IAupair telaAupair) {
        super(parent, modal);
        this.telaAupair = telaAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
     
     public FrmLiberarAcesso(java.awt.Frame parent, boolean modal, IWorkTravel telaWork) {
        super(parent, modal);
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

        loginjPanel = new javax.swing.JPanel();
        senhajPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        loginjButton = new javax.swing.JButton();
        sairjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loginjTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Liberar Acesso");

        loginjPanel.setBackground(new java.awt.Color(234, 238, 235));
        loginjPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        loginjPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        senhajPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhajPasswordFieldActionPerformed(evt);
            }
        });
        loginjPanel.add(senhajPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        jLabel1.setText("Senha de Acesso");
        loginjPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 20));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginjButton.setBackground(new java.awt.Color(204, 204, 204));
        loginjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        loginjButton.setText("Comfirmar");
        loginjButton.setToolTipText("Confirma entrada no sistema");
        loginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginjButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 120, -1));

        sairjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        sairjButton.setText("Fechar");
        sairjButton.setToolTipText("Sair do Sistema");
        sairjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairjButtonfecharMovimentoCaixa(evt);
            }
        });
        jPanel3.add(sairjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 6, 100, -1));

        loginjPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 250, 40));

        jLabel2.setText("Login do Usuário");
        loginjPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));
        loginjPanel.add(loginjTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void senhajPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhajPasswordFieldActionPerformed
        loginjButtonActionPerformed(evt);
    }//GEN-LAST:event_senhajPasswordFieldActionPerformed

    private void loginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginjButtonActionPerformed
        UsuarioController usuarioController = new UsuarioController();
        Usuario usuario;
        String senha = "";
        if (senhajPasswordField.getPassword().length > 0) {
            usuario = usuarioController.consultar(loginjTextField.getText(), senha);
            if (usuario == null) {
                JOptionPane.showMessageDialog(rootPane, "Dados incorretos");
                this.dispose();
            } else {
                AcessoController acessoController = new AcessoController();
                acesso = acessoController.consultar(usuario.getIdusuario());
                if (telaCurso!=null){
                    telaCurso.liberarAltercaoCambio(acesso);
                }
                if (telaHighSchool!=null){
                    telaHighSchool.liberarAltercaoCambio(acesso);
                }
                if (telaprogramasTeens!=null){
                    telaprogramasTeens.liberarAltercaoCambio(acesso);
                }
                if (telaOrcamentoCurso!=null){
                    telaOrcamentoCurso.liberarAltercaoCambio(acesso);
                }
                if (telaAupair!=null){
                    telaAupair.liberarAltercaoCambio(acesso);
                }
                if (telaWork!=null){
                    this.telaWork.liberarAltercaoCambio(acesso);
                }
                if (telaLadies!=null){
                    this.telaLadies.liberarAltercaoCambio(acesso);
                }
                if (telaVoluntariado!=null){
                    this.telaVoluntariado.liberarAltercaoCambio(acesso);
                }
                this.dispose();
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Campo senha em branco");
        }
    }//GEN-LAST:event_loginjButtonActionPerformed

    private void sairjButtonfecharMovimentoCaixa(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairjButtonfecharMovimentoCaixa
        this.dispose();
    }//GEN-LAST:event_sairjButtonfecharMovimentoCaixa

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginjButton;
    private javax.swing.JPanel loginjPanel;
    private javax.swing.JTextField loginjTextField;
    private javax.swing.JButton sairjButton;
    private javax.swing.JPasswordField senhajPasswordField;
    // End of variables declaration//GEN-END:variables
}
