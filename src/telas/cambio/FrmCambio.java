/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.cambio;

import controller.CambioController;
import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Cambio;
import model.Moedas;
import Singleton.ConexaoSingleton;
import telas.ItelaPrincipal;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class FrmCambio extends javax.swing.JFrame implements ICambio{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private ConsultaMoedaTableModel modelCambio;
    private List<Cambio> listaCambio;
    private UsuarioLogadoBean usuarioLogadoBean;
    private ItelaPrincipal telaPrincipal;

    /**
     * Creates new form FrmCambio
     */
    public FrmCambio(UsuarioLogadoBean usuarioLogadoBean, ItelaPrincipal telaPrincipal) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaPrincipal = telaPrincipal;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        dataCambiojDateChooser.setDate(new Date());
        this.setLocationRelativeTo(null);
        carregarModelCambio();
        setVisible(true);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        cambiojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        EditarjButton1 = new javax.swing.JButton();
        FecharrjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dataCambiojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Câmbio");
    addWindowListener(new java.awt.event.WindowAdapter() {
        public void windowClosing(java.awt.event.WindowEvent evt) {
            fecharTela(evt);
        }
    });

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    cambiojTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "Sigla ", "Descrição", "Valor R$"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, true
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    cambiojTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cambiojTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(cambiojTable);
    cambiojTable.getColumnModel().getColumn(0).setResizable(false);
    cambiojTable.getColumnModel().getColumn(0).setPreferredWidth(20);
    cambiojTable.getColumnModel().getColumn(1).setResizable(false);
    cambiojTable.getColumnModel().getColumn(1).setPreferredWidth(280);
    cambiojTable.getColumnModel().getColumn(2).setResizable(false);
    cambiojTable.getColumnModel().getColumn(2).setPreferredWidth(80);

    BarradeTarefasjToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    BarradeTarefasjToolBar.setFloatable(false);
    BarradeTarefasjToolBar.setRollover(true);

    EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/cambio.png"))); // NOI18N
    EditarjButton.setText("Valor R$");
    EditarjButton.setToolTipText("Adicionar valor do câmbio");
    EditarjButton.setEnabled(false);
    EditarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    EditarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
    EditarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
    EditarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
    EditarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    EditarjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            EditarjButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(EditarjButton);
    BarradeTarefasjToolBar.add(SeparadordeTarefasjSeparator);

    EditarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/USUARIO.png"))); // NOI18N
    EditarjButton1.setText("E-mail");
    EditarjButton1.setToolTipText("Configurar E-mail de Notificação");
    EditarjButton1.setFocusable(false);
    EditarjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    EditarjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
    EditarjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
    EditarjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
    EditarjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    EditarjButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            EditarjButton1ActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar.add(EditarjButton1);

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
    BarradeTarefasjToolBar.add(FecharrjButton);

    jLabel1.setText("Data do Câmbio");

    dataCambiojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataCambiojDateChooserFocusGained(evt);
        }
    });

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton1.setText("Selecionar");
    jButton1.setToolTipText("");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(dataCambiojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton1)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(160, 160, 160)
            .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dataCambiojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(16, 16, 16))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(20, 20, 20))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataCambiojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataCambiojDateChooserFocusGained

    }//GEN-LAST:event_dataCambiojDateChooserFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregarModelCambio();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getFinanceirocambiovalor() == 1) {
            int linha = cambiojTable.getSelectedRow();
            if (linha >= 0) {
                new FrmCadastrarCambio(listaCambio.get(linha).getIdcambio(), this);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void cambiojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cambiojTableMouseClicked
        if (evt.getClickCount()==1){
            EditarjButton.setEnabled(true);
        }
        
    }//GEN-LAST:event_cambiojTableMouseClicked

    private void FecharrjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButtonActionPerformed
        telaPrincipal.setAlteracaoCambio();
        this.dispose();
    }//GEN-LAST:event_FecharrjButtonActionPerformed

    private void fecharTela(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_fecharTela
        
    }//GEN-LAST:event_fecharTela

    private void EditarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButton1ActionPerformed
        new FrmEmailCambio();
    }//GEN-LAST:event_EditarjButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton EditarjButton1;
    private javax.swing.JButton FecharrjButton;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable cambiojTable;
    private com.toedter.calendar.JDateChooser dataCambiojDateChooser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void carregarModelCambio(){
        listaCambio = carregarListaCambio();
        if (listaCambio==null){
            cadastarCambioDia();
            listaCambio = carregarListaCambio();
            if (listaCambio==null){
                listaCambio = new ArrayList<Cambio>();
            }
        }
        modelCambio = new ConsultaMoedaTableModel(listaCambio);
        cambiojTable.setModel(modelCambio);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        cambiojTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        cambiojTable.getColumnModel().getColumn(1).setPreferredWidth(280);
        cambiojTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
        cambiojTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        cambiojTable.repaint();
    }
    
    public List<Cambio> carregarListaCambio(){
        String data = Formatacao.ConvercaoDataSql(dataCambiojDateChooser.getDate());
        CambioController cambioController = new CambioController();
        List<Cambio> listaCambioDia = null;
        listaCambioDia = cambioController.listar(data);
        return listaCambioDia;
    }
    
    private void cadastarCambioDia(){
        CambioController cambioController = new CambioController();
        List<Moedas> listaMoedas = cambioController.listaMoedas();
        if (listaMoedas!=null){
            for(int i=0;i<listaMoedas.size();i++){
                Cambio cambio = new Cambio();
                cambio.setData(dataCambiojDateChooser.getDate());
                cambio.setMoedas(listaMoedas.get(i));
                cambio.setValor(0.0f);
                cambioController.salvar(cambio);
            }
        }
    }

    @Override
    public void setValorCambio() {
        carregarModelCambio();
    }

}
