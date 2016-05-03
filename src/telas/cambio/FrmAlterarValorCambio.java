/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.cambio;

import controller.UsuarioController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.JOptionPane;
import model.Acesso;
import model.Pincambio;
import telas.Aupair.IAupair;
import telas.Cursos.ICursos;
import telas.HighSchool.IHighSchool;
import telas.Ladies.ILadies;
import telas.OrcamentoCurso.IOrcamentoCurso;
import telas.ProgramasTeens.IProgramasTeens;
import telas.Trainee.ITrainee;
import telas.Voluntariado.IVoluntariado;
import telas.Work.IWorkTravel;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class FrmAlterarValorCambio extends javax.swing.JDialog {
    
    private IHighSchool telaHighSchool;
    private ICursos telaCurso;
    private IProgramasTeens telaProgramasTeens;
    private IOrcamentoCurso telaOrcamentoCurso;
    private IAupair telaAupair;
    private IWorkTravel telaWork;
    private ILadies telaLadies;
    private IVoluntariado telaVoluntariado;
    private Acesso acesso;
    private int idUsuario;
    private ITrainee telaTrainee;
    private Float valorAtual;

    /**
     * Creates new form FrmAlterarValorCambio
     */
    public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, IHighSchool telaHighSchool, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaHighSchool = telaHighSchool;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        this.valorAtual = valorAtual;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
    
    public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, IVoluntariado telaVoluntariado, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaVoluntariado = telaVoluntariado;
        this.valorAtual = valorAtual;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
    
    public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, ITrainee telaTrainee, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaTrainee = telaTrainee;
        this.valorAtual = valorAtual;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
    
    public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, ICursos telaCurso, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        this.telaCurso = telaCurso;
        this.valorAtual = valorAtual;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
    
    public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, ILadies telaLadies, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaLadies = telaLadies;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        this.valorAtual = valorAtual;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
    
    public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, IProgramasTeens telaProgramasTeens, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaProgramasTeens  = telaProgramasTeens;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        this.valorAtual = valorAtual;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
    
     public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, IOrcamentoCurso telaOrcamentoCurso, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaOrcamentoCurso = telaOrcamentoCurso;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        this.valorAtual = valorAtual;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
     
     
     public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, IAupair telaAupair, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.valorAtual = valorAtual;
        this.telaAupair = telaAupair;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
    }
     
     public FrmAlterarValorCambio(java.awt.Frame parent, boolean modal, IWorkTravel telaWork, Acesso acesso, int idUsuario, Float valorAtual) {
        super(parent, modal);
        this.telaWork = telaWork;
        this.valorAtual = valorAtual;
        this.acesso = acesso;
        this.idUsuario = idUsuario;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
        valorjTextField.requestFocus();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        valorjTextField = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cancelarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Cambio");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Valor do Câmbio");

        valorjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        valorjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valorjTextFieldKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(valorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton1.setText("Confirmar");
        jButton1.setToolTipText("Confirma valor do cambio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        cancelarjButton.setText("Cancelar");
        cancelarjButton.setToolTipText("Cancela valor do cambio");
        cancelarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(cancelarjButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cancelarjButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void valorjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorjTextFieldKeyTyped
       if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorjTextFieldKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String valor = "0";
        if (valorjTextField.getText().length() > 0) {
            valor = valorjTextField.getText();
            if (liberarAlteracao(Formatacao.formatarStringfloat(valor))) {
                if (telaCurso != null) {
                    telaCurso.alterarValorCambio(valor);
                } else if (telaHighSchool != null) {
                    telaHighSchool.alterarValorCambio(valor);
                } else if (telaProgramasTeens != null) {
                    telaProgramasTeens.alterarValorCambio(valor);
                } else if (telaOrcamentoCurso != null) {
                    telaOrcamentoCurso.alterarValorCambio(valor);
                } else if (telaAupair != null) {
                    telaAupair.alterarValorCambio(valor);
                } else if (telaWork != null) {
                    telaWork.alterarValorCambio(valor);
                } else if (telaLadies != null) {
                    telaLadies.alterarValorCambio(valor);
                } else if (telaVoluntariado != null) {
                    telaVoluntariado.alterarValorCambio(valor);
                }else if (telaTrainee!=null){
                    telaTrainee.alterarValorCambio(valor);
                }
            }
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarjButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarjButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField valorjTextField;
    // End of variables declaration//GEN-END:variables

    public void salvarPinCambio(Pincambio pinCambio){
        if (pinCambio!=null){
            pinCambio.setUtilizado("S");
            UsuarioController usuarioController = new UsuarioController();
            usuarioController.salvar(pinCambio);
        }
    }
    
    public boolean liberarAlteracao(Float novoValor){
        if (novoValor> valorAtual){
            return true;
        }
        if (this.telaOrcamentoCurso!=null){
            return true;
        }
        if (acesso.getEmissaoCambio()==1){
            return true;
        } else {
            String pin = JOptionPane.showInputDialog("Informe PIN de liberação");
            UsuarioController usuarioController = new UsuarioController();
            Pincambio pincambio = usuarioController.consultar(pin, idUsuario);
            if (pincambio == null) {
                JOptionPane.showMessageDialog(rootPane, "PIN inválido");
                return false;
            } else {
                salvarPinCambio(pincambio);
                return true;
            }
        }
    }

}
