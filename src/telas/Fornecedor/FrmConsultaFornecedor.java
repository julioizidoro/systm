/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Fornecedor;

import controller.FornecedorCidadeController;
import controller.PaisController;
import controller.ProdutoController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Fornecedor;
import model.Fornecedorcidade;
import model.Pais;
import model.Produtos;
import telas.Aupair.IAupair;
import telas.Aupair.Valores.IValoresAupair;
import telas.Cursos.Controle.IControleCurso;
import telas.Cursos.ICursos;
import telas.HighSchool.IHighSchool;
import telas.HighSchool.Valores.IValoresHighSchool;
import telas.Invoice.Iinvoice;
import telas.Ladies.ILadies;
import telas.OrcamentoCurso.IOrcamentoCurso;
import telas.ProgramasTeens.IProgramasTeens;
import telas.ProgramasTeens.Valores.IValoresProgramasTeens;
import telas.SeguroViagem.ISeguro;
import telas.SeguroViagem.Valores.IValoresSeguro;
import telas.Trainee.ITrainee;
import telas.Trainee.Valores.IValoresTrainee;
import telas.Usuarios.UsuarioLogadoBean;
import telas.Visto.Valores.IValoresVistos;
import telas.Voluntariado.IVoluntariado;
import telas.Work.Valores.IValoresWork;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaFornecedor extends javax.swing.JFrame implements IFornecedor{
    
    
    private ConsultaCidadeTableModel modelCidade;
    private ConsultaFornecedorCidadeTableModel modelFornecedor;
    private List<Fornecedorcidade> listaFornecedorCidade;
    private UsuarioLogadoBean usuarioLogadoBean;
    private IOrcamentoCurso telaOrcamentoCurso;
    private ICursos telaCurso;
    private IHighSchool telaHighSchool;
    private IProgramasTeens telaProgramasTeens;
    private ISeguro telaSeguro;
    private String tipo;
    private IAupair telaAupair;
    private int idProduto=0;
    private IControleCurso telaControleCurso;
    private ILadies telaLadies;
    private Iinvoice telaInvoice;
    private IValoresHighSchool telaValorHighSchool;
    private IValoresWork telaValorWork;
    private IVoluntariado telaVoluntariado;
    private ITrainee telaTrainee;
    private IValoresAupair telaValoresAupair;
    private IValoresTrainee telaValoresTrainee;
    private IValoresVistos telaValoresVistos;
    private IValoresSeguro telaValoresSeguro;
    private IValoresProgramasTeens telaValorProgramaTeens;
    
  
    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, Iinvoice telaInvoice) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaInvoice = telaInvoice;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, ITrainee telaTrainee, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaTrainee = telaTrainee;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IControleCurso telaControleCurso, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idProduto = idProduto;
        this.telaControleCurso = telaControleCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IOrcamentoCurso telaOrcamentoCurso, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaOrcamentoCurso = telaOrcamentoCurso;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, ILadies telaLadies, String tipo, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaLadies = telaLadies;
        this.tipo = tipo;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, ICursos telaCurso, String tipo, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.telaCurso = telaCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IVoluntariado telaIVoluntariado, String tipo, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idProduto = idProduto;
        this.tipo = tipo;
        this.telaVoluntariado = telaIVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IHighSchool telaHighSchool, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idProduto = idProduto;
        this.telaHighSchool = telaHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IProgramasTeens telaProgramasTeens, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idProduto = idProduto;
        this.telaProgramasTeens = telaProgramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, ISeguro telaSeguro, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idProduto = idProduto;
        this.telaSeguro = telaSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IAupair telaAupair, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaAupair = telaAupair;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresHighSchool telaValoresHighSchool, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValorHighSchool = telaValoresHighSchool;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresWork telaValoresWork, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValorWork = telaValoresWork;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresAupair telaValoresAupair, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValoresAupair = telaValoresAupair;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresTrainee telaValoresTrainee, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValoresTrainee = telaValoresTrainee;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresVistos telaValoresVistos, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValoresVistos = telaValoresVistos;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresSeguro telaValoresSeguro, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValoresSeguro = telaValoresSeguro;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        PaisController paisController = new PaisController();
        carregarComboBoxPais(paisController.consultar(5));
        ProdutoController produtoController = new ProdutoController();
        carregarComboProduto(produtoController.consultar(idProduto));
        this.setVisible(true);
    }
    
    public FrmConsultaFornecedor(UsuarioLogadoBean usuarioLogadoBean, IValoresProgramasTeens telaValorProgramaTeens, int idProduto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaValorProgramaTeens = telaValorProgramaTeens;
        this.idProduto = idProduto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarComboBoxPais(null);
        carregarComboProduto(null);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        cidadejTable = new javax.swing.JTable();
        BarradeTarefasjToolBar4 = new javax.swing.JToolBar();
        FecharrjButton1 = new javax.swing.JButton();
        paisjComboBox = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        FornecedorjTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        produtosjComboBox = new javax.swing.JComboBox();
        FecharrjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Fornecedor");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("País");

        cidadejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cidadejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cidadejTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(cidadejTable);
        if (cidadejTable.getColumnModel().getColumnCount() > 0) {
            cidadejTable.getColumnModel().getColumn(0).setResizable(false);
            cidadejTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        BarradeTarefasjToolBar4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar4.setFloatable(false);
        BarradeTarefasjToolBar4.setRollover(true);

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

        paisjComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paisjComboBoxItemStateChanged(evt);
            }
        });

        FornecedorjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Escola"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
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
        FornecedorjTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                FornecedorjTableKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(FornecedorjTable);
        if (FornecedorjTable.getColumnModel().getColumnCount() > 0) {
            FornecedorjTable.getColumnModel().getColumn(0).setResizable(false);
            FornecedorjTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        }

        jLabel2.setText("Produto");

        FecharrjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/confirmar.png"))); // NOI18N
        FecharrjButton2.setText("Selecionar");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paisjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(produtosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(FecharrjButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(301, 301, 301)
                .addComponent(FecharrjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(201, 201, 201)
                    .addComponent(BarradeTarefasjToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(491, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paisjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(produtosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FecharrjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FecharrjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(381, Short.MAX_VALUE)
                    .addComponent(BarradeTarefasjToolBar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FecharrjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton1ActionPerformed

    private void cidadejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cidadejTableMouseClicked
        int linha = cidadejTable.getSelectedRow();
        if (linha>=0){
            Pais pais = (Pais) paisjComboBox.getSelectedItem();
            carregarModelFornecdor(pais.getCidadeList().get(linha).getIdcidade());
        }
    }//GEN-LAST:event_cidadejTableMouseClicked

    private void FornecedorjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FornecedorjTableMouseClicked
        
    }//GEN-LAST:event_FornecedorjTableMouseClicked

    private void paisjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paisjComboBoxItemStateChanged
        if (!paisjComboBox.getSelectedItem().toString().equalsIgnoreCase("País")){
            carregarModelCidade();
        }
    }//GEN-LAST:event_paisjComboBoxItemStateChanged

    private void FecharrjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton2ActionPerformed
        int linha = FornecedorjTable.getSelectedRow();
        if (linha >= 0) {
            Fornecedor fornecedor =listaFornecedorCidade.get(linha).getFornecedor();
            if (fornecedor != null) {
                if (telaOrcamentoCurso != null) {
                    telaOrcamentoCurso.setFornecedorCidade(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaCurso != null) {
                    if (tipo.equalsIgnoreCase("C")) {
                        telaCurso.setFornecedor(listaFornecedorCidade.get(linha));
                    } 
                    this.dispose();
                }
                if (telaLadies != null) {
                    telaLadies.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if(telaVoluntariado != null){
                    telaVoluntariado.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaHighSchool != null) {
                    telaHighSchool.setFornecedorCidade(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaProgramasTeens != null) {
                    telaProgramasTeens.setForneceodr(fornecedor);
                    this.dispose();
                }
                if (telaControleCurso != null) {
                    this.telaControleCurso.setEscola(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaInvoice != null) {
                    this.telaInvoice.setEscola(fornecedor);
                    this.dispose();
                }
                if (telaValorHighSchool != null) {
                    telaValorHighSchool.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaValoresAupair != null) {
                    telaValoresAupair.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaValorWork != null) {
                    telaValorWork.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaValoresTrainee!=null){
                    telaValoresTrainee.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaValoresVistos!=null){
                    telaValoresVistos.setFornecedorCidade(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaValoresSeguro!=null){
                    this.telaValoresSeguro.setFornecedor(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaValorProgramaTeens!=null){
                    this.telaValorProgramaTeens.setFornecedorCidade(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
                if (telaTrainee != null) {
                    telaTrainee.setFornecedorCidade(listaFornecedorCidade.get(linha));
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_FecharrjButton2ActionPerformed

    private void FornecedorjTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FornecedorjTableKeyPressed
    }//GEN-LAST:event_FornecedorjTableKeyPressed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar BarradeTarefasjToolBar4;
    private javax.swing.JButton FecharrjButton1;
    private javax.swing.JButton FecharrjButton2;
    private javax.swing.JTable FornecedorjTable;
    private javax.swing.JTable cidadejTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox paisjComboBox;
    private javax.swing.JComboBox produtosjComboBox;
    // End of variables declaration//GEN-END:variables

    public void carregarModelFornecdor(int idcidade){
        if (!produtosjComboBox.getSelectedItem().toString().equalsIgnoreCase("Produto")) {
            Produtos produto = (Produtos) produtosjComboBox.getSelectedItem();
            FornecedorCidadeController fornecedorCidadeController = new FornecedorCidadeController();

            String sql = "SELECT f From Fornecedorcidade f where f.produtos.idprodutos=" + produto.getIdprodutos()
                    + " and f.cidade.idcidade=" + idcidade + " order by f.fornecedor.nome";
            listaFornecedorCidade = fornecedorCidadeController.listar(sql);
            if (listaFornecedorCidade == null) {
                listaFornecedorCidade = new ArrayList<Fornecedorcidade>();
            }
            modelFornecedor = new ConsultaFornecedorCidadeTableModel(listaFornecedorCidade);
            FornecedorjTable.setModel(modelFornecedor);
            FornecedorjTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            FornecedorjTable.getColumnModel().getColumn(1).setPreferredWidth(300);
            FornecedorjTable.repaint();
        } else {
            JOptionPane.showMessageDialog(paisjComboBox, "Selecione Produto");
        }
    }
    
    
    @Override
    public void setFornecedor(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void carregarModelCidade(){
        Pais pais = (Pais) paisjComboBox.getSelectedItem();
        modelCidade = new ConsultaCidadeTableModel(pais.getCidadeList());
        cidadejTable.setModel(modelCidade);
        cidadejTable.getColumnModel().getColumn(0).setPreferredWidth(300);
        cidadejTable.repaint();
    }
    
    public void carregarComboBoxPais(Pais pais){
        PaisController paisController = new PaisController();
        List<Pais> listaPais = paisController.listar("");
        if (listaPais==null){
            listaPais = new ArrayList<Pais>();
        }
        paisjComboBox = Formatacao.preencherComobox(listaPais, paisjComboBox, true, "País");
        if (pais!=null){
            paisjComboBox.setSelectedItem(pais);
            if (!paisjComboBox.getSelectedItem().toString().equalsIgnoreCase("País")){
                carregarModelCidade();
            }
        }
    }

    @Override
    public void setModelFornecedor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void carregarComboProduto(Produtos produto){
        ProdutoController produtoController = new ProdutoController();
        List<Produtos> listaProduto = produtoController.listarProdutos("");
        if (listaProduto==null){
            listaProduto = new ArrayList<Produtos>();
        }
        produtosjComboBox = Formatacao.preencherComobox(listaProduto, produtosjComboBox, true, "Produto");
        if (produto!=null){
            produtosjComboBox.setSelectedItem(produto);
        }
    }
    
    
}