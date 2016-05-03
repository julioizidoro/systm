/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Agenda;

import controller.AgendaController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import model.Agenda;
import model.Cliente;
import model.view.Viewconusltaagenda;
import telas.FollowUp.FrmCadastrarFollowUp;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaEventos extends javax.swing.JFrame implements IAgenda{
    
    private List<Viewconusltaagenda> listaAgenda;
    private UsuarioLogadoBean usuarioLogadoBean;
    private ConsultaEventoTableModel modelEvento;
    private IAgenda telaAgenda;
    private Date dataAgenda;

    /**
     * Creates new form FrmConsultaEventos
     */
    public FrmConsultaEventos(UsuarioLogadoBean usuarioLogadoBean, List<Viewconusltaagenda> listaAgenda, IAgenda telaAgenda, Date dataAgenda) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.dataAgenda = dataAgenda;
        this.listaAgenda = listaAgenda;
        this.telaAgenda = telaAgenda;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModel();
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
        eventojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        EditarjButton = new javax.swing.JButton();
        ExcluirjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        ConfirmarjButton = new javax.swing.JButton();
        ConfirmarjButton1 = new javax.swing.JButton();
        FecharrjButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Eventos da Agenda");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        eventojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hora", "Evento", "Situação", "Consultor", "Unidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        eventojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eventojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(eventojTable);
        if (eventojTable.getColumnModel().getColumnCount() > 0) {
            eventojTable.getColumnModel().getColumn(0).setResizable(false);
            eventojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            eventojTable.getColumnModel().getColumn(1).setResizable(false);
            eventojTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            eventojTable.getColumnModel().getColumn(2).setResizable(false);
            eventojTable.getColumnModel().getColumn(2).setPreferredWidth(50);
            eventojTable.getColumnModel().getColumn(3).setResizable(false);
            eventojTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            eventojTable.getColumnModel().getColumn(4).setResizable(false);
            eventojTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Cliente");
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

        ExcluirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/cancelar.png"))); // NOI18N
        ExcluirjButton.setText("Cancelar");
        ExcluirjButton.setToolTipText("Cancelar Agendamento");
        ExcluirjButton.setEnabled(false);
        ExcluirjButton.setFocusable(false);
        ExcluirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ExcluirjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        ExcluirjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        ExcluirjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        ExcluirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ExcluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(ExcluirjButton);
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        ConfirmarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/confirmar.png"))); // NOI18N
        ConfirmarjButton.setText("Confirmar");
        ConfirmarjButton.setToolTipText("Confirmar Atendimento Agendado");
        ConfirmarjButton.setEnabled(false);
        ConfirmarjButton.setFocusable(false);
        ConfirmarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConfirmarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        ConfirmarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        ConfirmarjButton.setName(""); // NOI18N
        ConfirmarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        ConfirmarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ConfirmarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(ConfirmarjButton);

        ConfirmarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/pesquisar.png"))); // NOI18N
        ConfirmarjButton1.setText("Pesquisar");
        ConfirmarjButton1.setToolTipText("Pesquisar");
        ConfirmarjButton1.setFocusable(false);
        ConfirmarjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ConfirmarjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        ConfirmarjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        ConfirmarjButton1.setName(""); // NOI18N
        ConfirmarjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        ConfirmarjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ConfirmarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarjButton1ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(ConfirmarjButton1);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 812, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eventojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eventojTableMouseClicked
        if (evt.getClickCount()==1){
            EditarjButton.setEnabled(true);
            ExcluirjButton.setEnabled(true);
            ConfirmarjButton.setEnabled(true);
        }
    }//GEN-LAST:event_eventojTableMouseClicked

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = eventojTable.getSelectedRow();
        if (linha>=0){
            AgendaController agendaController = new AgendaController();
            Agenda agenda = agendaController.consultar(listaAgenda.get(linha).getIdAgenda());
            if (agenda!=null){
                new FrmCadastrarEvento(usuarioLogadoBean, agenda, dataAgenda);
            }else JOptionPane.showMessageDialog(rootPane, "Erro Editar Agenda");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void ExcluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirjButtonActionPerformed
        int linha = eventojTable.getSelectedRow();
        if (linha>=0){
            AgendaController agendaController = new AgendaController();
            Agenda agenda = agendaController.consultar(listaAgenda.get(linha).getIdAgenda());
            if (agenda!=null){
                agenda.setSituacao("Cancelado");
                agendaController.salvar(agenda);
            }else JOptionPane.showMessageDialog(rootPane, "Erro Cancelar Agenda");
        }
    }//GEN-LAST:event_ExcluirjButtonActionPerformed

    private void FecharrjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton4ActionPerformed
        telaAgenda.setEvento();
        this.dispose();
    }//GEN-LAST:event_FecharrjButton4ActionPerformed

    private void ConfirmarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarjButtonActionPerformed
        int linha = eventojTable.getSelectedRow();
        if (linha>=0){
            AgendaController agendaController = new AgendaController();
            Agenda agenda = agendaController.consultar(listaAgenda.get(linha).getIdAgenda());
            if (agenda!=null){
                agenda.setSituacao("Atendido");
                agendaController.salvar(agenda);
            }else JOptionPane.showMessageDialog(rootPane, "Erro Confirmar Agenda");
        }
    }//GEN-LAST:event_ConfirmarjButtonActionPerformed

    private void ConfirmarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarjButton1ActionPerformed
        new FrmFiltrarEventos(usuarioLogadoBean, this);
    }//GEN-LAST:event_ConfirmarjButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton ConfirmarjButton;
    private javax.swing.JButton ConfirmarjButton1;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton ExcluirjButton;
    private javax.swing.JButton FecharrjButton4;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable eventojTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void carregarModel(){
        if (listaAgenda==null){
            listaAgenda = new ArrayList<Viewconusltaagenda>();
        }
        modelEvento = new ConsultaEventoTableModel(listaAgenda);
        eventojTable.setModel(modelEvento);
        eventojTable.getColumnModel().getColumn(0).setPreferredWidth(20);
        eventojTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        eventojTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        eventojTable.getColumnModel().getColumn(3).setPreferredWidth(40);
        eventojTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        eventojTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        eventojTable.repaint();
    }

    @Override
    public void setCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEvento() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setFiltro(int consultor, int UnidadeNegocio, String hora) {
        String dataSql = Formatacao.ConvercaoDataSql(dataAgenda);
        String sql="";
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("Gerencial")){
            sql = "Select a From Viewconusltaagenda a where data='" + dataSql + "'";
        } else {
            sql = "Select a From Viewconusltaagenda a where data='" + dataSql + "' and unidadeNegocioidunidadeNegocio=" + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio();
        }       
        if (consultor>0){
            sql = sql + " and idusuario=" + consultor;
        }
        if (!hora.equalsIgnoreCase("00:00")){
            sql = sql + " and hora='" + hora + "'"; 
        }
        if (UnidadeNegocio>0){
            sql = sql + " and unidadeNegocioidunidadeNegocio=" + UnidadeNegocio;
        }
        sql = sql + " order by hora";
        AgendaController agendaController = new AgendaController();
        listaAgenda =  agendaController.listaViewAgenda(sql);
        carregarModel();
    }

}