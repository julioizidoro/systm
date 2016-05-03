/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cliente;

import controller.ClienteController;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cliente;
import model.view.Viewcliente;
import telas.Agenda.IAgenda;
import telas.Aupair.IAupair;
import telas.Aupair.Controle.IControleAupair;
import telas.Cursos.Controle.IControleCurso;
import telas.Cursos.ICursos;
import telas.FollowUp.IFollowup;
import telas.HighSchool.Controle.IControleHighSchool;
import telas.HighSchool.IHighSchool;
import telas.Invoice.Iinvoice;
import telas.Ladies.Controle.IControleLadies;
import telas.Ladies.ILadies;
import telas.OrcamentoCurso.IOrcamentoCurso;
import telas.PesquisaProdutos.IPesquisaProdutos;
import telas.ProgramasTeens.Controle.IControleProgramasTeens;
import telas.ProgramasTeens.IProgramasTeens;
import telas.SeguroViagem.IControleSeguro;
import telas.SeguroViagem.ISeguro;
import telas.Trainee.Controle.IControleTrainee;
import telas.Trainee.ITrainee;
import telas.Usuarios.UsuarioLogadoBean;
import telas.Visto.IControleVistos;
import telas.Visto.IVistos;
import telas.Voluntariado.Controle.IControleVoluntariado;
import telas.Voluntariado.IVoluntariado;
import telas.Work.Controle.IControleWork;
import telas.Work.IWorkTravel;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaCliente extends javax.swing.JFrame implements ICliente {

    private List<Viewcliente> listaCliente;
    private ConsultaClienteTableModel modelCliente;
    private UsuarioLogadoBean usuarioLogadoBean;
    private ICursos telaCursos;
    private IHighSchool telaHighSchool;
    private IProgramasTeens telaProgramasTeens;
    private IOrcamentoCurso telaOrcamentoCurso;
    private ISeguro telaSeguro;
    private IVistos telaVisto;
    private IAupair telaAupair;
    private IWorkTravel telaWork;
    private IAgenda telaAgenda;
    private IFollowup telaFollowup;
    private IPesquisaProdutos telaPesquisa;
    private IControleCurso telaControleCursos;
    private IControleWork telaControleWork;
    private IControleAupair telaControleAupair;
    private IControleHighSchool telaControleHighSchool;
    private IControleLadies telaControleLadies;
    private IControleVistos telaControleVistos;
    private IControleSeguro telaControleSeguro;
    private ILadies telaLadies;
    private Iinvoice telaInvoice;
    private IVoluntariado telaVoluntariado;
    private ITrainee telaTrainee;
    private IControleProgramasTeens telaControleProgramasTeens;
    private IControleVoluntariado telaControleVoluntariado;
    private IControleTrainee telaControleTrainee;

    /**
     * Creates new form FrmConsultaCliente
     */
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleWork telaControleWork) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleWork = telaControleWork;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleSeguro telaControleSeguro) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleSeguro = telaControleSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleVistos telaControleVistos) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleVistos = telaControleVistos;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }


    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleLadies telaControleLadies) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleLadies = telaControleLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleAupair telaControleAupair) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleAupair = telaControleAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleHighSchool telaControleHighSchool) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleHighSchool = telaControleHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleProgramasTeens telaControleProgramasTeens) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleProgramasTeens = telaControleProgramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleCurso telaControleCursos) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleCursos = telaControleCursos;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, Iinvoice telaInvoice) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaInvoice = telaInvoice;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IAgenda telaAgenda) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaAgenda = telaAgenda;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IFollowup telaFollowup) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaFollowup = telaFollowup;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, ICursos telaCurso) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaCursos = telaCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, ITrainee telaTrainee) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaTrainee = telaTrainee;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IVoluntariado telaVoluntariado) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaVoluntariado = telaVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, ILadies telaLadies) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaLadies = telaLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IHighSchool telaHighSchool) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaHighSchool = telaHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IProgramasTeens telaProgramasTeens) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaProgramasTeens = telaProgramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IOrcamentoCurso telaOrcamentoCurso) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaOrcamentoCurso = telaOrcamentoCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }


    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, ISeguro telaSeguro) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaSeguro = telaSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

   
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IVistos telaVisto) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaVisto = telaVisto;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IAupair telaAupair) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaAupair = telaAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IWorkTravel telaWork) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaWork = telaWork;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        this.setVisible(true);
    }

    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IPesquisaProdutos telaPesquisa) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaPesquisa = telaPesquisa;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        limitarJText();
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleVoluntariado telaControleVoluntariado) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleVoluntariado = telaControleVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
        limitarJText();
        this.setVisible(true);
    }
    
    public FrmConsultaCliente(UsuarioLogadoBean usuarioLogadoBean, IControleTrainee telaControleTrainee) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.telaControleTrainee = telaControleTrainee;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarModelCliente(nomejTextField.getText());
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
        clientejTable = new javax.swing.JTable();
        BarradeTarefasjToolBar3 = new javax.swing.JToolBar();
        AdicionarjButton3 = new javax.swing.JButton();
        EditarjButton = new javax.swing.JButton();
        SeparadordeTarefasjSeparator = new javax.swing.JToolBar.Separator();
        FecharrjButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Consulta de Cliente");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Pesquisar Nome do Cliente");

        nomejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nomejTextFieldKeyReleased(evt);
            }
        });

        clientejTable.setModel(new javax.swing.table.DefaultTableModel(
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
        clientejTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientejTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(clientejTable);
        if (clientejTable.getColumnModel().getColumnCount() > 0) {
            clientejTable.getColumnModel().getColumn(0).setResizable(false);
            clientejTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            clientejTable.getColumnModel().getColumn(1).setResizable(false);
            clientejTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            clientejTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            clientejTable.getColumnModel().getColumn(3).setResizable(false);
            clientejTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        BarradeTarefasjToolBar3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        BarradeTarefasjToolBar3.setFloatable(false);
        BarradeTarefasjToolBar3.setRollover(true);

        AdicionarjButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botoes/adicionar.png"))); // NOI18N
        AdicionarjButton3.setText("Novo");
        AdicionarjButton3.setToolTipText("Adicionar Cliente");
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
        EditarjButton.setToolTipText("Editar Cliente");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 746, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(282, 282, 282))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BarradeTarefasjToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 770, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomejTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nomejTextFieldKeyReleased
        carregarModelCliente(nomejTextField.getText());
    }//GEN-LAST:event_nomejTextFieldKeyReleased

    private void FecharrjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharrjButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_FecharrjButton2ActionPerformed

    private void AdicionarjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarjButton3ActionPerformed
        if (usuarioLogadoBean.getAcesso().getCadastroClienteAdicionar() == 1) {
            new FrmCadastrarCliente(null, this, usuarioLogadoBean);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_AdicionarjButton3ActionPerformed

    private void EditarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarjButtonActionPerformed
        if (usuarioLogadoBean.getAcesso().getCadastroClienteEditar() == 1) {
            int linha = clientejTable.getSelectedRow();
            if (linha >= 0) {
                ClienteController clienteController = new ClienteController();
                Cliente cliente = clienteController.consultar(listaCliente.get(linha).getIdcliente());
                new FrmCadastrarCliente(cliente, this, usuarioLogadoBean);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Selecione um Cliente");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }//GEN-LAST:event_EditarjButtonActionPerformed

    private void clientejTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientejTableMouseClicked
        int linha;
        if (evt.getClickCount() == 1) {
            EditarjButton.setEnabled(true);
        } else {
            if (evt.getClickCount() == 2) {
                linha = clientejTable.getSelectedRow();
                if (linha >= 0) {
                    ClienteController clienteController = new ClienteController();
                    Cliente cliente = clienteController.consultar(listaCliente.get(linha).getIdcliente());
                    if (telaCursos != null) {
                        telaCursos.getCliente(cliente);
                        this.dispose();
                    } else {
                        if (telaHighSchool != null) {
                            telaHighSchool.getCliente(cliente);
                            this.dispose();
                        } else {
                            if (telaProgramasTeens != null) {
                                telaProgramasTeens.getCliente(cliente);
                                this.dispose();
                            } else {
                                if (telaOrcamentoCurso != null) {
                                    telaOrcamentoCurso.getCliente(cliente);
                                    this.dispose();
                                } else {
                                    if (this.telaSeguro != null) {
                                        telaSeguro.getCliente(cliente);
                                        this.dispose();
                                    } else {
                                        if (telaVisto != null) {
                                            telaVisto.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaAupair != null) {
                                            telaAupair.getCliente(cliente);
                                            this.dispose();
                                        } else if (telaWork != null) {
                                            this.telaWork.getCliente(cliente);
                                            this.dispose();
                                        } else if (telaAgenda != null) {
                                            this.telaAgenda.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaFollowup != null) {
                                            this.telaFollowup.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaPesquisa != null) {
                                            telaPesquisa.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleCursos != null) {
                                            telaControleCursos.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleWork != null) {
                                            telaControleWork.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleAupair != null) {
                                            telaControleAupair.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleHighSchool != null) {
                                            telaControleHighSchool.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleLadies != null) {
                                            telaControleLadies.setCliente(cliente);
                                            this.dispose();
                                        }  if (telaControleVistos != null) {
                                            this.telaControleVistos.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleSeguro != null) {
                                            this.telaControleSeguro.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaLadies != null) {
                                            this.telaLadies.getCliente(cliente);
                                            this.dispose();
                                        } else if (telaInvoice != null) {
                                            this.telaInvoice.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaVoluntariado != null) {
                                            this.telaVoluntariado.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaTrainee != null) {
                                            this.telaTrainee.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleVoluntariado != null) {
                                            this.telaControleVoluntariado.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleProgramasTeens != null) {
                                            this.telaControleProgramasTeens.setCliente(cliente);
                                            this.dispose();
                                        } else if (telaControleTrainee != null) {
                                            this.telaControleTrainee.setCliente(cliente);
                                            this.dispose();
                                        }
                                    }
                                }
                            }
                        }
                    }

                }
            }
        }

    }//GEN-LAST:event_clientejTableMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarjButton3;
    private javax.swing.JToolBar BarradeTarefasjToolBar3;
    private javax.swing.JButton EditarjButton;
    private javax.swing.JButton FecharrjButton2;
    private javax.swing.JToolBar.Separator SeparadordeTarefasjSeparator;
    private javax.swing.JTable clientejTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nomejTextField;
    // End of variables declaration//GEN-END:variables

    public void carregarModelCliente(String nome) {
        ClienteController clienteController = new ClienteController();
        String sql;
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("Gerencial")) {
            sql = "select c from Viewcliente c where c.nome like '%" + nome + "%' order by c.nome";
        } else {
            sql = "select c from Viewcliente c where c.nome like '%" + nome + "%' and c.unidadeNegocio_idunidadeNegocio="
                    + usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio() + " order by c.nome";
        }

        listaCliente = clienteController.listar(sql);
        if (listaCliente == null) {
            listaCliente = new ArrayList<Viewcliente>();
        }
        modelCliente = new ConsultaClienteTableModel(listaCliente);
        clientejTable.setModel(modelCliente);
        clientejTable.getColumnModel().getColumn(0).setPreferredWidth(50);
        clientejTable.getColumnModel().getColumn(1).setPreferredWidth(200);
        clientejTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        clientejTable.getColumnModel().getColumn(3).setPreferredWidth(30);
        clientejTable.getColumnModel().getColumn(4).setPreferredWidth(30);
        clientejTable.getColumnModel().getColumn(5).setPreferredWidth(100);
        clientejTable.repaint();
    }

    @Override
    public void setModel() {
        carregarModelCliente(nomejTextField.getText());
    }

    @Override
    public void setArquivo(File arquivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void limitarJText() {
        nomejTextField.setDocument(new LimiteTextoJedit(100));
    }
}
