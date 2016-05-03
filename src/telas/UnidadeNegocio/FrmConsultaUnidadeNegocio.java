/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.UnidadeNegocio;

import controller.UnidadeNegocioController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import model.Unidadenegocio;
import telas.Aupair.Controle.IControleAupair;
import telas.Cursos.Controle.IControleCurso;
import telas.HighSchool.Controle.IControleHighSchool;
import telas.Invoice.Iinvoice;
import telas.Ladies.Controle.IControleLadies;
import telas.PesquisaProdutos.IPesquisaProdutos;
import telas.ProgramasTeens.Controle.IControleProgramasTeens;
import telas.Relatorios.Vendas.IMapaVendas;
import telas.SeguroViagem.IControleSeguro;
import telas.Trainee.Controle.IControleTrainee;
import telas.Visto.IControleVistos;
import telas.Voluntariado.Controle.IControleVoluntariado;
import telas.Work.Controle.IControleWork;


/**
 *
 * @author Wolverine
 */
public class FrmConsultaUnidadeNegocio extends javax.swing.JFrame implements IUnidadeNegocio{
    
    private List<Unidadenegocio> listaUnidadeNegocio;
    private ConsultaUnidadeNegocioTableModel modelUnidadeNegocio;
    private IPesquisaProdutos telaPesquisa;
    private IMapaVendas telaMapaVendas;
    private IControleWork telaControleWork;
    private IControleAupair telaControleAupair;
    private IControleHighSchool telaControleHighSchool;
    private IControleLadies telaControleLadies;
    private IControleVistos telaControleVistos;
    private IControleSeguro telaControleSeguro;
    private Iinvoice telaInvoice;
    private IControleProgramasTeens telaControleProgramasTeens;
    private IControleCurso telaControleCurso;
    private IControleVoluntariado telaControleVoluntariado;
    private IControleTrainee telaControleTrainee;
    
    /**
     * Creates new form FrmConsultaUnidadeNegocio
     */
    public FrmConsultaUnidadeNegocio(IPesquisaProdutos telaPesquisa) {
        this.telaPesquisa = telaPesquisa;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleWork telaControleWork) {
        this.telaControleWork = telaControleWork;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(Iinvoice telaInvoice) {
        this.telaInvoice = telaInvoice;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleSeguro telaControleSeguro) {
        this.telaControleSeguro = telaControleSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleVistos telaControleVistos) {
        this.telaControleVistos = telaControleVistos;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    
    public FrmConsultaUnidadeNegocio(IControleProgramasTeens telaControleProgramasTeens) {
        this.telaControleProgramasTeens = telaControleProgramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleLadies telaControleLadies) {
        this.telaControleLadies = telaControleLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleAupair telaControleAupair) {
        this.telaControleAupair = telaControleAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleHighSchool telaControleHighSchool) {
        this.telaControleHighSchool = telaControleHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IMapaVendas telaMapaVendas) {
        this.telaMapaVendas = telaMapaVendas;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleCurso telaControleCurso) {
        this.telaControleCurso = telaControleCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleVoluntariado telaControleVoluntariado) {
        this.telaControleVoluntariado = telaControleVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio(IControleTrainee telaControleTrainee) {
        this.telaControleTrainee = telaControleTrainee;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
        this.setVisible(true);
    }
    
    public FrmConsultaUnidadeNegocio() {
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelUnidadeNegocio();
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
        unidadeNegociojTable = new javax.swing.JTable();
        BarradeTarefasjToolBar = new javax.swing.JToolBar();
        AdicionarjButton = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        FecharrjButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Unidade de Negócio");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        unidadeNegociojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Fantasia", "Telefone", "E-mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        unidadeNegociojTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unidadeNegociojTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(unidadeNegociojTable);
        unidadeNegociojTable.getColumnModel().getColumn(0).setResizable(false);
        unidadeNegociojTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        unidadeNegociojTable.getColumnModel().getColumn(1).setResizable(false);
        unidadeNegociojTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        unidadeNegociojTable.getColumnModel().getColumn(2).setResizable(false);
        unidadeNegociojTable.getColumnModel().getColumn(2).setPreferredWidth(200);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        BarradeTarefasjToolBar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar.setFloatable(false);
        BarradeTarefasjToolBar.setRollover(true);

        AdicionarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton.setText("Nova");
        AdicionarjButton.setToolTipText("Adicionar Nova Unidade Negócio");
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
        EditarjButton.setToolTipText("Editar Unidade Negocio");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BarradeTarefasjToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButtonActionPerformed
        new FrmCadastrarUnidadeNegocio(null, this);
    }//GEN-LAST:event_AdicionarjButtonActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        int linha = unidadeNegociojTable.getSelectedRow();
        if(linha>=0){
            new FrmCadastrarUnidadeNegocio(listaUnidadeNegocio.get(linha), this);
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void unidadeNegociojTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unidadeNegociojTableMouseClicked
        if (evt.getClickCount() == 1) {
            EditarjButton.setEnabled(true);
        } else if (evt.getClickCount() == 2) {
            int linha = unidadeNegociojTable.getSelectedRow();
            if (linha >= 0) {
                if (this.telaPesquisa != null) {
                    telaPesquisa.setUnidade(listaUnidadeNegocio.get(linha));
                    this.dispose();
                } else if (telaMapaVendas != null) {
                    this.telaMapaVendas.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaControleWork!=null){
                    telaControleWork.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaControleAupair!=null){
                    telaControleAupair.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaControleHighSchool!=null){
                    telaControleHighSchool.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaControleLadies!=null){
                    telaControleLadies.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaControleVistos!=null){
                    telaControleVistos.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaControleSeguro!=null){
                    telaControleSeguro.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if (telaInvoice!=null){
                    this.telaInvoice.setUnidade(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else  if (telaInvoice!=null){
                    this.telaControleProgramasTeens.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if(telaControleCurso!=null){
                    this.telaControleCurso.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if(telaControleVoluntariado!=null){
                    this.telaControleVoluntariado.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }else if(telaControleTrainee!=null){
                    this.telaControleTrainee.setUnidadeNegocio(listaUnidadeNegocio.get(linha));
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_unidadeNegociojTableMouseClicked

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton;
    private javax.swing.JToolBar BarradeTarefasjToolBar;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable unidadeNegociojTable;
    // End of variables declaration//GEN-END:variables

    public void carregarModelUnidadeNegocio(){
        UnidadeNegocioController unidadeNegocioController = new UnidadeNegocioController();
        listaUnidadeNegocio = unidadeNegocioController.listar();
        if (listaUnidadeNegocio==null){
            listaUnidadeNegocio = new ArrayList<Unidadenegocio>();
        }
        modelUnidadeNegocio = new ConsultaUnidadeNegocioTableModel(listaUnidadeNegocio);
        unidadeNegociojTable.setModel(modelUnidadeNegocio);
        unidadeNegociojTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        unidadeNegociojTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        unidadeNegociojTable.getColumnModel().getColumn(2).setPreferredWidth(200);
        unidadeNegociojTable.repaint();       
    }

    @Override
    public void setModel() {
        carregarModelUnidadeNegocio();
    }

}
