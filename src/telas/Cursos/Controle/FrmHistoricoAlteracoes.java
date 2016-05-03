/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos.Controle;

import controller.HistoricoCursosController;
import controller.ItensAlteradosCursosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.TableModel;
import model.Historicocursos;
import model.Itensalteradoscurso;
import util.Formatacao;

/**
 *
 * @author Julio
 */
public class FrmHistoricoAlteracoes extends javax.swing.JFrame {
    
    private List<Itensalteradoscurso> listaItensAlteradosCursos;
    private ConsultaControleHistoricoCursosTableModel modelHistoricoCursos;
    
    
    /**
     * Creates new form FrmHistoricoAlteracoes
     */
    public FrmHistoricoAlteracoes() {
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarHistoricoCursos();
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
        historicoCursojTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        itensAlteradosCursosjTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        historicoCursojTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Data de Alteração", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historicoCursojTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historicoCursojTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(historicoCursojTable1);
        if (historicoCursojTable1.getColumnModel().getColumnCount() > 0) {
            historicoCursojTable1.getColumnModel().getColumn(0).setResizable(false);
        }

        itensAlteradosCursosjTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Campo", "Anterior", "Atual"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(itensAlteradosCursosjTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void historicoCursojTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historicoCursojTable1MouseClicked
        int linha = historicoCursojTable1.getSelectedRow();
        if (linha >= 0) {
            HistoricoCursosController historicoCursoController = new HistoricoCursosController();
            Historicocursos historicocursos = historicoCursoController.consultarHistoricoCursos(linha);
//            carregarItensAlterados(historicocursos.getHistoricoCursosList().get(linha).getIdhistoricocursos());
        }
    }//GEN-LAST:event_historicoCursojTable1MouseClicked

    public void carregarItensAlterados(int idHistoricoCurso){
        ItensAlteradosCursosController itensAlteradosCursosController = new ItensAlteradosCursosController();
         String sql = "SELECT i From Itensalteradoscurso i where i.historicocursos.idhistoricocursos=" + idHistoricoCurso;
                   // + " and f.cidade.idcidade=" + idcidade + " order by f.fornecedor.nome";
    }
    
    public void carregarHistoricoCursos(){
        HistoricoCursosController historicoCursosController = new HistoricoCursosController();
        String sql = "Select h from historicocursos h where ";
        List<Historicocursos> historicocursoss = historicoCursosController.listar(null);
        if (historicocursoss == null) {
            historicocursoss = new ArrayList<Historicocursos>();
        }
        modelHistoricoCursos = new ConsultaControleHistoricoCursosTableModel(historicocursoss);
        historicoCursojTable1.setModel((TableModel) modelHistoricoCursos);
        historicoCursojTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        historicoCursojTable1.getColumnModel().getColumn(1).setPreferredWidth(20);
        historicoCursojTable1.repaint();
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historicoCursojTable1;
    private javax.swing.JTable itensAlteradosCursosjTable2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
