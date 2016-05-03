/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.CambioController;
import controller.ClienteController;
import controller.ContasReceberController;
import controller.CursosController;
import controller.FollowupController;
import controller.FormaPagamentoController;
import controller.FornecedorComissaoCursoController;
import controller.HistoricoCursosController;
import controller.InvoicesController;
import controller.ItensAlteradosCursosController;
import controller.OrcamentoController;
import controller.OrcamentoCursoController;
import controller.ParcelamentoPagamentoController;
import controller.ProdutoOrcamentoController;
import controller.ProdutoRemessaController;
import controller.SeguroViagemController;
import controller.ValorSeguroController;
import controller.VendasComissaoController;
import controller.VendasController;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Acesso;
import model.Cambio;
import model.Cliente;
import model.Contasreceber;
import model.Controlecursos;
import model.Cursos;
import model.Formapagamento;
import model.Fornecedorcidade;
import model.Fornecedorcomissaocurso;
import model.Historicocursos;
import model.Invoices;
import model.Itensalteradoscurso;
import model.Moedas;
import model.Orcamento;
import model.Orcamentocurso;
import model.Orcamentoprodutosorcamento;
import model.Parcelamentopagamento;
import model.Produtoorcamentocurso;
import model.Produtoremessa;
import model.Produtos;
import model.Produtosorcamento;
import model.Seguroviagem;
import model.Valoresseguro;
import model.Vendas;
import model.Vendascomissao;
import model.view.Viewprodutosfiltro;
import telas.Cliente.FrmConsultaCliente;
import telas.Comissao.ComissaoCursos;
import telas.Comissao.ComissaoSeguro;
import telas.Fornecedor.FrmConsultaFornecedor;
import telas.SeguroViagem.Valores.FrmConsultaValoresSeguro;
import telas.Usuarios.UsuarioLogadoBean;
import telas.cambio.FrmAlterarValorCambio;
import util.ContasReceberBean;
import util.EnviarEmailBean;
import util.Formatacao;
import util.FrmCalculoJuros;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmFichaCursos extends javax.swing.JFrame implements ICursos{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Vendas venda;
    private Vendas vendaAlterada;
    private Formapagamento formaPagamento;
    private Produtos produto;
    private Cliente cliente;
    private Seguroviagem seguroViagem;
    private Seguroviagem seguroViagemAlterado;
    private Orcamento orcamento;
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoBean;
    private Cursos curso;
    private UsuarioLogadoBean usuarioLogadoBean;
    private OrcamentoProdutoTableModel modelOrcamentoProduto;
    private String  cambioAlterado = "Não";
    private float valorSeguro=0;
    private float valorVistos=0;
    private float valorCambio=0;
    private float subTotal=0;
    private float valorTotal=0;
    private float valorJuros=0;
    private float totalPagar=0;
    private float valorEntrada=0;
    private float valorParcelar=0;
    private float valorParcela=0;
    private float totalMoedaEstrangeira=0;
    private float totalMoedaReal = 0;
    private Cambio cambio;
    private boolean consultaCambio=false;
    private IConsultaCursos telaConsulta;
    private Fornecedorcidade fornecedorCidade;
    private Fornecedorcidade fornecedorCidadeAlterado;
    private Valoresseguro valoresSeguro;
    private Date dataCambio;
    private ConsultaParcelamentoPagamentoTableModel modelParcelamento;
    private List<Parcelamentopagamento> listaParcelamento;
    private boolean novaFicha = false;
    private Orcamentocurso orcamentoCurso;
    private String caracteres = "0987654321-()";
    private Cursos cursoAlterado;
    private String dadosAlterado;
    private String situacao= "PROCESSO";
    private float valorVendaAlterar=0.0f;
    private Fornecedorcomissaocurso fornecedorComissao;
    private Historicocursos historicocursos;
    private Itensalteradoscurso itensalteradoscurso;
    private List<Historicocursos> listaHistoricoCursos;
    private List<Itensalteradoscurso> listaItensAlteradosCursos;
    private String anterior;
    private String atual;
    private String campo;
    
    
    

    /**
     * Creates new form FrmFichaCursos
     */
    public FrmFichaCursos(int idVenda, UsuarioLogadoBean usuarioLogado,IConsultaCursos telaConsulta, Date dataCambio) {
        this.telaConsulta = telaConsulta;
        this.dataCambio = dataCambio;
        this.usuarioLogadoBean = usuarioLogado;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarInicializacao(idVenda);
        carregarModelParcelamento();
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

        temAlergiabuttonGroup = new javax.swing.ButtonGroup();
        cartaoVTMbuttonGroup = new javax.swing.ButtonGroup();
        TranferbuttonGroup = new javax.swing.ButtonGroup();
        passagemAereabuttonGroup = new javax.swing.ButtonGroup();
        solicitacaoVistobuttonGroup = new javax.swing.ButtonGroup();
        seguroPrivadobuttonGroup = new javax.swing.ButtonGroup();
        jLabel66 = new javax.swing.JLabel();
        transferinbuttonGroup = new javax.swing.ButtonGroup();
        transferoutbuttonGroup = new javax.swing.ButtonGroup();
        seguroGovernamentealbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        cursosjTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeClientejTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        idiomajComboBox = new javax.swing.JComboBox();
        nivelIdiomajComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        escolajTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        paisjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cursojTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    numeroSemanasjTextField = new javax.swing.JTextField();
    jLabel9 = new javax.swing.JLabel();
    jLabel11 = new javax.swing.JLabel();
    dataTerminojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
tipoDuracaojComboBox = new javax.swing.JComboBox();
jLabel8 = new javax.swing.JLabel();
jLabel31 = new javax.swing.JLabel();
aulasSemanajTextField = new javax.swing.JTextField();
jPanel25 = new javax.swing.JPanel();
jLabel28 = new javax.swing.JLabel();
scursojTextField = new javax.swing.JTextField();
jLabel44 = new javax.swing.JLabel();
sdataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    snumeroSemanasjTextField = new javax.swing.JTextField();
    jLabel50 = new javax.swing.JLabel();
    jLabel51 = new javax.swing.JLabel();
    sdataTerminojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
stipoDuracaojComboBox = new javax.swing.JComboBox();
jLabel57 = new javax.swing.JLabel();
jLabel67 = new javax.swing.JLabel();
saulasSemanajTextField = new javax.swing.JTextField();
habilitarSegundoCursojCheckBox = new javax.swing.JCheckBox();
jPanel3 = new javax.swing.JPanel();
jLabel12 = new javax.swing.JLabel();
tipoAcomodacaojComboBox = new javax.swing.JComboBox();
jLabel13 = new javax.swing.JLabel();
numeroSemanasAcomodacaojTextField = new javax.swing.JTextField();
tipoQuartojComboBox = new javax.swing.JComboBox();
jLabel14 = new javax.swing.JLabel();
jLabel15 = new javax.swing.JLabel();
refeicaojComboBox = new javax.swing.JComboBox();
jLabel16 = new javax.swing.JLabel();
adicionaisAcomodacaojTextField = new javax.swing.JTextField();
dataChegadaAcomodacaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    dataPartidaAcomodacaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel17 = new javax.swing.JLabel();
jLabel18 = new javax.swing.JLabel();
jLabel19 = new javax.swing.JLabel();
familiacriancajComboBox = new javax.swing.JComboBox();
familiaanimaisestimacaojComboBox = new javax.swing.JComboBox();
jLabel20 = new javax.swing.JLabel();
fumantejComboBox = new javax.swing.JComboBox();
jLabel21 = new javax.swing.JLabel();
vegetarianojComboBox = new javax.swing.JComboBox();
jLabel22 = new javax.swing.JLabel();
jLabel23 = new javax.swing.JLabel();
hobbiesjTextField = new javax.swing.JTextField();
jLabel24 = new javax.swing.JLabel();
temAlergiaSimjRadioButton = new javax.swing.JRadioButton();
temAlergiaNaojRadioButton = new javax.swing.JRadioButton();
quaisAlergiajTextField = new javax.swing.JTextField();
jLabel25 = new javax.swing.JLabel();
solicitacoesEspeciaisjTextField = new javax.swing.JTextField();
jPanel4 = new javax.swing.JPanel();
jPanel5 = new javax.swing.JPanel();
cartaoVTMSimjRadioButton = new javax.swing.JRadioButton();
cartaoVTMNaojRadioButton = new javax.swing.JRadioButton();
numeroCartaoVTMjTextField = new javax.swing.JTextField();
jLabel26 = new javax.swing.JLabel();
moedaCartaoVTMjComboBox = new javax.swing.JComboBox();
jLabel27 = new javax.swing.JLabel();
jPanel6 = new javax.swing.JPanel();
jPanel22 = new javax.swing.JPanel();
transferoutSimjRadioButton = new javax.swing.JRadioButton();
transferoutNaojRadioButton = new javax.swing.JRadioButton();
jPanel23 = new javax.swing.JPanel();
transferinSimjRadioButton = new javax.swing.JRadioButton();
transferinNaojRadioButton = new javax.swing.JRadioButton();
jPanel7 = new javax.swing.JPanel();
passagemTravelMatejCheckBox = new javax.swing.JCheckBox();
passagemClientejCheckBox = new javax.swing.JCheckBox();
jLabel33 = new javax.swing.JLabel();
observacaoPassagemAereajTextField = new javax.swing.JTextField();
jPanel27 = new javax.swing.JPanel();
vistoTravelMatejCheckBox = new javax.swing.JCheckBox();
vistoClientejCheckBox = new javax.swing.JCheckBox();
jLabel76 = new javax.swing.JLabel();
dataEntregaVistojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel77 = new javax.swing.JLabel();
    observacaoVistojTextField = new javax.swing.JTextField();
    jPanel8 = new javax.swing.JPanel();
    jPanel11 = new javax.swing.JPanel();
    jLabel42 = new javax.swing.JLabel();
    nomeContatoEmergenciajTextField = new javax.swing.JTextField();
    jLabel43 = new javax.swing.JLabel();
    emailConatoEmergenciajTextField = new javax.swing.JTextField();
    jLabel45 = new javax.swing.JLabel();
    relacaoEmergenciajTextField = new javax.swing.JTextField();
    telefoneEmergenciajTextField = new javax.swing.JTextField();
    telefoneEmergenciajCheckBox = new javax.swing.JCheckBox();
    jPanel28 = new javax.swing.JPanel();
    jLabel78 = new javax.swing.JLabel();
    jLabel79 = new javax.swing.JLabel();
    seguradoraGovernamentaljTextField = new javax.swing.JTextField();
    jLabel82 = new javax.swing.JLabel();
    numeromesesSegurosjTextField = new javax.swing.JTextField();
    seguroViagemGovernamentalSemjRadioButton = new javax.swing.JRadioButton();
    seguroViagemGovernamentalNaojRadioButton = new javax.swing.JRadioButton();
    valorSeguroGovernamentaljTextField = new javax.swing.JTextField();
    jLabel83 = new javax.swing.JLabel();
    jPanel9 = new javax.swing.JPanel();
    jLabel34 = new javax.swing.JLabel();
    seguroViagemSemjRadioButton = new javax.swing.JRadioButton();
    seguroViagemNaojRadioButton = new javax.swing.JRadioButton();
    selecionarSeguradorajButton = new javax.swing.JButton();
    jLabel37 = new javax.swing.JLabel();
    dataInicioSegurojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
numeroSemanaSegurosjTextField = new javax.swing.JTextField();
jLabel39 = new javax.swing.JLabel();
dataTerminoSegurojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel38 = new javax.swing.JLabel();
    valorSegurojTextField = new javax.swing.JTextField();
    jLabel65 = new javax.swing.JLabel();
    jLabel36 = new javax.swing.JLabel();
    planosegurojTextField = new javax.swing.JTextField();
    jLabel35 = new javax.swing.JLabel();
    seguradorajTextField = new javax.swing.JTextField();
    jPanel12 = new javax.swing.JPanel();
    jLabel46 = new javax.swing.JLabel();
    produtoOrcaemntojComboBox = new javax.swing.JComboBox();
    jLabel47 = new javax.swing.JLabel();
    valorProdutosMoedaEstrangeirajTextField = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    produtoOrcamentojTable = new javax.swing.JTable();
    jPanel13 = new javax.swing.JPanel();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jPanel14 = new javax.swing.JPanel();
    jLabel48 = new javax.swing.JLabel();
    jLabel49 = new javax.swing.JLabel();
    valorCambiojTextField = new javax.swing.JTextField();
    valorTotalOrcamentojTextField = new javax.swing.JTextField();
    jLabel52 = new javax.swing.JLabel();
    buscaBancojButton3 = new javax.swing.JButton();
    moedaCambiojComboBox = new javax.swing.JComboBox();
    valorProdutosMoedaRealjTextField = new javax.swing.JTextField();
    jLabel55 = new javax.swing.JLabel();
    jPanel15 = new javax.swing.JPanel();
    jPanel16 = new javax.swing.JPanel();
    jLabel61 = new javax.swing.JLabel();
    tipoParcelamentojComboBox = new javax.swing.JComboBox();
    jLabel62 = new javax.swing.JLabel();
    meioPagamentojComboBox = new javax.swing.JComboBox();
    jLabel63 = new javax.swing.JLabel();
    valorParcelamentojTextField = new javax.swing.JTextField();
    jLabel58 = new javax.swing.JLabel();
    jLabel59 = new javax.swing.JLabel();
    numeroParcelasjComboBox = new javax.swing.JComboBox();
    valorParcelajTextField = new javax.swing.JTextField();
    jLabel60 = new javax.swing.JLabel();
    dataVencimentojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jPanel18 = new javax.swing.JPanel();
condicaoPagamentojComboBox = new javax.swing.JComboBox();
jLabel53 = new javax.swing.JLabel();
valorOrcamentoFormajTextField = new javax.swing.JTextField();
jLabel54 = new javax.swing.JLabel();
possuiJurosjComboBox = new javax.swing.JComboBox();
jLabel64 = new javax.swing.JLabel();
valorJurosjTextField = new javax.swing.JTextField();
jLabel56 = new javax.swing.JLabel();
totalPagarjTextField = new javax.swing.JTextField();
jLabel68 = new javax.swing.JLabel();
jLabel29 = new javax.swing.JLabel();
saldoReceberjTextField = new javax.swing.JTextField();
jLabel30 = new javax.swing.JLabel();
saldoParcelarjTextField = new javax.swing.JTextField();
buscaBancojButton4 = new javax.swing.JButton();
jPanel20 = new javax.swing.JPanel();
jButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton();
jScrollPane2 = new javax.swing.JScrollPane();
parcelamentojTable = new javax.swing.JTable();
jPanel21 = new javax.swing.JPanel();
jScrollPane3 = new javax.swing.JScrollPane();
observacoesjTextArea111 = new javax.swing.JTextArea();
jPanel19 = new javax.swing.JPanel();
jScrollPane4 = new javax.swing.JScrollPane();
obsTMjTextArea = new javax.swing.JTextArea();
jLabel32 = new javax.swing.JLabel();

jLabel66.setText("jLabel66");

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Ficha de Curso");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(154, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(162, 162, 162))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
        public void stateChanged(javax.swing.event.ChangeEvent evt) {
            cursosjTabbedPaneStateChanged(evt);
        }
    });
    cursosjTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            cursosjTabbedPaneMouseClicked(evt);
        }
    });

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel1.setText("Selecionar Cliente");

    nomeClientejTextField.setEditable(false);

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton4.setText("Selecionar");
    jButton4.setToolTipText("Selecionar Cliente");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    jLabel2.setText("Idioma que irá Estudar");

    idiomajComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alemão", "Espanhol", "Francês", "Inglês", "Outro" }));
    idiomajComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            idiomajComboBoxItemStateChanged(evt);
        }
    });

    nivelIdiomajComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Básico", "Iniciante", "Pré-Intermediário", "Intermediário", "Avançado", "Alto", "Fluente" }));
    nivelIdiomajComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            nivelIdiomajComboBoxItemStateChanged(evt);
        }
    });

    jLabel3.setText("Nível Conhecimento");

    jLabel4.setText("Escola / Instituição");

    escolajTextField.setEditable(false);

    jLabel6.setText("Cidade");

    cidadejTextField.setEditable(false);

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton1.setText("Selecionar");
    jButton1.setToolTipText("Selecionar Escola");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    paisjTextField.setEditable(false);

    jLabel7.setText("País");

    jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Curso Principal"));

    jLabel5.setText("Curso");

    jLabel10.setText("Data Início");

    dataIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataIniciojDateChooserFocusGained(evt);
        }
    });

    numeroSemanasjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    numeroSemanasjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            numeroSemanasjTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            numeroSemanasjTextFieldFocusLost(evt);
        }
    });
    numeroSemanasjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            numeroSemanasjTextFieldKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            numeroSemanasjTextFieldKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroSemanasjTextFieldKeyTyped(evt);
        }
    });

    jLabel9.setText("No. Semanas");

    jLabel11.setText("Data Término");

    dataTerminojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataTerminojDateChooserFocusGained(evt);
        }
    });

    tipoDuracaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horas por Semana", "Aulas por Semana" }));

    jLabel8.setText("Tipo de Carga Horária");

    jLabel31.setText("Carga Horária");

    aulasSemanajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    aulasSemanajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            aulasSemanajTextFieldKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
    jPanel24.setLayout(jPanel24Layout);
    jPanel24Layout.setHorizontalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10)
                .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(numeroSemanasjTextField)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel11))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tipoDuracaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(aulasSemanajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel31)))
        .addComponent(cursojTextField)
        .addGroup(jPanel24Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(0, 0, Short.MAX_VALUE))
    );
    jPanel24Layout.setVerticalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel24Layout.createSequentialGroup()
            .addComponent(jLabel5)
            .addGap(6, 6, 6)
            .addComponent(cursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel31)))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aulasSemanajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tipoDuracaojComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel24Layout.createSequentialGroup()
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel11))
                    .addGap(6, 6, 6)
                    .addComponent(numeroSemanasjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(0, 8, Short.MAX_VALUE))
    );

    jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Segundo Curso"));

    jLabel28.setText("Curso");

    scursojTextField.setEnabled(false);

    jLabel44.setText("Data Início");

    sdataIniciojDateChooser.setEnabled(false);
    sdataIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            sdataIniciojDateChooserFocusGained(evt);
        }
    });

    snumeroSemanasjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    snumeroSemanasjTextField.setEnabled(false);
    snumeroSemanasjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            snumeroSemanasjTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            snumeroSemanasjTextFieldFocusLost(evt);
        }
    });
    snumeroSemanasjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            snumeroSemanasjTextFieldKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            snumeroSemanasjTextFieldKeyTyped(evt);
        }
    });

    jLabel50.setText("No. Semanas");

    jLabel51.setText("Data Término");

    sdataTerminojDateChooser.setEnabled(false);
    sdataTerminojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            sdataTerminojDateChooserFocusGained(evt);
        }
    });

    stipoDuracaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Horas por Semana", "Aulas por Semana" }));
    stipoDuracaojComboBox.setEnabled(false);

    jLabel57.setText("Tipo de Carga Horária");

    jLabel67.setText("Carga Horária");

    saulasSemanajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    saulasSemanajTextField.setEnabled(false);
    saulasSemanajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            saulasSemanajTextFieldKeyTyped(evt);
        }
    });

    habilitarSegundoCursojCheckBox.setText("Habilitar Segundo Curso");
    habilitarSegundoCursojCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            habilitarSegundoCursojCheckBoxItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
    jPanel25.setLayout(jPanel25Layout);
    jPanel25Layout.setHorizontalGroup(
        jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel44)
                .addComponent(sdataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(snumeroSemanasjTextField)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addComponent(jLabel50)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(sdataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel51))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(stipoDuracaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel57))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(saulasSemanajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel67)))
        .addComponent(scursojTextField)
        .addGroup(jPanel25Layout.createSequentialGroup()
            .addComponent(jLabel28)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(habilitarSegundoCursojCheckBox)
            .addContainerGap())
    );
    jPanel25Layout.setVerticalGroup(
        jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel25Layout.createSequentialGroup()
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel28)
                .addComponent(habilitarSegundoCursojCheckBox))
            .addGap(6, 6, 6)
            .addComponent(scursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(1, 1, 1)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel44)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57)
                            .addComponent(jLabel67)))
                    .addGap(6, 6, 6)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(sdataIniciojDateChooser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saulasSemanajTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(stipoDuracaojComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel50)
                        .addComponent(jLabel51))
                    .addGap(6, 6, 6)
                    .addComponent(snumeroSemanasjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(sdataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(paisjTextField)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(nomeClientejTextField)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(idiomajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addComponent(nivelIdiomajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(escolajTextField)
                    .addGap(18, 18, 18)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(6, 6, 6)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4))
            .addGap(10, 10, 10)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addGap(6, 6, 6)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(idiomajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nivelIdiomajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel4)
            .addGap(4, 4, 4)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(escolajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(6, 6, 6)
                    .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel7)
                    .addGap(6, 6, 6)
                    .addComponent(paisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Curso", jPanel2);

    jLabel12.setText("Tipo Acomodação");

    tipoAcomodacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem acomodação", "Casa de família", "Residência", "Alojamento", "Outro", "Studio" }));
    tipoAcomodacaojComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            tipoAcomodacaojComboBoxItemStateChanged(evt);
        }
    });

    jLabel13.setText("Nº Semanas (Somente Números)");

    numeroSemanasAcomodacaojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    numeroSemanasAcomodacaojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            numeroSemanasAcomodacaojTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            numeroSemanasAcomodacaojTextFieldFocusLost(evt);
        }
    });
    numeroSemanasAcomodacaojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroSemanasAcomodacaojTextFieldKeyTyped(evt);
        }
    });

    tipoQuartojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem quarto", "Quarto individual", "Quarto duplo", "Quarto triplo", "Compartilhado" }));
    tipoQuartojComboBox.setEnabled(false);

    jLabel14.setText("Quarto");

    jLabel15.setText("Refeição");

    refeicaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Refeição", "Café da Manhã", "Meia Pensão (2 Refeições)", "Pensão Completa (3 Refeições)" }));
    refeicaojComboBox.setEnabled(false);

    jLabel16.setText("Adicionais");

    dataChegadaAcomodacaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataChegadaAcomodacaojDateChooserFocusGained(evt);
        }
    });

    dataPartidaAcomodacaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataPartidaAcomodacaojDateChooserFocusGained(evt);
        }
    });

    jLabel17.setText("Data Chegada");

    jLabel18.setText("Data Partida");

    jLabel19.setText("Prefere família com criança");

    familiacriancajComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indiferente", "Sim", "Não" }));
    familiacriancajComboBox.setEnabled(false);

    familiaanimaisestimacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Indiferente", "Sim", "Não" }));
    familiaanimaisestimacaojComboBox.setEnabled(false);

    jLabel20.setText("Com animais de estimação");

    fumantejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));

    jLabel21.setText("Você é fumante");

    vegetarianojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));

    jLabel22.setText("Você é vegetariano");

    jLabel23.setText("Quais seus interesses e  hobbies");

    jLabel24.setText("Tem alergia a algum medicamento ou alimento? Se sim, especifique");

    temAlergiabuttonGroup.add(temAlergiaSimjRadioButton);
    temAlergiaSimjRadioButton.setText("Sim");
    temAlergiaSimjRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            temAlergiaSimjRadioButtonItemStateChanged(evt);
        }
    });

    temAlergiabuttonGroup.add(temAlergiaNaojRadioButton);
    temAlergiaNaojRadioButton.setSelected(true);
    temAlergiaNaojRadioButton.setText("Não");
    temAlergiaNaojRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            temAlergiaNaojRadioButtonItemStateChanged(evt);
        }
    });

    quaisAlergiajTextField.setEnabled(false);

    jLabel25.setText("Solicitações Especiais");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(solicitacoesEspeciaisjTextField)
                .addComponent(adicionaisAcomodacaojTextField)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(refeicaojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tipoAcomodacaojComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(103, 103, 103)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(tipoQuartojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dataChegadaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(numeroSemanasAcomodacaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(dataPartidaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2))))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(familiacriancajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(familiaanimaisestimacaojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addGap(0, 81, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(fumantejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel22)
                        .addComponent(vegetarianojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(hobbiesjTextField)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(temAlergiaSimjRadioButton)
                    .addGap(18, 18, 18)
                    .addComponent(temAlergiaNaojRadioButton)
                    .addGap(18, 18, 18)
                    .addComponent(quaisAlergiajTextField))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabel25))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel12)
                .addComponent(jLabel14))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tipoAcomodacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipoQuartojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel17))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(refeicaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dataChegadaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(jLabel13))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataPartidaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(numeroSemanasAcomodacaojTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel16)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(adicionaisAcomodacaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel19)
                .addComponent(jLabel20)
                .addComponent(jLabel21)
                .addComponent(jLabel22))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(familiacriancajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(familiaanimaisestimacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(fumantejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(vegetarianojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel23)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(hobbiesjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel24)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(temAlergiaSimjRadioButton)
                .addComponent(temAlergiaNaojRadioButton)
                .addComponent(quaisAlergiajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel25)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(solicitacoesEspeciaisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(135, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Acomodação", jPanel3);

    jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Cartão VTM"));

    cartaoVTMbuttonGroup.add(cartaoVTMSimjRadioButton);
    cartaoVTMSimjRadioButton.setText("Sim");
    cartaoVTMSimjRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cartaoVTMSimjRadioButtonItemStateChanged(evt);
        }
    });

    cartaoVTMbuttonGroup.add(cartaoVTMNaojRadioButton);
    cartaoVTMNaojRadioButton.setSelected(true);
    cartaoVTMNaojRadioButton.setText("Não");
    cartaoVTMNaojRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            cartaoVTMNaojRadioButtonItemStateChanged(evt);
        }
    });

    numeroCartaoVTMjTextField.setEnabled(false);

    jLabel26.setText("Número do Cartão");

    moedaCartaoVTMjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "    ", "Euro", "Dólar Americano", "Dólar Canadense", "Dolár Australiano", "Libra" }));
    moedaCartaoVTMjComboBox.setEnabled(false);

    jLabel27.setText("Moeda Cartão VTM");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(numeroCartaoVTMjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(cartaoVTMSimjRadioButton)
                    .addGap(29, 29, 29)
                    .addComponent(cartaoVTMNaojRadioButton))
                .addComponent(jLabel26))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addComponent(jLabel27)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(moedaCartaoVTMjComboBox, 0, 382, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cartaoVTMSimjRadioButton)
                .addComponent(cartaoVTMNaojRadioButton))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel26)
                .addComponent(jLabel27))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(numeroCartaoVTMjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(moedaCartaoVTMjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Chegada ao Destino (Transfer Aeroporto)"));

    jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Transfer Out (Partida)"));

    transferoutbuttonGroup.add(transferoutSimjRadioButton);
    transferoutSimjRadioButton.setText("Sim");

    transferoutbuttonGroup.add(transferoutNaojRadioButton);
    transferoutNaojRadioButton.setSelected(true);
    transferoutNaojRadioButton.setText("Não");

    javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
    jPanel22.setLayout(jPanel22Layout);
    jPanel22Layout.setHorizontalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel22Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(transferoutSimjRadioButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
            .addComponent(transferoutNaojRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36))
    );
    jPanel22Layout.setVerticalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel22Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(transferoutSimjRadioButton)
                .addComponent(transferoutNaojRadioButton)))
    );

    jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Transfer In (Chegada)"));

    transferinbuttonGroup.add(transferinSimjRadioButton);
    transferinSimjRadioButton.setText("Sim");

    transferinbuttonGroup.add(transferinNaojRadioButton);
    transferinNaojRadioButton.setSelected(true);
    transferinNaojRadioButton.setText("Não");

    javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
    jPanel23.setLayout(jPanel23Layout);
    jPanel23Layout.setHorizontalGroup(
        jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel23Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(transferinSimjRadioButton)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
            .addComponent(transferinNaojRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel23Layout.setVerticalGroup(
        jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel23Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(transferinSimjRadioButton)
                .addComponent(transferinNaojRadioButton)))
    );

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
        jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel6Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(39, 39, 39))
    );

    jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Passagem Aérea quando não inclusa no programa"));

    passagemAereabuttonGroup.add(passagemTravelMatejCheckBox);
    passagemTravelMatejCheckBox.setText("Através da TravelMate");

    passagemAereabuttonGroup.add(passagemClientejCheckBox);
    passagemClientejCheckBox.setSelected(true);
    passagemClientejCheckBox.setText("Cliente providenciará");

    jLabel33.setText("Observação");

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(passagemTravelMatejCheckBox)
                            .addGap(125, 125, 125)
                            .addComponent(passagemClientejCheckBox))
                        .addComponent(jLabel33))
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(observacaoPassagemAereajTextField))
            .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(passagemTravelMatejCheckBox)
                .addComponent(passagemClientejCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
            .addComponent(jLabel33)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(observacaoPassagemAereajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitação de Visto Consular"));

    solicitacaoVistobuttonGroup.add(vistoTravelMatejCheckBox);
    vistoTravelMatejCheckBox.setText("Através da TravelMate");
    vistoTravelMatejCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            vistoTravelMatejCheckBoxItemStateChanged(evt);
        }
    });

    solicitacaoVistobuttonGroup.add(vistoClientejCheckBox);
    vistoClientejCheckBox.setSelected(true);
    vistoClientejCheckBox.setText("Cliente providenciará");
    vistoClientejCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            vistoClientejCheckBoxItemStateChanged(evt);
        }
    });

    jLabel76.setText("Data Entrega Documentos");

    dataEntregaVistojDateChooser.setEnabled(false);
    dataEntregaVistojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataEntregaVistojDateChooserFocusGained(evt);
        }
    });

    jLabel77.setText("Observação");

    javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
    jPanel27.setLayout(jPanel27Layout);
    jPanel27Layout.setHorizontalGroup(
        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel27Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dataEntregaVistojDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(observacaoVistojTextField)
                        .addGroup(jPanel27Layout.createSequentialGroup()
                            .addComponent(jLabel77)
                            .addContainerGap())))
                .addGroup(jPanel27Layout.createSequentialGroup()
                    .addComponent(vistoTravelMatejCheckBox)
                    .addGap(18, 18, 18)
                    .addComponent(vistoClientejCheckBox)
                    .addContainerGap(367, Short.MAX_VALUE))))
    );
    jPanel27Layout.setVerticalGroup(
        jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel27Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(vistoTravelMatejCheckBox)
                .addComponent(vistoClientejCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel76)
                .addComponent(jLabel77))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dataEntregaVistojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(observacaoVistojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Cartão VTM/Transfer/Passagem/Visto", jPanel4);

    jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato de Emergência no Brasil"));

    jLabel42.setText("Nome");

    jLabel43.setText("E-mail");

    jLabel45.setText("Relação");

    telefoneEmergenciajTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            telefoneEmergenciajTextFieldFocusLost(evt);
        }
    });
    telefoneEmergenciajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            telefoneEmergenciajTextFieldKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            telefoneEmergenciajTextFieldKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            telefoneEmergenciajTextFieldKeyTyped(evt);
        }
    });

    telefoneEmergenciajCheckBox.setText("9-Telefone");
    telefoneEmergenciajCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            telefoneEmergenciajCheckBoxItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addComponent(emailConatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(relacaoEmergenciajTextField))
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeContatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel43)
                        .addComponent(jLabel42))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefoneEmergenciajTextField)
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel45)
                                .addComponent(telefoneEmergenciajCheckBox))
                            .addGap(0, 0, Short.MAX_VALUE)))))
            .addContainerGap())
    );
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel11Layout.createSequentialGroup()
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel42)
                .addComponent(telefoneEmergenciajCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeContatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(telefoneEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel43)
                .addComponent(jLabel45))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailConatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(relacaoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguro Viagem Governamental"));

    jLabel78.setText("Seguro Viagem");

    jLabel79.setText("Seguradora");

    seguradoraGovernamentaljTextField.setEnabled(false);
    seguradoraGovernamentaljTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            seguradoraGovernamentaljTextFieldFocusGained(evt);
        }
    });
    seguradoraGovernamentaljTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            seguradoraGovernamentaljTextFieldKeyTyped(evt);
        }
    });

    jLabel82.setText("Nº Meses (Somente Números)");

    numeromesesSegurosjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    numeromesesSegurosjTextField.setEnabled(false);
    numeromesesSegurosjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            numeromesesSegurosjTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            numeromesesSegurosjTextFieldFocusLost(evt);
        }
    });
    numeromesesSegurosjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeromesesSegurosjTextFieldKeyTyped(evt);
        }
    });

    seguroGovernamentealbuttonGroup.add(seguroViagemGovernamentalSemjRadioButton);
    seguroViagemGovernamentalSemjRadioButton.setText("Sim");
    seguroViagemGovernamentalSemjRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            seguroViagemGovernamentalSemjRadioButtonItemStateChanged(evt);
        }
    });

    seguroGovernamentealbuttonGroup.add(seguroViagemGovernamentalNaojRadioButton);
    seguroViagemGovernamentalNaojRadioButton.setSelected(true);
    seguroViagemGovernamentalNaojRadioButton.setText("Não");
    seguroViagemGovernamentalNaojRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            seguroViagemGovernamentalNaojRadioButtonItemStateChanged(evt);
        }
    });

    valorSeguroGovernamentaljTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorSeguroGovernamentaljTextField.setEnabled(false);
    valorSeguroGovernamentaljTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorSeguroGovernamentaljTextFieldFocusLost(evt);
        }
    });
    valorSeguroGovernamentaljTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorSeguroGovernamentaljTextFieldKeyTyped(evt);
        }
    });

    jLabel83.setText("Valor do Seguro");

    javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
    jPanel28.setLayout(jPanel28Layout);
    jPanel28Layout.setHorizontalGroup(
        jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel28Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel78)
                .addGroup(jPanel28Layout.createSequentialGroup()
                    .addComponent(seguroViagemGovernamentalSemjRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seguroViagemGovernamentalNaojRadioButton)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel79)
                .addComponent(seguradoraGovernamentaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(numeromesesSegurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel82))
            .addGap(18, 18, 18)
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel83)
                .addComponent(valorSeguroGovernamentaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(90, Short.MAX_VALUE))
    );
    jPanel28Layout.setVerticalGroup(
        jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel28Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(numeromesesSegurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel28Layout.createSequentialGroup()
                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel79)
                                .addComponent(jLabel83))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(seguradoraGovernamentaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(seguroViagemGovernamentalSemjRadioButton)
                                .addComponent(seguroViagemGovernamentalNaojRadioButton)
                                .addComponent(valorSeguroGovernamentaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addComponent(jLabel82))
            .addContainerGap(19, Short.MAX_VALUE))
    );

    jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguro Viagem"));

    jLabel34.setText("Seguro Viagem");

    seguroPrivadobuttonGroup.add(seguroViagemSemjRadioButton);
    seguroViagemSemjRadioButton.setText("Sim");
    seguroViagemSemjRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            seguroViagemSemjRadioButtonItemStateChanged(evt);
        }
    });

    seguroPrivadobuttonGroup.add(seguroViagemNaojRadioButton);
    seguroViagemNaojRadioButton.setSelected(true);
    seguroViagemNaojRadioButton.setText("Não");
    seguroViagemNaojRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            seguroViagemNaojRadioButtonItemStateChanged(evt);
        }
    });

    selecionarSeguradorajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    selecionarSeguradorajButton.setText("Selecionar");
    selecionarSeguradorajButton.setEnabled(false);
    selecionarSeguradorajButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selecionarSeguradorajButtonActionPerformed(evt);
        }
    });

    jLabel37.setText("Data do início");

    dataInicioSegurojDateChooser.setEnabled(false);
    dataInicioSegurojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataInicioSegurojDateChooserFocusGained(evt);
        }
    });

    numeroSemanaSegurosjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    numeroSemanaSegurosjTextField.setEnabled(false);
    numeroSemanaSegurosjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            numeroSemanaSegurosjTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            numeroSemanaSegurosjTextFieldFocusLost(evt);
        }
    });
    numeroSemanaSegurosjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroSemanaSegurosjTextFieldKeyTyped(evt);
        }
    });

    jLabel39.setText("Nº dias (Somente Números)");

    dataTerminoSegurojDateChooser.setEnabled(false);
    dataTerminoSegurojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataTerminoSegurojDateChooserFocusGained(evt);
        }
    });

    jLabel38.setText("Data do término");

    valorSegurojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorSegurojTextField.setEnabled(false);
    valorSegurojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorSegurojTextFieldFocusLost(evt);
        }
    });
    valorSegurojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorSegurojTextFieldKeyTyped(evt);
        }
    });

    jLabel65.setText("Valor do Seguro");

    jLabel36.setText("Plano");

    planosegurojTextField.setEnabled(false);

    jLabel35.setText("Seguradora");

    seguradorajTextField.setEditable(false);
    seguradorajTextField.setEnabled(false);
    seguradorajTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            seguradorajTextFieldFocusLost(evt);
        }
    });

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(planosegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel36)
                .addComponent(jLabel34)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(seguroViagemSemjRadioButton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(seguroViagemNaojRadioButton)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(seguradorajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35))
                    .addGap(39, 39, 39)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel65)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(valorSegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(selecionarSeguradorajButton)))
                    .addGap(85, 85, 85))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addGap(45, 45, 45))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                            .addComponent(dataInicioSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(numeroSemanaSegurosjTextField))
                    .addGap(43, 43, 43)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel38)
                        .addComponent(dataTerminoSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(99, 99, 99))))
    );
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addGap(25, 25, 25))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seguroViagemSemjRadioButton)
                            .addComponent(seguroViagemNaojRadioButton))))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(jLabel37)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataInicioSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataTerminoSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numeroSemanaSegurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jLabel65))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seguradorajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorSegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selecionarSeguradorajButton)))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addComponent(jLabel36)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(planosegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 720, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGap(12, 12, 12)
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(70, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Seguro/Contato", jPanel8);

    jLabel46.setText("Produtos");

    jLabel47.setText("Valor (Moeda Estrangeira)");

    valorProdutosMoedaEstrangeirajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorProdutosMoedaEstrangeirajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorProdutosMoedaEstrangeirajTextFieldKeyTyped(evt);
        }
    });

    produtoOrcamentojTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "Produtos Orçamento", "Moeda Estrangeira", "Valor R$"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane1.setViewportView(produtoOrcamentojTable);
    if (produtoOrcamentojTable.getColumnModel().getColumnCount() > 0) {
        produtoOrcamentojTable.getColumnModel().getColumn(0).setResizable(false);
        produtoOrcamentojTable.getColumnModel().getColumn(0).setPreferredWidth(290);
        produtoOrcamentojTable.getColumnModel().getColumn(1).setResizable(false);
        produtoOrcamentojTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        produtoOrcamentojTable.getColumnModel().getColumn(2).setResizable(false);
        produtoOrcamentojTable.getColumnModel().getColumn(2).setPreferredWidth(50);
    }

    jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/adicionar.png"))); // NOI18N
    jButton2.setText("Adicionar");
    jButton2.setToolTipText("Adicionar novo produtos no orçamento");
    jButton2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton2ActionPerformed(evt);
        }
    });

    jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/excluir.png"))); // NOI18N
    jButton3.setText("Excluir");
    jButton3.setToolTipText("Excluir produto no orçamento");
    jButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton3ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
    jPanel13.setLayout(jPanel13Layout);
    jPanel13Layout.setHorizontalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(53, 53, 53))
    );
    jPanel13Layout.setVerticalGroup(
        jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel13Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(jButton3))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel48.setText("Moeda");

    jLabel49.setText("Valor do câmbio ");

    valorCambiojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorCambiojTextField.setEnabled(false);

    valorTotalOrcamentojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorTotalOrcamentojTextField.setEnabled(false);

    jLabel52.setText("Valor Total R$");

    buscaBancojButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/cambio.png"))); // NOI18N
    buscaBancojButton3.setToolTipText("Alterar Câmbio");
    buscaBancojButton3.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buscaBancojButton3ActionPerformed(evt);
        }
    });

    moedaCambiojComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            moedaCambiojComboBoxItemStateChanged(evt);
        }
    });

    javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
    jPanel14.setLayout(jPanel14Layout);
    jPanel14Layout.setHorizontalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel14Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel48)
                .addComponent(moedaCambiojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel49)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addComponent(valorCambiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(buscaBancojButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(valorTotalOrcamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel52))
            .addContainerGap())
    );
    jPanel14Layout.setVerticalGroup(
        jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel14Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel48)
                .addComponent(jLabel49)
                .addComponent(jLabel52))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorTotalOrcamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorCambiojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(moedaCambiojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(buscaBancojButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    valorProdutosMoedaRealjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorProdutosMoedaRealjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorProdutosMoedaRealjTextFieldKeyTyped(evt);
        }
    });

    jLabel55.setText("Valor R$");

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel46)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(produtoOrcaemntojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorProdutosMoedaEstrangeirajTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(10, 10, 10)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addComponent(valorProdutosMoedaRealjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(244, 244, 244)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel46)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel55))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(produtoOrcaemntojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(valorProdutosMoedaEstrangeirajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(valorProdutosMoedaRealjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18))
    );

    cursosjTabbedPane.addTab("Produtos", jPanel12);

    jPanel16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jLabel61.setText("Tipo de Parcelamento");

    tipoParcelamentojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Matriz", "Loja", "Fornecedor" }));

    jLabel62.setText("Forma de Pagamento");

    meioPagamentojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Dinheiro", "Boleto", "Cartão de crédito", "Cartão de crédito autorizado", "Cartão débito", "Cheque", "Déposito", "Financiamento banco" }));
    meioPagamentojComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            meioPagamentojComboBoxItemStateChanged(evt);
        }
    });

    jLabel63.setText("Data Primeiro Vencimento");

    valorParcelamentojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorParcelamentojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            valorParcelamentojTextFieldFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorParcelamentojTextFieldFocusLost(evt);
        }
    });
    valorParcelamentojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorParcelamentojTextFieldKeyTyped(evt);
        }
    });

    jLabel58.setText("Valor a Parcelar ");

    jLabel59.setText("Nº Parcelas");

    numeroParcelasjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
    numeroParcelasjComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            numeroParcelasjComboBoxItemStateChanged(evt);
        }
    });

    valorParcelajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorParcelajTextField.setEnabled(false);
    valorParcelajTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            valorParcelajTextFieldFocusGained(evt);
        }
    });
    valorParcelajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            valorParcelajTextFieldKeyPressed(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorParcelajTextFieldKeyTyped(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            valorParcelajTextFieldKeyReleased(evt);
        }
    });

    jLabel60.setText("Valor Parcela");

    dataVencimentojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataVencimentojDateChooserFocusGained(evt);
        }
    });

    javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
    jPanel16.setLayout(jPanel16Layout);
    jPanel16Layout.setHorizontalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel16Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel62)
                        .addComponent(meioPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tipoParcelamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61))
                    .addGap(155, 155, 155)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel63)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel58)
                        .addComponent(valorParcelamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(109, 109, 109)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel59)
                        .addComponent(numeroParcelasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorParcelajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );
    jPanel16Layout.setVerticalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel16Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addComponent(jLabel62)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(meioPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(tipoParcelamentojComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63)
                        .addComponent(jLabel61))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addComponent(jLabel59)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(numeroParcelasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel58)
                        .addComponent(jLabel60))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorParcelajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(valorParcelamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );

    jPanel18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    condicaoPagamentojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "À Vista", "Parcelado" }));
    condicaoPagamentojComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            condicaoPagamentojComboBoxItemStateChanged(evt);
        }
    });

    jLabel53.setText("Forma de Pagamento");

    valorOrcamentoFormajTextField.setEditable(false);
    valorOrcamentoFormajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorOrcamentoFormajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorOrcamentoFormajTextFieldKeyTyped(evt);
        }
    });

    jLabel54.setText("Valor Orçamento");

    possuiJurosjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));
    possuiJurosjComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            possuiJurosjComboBoxItemStateChanged(evt);
        }
    });

    jLabel64.setText("Acrescentar Juros");

    valorJurosjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorJurosjTextField.setEnabled(false);
    valorJurosjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorJurosjTextFieldFocusLost(evt);
        }
    });
    valorJurosjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            valorJurosjTextFieldKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorJurosjTextFieldKeyTyped(evt);
        }
    });

    jLabel56.setText("Valor Juros");

    totalPagarjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    totalPagarjTextField.setEnabled(false);

    jLabel68.setText("Total a Pagar");

    jLabel29.setText("Saldo a Receber");

    saldoReceberjTextField.setEditable(false);
    saldoReceberjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    saldoReceberjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            saldoReceberjTextFieldKeyTyped(evt);
        }
    });

    jLabel30.setText("Saldo a Parcelar");

    saldoParcelarjTextField.setEditable(false);
    saldoParcelarjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    saldoParcelarjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            saldoParcelarjTextFieldKeyTyped(evt);
        }
    });

    buscaBancojButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icones/cambio.png"))); // NOI18N
    buscaBancojButton4.setToolTipText("Calculo de Juros");
    buscaBancojButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            buscaBancojButton4ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel53))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel54))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscaBancojButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel56))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29)
                        .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30))))
            .addContainerGap())
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addGap(4, 4, 4)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel53)
                .addComponent(jLabel54)
                .addComponent(jLabel56)
                .addComponent(jLabel64)
                .addComponent(jLabel68))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(buscaBancojButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addComponent(jLabel30)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addComponent(jLabel29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/adicionar.png"))); // NOI18N
    jButton7.setText("Adicionar");
    jButton7.setToolTipText("Adicionar forma de pagamento");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });

    jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/excluir.png"))); // NOI18N
    jButton8.setText("Excluir");
    jButton8.setToolTipText("Excluir forma de pagamento");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton8ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
    jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
            .addGap(30, 30, 30)
            .addComponent(jButton7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(24, 24, 24))
    );
    jPanel20Layout.setVerticalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton7)
                .addComponent(jButton8))
            .addContainerGap())
    );

    parcelamentojTable.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null},
            {null, null, null, null, null}
        },
        new String [] {
            "Forma Pagamento", "Tipo Parcelmaneto", "Valor a Parcelar", "Nº Parcelas", "Valor Parcela"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane2.setViewportView(parcelamentojTable);
    if (parcelamentojTable.getColumnModel().getColumnCount() > 0) {
        parcelamentojTable.getColumnModel().getColumn(0).setResizable(false);
        parcelamentojTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        parcelamentojTable.getColumnModel().getColumn(1).setResizable(false);
        parcelamentojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        parcelamentojTable.getColumnModel().getColumn(2).setResizable(false);
        parcelamentojTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        parcelamentojTable.getColumnModel().getColumn(3).setResizable(false);
        parcelamentojTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        parcelamentojTable.getColumnModel().getColumn(4).setResizable(false);
        parcelamentojTable.getColumnModel().getColumn(4).setPreferredWidth(50);
    }

    javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
    jPanel15.setLayout(jPanel15Layout);
    jPanel15Layout.setHorizontalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
            .addContainerGap())
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addGap(228, 228, 228)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel15Layout.setVerticalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(282, 282, 282))
    );

    cursosjTabbedPane.addTab("Forma Pagto", jPanel15);

    observacoesjTextArea111.setColumns(20);
    observacoesjTextArea111.setLineWrap(true);
    observacoesjTextArea111.setRows(5);
    observacoesjTextArea111.setWrapStyleWord(true);
    jScrollPane3.setViewportView(observacoesjTextArea111);

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Obs", jPanel21);

    obsTMjTextArea.setColumns(20);
    obsTMjTextArea.setRows(5);
    jScrollPane4.setViewportView(obsTMjTextArea);

    jLabel32.setText("Observações que serão enviadas ao Departamento Responsável e ao Departamento Financeiro da TravelMate");

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 715, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addComponent(jLabel32)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel32)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Obs TM", jPanel19);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(cursosjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(cursosjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(19, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataChegadaAcomodacaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataChegadaAcomodacaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataChegadaAcomodacaojDateChooserFocusGained

    private void dataPartidaAcomodacaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataPartidaAcomodacaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPartidaAcomodacaojDateChooserFocusGained

    private void temAlergiaSimjRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_temAlergiaSimjRadioButtonItemStateChanged
        if (temAlergiaSimjRadioButton.isSelected()){
            quaisAlergiajTextField.setEnabled(true);
        }
    }//GEN-LAST:event_temAlergiaSimjRadioButtonItemStateChanged

    private void temAlergiaNaojRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_temAlergiaNaojRadioButtonItemStateChanged
        if (temAlergiaNaojRadioButton.isSelected()){
            quaisAlergiajTextField.setText("");
            quaisAlergiajTextField.setEnabled(false);
        }
    }//GEN-LAST:event_temAlergiaNaojRadioButtonItemStateChanged

    private void cartaoVTMSimjRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cartaoVTMSimjRadioButtonItemStateChanged
        if (cartaoVTMSimjRadioButton.isSelected()){
            numeroCartaoVTMjTextField.setEnabled(true);
            moedaCartaoVTMjComboBox.setEnabled(true);
            numeroCartaoVTMjTextField.requestFocus();
            numeroCartaoVTMjTextField.selectAll();
        }
    }//GEN-LAST:event_cartaoVTMSimjRadioButtonItemStateChanged

    private void cartaoVTMNaojRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cartaoVTMNaojRadioButtonItemStateChanged
        if (cartaoVTMNaojRadioButton.isSelected()){
            numeroCartaoVTMjTextField.setText("");
            numeroCartaoVTMjTextField.setEnabled(false);
            moedaCartaoVTMjComboBox.setEnabled(false);
            moedaCartaoVTMjComboBox.setSelectedItem("   ");
        }
    }//GEN-LAST:event_cartaoVTMNaojRadioButtonItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (valorCambio > 0) {
            float valorEstrangeira = 0.0f;
            float valorReal = 0.0f;
            if (valorProdutosMoedaEstrangeirajTextField.getText().length() > 0) {
                valorEstrangeira = Formatacao.formatarStringfloat(valorProdutosMoedaEstrangeirajTextField.getText());
            } else {
                if (valorProdutosMoedaRealjTextField.getText().length() > 0) {
                    valorReal = Formatacao.formatarStringfloat(valorProdutosMoedaRealjTextField.getText());
                }
            }
            Viewprodutosfiltro produtosorcamento = (Viewprodutosfiltro) produtoOrcaemntojComboBox.getSelectedItem();
            int idProdTx = usuarioLogadoBean.getParametrosprodutos().getPassagemTaxaTM();
            if (produtosorcamento.getIdProdutosOrcamento() != idProdTx) {
                if (produtosorcamento != null) {
                    ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                    pob.setIdOrcamentoProdutoOrcamento(0);
                    pob.setDescricaoProdutoOrcamento(produtosorcamento.getDescricaoProdutosOrcamento());
                    pob.setIdProdutoOrcamento(produtosorcamento.getIdProdutosOrcamento());
                    if ((valorEstrangeira != 0) && (valorCambio > 0)) {
                        valorReal = valorEstrangeira * valorCambio;
                    } else {
                        if ((valorReal != 0) && (valorCambio > 0)) {
                            valorEstrangeira = valorReal / valorCambio;
                            String valor = Formatacao.formatarFloatString(valorEstrangeira);
                            valorEstrangeira = Formatacao.formatarStringfloat(valor);
                        }
                    }
                    pob.setValorMoedaEstrangeira(valorEstrangeira);
                    pob.setValorMoedaReal(valorReal);
                    pob.setApagar(false);
                    pob.setVisto(false);
                    pob.setSeguro(false);
                    pob.setNovo(true);
                    pob.setTipo("A");
                    listaProdutoOrcamentoBean.add(pob);
                    calcularValorTotalOrcamento();
                    carregarModelOrcamentoProduto();
                    valorProdutosMoedaEstrangeirajTextField.setText("");
                    valorProdutosMoedaRealjTextField.setText("");
                }
            }else JOptionPane.showMessageDialog(rootPane, "Taxa TM já esta inclusa");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Cambio não selecionado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void possuiJurosjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_possuiJurosjComboBoxItemStateChanged
        if (possuiJurosjComboBox.getSelectedItem().toString().equalsIgnoreCase("Sim")){
            valorJurosjTextField.setEnabled(true);
            valorJurosjTextField.setText("");
            valorJurosjTextField.selectAll();
        }else {
            valorJurosjTextField.setText("");
            valorJurosjTextField.setEnabled(false);
            totalPagar = valorTotal;
            totalPagarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
        }
    }//GEN-LAST:event_possuiJurosjComboBoxItemStateChanged

    private void numeroSemanasAcomodacaojTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasAcomodacaojTextFieldFocusGained
        if (dataChegadaAcomodacaojDateChooser.getDate()!=null){
            if (dataPartidaAcomodacaojDateChooser.getDate()!=null){
                Integer dias =  Formatacao.calcularNumeroSemanas(dataChegadaAcomodacaojDateChooser.getDate(), dataPartidaAcomodacaojDateChooser.getDate());
                numeroSemanasAcomodacaojTextField.setText(dias.toString());
            }
        }
    }//GEN-LAST:event_numeroSemanasAcomodacaojTextFieldFocusGained

    private void valorParcelajTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldFocusGained
        float saldoParcelas =0.0f;
        int numeroParcelas =0;
        float valorParcela = 0.0f;
        numeroParcelas = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
        if (valorParcelamentojTextField.getText().length()>0){
            saldoParcelas = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
        }
        if ((saldoParcelas>0) && (numeroParcelas>0)){
            valorParcela = saldoParcelas / numeroParcelas;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(valorParcela));
            this.valorParcela = valorParcela;
        }
    }//GEN-LAST:event_valorParcelajTextFieldFocusGained

    private void valorParcelamentojTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldFocusGained
       
    }//GEN-LAST:event_valorParcelamentojTextFieldFocusGained

    private void valorParcelajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorParcelajTextFieldKeyTyped

    private void valorParcelajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyPressed
         if (evt.getKeyChar()=='.'){
          evt.setKeyChar(',');
       }
    }//GEN-LAST:event_valorParcelajTextFieldKeyPressed

    private void valorParcelajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyReleased
      
    }//GEN-LAST:event_valorParcelajTextFieldKeyReleased

    private void valorOrcamentoFormajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorOrcamentoFormajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorOrcamentoFormajTextFieldKeyTyped

    private void valorParcelamentojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorParcelamentojTextFieldKeyTyped

    private void valorProdutosMoedaEstrangeirajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorProdutosMoedaEstrangeirajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorProdutosMoedaEstrangeirajTextFieldKeyTyped

    private void valorProdutosMoedaRealjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorProdutosMoedaRealjTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorProdutosMoedaRealjTextFieldKeyTyped

    private void numeroSemanasAcomodacaojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanasAcomodacaojTextFieldKeyTyped
            String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroSemanasAcomodacaojTextFieldKeyTyped

    private void buscaBancojButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaBancojButton3ActionPerformed
        Object obj = moedaCambiojComboBox.getSelectedItem();
        Moedas moeda = null;
        if (obj instanceof Moedas) {
            moeda = (Moedas) obj;
        }
        if (moeda!=null){
            if (moeda.getDescricao().equalsIgnoreCase("Outras")){
                usuarioLogadoBean.getAcesso().setEmissaoCambio(1);
            }
        }
        liberarAltercaoCambio(usuarioLogadoBean.getAcesso());
    }//GEN-LAST:event_buscaBancojButton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int linha = produtoOrcamentojTable.getSelectedRow();
        int tx = usuarioLogadoBean.getParametrosprodutos().getPassagemTaxaTM();
        if (listaProdutoOrcamentoBean.get(linha).getIdProdutoOrcamento() == tx) {
            boolean resultado = JOptionPane.showConfirmDialog(null, "Taxa TM não pode ser Excluída. Alterar o valor da Taxa TM?", "Alteração", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
            if (resultado){
                String novaTxTM = JOptionPane.showInputDialog("Novo valor da Taxa TM");
                Float novaValorTxTM = Formatacao.formatarStringfloat(novaTxTM);
                if (novaValorTxTM> listaProdutoOrcamentoBean.get(linha).getValorMoedaReal()){
                    listaProdutoOrcamentoBean.get(linha).setValorMoedaReal(novaValorTxTM);
                    calcularValorTotalOrcamento();
                    carregarModelOrcamentoProduto();
                }else JOptionPane.showMessageDialog(rootPane, "Valor da Taxa TM não pode ser inferior ao valor definido pela Matriz");
            }
        } else {
            if (linha >= 0) {
                listaProdutoOrcamentoBean.get(linha).setApagar(true);
                if (listaProdutoOrcamentoBean.get(linha).isSeguro()) {
                    seguroViagemNaojRadioButton.setSelected(true);
                }
                if (listaProdutoOrcamentoBean.get(linha).isVisto()) {
                    vistoTravelMatejCheckBox.setSelected(false);
                }
                listaProdutoOrcamentoBean.remove(linha);
                calcularValorTotalOrcamento();
                carregarModelOrcamentoProduto();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void condicaoPagamentojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_condicaoPagamentojComboBoxItemStateChanged
    }//GEN-LAST:event_condicaoPagamentojComboBoxItemStateChanged

    private void valorJurosjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorJurosjTextFieldFocusLost
        if (possuiJurosjComboBox.getSelectedItem().toString().equalsIgnoreCase("sim")){
            if (valorJurosjTextField.getText().length()>0){
                valorJuros = Formatacao.formatarStringfloat(valorJurosjTextField.getText());
                totalPagar = valorTotal + valorJuros;
                totalPagarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
                saldoReceberjTextField.setText(Formatacao.formatarFloatString(totalPagar));
                saldoParcelarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
            }
        }
         if (valorJurosjTextField.getText().length()>0){
            float valor = Formatacao.formatarStringfloat(valorJurosjTextField.getText());
            valorJurosjTextField.setText(Formatacao.formatarFloatString(valor));
        }
    }//GEN-LAST:event_valorJurosjTextFieldFocusLost

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String msg = validarDados();
        String nsituacao;
        if (msg.length() < 5) {
            boolean resultado = false;
            if (situacao.equalsIgnoreCase("PROCESSO")) {
                resultado = JOptionPane.showConfirmDialog(null, "FINALIZAR FICHA? Ficha será enviada para Gerência", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
                if (resultado){
                    novaFicha=true;
                }
            }else {
                resultado = true;
            }
            if (resultado) {
                nsituacao="FINALIZADA";
            } else {
                nsituacao="PROCESSO";
            }
            salvarVendas(nsituacao);
            salvarCurso();
            salvarSeguroViagem();
            salvarFormaPagamento();
            salvarOrcamento();
            salvarFollowup();
            salvarCliente();
            if (novaFicha){
                if(nsituacao.equalsIgnoreCase("FINALIZADA")){
                    calcularComissao();
                    ContasReceberBean contasReceberBean = new ContasReceberBean(venda, listaParcelamento, usuarioLogadoBean);
                }
            } else {
                if (nsituacao.equalsIgnoreCase("FINALIZADA")) {
                    float valorVendaatual = venda.getValor();
                    if (valorVendaAlterar != valorVendaatual) {
                        calcularComissao();
                    }

                }
            }
            if (resultado){
                salvarControle();
                if (this.curso.getIdcursos()!=null){
                    if (vendaAlterada!=null){
                        verificarDadosAlterado();
                    }
                }
                emitirEmailGerencial();
                verificarAlteracaoCambio();   
            }
            JOptionPane.showMessageDialog(rootPane, "Curso Salvo com Sucesso");
            telaConsulta.setModel();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void valorJurosjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorJurosjTextFieldKeyTyped
         if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorJurosjTextFieldKeyTyped

    private void valorJurosjTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorJurosjTextFieldKeyReleased
       
    }//GEN-LAST:event_valorJurosjTextFieldKeyReleased

    private void moedaCambiojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_moedaCambiojComboBoxItemStateChanged
        if (consultaCambio) {
            Object obj = moedaCambiojComboBox.getSelectedItem();
            Moedas moeda = null;
            if (obj instanceof Moedas) {
                moeda = (Moedas) obj;
            }
            if (moeda != null) {
                CambioController cambioController = new CambioController();
                cambio = cambioController.consultarCambioMoeda(Formatacao.ConvercaoDataSql(dataCambio), moeda.getIdmoedas());
                if (cambio != null) {
                    setCambio(cambio.getValor());
                    atualizarValoresProduto();
                } else {
                    if (!moeda.getDescricao().equalsIgnoreCase("Outras")){
                        JOptionPane.showMessageDialog(rootPane, "Câmbio não Cadastrado");
                    }
                }
            }
        }
    }//GEN-LAST:event_moedaCambiojComboBoxItemStateChanged

    private void numeroSemanasAcomodacaojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasAcomodacaojTextFieldFocusLost
         if (dataChegadaAcomodacaojDateChooser.getDate()!=null){
            if (numeroSemanasAcomodacaojTextField.getText().length()>0){
                dataPartidaAcomodacaojDateChooser.setDate(Formatacao.calcularDataFinal(dataChegadaAcomodacaojDateChooser.getDate(), Integer.parseInt(numeroSemanasAcomodacaojTextField.getText())));
            }
        }
        if ((dataPartidaAcomodacaojDateChooser.getDate()==null) && (numeroSemanasAcomodacaojTextField.getText().length()==0)){
            JOptionPane.showMessageDialog(rootPane, "Preencha numero de Semanas e/ou data término");
            numeroSemanasAcomodacaojTextField.requestFocus();
        }
    }//GEN-LAST:event_numeroSemanasAcomodacaojTextFieldFocusLost

    private void cursosjTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneMouseClicked
    }//GEN-LAST:event_cursosjTabbedPaneMouseClicked

    private void meioPagamentojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meioPagamentojComboBoxItemStateChanged
    }//GEN-LAST:event_meioPagamentojComboBoxItemStateChanged

    private void aulasSemanajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aulasSemanajTextFieldKeyTyped

        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_aulasSemanajTextFieldKeyTyped

    private void numeroSemanasjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldKeyTyped

        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroSemanasjTextFieldKeyTyped

    private void numeroSemanasjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldFocusLost
         if (dataIniciojDateChooser.getDate() != null) {
            if (numeroSemanasjTextField.getText().length() > 0) {
                Date data = Formatacao.calcularDataFinal(dataIniciojDateChooser.getDate(), Integer.parseInt(numeroSemanasjTextField.getText()));
                dataTerminojDateChooser.setDate(data);
                int diaSemana = Formatacao.diaSemana(dataTerminojDateChooser.getDate());
                if (data != null) {
                    int numeroDias = 0;
                    if (diaSemana == 1) {
                        numeroDias = 2;
                    } else if (diaSemana == 7) {
                        numeroDias = 1;
                    }
                    String novaData = null;
                    try {
                        novaData = Formatacao.SubtarirDatas(dataTerminojDateChooser.getDate(), numeroDias, "dd/MM/YYYY");
                    } catch (Exception ex) {
                        Logger.getLogger(FrmFichaCursos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dataTerminojDateChooser.setDate(Formatacao.ConvercaoStringData(novaData));
                }
            }
        }

        if ((dataTerminojDateChooser.getDate()
                == null) && (numeroSemanasjTextField.getText().length() == 0)) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o número de semanas e/ou data término");
            numeroSemanasjTextField.requestFocus();
        }
    }//GEN-LAST:event_numeroSemanasjTextFieldFocusLost

    private void numeroSemanasjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldFocusGained
       if (dataIniciojDateChooser.getDate() != null) {
            if (dataTerminojDateChooser.getDate() != null) {
                if (dataTerminojDateChooser.getDate().after(dataIniciojDateChooser.getDate())){
                    Integer dias = Formatacao.calcularNumeroSemanas(dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate());
                    numeroSemanasjTextField.setText(dias.toString());
                }else {
                    numeroSemanasjTextField.setText("0");
                }
            }
        }
    }//GEN-LAST:event_numeroSemanasjTextFieldFocusGained

    private void dataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataIniciojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataIniciojDateChooserFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (venda!=null){
            if (venda.getSituacao() != null) {
                if (!venda.getSituacao().equalsIgnoreCase("FINALIZADA")) {
                    new FrmConsultaFornecedor(usuarioLogadoBean, this, "C", usuarioLogadoBean.getParametrosprodutos().getCursos());
                } else {
                    if (usuarioLogadoBean.getAcesso().getCursoalterarescola()==1){
                        new FrmConsultaFornecedor(usuarioLogadoBean, this, "C", usuarioLogadoBean.getParametrosprodutos().getCursos());
                    }else JOptionPane.showMessageDialog(rootPane, "Ficha já finalizada. Entrar em contato Gerencia de Cursos");
                }
            }
        }else {
            new FrmConsultaFornecedor(usuarioLogadoBean, this, "C", usuarioLogadoBean.getParametrosprodutos().getCursos());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nivelIdiomajComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nivelIdiomajComboBoxItemStateChanged

    }//GEN-LAST:event_nivelIdiomajComboBoxItemStateChanged

    private void idiomajComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idiomajComboBoxItemStateChanged

    }//GEN-LAST:event_idiomajComboBoxItemStateChanged

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void saldoReceberjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoReceberjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoReceberjTextFieldKeyTyped

    private void saldoParcelarjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoParcelarjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoParcelarjTextFieldKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String msg = validarFormaPagamento();
        if (msg.length() < 5) {
            float saldoParcelar = Formatacao.formatarStringfloat(saldoParcelarjTextField.getText());
            float valorParcela = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
            if (valorParcela > saldoParcelar) {
                JOptionPane.showMessageDialog(rootPane, "Valor a Parcelar maior que saldo a parcelar");
                valorParcelajTextField.selectAll();
                valorParcelajTextField.requestFocus();
            } else {
                Parcelamentopagamento parcelamento = new Parcelamentopagamento();
                parcelamento.setDiaVencimento(dataVencimentojDateChooser.getDate());
                parcelamento.setFormaPagamento(meioPagamentojComboBox.getSelectedItem().toString());
                int numeroParcelas = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
                parcelamento.setNumeroParcelas(numeroParcelas);
                parcelamento.setTipoParcelmaneto(tipoParcelamentojComboBox.getSelectedItem().toString());
                parcelamento.setValorParcela(Formatacao.formatarStringfloat(valorParcelajTextField.getText()));
                parcelamento.setValorParcelamento(Formatacao.formatarStringfloat(valorParcelamentojTextField.getText()));
                if (listaParcelamento == null) {
                    listaParcelamento = new ArrayList<Parcelamentopagamento>();
                }
                listaParcelamento.add(parcelamento);
                carregarModelParcelamento();
                calcularParcelamentoPagamento();
                valorParcelajTextField.setText("");
                valorParcelamentojTextField.setText("");
                numeroParcelasjComboBox.setSelectedItem("01");
                dataVencimentojDateChooser.setDate(new Date());
            }
        }else JOptionPane.showMessageDialog(rootPane, msg);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int linha = parcelamentojTable.getSelectedRow();
        if (linha>=0){
            if (listaParcelamento.get(linha).getIdparcemlamentoPagamento()!=null){
                ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
                parcelamentoPagamentoController.excluir(listaParcelamento.get(linha).getIdparcemlamentoPagamento());
            }else {
                listaParcelamento.remove(linha);
            }
            carregarModelParcelamento();
            calcularParcelamentoPagamento();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void valorParcelamentojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldFocusLost
        if (valorParcelamentojTextField.getText().length()>0){
            float valor = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
            valorParcelamentojTextField.setText(Formatacao.formatarFloatString(valor));
            int numero = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
            float vParcela = valor / numero;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(vParcela));
        }
    }//GEN-LAST:event_valorParcelamentojTextFieldFocusLost

    private void numeroParcelasjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numeroParcelasjComboBoxItemStateChanged
        if (valorParcelamentojTextField.getText().length()>0){
            float valor = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
            valorParcelamentojTextField.setText(Formatacao.formatarFloatString(valor));
            int numero = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
            float vParcela = valor / numero;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(vParcela));
        }
    }//GEN-LAST:event_numeroParcelasjComboBoxItemStateChanged

    private void cursosjTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneStateChanged
        if (cursosjTabbedPane.getSelectedIndex() == 4) {
            if (listaProdutoOrcamentoBean == null) {
                listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
            }
            int codSeguroPrivado = usuarioLogadoBean.getParametrosprodutos().getSeguroOrcamento();
            int codSeguroGov = usuarioLogadoBean.getParametrosprodutos().getSeguroGovernamental();
            for (int i=0;i<listaProdutoOrcamentoBean.size();i++){
                int codigoLista = listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento();
                if (codSeguroPrivado==codigoLista){
                    listaProdutoOrcamentoBean.remove(i);
                }
                if (codSeguroGov==codigoLista){
                    listaProdutoOrcamentoBean.remove(i);
                }
            }
//            List<ProdutoOrcamentoBean> novaLista = new ArrayList<ProdutoOrcamentoBean>();
//            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
//                if (!listaProdutoOrcamentoBean.get(i).getTipo().equalsIgnoreCase("S")
//                        && !listaProdutoOrcamentoBean.get(i).getTipo().equalsIgnoreCase("V")) {
//                    novaLista.add(listaProdutoOrcamentoBean.get(i));
//                }
//            }
//            listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
//            listaProdutoOrcamentoBean = novaLista;
            float valorEstrangeira = 0.0f;
            float valorReal = 0.0f;
            
            valorEstrangeira = 0.0f;
            valorReal = 0.0f;
            if (seguroViagemSemjRadioButton.isSelected()) {
                if (seguroViagem != null) {
                    ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
                    Produtosorcamento produto = produtoOrcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getSeguroOrcamento());
                    ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                    pob.setIdOrcamentoProdutoOrcamento(0);
                    pob.setDescricaoProdutoOrcamento(produto.getDescricao());
                    pob.setIdProdutoOrcamento(produto.getIdprodutosOrcamento());
                    if (valorSegurojTextField.getText().length() > 0) {
                        pob.setValorMoedaEstrangeira(0.0f);
                        valorEstrangeira = pob.getValorMoedaEstrangeira();
                        valorReal = Formatacao.formatarStringfloat(valorSegurojTextField.getText());
                    } else {
                        pob.setValorMoedaEstrangeira(0.0f);
                        valorReal = 0;
                        valorEstrangeira = 0;
                    }
                    pob.setValorMoedaReal(valorReal);
                    pob.setApagar(false);
                    pob.setVisto(false);
                    pob.setSeguro(false);
                    pob.setTipo("S");
                    pob.setAdicionado(1);
                    pob.setNovo(true);
                    listaProdutoOrcamentoBean.add(pob);
                }
            }
            if (seguroViagemGovernamentalSemjRadioButton.isSelected()){
                ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
                Produtosorcamento produto = produtoOrcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getSeguroGovernamental());
                ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                pob.setIdOrcamentoProdutoOrcamento(0);
                pob.setDescricaoProdutoOrcamento(produto.getDescricao());
                pob.setIdProdutoOrcamento(produto.getIdprodutosOrcamento());
                if (valorSeguroGovernamentaljTextField.getText().length()>0){
                    pob.setValorMoedaEstrangeira(0.0f);
                    valorEstrangeira = pob.getValorMoedaEstrangeira();
                    valorReal = Formatacao.formatarStringfloat(valorSeguroGovernamentaljTextField.getText());
                }else {
                    pob.setValorMoedaEstrangeira(0.0f);
                    valorReal =0;
                    valorEstrangeira=0;
                }
                pob.setValorMoedaReal(valorReal);
                pob.setApagar(false);
                pob.setVisto(false);
                pob.setSeguro(false);
                pob.setTipo("S");
                pob.setAdicionado(1);
                pob.setNovo(true);
                listaProdutoOrcamentoBean.add(pob);
            }
            carregarModelOrcamentoProduto();
            calcularValorTotalOrcamento();
        }
    }//GEN-LAST:event_cursosjTabbedPaneStateChanged

    private void tipoAcomodacaojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tipoAcomodacaojComboBoxItemStateChanged
        if (tipoAcomodacaojComboBox.getSelectedItem().toString().equalsIgnoreCase("Casa de família")){
            familiacriancajComboBox.setEnabled(true);
            familiaanimaisestimacaojComboBox.setEnabled(true);
            refeicaojComboBox.setEnabled(true);
                    
        }else {
            familiacriancajComboBox.setEnabled(false);
            familiaanimaisestimacaojComboBox.setEnabled(false);
            refeicaojComboBox.setEditable(false);
        }
        if (tipoAcomodacaojComboBox.getSelectedItem().toString().equalsIgnoreCase("Sem acomodação")){
            tipoQuartojComboBox.setEnabled(false);
        }else tipoQuartojComboBox.setEnabled(true);
        
    }//GEN-LAST:event_tipoAcomodacaojComboBoxItemStateChanged

    private void dataTerminojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminojDateChooserFocusGained
        
    }//GEN-LAST:event_dataTerminojDateChooserFocusGained

    private void buscaBancojButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaBancojButton4ActionPerformed
        new FrmCalculoJuros(this, valorTotal);
    }//GEN-LAST:event_buscaBancojButton4ActionPerformed

    private void telefoneEmergenciajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneEmergenciajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_telefoneEmergenciajTextFieldKeyTyped

    private void telefoneEmergenciajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneEmergenciajTextFieldKeyReleased
        
    }//GEN-LAST:event_telefoneEmergenciajTextFieldKeyReleased

    private void telefoneEmergenciajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneEmergenciajTextFieldKeyPressed
        if ((evt.getKeyCode() != KeyEvent.VK_DELETE) && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE)) {
            String texto = telefoneEmergenciajTextField.getText();
            if (telefoneEmergenciajTextField.getText().length() == 0) {
                telefoneEmergenciajTextField.setText("(");
            } else if (telefoneEmergenciajTextField.getText().length() == 3) {
                telefoneEmergenciajTextField.setText(telefoneEmergenciajTextField.getText() + ")");
            }
            if (telefoneEmergenciajCheckBox.isSelected()) {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneEmergenciajTextField.getText().length() == 8) {
                        telefoneEmergenciajTextField.setText(telefoneEmergenciajTextField.getText() + '-');
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneEmergenciajTextField.getText().length() == 9) {
                            telefoneEmergenciajTextField.setText(telefoneEmergenciajTextField.getText() + '-');
                        }
                    }
                }
            } else {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneEmergenciajTextField.getText().length() == 9) {
                        telefoneEmergenciajTextField.setText(telefoneEmergenciajTextField.getText() + '-');
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneEmergenciajTextField.getText().length() == 8) {
                            telefoneEmergenciajTextField.setText(telefoneEmergenciajTextField.getText() + '-');
                        }
                    }
                }
            }
            if (telefoneEmergenciajCheckBox.isSelected()) {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneEmergenciajTextField.getText().length() > 12) {
                        caracteres = "";
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneEmergenciajTextField.getText().length() > 13) {
                            caracteres = "";
                        }
                    }
                }

            } else {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneEmergenciajTextField.getText().length() > 13) {
                        caracteres = "";
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneEmergenciajTextField.getText().length() > 12) {
                            caracteres = "";
                        }
                    }
                }
            }
        }else {
            telefoneEmergenciajTextField.setText("");
        }

    }//GEN-LAST:event_telefoneEmergenciajTextFieldKeyPressed

    private void telefoneEmergenciajCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_telefoneEmergenciajCheckBoxItemStateChanged
        telefoneEmergenciajTextField.setText("");
        telefoneEmergenciajTextField.requestFocus();
    }//GEN-LAST:event_telefoneEmergenciajCheckBoxItemStateChanged

    private void telefoneEmergenciajTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneEmergenciajTextFieldFocusLost
        caracteres = "0987654321-()";
    }//GEN-LAST:event_telefoneEmergenciajTextFieldFocusLost

    private void sdataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdataIniciojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_sdataIniciojDateChooserFocusGained

    private void snumeroSemanasjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_snumeroSemanasjTextFieldFocusGained
        if (sdataIniciojDateChooser.getDate() != null) {
            if (sdataTerminojDateChooser.getDate() != null) {
                if (sdataTerminojDateChooser.getDate().after(sdataIniciojDateChooser.getDate())){
                    Integer dias = Formatacao.calcularNumeroSemanas(sdataIniciojDateChooser.getDate(), sdataTerminojDateChooser.getDate());
                    snumeroSemanasjTextField.setText(dias.toString());
                }else {
                    snumeroSemanasjTextField.setText("0");
                }
            }
        }
    }//GEN-LAST:event_snumeroSemanasjTextFieldFocusGained

    private void snumeroSemanasjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_snumeroSemanasjTextFieldFocusLost
        if (sdataIniciojDateChooser.getDate() != null) {
            if (snumeroSemanasjTextField.getText().length() > 0) {
                Date data = Formatacao.calcularDataFinal(sdataIniciojDateChooser.getDate(), Integer.parseInt(snumeroSemanasjTextField.getText()));
                sdataTerminojDateChooser.setDate(data);
                int diaSemana = Formatacao.diaSemana(sdataTerminojDateChooser.getDate());
                if (data != null) {
                    int numeroDias = 0;
                    if (diaSemana == 1) {
                        numeroDias = 2;
                    } else if (diaSemana == 7) {
                        numeroDias = 1;
                    }
                    String novaData = null;
                    try {
                        novaData = Formatacao.SubtarirDatas(sdataTerminojDateChooser.getDate(), numeroDias, "dd/MM/YYYY");
                    } catch (Exception ex) {
                        Logger.getLogger(FrmFichaCursos.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    sdataTerminojDateChooser.setDate(Formatacao.ConvercaoStringData(novaData));
                }
            }
        }

        if ((sdataTerminojDateChooser.getDate()
                == null) && (snumeroSemanasjTextField.getText().length() == 0)) {
            JOptionPane.showMessageDialog(rootPane, "Preencha o número de semanas e/ou data término");
            snumeroSemanasjTextField.requestFocus();
        }
    }//GEN-LAST:event_snumeroSemanasjTextFieldFocusLost

    private void snumeroSemanasjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snumeroSemanasjTextFieldKeyTyped
        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_snumeroSemanasjTextFieldKeyTyped

    private void sdataTerminojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sdataTerminojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_sdataTerminojDateChooserFocusGained

    private void saulasSemanajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saulasSemanajTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saulasSemanajTextFieldKeyTyped

    private void vistoTravelMatejCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vistoTravelMatejCheckBoxItemStateChanged
        dataEntregaVistojDateChooser.setEnabled(true);
    }//GEN-LAST:event_vistoTravelMatejCheckBoxItemStateChanged

    private void vistoClientejCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vistoClientejCheckBoxItemStateChanged
        dataEntregaVistojDateChooser.setDate(null);
        dataEntregaVistojDateChooser.setEnabled(false);
    }//GEN-LAST:event_vistoClientejCheckBoxItemStateChanged

    private void dataEntregaVistojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEntregaVistojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEntregaVistojDateChooserFocusGained

    private void numeromesesSegurosjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeromesesSegurosjTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_numeromesesSegurosjTextFieldFocusLost

    private void numeromesesSegurosjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeromesesSegurosjTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_numeromesesSegurosjTextFieldFocusGained

    private void numeromesesSegurosjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeromesesSegurosjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_numeromesesSegurosjTextFieldKeyTyped

    private void seguroViagemGovernamentalSemjRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seguroViagemGovernamentalSemjRadioButtonItemStateChanged
        if (seguroViagemGovernamentalSemjRadioButton.isSelected()){
            seguradoraGovernamentaljTextField.setEnabled(true);
            numeromesesSegurosjTextField.setEnabled(true);
            valorSeguroGovernamentaljTextField.setEnabled(true);
            seguradorajTextField.requestFocus();
            seguradorajTextField.selectAll();
        }
    }//GEN-LAST:event_seguroViagemGovernamentalSemjRadioButtonItemStateChanged

    private void seguroViagemGovernamentalNaojRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seguroViagemGovernamentalNaojRadioButtonItemStateChanged
        if (seguroViagemGovernamentalNaojRadioButton.isSelected()){
            seguradoraGovernamentaljTextField.setEnabled(false);
            numeromesesSegurosjTextField.setEnabled(false);
            valorSeguroGovernamentaljTextField.setEnabled(false);
        }
    }//GEN-LAST:event_seguroViagemGovernamentalNaojRadioButtonItemStateChanged

    private void valorSeguroGovernamentaljTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorSeguroGovernamentaljTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valorSeguroGovernamentaljTextFieldFocusLost

    private void valorSeguroGovernamentaljTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorSeguroGovernamentaljTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorSeguroGovernamentaljTextFieldKeyTyped

    private void habilitarSegundoCursojCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_habilitarSegundoCursojCheckBoxItemStateChanged
        if (habilitarSegundoCursojCheckBox.isSelected()){
            scursojTextField.setEnabled(true);
            sdataIniciojDateChooser.setEnabled(true);
            snumeroSemanasjTextField.setEnabled(true);
            sdataTerminojDateChooser.setEnabled(true);
            stipoDuracaojComboBox.setEnabled(true);
            saulasSemanajTextField.setEnabled(true);
        }else {
            scursojTextField.setEnabled(false);
            sdataIniciojDateChooser.setEnabled(false);
            snumeroSemanasjTextField.setEnabled(false);
            sdataTerminojDateChooser.setEnabled(false);
            stipoDuracaojComboBox.setEnabled(false);
            saulasSemanajTextField.setEnabled(false);
        }
    }//GEN-LAST:event_habilitarSegundoCursojCheckBoxItemStateChanged

    private void dataVencimentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataVencimentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentojDateChooserFocusGained

    private void dataInicioSegurojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicioSegurojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicioSegurojDateChooserFocusGained

    private void numeroSemanaSegurosjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldFocusGained
        if (numeroSemanaSegurosjTextField.isEnabled()){
            if (dataInicioSegurojDateChooser.getDate()!=null){
                if (dataTerminoSegurojDateChooser.getDate()!=null){
                    Integer dias = Formatacao.subtrairDatas(dataTerminoSegurojDateChooser.getDate(), dataInicioSegurojDateChooser.getDate());
                    dias = dias + 1;
                    numeroSemanaSegurosjTextField.setText(dias.toString());
                }
            }else {
                JOptionPane.showMessageDialog(rootPane, "Data Inicio do Seguro Inválida");
            }
        }
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldFocusGained

    private void numeroSemanaSegurosjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldFocusLost
        if (dataInicioSegurojDateChooser.getDate()!=null){
            if (numeroSemanaSegurosjTextField.getText().length()>0){
                int numero = Integer.parseInt(numeroSemanaSegurosjTextField.getText());
                if (numero>=14){
                    if (numero<365){
                        numero = numero - 1;
                        dataTerminoSegurojDateChooser.setDate(Formatacao.calcularDataFinalDias(dataInicioSegurojDateChooser.getDate(), numero));
                        if (valoresSeguro!=null){
                            if (valoresSeguro.getIdvaloresseguro()!=null){
                                setValores(valoresSeguro);
                            }
                        }
                    }else {
                        JOptionPane.showMessageDialog(rootPane, "Número de dias não pode ser maior que 365 dias");
                    }
                }else {
                    JOptionPane.showMessageDialog(rootPane, "Número de dias não pode ser menor que 14 dias");
                }
            }
        }
        if ((dataTerminoSegurojDateChooser.getDate()==null) && (numeroSemanaSegurosjTextField.getText().length()==0)){
            JOptionPane.showMessageDialog(rootPane, "Preencha numero de Semanas e/ou data término");
            numeroSemanaSegurosjTextField.requestFocus();
        }
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldFocusLost

    private void numeroSemanaSegurosjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldKeyTyped

        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldKeyTyped

    private void seguroViagemSemjRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seguroViagemSemjRadioButtonItemStateChanged
        if (seguroViagemSemjRadioButton.isSelected()){
            if (seguroViagem==null){
                this.seguroViagem = new Seguroviagem();
            }
            selecionarSeguradorajButton.setEnabled(true);
            dataInicioSegurojDateChooser.setEnabled(true);
            dataTerminoSegurojDateChooser.setEnabled(true);
            numeroSemanaSegurosjTextField.setEnabled(true);
            dataInicioSegurojDateChooser.requestFocus();
        }
    }//GEN-LAST:event_seguroViagemSemjRadioButtonItemStateChanged

    private void seguroViagemNaojRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seguroViagemNaojRadioButtonItemStateChanged
        if (seguroViagemNaojRadioButton.isSelected()){
            seguradorajTextField.setEnabled(false);
            planosegurojTextField.setEnabled(false);
            dataInicioSegurojDateChooser.setEnabled(false);
            dataTerminoSegurojDateChooser.setEnabled(false);
            numeroSemanaSegurosjTextField.setEnabled(false);
            valorSegurojTextField.setEnabled(false);
            selecionarSeguradorajButton.setEnabled(false);
            seguradorajTextField.setText("");
            valoresSeguro = null;
        }
    }//GEN-LAST:event_seguroViagemNaojRadioButtonItemStateChanged

    private void valorSegurojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorSegurojTextFieldFocusLost
        if (valorSegurojTextField.getText().length()>0){
            valorSeguro = Formatacao.formatarStringfloat(valorSegurojTextField.getText());
        }
    }//GEN-LAST:event_valorSegurojTextFieldFocusLost

    private void valorSegurojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorSegurojTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorSegurojTextFieldKeyTyped

    private void dataTerminoSegurojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminoSegurojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminoSegurojDateChooserFocusGained

    private void selecionarSeguradorajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarSeguradorajButtonActionPerformed
        if (numeroSemanaSegurosjTextField.getText().length()>0){
            new FrmConsultaValoresSeguro(usuarioLogadoBean, this);
        }else {
            JOptionPane.showMessageDialog(rootPane, "Informe o número de semanas para o seguro");
            dataInicioSegurojDateChooser.requestFocus();
        }
    }//GEN-LAST:event_selecionarSeguradorajButtonActionPerformed

    private void snumeroSemanasjTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_snumeroSemanasjTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_snumeroSemanasjTextFieldKeyReleased

    private void numeroSemanasjTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroSemanasjTextFieldKeyPressed

    private void numeroSemanasjTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroSemanasjTextFieldKeyReleased

    private void seguradoraGovernamentaljTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seguradoraGovernamentaljTextFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_seguradoraGovernamentaljTextFieldFocusGained

    private void seguradorajTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_seguradorajTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_seguradorajTextFieldFocusLost

    private void seguradoraGovernamentaljTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seguradoraGovernamentaljTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_seguradoraGovernamentaljTextFieldKeyTyped

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TranferbuttonGroup;
    private javax.swing.JTextField adicionaisAcomodacaojTextField;
    private javax.swing.JTextField aulasSemanajTextField;
    private javax.swing.JButton buscaBancojButton3;
    private javax.swing.JButton buscaBancojButton4;
    private javax.swing.JRadioButton cartaoVTMNaojRadioButton;
    private javax.swing.JRadioButton cartaoVTMSimjRadioButton;
    private javax.swing.ButtonGroup cartaoVTMbuttonGroup;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JComboBox condicaoPagamentojComboBox;
    private javax.swing.JTextField cursojTextField;
    private javax.swing.JTabbedPane cursosjTabbedPane;
    private com.toedter.calendar.JDateChooser dataChegadaAcomodacaojDateChooser;
    private com.toedter.calendar.JDateChooser dataEntregaVistojDateChooser;
    private com.toedter.calendar.JDateChooser dataInicioSegurojDateChooser;
    private com.toedter.calendar.JDateChooser dataIniciojDateChooser;
    private com.toedter.calendar.JDateChooser dataPartidaAcomodacaojDateChooser;
    private com.toedter.calendar.JDateChooser dataTerminoSegurojDateChooser;
    private com.toedter.calendar.JDateChooser dataTerminojDateChooser;
    private com.toedter.calendar.JDateChooser dataVencimentojDateChooser;
    private javax.swing.JTextField emailConatoEmergenciajTextField;
    private javax.swing.JTextField escolajTextField;
    private javax.swing.JComboBox familiaanimaisestimacaojComboBox;
    private javax.swing.JComboBox familiacriancajComboBox;
    private javax.swing.JComboBox fumantejComboBox;
    private javax.swing.JCheckBox habilitarSegundoCursojCheckBox;
    private javax.swing.JTextField hobbiesjTextField;
    private javax.swing.JComboBox idiomajComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox meioPagamentojComboBox;
    private javax.swing.JComboBox moedaCambiojComboBox;
    private javax.swing.JComboBox moedaCartaoVTMjComboBox;
    private javax.swing.JComboBox nivelIdiomajComboBox;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTextField nomeContatoEmergenciajTextField;
    private javax.swing.JTextField numeroCartaoVTMjTextField;
    private javax.swing.JComboBox numeroParcelasjComboBox;
    private javax.swing.JTextField numeroSemanaSegurosjTextField;
    private javax.swing.JTextField numeroSemanasAcomodacaojTextField;
    private javax.swing.JTextField numeroSemanasjTextField;
    private javax.swing.JTextField numeromesesSegurosjTextField;
    private javax.swing.JTextArea obsTMjTextArea;
    private javax.swing.JTextField observacaoPassagemAereajTextField;
    private javax.swing.JTextField observacaoVistojTextField;
    private javax.swing.JTextArea observacoesjTextArea111;
    private javax.swing.JTextField paisjTextField;
    private javax.swing.JTable parcelamentojTable;
    private javax.swing.ButtonGroup passagemAereabuttonGroup;
    private javax.swing.JCheckBox passagemClientejCheckBox;
    private javax.swing.JCheckBox passagemTravelMatejCheckBox;
    private javax.swing.JTextField planosegurojTextField;
    private javax.swing.JComboBox possuiJurosjComboBox;
    private javax.swing.JComboBox produtoOrcaemntojComboBox;
    private javax.swing.JTable produtoOrcamentojTable;
    private javax.swing.JTextField quaisAlergiajTextField;
    private javax.swing.JComboBox refeicaojComboBox;
    private javax.swing.JTextField relacaoEmergenciajTextField;
    private javax.swing.JTextField saldoParcelarjTextField;
    private javax.swing.JTextField saldoReceberjTextField;
    private javax.swing.JTextField saulasSemanajTextField;
    private javax.swing.JTextField scursojTextField;
    private com.toedter.calendar.JDateChooser sdataIniciojDateChooser;
    private com.toedter.calendar.JDateChooser sdataTerminojDateChooser;
    private javax.swing.JTextField seguradoraGovernamentaljTextField;
    private javax.swing.JTextField seguradorajTextField;
    private javax.swing.ButtonGroup seguroGovernamentealbuttonGroup;
    private javax.swing.ButtonGroup seguroPrivadobuttonGroup;
    private javax.swing.JRadioButton seguroViagemGovernamentalNaojRadioButton;
    private javax.swing.JRadioButton seguroViagemGovernamentalSemjRadioButton;
    private javax.swing.JRadioButton seguroViagemNaojRadioButton;
    private javax.swing.JRadioButton seguroViagemSemjRadioButton;
    private javax.swing.JButton selecionarSeguradorajButton;
    private javax.swing.JTextField snumeroSemanasjTextField;
    private javax.swing.ButtonGroup solicitacaoVistobuttonGroup;
    private javax.swing.JTextField solicitacoesEspeciaisjTextField;
    private javax.swing.JComboBox stipoDuracaojComboBox;
    private javax.swing.JCheckBox telefoneEmergenciajCheckBox;
    private javax.swing.JTextField telefoneEmergenciajTextField;
    private javax.swing.JRadioButton temAlergiaNaojRadioButton;
    private javax.swing.JRadioButton temAlergiaSimjRadioButton;
    private javax.swing.ButtonGroup temAlergiabuttonGroup;
    private javax.swing.JComboBox tipoAcomodacaojComboBox;
    private javax.swing.JComboBox tipoDuracaojComboBox;
    private javax.swing.JComboBox tipoParcelamentojComboBox;
    private javax.swing.JComboBox tipoQuartojComboBox;
    private javax.swing.JTextField totalPagarjTextField;
    private javax.swing.JRadioButton transferinNaojRadioButton;
    private javax.swing.JRadioButton transferinSimjRadioButton;
    private javax.swing.ButtonGroup transferinbuttonGroup;
    private javax.swing.JRadioButton transferoutNaojRadioButton;
    private javax.swing.JRadioButton transferoutSimjRadioButton;
    private javax.swing.ButtonGroup transferoutbuttonGroup;
    private javax.swing.JTextField valorCambiojTextField;
    private javax.swing.JTextField valorJurosjTextField;
    private javax.swing.JTextField valorOrcamentoFormajTextField;
    private javax.swing.JTextField valorParcelajTextField;
    private javax.swing.JTextField valorParcelamentojTextField;
    private javax.swing.JTextField valorProdutosMoedaEstrangeirajTextField;
    private javax.swing.JTextField valorProdutosMoedaRealjTextField;
    private javax.swing.JTextField valorSeguroGovernamentaljTextField;
    private javax.swing.JTextField valorSegurojTextField;
    private javax.swing.JTextField valorTotalOrcamentojTextField;
    private javax.swing.JComboBox vegetarianojComboBox;
    private javax.swing.JCheckBox vistoClientejCheckBox;
    private javax.swing.JCheckBox vistoTravelMatejCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            nomeClientejTextField.setText(cliente.getNome());
            OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
            orcamentoCurso = orcamentoCursoController.consultarCliente(cliente.getIdcliente());
            if (orcamentoCurso!=null){
                String msg = "Cliente : " + cliente.getNome() + "\b\n" + 
                        "  possui orcamento em aberto. Vincular Orçamento.";
                boolean resultado = JOptionPane.showConfirmDialog(null, msg, "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) == 0;
                if (resultado){
                    new FrmConsultarOrcamentoCurso(usuarioLogadoBean, cliente, this);
                }
            }
        }
    }
    
    public void carregarInicializacao(int idVenda){
        carregarModelOrcamentoProduto();
        carregarListaProdutos();
        carregarComboMoedas();
        if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone()==9){
            telefoneEmergenciajCheckBox.setText("8-Telefone");
        }else {
            telefoneEmergenciajCheckBox.setText("9-Telefone");
        }
        if (idVenda>0){
            carregarObjetos(idVenda);
        } else {
            ProdutoOrcamentoController produtoorcamentoController = new ProdutoOrcamentoController();
            Produtosorcamento produtosorcamento = produtoorcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getPassagemTaxaTM());
            ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
            pob.setIdOrcamentoProdutoOrcamento(0);
            pob.setDescricaoProdutoOrcamento(produtosorcamento.getDescricao());
            pob.setIdProdutoOrcamento(produtosorcamento.getIdprodutosOrcamento());
            pob.setValorMoedaEstrangeira(0.0f);
            pob.setValorMoedaReal(usuarioLogadoBean.getParametrosprodutos().getValorTaxaTM());
            pob.setApagar(false);
            pob.setVisto(false);
            pob.setSeguro(false);
            pob.setNovo(true);
            pob.setTipo("A");
            listaProdutoOrcamentoBean.add(pob);
            consultaCambio = true;
        }
    }
    
    public void carregarListaProdutos(){
        ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
        List<Viewprodutosfiltro> lista = produtoOrcamentoController.listarFiltroProdutosOrcamento(usuarioLogadoBean.getParametrosprodutos().getCursos());
        if (lista==null){
            lista = new ArrayList<Viewprodutosfiltro>();
        }
        produtoOrcaemntojComboBox = Formatacao.preencherComobox(lista, produtoOrcaemntojComboBox, false, null);
    }
    
    
    public void carregarModelOrcamentoProduto(){
        if (listaProdutoOrcamentoBean==null){
            listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
        }
        modelOrcamentoProduto = new OrcamentoProdutoTableModel(listaProdutoOrcamentoBean);
        produtoOrcamentojTable.setModel(modelOrcamentoProduto);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        produtoOrcamentojTable.getColumnModel().getColumn(0).setPreferredWidth(290);
        produtoOrcamentojTable.getColumnModel().getColumn(1).setCellRenderer(renderer);
        produtoOrcamentojTable.getColumnModel().getColumn(1).setPreferredWidth(80);
        produtoOrcamentojTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
        produtoOrcamentojTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        produtoOrcamentojTable.repaint();
    }
     
   public void calcularValorTotalOrcamento(){
       if (usuarioLogadoBean.getParametrosprodutos().isRemessaativa()){
           calcularImpostoRemessa();
       }
       if(listaProdutoOrcamentoBean!=null){
           valorTotal=0.0f;
           totalMoedaEstrangeira=0.0f;
           totalMoedaReal=0.0f;
           for(int i=0;i<listaProdutoOrcamentoBean.size();i++){
               valorTotal = valorTotal + listaProdutoOrcamentoBean.get(i).getValorMoedaReal();
               totalMoedaEstrangeira = totalMoedaEstrangeira + listaProdutoOrcamentoBean.get(i).getValorMoedaEstrangeira();
               totalMoedaReal = totalMoedaReal + listaProdutoOrcamentoBean.get(i).getValorMoedaReal();
           }
           subTotal = valorTotal;
           valorTotalOrcamentojTextField.setText(Formatacao.formatarFloatString(valorTotal));
           valorOrcamentoFormajTextField.setText(valorTotalOrcamentojTextField.getText());
           totalPagar = valorTotal + valorJuros;
           totalPagarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
           saldoReceberjTextField.setText(Formatacao.formatarFloatString(totalPagar));
           calcularParcelamentoPagamento();
       }
   }
   
   private void calcularImpostoRemessa() {
        ProdutoRemessaController produtoRemessaController = new ProdutoRemessaController();
        List<Produtoremessa> listaProdutoRemessa = produtoRemessaController.listar(usuarioLogadoBean.getParametrosprodutos().getCursos());
        float valorremessa = 0.0f;
        if (listaProdutoRemessa != null) {
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                int idProduto = listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento();
                for (int n = 0; n < listaProdutoRemessa.size(); n++) {
                    int idRemessa = listaProdutoRemessa.get(n).getProdutosorcamento().getIdprodutosOrcamento();
                    if (idProduto == idRemessa) {
                        valorremessa = valorremessa + listaProdutoOrcamentoBean.get(i).getValorMoedaReal();
                    }
                }
            }
        } 
        if (valorremessa>0){
            boolean achou = false;
            valorremessa = valorremessa * (usuarioLogadoBean.getParametrosprodutos().getPercentualremessa()/100);
            int idRemessa = usuarioLogadoBean.getParametrosprodutos().getProdutoremessa();
            for(int i=0;i<listaProdutoOrcamentoBean.size();i++){
                int idProduto = listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento();
                if (idRemessa==idProduto){
                    listaProdutoOrcamentoBean.get(i).setValorMoedaReal(valorremessa);
                    listaProdutoOrcamentoBean.get(i).setValorMoedaEstrangeira(valorremessa/cambio.getValor());
                    achou=true;
                    i=10000;
                }
            }
            if (!achou) {
                ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
                Produtosorcamento produtosorcamento = produtoOrcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getProdutoremessa());
                telas.Cursos.ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                pob.setIdOrcamentoProdutoOrcamento(0);
                pob.setDescricaoProdutoOrcamento(produtosorcamento.getDescricao());
                pob.setIdProdutoOrcamento(produtosorcamento.getIdprodutosOrcamento());
                pob.setValorMoedaEstrangeira(valorremessa/cambio.getValor());
                pob.setValorMoedaReal(valorremessa);
                pob.setApagar(false);
                pob.setVisto(false);
                pob.setSeguro(false);
                pob.setNovo(true);
                pob.setTipo("A"); 
                listaProdutoOrcamentoBean.add(pob); 
            }
        }
    }

    @Override
    public void setCambio(Float valorCambio) {
        valorCambiojTextField.setText(Formatacao.formatarFloatString(valorCambio));
        this.valorCambio = valorCambio;
        cambioAlterado = "Não";
    }
    
    public void salvarVendas(String situacao){
        if (venda==null){
            venda = new Vendas();
            this.novaFicha = true;
            venda.setDataVenda(new Date());
            venda.setUsuariocancelamento(0);
            venda.setObsCancelar("");
            venda.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            venda.setUnidadenegocio(usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio());
        }else {
            if (this.venda.getSituacao().equalsIgnoreCase("PROCESSO")){
                this.venda.setDataVenda(new Date());
            }
        }
        venda.setSituacao(situacao);
        venda.setCambio(cambio.getIdcambio());
        VendasController vendasController = new VendasController();       
        venda.setCliente(cliente.getIdcliente());
        venda.setObstm(obsTMjTextArea.getText());
        venda.setVendasMatriz("S");
        venda.setProdutos(usuarioLogadoBean.getParametrosprodutos().getCursos());
        venda.setValor(Formatacao.formatarStringfloat(valorTotalOrcamentojTextField.getText()));
        venda.setFornecedor(fornecedorCidade.getFornecedor().getIdfornecedor());
        venda.setFornecedorcidade(fornecedorCidade);
        venda = vendasController.salvar(venda);
    }
    
    public void salvarFormaPagamento(){
        if (formaPagamento==null){
            formaPagamento = new Formapagamento();
        }
        formaPagamento.setCondicao(condicaoPagamentojComboBox.getSelectedItem().toString());
        formaPagamento.setPossuiJuros(possuiJurosjComboBox.getSelectedItem().toString());
        formaPagamento.setValorJutos(valorJuros);
        formaPagamento.setValorOrcamento(Formatacao.formatarStringfloat(valorOrcamentoFormajTextField.getText()));
        formaPagamento.setValorTotal(formaPagamento.getValorJutos() + formaPagamento.getValorOrcamento());
        formaPagamento.setObservacoes(observacoesjTextArea111.getText());
        formaPagamento.setVendas(this.venda.getIdvendas());
        FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
        formaPagamento = formaPagamentoController.salvar(formaPagamento);
        ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
        for(int i=0;i<listaParcelamento.size();i++){
            Parcelamentopagamento parcelamento = listaParcelamento.get(i);
            parcelamento.setIdformapagamento(formaPagamento.getIdformaPagamento());
            parcelamento = parcelamentoPagamentoController.salvar(parcelamento);
        }
    }
    
    
    public void salvarSeguroViagem() {
        if (seguroViagem == null) {
            seguroViagem = new Seguroviagem();
            seguroViagem.setControle("Processo");
        }
        if (seguroViagemSemjRadioButton.isSelected()) {
            seguroViagem.setDataInicio(dataInicioSegurojDateChooser.getDate());
            seguroViagem.setDataTermino(dataTerminoSegurojDateChooser.getDate());
            Integer numero = Integer.parseInt(numeroSemanaSegurosjTextField.getText());
            seguroViagem.setNumeroSemanas(numero);
            seguroViagem.setPlano(planosegurojTextField.getText());
            seguroViagem.setSeguradora(seguradorajTextField.getText());
            seguroViagem.setPossuiSeguro("Sim");
            seguroViagem.setValoresseguro(valoresSeguro);
            if (valorSegurojTextField.getText().length() > 0) {
                valorSeguro = Formatacao.formatarStringfloat(valorSegurojTextField.getText());
            }
            seguroViagem.setValorSeguro(valorSeguro);
            seguroViagem.setFoneContatoEmergencia(telefoneEmergenciajTextField.getText());
            seguroViagem.setNomeContatoEmergencia(nomeContatoEmergenciajTextField.getText());
            seguroViagem.setPaisDestino(paisjTextField.getText());
            seguroViagem.setValoresseguro(valoresSeguro);
            seguroViagem.setFornecedor(valoresSeguro.getFornecedorcidade().getFornecedor().getIdfornecedor());
        } else {
            seguroViagem.setValorSeguro(0.0f);
            seguroViagem.setPossuiSeguro("Não");
            seguroViagem.setVendas(venda.getIdvendas());
            seguroViagem.setFornecedor(5);
            seguroViagem.setValorSeguro(valorSeguro);
            seguroViagem.setDataInicio(null);
            seguroViagem.setDataTermino(null);
            seguroViagem.setNumeroSemanas(0);
            seguroViagem.setPlano(" ");
            seguroViagem.setSeguradora("");
            seguroViagem.setPossuiSeguro("Não");
            seguroViagem.setValorSeguro(0.0f);
            seguroViagem.setFoneContatoEmergencia("");
            seguroViagem.setNomeContatoEmergencia("");
            seguroViagem.setPaisDestino("");
            ValorSeguroController valorSeguroController = new ValorSeguroController();
            valoresSeguro = valorSeguroController.consultar(1);
            seguroViagem.setValoresseguro(valoresSeguro);
            seguroViagem.setFornecedor(valoresSeguro.getFornecedorcidade().getFornecedor().getIdfornecedor());
        }
        seguroViagem.setVendas(venda.getIdvendas());
        SeguroViagemController seguroViagemController = new SeguroViagemController();
        seguroViagem = seguroViagemController.salvar(seguroViagem);
    }
    
    
    
    public void salvarCurso(){
        if (this.curso==null){
            curso = new Cursos();
            curso.setDataInscricao(new Date());
        }
        curso.setIndiomaEstudar(idiomajComboBox.getSelectedItem().toString());
        curso.setNivelIdiomaEstudar(nivelIdiomajComboBox.getSelectedItem().toString());
        curso.setNomeCurso(cursojTextField.getText());
        curso.setEscola(escolajTextField.getText());
        curso.setCidade(cidadejTextField.getText());
        curso.setPais(paisjTextField.getText());
        curso.setAulassemana(Double.parseDouble(aulasSemanajTextField.getText()));
        curso.setNumeroSenamas(Integer.parseInt(numeroSemanasjTextField.getText()));
        curso.setDataInicio(dataIniciojDateChooser.getDate());
        curso.setDataTermino(dataTerminojDateChooser.getDate());
        curso.setTipoDuracao(tipoDuracaojComboBox.getSelectedItem().toString());
        curso.setTipoAcomodacao(tipoAcomodacaojComboBox.getSelectedItem().toString());
        if (!curso.getTipoAcomodacao().equalsIgnoreCase("sem acomodação")) {
            curso.setNumeroSemanasAcamodacao(Integer.parseInt(numeroSemanasAcomodacaojTextField.getText()));
            curso.setTipoQuarto(tipoQuartojComboBox.getSelectedItem().toString());
            curso.setRefeicoes(refeicaojComboBox.getSelectedItem().toString());
            curso.setDataChegada(dataChegadaAcomodacaojDateChooser.getDate());
            curso.setDataSaida(dataPartidaAcomodacaojDateChooser.getDate());
            curso.setAdicionais(adicionaisAcomodacaojTextField.getText());
            curso.setFamiliacomCrianca(familiacriancajComboBox.getSelectedItem().toString());
            curso.setFamiliacomAnimais(familiaanimaisestimacaojComboBox.getSelectedItem().toString());
            curso.setFumante(fumantejComboBox.getSelectedItem().toString());
            curso.setVegetariano(vegetarianojComboBox.getSelectedItem().toString());
            curso.setHobbies(hobbiesjTextField.getText());
        }else{
            curso.setNumeroSemanasAcamodacao(0);
            curso.setTipoQuarto("");
            curso.setRefeicoes("");
            curso.setAdicionais("");
            curso.setFamiliacomCrianca("");
            curso.setFamiliacomAnimais("");
            curso.setFumante("");
            curso.setVegetariano("");
            curso.setHobbies("");
        }
        
        if (temAlergiaSimjRadioButton.isSelected()){
            curso.setPossuiAlergia("Sim");
        }else if (temAlergiaNaojRadioButton.isSelected()){
            curso.setPossuiAlergia("Não");
        }
        curso.setQuaisAlergias(quaisAlergiajTextField.getText());
        curso.setSolicitacoesEspeciais(solicitacoesEspeciaisjTextField.getText());
        if (cartaoVTMSimjRadioButton.isSelected()){
            curso.setCaratoVTM("Sim");
        }else if (cartaoVTMNaojRadioButton.isSelected()){
            curso.setCaratoVTM("Não");
        }
        curso.setNumeroCartaoVTM(numeroCartaoVTMjTextField.getText());
        curso.setMoedaCartaoVTM(moedaCartaoVTMjComboBox.getSelectedItem().toString());
        if (transferinSimjRadioButton.isSelected()){
            curso.setTransferin("Sim");
        }else curso.setTransferin("Não");
        if (transferoutSimjRadioButton.isSelected()){
            curso.setTransferouto("Sim");
        }else curso.setTransferouto("Não");
        if (passagemTravelMatejCheckBox.isSelected()){
            curso.setPassagemAerea("Através TravelMate");
        }
        if (passagemClientejCheckBox.isSelected()){
            curso.setPassagemAerea("Cliente providenciará");
        }
        curso.setObservacaoPassagemAerea(observacaoPassagemAereajTextField.getText());
        if (vistoTravelMatejCheckBox.isSelected()){
            curso.setVistoConsular("Através da TravelMate");
        }
        if (vistoClientejCheckBox.isSelected()){
            curso.setVistoConsular("Cliente providenciará");
        }
        if (dataEntregaVistojDateChooser.getDate()!=null){
            curso.setDataEntregaDocumentosVistos(dataEntregaVistojDateChooser.getDate());
        }
        if (seguroViagemGovernamentalSemjRadioButton.isSelected()){
            curso.setPossuiSeguroGovernamental("S");
            curso.setSeguradoraGovernamental(seguradoraGovernamentaljTextField.getText());
            if (numeromesesSegurosjTextField.getText().length()>0){
                curso.setNumeroMeses(Integer.parseInt(numeromesesSegurosjTextField.getText()));
            }
            if (valorSeguroGovernamentaljTextField.getText().length()>0){
                curso.setValorSeguroGovernamental(Formatacao.formatarStringfloat(valorSeguroGovernamentaljTextField.getText()));
            }
        }else {
            curso.setPossuiSeguroGovernamental("N");
        }
        if (habilitarSegundoCursojCheckBox.isSelected()){
            curso.setHabilitarSegundoCurso("S");
            curso.setsCurso(scursojTextField.getText());
            curso.setsDataInicio(sdataIniciojDateChooser.getDate());
            curso.setsNumeroSemanas(Integer.parseInt(snumeroSemanasjTextField.getText()));
            curso.setsDataTermino(sdataTerminojDateChooser.getDate());
            curso.setsTipoCargaHoraria(stipoDuracaojComboBox.getSelectedItem().toString());
            curso.setsCargaHoraria(Double.parseDouble(saulasSemanajTextField.getText()));
        }else {
            curso.setHabilitarSegundoCurso("N");
        }
        curso.setObservacaoVisto(observacaoVistojTextField.getText());
        curso.setNomeContatoEmergencia(nomeContatoEmergenciajTextField.getText());
        curso.setFoneContatoEmergencia(telefoneEmergenciajTextField.getText());
        curso.setEmalContatoEmergencia(emailConatoEmergenciajTextField.getText());
        curso.setRelacaoContatoEmergencia(relacaoEmergenciajTextField.getText());
        curso.setIdioma(idiomajComboBox.getSelectedItem().toString());
        curso.setNivelIdioma(nivelIdiomajComboBox.getSelectedItem().toString());
        curso.setControle("Processo");
        curso.setVendas(venda.getIdvendas());
        CursosController cursosController = new CursosController();
        curso = cursosController.salvar(curso);
        if (orcamentoCurso!=null){
            OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
            orcamentoCurso.setIdCurso(curso.getIdcursos());
            orcamentoCursoController.salvar(orcamentoCurso);
        }
        
    }
    
    public void salvarOrcamento(){
        if (orcamento==null){
            orcamento = new Orcamento();
        }
        orcamento.setDataCambio(cambio.getData());
        orcamento.setValorCambio(valorCambio);
        orcamento.setTotalMoedaEstrangeira(totalMoedaEstrangeira);
        orcamento.setTotalMoedaNacional(totalMoedaReal);
        orcamento.setVendas(venda.getIdvendas());
        orcamento.setCambioAlterado(cambioAlterado);
        orcamento.setCambio(cambio.getIdcambio());
        OrcamentoController orcamentoController = new OrcamentoController();
        orcamento = orcamentoController.salvar(orcamento);
        salvarOrcamentoProdutoOrcamento(orcamento);
    }
    
    public void salvarOrcamentoProdutoOrcamento(Orcamento orcamento) {
        apagarOrcamentoProdutosOrcamento();
        if (listaProdutoOrcamentoBean != null) {
            OrcamentoController orcamentoController = new OrcamentoController();
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                Orcamentoprodutosorcamento produto;
                produto = new Orcamentoprodutosorcamento();
                produto.setOrcamento(orcamento.getIdorcamento());
                produto.setProdutosOrcamento(listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento());
                produto.setTipo(listaProdutoOrcamentoBean.get(i).getTipo());
                produto.setValorMoedaEstrangeira(listaProdutoOrcamentoBean.get(i).getValorMoedaEstrangeira());
                produto.setValorMoedaNacional(listaProdutoOrcamentoBean.get(i).getValorMoedaReal());
                orcamentoController.salvar(produto);
            }
        }
    }
    
    
    public void apagarOrcamentoProdutosOrcamento() {
        OrcamentoController orcamentoController = new OrcamentoController();
        List<Orcamentoprodutosorcamento> listaProdutoOrcamento = orcamentoController.listarOrcamentoProdutoOrcamento(orcamento.getIdorcamento());
        if (listaProdutoOrcamento != null) {
            for (int i = 0; i < listaProdutoOrcamento.size(); i++) {
                orcamentoController.excluirOrcamentoProdutoOrcamento(listaProdutoOrcamento.get(i).getIdorcamentoProdutosOrcamento());
            }
        }
    }

    

    @Override
    public void alterarValorCambio(String valor) {
        float novoValor = Formatacao.formatarStringfloat(valor);
        if (valorCambio != novoValor) {
            valorCambio = Formatacao.formatarStringfloat(valor);
            valorCambiojTextField.setText(Formatacao.formatarFloatString(valorCambio));
            cambioAlterado = "Sim";
            atualizarValoresProduto();
        }else JOptionPane.showMessageDialog(rootPane, "Valor não é diferente");
    }
    
     public void  setMascaras(){
//        try {
//            if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone()==9){
//                telefoneContatoEmergenciajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
//            }else {
//                telefoneContatoEmergenciajFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
//            }
//            
//        } catch (ParseException ex) {
//            Logger.getLogger(FrmCadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }
     
    public void adicionarSeguroOrcamento() {
        ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
        pob.setDescricaoProdutoOrcamento("Seguro Viagem");
        pob.setIdProdutoOrcamento(usuarioLogadoBean.getParametrosprodutos().getSeguroOrcamento());
        pob.setValorMoedaEstrangeira(0.0f);
        pob.setValorMoedaReal(valorSeguro);
        pob.setApagar(false);
        pob.setVisto(false);
        pob.setSeguro(true);
        pob.setNovo(true);
        listaProdutoOrcamentoBean.add(pob);
        calcularValorTotalOrcamento();
        carregarModelOrcamentoProduto();
    }
    
    public void adicionarVistoOrcamento() {
        ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
        pob.setDescricaoProdutoOrcamento("Emissão de Visto");
        pob.setIdProdutoOrcamento(usuarioLogadoBean.getParametrosprodutos().getVistoOrcamento());
        pob.setValorMoedaEstrangeira(0.0f);
        pob.setValorMoedaReal(valorVistos);
        pob.setApagar(false);
        pob.setVisto(true);
        pob.setSeguro(false);
        pob.setNovo(true);
        listaProdutoOrcamentoBean.add(pob);
        calcularValorTotalOrcamento();
        carregarModelOrcamentoProduto();
    }
    
    public boolean verificarVistoLancado(){
        if(listaProdutoOrcamentoBean!=null){
            for(int i=0;i<listaProdutoOrcamentoBean.size();i++){
                if (listaProdutoOrcamentoBean.get(i).isVisto()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean verificarSeguroLancado(){
        if(listaProdutoOrcamentoBean!=null){
            for(int i=0;i<listaProdutoOrcamentoBean.size();i++){
                if (listaProdutoOrcamentoBean.get(i).isSeguro()){
                    return true;
                }
            }
        }
        return false;
    }
    
    public void carregarObjetos(int idVenda){
        //Vendas
        VendasController vendasController = new VendasController();
        this.venda = vendasController.consultarVendas(idVenda);
        if (this.venda!=null){
            valorVendaAlterar = venda.getValor();
            situacao = venda.getSituacao();
            if (venda.getSituacao().equalsIgnoreCase("FINALIZADA")){
                vendaAlterada = venda;
            }
            obsTMjTextArea.setText(venda.getObstm());
            ClienteController clienteController = new ClienteController();
            this.cliente = clienteController.consultar(venda.getCliente());
            
            CursosController cursosController = new CursosController();
            this.curso = cursosController.consultarCursos(idVenda);
            if(curso!=null){
                carregarCursoAlteracao();
                carregarCamposCurso();
            }
            
            
            fornecedorCidade = venda.getFornecedorcidade();
            fornecedorCidadeAlterado = fornecedorCidade;
            
            
            
            FornecedorComissaoCursoController fornecedorComissaoCursoController = new FornecedorComissaoCursoController();
            fornecedorComissao = fornecedorComissaoCursoController.getFonecedorComissaoCurso(fornecedorCidade.getFornecedor().getIdfornecedor(), fornecedorCidade.getCidade().getPais().getIdpais());

            
            SeguroViagemController seguroViagemController = new SeguroViagemController();
            this.seguroViagem = seguroViagemController.consultar(idVenda);
            if (seguroViagem!=null) {
                seguroViagemAlterado = seguroViagem;
                if (seguroViagem.getPossuiSeguro().equalsIgnoreCase("Sim")){
                    carregarSeguro();
                }
            }
            FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
            this.formaPagamento = formaPagamentoController.consultar(idVenda);
            if (formaPagamento!=null){
                carregarCamposFormaPagamento();
            }
            
            OrcamentoController orcamentoController = new OrcamentoController();
            orcamento = orcamentoController.consultar(idVenda);
            if (orcamento!=null){
                carregarCambio();
                List<Orcamentoprodutosorcamento> listaOrcametoProduto = orcamentoController.listarOrcamentoProdutoOrcamento(orcamento.getIdorcamento());
                if (listaOrcametoProduto!=null){
                    for(int i=0;i<listaOrcametoProduto.size();i++){
                        Produtosorcamento prod = orcamentoController.consultarProdutoOrcamento(listaOrcametoProduto.get(i).getProdutosOrcamento());
                        ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                        pob.setDescricaoProdutoOrcamento(prod.getDescricao());
                        pob.setIdProdutoOrcamento(prod.getIdprodutosOrcamento());
                        pob.setValorMoedaEstrangeira(listaOrcametoProduto.get(i).getValorMoedaEstrangeira());
                        pob.setValorMoedaReal(listaOrcametoProduto.get(i).getValorMoedaNacional());
                        pob.setIdOrcamentoProdutoOrcamento(listaOrcametoProduto.get(i).getIdorcamentoProdutosOrcamento());
                        pob.setApagar(false);
                        pob.setVisto(false);
                        pob.setSeguro(false);
                        pob.setTipo(listaOrcametoProduto.get(i).getTipo());
                        pob.setNovo(false);
                        listaProdutoOrcamentoBean.add(pob);
                    }
                    carregarModelOrcamentoProduto();
                    calcularValorTotalOrcamento();
                }
            }
            consultaCambio=true;
        }
    }
    
    public void carregarCamposCurso(){
        obsTMjTextArea.setText(venda.getObstm());
        nomeClientejTextField.setText(cliente.getNome());
        idiomajComboBox.setSelectedItem(curso.getIndiomaEstudar());
        nivelIdiomajComboBox.setSelectedItem(curso.getNivelIdiomaEstudar());
        cursojTextField.setText(curso.getNomeCurso());
        escolajTextField.setText(curso.getEscola());
        cidadejTextField.setText(curso.getCidade());
        paisjTextField.setText(curso.getPais());
        tipoDuracaojComboBox.setSelectedItem(curso.getTipoDuracao());
        aulasSemanajTextField.setText(String.valueOf(curso.getAulassemana()));
        numeroSemanasjTextField.setText(String.valueOf(curso.getNumeroSenamas()));
        dataIniciojDateChooser.setDate(curso.getDataInicio());
        dataTerminojDateChooser.setDate(curso.getDataTermino());
        tipoAcomodacaojComboBox.setSelectedItem(curso.getTipoAcomodacao());
        numeroSemanasAcomodacaojTextField.setText(String.valueOf(curso.getNumeroSemanasAcamodacao()));
        tipoQuartojComboBox.setSelectedItem(curso.getTipoQuarto());
        refeicaojComboBox.setSelectedItem(curso.getRefeicoes());
        adicionaisAcomodacaojTextField.setText(curso.getAdicionais());
        dataChegadaAcomodacaojDateChooser.setDate(curso.getDataChegada());
        dataPartidaAcomodacaojDateChooser.setDate(curso.getDataSaida());
        familiacriancajComboBox.setSelectedItem(curso.getFamiliacomCrianca());
        familiaanimaisestimacaojComboBox.setSelectedItem(curso.getFamiliacomAnimais());
        fumantejComboBox.setSelectedItem(curso.getFumante());
        vegetarianojComboBox.setSelectedItem(curso.getVegetariano());
        hobbiesjTextField.setText(curso.getHobbies());
        if (curso.getPossuiAlergia().equalsIgnoreCase("Sim")){
            temAlergiaSimjRadioButton.setSelected(true);
        }else if (curso.getPossuiAlergia().equalsIgnoreCase("Não")){
            temAlergiaNaojRadioButton.setSelected(true);
        }
        quaisAlergiajTextField.setText(curso.getQuaisAlergias());
        solicitacoesEspeciaisjTextField.setText(curso.getSolicitacoesEspeciais());
        if (curso.getCaratoVTM().equalsIgnoreCase("Sim")){
            cartaoVTMSimjRadioButton.setSelected(true);
        }else if (curso.getCaratoVTM().equalsIgnoreCase("Não")){
            cartaoVTMNaojRadioButton.setSelected(false);
        }
        numeroCartaoVTMjTextField.setText(curso.getNumeroCartaoVTM());
        moedaCartaoVTMjComboBox.setSelectedItem(curso.getMoedaCartaoVTM());
        if (curso.getTransferin().equalsIgnoreCase("Sim")){
            transferinSimjRadioButton.setSelected(true);
        }else transferinNaojRadioButton.setSelected(true);
        if (curso.getTransferouto().equalsIgnoreCase("Sim")){
            transferoutSimjRadioButton.setSelected(true);
        }else transferoutNaojRadioButton.setSelected(true);
        if (curso.getPassagemAerea().equalsIgnoreCase("Através TravelMate")){
            passagemTravelMatejCheckBox.setSelected(true);
        }else if (curso.getPassagemAerea().equalsIgnoreCase("Cliente providenciará")){
            passagemClientejCheckBox.setSelected(true);
        }
        observacaoPassagemAereajTextField.setText(curso.getObservacaoPassagemAerea());
        if (curso.getVistoConsular().equalsIgnoreCase("Através da TravelMate")){
            vistoTravelMatejCheckBox.setSelected(true);
            dataEntregaVistojDateChooser.setDate(curso.getDataEntregaDocumentosVistos());
            observacaoVistojTextField.setText(curso.getObservacaoVisto());
        }else if (curso.getVistoConsular().equalsIgnoreCase("Cliente providenciará"))
        curso.setObservacaoPassagemAerea(observacaoPassagemAereajTextField.getText());
        dataEntregaVistojDateChooser.setDate(curso.getDataEntregaDocumentosVistos());
        observacaoVistojTextField.setText(curso.getObservacaoVisto());
        nomeContatoEmergenciajTextField.setText(curso.getNomeContatoEmergencia());
        telefoneEmergenciajTextField.setText(curso.getFoneContatoEmergencia());
        emailConatoEmergenciajTextField.setText(curso.getEmalContatoEmergencia());
        relacaoEmergenciajTextField.setText(curso.getRelacaoContatoEmergencia()); 
        idiomajComboBox.setSelectedItem(curso.getIdioma());
        nivelIdiomajComboBox.setSelectedItem(curso.getNivelIdioma());
        if (curso.getHabilitarSegundoCurso().equalsIgnoreCase("S")){
            habilitarSegundoCursojCheckBox.setSelected(true);
            scursojTextField.setText(curso.getsCurso());
            sdataIniciojDateChooser.setDate(curso.getsDataInicio());
            snumeroSemanasjTextField.setText(String.valueOf(curso.getsNumeroSemanas()));
            sdataTerminojDateChooser.setDate(curso.getsDataTermino());
            stipoDuracaojComboBox.setSelectedItem(curso.getsTipoCargaHoraria());
            saulasSemanajTextField.setText(String.valueOf(curso.getsCargaHoraria()));
        }else {
            habilitarSegundoCursojCheckBox.setSelected(false);
        }
        if (curso.getPossuiSeguroGovernamental().equalsIgnoreCase("S")){
            seguroViagemGovernamentalSemjRadioButton.setSelected(true);
            seguradoraGovernamentaljTextField.setText(curso.getSeguradoraGovernamental());
            numeromesesSegurosjTextField.setText(String.valueOf(curso.getNumeroMeses()));
            valorSeguroGovernamentaljTextField.setText(Formatacao.formatarFloatString(curso.getValorSeguroGovernamental()));
        }else {
            seguroViagemGovernamentalNaojRadioButton.setSelected(true);
        }
    }
    
    public void carregarCamposFormaPagamento(){
        condicaoPagamentojComboBox.setSelectedItem(formaPagamento.getCondicao());
        possuiJurosjComboBox.setSelectedItem(formaPagamento.getPossuiJuros());
        valorJuros = formaPagamento.getValorJutos();
        valorJurosjTextField.setText(Formatacao.formatarFloatString(formaPagamento.getValorJutos()));
        observacoesjTextArea111.setText(formaPagamento.getObservacoes());
        ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
        listaParcelamento = parcelamentoPagamentoController.listar(formaPagamento.getIdformaPagamento());
        calcularParcelamentoPagamento();
        carregarModelParcelamento();
    }
    
    public void carregarSeguro(){
        if (seguroViagem.getPossuiSeguro().equalsIgnoreCase("Sim")) {
            seguroViagemSemjRadioButton.setSelected(true);
            seguradorajTextField.setText(seguroViagem.getSeguradora());
            valorSegurojTextField.setText(Formatacao.formatarFloatString(seguroViagem.getValorSeguro()));
            valorSeguro = seguroViagem.getValorSeguro();
            planosegurojTextField.setText(seguroViagem.getPlano());
            dataInicioSegurojDateChooser.setDate(seguroViagem.getDataInicio());
            dataTerminoSegurojDateChooser.setDate(seguroViagem.getDataTermino());
            numeroSemanaSegurosjTextField.setText(String.valueOf(seguroViagem.getNumeroSemanas()));
        }else {
            seguroViagemNaojRadioButton.setSelected(true);
        }
        valoresSeguro = seguroViagem.getValoresseguro();   
    }
    
    
   
    
    
    public void carregarComboMoedas(){
        CambioController cambioController = new CambioController();
        List<Moedas> listaMoedas = cambioController.listaMoedas();
        if (listaMoedas!=null){
            moedaCambiojComboBox = Formatacao.preencherComobox(listaMoedas, moedaCambiojComboBox, true, "Nenhum");
        }
    }
    
    public void carregarCambio(){
        CambioController cambioController = new CambioController();
        cambio = cambioController.consultar(orcamento.getCambio());
        Moedas moeda = cambio.getMoedas();
        if (venda.getSituacao().equalsIgnoreCase("PROCESSO")){
            int dias= Formatacao.subtrairDatas(new Date(), venda.getDataVenda());
            if (dias>3){
                JOptionPane.showMessageDialog(rootPane, "Câmbio alterado para o dia atual");
                cambio = cambioController.consultarCambioMoeda(Formatacao.ConvercaoDataSql(dataCambio), moeda.getIdmoedas());
                if (cambio != null) {
                    setCambio(cambio.getValor());
                    atualizarValoresProduto();
                }
            }else {
                    valorCambio = orcamento.getValorCambio();
                    cambio.setValor(valorCambio);
                    cambioAlterado = orcamento.getCambioAlterado();
            }
        }else {
                valorCambio = orcamento.getValorCambio();
                cambio.setValor(valorCambio);
                cambioAlterado = orcamento.getCambioAlterado();
        }
        moedaCambiojComboBox.setSelectedItem(moeda);
        valorCambiojTextField.setText(Formatacao.formatarFloatString(valorCambio));
    }

    @Override
    public void liberarAltercaoCambio(Acesso acesso) {
        if (acesso!=null){
           new FrmAlterarValorCambio(this, true, this, acesso, usuarioLogadoBean.getUsuario().getIdusuario(), cambio.getValor());
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }
    
    
    public String validarDados(){
        String msg ="";
        if (fornecedorCidade==null){
            msg = msg + "Campo escola não selecionado\r\n";
        }
        if (nomeClientejTextField.getText().length()==0){
            msg = msg + "Campo cliente não selecionado\r\n";
        }
        if (cursojTextField.getText().length()==0){
            msg = msg + "Curso não informado\r\n";
        }
        if (escolajTextField.getText().length()==0){
            msg = msg + "Escola/Instituição não informada\r\n";
        }
        if (paisjTextField.getText().length()==0){
            msg = msg + "País não informado\r\n";
        }
        if (aulasSemanajTextField.getText().length()==0){
            msg = msg + "Aulas por semana não informada\r\n";
        }
        if (numeroSemanasjTextField.getText().length()==0){
            msg = msg + "Número de semanas não informado\r\n";
        }
        if (dataIniciojDateChooser.getDate()==null){
            msg = msg  + "Data início inválida\r\n";
        }
        if (dataTerminojDateChooser.getDate()==null){
            msg = msg + "Data términio inválida\r\n";
        }
        if (!tipoAcomodacaojComboBox.getSelectedItem().toString().equalsIgnoreCase("sem acomodação")) {
            if (dataChegadaAcomodacaojDateChooser.getDate() == null) {
                msg = msg + "Data chegada na acomodação inválida\r\n";
            }
            if (dataPartidaAcomodacaojDateChooser.getDate() == null) {
                msg = msg + "Data partida acomodação inválida\r\n";
            }
            if (numeroSemanasAcomodacaojTextField.getText().length() == 0) {
                msg = msg + "Número de semanas de acomodação não informado\r\n";
            }
        }
        if (cartaoVTMSimjRadioButton.isSelected()){
            if (numeroCartaoVTMjTextField.getText().length()==0){
                msg = msg + "Nº Cartão VTM não informado\r\n";
            }
        }
        if (seguroViagemSemjRadioButton.isSelected()){
            if (seguradorajTextField.getText().length()==0){
                msg = msg + "Seguradora não inforamda\r\n";
            }
            if (valorSeguro==0){
                msg = msg + "Valor do seguro não informado\r\n";
            }
            if (planosegurojTextField.getText().length()==0){
                msg = msg + "Plano do seguro não informado\r\n";
            }
            if (dataInicioSegurojDateChooser.getDate()==null){
                msg = msg + "Data ínicio seguro inválida\r\n";
            }
            if (dataTerminoSegurojDateChooser.getDate()==null){
                msg = msg + "Data término seguro inválida\r\n";
            }
            if (this.fornecedorCidade==null){
                msg = msg + "Escola inválida\r\n";
            }
        }
        if (nomeContatoEmergenciajTextField.getText().length()==0){
            msg = msg + "Nome do contato de emergência não informado\r\n";
        }
        if (telefoneEmergenciajTextField.getText().length()==0){
            msg = msg + "No. telefone  do contato de emergência não informado\r\n";
        }
        if (relacaoEmergenciajTextField.getText().length()==0){
            msg = msg + "Relação do contato de emergência não informado\r\n";
        }
        if (listaParcelamento==null){
            msg = msg + "Forma de Pagamento com erro\r\n";
        }
        if (listaParcelamento.size()==0){
            msg = msg + "Forma de Pagamento com erro\r\n";
        }
        double saldoParcelar = Formatacao.formatarStringfloat(saldoParcelarjTextField.getText());
        if (saldoParcelar>0){
            msg = msg + "Forma de Pagamento possui saldo a parcelar em aberto\r\n";
        }
        if (seguroViagemSemjRadioButton.isSelected()) {
            if (numeroSemanaSegurosjTextField.getText().length() == 0) {
                msg = msg + "Nº de semanas no seguro é obrigatório\r\n";
            }
        }
        return msg;
    }
    
    

    @Override
    public void setFornecedor(Fornecedorcidade fornecedorcidade) {
        if (fornecedorcidade!=null){
            FornecedorComissaoCursoController fornecedorComissaoCursoController = new FornecedorComissaoCursoController();
            fornecedorComissao = fornecedorComissaoCursoController.getFonecedorComissaoCurso(fornecedorcidade.getFornecedor().getIdfornecedor(), fornecedorcidade.getCidade().getPais().getIdpais());
            if (fornecedorComissao!=null){
            this.fornecedorCidade = fornecedorcidade;
            escolajTextField.setText(fornecedorcidade.getFornecedor().getNome());
            paisjTextField.setText(fornecedorcidade.getCidade().getPais().getNome());
            cidadejTextField.setText(fornecedorcidade.getCidade().getNome());
        }else {
                JOptionPane.showMessageDialog(rootPane, "Escola não possui comissão cadastada. Favor entrar em contato com Departamento de TI");
                this.fornecedorCidade=null;
            }
        }
    }

    
    
    public void emitirEmailGerencial() {
        EnviarEmailBean email = new EnviarEmailBean();
        if (novaFicha) {
            email.setTitulo("Nova Ficha de Curso");
            email.setTipoAviso("Inclusão");
            email.setDataInclusao(Formatacao.ConvercaoDataPadrao(venda.getDataVenda()));
            email.setValor(Formatacao.formatarFloatString(venda.getValor()));
            Moedas moeda = (Moedas) moedaCambiojComboBox.getSelectedItem();
            email.setCambio(Formatacao.formatarFloatString(cambio.getValor()));
            email.setSiglaCambio(moeda.getSigla());
        } else {
            email.setTitulo("Ficha de Curso Alterada");
            email.setTipoAviso("Alteração");
            email.setDataAlteracao(Formatacao.ConvercaoDataPadrao(new Date()));
            email.setDadosAlterados(dadosAlterado);
        }
        if (venda.getVendasMatriz().equalsIgnoreCase("S")){
            email.setTipoVenda("Venda pela Matriz");
        }else email.setTipoVenda("Venda pela Loja");
        if (venda.getFornecedorcidade().getFornecedor()!=null){
            email.setNomeEscola(venda.getFornecedorcidade().getFornecedor().getNome());
        }
        email.setUnidadeNegocio(usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia());
        email.setNomeCliente(cliente.getNome());
        email.setDatainicio(Formatacao.ConvercaoDataPadrao(curso.getDataInicio()));
        email.setConsultor(usuarioLogadoBean.getUsuario().getNome());
        email.setObsTM(venda.getObstm());
        email.setIdProduto(usuarioLogadoBean.getParametrosprodutos().getCursos());
        if (novaFicha){
            email.criarCorpoEmailInclusao();
        }else email.criarCorpoEmailAteracao();
        email.enviarEmail();
    }
    
    public void calcularParcelamentoPagamento() {
        if (listaParcelamento != null) {
            Float valorParcelado = 0.0f;
            for (int i = 0; i < listaParcelamento.size(); i++) {
                valorParcelado = valorParcelado + listaParcelamento.get(i).getValorParcelamento();
            }
            Float saldo = (valorTotal + valorJuros) - valorParcelado;
            saldoParcelarjTextField.setText(Formatacao.formatarFloatString(saldo));
        }
    }
    
    public void carregarModelParcelamento(){
        List<Parcelamentopagamento> listanova=null;
        listanova = listaParcelamento;
        if (formaPagamento != null) {
            ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
            listaParcelamento = parcelamentoPagamentoController.listar(formaPagamento.getIdformaPagamento());
            if (listaParcelamento == null) {
                listaParcelamento = new ArrayList<Parcelamentopagamento>();
            }
        }else {
                listaParcelamento = new ArrayList<Parcelamentopagamento>();
        }
        if (listanova != null) {
            for (int i = 0; i < listanova.size(); i++) {
                if (listanova.get(i).getIdparcemlamentoPagamento() == null) {
                    listaParcelamento.add(listanova.get(i));
                }
            }
        }
        modelParcelamento = new ConsultaParcelamentoPagamentoTableModel(listaParcelamento);
        parcelamentojTable.setModel(modelParcelamento);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        parcelamentojTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        parcelamentojTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        parcelamentojTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
        parcelamentojTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        parcelamentojTable.getColumnModel().getColumn(3).setCellRenderer(renderer);
        parcelamentojTable.getColumnModel().getColumn(3).setPreferredWidth(20);
        parcelamentojTable.getColumnModel().getColumn(4).setCellRenderer(renderer);
        parcelamentojTable.getColumnModel().getColumn(4).setPreferredWidth(50);
        parcelamentojTable.repaint();
    }
    
    public void salvarFollowup(){
        FollowupController followupController = new FollowupController();
        followupController.fecharFollowUpCliente(cliente.getIdcliente());   
    }
    
    public void salvarCliente(){
        cliente.setTipoCliente("Fechado");
        cliente.setDataInicio(curso.getDataInicio());
        cliente.setDataTermino(curso.getDataTermino());
        ClienteController clienteController = new ClienteController();
        cliente = clienteController.salvar(cliente);
    }
    
    public void salvarControle() {
        CursosController cursosController = new CursosController();
        List<Controlecursos> listaControle = cursosController.consultarControleCursosList(venda.getIdvendas());
        if (listaControle == null) {
            Controlecursos controle = new Controlecursos();
            controle = new Controlecursos();
            controle.setVendas(venda.getIdvendas());
            controle.setKitViagem("Não");
            controle.setVisto("Não");
            String data = null;
            try {
                data = Formatacao.SubtarirDatas(curso.getDataInicio(), 2, "dd/MM/yyyy");
            } catch (Exception ex) {
                Logger.getLogger(FrmFichaCursos.class.getName()).log(Level.SEVERE, null, ex);
            }
            controle.setDataEmbarque(Formatacao.ConvercaoStringData(data));
            controle.setOrientacaoPreEmbarque("Não");
            controle.setLoasObs(" ");
            controle.setDocanexado("N");
            controle.setPossuiAcomidacao("Não");
            controle.setValorAcomodacao(0.0f);
            controle.setWork(0);
            controle.setSituacao("Processo");
            controle = cursosController.salvar(controle);
            salvarInvoice(controle.getIdcontroleCursos());
        }
    }
    
    public void salvarInvoice(int idControle) {
        Invoices invoice = new Invoices();
        invoice.setCambioPagamento(0.0f);
        invoice.setGanhoCambio(0.0f);
        invoice.setValorPago(0.0f);
        invoice.setVendas(venda.getIdvendas());
        invoice.setControle(idControle);
        invoice.setProdutos(venda.getProdutos());
        invoice.setGanhoperda(0.0f);
        invoice.setValorPagamentoInvoice(0.0f);
        invoice.setValorPrevistoInvoice(0.0f);
        invoice.setValorcredito(0.0f);
        invoice.setPrioridade("Normal");
        invoice.setObscredito("");
        InvoicesController invoicesController = new InvoicesController();
        invoicesController.salvar(invoice);
    }
    
    

    public void verificarAlteracaoCambio(){
        if (cambioAlterado.equalsIgnoreCase("sim")){
            Formatacao.VerificarCambioalterado(valorCambio, "Curso",  cliente.getNome(), 
                    usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), usuarioLogadoBean.getUsuario().getNome(), this.venda.getProdutos(), Formatacao.formatarFloatString(this.venda.getValor()));
        }
    }
    
    public void carregarOrcamentoCurso(){
        idiomajComboBox.setSelectedItem(orcamentoCurso.getIdioma());
        nivelIdiomajComboBox.setSelectedItem(orcamentoCurso.getNivelIdioma());
        cursojTextField.setText(orcamentoCurso.getCurso());
        fornecedorCidade = orcamentoCurso.getFornecedorcidade();
        escolajTextField.setText(fornecedorCidade.getFornecedor().getNome());
        cidadejTextField.setText(fornecedorCidade.getCidade().getNome());
        paisjTextField.setText(fornecedorCidade.getCidade().getPais().getNome());
        tipoDuracaojComboBox.setSelectedItem(orcamentoCurso.getTipoDuracao());
        aulasSemanajTextField.setText(String.valueOf(orcamentoCurso.getAulasSemana()));
        numeroSemanasjTextField.setText(String.valueOf(orcamentoCurso.getNumeroSemanas()));
        dataIniciojDateChooser.setDate(orcamentoCurso.getDataInicio());
        dataTerminojDateChooser.setDate(orcamentoCurso.getDataTermino());
        tipoAcomodacaojComboBox.setSelectedItem(orcamentoCurso.getTipoAcomodacao());
        tipoQuartojComboBox.setSelectedItem(orcamentoCurso.getTipoQuarto());
        refeicaojComboBox.setSelectedItem(orcamentoCurso.getRefeicoes());
        numeroSemanasAcomodacaojTextField.setText(String.valueOf(orcamentoCurso.getDuracaoAcomodacao()));
        idiomajComboBox.setSelectedItem(orcamentoCurso.getIdioma());
        nivelIdiomajComboBox.setSelectedItem(orcamentoCurso.getNivelIdioma());
        OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
        OrcamentoController orcamentoController = new OrcamentoController();
        List<Produtoorcamentocurso> listaProdutosOrcamentoCurso = orcamentoCursoController.listarProdutoOrcamentoCurso(orcamentoCurso.getIdorcamentoCurso());
        CambioController cambioController = new CambioController();
        cambio = cambioController.consultar(orcamentoCurso.getCambio());
        cambio = cambioController.consultarCambioMoeda(Formatacao.ConvercaoDataSql(dataCambio), cambio.getMoedas().getIdmoedas());
        Moedas moeda = cambio.getMoedas();
        moedaCambiojComboBox.setSelectedItem(moeda);
        valorCambiojTextField.setText(Formatacao.formatarFloatString(orcamentoCurso.getValorCambio()));
        listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
        if (listaProdutosOrcamentoCurso != null) {
            for (int i = 0; i < listaProdutosOrcamentoCurso.size(); i++) {
                Produtosorcamento prod = orcamentoController.consultarProdutoOrcamento(listaProdutosOrcamentoCurso.get(i).getProdutosOrcamento());
                ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                pob.setDescricaoProdutoOrcamento(prod.getDescricao());
                pob.setIdProdutoOrcamento(prod.getIdprodutosOrcamento());
                pob.setValorMoedaEstrangeira(listaProdutosOrcamentoCurso.get(i).getValorMoedaEstrangeira());
                if (listaProdutosOrcamentoCurso.get(i).getValorMoedaEstrangeira()==0){
                    pob.setValorMoedaReal(listaProdutosOrcamentoCurso.get(i).getValorMoedaNacional());
                }else pob.setValorMoedaReal(listaProdutosOrcamentoCurso.get(i).getValorMoedaEstrangeira() * cambio.getValor());
                pob.setIdOrcamentoProdutoOrcamento(0);
                pob.setApagar(false);
                pob.setVisto(false);
                pob.setSeguro(false);
                pob.setTipo("A");
                pob.setNovo(true);
                listaProdutoOrcamentoBean.add(pob);
            }
            carregarModelOrcamentoProduto();
            calcularValorTotalOrcamento();
        }
    }

    @Override
    public void setValorJuros(Float valorJuros) {
        valorJurosjTextField.setText(Formatacao.formatarFloatString(valorJuros));
        valorJurosjTextField.requestFocus();
    }

    @Override
    public void setOrcamentoCurso(Orcamentocurso orcamentoCurso) {
        if (orcamentoCurso!=null){
            this.orcamentoCurso = orcamentoCurso;
            carregarOrcamentoCurso();
        }
    }
    
    public void verificarDadosAlterado() {
        dadosAlterado="";
        historicocursos = new Historicocursos(); 
        itensalteradoscurso = new Itensalteradoscurso();
        if (curso.getIndiomaEstudar() != null) {
            if (!curso.getIndiomaEstudar().equalsIgnoreCase(cursoAlterado.getIndiomaEstudar())) {
                dadosAlterado = "Idioma que irá Estudar : " + curso.getIndiomaEstudar() + " | " + cursoAlterado.getIndiomaEstudar() + "<br></br>";
            }
        } 
        if (curso.getNivelIdioma() != null) {
            if (!curso.getNivelIdioma().equalsIgnoreCase(cursoAlterado.getNivelIdioma())) {
                dadosAlterado = dadosAlterado + "Nível Conhecimento : " + curso.getNivelIdioma() + " | " + cursoAlterado.getNivelIdioma() + "<br></br>";
            }
        }
        if (curso.getNomeCurso() != null) {
            if (!curso.getNomeCurso().equalsIgnoreCase(cursoAlterado.getNomeCurso())) {
                dadosAlterado = dadosAlterado + "Curso : " + curso.getNomeCurso() + " | " + cursoAlterado.getNomeCurso() + "<br></br>";
                anterior = cursoAlterado.getNomeCurso();
                atual = curso.getNomeCurso();
                campo = "Nome do curso";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (fornecedorCidade.getIdfornecedorcidade() != fornecedorCidadeAlterado.getIdfornecedorcidade()) {
            dadosAlterado = dadosAlterado + "Fornecedor : " + fornecedorCidade.getCidade().getNome()+ " | " + fornecedorCidadeAlterado.getFornecedor().getNome() + "<br></br>";
            anterior = fornecedorCidade.getCidade().getNome();
            atual = fornecedorCidadeAlterado.getCidade().getNome();
            campo = "Fornecedor/Cidade";
            salvarAlteracoes(anterior, atual, campo);
        }
        if (curso.getDataInicio() != null) {
            if (!curso.getDataInicio().equals(cursoAlterado.getDataInicio())) {
                dadosAlterado = dadosAlterado + "Data Início : " + Formatacao.ConvercaoDataPadrao(curso.getDataInicio()) + " | " + Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataInicio()) + "<br></br>";
                anterior = Formatacao.ConvercaoDataPadrao(curso.getDataInicio());
                atual = Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataInicio());
                campo = "Data de Inicio do curso";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getNumeroSenamas() != null) {
            if (curso.getNumeroSenamas() != cursoAlterado.getNumeroSenamas()) {
                dadosAlterado = dadosAlterado + "Nº Semanas : " + String.valueOf(curso.getNumeroSenamas()) + " | " + String.valueOf(cursoAlterado.getNumeroSenamas()) + "<br></br>";
                anterior = "" + curso.getNumeroSenamas();
                atual = "" + cursoAlterado.getNumeroSenamas();
                campo = "Numero de semanas do curso";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getDataTermino() != null) {
            if (!curso.getDataTermino().equals(cursoAlterado.getDataTermino())) {
                dadosAlterado = dadosAlterado + "Data Término : " + Formatacao.ConvercaoDataPadrao(curso.getDataTermino()) + " | " + Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataTermino()) + "<br></br>";
                anterior = Formatacao.ConvercaoDataPadrao(curso.getDataTermino());
                atual = Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataTermino());
                campo = "Data Término do curso";
            }
        }
        if (curso.getTipoDuracao() != null) {
            if (!curso.getTipoDuracao().equalsIgnoreCase(cursoAlterado.getTipoDuracao())) {
                dadosAlterado = dadosAlterado + "Tipo Carga Horária : " + curso.getTipoDuracao() + " | " + cursoAlterado.getTipoDuracao() + "<br></br>";
                anterior = cursoAlterado.getTipoDuracao();
                atual = curso.getTipoDuracao();
                campo = "Tipo de Duração";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getAulassemana() != null) {
            if (!curso.getAulassemana().equals(cursoAlterado.getAulassemana())) {
                dadosAlterado = dadosAlterado + "Carga Horária : " + curso.getAulassemana() + " | " + cursoAlterado.getAulassemana() + "<br></br>";
                anterior = "" + cursoAlterado.getAulassemana();
                atual = "" + curso.getAulassemana();
                campo = "Aulas por semana";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getTipoAcomodacao() != null) {
            if (!curso.getTipoAcomodacao().equalsIgnoreCase(cursoAlterado.getTipoAcomodacao())) {
                dadosAlterado = dadosAlterado + "Tipo Acomodação: " + curso.getTipoAcomodacao() + " | " + cursoAlterado.getTipoAcomodacao() + "<br></br>";
                anterior = cursoAlterado.getTipoAcomodacao();
                atual = curso.getTipoAcomodacao();
                campo = "Tipo de Acomodação";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getNumeroSemanasAcamodacao() != null) {
            if (curso.getNumeroSemanasAcamodacao()!= cursoAlterado.getNumeroSemanasAcamodacao()) {
                dadosAlterado = dadosAlterado + "Nº Semanas Acomodação : " + String.valueOf(curso.getNumeroSemanasAcamodacao()) + " | " + String.valueOf(cursoAlterado.getNumeroSemanasAcamodacao()) + "<br></br>";
                anterior = "" + cursoAlterado.getNumeroSemanasAcamodacao();
                atual = "" + curso.getNumeroSemanasAcamodacao();
                campo = "N° Semana de Acomodação";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getTipoQuarto() != null) {
            if (!curso.getTipoQuarto().equalsIgnoreCase(cursoAlterado.getTipoQuarto())) {
                dadosAlterado = dadosAlterado + "Quarto : " + curso.getTipoQuarto() + " | " + cursoAlterado.getTipoQuarto() + "<br></br>";
                anterior = cursoAlterado.getTipoQuarto();
                atual = curso.getTipoQuarto();
                campo = "Tipo de Quarto";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getRefeicoes() != null) {
            if (!curso.getRefeicoes().equalsIgnoreCase(cursoAlterado.getRefeicoes())) {
                dadosAlterado = dadosAlterado + "Refeição : " + curso.getRefeicoes() + " | " + cursoAlterado.getRefeicoes() + "<br></br>";
                anterior = cursoAlterado.getRefeicoes();
                atual = curso.getRefeicoes();
                campo = "Refeições";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getDataChegada() != null) {
            if (!curso.getDataChegada().equals(cursoAlterado.getDataChegada())) {
                dadosAlterado = dadosAlterado + "Data Chegada : " + Formatacao.ConvercaoDataPadrao(curso.getDataChegada()) + " | " + Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataChegada()) + "<br></br>";
                anterior = Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataChegada());
                atual = Formatacao.ConvercaoDataPadrao(curso.getDataChegada());
                campo = "Data chegada de acomodação";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getDataSaida() != null) {
            if (!curso.getDataSaida().equals(cursoAlterado.getDataSaida())) {
                dadosAlterado = dadosAlterado + "Data Partida : " + Formatacao.ConvercaoDataPadrao(curso.getDataSaida()) + " |  " + Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataSaida()) + "<br></br>";
                anterior = Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataSaida());
                atual = Formatacao.ConvercaoDataPadrao(curso.getDataSaida());
                campo = "Data Saida de acomodação";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getAdicionais() != null) {
            if (!curso.getAdicionais().equalsIgnoreCase(cursoAlterado.getAdicionais())) {
                dadosAlterado = dadosAlterado + "Adicionais :  " + curso.getAdicionais() + " | " + cursoAlterado.getAdicionais() + "<br></br>";
                anterior = cursoAlterado.getAdicionais();
                atual = curso.getAdicionais();
                campo = "Adicionais";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getFamiliacomCrianca() != null) {
            if (!curso.getFamiliacomCrianca().equalsIgnoreCase(cursoAlterado.getFamiliacomCrianca())) {
                dadosAlterado = dadosAlterado + "Prefere familia com criança : " + curso.getFamiliacomCrianca() + " | " + cursoAlterado.getFamiliacomCrianca() + "<br></br>";
                anterior = cursoAlterado.getFamiliacomCrianca();
                atual = curso.getFamiliacomCrianca();
                campo = "Familia Com Criança";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getFamiliacomAnimais() != null) {
            if (!curso.getFamiliacomAnimais().equalsIgnoreCase(cursoAlterado.getFamiliacomAnimais())) {
                dadosAlterado = dadosAlterado + "Com animais de estimação : " + curso.getFamiliacomAnimais() + " | " + cursoAlterado.getFamiliacomAnimais() + "<br></br>";
                anterior = cursoAlterado.getFamiliacomAnimais();
                atual = curso.getFamiliacomAnimais();
                campo = "Familia com Animais";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getFumante() != null) {
            if (!curso.getFumante().equalsIgnoreCase(cursoAlterado.getFumante())) {
                dadosAlterado = dadosAlterado + "Você é fumante : " + curso.getFumante() + " | " + cursoAlterado.getFumante() + "<br></br>";
                anterior = cursoAlterado.getFumante();
                atual = curso.getFumante();
                campo = "Fumante";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getVegetariano() != null) {
            if (!curso.getVegetariano().equalsIgnoreCase(cursoAlterado.getVegetariano())) {
                dadosAlterado = dadosAlterado + "Você é vegetariano : " + curso.getVegetariano() + " | " + cursoAlterado.getVegetariano() + "<br></br>";
                anterior = cursoAlterado.getVegetariano();
                atual = curso.getVegetariano();
                campo = "Vegetariano";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getHobbies() != null) {
            if (!curso.getHobbies().equalsIgnoreCase(cursoAlterado.getHobbies())) {
                dadosAlterado = dadosAlterado + "Quais seus interesses e  hobbies : " + curso.getHobbies() + " | " + cursoAlterado.getHobbies() + "<br></br>";
                anterior = cursoAlterado.getHobbies();
                atual = curso.getHobbies();
                campo = "Hobbies";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getPossuiAlergia() != null) {
            if (!curso.getPossuiAlergia().equalsIgnoreCase(cursoAlterado.getPossuiAlergia())) {
                dadosAlterado = dadosAlterado + "Tem alergia a algum medicamento ou alimento? Se sim, especifique  : " + curso.getPossuiAlergia() + " | " + cursoAlterado.getPossuiAlergia() + "<br></br>";
                anterior = cursoAlterado.getHobbies();
                atual = curso.getHobbies();
                campo = "Hobbies";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getSolicitacoesEspeciais() != null) {
            if (!curso.getSolicitacoesEspeciais().equalsIgnoreCase(cursoAlterado.getSolicitacoesEspeciais())) {
                dadosAlterado = dadosAlterado + "Solicitações Especiais : " + curso.getSolicitacoesEspeciais() + " | " + cursoAlterado.getSolicitacoesEspeciais() + "<br></br>";
                anterior = cursoAlterado.getSolicitacoesEspeciais();
                atual = curso.getSolicitacoesEspeciais();
                campo = "Solicitações Especiais";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getTransferin() != null) {
            if (!curso.getTransferin().equalsIgnoreCase(cursoAlterado.getTransferin())) {
                dadosAlterado = dadosAlterado + "Transfer in (Chegada) : " + curso.getTransferin() + " | " + cursoAlterado.getTransferin() + "<br></br>";
                anterior = cursoAlterado.getTransferin();
                atual = curso.getTransferin();
                campo = "Transfer in";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getTransferouto() != null) {
            if (!curso.getTransferouto().equalsIgnoreCase(cursoAlterado.getTransferouto())) {
                dadosAlterado = dadosAlterado + "Transfer out (Partida) : " + curso.getTransferouto() + " | " + cursoAlterado.getTransferouto() + "<br></br>";
                anterior = cursoAlterado.getTransferouto();
                atual = curso.getTransferouto();
                campo = "Transfer out";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        if (curso.getPassagemAerea() != null) {
            if (!curso.getPassagemAerea().equalsIgnoreCase(cursoAlterado.getPassagemAerea())) {
                dadosAlterado = dadosAlterado + "Passagem Aérea quando não inclusa no programa : " + curso.getPassagemAerea() + " | " + cursoAlterado.getPassagemAerea() + "<br></br>";
            }
        }
        if (curso.getObservacaoPassagemAerea() != null) {
            if (!curso.getObservacaoPassagemAerea().equalsIgnoreCase(cursoAlterado.getObservacaoPassagemAerea())) {
                dadosAlterado = dadosAlterado + "Observação Passagem : " + curso.getObservacaoPassagemAerea() + " | " + cursoAlterado.getObservacaoPassagemAerea() + "<br></br>";
            }
        }
          if (!seguroViagem.getPossuiSeguro().equalsIgnoreCase(seguroViagemAlterado.getPossuiSeguro())) {
                dadosAlterado = dadosAlterado + "Seguro Viagem : " + seguroViagem.getPossuiSeguro() + " | " + seguroViagemAlterado.getPossuiSeguro() + "<br></br>";
                anterior = seguroViagemAlterado.getPossuiSeguro();
                atual = seguroViagem.getPossuiSeguro();
                campo = "Possui seguro";
                salvarAlteracoes(anterior, atual, campo);
            }
       
            if (seguroViagem.getSeguradora() != null) {
                if (!seguroViagem.getSeguradora().equalsIgnoreCase(seguroViagemAlterado.getSeguradora())) {
                    dadosAlterado = dadosAlterado + "Fornecedor Seguro : " + seguroViagem.getSeguradora() + " | " + seguroViagemAlterado.getSeguradora() + "<br></br>";
                    anterior = seguroViagemAlterado.getSeguradora();
                    atual = seguroViagem.getSeguradora();
                    campo = "Seguradora";
                    salvarAlteracoes(anterior, atual, campo);
                }
            }
            if (seguroViagem.getValorSeguro() != null) {
                if (seguroViagem.getValorSeguro() != seguroViagemAlterado.getValorSeguro()) {
                    dadosAlterado = dadosAlterado + "Valor Seguro : " + Formatacao.formatarFloatString(seguroViagem.getValorSeguro()) + Formatacao.formatarFloatString(seguroViagemAlterado.getValorSeguro()) + "<br></br>";
                }
            }
            if (seguroViagem.getPlano() != null) {
                if (!seguroViagem.getPlano().equalsIgnoreCase(seguroViagemAlterado.getPlano())) {
                    dadosAlterado = dadosAlterado + "Plano : " + seguroViagem.getPlano() + " | " + seguroViagemAlterado.getPlano() + "<br></br>";
                    anterior = seguroViagemAlterado.getPlano();
                    atual = seguroViagem.getPlano();
                    campo = "Plano de seguro";
                    salvarAlteracoes(anterior, atual, campo);
                }
            }
            if (seguroViagem.getDataInicio() != null) {
                if (!seguroViagem.getDataInicio().equals(seguroViagemAlterado.getDataInicio())) {
                    dadosAlterado = dadosAlterado + "Data Início : " + seguroViagem.getDataInicio() + " | " + seguroViagemAlterado.getDataInicio() + "<br></br>";
                    anterior = Formatacao.ConvercaoDataPadrao(seguroViagemAlterado.getDataInicio());
                    atual = Formatacao.ConvercaoDataPadrao(seguroViagem.getDataInicio());
                    campo = "Data inicio do seguro";
                    salvarAlteracoes(anterior, atual, campo);
                }
            }
            if (seguroViagem.getNumeroSemanas() != null) {
                if (seguroViagem.getNumeroSemanas() != seguroViagemAlterado.getNumeroSemanas()) {
                    dadosAlterado = dadosAlterado + "No. Semanas : " + String.valueOf(seguroViagem.getNumeroSemanas()) + " | " + String.valueOf(seguroViagemAlterado.getNumeroSemanas()) + "<br></br>";
                    anterior = "" + seguroViagemAlterado.getNumeroSemanas();
                    atual = "" + seguroViagem.getNumeroSemanas();
                    campo = "N° de semanas do seguro";
                    salvarAlteracoes(anterior, atual, campo);
                }
            }
            if (seguroViagem.getDataTermino() != null) {
                if (!seguroViagem.getDataTermino().equals(seguroViagemAlterado.getDataTermino())) {
                    dadosAlterado = dadosAlterado + "Data Término : " + Formatacao.ConvercaoDataPadrao(seguroViagem.getDataTermino()) + "| " + Formatacao.ConvercaoDataPadrao(seguroViagemAlterado.getDataTermino()) + "<br></br>";
                    anterior = Formatacao.ConvercaoDataPadrao(seguroViagemAlterado.getDataTermino());
                    atual = Formatacao.ConvercaoDataPadrao(seguroViagem.getDataTermino());
                    campo = "Possui seguro";
                    salvarAlteracoes(anterior, atual, campo);
                }
            }
        if (curso.getVistoConsular() != null) {
            if (!curso.getVistoConsular().equalsIgnoreCase(cursoAlterado.getVistoConsular())) {
                dadosAlterado = dadosAlterado + "Visto Consular : " + curso.getVistoConsular() + " | " + cursoAlterado.getVistoConsular() + "<br></br>";
            }
        }
        if (curso.getDataEntregaDocumentosVistos() != null) {
            if (!curso.getDataEntregaDocumentosVistos().equals(cursoAlterado.getDataEntregaDocumentosVistos())) {
                dadosAlterado = dadosAlterado + "Data Entrega Documentos : " + Formatacao.ConvercaoDataPadrao(curso.getDataEntregaDocumentosVistos()) + " | " + Formatacao.ConvercaoDataPadrao(cursoAlterado.getDataEntregaDocumentosVistos()) + "<br></br>";
            }
        }
        if (curso.getObservacaoVisto() != null) {
            if (!curso.getObservacaoVisto().equalsIgnoreCase(curso.getObservacaoVisto())) {
                dadosAlterado = dadosAlterado + "Observações Visto : " + curso.getObservacaoVisto() + " | " + cursoAlterado.getObservacaoVisto() + "<br></br>";
            }
        }
        if (valorVendaAlterar != venda.getValor()) {
                dadosAlterado = dadosAlterado + "Valor Total : " + Formatacao.formatarFloatString(venda.getValor()) + " | " + Formatacao.formatarFloatString(valorVendaAlterar) + "<br></br>";
        }
        
        if(curso.getNomeContatoEmergencia() != null){
            if (!curso.getNomeContatoEmergencia().equalsIgnoreCase(cursoAlterado.getNomeContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Nome do contato emergêncial no Brasil : " + curso.getNomeContatoEmergencia()+ " | " + cursoAlterado.getNomeContatoEmergencia()+ "<br></br>";
                anterior = cursoAlterado.getNomeContatoEmergencia();
                atual = curso.getNomeContatoEmergencia();
                campo = "Nome do contato emergêncial no Brasil";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        
        if(curso.getEmalContatoEmergencia()!= null){
            if (!curso.getEmalContatoEmergencia().equalsIgnoreCase(cursoAlterado.getEmalContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "E-mail do contato emergêncial no Brasil : " + curso.getEmalContatoEmergencia()+ " | " + cursoAlterado.getEmalContatoEmergencia()+ "<br></br>";
                anterior = cursoAlterado.getEmalContatoEmergencia();
                atual = curso.getEmalContatoEmergencia();
                campo = "E-mail do contato emergêncial no Brasil";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
            
        if(curso.getRelacaoContatoEmergencia()!= null){
            if (!curso.getNomeContatoEmergencia().equalsIgnoreCase(cursoAlterado.getRelacaoContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Relação do contato emergêncial no Brasil : " + curso.getRelacaoContatoEmergencia()+ " | " + cursoAlterado.getRelacaoContatoEmergencia()+ "<br></br>";
                anterior = cursoAlterado.getRelacaoContatoEmergencia();
                atual = curso.getRelacaoContatoEmergencia();
                campo = "Relação do contato emergêncial no Brasil";
                salvarAlteracoes(anterior, atual, campo);
            }
        }
        
    }
    
    public void salvarAlteracoes(String anterior, String atual, String campo){
        HistoricoCursosController historicoCursosController = new HistoricoCursosController();
        ItensAlteradosCursosController itensAlteradosCursosController = new ItensAlteradosCursosController();
        historicocursos.setData(new Date());
        historicocursos.setVendas(venda);
        Historicocursos historico = historicoCursosController.salvar(historicocursos);
        itensalteradoscurso.setAnterior(anterior);
        itensalteradoscurso.setAtual(atual);
        itensalteradoscurso.setCampo(campo);
        itensalteradoscurso.setHistoricocursos(historico);
        itensAlteradosCursosController.salvar(itensalteradoscurso);
    }
    
    public void limitarJText() {
        cidadejTextField.setDocument(new LimiteTextoJedit(50));
        cursojTextField.setDocument(new LimiteTextoJedit(100));
        scursojTextField.setDocument(new LimiteTextoJedit(100));
        adicionaisAcomodacaojTextField.setDocument(new LimiteTextoJedit(100));
        hobbiesjTextField.setDocument(new LimiteTextoJedit(200));
        quaisAlergiajTextField.setDocument(new LimiteTextoJedit(200));
        solicitacoesEspeciaisjTextField.setDocument(new LimiteTextoJedit(100));
        numeroCartaoVTMjTextField.setDocument(new LimiteTextoJedit(45));
        observacaoVistojTextField.setDocument(new LimiteTextoJedit(200));
        planosegurojTextField.setDocument(new LimiteTextoJedit(50));
        seguradoraGovernamentaljTextField.setDocument(new LimiteTextoJedit(100));
        nomeContatoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
        telefoneEmergenciajTextField.setDocument(new LimiteTextoJedit(14));
        emailConatoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
        relacaoEmergenciajTextField.setDocument(new LimiteTextoJedit(50));
    }
    
    public String validarFormaPagamento(){
        String msg = "";
        if (dataVencimentojDateChooser.getDate()==null){
            msg = msg + "Data primeiro vencimento obrigatória";
        }
        if (meioPagamentojComboBox.getSelectedItem().toString().equalsIgnoreCase("Selecione")){
            msg = msg + "Campo forma de pagamento obrigatório";
        }
        return msg;
    }
    
    public void atualizarValoresProduto(){
        if (listaProdutoOrcamentoBean!=null){
            for(int i=0;i<listaProdutoOrcamentoBean.size();i++){
                if (listaProdutoOrcamentoBean.get(i).getValorMoedaEstrangeira()>0){
                    listaProdutoOrcamentoBean.get(i).setValorMoedaReal(listaProdutoOrcamentoBean.get(i).getValorMoedaEstrangeira()*valorCambio);
                }
                calcularValorTotalOrcamento();
            }
            carregarModelOrcamentoProduto();
        }
    }
    
    public void calcularComissao(){
        if (fornecedorComissao!=null){
            VendasComissaoController vendasComissaoController = new VendasComissaoController();
            Vendascomissao vendasComissao = vendasComissaoController.getVendaComissao(venda.getIdvendas(), usuarioLogadoBean.getParametrosprodutos().getCursos());
            if (vendasComissao!=null){
                if (vendasComissao.getPaga().equalsIgnoreCase("Não")){
                    ComissaoCursos cc = new ComissaoCursos(usuarioLogadoBean, venda, listaProdutoOrcamentoBean, fornecedorComissao, valorCambio, listaParcelamento, curso.getDataInicio(), curso.getDataInicio(), vendasComissao);
                }
            }
            if (seguroViagemSemjRadioButton.isSelected()) {
                vendasComissao = vendasComissaoController.getVendaComissao(venda.getIdvendas(), usuarioLogadoBean.getParametrosprodutos().getSeguroPrivado());
                if (vendasComissao!=null){
                    if (vendasComissao.getPaga().equalsIgnoreCase("Não")){
                        ComissaoSeguro cs = new ComissaoSeguro(usuarioLogadoBean, venda, seguroViagem, listaParcelamento, seguroViagem.getDataInicio(), 0,0, curso.getDataInicio(), vendasComissao, dataCambio);
                    }
                }
            }
        }    
    }
    
    public boolean excluirComissao(){
        boolean validar = true;
        VendasComissaoController vendasComissaoController = new VendasComissaoController();
        Vendascomissao vendasComissao = vendasComissaoController.getVendaComissao(venda.getIdvendas(), venda.getProdutos());
        if (vendasComissao!=null){
            if (vendasComissao.getPaga().equalsIgnoreCase("Não")){
                vendasComissaoController.excluir(vendasComissao.getIdvendascomissao());
                validar=true;
            }else {
                validar = false;
            }
        }
        return validar;
    }
    
    public boolean excluirContasReceber(){
        ContasReceberController contasReceberCotroller = new ContasReceberController();
        List<Contasreceber> listaContas = contasReceberCotroller.listar(venda.getIdvendas());
        boolean validar=true;
        if (listaContas!=null){
            for(int i=0;i<listaContas.size();i++){
                if (listaContas.get(i).getDatapagamento()!=null){
                    validar=false;
                    i=10000;
                }
            }
            if (validar){
                for(int i=0;i<listaContas.size();i++){
                    contasReceberCotroller.excluir(listaContas.get(i).getIdcontasreceber());
                }
            }
        }
        return validar;
    }
    
    @Override
    public void setValores(Valoresseguro valores) {
        if (valores!=null){
            planosegurojTextField.setText(valores.getPlano());
            seguradorajTextField.setText(valores.getFornecedorcidade().getFornecedor().getNome());
            int numero = Integer.parseInt(numeroSemanaSegurosjTextField.getText());
            valoresSeguro = valores;
            CambioController cambioController = new CambioController();
            Cambio cambioSeguro = cambioController.consultarCambioMoeda(Formatacao.ConvercaoDataSql(dataCambio), valoresSeguro.getMoedas().getIdmoedas());
            valorSeguro = numero * (valores.getValorgross() * cambioSeguro.getValor());
            valorSegurojTextField.setText(Formatacao.formatarFloatString(valorSeguro));
        }
    }
    
    public void carregarCursoAlteracao(){
        cursoAlterado = new Cursos();
        cursoAlterado.setAdicionais(curso.getAdicionais());
        cursoAlterado.setAulassemana(curso.getAulassemana());
        cursoAlterado.setCaratoVTM(curso.getCaratoVTM());
        cursoAlterado.setCidade(curso.getCidade());
        cursoAlterado.setControle(curso.getControle());
        cursoAlterado.setDataChegada(curso.getDataChegada());
        cursoAlterado.setDataEntregaDocumentosVistos(curso.getDataEntregaDocumentosVistos());
        cursoAlterado.setDataInicio(curso.getDataInicio());
        cursoAlterado.setDataInscricao(curso.getDataInscricao());
        cursoAlterado.setDataSaida(curso.getDataSaida());
        cursoAlterado.setDataTermino(curso.getDataTermino());
        cursoAlterado.setEmalContatoEmergencia(curso.getEmalContatoEmergencia());
        cursoAlterado.setEscola(curso.getEscola());
        cursoAlterado.setFamiliacomAnimais(curso.getFamiliacomAnimais());
        cursoAlterado.setFamiliacomCrianca(curso.getFamiliacomCrianca());
        cursoAlterado.setFoneContatoEmergencia(curso.getFoneContatoEmergencia());
        cursoAlterado.setFumante(curso.getFumante());
        cursoAlterado.setHabilitarSegundoCurso(curso.getHabilitarSegundoCurso());
        cursoAlterado.setHobbies(curso.getHobbies());
        cursoAlterado.setIdcursos(curso.getIdcursos());
        cursoAlterado.setIdioma(curso.getIdioma());
        cursoAlterado.setIndiomaEstudar(curso.getIndiomaEstudar());
        cursoAlterado.setMoedaCartaoVTM(curso.getMoedaCartaoVTM());
        cursoAlterado.setNivelIdioma(curso.getNivelIdioma());
        cursoAlterado.setNivelIdiomaEstudar(curso.getNivelIdiomaEstudar());
        cursoAlterado.setNomeContatoEmergencia(curso.getNomeContatoEmergencia());
        cursoAlterado.setNomeCurso(curso.getNomeCurso());
        cursoAlterado.setNumeroCartaoVTM(curso.getNumeroCartaoVTM());
        cursoAlterado.setNumeroMeses(curso.getNumeroMeses());
        cursoAlterado.setNumeroSemanasAcamodacao(curso.getNumeroSemanasAcamodacao());
        cursoAlterado.setNumeroSenamas(curso.getNumeroSenamas());
        cursoAlterado.setObservacaoPassagemAerea(curso.getObservacaoPassagemAerea());
        cursoAlterado.setObservacaoVisto(curso.getObservacaoVisto());
        cursoAlterado.setPais(curso.getPais());
        cursoAlterado.setPassagemAerea(curso.getPassagemAerea());
        cursoAlterado.setPossuiAlergia(curso.getPossuiAlergia());
        cursoAlterado.setPossuiSeguroGovernamental(curso.getPossuiSeguroGovernamental());
        cursoAlterado.setQuaisAlergias(curso.getQuaisAlergias());
        cursoAlterado.setRefeicoes(curso.getRefeicoes());
        cursoAlterado.setRelacaoContatoEmergencia(curso.getRelacaoContatoEmergencia());
        cursoAlterado.setSeguradoraGovernamental(curso.getSeguradoraGovernamental());
        cursoAlterado.setSolicitacoesEspeciais(curso.getSolicitacoesEspeciais());
        cursoAlterado.setTipoAcomodacao(curso.getTipoAcomodacao());
        cursoAlterado.setTipoDuracao(curso.getTipoDuracao());
        cursoAlterado.setTipoQuarto(curso.getTipoQuarto());
        cursoAlterado.setTransferin(curso.getTransferin());
        cursoAlterado.setTransferouto(curso.getTransferouto());
        cursoAlterado.setTransferouto(curso.getTransferouto());
        cursoAlterado.setsTipoCargaHoraria(curso.getsTipoCargaHoraria());
        cursoAlterado.setValorSeguroGovernamental(curso.getValorSeguroGovernamental());
        cursoAlterado.setVegetariano(curso.getVegetariano());
        cursoAlterado.setVendas(curso.getVendas());
        cursoAlterado.setVistoConsular(curso.getVistoConsular());
        cursoAlterado.setsCargaHoraria(curso.getsCargaHoraria());
        cursoAlterado.setsCurso(curso.getsCurso());
        cursoAlterado.setsDataInicio(curso.getsDataInicio());
        cursoAlterado.setsDataTermino(curso.getsDataTermino());
        cursoAlterado.setsNumeroSemanas(curso.getsNumeroSemanas());
    }

}