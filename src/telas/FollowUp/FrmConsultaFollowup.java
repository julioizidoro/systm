/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.FollowUp;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.ClienteController;
import controller.FollowupController;
import controller.UsuarioController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import model.Cliente;
import model.Followup;
import model.Usuario;
import model.view.Viewcosultafollowup;
import Singleton.ConexaoSingleton;
import telas.Agenda.FrmAgenda;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaFollowup extends javax.swing.JFrame implements IFollowup{
    
    private List<Viewcosultafollowup> listaFollowup;
    private ConsultaFollowupTableModel modelFollowup;
    private UsuarioLogadoBean usuarioLogadoBean;
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
   
    

    /**
     * Creates new form FrmConsultaEventos
     */
    public FrmConsultaFollowup(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarConsultor();
        carregarModelFollowup();        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        followupjTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        situacaojButton = new javax.swing.JButton();
        situacaojButton1 = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        verjButton = new javax.swing.JButton();
        historicojButton = new javax.swing.JButton();
        FecharrjButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dataProximoContatojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jButton1 = new javax.swing.JButton();
    situcaojComboBox = new javax.swing.JComboBox();
    jLabel4 = new javax.swing.JLabel();
    consultorjComboBox = new javax.swing.JComboBox();
    jLabel5 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Consulta FollowUP");

    jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    followupjTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String [] {
            "Nome", "Situação", "Próximo Contato", "Nível Interesse", "Unidade"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    followupjTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            followupjTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(followupjTable);
    if (followupjTable.getColumnModel().getColumnCount() > 0) {
        followupjTable.getColumnModel().getColumn(0).setResizable(false);
        followupjTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        followupjTable.getColumnModel().getColumn(1).setResizable(false);
        followupjTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        followupjTable.getColumnModel().getColumn(2).setResizable(false);
        followupjTable.getColumnModel().getColumn(2).setPreferredWidth(30);
        followupjTable.getColumnModel().getColumn(3).setResizable(false);
        followupjTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        followupjTable.getColumnModel().getColumn(4).setResizable(false);
        followupjTable.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
    BarradeTarefasjToolBar3.setFloatable(false);
    BarradeTarefasjToolBar3.setRollover(true);

    AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
    AdicionarjButton3.setText("Novo");
    AdicionarjButton3.setToolTipText("Adicionar FollowUp");
    AdicionarjButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    AdicionarjButton3.setMaximumSize(new java.awt.Dimension(80, 90));
    AdicionarjButton3.setMinimumSize(new java.awt.Dimension(80, 90));
    AdicionarjButton3.setName(""); // NOI18N
    AdicionarjButton3.setPreferredSize(new java.awt.Dimension(80, 90));
    AdicionarjButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    AdicionarjButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            AdicionarjButton3ActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar3.add(AdicionarjButton3);

    EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
    EditarjButton.setText("Editar");
    EditarjButton.setToolTipText("Editar FollowUp");
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
    BarradeTarefasjToolBar3.add(EditarjButton);

    situacaojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/SITUACAO.png"))); // NOI18N
    situacaojButton.setText("Situação");
    situacaojButton.setToolTipText("Situação FollowUp");
    situacaojButton.setEnabled(false);
    situacaojButton.setFocusable(false);
    situacaojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    situacaojButton.setMaximumSize(new java.awt.Dimension(80, 90));
    situacaojButton.setMinimumSize(new java.awt.Dimension(80, 90));
    situacaojButton.setPreferredSize(new java.awt.Dimension(80, 90));
    situacaojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    situacaojButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            situacaojButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar3.add(situacaojButton);

    situacaojButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/agenda.png"))); // NOI18N
    situacaojButton1.setText("Agenda");
    situacaojButton1.setToolTipText("Situação FollowUp");
    situacaojButton1.setFocusable(false);
    situacaojButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    situacaojButton1.setMaximumSize(new java.awt.Dimension(80, 90));
    situacaojButton1.setMinimumSize(new java.awt.Dimension(80, 90));
    situacaojButton1.setPreferredSize(new java.awt.Dimension(80, 90));
    situacaojButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    situacaojButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            situacaojButton1ActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar3.add(situacaojButton1);
    BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

    verjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/VER DADOS.png"))); // NOI18N
    verjButton.setText("Ver Dados");
    verjButton.setToolTipText("Ver dados do cliente");
    verjButton.setEnabled(false);
    verjButton.setFocusable(false);
    verjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    verjButton.setMaximumSize(new java.awt.Dimension(80, 90));
    verjButton.setMinimumSize(new java.awt.Dimension(80, 90));
    verjButton.setPreferredSize(new java.awt.Dimension(80, 90));
    verjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    verjButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            verjButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar3.add(verjButton);

    historicojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/HISTORICO DE DADOS.png"))); // NOI18N
    historicojButton.setText("Histórico");
    historicojButton.setToolTipText("Historicos");
    historicojButton.setEnabled(false);
    historicojButton.setFocusable(false);
    historicojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    historicojButton.setMaximumSize(new java.awt.Dimension(80, 90));
    historicojButton.setMinimumSize(new java.awt.Dimension(80, 90));
    historicojButton.setName(""); // NOI18N
    historicojButton.setPreferredSize(new java.awt.Dimension(80, 90));
    historicojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    historicojButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            historicojButtonActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar3.add(historicojButton);

    FecharrjButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
    FecharrjButton4.setText("Fechar");
    FecharrjButton4.setToolTipText("Fechar");
    FecharrjButton4.setFocusable(false);
    FecharrjButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    FecharrjButton4.setMaximumSize(new java.awt.Dimension(80, 90));
    FecharrjButton4.setMinimumSize(new java.awt.Dimension(80, 90));
    FecharrjButton4.setPreferredSize(new java.awt.Dimension(80, 90));
    FecharrjButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
    FecharrjButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            FecharrjButton4ActionPerformed(evt);
        }
    });
    BarradeTarefasjToolBar3.add(FecharrjButton4);

    jLabel1.setText("Nome do Cliente");

    jLabel2.setText("Data Contato");

    jButton1.setText("Filtrar");
    jButton1.setToolTipText("Filtrar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    situcaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ativos", "Descontinuados" }));

    jLabel4.setText("Situação");

    jLabel5.setText("Consultor");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(dataProximoContatojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(situcaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(consultorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(177, 177, 177)
            .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButton1)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataProximoContatojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(situcaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(consultorjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(16, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharrjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton4ActionPerformed

    private void historicojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historicojButtonActionPerformed
        int linha = followupjTable.getSelectedRow();
        if (linha>=0){
            ClienteController clienteController = new ClienteController();
            Cliente cliente = clienteController.consultar(listaFollowup.get(linha).getIdcliente());
            FollowupController followupController = new FollowupController();
            Followup followup = followupController.consuiltar(listaFollowup.get(linha).getIdfollowup());
            new FrmConsultaHistorico(usuarioLogadoBean, cliente, followup, this, listaFollowup.get(linha).getDescricao());
        }

    }//GEN-LAST:event_historicojButtonActionPerformed

    private void verjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verjButtonActionPerformed
        int linha = followupjTable.getSelectedRow();
        if (linha>=0){
            new FrmVerDados(usuarioLogadoBean, listaFollowup.get(linha).getIdcliente());
        }
    }//GEN-LAST:event_verjButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = followupjTable.getSelectedRow();
        if (linha>=0){
            FollowupController followupController = new FollowupController();
            Followup followup = followupController.consuiltar(listaFollowup.get(linha).getIdfollowup());
            new FrmCadastrarFollowUp(usuarioLogadoBean, followup, this);
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        new FrmCadastrarFollowUp(usuarioLogadoBean, null, this);
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void followupjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_followupjTableMouseClicked
        EditarjButton.setEnabled(true);
        historicojButton.setEnabled(true);
        verjButton.setEnabled(true);
        situacaojButton.setEnabled(true);
    }//GEN-LAST:event_followupjTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        carregarModelFollowup();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void situacaojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaojButtonActionPerformed
        int linha = followupjTable.getSelectedRow();
        if (linha>=0){
            FollowupController followupController = new FollowupController();
            Followup followup = followupController.consuiltar(listaFollowup.get(linha).getIdfollowup());
            new FrmSituaçao(followup);
        }
    }//GEN-LAST:event_situacaojButtonActionPerformed

    private void situacaojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaojButton1ActionPerformed
        new FrmAgenda(usuarioLogadoBean);
    }//GEN-LAST:event_situacaojButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton4;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JComboBox consultorjComboBox;
    private com.toedter.calendar.JDateChooser dataProximoContatojDateChooser;
    private javax.swing.JTable followupjTable;
    private javax.swing.JButton historicojButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton situacaojButton;
    private javax.swing.JButton situacaojButton1;
    private javax.swing.JComboBox situcaojComboBox;
    private javax.swing.JButton verjButton;
    // End of variables declaration//GEN-END:variables

    public void carregarModelFollowup() {
        try {
            ConexaoSingleton.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultaFollowup.class.getName()).log(Level.SEVERE, null, ex);
        }
        TableColumnModel ColumnModel = followupjTable.getColumnModel();  
        JTableRenderer renderer = new JTableRenderer();  
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        
        String sql=null;
        String descontinuado = "";
        if (situcaojComboBox.getSelectedItem().toString().equalsIgnoreCase("Descontinuados")){
            descontinuado = "situacao='Fechou' and situacao='Desistiu' and situacao='Concorrência' ";
        }else {
            descontinuado = "situacao<>'Fechou' and situacao<>'Desistiu' and situacao<>'Concorrência' ";
        }
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("Gerencial")){
            sql = "Select a From Viewcosultafollowup a where " + descontinuado;
            if (nomejTextField.getText().length()>0){
                sql = sql +  " and nome like '%" + nomejTextField.getText() + "%'";
            }
            if (dataProximoContatojDateChooser.getDate()!=null){
                sql = sql + " and dataProximoContato='"+ Formatacao.ConvercaoDataSql(dataProximoContatojDateChooser.getDate()) + "'";
            }
        } else {
            sql = "Select a From Viewcosultafollowup a where " + descontinuado + "  and  unidadeNegocioidunidadeNegocio=" + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio();
            if (nomejTextField.getText().length()>0){
                sql = sql +  " and nome like '%" + nomejTextField.getText() + "%'";
            }
            if (dataProximoContatojDateChooser.getDate()!=null){
                sql = sql + " and dataProximoContato='"+ Formatacao.ConvercaoDataSql(dataProximoContatojDateChooser.getDate()) + "'";
            }
        }      
        if (!consultorjComboBox.getSelectedItem().toString().equalsIgnoreCase("consultor")){
            Usuario usuarioFiltro = (Usuario) consultorjComboBox.getSelectedItem();
           sql = sql + "  and usuarioIdusuario=" + usuarioFiltro.getIdusuario();
        }
        sql = sql + " order by dataProximoContato";
        FollowupController followupController = new FollowupController();
        listaFollowup = followupController.listaFollowup(sql);
        if (listaFollowup==null){
            listaFollowup = new ArrayList<Viewcosultafollowup>();
        }
        modelFollowup = new ConsultaFollowupTableModel(listaFollowup);
        followupjTable.setModel(modelFollowup);
        followupjTable.getColumnModel().getColumn(0).setCellRenderer(renderer);
        followupjTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        followupjTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        followupjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
        followupjTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        followupjTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        followupjTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        followupjTable.repaint();
    }

    @Override
    public void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setModel() {
        carregarModelFollowup();
    }
    public void limitarJText(){
        nomejTextField.setDocument(new LimiteTextoJedit(100));
    }
    
    public void carregarConsultor(){
        UsuarioController usuarioController = new UsuarioController();
        List<Usuario> listaUsuario;
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("uniade")){
            listaUsuario = usuarioController.listaUsuarioUnidade(usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio());
        }else {
            listaUsuario = usuarioController.listaUsuario();
        }
        if (listaUsuario == null) {
            listaUsuario = new ArrayList<Usuario>();
        }
        consultorjComboBox = Formatacao.preencherComobox(listaUsuario, consultorjComboBox, true, "Consultor");
    }
    
     
}
