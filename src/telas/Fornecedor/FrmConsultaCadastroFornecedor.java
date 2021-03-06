/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import controller.FornecedorController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import telas.Usuarios.UsuarioLogadoBean;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaCadastroFornecedor extends javax.swing.JFrame implements IFornecedor{
    
    private List<Fornecedor> listaFornecedor;
    private ConsultaFornecedorCadastroTableModel modelFornecedor;
    private UsuarioLogadoBean usuarioLogadoBean;
    private IFornecedor telaFornecedor;
    
    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmConsultaCadastroFornecedor(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        telaFornecedor = null;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelFornecdor();
        limitarJText();
        this.setVisible(true);
    }
    
    public FrmConsultaCadastroFornecedor(UsuarioLogadoBean usuarioLogadoBean, IFornecedor telaFornecedor) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaFornecedor = telaFornecedor;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelFornecdor();
        limitarJText();
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
        jLabel1 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FornecedorjTable = new javax.swing.JTable();
        BarradeTarefasjToolBar4 = new javax.swing.JToolBar();
        AdicionarjButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator1 = new javax.swing.JToolBar.Separator();
        FecharrjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Fornecedor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Nome do Fornecedoor");

        nomejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomejTextFieldKeyReleased(evt);
            }
        });

        FornecedorjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Data Nascimento", "Fone Residencial", "Fone Celular"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        FornecedorjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FornecedorjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FornecedorjTable);
        if (FornecedorjTable.getColumnModel().getColumnCount() > 0) {
            FornecedorjTable.getColumnModel().getColumn(0).setResizable(false);
            FornecedorjTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            FornecedorjTable.getColumnModel().getColumn(1).setResizable(false);
            FornecedorjTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            FornecedorjTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            FornecedorjTable.getColumnModel().getColumn(3).setResizable(false);
            FornecedorjTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        BarradeTarefasjToolBar4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar4.setFloatable(false);
        BarradeTarefasjToolBar4.setRollover(true);

        AdicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton.setText("Novo");
        AdicionarjButton.setToolTipText("Adicionar Fornecedor");
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
        BarradeTarefasjToolBar4.add(AdicionarjButton);

        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/editar.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.setToolTipText("Editar Fornecedor");
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
        BarradeTarefasjToolBar4.add(EditarjButton);
        BarradeTarefasjToolBar4.add(SeparadordeTarefasjSeparator1);

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
        BarradeTarefasjToolBar4.add(FecharrjButton1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 570, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(BarradeTarefasjToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(245, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(291, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomejTextFieldKeyReleased
        carregarModelFornecdor();
    }//GEN-LAST:event_nomejTextFieldKeyReleased

    private void FornecedorjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FornecedorjTableMouseClicked
        if (evt.getClickCount() == 1) {
            EditarjButton.setEnabled(true);
        }
        if (evt.getClickCount() == 2) {
            int linha = FornecedorjTable.getSelectedRow();
            if (linha >= 0) {
                if (telaFornecedor != null) {
                    telaFornecedor.setFornecedor(listaFornecedor.get(linha));
                    this.dispose();
                }
            }else JOptionPane.showMessageDialog(rootPane, "Seleicone um Fornecedor");
        }
    }//GEN-LAST:event_FornecedorjTableMouseClicked

    private void AdicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getFornecedorAdicionar()==1){
            new FrmNovoCadFornecedor(null, this);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_AdicionarjButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getFornecedorEditar() == 1) {
            int linha = FornecedorjTable.getSelectedRow();
            if (linha >= 0) {
                Fornecedor fornecedor = consultarfornecedor(linha);
                if (fornecedor != null) {
                    new FrmNovoCadFornecedor(fornecedor, this);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um Fornecdor");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton;
    private javax.swing.JToolBar BarradeTarefasjToolBar4;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JTable FornecedorjTable;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    // End of variables declaration//GEN-END:variables

    public void carregarModelFornecdor(){
        FornecedorController fornecedorController =new FornecedorController();
        String sql = "";
        sql = "SELECT f From Fornecedor f where f.nome like '%" + 
                nomejTextField.getText() + "%' and f.idfornecedor>1000 order by f.nome";
        listaFornecedor =fornecedorController.listaFornecedorCadastro(sql);
        if (listaFornecedor==null){
            listaFornecedor = new ArrayList<Fornecedor>();
        }
        modelFornecedor = new ConsultaFornecedorCadastroTableModel(listaFornecedor);
        FornecedorjTable.setModel(modelFornecedor);
        FornecedorjTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        FornecedorjTable.getColumnModel().getColumn(1).setPreferredWidth(350);
        FornecedorjTable.repaint();
    }



    @Override
    public void setModelFornecedor() {
        carregarModelFornecdor();
    }
    
    
    
    public Fornecedor consultarfornecedor(int linha){
        FornecedorController fornecedorController = new FornecedorController();
        Fornecedor fornecedor = fornecedorController.consultar(listaFornecedor.get(linha).getIdfornecedor());
        return fornecedor;
    }
    public void limitarJText(){
        nomejTextField.setDocument(new LimiteTextoJedit(100));
    }

    @Override
    public void setFornecedor(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}