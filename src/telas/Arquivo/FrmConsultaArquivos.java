/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Arquivo;

import controller.ArquivosController;
import controller.FtpDadosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Ftpdados;
import model.view.Viewconsultaarquivo;
import telas.Aupair.Controle.IControleAupair;
import telas.Cliente.FrmSalvarAquivo;
import telas.Cliente.ICliente;
import telas.Cursos.Controle.IControleCurso;
import telas.HighSchool.Controle.IControleHighSchool;
import telas.Ladies.Controle.IControleLadies;
import telas.ProgramasTeens.Controle.IControleProgramasTeens;
import telas.SeguroViagem.IControleSeguro;
import telas.Trainee.Controle.IControleTrainee;
import telas.Usuarios.UsuarioLogadoBean;
import telas.Visto.IControleVistos;
import telas.Voluntariado.Controle.IControleVoluntariado;
import telas.Work.Controle.IControleWork;
import util.Ftp;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaArquivos extends javax.swing.JFrame implements ICliente{
    
    private List<Viewconsultaarquivo> listaArquivos;
    private ConsultarArquivosTableModel modelArquivos;
    private UsuarioLogadoBean usuarioLogadoBean;
    private int idVenda;
    private int idControle;
    private int idUnidade;
    private IControleCurso telaControleCurso;
    private IControleAupair telaAupair;
    private IControleLadies telaLadies;
    private IControleProgramasTeens telaProgramasTeens;
    private IControleHighSchool telaHighSchool;
    private IControleSeguro telaSeguro;
    private IControleVistos telaVistos;
    private IControleWork telaWork;
    private IControleVoluntariado telaVoluntariado;
    private IControleTrainee telaTrainee;
    

    /**
     * Creates new form FrmConsultaArquivos
     */
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idControle, int idUnidade, IControleCurso tela) {
        telaControleCurso = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleAupair tela) {
        telaAupair = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleLadies tela) {
        telaLadies = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleHighSchool tela) {
        telaHighSchool = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleProgramasTeens tela) {
        telaProgramasTeens = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleSeguro tela) {
        telaSeguro = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idControle, int idUnidade, IControleTrainee tela) {
        telaTrainee = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleVistos tela) {
        telaVistos = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idControle, int idUnidade, IControleVoluntariado tela) {
        telaVoluntariado = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
        this.setVisible(true);
    }
    
    public FrmConsultaArquivos(UsuarioLogadoBean usuarioLogadoBean, int idVenda, String nome, int idUnidade, IControleWork tela) {
        telaWork = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade = idUnidade;
        this.idControle = idControle;
        initComponents();
        setModel();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        nomejTextField.setText(nome);
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
        arquivosjTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        nomejTextField = new javax.swing.JTextField();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        excluirjButton = new javax.swing.JButton();
        exportarrjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        visualizarjButton = new javax.swing.JButton();
        FecharrjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consultar Arquivos");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        arquivosjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tipo Arquivo", "Data Inclusão", "Nome do Arquivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        arquivosjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arquivosjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(arquivosjTable);
        if (arquivosjTable.getColumnModel().getColumnCount() > 0) {
            arquivosjTable.getColumnModel().getColumn(0).setResizable(false);
            arquivosjTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            arquivosjTable.getColumnModel().getColumn(1).setResizable(false);
            arquivosjTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            arquivosjTable.getColumnModel().getColumn(2).setResizable(false);
            arquivosjTable.getColumnModel().getColumn(2).setPreferredWidth(300);
        }

        jLabel1.setText("Cliente");

        nomejTextField.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Adicionar");
        AdicionarjButton3.setToolTipText("Adicionar Novo Arquivo");
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

        excluirjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/excluir.png"))); // NOI18N
        excluirjButton.setText("Excluir");
        excluirjButton.setToolTipText("Excluir Arquivo");
        excluirjButton.setEnabled(false);
        excluirjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        excluirjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        excluirjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        excluirjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        excluirjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        excluirjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(excluirjButton);

        exportarrjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/exportar.png"))); // NOI18N
        exportarrjButton.setText("Salvar");
        exportarrjButton.setToolTipText("Salvar Arquivo");
        exportarrjButton.setEnabled(false);
        exportarrjButton.setFocusable(false);
        exportarrjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exportarrjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        exportarrjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        exportarrjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        exportarrjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exportarrjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarrjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(exportarrjButton);
        BarradeTarefasjToolBar3.add(SeparadordeTarefasjSeparator);

        visualizarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/VER DADOS.png"))); // NOI18N
        visualizarjButton.setText("Visualizar");
        visualizarjButton.setToolTipText("Salvar Arquivo");
        visualizarjButton.setEnabled(false);
        visualizarjButton.setFocusable(false);
        visualizarjButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        visualizarjButton.setMaximumSize(new java.awt.Dimension(80, 90));
        visualizarjButton.setMinimumSize(new java.awt.Dimension(80, 90));
        visualizarjButton.setPreferredSize(new java.awt.Dimension(80, 90));
        visualizarjButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        visualizarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarjButtonActionPerformed(evt);
            }
        });
        BarradeTarefasjToolBar3.add(visualizarjButton);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(140, 140, 140)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(124, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(370, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (usuarioLogadoBean.getAcesso().getUploadArquivoIncluir()==1){
            if (telaControleCurso!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaControleCurso);
            }else if (telaAupair!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaAupair);
            }else if (telaHighSchool!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaHighSchool);
            }else if (telaLadies!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaLadies);
            }else if (telaProgramasTeens!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaProgramasTeens);
            }else if (telaSeguro!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaSeguro);
            }else if (telaTrainee!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaTrainee);
            }else if (telaVistos!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaVistos);
            }else if (telaVoluntariado!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaVoluntariado);
            }else if (telaWork!=null){
                new FrmCadastarArquivo(usuarioLogadoBean, this, idVenda, nomejTextField.getText(), idControle, idUnidade, telaWork);
            }
            
        }else JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void excluirjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getUploadArquivoExcluir() == 1) {
            int linha = arquivosjTable.getSelectedRow();
            if (linha >= 0) {
                boolean resultado = JOptionPane.showConfirmDialog(null, "Confirma exclusão?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
                if (resultado) {
                    ArquivosController arquivosController = new ArquivosController();
                    arquivosController.excluir(listaArquivos.get(linha).getIdarquivos());
                    JOptionPane.showMessageDialog(rootPane, "Arquivo Excluido");
                }
            }
            JOptionPane.showMessageDialog(rootPane, "Selecione um arquivo");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_excluirjButtonActionPerformed

    private void FecharrjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton2ActionPerformed

    private void exportarrjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarrjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getUploadArquivoExportar() == 1) {
            int linha = arquivosjTable.getSelectedRow();
            if (linha >= 0) {
                new FrmSalvarAquivo(listaArquivos.get(linha), usuarioLogadoBean);
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_exportarrjButtonActionPerformed

    private void arquivosjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arquivosjTableMouseClicked
        exportarrjButton.setEnabled(true);
        excluirjButton.setEnabled(true);
        visualizarjButton.setEnabled(true);
    }//GEN-LAST:event_arquivosjTableMouseClicked

    private void visualizarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getUploadArquivoExportar() == 1) {
            int linha = arquivosjTable.getSelectedRow();
            String caminho = usuarioLogadoBean.getUsuario().getLocarlvisualizar();
            if (linha >= 0) {
                if (caminho != null) {
                    if (caminho.length() > 3) {
                        String nomeArquivoLocal = caminho + "\\" + listaArquivos.get(linha).getNomeArquivo();
                        String nomeArquivoFTP = String.valueOf(idVenda) + "_" + listaArquivos.get(linha).getNomeArquivo();
                        salvarArquivoFTP(nomeArquivoLocal, nomeArquivoFTP);
                        try {
                            //                        File file = new File(nomeArquivo);
//                        FileOutputStream in = null;
//                        try {
//                            in = new FileOutputStream(file);
//                            in.write(listaArquivos.get(linha).getArquivo());
//                            in.close();
                            
                            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + nomeArquivoLocal);
//                        } catch (Exception ex) {
//                            Logger.getLogger(FrmSalvarAquivo.class.getName()).log(Level.SEVERE, null, ex);
//                            JOptionPane.showMessageDialog(rootPane, "Erro salvar arquivo " + ex);
//                        }
                        } catch (IOException ex) {
                            Logger.getLogger(FrmConsultaArquivos.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } else {
                        new FrmSalvarAquivo(listaArquivos.get(linha), usuarioLogadoBean);
                    }
                } else {
                    new FrmSalvarAquivo(listaArquivos.get(linha), usuarioLogadoBean);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_visualizarjButtonActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton FecharrjButton2;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable arquivosjTable;
    private javax.swing.JButton excluirjButton;
    private javax.swing.JButton exportarrjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    private javax.swing.JButton visualizarjButton;
    // End of variables declaration//GEN-END:variables

   
    @Override
    public void setModel() {
        String sql;
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            sql = "select a from Viewconsultaarquivo a where a.vendasIdvendas=" + idVenda + "  and a.unidade='Sim' order by a.nomeArquivo";
        }else sql = "select a from Viewconsultaarquivo a where a.vendasIdvendas=" + idVenda + " order by a.nomeArquivo";
        ArquivosController arquivosController = new ArquivosController();
        listaArquivos = arquivosController.listar(sql);
        if (listaArquivos==null){
            listaArquivos = new ArrayList<Viewconsultaarquivo>();
        }
        modelArquivos = new ConsultarArquivosTableModel(listaArquivos);
        arquivosjTable.setModel(modelArquivos);
        arquivosjTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        arquivosjTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        arquivosjTable.getColumnModel().getColumn(2).setPreferredWidth(300);
        arquivosjTable.repaint();
    }

    @Override
    public void setArquivo(File arquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean salvarArquivoFTP(String nomeArquivoLocal, String nomeArquivoFTP){
        FtpDadosController ftpDadosController = new FtpDadosController();
        Ftpdados dadosFTP = ftpDadosController.getFTPDados();
        if (dadosFTP==null){
            return false;
        }
        Ftp ftp = new Ftp(dadosFTP.getHost(),dadosFTP.getUser(), dadosFTP.getPassword());
        try {
            if (!ftp.conectar()){
                JOptionPane.showMessageDialog(rootPane, "Erro conectar FTP");
                return false;
            }
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastarArquivo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro conectar FTP " + ex);
        }
        try {
            ftp.receberArquivo(nomeArquivoLocal, nomeArquivoFTP);
        } catch (IOException ex) {
            Logger.getLogger(FrmConsultaArquivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro Salvar Arquivo " + ex);
            return false;
        }
        try {
            ftp.desconectar();
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastarArquivo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro desconectar FTP " +ex);
            return false;
        }
        return true;
        
    }

}