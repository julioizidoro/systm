/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Coeficiente;

import controller.CoeficienteJurosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Coeficientejuros;
import telas.Cliente.FrmCadastrarCliente;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaCoeficienteJuros extends javax.swing.JFrame implements ICoeficienteJuros{
    
    private List<Coeficientejuros> lista;
    private ConsultaCoeficienteTableModel model;
    private UsuarioLogadoBean usuarioLogadoBean;
    

    /**
     * Creates new form FrmConsultaCoeficienteJuros
     */
    public FrmConsultaCoeficienteJuros(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setModel();
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
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        FecharrjButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        coeficientejTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Coeficiente de Juros");

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Novo");
        AdicionarjButton3.setToolTipText("Adicionar Coeficiente");
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
        EditarjButton.setToolTipText("Editar Coeficiente");
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
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        FecharrjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/fechar.png"))); // NOI18N
        FecharrjButton2.setText("Fechar");
        FecharrjButton2.setToolTipText("Fechar");
        FecharrjButton2.setFocusable(false);
        FecharrjButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        FecharrjButton2.setMaximumSize(new java.awt.Dimension(80, 90));
        FecharrjButton2.setMinimumSize(new java.awt.Dimension(80, 90));
        FecharrjButton2.setPreferredSize(new java.awt.Dimension(80, 90));
        FecharrjButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        FecharrjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharrjButton2ActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(FecharrjButton2);

        coeficientejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Número de Parcelas", "Valor do Coeficiente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        coeficientejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                coeficientejTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(coeficientejTable);
        if (coeficientejTable.getColumnModel().getColumnCount() > 0) {
            coeficientejTable.getColumnModel().getColumn(0).setResizable(false);
            coeficientejTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(124, 124, 124)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(293, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (usuarioLogadoBean.getAcesso().getCoeficienteIncluir()==1){
            new FrmCadastrarCoeficienteJuros(null, this);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getCoeficienteEditar()==1){
            int linha = coeficientejTable.getSelectedRow();
            if (linha>=0){
                new FrmCadastrarCoeficienteJuros(lista.get(linha), this);
            }else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um Coeficiente");
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void FecharrjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton2ActionPerformed

    private void coeficientejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_coeficientejTableMouseClicked
        EditarjButton.setEnabled(true);
    }//GEN-LAST:event_coeficientejTableMouseClicked

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton2;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable coeficientejTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setModel() {
        CoeficienteJurosController coeficienteJurosController = new CoeficienteJurosController();
        lista = coeficienteJurosController.listar();
        if (lista==null){
            lista = new ArrayList<Coeficientejuros>();
        }
        model = new ConsultaCoeficienteTableModel(lista);
        coeficientejTable.setModel(model);
        coeficientejTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        coeficientejTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        coeficientejTable.repaint();
    }

    


}