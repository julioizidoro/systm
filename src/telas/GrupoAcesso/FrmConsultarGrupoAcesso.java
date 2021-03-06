/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.GrupoAcesso;

import controller.GrupoAcessoController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.Grupoacesso;

/**
 *
 * @author Wolverine
 */
public class FrmConsultarGrupoAcesso extends javax.swing.JFrame implements IGrupoAcesso{
    
    private List<Grupoacesso> listaGrupo;
    private ConsultaGrupoAcessoTableModel modelGrupo;
    

    /**
     * Creates new form FrmConsultarUsuario
     */
    public FrmConsultarGrupoAcesso() {
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        carregarModelGrupo();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        grupojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        AdicionarjButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        FecharrjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SysTM - Consulta Grupo de Acesso");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grupojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grupojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grupojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(grupojTable);
        if (grupojTable.getColumnModel().getColumnCount() > 0) {
            grupojTable.getColumnModel().getColumn(0).setResizable(false);
            grupojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            grupojTable.getColumnModel().getColumn(1).setResizable(false);
            grupojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        }

        BarradeTarefasjToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        AdicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton.setText("Novo");
        AdicionarjButton.setToolTipText("Adicionar Grupo de Acesso");
        AdicionarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AdicionarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setName(""); // NOI18N
        AdicionarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        AdicionarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        AdicionarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(AdicionarjButton);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Grupo de Acesso");
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

        FecharrjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        FecharrjButton1.setText("Fechar");
        FecharrjButton1.setToolTipText("Fechar");
        FecharrjButton1.setFocusable(false);
        FecharrjButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FecharrjButton1.setMaximumSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setMinimumSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setPreferredSize(new java.awt.Dimension(80, 90));
        FecharrjButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FecharrjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharrjButton1ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(FecharrjButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = grupojTable.getSelectedRow();
        if(linha>=0){
            new FrmCadastrarGrupoAcesso(listaGrupo.get(linha), this);
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void AdicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButtonActionPerformed
        new FrmCadastrarGrupoAcesso(null, this);
    }//GEN-LAST:event_AdicionarjButtonActionPerformed

    private void grupojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grupojTableMouseClicked
        int linha = grupojTable.getSelectedRow();
        if (linha >= 0) {
            if (evt.getClickCount() == 1) {
                EditarjButton.setEnabled(true);
            }
        }
    }//GEN-LAST:event_grupojTableMouseClicked

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton;
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable grupojTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void carregarModelGrupo(){
        GrupoAcessoController grupoAcessoController = new GrupoAcessoController();
        listaGrupo = grupoAcessoController.listar();
        if(listaGrupo==null){
            listaGrupo = new ArrayList<Grupoacesso>();
        }
        modelGrupo = new ConsultaGrupoAcessoTableModel(listaGrupo);
        grupojTable.setModel(modelGrupo);
        grupojTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        grupojTable.getColumnModel().getColumn(1).setPreferredWidth(300);
        grupojTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelGrupo();
    }


}
