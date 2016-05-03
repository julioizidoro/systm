/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.SeguroViagem.Valores;

import controller.ParametrosProdutosController;
import controller.ValorSeguroController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Fornecedorcidade;
import model.Parametrosprodutos;
import model.Valoresseguro;
import telas.Aupair.IAupair;
import telas.Cursos.ICursos;
import telas.Fornecedor.FrmConsultaFornecedor;
import telas.Ladies.ILadies;
import telas.OrcamentoProdutos.IOrcamentoProduto;
import telas.SeguroViagem.ISeguro;
import telas.Usuarios.UsuarioLogadoBean;
import telas.Voluntariado.IVoluntariado;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaValoresSeguro extends javax.swing.JFrame implements IValoresSeguro{
    
    private ConsultaValoresSeguroTableModel modelValor;
    private List<Valoresseguro> listaValor;
    private UsuarioLogadoBean usuarioLogadoBean;
    private ISeguro telaSeguro;
    private Fornecedorcidade fornecedorCidade;
    private IOrcamentoProduto telaOrcamentoProduto;
    private ICursos telaCurso;
    private IAupair telaAupair;
    private IVoluntariado telaVoluntariado;
    private ILadies telaLadies;
    

    /**
     * Creates new form FrmConsultaValoresHighSchool
     */
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean, ISeguro telaSeguro) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaSeguro = telaSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        AdicionarjButton3.setEnabled(false);
        EditarjButton.setEnabled(false);
        this.setVisible(true);
    }
    
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean, ICursos telaCurso) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaCurso = telaCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        AdicionarjButton3.setEnabled(false);
        EditarjButton.setEnabled(false);
        this.setVisible(true);
    }
    
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean, IAupair telaAupair) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaAupair = telaAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        AdicionarjButton3.setEnabled(false);
        EditarjButton.setEnabled(false);
        this.setVisible(true);
    }
    
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean, IOrcamentoProduto telaOrcamentoProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaOrcamentoProduto = telaOrcamentoProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        AdicionarjButton3.setEnabled(false);
        EditarjButton.setEnabled(false);
        this.setVisible(true);
    }
    
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean, IVoluntariado telaVoluntariado) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaVoluntariado = telaVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        AdicionarjButton3.setEnabled(false);
        EditarjButton.setEnabled(false);
        this.setVisible(true);
    }
    
    public FrmConsultaValoresSeguro(UsuarioLogadoBean usuarioLogadoBean, ILadies telaLadies) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaLadies = telaLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        AdicionarjButton3.setEnabled(false);
        EditarjButton.setEnabled(false);
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
        fornecedorjTextField = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        valorjTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        situacaojButton = new javax.swing.JButton();
        FecharrjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta Valores Seguro Viagem");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Fornecedor");

        fornecedorjTextField.setEditable(false);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
        jButton7.setText("Selecionar");
        jButton7.setToolTipText("Selecionar Fornecedor");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fornecedorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fornecedorjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        valorjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Duração", "Inicio", "Valor ", "Moeda", "Situação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        valorjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                valorjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(valorjTable);
        if (valorjTable.getColumnModel().getColumnCount() > 0) {
            valorjTable.getColumnModel().getColumn(0).setResizable(false);
            valorjTable.getColumnModel().getColumn(1).setResizable(false);
            valorjTable.getColumnModel().getColumn(2).setResizable(false);
            valorjTable.getColumnModel().getColumn(3).setResizable(false);
            valorjTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Novo");
        AdicionarjButton3.setToolTipText("Novo valor work and travel");
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
        EditarjButton.setToolTipText("Editar valor work and travel");
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

        situacaojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/SITUACAO.png"))); // NOI18N
        situacaojButton.setText("Desativar");
        situacaojButton.setToolTipText("Situação");
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
        BarradeTarefasjToolBar3.add(FecharrjButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(66, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(121, 121, 121)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(291, 291, 291)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        ParametrosProdutosController parametrosProdutosController = new ParametrosProdutosController();
        Parametrosprodutos parametrosprodutos = parametrosProdutosController.consultar();
        new FrmConsultaFornecedor(usuarioLogadoBean, this, parametrosprodutos.getSeguroPrivado());
    }//GEN-LAST:event_jButton7ActionPerformed

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (usuarioLogadoBean.getAcesso().getValorHighSchoolAdicionar()==1){
            new FrmCadastrarValoresSeguro(usuarioLogadoBean, null);
        }else JOptionPane.showMessageDialog(rootPane,"Acesso Negado");

    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getValorHighSchoolEditar() == 1) {
            int linha = valorjTable.getSelectedRow();
            if (linha >= 0) {
                new FrmCadastrarValoresSeguro(usuarioLogadoBean, listaValor.get(linha));
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void valorjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_valorjTableMouseClicked
        if (evt.getClickCount() == 2) {
            int linha = valorjTable.getSelectedRow();
            if (linha >= 0) {
                if (telaSeguro != null) {
                    telaSeguro.setValores(listaValor.get(linha));
                    this.dispose();
                }else if (telaAupair!=null){
                    telaAupair.setValores(listaValor.get(linha));
                    this.dispose();
                }else if (telaCurso!=null){
                    telaCurso.setValores(listaValor.get(linha));
                    this.dispose();
                }else if (telaVoluntariado!=null){
                    telaVoluntariado.setValorSeguro(listaValor.get(linha));
                    this.dispose();
                }else if (telaLadies!=null){
                    telaLadies.setValoresSeguro(listaValor.get(linha));
                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Valores não localizado");
            }
        }
    }//GEN-LAST:event_valorjTableMouseClicked

    private void situacaojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_situacaojButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getValorHighSchool() == 1) {
            int linha = valorjTable.getSelectedRow();
            if (linha >= 0) {
                ValorSeguroController valorSeguroController = new ValorSeguroController();
                listaValor.get(linha).setSituacao("Inativo");
                valorSeguroController.salvar(listaValor.get(linha));
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_situacaojButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTextField fornecedorjTextField;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton situacaojButton;
    private javax.swing.JTable valorjTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setFornecedor(Fornecedorcidade fornecedorCidade) {
        if (fornecedorCidade!=null){
            this.fornecedorCidade= fornecedorCidade;
            fornecedorjTextField.setText(fornecedorCidade.getFornecedor().getNome());
            setModel();
        }
    }

    @Override
    public void setModel() {
        if (fornecedorCidade != null) {
            ValorSeguroController valorSeguroController = new ValorSeguroController();
            listaValor = valorSeguroController.listar(fornecedorCidade.getFornecedor().getIdfornecedor());
            if (listaValor == null) {
                listaValor = new ArrayList<Valoresseguro>();
            }
            modelValor = new ConsultaValoresSeguroTableModel(listaValor);
            valorjTable.setModel(modelValor);
            DefaultTableCellRenderer rendererValor = new DefaultTableCellRenderer();
            rendererValor.setHorizontalAlignment(SwingConstants.RIGHT);
            valorjTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            valorjTable.getColumnModel().getColumn(1).setCellRenderer(rendererValor);
            valorjTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            valorjTable.repaint();
        }
    }
}
