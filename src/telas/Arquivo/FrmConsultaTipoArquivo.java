/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Arquivo;

import controller.ArquivosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Tipoarquivo;
import model.Tipoarquivousuario;
import model.Usuario;
import model.view.Viewtipoarquivousuario;
import telas.Usuarios.FrmConsultarUsuario;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaTipoArquivo extends javax.swing.JFrame implements  ITipoArquivo{
    
    private UsuarioLogadoBean usuarioLogadoBean;
    private List<Tipoarquivo> listaTipo;
    private List<Viewtipoarquivousuario> listaUsuairo;
    private ConsultarTipoArquivoTableModel modelTipo;
    private ConsultarUsuarioTableModel modelUsuairo;
    private int linha;

    /**
     * Creates new form FrmConsultaTipoArquivo
     */
    public FrmConsultaTipoArquivo(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelTipoArquivo();
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
        tipojTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        usuairojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        AdicionarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator1 = new javax.swing.JToolBar.Separator();
        EditarjButton = new javax.swing.JButton();
        UsuariojButton = new javax.swing.JButton();
        FecharrjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Tipo de Arquivo");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tipojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Descricao"
            }
        ));
        tipojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tipojTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        usuairojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Usuario"
            }
        ));
        jScrollPane2.setViewportView(usuairojTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarradeTarefasjToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        AdicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton.setText("Novo");
        AdicionarjButton.setToolTipText("Novo tipo arquivo");
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
        BarradeTarefasjToolBar.add(SeparadordeTarefasjSeparator1);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar tipo arquivo");
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

        UsuariojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/USUARIO.png"))); // NOI18N
        UsuariojButton.setText("Usuário");
        UsuariojButton.setToolTipText("Vincular Usuário");
        UsuariojButton.setEnabled(false);
        UsuariojButton.setFocusable(false);
        UsuariojButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UsuariojButton.setMaximumSize(new java.awt.Dimension(80, 90));
        UsuariojButton.setMinimumSize(new java.awt.Dimension(80, 90));
        UsuariojButton.setName(""); // NOI18N
        UsuariojButton.setPreferredSize(new java.awt.Dimension(80, 90));
        UsuariojButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UsuariojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariojButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar.add(UsuariojButton);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(218, 218, 218)
                    .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(218, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 110, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(221, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getProdutoAdicionar()==1){
            new FrmCadastrarTipoArquivo(null, this);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_AdicionarjButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getProdutoEditar()==1){
            linha = tipojTable.getSelectedRow();
            if (linha>=0){
                new FrmCadastrarTipoArquivo(listaTipo.get(linha), this);
            }else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um produto orçamento");
            }
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void UsuariojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariojButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getProdutoUsuario()==1){
                new FrmConsultarUsuario(this, usuarioLogadoBean);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_UsuariojButtonActionPerformed

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void tipojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipojTableMouseClicked
        linha = tipojTable.getSelectedRow();
        EditarjButton.setEnabled(true);
        UsuariojButton.setEnabled(true);
    }//GEN-LAST:event_tipojTableMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton;
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator1;
    private javax.swing.JButton UsuariojButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tipojTable;
    private javax.swing.JTable usuairojTable;
    // End of variables declaration//GEN-END:variables

    public void carregarModelTipoArquivo(){
        ArquivosController  arquivosController = new ArquivosController();
        String sql;
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            sql = "select t from Tipoarquivo t where t.unidade='Sim' order by t.descricao";
        }else sql = "select t from Tipoarquivo t order by t.descricao";
        listaTipo = arquivosController.listarArquivos(sql);
        if (listaTipo==null){
            listaTipo = new ArrayList<Tipoarquivo>();
        }
        modelTipo = new ConsultarTipoArquivoTableModel(listaTipo);
        tipojTable.setModel(modelTipo);
        tipojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        tipojTable.repaint();
    }
    
    public void carregarModelUsuario(int idTipo){
        ArquivosController arquivosController = new ArquivosController();
        listaUsuairo  = arquivosController.listarTipoUsuario(idTipo);
        if (listaUsuairo==null){
            listaUsuairo = new ArrayList<Viewtipoarquivousuario>();
        }
        modelUsuairo = new ConsultarUsuarioTableModel(listaUsuairo);
        usuairojTable.setModel(modelUsuairo);
        usuairojTable.getColumnModel().getColumn(0).setPreferredWidth(200);
        usuairojTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelTipoArquivo();
    }

    @Override
    public void setUsuario(Usuario usuario) {
        if (linha>=0){
            Tipoarquivo tipo = listaTipo.get(linha);
            if (tipo!=null){
                Tipoarquivousuario tipoUsuario = new Tipoarquivousuario();
                tipoUsuario.setTipoArquivo(tipo.getIdtipoArquivo());
                tipoUsuario.setUsuario(usuario.getIdusuario());
                ArquivosController arquivosController = new ArquivosController();
                arquivosController.salvar(tipoUsuario);
                carregarModelUsuario(tipo.getIdtipoArquivo());
            }
        }
    }

}
