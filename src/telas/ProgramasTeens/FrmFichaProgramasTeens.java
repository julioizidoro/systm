/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProgramasTeens;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.CambioController;
import controller.ClienteController;
import controller.ContasReceberController;
import controller.FollowupController;
import controller.FormaPagamentoController;
import controller.InvoicesController;
import controller.OrcamentoController;
import controller.ParcelamentoPagamentoController;
import controller.ProdutoOrcamentoController;
import controller.ProdutoRemessaController;
import controller.ProgramasTeensController;
import controller.VendasComissaoController;
import controller.VendasController;
import controller.VistosController;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Acesso;
import model.Cambio;
import model.Cliente;
import model.Contasreceber;
import model.Controleprogramasteens;
import model.Formapagamento;
import model.Fornecedor;
import model.Invoices;
import model.Moedas;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Parcelamentopagamento;
import model.Produtoremessa;
import model.Produtos;
import model.Produtosorcamento;
import model.Programasteens;
import model.Seguroviagem;
import model.Valoresprogramasteens;
import model.Vendas;
import model.Vendascomissao;
import model.Vistos;
import model.view.Viewprodutosfiltro;
import telas.Cliente.FrmConsultaCliente;
import telas.Comissao.ComissaoProgramasTeens;
import telas.Cursos.ConsultaParcelamentoPagamentoTableModel;
import telas.ProgramasTeens.Valores.FrmConsultaValoresProgramasTeens;
import telas.Usuarios.UsuarioLogadoBean;
import telas.cambio.FrmAlterarValorCambio;
import util.ContasReceberBean;
import util.EnviarEmailBean;
import util.Formatacao;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmFichaProgramasTeens extends javax.swing.JFrame implements IProgramasTeens {

    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Vendas venda;
    private Vendas vendaAlterada;
    private Formapagamento formaPagamento;
    private Produtos produto;
    private Cliente cliente;
    private Orcamento orcamento;
    private Seguroviagem seguroViagem;
    private Seguroviagem seguroViagemAlterado;
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoBean;
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoApagarBean;
    private Programasteens programasTeens;
    private Programasteens programasTeensAlterado;
    private UsuarioLogadoBean usuarioLogadoBean;
    private OrcamentoProdutoTableModel modelOrcamentoProduto;
    private String cambioAlterado = "Não";
    private float valorVistos = 0;
    private float valorCambio = 0;
    private float subTotal = 0;
    private float valorTotal = 0;
    private float valorJuros = 0;
    private float totalPagar = 0;
    private float valorEntrada = 0;
    private float valorParcelar = 0;
    private float valorParcela = 0;
    private float totalMoedaEstrangeira = 0;
    private float totalMoedaReal = 0;
    private Vistos vistos;
    private Cambio cambio;
    private boolean consultaCambio = false;
    private IConsultaProgramasTeens telaConsulta;
    private Date dataCambio;
    private ConsultaParcelamentoPagamentoTableModel modelParcelamento;
    private List<Parcelamentopagamento> listaParcelamento;
    private boolean novaFicha;
    private String caracteres = "0987654321-()";
    private String situacao = "PROCESSO";
    private Valoresprogramasteens valores;
    private float valorVendaAlterar=0.0f;
    private String dadosAlterado;

    /**
     * Creates new form FrmFichaCursos
     */
    public FrmFichaProgramasTeens(int idVenda, UsuarioLogadoBean usuarioLogado, IConsultaProgramasTeens telaConsulta, Date dataCambio) {
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
        seguroViagembuttonGroup = new javax.swing.ButtonGroup();
        jLabel66 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cursosjTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        nomeClientejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cursojTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        escolajTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        paisjTextField = new javax.swing.JTextField();
        dataIniciojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    jLabel10 = new javax.swing.JLabel();
    dataTerminojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel11 = new javax.swing.JLabel();
cidadejTextField = new javax.swing.JTextField();
aulasSemanajTextField = new javax.swing.JTextField();
jLabel9 = new javax.swing.JLabel();
numeroSemanasjTextField = new javax.swing.JTextField();
tipoProgramajComboBox = new javax.swing.JComboBox();
jLabel2 = new javax.swing.JLabel();
jButton4 = new javax.swing.JButton();
jLabel16 = new javax.swing.JLabel();
jPanel20 = new javax.swing.JPanel();
jLabel51 = new javax.swing.JLabel();
nomeContatoEmergenciajTextField = new javax.swing.JTextField();
jLabel69 = new javax.swing.JLabel();
emailConatoEmergenciajTextField = new javax.swing.JTextField();
jLabel71 = new javax.swing.JLabel();
relacaoEmergenciajTextField = new javax.swing.JTextField();
telefoneEmergenciajCheckBox = new javax.swing.JCheckBox();
telefoneContatoEmergenciajTextField = new javax.swing.JTextField();
jPanel3 = new javax.swing.JPanel();
jPanel21 = new javax.swing.JPanel();
vistoTravelMatejCheckBox = new javax.swing.JCheckBox();
vistoClientejCheckBox = new javax.swing.JCheckBox();
jLabel72 = new javax.swing.JLabel();
dataEntregaVistojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel73 = new javax.swing.JLabel();
    observacaoVistojTextField = new javax.swing.JTextField();
    valorVistojTextField = new javax.swing.JTextField();
    jLabel74 = new javax.swing.JLabel();
    jPanel22 = new javax.swing.JPanel();
    jLabel12 = new javax.swing.JLabel();
    tipoAcomodacaojComboBox = new javax.swing.JComboBox();
    jLabel15 = new javax.swing.JLabel();
    refeicaojComboBox = new javax.swing.JComboBox();
    dataChegadaAcomodacaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel17 = new javax.swing.JLabel();
tipoQuartojComboBox = new javax.swing.JComboBox();
jLabel14 = new javax.swing.JLabel();
jLabel13 = new javax.swing.JLabel();
numeroSemanasAcomodacaojTextField = new javax.swing.JTextField();
dataPartidaAcomodacaojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel18 = new javax.swing.JLabel();
    jPanel25 = new javax.swing.JPanel();
    jLabel19 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();
    jLabel22 = new javax.swing.JLabel();
    dataNascimentoMaejDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
rgMaejTextField = new javax.swing.JTextField();
jLabel23 = new javax.swing.JLabel();
cpfMaejFormattedTextField = new javax.swing.JFormattedTextField();
jLabel24 = new javax.swing.JLabel();
cpfPaijFormattedTextField = new javax.swing.JFormattedTextField();
rgPaijTextField = new javax.swing.JTextField();
dataNascimentoPaijDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
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
    jPanel23 = new javax.swing.JPanel();
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
jPanel24 = new javax.swing.JPanel();
jButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton();
jScrollPane2 = new javax.swing.JScrollPane();
parcelamentojTable = new javax.swing.JTable();
jPanel4 = new javax.swing.JPanel();
jScrollPane3 = new javax.swing.JScrollPane();
observacoesjTextArea = new javax.swing.JTextArea();
jPanel19 = new javax.swing.JPanel();
jScrollPane4 = new javax.swing.JScrollPane();
obsTMjTextArea = new javax.swing.JTextArea();
jLabel32 = new javax.swing.JLabel();
jPanel17 = new javax.swing.JPanel();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton();

jLabel66.setText("jLabel66");

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Ficha de Programas Teens");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

cursosjTabbedPane.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        cursosjTabbedPaneMouseClicked(evt);
    }
    });
    cursosjTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
        public void stateChanged(javax.swing.event.ChangeEvent evt) {
            cursosjTabbedPaneStateChanged(evt);
        }
    });

    jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    nomeClientejTextField.setEditable(false);

    jLabel1.setText("Selecionar Cliente");

    jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton1.setText("Selecionar");
    jButton1.setToolTipText("Selecionar Cliente");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jLabel5.setText("Curso");

    jLabel4.setText("Selecionar Escola / Instituição");

    escolajTextField.setEditable(false);

    jLabel6.setText("Cidade");

    jLabel7.setText("País");

    paisjTextField.setEditable(false);

    dataIniciojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataIniciojDateChooserFocusGained(evt);
        }
    });

    jLabel10.setText("Data Início");

    dataTerminojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataTerminojDateChooserFocusGained(evt);
        }
        public void focusLost(java.awt.event.FocusEvent evt) {
            dataTerminojDateChooserFocusLost(evt);
        }
    });

    jLabel11.setText("Aulas por Semana");

    cidadejTextField.setEditable(false);

    aulasSemanajTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    aulasSemanajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            aulasSemanajTextFieldKeyTyped(evt);
        }
    });

    jLabel9.setText("N°  Semanas (Somente Números)");

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
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroSemanasjTextFieldKeyTyped(evt);
        }
    });

    tipoProgramajComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Winter", "Summer", "Outros" }));

    jLabel2.setText("Tipo Programa");

    jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton4.setText("Selecionar");
    jButton4.setToolTipText("Selecionar Escola");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    jLabel16.setText("Data Término");

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)
                                    .addComponent(paisjTextField))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(nomeClientejTextField)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(2, 2, 2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(217, 217, 217)
                                    .addComponent(jLabel7))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(numeroSemanasjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(aulasSemanajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tipoProgramajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(0, 0, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(cursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(50, 50, 50))
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(escolajTextField)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addComponent(jLabel1)
            .addGap(6, 6, 6)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1))
            .addGap(5, 5, 5)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tipoProgramajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(7, 7, 7)
            .addComponent(jLabel4)
            .addGap(4, 4, 4)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(escolajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton4))
            .addGap(7, 7, 7)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6)
                .addComponent(jLabel7))
            .addGap(6, 6, 6)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(paisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel16)))
            .addGap(6, 6, 6)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dataIniciojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(numeroSemanasjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dataTerminojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(aulasSemanajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato de Emergência no Brasil"));

    jLabel51.setText("Nome");

    jLabel69.setText("E-mail");

    jLabel71.setText("Relação");

    telefoneEmergenciajCheckBox.setText("9-Telefone");
    telefoneEmergenciajCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            telefoneEmergenciajCheckBoxItemStateChanged(evt);
        }
    });

    telefoneContatoEmergenciajTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            telefoneContatoEmergenciajTextFieldFocusLost(evt);
        }
    });
    telefoneContatoEmergenciajTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyPressed(java.awt.event.KeyEvent evt) {
            telefoneContatoEmergenciajTextFieldKeyPressed(evt);
        }
        public void keyReleased(java.awt.event.KeyEvent evt) {
            telefoneContatoEmergenciajTextFieldKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            telefoneContatoEmergenciajTextFieldKeyTyped(evt);
        }
    });

    javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
    jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addComponent(emailConatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(relacaoEmergenciajTextField))
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeContatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel69)
                        .addComponent(jLabel51))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71)
                                .addComponent(telefoneEmergenciajCheckBox))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(telefoneContatoEmergenciajTextField))))
            .addContainerGap())
    );
    jPanel20Layout.setVerticalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addComponent(jLabel51)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nomeContatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addComponent(telefoneEmergenciajCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(telefoneContatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel69)
                .addComponent(jLabel71))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailConatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(relacaoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(19, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(77, 77, 77))
    );

    cursosjTabbedPane.addTab("Curso", jPanel2);

    jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitação de Visto Consular"));

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

    jLabel72.setText("Data Entrega Documentos");

    dataEntregaVistojDateChooser.setEnabled(false);
    dataEntregaVistojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataEntregaVistojDateChooserFocusGained(evt);
        }
    });

    jLabel73.setText("Observação");

    valorVistojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorVistojTextField.setEnabled(false);
    valorVistojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorVistojTextFieldFocusLost(evt);
        }
    });
    valorVistojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorVistojTextFieldKeyTyped(evt);
        }
    });

    jLabel74.setText("Valor do Visto");

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dataEntregaVistojDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel74)
                        .addComponent(valorVistojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(observacaoVistojTextField)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel73)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addComponent(vistoTravelMatejCheckBox)
                    .addGap(18, 18, 18)
                    .addComponent(vistoClientejCheckBox)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(vistoTravelMatejCheckBox)
                .addComponent(vistoClientejCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel73, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72)
                    .addComponent(jLabel74)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dataEntregaVistojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(observacaoVistojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorVistojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
    );

    jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Acomodação"));

    jLabel12.setText("Tipo Acomodação");

    tipoAcomodacaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem acomodação", "Casa de Família", "Residência", "Alojamento", "Studio", "Outro" }));

    jLabel15.setText("Refeição");

    refeicaojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sem Refeição", "Café da Manhã", "Meia Pensão (2 Refeições)", "Pensão Completa (3 Refeições)" }));

    dataChegadaAcomodacaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataChegadaAcomodacaojDateChooserFocusGained(evt);
        }
    });

    jLabel17.setText("Data Chegada");

    tipoQuartojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Quarto Individual", "Quarto Duplo", "Quarto Triplo", "Compartilhado" }));

    jLabel14.setText("Quarto");

    jLabel13.setText("N°  Semanas (Somente Números)");

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

    dataPartidaAcomodacaojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataPartidaAcomodacaojDateChooserFocusGained(evt);
        }
    });

    jLabel18.setText("Data Partida");

    javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
    jPanel22.setLayout(jPanel22Layout);
    jPanel22Layout.setHorizontalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel22Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(refeicaojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoAcomodacaojComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel15))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dataChegadaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel17))
            .addGap(18, 18, 18)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel14)
                .addComponent(tipoQuartojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13)
                        .addComponent(numeroSemanasAcomodacaojTextField))
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addComponent(jLabel18))
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(dataPartidaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
    );
    jPanel22Layout.setVerticalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel22Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel14)
                .addComponent(jLabel12))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(tipoAcomodacaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(tipoQuartojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel15)
                        .addComponent(jLabel17))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refeicaojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataChegadaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dataPartidaAcomodacaojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(numeroSemanasAcomodacaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações Pais"));

    jLabel19.setText("Nº CPF Pai");

    jLabel20.setText("Nº RG Pai");

    jLabel21.setText("Data Nascimento Pai");

    jLabel22.setText("Data Nascimento Mãe");

    dataNascimentoMaejDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataNascimentoMaejDateChooserFocusGained(evt);
        }
    });

    jLabel23.setText("Nº RG Mãei");

    jLabel24.setText("Nº CPF Mãe");

    dataNascimentoPaijDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataNascimentoPaijDateChooserFocusGained(evt);
        }
    });

    javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
    jPanel25.setLayout(jPanel25Layout);
    jPanel25Layout.setHorizontalGroup(
        jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel25Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                    .addGap(186, 186, 186)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel20)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel23))
                        .addComponent(rgPaijTextField)
                        .addComponent(rgMaejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(dataNascimentoMaejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(dataNascimentoPaijDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24)
                        .addComponent(jLabel19)
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cpfMaejFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfPaijFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel25Layout.setVerticalGroup(
        jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel25Layout.createSequentialGroup()
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(jLabel19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cpfPaijFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel25Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataNascimentoPaijDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel24)
                        .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cpfMaejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataNascimentoMaejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addComponent(jLabel20)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rgPaijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel23)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rgMaejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 10, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(37, 37, 37))
    );

    cursosjTabbedPane.addTab("Acomodação / Visto", jPanel3);

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
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(128, 128, 128))
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

    jLabel49.setText("Valor Cambio");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel46)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(produtoOrcaemntojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorProdutosMoedaEstrangeirajTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addComponent(valorProdutosMoedaRealjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(204, 204, 204))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23))
    );

    cursosjTabbedPane.addTab("Produtos", jPanel12);

    jPanel23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

    javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
    jPanel23.setLayout(jPanel23Layout);
    jPanel23Layout.setHorizontalGroup(
        jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel23Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel53))
            .addGap(18, 18, 18)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel54))
            .addGap(18, 18, 18)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel56))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel68)
                        .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel29)
                        .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel30))))
            .addContainerGap())
    );
    jPanel23Layout.setVerticalGroup(
        jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel23Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel53)
                .addComponent(jLabel54)
                .addComponent(jLabel56)
                .addComponent(jLabel64)
                .addComponent(jLabel68))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(jLabel30)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(jLabel29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

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
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorParcelamentojTextFieldFocusLost(evt);
        }
        public void focusGained(java.awt.event.FocusEvent evt) {
            valorParcelamentojTextFieldFocusGained(evt);
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
                    .addGap(59, 59, 59)
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
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorParcelajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
    );
    jPanel16Layout.setVerticalGroup(
        jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel16Layout.createSequentialGroup()
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel62)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(meioPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tipoParcelamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel63)
                                .addComponent(jLabel61))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
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

    jPanel24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

    javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
    jPanel24.setLayout(jPanel24Layout);
    jPanel24Layout.setHorizontalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))
    );
    jPanel24Layout.setVerticalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

    javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
    jPanel15.setLayout(jPanel15Layout);
    jPanel15Layout.setHorizontalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(193, 193, 193))
    );
    jPanel15Layout.setVerticalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(306, 306, 306))
    );

    cursosjTabbedPane.addTab("Forma Pagto", jPanel15);

    observacoesjTextArea.setColumns(20);
    observacoesjTextArea.setRows(5);
    jScrollPane3.setViewportView(observacoesjTextArea);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Obs", jPanel4);

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
                .addComponent(jScrollPane4)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addComponent(jLabel32)
                    .addGap(0, 105, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel32)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Obs TM", jPanel19);

    jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
    jButton5.setText("Confirmar");
    jButton5.setToolTipText("Confirma Cadastro da Ficha de Programas Teens");
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
        .addComponent(cursosjTabbedPane)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(126, 126, 126))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(cursosjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addGap(0, 11, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataTerminojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminojDateChooserFocusGained

    private void dataIniciojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataIniciojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataIniciojDateChooserFocusGained

    private void dataChegadaAcomodacaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataChegadaAcomodacaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataChegadaAcomodacaojDateChooserFocusGained

    private void dataPartidaAcomodacaojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataPartidaAcomodacaojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataPartidaAcomodacaojDateChooserFocusGained

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void numeroSemanasAcomodacaojTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasAcomodacaojTextFieldFocusGained
        if (dataChegadaAcomodacaojDateChooser.getDate() != null) {
            if (dataPartidaAcomodacaojDateChooser.getDate() != null) {
                Integer dias = Formatacao.calcularNumeroSemanas(dataChegadaAcomodacaojDateChooser.getDate(), dataPartidaAcomodacaojDateChooser.getDate());
                numeroSemanasAcomodacaojTextField.setText(dias.toString());
            }
        }
    }//GEN-LAST:event_numeroSemanasAcomodacaojTextFieldFocusGained

    private void valorProdutosMoedaEstrangeirajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorProdutosMoedaEstrangeirajTextFieldKeyTyped
        if (evt.getKeyChar() == '.') {
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
        if (evt.getKeyChar() == '.') {
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

    private void numeroSemanasjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldKeyTyped

        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroSemanasjTextFieldKeyTyped

    private void aulasSemanajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aulasSemanajTextFieldKeyTyped

        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_aulasSemanajTextFieldKeyTyped

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
                if (listaProdutoOrcamentoBean.get(linha).isVisto()) {
                    vistoTravelMatejCheckBox.setSelected(false);
                }
                listaProdutoOrcamentoApagarBean.add(listaProdutoOrcamentoBean.get(linha));
                listaProdutoOrcamentoBean.remove(linha);
                calcularValorTotalOrcamento();
                carregarModelOrcamentoProduto();
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String msg = validarDados();
        String nsituacao;
        if (validarDados().length() < 5) {
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
            salvarPrograma();
            salvarFormaPagamento();
            salvarOrcamento();
            salvarFollowup();
            salvarCliente();
            if (novaFicha){
                if(nsituacao.equalsIgnoreCase("FINALIZADA")){
                    calcularComissao();
                    ContasReceberBean contasReceberBean = new ContasReceberBean(venda, listaParcelamento, usuarioLogadoBean);
                }
            }else {
                if (nsituacao.equalsIgnoreCase("FINALIZADA")) {
                    float valorVendaatual = venda.getValor();
                    if (valorVendaAlterar != valorVendaatual) {
                        calcularComissao();
                    }
                }
            }
            if (resultado) {
                salvarControle();
                if (this.programasTeens.getIdprogramasTeens()!=null){
                    if (vendaAlterada!=null){
                        verificarDadosAlterado();
                    }
                }
                emitirEmailGerencial();
                verificarAlteracaoCambio();
            }
            JOptionPane.showMessageDialog(rootPane, "Programa Teens Salvo com Sucesso");
            telaConsulta.setModel();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void numeroSemanasjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldFocusGained
        if (dataIniciojDateChooser.getDate() != null) {
            if (dataTerminojDateChooser.getDate() != null) {
                Integer dias = Formatacao.calcularNumeroSemanas(dataIniciojDateChooser.getDate(), dataTerminojDateChooser.getDate());
                numeroSemanasjTextField.setText(dias.toString());
            }
        }
    }//GEN-LAST:event_numeroSemanasjTextFieldFocusGained

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
                    if (!moeda.getDescricao().equalsIgnoreCase("Outras")) {
                        JOptionPane.showMessageDialog(rootPane, "Câmbio não Cadastrado");
                    }
                }
            }
        }
    }//GEN-LAST:event_moedaCambiojComboBoxItemStateChanged

    private void dataTerminojDateChooserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminojDateChooserFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminojDateChooserFocusLost

    private void numeroSemanasjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasjTextFieldFocusLost
        if (dataIniciojDateChooser.getDate() != null) {
            if (numeroSemanasjTextField.getText().length() > 0) {
                dataTerminojDateChooser.setDate(Formatacao.calcularDataFinal(dataIniciojDateChooser.getDate(), Integer.parseInt(numeroSemanasjTextField.getText())));
            }
        }
        if ((dataTerminojDateChooser.getDate() == null) && (numeroSemanasjTextField.getText().length() == 0)) {
            JOptionPane.showMessageDialog(rootPane, "Preencha numero de Semanas e/ou data término");
            numeroSemanasjTextField.requestFocus();
        }
    }//GEN-LAST:event_numeroSemanasjTextFieldFocusLost

    private void numeroSemanasAcomodacaojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanasAcomodacaojTextFieldFocusLost
        if (dataChegadaAcomodacaojDateChooser.getDate() != null) {
            if (numeroSemanasAcomodacaojTextField.getText().length() > 0) {
                dataPartidaAcomodacaojDateChooser.setDate(Formatacao.calcularDataFinal(dataChegadaAcomodacaojDateChooser.getDate(), Integer.parseInt(numeroSemanasAcomodacaojTextField.getText())));
            }
        }
        if ((dataPartidaAcomodacaojDateChooser.getDate() == null) && (numeroSemanasAcomodacaojTextField.getText().length() == 0)) {
            JOptionPane.showMessageDialog(rootPane, "Preencha numero de Semanas e/ou data término");
            numeroSemanasAcomodacaojTextField.requestFocus();
        }
    }//GEN-LAST:event_numeroSemanasAcomodacaojTextFieldFocusLost

    private void cursosjTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneMouseClicked

    }//GEN-LAST:event_cursosjTabbedPaneMouseClicked

    private void vistoTravelMatejCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vistoTravelMatejCheckBoxItemStateChanged
        if (vistoTravelMatejCheckBox.isSelected()) {
            dataEntregaVistojDateChooser.setEnabled(true);
            valorVistojTextField.setEnabled(true);
            if (vistos == null) {
                vistos = new Vistos();
            }
        } else {
            dataEntregaVistojDateChooser.setEnabled(false);
            valorVistojTextField.setEnabled(false);
            vistos = null;
        }
    }//GEN-LAST:event_vistoTravelMatejCheckBoxItemStateChanged

    private void vistoClientejCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vistoClientejCheckBoxItemStateChanged
        if (vistoClientejCheckBox.isSelected()) {
            dataEntregaVistojDateChooser.setEnabled(false);
        }
    }//GEN-LAST:event_vistoClientejCheckBoxItemStateChanged

    private void dataEntregaVistojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEntregaVistojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEntregaVistojDateChooserFocusGained

    private void valorVistojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorVistojTextFieldFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_valorVistojTextFieldFocusLost

    private void valorVistojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorVistojTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_valorVistojTextFieldKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FrmConsultaValoresProgramasTeens(usuarioLogadoBean, this);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void cursosjTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneStateChanged
        if (cursosjTabbedPane.getSelectedIndex() == 2) {
            if (listaProdutoOrcamentoBean == null) {
                listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
            }
            List<ProdutoOrcamentoBean> novaLista = new ArrayList<ProdutoOrcamentoBean>();
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                if (!listaProdutoOrcamentoBean.get(i).getTipo().equalsIgnoreCase("S")
                        && !listaProdutoOrcamentoBean.get(i).getTipo().equalsIgnoreCase("V")) {
                    novaLista.add(listaProdutoOrcamentoBean.get(i));
                }
            }
            listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
            listaProdutoOrcamentoBean = novaLista;
            float valorEstrangeira = 0.0f;
            float valorReal = 0.0f;
            if (vistos != null) {
                ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
                Produtosorcamento produto = produtoOrcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getVistoOrcamento());
                ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                pob.setIdOrcamentoProdutoOrcamento(0);
                pob.setDescricaoProdutoOrcamento(produto.getDescricao());
                pob.setIdProdutoOrcamento(produto.getIdprodutosOrcamento());
                if (valorVistojTextField.getText().length() > 0) {
                    pob.setValorMoedaEstrangeira(0.0f);
                    valorEstrangeira = pob.getValorMoedaEstrangeira();
                    valorReal = Formatacao.formatarStringfloat(valorVistojTextField.getText());
                } else {
                    pob.setValorMoedaEstrangeira(0.0f);
                    valorReal = 0;
                    valorEstrangeira = 0;
                }
                pob.setValorMoedaReal(valorReal);
                pob.setApagar(false);
                pob.setVisto(false);
                pob.setSeguro(false);
                pob.setTipo("V");
                pob.setAdicionado(1);
                pob.setNovo(true);
                listaProdutoOrcamentoBean.add(pob);
            }
            carregarModelOrcamentoProduto();
            calcularValorTotalOrcamento();
        }
    }//GEN-LAST:event_cursosjTabbedPaneStateChanged

    private void condicaoPagamentojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_condicaoPagamentojComboBoxItemStateChanged

    }//GEN-LAST:event_condicaoPagamentojComboBoxItemStateChanged

    private void valorOrcamentoFormajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorOrcamentoFormajTextFieldKeyTyped
        if (evt.getKeyChar() == '.') {
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorOrcamentoFormajTextFieldKeyTyped

    private void possuiJurosjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_possuiJurosjComboBoxItemStateChanged
        if (possuiJurosjComboBox.getSelectedItem().toString().equalsIgnoreCase("Sim")) {
            valorJurosjTextField.setEnabled(true);
            valorJurosjTextField.setText("");
            valorJurosjTextField.selectAll();
        } else {
            valorJurosjTextField.setText("");
            valorJurosjTextField.setEnabled(false);
            totalPagar = valorTotal;
            totalPagarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
        }
    }//GEN-LAST:event_possuiJurosjComboBoxItemStateChanged

    private void valorJurosjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorJurosjTextFieldFocusLost
        if (possuiJurosjComboBox.getSelectedItem().toString().equalsIgnoreCase("sim")) {
            if (valorJurosjTextField.getText().length() > 0) {
                valorJuros = Formatacao.formatarStringfloat(valorJurosjTextField.getText());
                totalPagar = valorTotal + valorJuros;
                totalPagarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
                saldoReceberjTextField.setText(Formatacao.formatarFloatString(totalPagar));
                saldoParcelarjTextField.setText(Formatacao.formatarFloatString(totalPagar));
            }
        }
        if (valorJurosjTextField.getText().length() > 0) {
            float valor = Formatacao.formatarStringfloat(valorJurosjTextField.getText());
            valorJurosjTextField.setText(Formatacao.formatarFloatString(valor));
        }
    }//GEN-LAST:event_valorJurosjTextFieldFocusLost

    private void valorJurosjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorJurosjTextFieldKeyTyped
        if (evt.getKeyChar() == '.') {
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

    private void saldoReceberjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoReceberjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoReceberjTextFieldKeyTyped

    private void saldoParcelarjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoParcelarjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoParcelarjTextFieldKeyTyped

    private void meioPagamentojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meioPagamentojComboBoxItemStateChanged
    }//GEN-LAST:event_meioPagamentojComboBoxItemStateChanged

    private void valorParcelamentojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldFocusLost
        if (valorParcelamentojTextField.getText().length() > 0) {
            float valor = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
            valorParcelamentojTextField.setText(Formatacao.formatarFloatString(valor));
            int numero = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
            float vParcela = valor / numero;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(vParcela));
        }
    }//GEN-LAST:event_valorParcelamentojTextFieldFocusLost

    private void valorParcelamentojTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldFocusGained

    }//GEN-LAST:event_valorParcelamentojTextFieldFocusGained

    private void valorParcelamentojTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldKeyTyped
        if (evt.getKeyChar() == '.') {
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorParcelamentojTextFieldKeyTyped

    private void valorParcelajTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldFocusGained
        float saldoParcelas = 0.0f;
        int numeroParcelas = 0;
        float valorParcela = 0.0f;
        numeroParcelas = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
        if (valorParcelamentojTextField.getText().length() > 0) {
            saldoParcelas = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
        }
        if ((saldoParcelas > 0) && (numeroParcelas > 0)) {
            valorParcela = saldoParcelas / numeroParcelas;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(valorParcela));
            this.valorParcela = valorParcela;
        }
    }//GEN-LAST:event_valorParcelajTextFieldFocusGained

    private void valorParcelajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyPressed
        if (evt.getKeyChar() == '.') {
            evt.setKeyChar(',');
        }
    }//GEN-LAST:event_valorParcelajTextFieldKeyPressed

    private void valorParcelajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyTyped
        if (evt.getKeyChar() == '.') {
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321,-";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_valorParcelajTextFieldKeyTyped

    private void valorParcelajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyReleased

    }//GEN-LAST:event_valorParcelajTextFieldKeyReleased

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
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int linha = parcelamentojTable.getSelectedRow();
        if (linha >= 0) {
            if (listaParcelamento.get(linha).getIdparcemlamentoPagamento() != null) {
                ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
                parcelamentoPagamentoController.excluir(listaParcelamento.get(linha).getIdparcemlamentoPagamento());
            } else {
                listaParcelamento.remove(linha);
            }
            carregarModelParcelamento();
            calcularParcelamentoPagamento();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void numeroParcelasjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numeroParcelasjComboBoxItemStateChanged
        if (valorParcelamentojTextField.getText().length() > 0) {
            float valor = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
            valorParcelamentojTextField.setText(Formatacao.formatarFloatString(valor));
            int numero = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
            float vParcela = valor / numero;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(vParcela));
        }
    }//GEN-LAST:event_numeroParcelasjComboBoxItemStateChanged

    private void telefoneEmergenciajCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_telefoneEmergenciajCheckBoxItemStateChanged
        telefoneContatoEmergenciajTextField.setText("");
        telefoneContatoEmergenciajTextField.requestFocus();
    }//GEN-LAST:event_telefoneEmergenciajCheckBoxItemStateChanged

    private void telefoneContatoEmergenciajTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneContatoEmergenciajTextFieldFocusLost
        caracteres = "0987654321-()";
    }//GEN-LAST:event_telefoneContatoEmergenciajTextFieldFocusLost

    private void telefoneContatoEmergenciajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneContatoEmergenciajTextFieldKeyPressed
        if ((evt.getKeyCode() != KeyEvent.VK_DELETE) && (evt.getKeyCode() != KeyEvent.VK_BACK_SPACE)) {
            String texto = telefoneContatoEmergenciajTextField.getText();
            if (telefoneContatoEmergenciajTextField.getText().length() == 0) {
                telefoneContatoEmergenciajTextField.setText("(");
            } else if (telefoneContatoEmergenciajTextField.getText().length() == 3) {
                telefoneContatoEmergenciajTextField.setText(telefoneContatoEmergenciajTextField.getText() + ")");
            }
            if (telefoneEmergenciajCheckBox.isSelected()) {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneContatoEmergenciajTextField.getText().length() == 8) {
                        telefoneContatoEmergenciajTextField.setText(telefoneContatoEmergenciajTextField.getText() + '-');
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneContatoEmergenciajTextField.getText().length() == 9) {
                            telefoneContatoEmergenciajTextField.setText(telefoneContatoEmergenciajTextField.getText() + '-');
                        }
                    }
                }
            } else {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneContatoEmergenciajTextField.getText().length() == 9) {
                        telefoneContatoEmergenciajTextField.setText(telefoneContatoEmergenciajTextField.getText() + '-');
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneContatoEmergenciajTextField.getText().length() == 8) {
                            telefoneContatoEmergenciajTextField.setText(telefoneContatoEmergenciajTextField.getText() + '-');
                        }
                    }
                }
            }
            if (telefoneEmergenciajCheckBox.isSelected()) {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneContatoEmergenciajTextField.getText().length() > 12) {
                        caracteres = "";
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneContatoEmergenciajTextField.getText().length() > 13) {
                            caracteres = "";
                        }
                    }
                }

            } else {
                if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
                    if (telefoneContatoEmergenciajTextField.getText().length() > 13) {
                        caracteres = "";
                    }
                } else {
                    if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 8) {
                        if (telefoneContatoEmergenciajTextField.getText().length() > 12) {
                            caracteres = "";
                        }
                    }
                }
            }
        } else {
            telefoneContatoEmergenciajTextField.setText("");
        }
    }//GEN-LAST:event_telefoneContatoEmergenciajTextFieldKeyPressed

    private void telefoneContatoEmergenciajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneContatoEmergenciajTextFieldKeyReleased

    }//GEN-LAST:event_telefoneContatoEmergenciajTextFieldKeyReleased

    private void telefoneContatoEmergenciajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneContatoEmergenciajTextFieldKeyTyped
        if (evt.getKeyChar() == '.') {
            evt.setKeyChar(',');
        }
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_telefoneContatoEmergenciajTextFieldKeyTyped

    private void dataVencimentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataVencimentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentojDateChooserFocusGained

    private void dataNascimentoMaejDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascimentoMaejDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoMaejDateChooserFocusGained

    private void dataNascimentoPaijDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascimentoPaijDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoPaijDateChooserFocusGained

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TranferbuttonGroup;
    private javax.swing.JTextField aulasSemanajTextField;
    private javax.swing.JButton buscaBancojButton3;
    private javax.swing.ButtonGroup cartaoVTMbuttonGroup;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JComboBox condicaoPagamentojComboBox;
    private javax.swing.JFormattedTextField cpfMaejFormattedTextField;
    private javax.swing.JFormattedTextField cpfPaijFormattedTextField;
    private javax.swing.JTextField cursojTextField;
    private javax.swing.JTabbedPane cursosjTabbedPane;
    private com.toedter.calendar.JDateChooser dataChegadaAcomodacaojDateChooser;
    private com.toedter.calendar.JDateChooser dataEntregaVistojDateChooser;
    private com.toedter.calendar.JDateChooser dataIniciojDateChooser;
    private com.toedter.calendar.JDateChooser dataNascimentoMaejDateChooser;
    private com.toedter.calendar.JDateChooser dataNascimentoPaijDateChooser;
    private com.toedter.calendar.JDateChooser dataPartidaAcomodacaojDateChooser;
    private com.toedter.calendar.JDateChooser dataTerminojDateChooser;
    private com.toedter.calendar.JDateChooser dataVencimentojDateChooser;
    private javax.swing.JTextField emailConatoEmergenciajTextField;
    private javax.swing.JTextField escolajTextField;
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
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox meioPagamentojComboBox;
    private javax.swing.JComboBox moedaCambiojComboBox;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTextField nomeContatoEmergenciajTextField;
    private javax.swing.JComboBox numeroParcelasjComboBox;
    private javax.swing.JTextField numeroSemanasAcomodacaojTextField;
    private javax.swing.JTextField numeroSemanasjTextField;
    private javax.swing.JTextArea obsTMjTextArea;
    private javax.swing.JTextField observacaoVistojTextField;
    private javax.swing.JTextArea observacoesjTextArea;
    private javax.swing.JTextField paisjTextField;
    private javax.swing.JTable parcelamentojTable;
    private javax.swing.ButtonGroup passagemAereabuttonGroup;
    private javax.swing.JComboBox possuiJurosjComboBox;
    private javax.swing.JComboBox produtoOrcaemntojComboBox;
    private javax.swing.JTable produtoOrcamentojTable;
    private javax.swing.JComboBox refeicaojComboBox;
    private javax.swing.JTextField relacaoEmergenciajTextField;
    private javax.swing.JTextField rgMaejTextField;
    private javax.swing.JTextField rgPaijTextField;
    private javax.swing.JTextField saldoParcelarjTextField;
    private javax.swing.JTextField saldoReceberjTextField;
    private javax.swing.ButtonGroup seguroViagembuttonGroup;
    private javax.swing.ButtonGroup solicitacaoVistobuttonGroup;
    private javax.swing.JTextField telefoneContatoEmergenciajTextField;
    private javax.swing.JCheckBox telefoneEmergenciajCheckBox;
    private javax.swing.ButtonGroup temAlergiabuttonGroup;
    private javax.swing.JComboBox tipoAcomodacaojComboBox;
    private javax.swing.JComboBox tipoParcelamentojComboBox;
    private javax.swing.JComboBox tipoProgramajComboBox;
    private javax.swing.JComboBox tipoQuartojComboBox;
    private javax.swing.JTextField totalPagarjTextField;
    private javax.swing.JTextField valorCambiojTextField;
    private javax.swing.JTextField valorJurosjTextField;
    private javax.swing.JTextField valorOrcamentoFormajTextField;
    private javax.swing.JTextField valorParcelajTextField;
    private javax.swing.JTextField valorParcelamentojTextField;
    private javax.swing.JTextField valorProdutosMoedaEstrangeirajTextField;
    private javax.swing.JTextField valorProdutosMoedaRealjTextField;
    private javax.swing.JTextField valorTotalOrcamentojTextField;
    private javax.swing.JTextField valorVistojTextField;
    private javax.swing.JCheckBox vistoClientejCheckBox;
    private javax.swing.JCheckBox vistoTravelMatejCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getCliente(Cliente cliente) {
        if (cliente != null) {
            this.cliente = cliente;
            nomeClientejTextField.setText(cliente.getNome());
        }
    }

    public void carregarInicializacao(int idVenda) {
        carregarModelOrcamentoProduto();
        carregarListaProdutos();
        carregarComboMoedas();
        if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
            telefoneEmergenciajCheckBox.setText("8-Telefone");
        } else {
            telefoneEmergenciajCheckBox.setText("9-Telefone");
        }
        if (idVenda > 0) {
            carregarObjetos(idVenda);
        } else {
            consultaCambio=true;
        }
    }

    public void carregarListaProdutos() {
        ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
        List<Viewprodutosfiltro> lista = produtoOrcamentoController.listarFiltroProdutosOrcamento(usuarioLogadoBean.getParametrosprodutos().getCursos());
        if (lista == null) {
            lista = new ArrayList<Viewprodutosfiltro>();
        }
        produtoOrcaemntojComboBox = Formatacao.preencherComobox(lista, produtoOrcaemntojComboBox, false, null);
    }

    public void carregarModelOrcamentoProduto() {
        if (listaProdutoOrcamentoBean == null) {
            listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
            listaProdutoOrcamentoApagarBean = new ArrayList<ProdutoOrcamentoBean>();
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

    public void calcularValorTotalOrcamento() {
        if (usuarioLogadoBean.getParametrosprodutos().isRemessaativa()){
           calcularImpostoRemessa();
       }
        if (listaProdutoOrcamentoBean != null) {
            valorTotal = 0.0f;
            totalMoedaEstrangeira = 0.0f;
            totalMoedaReal = 0.0f;
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                valorTotal = valorTotal + listaProdutoOrcamentoBean.get(i).getValorMoedaReal();
                totalMoedaEstrangeira = totalMoedaEstrangeira + listaProdutoOrcamentoBean.get(i).getValorMoedaEstrangeira();
                totalMoedaReal = totalMoedaReal + listaProdutoOrcamentoBean.get(i).getValorMoedaReal();
            }
            
            // Calcular todo o produto da taxa de remessa para o exterior
//            if (produto.isTodos()) {
//                float valorRemessa = 0.0f;
//                valorRemessa = valorTotal * (usuarioLogadoBean.getParametrosprodutos().getPercentualremessa()/100);
//                valorTotal = valorTotal + valorRemessa;
//            }
            
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
        List<Produtoremessa> listaProdutoRemessa = produtoRemessaController.listar(usuarioLogadoBean.getParametrosprodutos().getProgramasTeens());
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
                    i=1000;
                }
            }
            if (!achou) {
                ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
                Produtosorcamento produtosorcamento = produtoOrcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getProdutoremessa());
                telas.ProgramasTeens.ProdutoOrcamentoBean pob = new telas.ProgramasTeens.ProdutoOrcamentoBean();
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

    public void salvarVendas(String situacao) {
        if (venda == null) {
            venda = new Vendas();
            venda.setDataVenda(new Date());
            venda.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            venda.setUnidadenegocio(usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio());
            novaFicha = true;
        } else {
            if (venda.getSituacao().equalsIgnoreCase("PROCESSO")) {
                venda.setDataVenda(new Date());
            }
        }
        VendasController vendasController = new VendasController();
        venda.setCliente(cliente.getIdcliente());
        venda.setProdutos(usuarioLogadoBean.getParametrosprodutos().getProgramasTeens());
        venda.setSituacao(situacao);
        venda.setObstm(obsTMjTextArea.getText());
        venda.setVendasMatriz("S");
        venda.setValor(Formatacao.formatarStringfloat(valorTotalOrcamentojTextField.getText()));
        venda.setFornecedor(valores.getFornecedorcidade().getFornecedor().getIdfornecedor());
        venda.setFornecedorcidade(valores.getFornecedorcidade());
        venda = vendasController.salvar(venda);
    }

    public void salvarFormaPagamento() {
        if (formaPagamento == null) {
            formaPagamento = new Formapagamento();
        }
        formaPagamento.setCondicao(condicaoPagamentojComboBox.getSelectedItem().toString());
        formaPagamento.setPossuiJuros(possuiJurosjComboBox.getSelectedItem().toString());
        formaPagamento.setValorJutos(valorJuros);
        formaPagamento.setValorOrcamento(Formatacao.formatarStringfloat(valorOrcamentoFormajTextField.getText()));
        formaPagamento.setValorTotal(formaPagamento.getValorJutos() + formaPagamento.getValorOrcamento());
        formaPagamento.setObservacoes(observacoesjTextArea.getText());
        formaPagamento.setVendas(this.venda.getIdvendas());
        FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
        formaPagamento = formaPagamentoController.salvar(formaPagamento);
        ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
        for (int i = 0; i < listaParcelamento.size(); i++) {
            Parcelamentopagamento parcelamento = listaParcelamento.get(i);
            parcelamento.setIdformapagamento(formaPagamento.getIdformaPagamento());
            parcelamento = parcelamentoPagamentoController.salvar(parcelamento);
        }
    }

    

    public void salvarPrograma() {
        if (this.programasTeens == null) {
            programasTeens = new Programasteens();
        }
        programasTeens.setTipoPrograma(tipoProgramajComboBox.getSelectedItem().toString());
        programasTeens.setNomeCurso(cursojTextField.getText());
        programasTeens.setNomeEscola(escolajTextField.getText());
        programasTeens.setCidadeCurso(cidadejTextField.getText());
        programasTeens.setPaisCurso(paisjTextField.getText());
        programasTeens.setAulasSemana(aulasSemanajTextField.getText());
        programasTeens.setNumeroSemanas(Integer.parseInt(numeroSemanasjTextField.getText()));
        programasTeens.setDataInicioCurso(dataIniciojDateChooser.getDate());
        programasTeens.setDataTerminoCurso(dataTerminojDateChooser.getDate());
        programasTeens.setTipoAcomodacao(tipoAcomodacaojComboBox.getSelectedItem().toString());
        programasTeens.setCpfpai(cpfPaijFormattedTextField.getText());
        programasTeens.setRgpai(rgPaijTextField.getText());
        programasTeens.setDatanascimentopai(dataNascimentoPaijDateChooser.getDate());
        programasTeens.setCpfmae(cpfMaejFormattedTextField.getText());
        programasTeens.setRgmae(rgMaejTextField.getText());
        programasTeens.setDatanascimentomae(dataNascimentoMaejDateChooser.getDate());
        if (!programasTeens.getTipoAcomodacao().equalsIgnoreCase("sem acomodação")) {
            programasTeens.setNumeroSemanasAcomodacao(Integer.parseInt(numeroSemanasAcomodacaojTextField.getText()));
            programasTeens.setTipoQuarto(tipoQuartojComboBox.getSelectedItem().toString());
            programasTeens.setRefeicao(refeicaojComboBox.getSelectedItem().toString());
            programasTeens.setDataChegadaAcomodacao(dataChegadaAcomodacaojDateChooser.getDate());
            programasTeens.setDataPartidaAcomodacao(dataPartidaAcomodacaojDateChooser.getDate());
        } else {
            programasTeens.setNumeroSemanasAcomodacao(0);
            programasTeens.setTipoQuarto("");
            programasTeens.setRefeicao("");
        }
        if (vistoTravelMatejCheckBox.isSelected()) {
            programasTeens.setSolicitarVisto("Através da TravelMate");
        }
        if (vistoClientejCheckBox.isSelected()) {
            programasTeens.setSolicitarVisto("Cliente providenciará");
        }
        if (dataEntregaVistojDateChooser.getDate() != null) {
            programasTeens.setDataEntragaDocumentosVistos(dataEntregaVistojDateChooser.getDate());
        }
        programasTeens.setObservacaoVistos(observacaoVistojTextField.getText());
        programasTeens.setNomeContatoEmergencia(nomeContatoEmergenciajTextField.getText());
        programasTeens.setFoneContatoEmergencia(telefoneContatoEmergenciajTextField.getText());
        programasTeens.setEmailContatoEmergencia(emailConatoEmergenciajTextField.getText());
        programasTeens.setRelacaoContatoEmergencia(relacaoEmergenciajTextField.getText());
        programasTeens.setFornecedor(valores.getFornecedorcidade().getFornecedor().getIdfornecedor());
        programasTeens.setControle("Processo");
        programasTeens.setVendas(venda.getIdvendas());
        programasTeens.setValoresprogramasteens(valores);
        ProgramasTeensController programasTeensController = new ProgramasTeensController();
        programasTeens = programasTeensController.salvar(programasTeens);
    }

    public void salvarOrcamento() {
        if (orcamento == null) {
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

    public boolean verificarVistoLancado() {
        if (listaProdutoOrcamentoBean != null) {
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                if (listaProdutoOrcamentoBean.get(i).isVisto()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void carregarObjetos(int idVenda) {
        //Vendas
        VendasController vendasController = new VendasController();
        this.venda = vendasController.consultarVendas(idVenda);
        if (this.venda != null) {
            valorVendaAlterar = venda.getValor();
            situacao = venda.getSituacao();
            if (venda.getSituacao().equalsIgnoreCase("FINALIZADA")){
                vendaAlterada = venda;
            }
            ClienteController clienteController = new ClienteController();
            this.cliente = clienteController.consultar(venda.getCliente());

            ProgramasTeensController programasTeensController = new ProgramasTeensController();
            this.programasTeens = programasTeensController.consultarProgramasteens(idVenda);
            if (programasTeens != null) {
                carregarProgramaTeensAlteracao();
                carregarCamposProgramas();
            }

            
            

            FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
            this.formaPagamento = formaPagamentoController.consultar(idVenda);
            if (formaPagamento != null) {
                carregarCamposFormaPagamento();
            }

            OrcamentoController orcamentoController = new OrcamentoController();
            orcamento = orcamentoController.consultar(idVenda);
            if (orcamento != null) {
                carregarOrcamento();
                List<Orcamentoprodutosorcamento> listaOrcametoProduto = orcamentoController.listarOrcamentoProdutoOrcamento(orcamento.getIdorcamento());
                if (listaOrcametoProduto != null) {
                    for (int i = 0; i < listaOrcametoProduto.size(); i++) {
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
                        pob.setNovo(false);
                        pob.setTipo(listaOrcametoProduto.get(i).getTipo());
                        listaProdutoOrcamentoBean.add(pob);
                        carregarModelOrcamentoProduto();
                        calcularValorTotalOrcamento();
                    }
                }
                carregarCambio();
            }
            consultaCambio = true;
        }
    }

    public void carregarCamposProgramas() {
        valores = programasTeens.getValoresprogramasteens();
        obsTMjTextArea.setText(venda.getObstm());
        tipoAcomodacaojComboBox.setSelectedItem(programasTeens.getTipoPrograma());
        nomeClientejTextField.setText(cliente.getNome());
        cursojTextField.setText(programasTeens.getNomeCurso());
        escolajTextField.setText(programasTeens.getNomeEscola());
        cidadejTextField.setText(programasTeens.getCidadeCurso());
        paisjTextField.setText(programasTeens.getPaisCurso());
        aulasSemanajTextField.setText(programasTeens.getAulasSemana());
        numeroSemanasjTextField.setText(String.valueOf(programasTeens.getNumeroSemanas()));
        dataIniciojDateChooser.setDate(programasTeens.getDataInicioCurso());
        dataTerminojDateChooser.setDate(programasTeens.getDataTerminoCurso());
        tipoAcomodacaojComboBox.setSelectedItem(programasTeens.getTipoAcomodacao());
        numeroSemanasAcomodacaojTextField.setText(String.valueOf(programasTeens.getNumeroSemanasAcomodacao()));
        tipoQuartojComboBox.setSelectedItem(programasTeens.getTipoQuarto());
        refeicaojComboBox.setSelectedItem(programasTeens.getRefeicao());
        dataChegadaAcomodacaojDateChooser.setDate(programasTeens.getDataChegadaAcomodacao());
        dataPartidaAcomodacaojDateChooser.setDate(programasTeens.getDataPartidaAcomodacao());
        cpfPaijFormattedTextField.setText(programasTeens.getCpfpai());
        rgPaijTextField.setText(programasTeens.getRgpai());
        dataNascimentoPaijDateChooser.setDate(programasTeens.getDatanascimentopai());
        cpfMaejFormattedTextField.setText(programasTeens.getCpfmae());
        rgMaejTextField.setText(programasTeens.getRgmae());
        dataNascimentoMaejDateChooser.setDate(programasTeens.getDatanascimentomae());
        if (programasTeens.getSolicitarVisto().equalsIgnoreCase("Através da TravelMate")) {
            vistoTravelMatejCheckBox.setSelected(true);
        } else {
            vistoClientejCheckBox.setSelected(true);
            dataEntregaVistojDateChooser.setDate(programasTeens.getDataEntragaDocumentosVistos());
        }
        observacaoVistojTextField.setText(programasTeens.getObservacaoVistos());
        nomeContatoEmergenciajTextField.setText(programasTeens.getNomeContatoEmergencia());
        telefoneContatoEmergenciajTextField.setText(programasTeens.getFoneContatoEmergencia());
        emailConatoEmergenciajTextField.setText(programasTeens.getEmailContatoEmergencia());
        relacaoEmergenciajTextField.setText(programasTeens.getRelacaoContatoEmergencia());
    }

    public void carregarCamposFormaPagamento() {
        condicaoPagamentojComboBox.setSelectedItem(formaPagamento.getCondicao());
        possuiJurosjComboBox.setSelectedItem(formaPagamento.getPossuiJuros());
        valorJuros = formaPagamento.getValorJutos();
        valorJurosjTextField.setText(Formatacao.formatarFloatString(formaPagamento.getValorJutos()));
        observacoesjTextArea.setText(formaPagamento.getObservacoes());
        ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
        listaParcelamento = parcelamentoPagamentoController.listar(formaPagamento.getIdformaPagamento());
        calcularParcelamentoPagamento();
        carregarModelParcelamento();
    }

    public void carregarVisto() {
        vistoTravelMatejCheckBox.setSelected(true);
        dataEntregaVistojDateChooser.setDate(vistos.getDataEntregaDocumentos());
        valorVistojTextField.setText(Formatacao.formatarFloatString(vistos.getValorEmissao()));
        valorVistos = vistos.getValorEmissao();
        observacaoVistojTextField.setText(vistos.getObservacao());
    }

    public void carregarOrcamento() {
        valorCambio = orcamento.getValorCambio();
        cambioAlterado = orcamento.getCambioAlterado();
    }

    public void carregarComboMoedas() {
        CambioController cambioController = new CambioController();
        List<Moedas> listaMoedas = cambioController.listaMoedas();
        if (listaMoedas != null) {
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

    public String validarDados() {
        String msg = "";
        if (nomeClientejTextField.getText().length() == 0) {
            msg = msg + "Campo cliente não selecionado\r\n";
        }
        if (cursojTextField.getText().length() == 0) {
            msg = msg + "Curso não informado\r\n";
        }
        if (escolajTextField.getText().length() == 0) {
            msg = msg + "Escola/Instituição não informada\r\n";
        }
        if (paisjTextField.getText().length() == 0) {
            msg = msg + "País não informado\r\n";
        }
        if (aulasSemanajTextField.getText().length() == 0) {
            msg = msg + "Aulas por semana não informada\r\n";
        }
        if (numeroSemanasjTextField.getText().length() == 0) {
            msg = msg + "Número de semanas não informado\r\n";
        }
        if (dataIniciojDateChooser.getDate() == null) {
            msg = msg + "Data Início inválida\r\n";
        }
        if (dataTerminojDateChooser.getDate() == null) {
            msg = msg + "Data Términio inválida\r\n";
        }
        if (!tipoAcomodacaojComboBox.getSelectedItem().toString().equalsIgnoreCase("sem acomodação")) {
            if (dataChegadaAcomodacaojDateChooser.getDate() == null) {
                msg = msg + "Data Chegada na acomdação inválida\r\n";
            }
            if (dataPartidaAcomodacaojDateChooser.getDate() == null) {
                msg = msg + "Data partida acomodação inválida\r\n";
            }
            if (numeroSemanasAcomodacaojTextField.getText().length() == 0) {
                msg = msg + "Numero semanas acomodação não iformado\r\n";
            }

        }
        double saldoParcelar = Formatacao.formatarStringfloat(saldoParcelarjTextField.getText());
        if (saldoParcelar > 0) {
            msg = msg + "Forma de Pagamento possui saldo a parcelar em aberto\r\n";
        }
        return msg;
    }


    public void emitirEmailGerencial() {
        EnviarEmailBean email = new EnviarEmailBean();
        if (novaFicha) {
            email.setTitulo("Nova Ficha de Programa Teens");
            email.setTipoAviso("Inclusão");
            email.setDataInclusao(Formatacao.ConvercaoDataPadrao(venda.getDataVenda()));
            email.setValor(Formatacao.formatarFloatString(venda.getValor()));
            Moedas moeda = (Moedas) moedaCambiojComboBox.getSelectedItem();
            email.setCambio(Formatacao.formatarFloatString(cambio.getValor()));
            email.setSiglaCambio(moeda.getSigla());
        } else {
            email.setTitulo("Ficha de Programa Teens");
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
        email.setDatainicio(Formatacao.ConvercaoDataPadrao(programasTeens.getDataInicioCurso()));
        email.setConsultor(usuarioLogadoBean.getUsuario().getNome());
        email.setObsTM(venda.getObstm());
        email.setIdProduto(usuarioLogadoBean.getParametrosprodutos().getProgramasTeens());
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

    public void carregarModelParcelamento() {
        List<Parcelamentopagamento> listanova = null;
        listanova = listaParcelamento;
        if (formaPagamento != null) {
            ParcelamentoPagamentoController parcelamentoPagamentoController = new ParcelamentoPagamentoController();
            listaParcelamento = parcelamentoPagamentoController.listar(formaPagamento.getIdformaPagamento());
            if (listaParcelamento == null) {
                listaParcelamento = new ArrayList<Parcelamentopagamento>();
            }
        } else {
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

    public void salvarFollowup() {
        FollowupController followupController = new FollowupController();
        followupController.fecharFollowUpCliente(cliente.getIdcliente());
    }

    public void verificarAlteracaoCambio() {
        if (cambioAlterado.equalsIgnoreCase("sim")) {
            Formatacao.VerificarCambioalterado(valorCambio, "Programas Teens", cliente.getNome(),
                    usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), usuarioLogadoBean.getUsuario().getNome(), this.venda.getProdutos(),
                    Formatacao.formatarFloatString(this.venda.getValor()));
        }
    }

    public void salvarCliente() {
        cliente.setTipoCliente("Fechado");
        cliente.setDataInicio(programasTeens.getDataInicioCurso());
        cliente.setDataTermino(programasTeens.getDataTerminoCurso());
        ClienteController clienteController = new ClienteController();
        cliente = clienteController.salvar(cliente);
    }

    public void salvarControle() {
        ProgramasTeensController programasTeensController = new ProgramasTeensController();
        Controleprogramasteens controle = programasTeensController.consultarControleProgramasTeens(this.venda.getIdvendas());
        if (controle == null) {
            controle = new Controleprogramasteens();
            controle.setVisto("Não");
            controle.setContrato("Não");
            controle.setDocumentacao("Não");
            controle.setFamilia("Não");
            controle.setCidadeDestino(" ");
            controle.setBonus(" ");
            controle.setObservacao(" ");
            controle.setFinalizado("Processo");
            controle.setSituacao("Processo");
            controle.setVendas(venda.getIdvendas());
            controle = programasTeensController.salvar(controle);
            salvarInvoice(controle.getIdcontroleProgramasTeens());
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
        invoice.setObscredito("");
        InvoicesController invoicesController = new InvoicesController();
        invoicesController.salvar(invoice);
    }

    public void limitarJText() {
        cursojTextField.setDocument(new LimiteTextoJedit(100));
        cidadejTextField.setDocument(new LimiteTextoJedit(50));
        paisjTextField.setDocument(new LimiteTextoJedit(50));
        nomeContatoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
        telefoneContatoEmergenciajTextField.setDocument(new LimiteTextoJedit(14));
        emailConatoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
        relacaoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
        observacaoVistojTextField.setDocument(new LimiteTextoJedit(100));
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

    @Override
    public void setValores(Valoresprogramasteens valores) {
        if (valores != null) {
            this.valores = valores;
            escolajTextField.setText(valores.getFornecedorcidade().getFornecedor().getNome());
            cidadejTextField.setText(valores.getFornecedorcidade().getCidade().getNome());
            paisjTextField.setText(valores.getFornecedorcidade().getCidade().getPais().getNome());
            moedaCambiojComboBox.setSelectedItem(valores.getMoedas());
            carregarValores();
        }
    }
    
    public void carregarValores() {
        if (valores != null) {
            if (valorCambio > 0) {
                if (listaProdutoOrcamentoBean == null) {
                    listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
                }
                apagarProdutoTeens();
                float valorEstrangeira = valores.getValorgross();
                float valorReal = valores.getValorgross()* cambio.getValor();
                if (valores.getProdutosorcamento() != null) {
                    ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                    pob.setIdOrcamentoProdutoOrcamento(0);
                    pob.setDescricaoProdutoOrcamento(valores.getProdutosorcamento().getDescricao());
                    pob.setIdProdutoOrcamento(valores.getProdutosorcamento().getIdprodutosOrcamento());
                    pob.setValorMoedaEstrangeira(valorEstrangeira);
                    pob.setValorMoedaReal(valorReal);
                    pob.setApagar(false);
                    pob.setTipo("A");
                    pob.setVisto(false);
                    pob.setSeguro(false);
                    pob.setNovo(true);
                    listaProdutoOrcamentoBean.add(pob);
                    calcularValorTotalOrcamento();
                    carregarModelOrcamentoProduto();
                    valorProdutosMoedaEstrangeirajTextField.setText("");
                    valorProdutosMoedaRealjTextField.setText("");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Cambio não selecionado");
            }
        }
    }
    
    public void apagarProdutoTeens() {
        if (listaProdutoOrcamentoBean != null) {
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                if (listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento() == (valores.getProdutosorcamento().getIdprodutosOrcamento())) {
                    listaProdutoOrcamentoBean.remove(i);
                }
            }
        }
    }

    @Override
    public void setForneceodr(Fornecedor fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void calcularComissao(){
        VendasComissaoController vendasComissaoController = new VendasComissaoController();
            Vendascomissao vendasComissao = vendasComissaoController.getVendaComissao(venda.getIdvendas(), usuarioLogadoBean.getParametrosprodutos().getCursos());
            if (vendasComissao!=null){
                if (vendasComissao.getPaga().equalsIgnoreCase("Não")){
                    ComissaoProgramasTeens cc = new ComissaoProgramasTeens(usuarioLogadoBean, venda,  listaProdutoOrcamentoBean, valorCambio,  valores, listaParcelamento, programasTeens.getDataInicioCurso(), programasTeens.getDataInicioCurso(), vendasComissao);
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

     public void carregarProgramaTeensAlteracao(){
        programasTeensAlterado = new Programasteens();
        programasTeensAlterado.setAulasSemana(programasTeens.getAulasSemana());
        programasTeensAlterado.setCidadeCurso(programasTeens.getCidadeCurso());
        programasTeensAlterado.setControle(programasTeens.getControle());
        programasTeensAlterado.setCpfmae(programasTeens.getCpfmae());
        programasTeensAlterado.setCpfpai(programasTeens.getCpfpai());
        programasTeensAlterado.setDataChegadaAcomodacao(programasTeens.getDataChegadaAcomodacao());
        programasTeensAlterado.setDataEntragaDocumentosVistos(programasTeens.getDataEntragaDocumentosVistos());
        programasTeensAlterado.setDataInicioCurso(programasTeens.getDataInicioCurso());
        programasTeensAlterado.setDataPartidaAcomodacao(programasTeens.getDataPartidaAcomodacao());
        programasTeensAlterado.setDataTerminoCurso(programasTeens.getDataTerminoCurso());
        programasTeensAlterado.setDatanascimentomae(programasTeens.getDatanascimentomae());
        programasTeensAlterado.setDatanascimentopai(programasTeens.getDatanascimentopai());
        programasTeensAlterado.setEmailContatoEmergencia(programasTeens.getEmailContatoEmergencia());
        programasTeensAlterado.setFoneContatoEmergencia(programasTeens.getFoneContatoEmergencia());
        programasTeensAlterado.setFornecedor(programasTeens.getFornecedor());
        programasTeensAlterado.setIdprogramasTeens(programasTeens.getIdprogramasTeens());
        programasTeensAlterado.setNomeContatoEmergencia(programasTeens.getNomeContatoEmergencia());
        programasTeensAlterado.setNomeCurso(programasTeens.getNomeCurso());
        programasTeensAlterado.setNomeEscola(programasTeens.getNomeEscola());
        programasTeensAlterado.setNumeroSemanas(programasTeens.getNumeroSemanas());
        programasTeensAlterado.setNumeroSemanasAcomodacao(programasTeens.getNumeroSemanasAcomodacao());
        programasTeensAlterado.setObservacaoVistos(programasTeens.getObservacaoVistos());
        programasTeensAlterado.setObstm(programasTeens.getObstm());
        programasTeensAlterado.setPaisCurso(programasTeens.getPaisCurso());
        programasTeensAlterado.setRefeicao(programasTeens.getRefeicao());
        programasTeensAlterado.setRelacaoContatoEmergencia(programasTeens.getRelacaoContatoEmergencia());
        programasTeensAlterado.setRgmae(programasTeens.getRgmae());
        programasTeensAlterado.setRgpai(programasTeens.getRgpai());
        programasTeensAlterado.setSolicitarVisto(programasTeens.getSolicitarVisto());
        programasTeensAlterado.setTipoAcomodacao(programasTeens.getTipoAcomodacao());
        programasTeensAlterado.setTipoPrograma(programasTeens.getTipoPrograma());
        programasTeensAlterado.setTipoSolicitacao(programasTeens.getTipoSolicitacao());
        programasTeensAlterado.setTipoRefeicao(programasTeens.getTipoRefeicao());
        programasTeensAlterado.setValoresprogramasteens(programasTeens.getValoresprogramasteens());
        programasTeensAlterado.setVendas(programasTeens.getVendas());
    }
     
     
     public void verificarDadosAlterado() {
        dadosAlterado="";
        if (programasTeens.getAulasSemana()!= null) {
            if (!programasTeens.getAulasSemana().equalsIgnoreCase(programasTeensAlterado.getAulasSemana())) {
                dadosAlterado = "Aulas por Semana : " + programasTeens.getAulasSemana() + " | " + programasTeensAlterado.getAulasSemana() + "<br></br>";
            }
        }
        if (programasTeens.getCidadeCurso()!= null) {
            if (!programasTeens.getCidadeCurso().equalsIgnoreCase(programasTeensAlterado.getCidadeCurso())) {
                dadosAlterado = dadosAlterado + "Cidade do Curso : " + programasTeens.getCidadeCurso() + " | " + programasTeensAlterado.getCidadeCurso() + "<br></br>";
            }
        }
        if (programasTeens.getCpfmae()!= null) {
            if (!programasTeens.getCpfmae().equalsIgnoreCase(programasTeensAlterado.getCpfmae())) {
                dadosAlterado = dadosAlterado + "CPF Mãe : " + programasTeens.getCpfmae() + " | " + programasTeensAlterado.getCpfmae() + "<br></br>";
            }
        }
        if (programasTeens.getCpfpai()!= null) {
            if (!programasTeens.getCpfpai().equalsIgnoreCase(programasTeensAlterado.getCpfpai())) {
                dadosAlterado = dadosAlterado + "CPF Pai : " + programasTeens.getCpfpai() + " | " + programasTeensAlterado.getCpfpai() + "<br></br>";
            }
        }
        if (programasTeens.getDataChegadaAcomodacao()!= null) {
            if (!programasTeens.getDataChegadaAcomodacao().equals(programasTeensAlterado.getDataChegadaAcomodacao())) {
                dadosAlterado = dadosAlterado + "Data Chegada na Acomodação : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDataChegadaAcomodacao()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDataChegadaAcomodacao()) + "<br></br>";
            }
        }
        if (programasTeens.getDataEntragaDocumentosVistos()!= null) {
            if (!programasTeens.getDataEntragaDocumentosVistos().equals(programasTeensAlterado.getDataEntragaDocumentosVistos())) {
                dadosAlterado = dadosAlterado + "Data Entrega dos Documentos Vistos : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDataEntragaDocumentosVistos()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDataEntragaDocumentosVistos()) + "<br></br>";
            }
        }
        if (programasTeens.getDataInicioCurso()!= null) {
            if (!programasTeens.getDataInicioCurso().equals(programasTeensAlterado.getDataInicioCurso())) {
                dadosAlterado = dadosAlterado + "Data Início Curso : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDataInicioCurso()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDataInicioCurso()) + "<br></br>";
            }
        }
        if (programasTeens.getDataPartidaAcomodacao()!= null) {
            if (!programasTeens.getDataPartidaAcomodacao().equals(programasTeensAlterado.getDataPartidaAcomodacao())) {
                dadosAlterado = dadosAlterado + "Data Partida Acomodação : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDataPartidaAcomodacao()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDataPartidaAcomodacao()) + "<br></br>";
            }
        }
        if (programasTeens.getDataTerminoCurso()!= null) {
            if (!programasTeens.getDataTerminoCurso().equals(programasTeensAlterado.getDataTerminoCurso())) {
                dadosAlterado = dadosAlterado + "Data Termino do Curso : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDataTerminoCurso()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDataTerminoCurso()) + "<br></br>";
            }
        }
        if (programasTeens.getDatanascimentomae()!= null) {
            if (!programasTeens.getDatanascimentomae().equals(programasTeensAlterado.getDatanascimentomae())) {
                dadosAlterado = dadosAlterado + "Data Nascimento Mãe : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDatanascimentomae()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDatanascimentomae()) + "<br></br>";
            }
        }
        if (programasTeens.getDatanascimentopai()!= null) {
            if (!programasTeens.getDatanascimentopai().equals(programasTeensAlterado.getDatanascimentopai())) {
                dadosAlterado = dadosAlterado + "Data Nascimento Pai : " + Formatacao.ConvercaoDataPadrao(programasTeens.getDatanascimentopai()) + " | " + Formatacao.ConvercaoDataPadrao(programasTeensAlterado.getDatanascimentopai()) + "<br></br>";
            }
        }
        
        if (programasTeens.getEmailContatoEmergencia()!= null) {
            if (!programasTeens.getEmailContatoEmergencia().equalsIgnoreCase(programasTeensAlterado.getEmailContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Email Contato de Emergencia : " + programasTeens.getEmailContatoEmergencia() + " | " + programasTeensAlterado.getEmailContatoEmergencia() + "<br></br>";
            }
        }
        if (programasTeens.getFoneContatoEmergencia()!= null) {
            if (!programasTeens.getFoneContatoEmergencia().equals(programasTeensAlterado.getFoneContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Telefone de Contato Emergencia : " + programasTeens.getFoneContatoEmergencia() + " | " + programasTeensAlterado.getFoneContatoEmergencia() + "<br></br>";
            }
        }
        if (programasTeens.getNomeContatoEmergencia()!= null) {
            if (!programasTeens.getNomeContatoEmergencia().equalsIgnoreCase(programasTeensAlterado.getNomeContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Nome Contato de Emergencia : " + programasTeens.getNomeContatoEmergencia() + " | " + programasTeensAlterado.getNomeContatoEmergencia() + "<br></br>";
            }
        }
        if (programasTeens.getNumeroSemanas()!= null) {
            if (programasTeens.getNumeroSemanas()!= programasTeensAlterado.getNumeroSemanas()) {
                dadosAlterado = dadosAlterado + "Nº Semanas : " + String.valueOf(programasTeens.getNumeroSemanas()) + " | " + String.valueOf(programasTeensAlterado.getNumeroSemanas()) + "<br></br>";
            }
        }
        if (programasTeens.getNumeroSemanasAcomodacao()!= null) {
            if (programasTeens.getNumeroSemanasAcomodacao()!= programasTeensAlterado.getNumeroSemanasAcomodacao()) {
                dadosAlterado = dadosAlterado + "Nº Semanas Acomodação : " + String.valueOf(programasTeens.getNumeroSemanasAcomodacao()) + " | " + String.valueOf(programasTeensAlterado.getNumeroSemanasAcomodacao()) + "<br></br>";
            }
        }
        if (programasTeens.getNomeCurso()!= null) {
            if (!programasTeens.getNomeCurso().equalsIgnoreCase(programasTeensAlterado.getNomeCurso())) {
                dadosAlterado = dadosAlterado + "Nome do Curso : " + programasTeens.getNomeCurso() + " | " + programasTeensAlterado.getNomeCurso() + "<br></br>";
            }
        }
        if (programasTeens.getObservacaoVistos()!= null) {
            if (!programasTeens.getObservacaoVistos().equalsIgnoreCase(programasTeensAlterado.getObservacaoVistos())) {
                dadosAlterado = dadosAlterado + "Observações Visto : " + programasTeens.getObservacaoVistos() + " | " + programasTeensAlterado.getObservacaoVistos() + "<br></br>";
            }
        }
        if (programasTeens.getObstm()!= null) {
            if (!programasTeens.getObstm().equalsIgnoreCase(programasTeensAlterado.getObstm())) {
                dadosAlterado = dadosAlterado + "Obs TM :  " + programasTeens.getObstm() + " | " + programasTeensAlterado.getObstm() + "<br></br>";
            }
        }
        if (programasTeens.getPaisCurso()!= null) {
            if (!programasTeens.getPaisCurso().equalsIgnoreCase(programasTeensAlterado.getPaisCurso())) {
                dadosAlterado = dadosAlterado + "País do Curso : " + programasTeens.getPaisCurso() + " | " + programasTeensAlterado.getPaisCurso() + "<br></br>";
            }
        }
        if (programasTeens.getRelacaoContatoEmergencia()!= null) {
            if (!programasTeens.getRelacaoContatoEmergencia().equalsIgnoreCase(programasTeensAlterado.getRelacaoContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Relação Contato de Emergencia : " + programasTeens.getRelacaoContatoEmergencia() + " | " + programasTeensAlterado.getRelacaoContatoEmergencia() + "<br></br>";
            }
        }
        if (programasTeens.getSolicitarVisto()!= null) {
            if (!programasTeens.getSolicitarVisto().equalsIgnoreCase(programasTeensAlterado.getSolicitarVisto())) {
                dadosAlterado = dadosAlterado + "Solicitar Visto : " + programasTeens.getSolicitarVisto() + " | " + programasTeensAlterado.getSolicitarVisto() + "<br></br>";
            }
        }
        if (programasTeens.getTipoAcomodacao()!= null) {
            if (!programasTeens.getTipoAcomodacao().equalsIgnoreCase(programasTeensAlterado.getTipoAcomodacao())) {
                dadosAlterado = dadosAlterado + "Tipo Acomodação : " + programasTeens.getTipoAcomodacao() + " | " + programasTeensAlterado.getTipoAcomodacao() + "<br></br>";
            }
        }
        if (programasTeens.getTipoPrograma()!= null) {
            if (!programasTeens.getTipoPrograma().equalsIgnoreCase(programasTeensAlterado.getTipoPrograma())) {
                dadosAlterado = dadosAlterado + "Tipo Programa : " + programasTeens.getTipoPrograma() + " | " + programasTeensAlterado.getTipoPrograma() + "<br></br>";
            }
        }
        if (programasTeens.getTipoSolicitacao()!= null) {
            if (!programasTeens.getTipoSolicitacao().equalsIgnoreCase(programasTeensAlterado.getTipoSolicitacao())) {
                dadosAlterado = dadosAlterado + "Tipo Solicitações : " + programasTeens.getTipoSolicitacao() + " | " + programasTeensAlterado.getTipoSolicitacao() + "<br></br>";
            }
        }
        
        if (valorVendaAlterar != venda.getValor()) {
                dadosAlterado = dadosAlterado + "Valor Total : " + Formatacao.formatarFloatString(venda.getValor()) + " | " + Formatacao.formatarFloatString(valorVendaAlterar) + "<br></br>";
        }
    }
}
