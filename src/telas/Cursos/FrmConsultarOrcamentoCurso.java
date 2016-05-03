/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos;


import controller.OrcamentoCursoController;
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
import model.Cliente;
import model.Orcamentocurso;
import model.Unidadenegocio;
import model.Usuario;
import model.view.Vieworcamentocurso;
import Singleton.ConexaoSingleton;
import telas.OrcamentoCurso.IConsultaOrcamento;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultarOrcamentoCurso extends javax.swing.JFrame implements IConsultaOrcamento{
    
    private List<Vieworcamentocurso> listaVendas;
    private ConsultaOrcamentoCursoTableModel modelVendas;
    
    private UsuarioLogadoBean usuarioLogadoBean;
    private int linha;
    private ICursos telaCurso;
    private Cliente cliente;

    /**
     * Creates new form FrmConsultarCursos
     */
    public FrmConsultarOrcamentoCurso(UsuarioLogadoBean usuarioLogadoBean, Cliente cliente, ICursos telaCurso) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.cliente = cliente;
        this.telaCurso = telaCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelVendas();
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
        orcamentoCursojTable = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Orçamento de Cursos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        orcamentoCursojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Data Inscrição", "Curso", "Unidade", "Agente"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        orcamentoCursojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orcamentoCursojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(orcamentoCursojTable);
        if (orcamentoCursojTable.getColumnModel().getColumnCount() > 0) {
            orcamentoCursojTable.getColumnModel().getColumn(0).setResizable(false);
            orcamentoCursojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
            orcamentoCursojTable.getColumnModel().getColumn(1).setResizable(false);
            orcamentoCursojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            orcamentoCursojTable.getColumnModel().getColumn(2).setResizable(false);
            orcamentoCursojTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            orcamentoCursojTable.getColumnModel().getColumn(3).setResizable(false);
            orcamentoCursojTable.getColumnModel().getColumn(3).setPreferredWidth(200);
            orcamentoCursojTable.getColumnModel().getColumn(4).setResizable(false);
            orcamentoCursojTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton5.setText("Confirmar");
        jButton5.setToolTipText("Confirma Cadastro da Ficha de Curso");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

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
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(37, 37, 37)
                .addComponent(jButton6)
                .addGap(86, 86, 86))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void orcamentoCursojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orcamentoCursojTableMouseClicked
        
    }//GEN-LAST:event_orcamentoCursojTableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int linha = orcamentoCursojTable.getSelectedRow();
        if (linha>=0){
            OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
            Orcamentocurso orcamento = orcamentoCursoController.consultar(listaVendas.get(linha).getIdorcamentoCurso());
            if (orcamento!=null){
                this.telaCurso.setOrcamentoCurso(orcamento);
                this.dispose();
            }else JOptionPane.showMessageDialog(rootPane, "Erro ao selecionar orçamento");
        }else JOptionPane.showMessageDialog(rootPane, "Selecione um orçamento");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable orcamentoCursojTable;
    // End of variables declaration//GEN-END:variables
    public void carregarModelVendas(){
        try {
            ConexaoSingleton.desconectar();
        } catch (SQLException ex) {
            Logger.getLogger(FrmConsultarCursos.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sql = "Select v from Vieworcamentocurso v where v.idunidadenegocio=" + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio() +  " "
                    + "and v.idCurso=0  and v.idcliente=" + cliente.getIdcliente() + " order by v.data";
        OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
        listaVendas = orcamentoCursoController.listarOrcamentoCurso(sql);
        if (listaVendas==null){
            listaVendas = new ArrayList<Vieworcamentocurso>();
        }
        modelVendas = new ConsultaOrcamentoCursoTableModel(listaVendas);
        orcamentoCursojTable.setModel(modelVendas);
        orcamentoCursojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        orcamentoCursojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        orcamentoCursojTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        orcamentoCursojTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        orcamentoCursojTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        orcamentoCursojTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelVendas();
    }

    @Override
    public void setImpressao(boolean ficha, boolean contrato, boolean recibo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPesquisa(Cliente cliente, Unidadenegocio unidade, Usuario usuario, Date dataInicial, Date dataFinal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}