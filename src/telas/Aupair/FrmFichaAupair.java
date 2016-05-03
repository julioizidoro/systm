/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Aupair;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.AupairController;
import controller.CambioController;
import controller.ClienteController;
import controller.ContasReceberController;
import controller.FollowupController;
import controller.FormaPagamentoController;
import controller.OrcamentoController;
import controller.ParcelamentoPagamentoController;
import controller.ProdutoOrcamentoController;
import controller.ProdutoRemessaController;
import controller.SeguroViagemController;
import controller.ValorAupairController;
import controller.ValorSeguroController;
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
import model.Aupair;
import model.Cambio;
import model.Cliente;
import model.Contasreceber;
import model.Controleaupair;
import model.Formapagamento;
import model.Fornecedorcidade;
import model.Invoices;
import model.Moedas;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Parcelamentopagamento;
import model.Produtoremessa;
import model.Produtos;
import model.Produtosorcamento;
import model.Seguroviagem;
import model.Valoresaupair;
import model.Valoresseguro;
import model.Vendas;
import model.Vendascomissao;
import model.Vistos;
import model.view.Viewprodutosfiltro;
import telas.Aupair.Valores.FrmConsultaValoresAupair;
import telas.Cliente.FrmConsultaCliente;
import telas.Comissao.ComissaoAuPair;
import telas.Cursos.ConsultaParcelamentoPagamentoTableModel;
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
public class FrmFichaAupair extends javax.swing.JFrame implements IAupair{
    
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
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoApagarBean;
    private Aupair aupair;
    private Aupair aupairAlterado;
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
    private IConsultaAupair telaConsulta;
    private Fornecedorcidade fornecedorSeguroCidade;
    private ConsultaParcelamentoPagamentoTableModel modelParcelamento;
    private List<Parcelamentopagamento> listaParcelamento;
    private Date dataCambio;
    private boolean novaFicha = false;
    String caracteres = "0987654321-()";
    private String situacao="PROCESSO";
    private Valoresaupair valorAupair;
    private Valoresseguro valoresSeguro;
    private float valorTotalInicial=0.0f;
    private float valorVendaAlterar=0.0f;
    private String dadosAlterado;
    

    /**
     * Creates new form FrmFichaCursos
     */
    public FrmFichaAupair(int idVenda, UsuarioLogadoBean usuarioLogado,IConsultaAupair telaConsulta, Date dataCambio) {
        this.telaConsulta = telaConsulta;
        this.usuarioLogadoBean = usuarioLogado;
        datePattern = "dd/MM/yyyy";
        maskPattern = "##/##/##";
        placeHolder = '_';
        this.dataCambio = dataCambio;
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
        jCheckBox1 = new javax.swing.JCheckBox();
        conhecidobuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cursosjTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeClientejTextField = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        amigoSimjCheckBox = new javax.swing.JCheckBox();
        amigoNaojCheckBox = new javax.swing.JCheckBox();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        nomeconhecidojTextField = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        enderecoConhecidojTextField = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        nivelEstudojTextField = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        instituicaojTextField = new javax.swing.JTextField();
        cursojTextField = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        duracaoCursojTextField = new javax.swing.JTextField();
        periodoCursojTextField = new javax.swing.JTextField();
        ocupacaoAlunojTextField = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        foneConhecidojTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        descricaoAupairjTextField = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        relacaoconhecidojTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        paisjComboBox = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        idioma01jTextField = new javax.swing.JTextField();
        idioma02jTextField = new javax.swing.JTextField();
        idioma03jTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nivel02jComboBox = new javax.swing.JComboBox();
        nivel03jComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        dataInicio01jDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    dataTermino01jDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel6 = new javax.swing.JLabel();
jPanel18 = new javax.swing.JPanel();
passagemTravelMatejCheckBox = new javax.swing.JCheckBox();
passagemClientejCheckBox = new javax.swing.JCheckBox();
jLabel78 = new javax.swing.JLabel();
observacaoPassagemAereajTextField = new javax.swing.JTextField();
jPanel20 = new javax.swing.JPanel();
jLabel79 = new javax.swing.JLabel();
nomeContatoEmergenciajTextField = new javax.swing.JTextField();
jLabel80 = new javax.swing.JLabel();
emailConatoEmergenciajTextField = new javax.swing.JTextField();
jLabel82 = new javax.swing.JLabel();
relacaoEmergenciajTextField = new javax.swing.JTextField();
telefoneEmergenciajCheckBox = new javax.swing.JCheckBox();
telefoneEmergenciajTextField = new javax.swing.JTextField();
nivel01jComboBox = new javax.swing.JComboBox();
jPanel8 = new javax.swing.JPanel();
jPanel9 = new javax.swing.JPanel();
jLabel34 = new javax.swing.JLabel();
jLabel35 = new javax.swing.JLabel();
seguradorajTextField = new javax.swing.JTextField();
jLabel36 = new javax.swing.JLabel();
planosegurojTextField = new javax.swing.JTextField();
jLabel37 = new javax.swing.JLabel();
dataInicioSegurojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel39 = new javax.swing.JLabel();
    numeroSemanaSegurosjTextField = new javax.swing.JTextField();
    seguroViagemSemjRadioButton = new javax.swing.JRadioButton();
    seguroViagemNaojRadioButton = new javax.swing.JRadioButton();
    valorSegurojTextField = new javax.swing.JTextField();
    jLabel65 = new javax.swing.JLabel();
    jLabel38 = new javax.swing.JLabel();
    dataTerminoSegurojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
selecionarSeguradorajButton = new javax.swing.JButton();
jPanel10 = new javax.swing.JPanel();
vistoTravelMatejCheckBox = new javax.swing.JCheckBox();
vistoClientejCheckBox = new javax.swing.JCheckBox();
jLabel40 = new javax.swing.JLabel();
dataEntregaVistojDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel41 = new javax.swing.JLabel();
    observacaoVistojTextField = new javax.swing.JTextField();
    jPanel5 = new javax.swing.JPanel();
    cartaoVTMSimjRadioButton = new javax.swing.JRadioButton();
    cartaoVTMNaojRadioButton = new javax.swing.JRadioButton();
    numeroCartaoVTMjTextField = new javax.swing.JTextField();
    jLabel26 = new javax.swing.JLabel();
    moedaCartaoVTMjComboBox = new javax.swing.JComboBox();
    jLabel27 = new javax.swing.JLabel();
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
    jLabel33 = new javax.swing.JLabel();
    saldoReceberjTextField = new javax.swing.JTextField();
    jLabel42 = new javax.swing.JLabel();
    saldoParcelarjTextField = new javax.swing.JTextField();
    buscaBancojButton4 = new javax.swing.JButton();
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

jCheckBox1.setText("jCheckBox1");

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Ficha de Au Pair");

jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

    jLabel5.setText("Você tem amigos ou familiares no país para qual deseja ir?");

    conhecidobuttonGroup.add(amigoSimjCheckBox);
    amigoSimjCheckBox.setText("Sim");
    amigoSimjCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            amigoSimjCheckBoxItemStateChanged(evt);
        }
    });
    amigoSimjCheckBox.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            amigoSimjCheckBoxActionPerformed(evt);
        }
    });

    conhecidobuttonGroup.add(amigoNaojCheckBox);
    amigoNaojCheckBox.setSelected(true);
    amigoNaojCheckBox.setText("Não");

    jLabel29.setText("País de Interesse :");

    jLabel30.setText("Em caso positivo, indique :");

    jLabel51.setText("Nome");

    nomeconhecidojTextField.setEnabled(false);

    jLabel69.setText("Endereço");

    enderecoConhecidojTextField.setEnabled(false);

    jLabel71.setText("Telefone");

    jLabel72.setText("Nível de Estudo");

    jLabel73.setText("Instituição onde Estuda");

    jLabel74.setText("Curso");

    jLabel75.setText("Ocupação");

    jLabel76.setText("Duração do Curso");

    jLabel83.setText("Cursando Atualmente qual período/ano?");

    foneConhecidojTextField.setEnabled(false);

    jLabel7.setText("Selecionar Valores Au Pair");

    descricaoAupairjTextField.setEditable(false);
    descricaoAupairjTextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            descricaoAupairjTextFieldActionPerformed(evt);
        }
    });

    jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton9.setText("Selecionar");
    jButton9.setToolTipText("Selecionar Cliente");
    jButton9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton9ActionPerformed(evt);
        }
    });

    relacaoconhecidojTextField1.setEnabled(false);

    jLabel9.setText("Relação");

    paisjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione País", "Alemanha", "Caregiver", "Demi Pair AUS", "EUA", "França", "Holanda" }));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(nomeClientejTextField)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(instituicaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(cursojTextField))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel73)
                        .addComponent(jLabel72)
                        .addComponent(nivelEstudojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(jLabel74)
                            .addGap(111, 111, 111))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel75)
                                    .addGap(0, 389, Short.MAX_VALUE))
                                .addComponent(ocupacaoAlunojTextField)))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(duracaoCursojTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                        .addComponent(jLabel76, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(descricaoAupairjTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(periodoCursojTextField)
                                .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nomeconhecidojTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                        .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(enderecoConhecidojTextField, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(foneConhecidojTextField)
                        .addComponent(relacaoconhecidojTextField1)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel71)
                                .addComponent(jLabel9))
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel30)
                        .addComponent(jLabel7)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(5, 5, 5)
                                .addComponent(amigoSimjCheckBox)
                                .addGap(18, 18, 18)
                                .addComponent(amigoNaojCheckBox))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(paisjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel29)
                .addComponent(paisjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(amigoSimjCheckBox)
                .addComponent(amigoNaojCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel30)
            .addGap(3, 3, 3)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel51)
                .addComponent(jLabel71))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nomeconhecidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(foneConhecidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel69)
                .addComponent(jLabel9))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(enderecoConhecidojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(relacaoconhecidojTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel72)
                .addComponent(jLabel75))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(nivelEstudojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(ocupacaoAlunojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel73)
                .addComponent(jLabel74))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(instituicaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel76)
                .addComponent(jLabel83))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(duracaoCursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(periodoCursojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(descricaoAupairjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton9))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Informações", jPanel2);

    jLabel2.setText("Idioma");

    jLabel3.setText("Nível");

    nivel02jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intermediário baixo", "Intermediário alto", "Avançado", "Fluente" }));

    nivel03jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intermediário baixo", "Intermediário alto", "Avançado", "Fluente" }));

    jLabel4.setText("Data de Início Pretendida entre");

    dataInicio01jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataInicio01jDateChooserFocusGained(evt);
        }
    });

    dataTermino01jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataTermino01jDateChooserFocusGained(evt);
        }
    });

    jLabel6.setText("Data máxima para embarque pretendida");

    jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Passagem Aérea quando não inclusa no programa"));

    passagemAereabuttonGroup.add(passagemTravelMatejCheckBox);
    passagemTravelMatejCheckBox.setText("Através da TravelMate");

    passagemAereabuttonGroup.add(passagemClientejCheckBox);
    passagemClientejCheckBox.setSelected(true);
    passagemClientejCheckBox.setText("Cliente providenciará");

    jLabel78.setText("Observação");

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(observacaoPassagemAereajTextField)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel78)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(passagemTravelMatejCheckBox)
                            .addGap(44, 44, 44)
                            .addComponent(passagemClientejCheckBox)))
                    .addGap(0, 352, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(passagemTravelMatejCheckBox)
                .addComponent(passagemClientejCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jLabel78)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(observacaoPassagemAereajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato de Emergência no Brasil"));

    jLabel79.setText("Nome");

    jLabel80.setText("E-mail");

    jLabel82.setText("Relação");

    telefoneEmergenciajCheckBox.setText("9-Telefone");
    telefoneEmergenciajCheckBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            telefoneEmergenciajCheckBoxItemStateChanged(evt);
        }
    });

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
                        .addComponent(jLabel80)
                        .addComponent(jLabel79))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefoneEmergenciajTextField)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel82)
                                .addComponent(telefoneEmergenciajCheckBox))
                            .addGap(0, 0, Short.MAX_VALUE)))))
            .addContainerGap())
    );
    jPanel20Layout.setVerticalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addComponent(jLabel79)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nomeContatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addComponent(telefoneEmergenciajCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(telefoneEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel80)
                .addComponent(jLabel82))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailConatoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(relacaoEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(18, Short.MAX_VALUE))
    );

    nivel01jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Intermediário baixo", "Intermediário alto", "Avançado", "Fluente" }));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(dataInicio01jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 540, Short.MAX_VALUE))
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(idioma01jTextField)
                        .addComponent(idioma02jTextField)
                        .addComponent(idioma03jTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addGap(186, 186, 186))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nivel02jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nivel03jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(dataTermino01jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)))
                                .addComponent(nivel01jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(idioma01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nivel01jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(idioma02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nivel02jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(idioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nivel03jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataInicio01jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataTermino01jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Nível Idioma/Passagem/Contato", jPanel3);

    jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Seguro Viagem"));

    jLabel34.setText("Seguro Viagem");

    jLabel35.setText("Seguradora");

    seguradorajTextField.setEditable(false);
    seguradorajTextField.setEnabled(false);

    jLabel36.setText("Plano");

    planosegurojTextField.setEnabled(false);
    planosegurojTextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            planosegurojTextFieldActionPerformed(evt);
        }
    });

    jLabel37.setText("Data do início");

    dataInicioSegurojDateChooser.setEnabled(false);
    dataInicioSegurojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataInicioSegurojDateChooserFocusGained(evt);
        }
    });

    jLabel39.setText("Nº Semanas (Somente Números)");

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
    numeroSemanaSegurosjTextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            numeroSemanaSegurosjTextFieldActionPerformed(evt);
        }
    });
    numeroSemanaSegurosjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            numeroSemanaSegurosjTextFieldKeyTyped(evt);
        }
    });

    seguroViagembuttonGroup.add(seguroViagemSemjRadioButton);
    seguroViagemSemjRadioButton.setText("Sim");
    seguroViagemSemjRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            seguroViagemSemjRadioButtonItemStateChanged(evt);
        }
    });

    seguroViagembuttonGroup.add(seguroViagemNaojRadioButton);
    seguroViagemNaojRadioButton.setSelected(true);
    seguroViagemNaojRadioButton.setText("Não");
    seguroViagemNaojRadioButton.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            seguroViagemNaojRadioButtonItemStateChanged(evt);
        }
    });

    valorSegurojTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    valorSegurojTextField.setEnabled(false);
    valorSegurojTextField.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusLost(java.awt.event.FocusEvent evt) {
            valorSegurojTextFieldFocusLost(evt);
        }
    });
    valorSegurojTextField.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            valorSegurojTextFieldActionPerformed(evt);
        }
    });
    valorSegurojTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorSegurojTextFieldKeyTyped(evt);
        }
    });

    jLabel65.setText("Valor do Seguro");

    jLabel38.setText("Data do término");

    dataTerminoSegurojDateChooser.setEnabled(false);
    dataTerminoSegurojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataTerminoSegurojDateChooserFocusGained(evt);
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

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel36)
                            .addGap(0, 260, Short.MAX_VALUE))
                        .addComponent(planosegurojTextField))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(seguradorajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(selecionarSeguradorajButton))
                        .addComponent(jLabel35)))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel34)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(seguroViagemSemjRadioButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(seguroViagemNaojRadioButton)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel37)
                        .addComponent(dataInicioSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel39))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(numeroSemanaSegurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(dataTerminoSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jLabel38)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel65)
                        .addComponent(valorSegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(30, 30, 30)))
            .addContainerGap())
    );
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel9Layout.createSequentialGroup()
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel34)
                            .addGap(25, 25, 25))
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seguroViagemSemjRadioButton)
                            .addComponent(seguroViagemNaojRadioButton))))
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jLabel37)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataInicioSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel38)
                                .addComponent(jLabel39)
                                .addComponent(jLabel65))
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(numeroSemanaSegurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(valorSegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(dataTerminoSegurojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jLabel36))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(seguradorajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(selecionarSeguradorajButton)
                        .addComponent(planosegurojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Solicitação de Visto Consular"));

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

    jLabel40.setText("Data Entrega Documentos");

    dataEntregaVistojDateChooser.setEnabled(false);
    dataEntregaVistojDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataEntregaVistojDateChooserFocusGained(evt);
        }
    });

    jLabel41.setText("Observação");

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel10Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(dataEntregaVistojDateChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(observacaoVistojTextField)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addComponent(jLabel41)
                            .addGap(0, 415, Short.MAX_VALUE)))
                    .addGap(118, 118, 118))
                .addGroup(jPanel10Layout.createSequentialGroup()
                    .addComponent(vistoTravelMatejCheckBox)
                    .addGap(18, 18, 18)
                    .addComponent(vistoClientejCheckBox)
                    .addContainerGap(455, Short.MAX_VALUE))))
    );
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel10Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(vistoTravelMatejCheckBox)
                .addComponent(vistoClientejCheckBox))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel40))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(dataEntregaVistojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(observacaoVistojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

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

    moedaCartaoVTMjComboBox.setEditable(true);
    moedaCartaoVTMjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "   ", "Euro", "Dólar Americano", "Dólar Canadense", "Dolár Australiano", "Libra" }));
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
                .addComponent(moedaCartaoVTMjComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(91, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Seguro/Vistos/Cartão VTM", jPanel8);

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
            .addContainerGap()
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(121, 121, 121))
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
                .addComponent(jScrollPane1)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel46)
                        .addComponent(produtoOrcaemntojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorProdutosMoedaEstrangeirajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addComponent(valorProdutosMoedaRealjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap())
        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel12Layout.createSequentialGroup()
            .addGap(235, 235, 235)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18))
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

    jLabel33.setText("Saldo a Receber");

    saldoReceberjTextField.setEditable(false);
    saldoReceberjTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
    saldoReceberjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyTyped(java.awt.event.KeyEvent evt) {
            saldoReceberjTextFieldKeyTyped(evt);
        }
    });

    jLabel42.setText("Saldo a Parcelar");

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
                    .addGap(18, 18, 18)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel56)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buscaBancojButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel68)
                        .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33)
                        .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel42))))
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
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(buscaBancojButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(jLabel42)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(jLabel33)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(18, Short.MAX_VALUE))
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
        public void keyReleased(java.awt.event.KeyEvent evt) {
            valorParcelajTextFieldKeyReleased(evt);
        }
        public void keyTyped(java.awt.event.KeyEvent evt) {
            valorParcelajTextFieldKeyTyped(evt);
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
                        .addComponent(jLabel58)
                        .addComponent(valorParcelamentojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(109, 109, 109)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel59)
                        .addComponent(numeroParcelasjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorParcelajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel62)
                        .addComponent(meioPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tipoParcelamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel61))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(23, 23, 23))
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
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addGap(223, 223, 223)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel15Layout.setVerticalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    observacoesjTextArea.setLineWrap(true);
    observacoesjTextArea.setRows(5);
    observacoesjTextArea.setWrapStyleWord(true);
    jScrollPane3.setViewportView(observacoesjTextArea);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
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
                    .addGap(0, 159, Short.MAX_VALUE)))
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
    jButton5.setToolTipText("Confirma Cadastro da Ficha de Au Pair");
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
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(cursosjTabbedPane)
            .addContainerGap())
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(189, 189, 189)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(cursosjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 495, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataInicioSegurojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicioSegurojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicioSegurojDateChooserFocusGained

    private void dataTerminoSegurojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTerminoSegurojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTerminoSegurojDateChooserFocusGained

    private void dataEntregaVistojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataEntregaVistojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataEntregaVistojDateChooserFocusGained

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

    private void seguroViagemSemjRadioButtonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_seguroViagemSemjRadioButtonItemStateChanged
        if (seguroViagemSemjRadioButton.isSelected()){
            if (seguroViagem==null){
                this.seguroViagem = new Seguroviagem();
            }
            selecionarSeguradorajButton.setEnabled(true);
            seguradorajTextField.setEnabled(true);
            planosegurojTextField.setEnabled(true);
            dataInicioSegurojDateChooser.setEnabled(true);
            dataTerminoSegurojDateChooser.setEnabled(true);
            numeroSemanaSegurosjTextField.setEnabled(true);
            valorSegurojTextField.setEnabled(true);
            seguradorajTextField.requestFocus();
            seguradorajTextField.selectAll();
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
            seguroViagem = null;
        }
    }//GEN-LAST:event_seguroViagemNaojRadioButtonItemStateChanged

    private void vistoTravelMatejCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vistoTravelMatejCheckBoxItemStateChanged
        if (vistoTravelMatejCheckBox.isSelected()){
            dataEntregaVistojDateChooser.setEnabled(true);
            observacaoVistojTextField.setEnabled(false);
        }else {
            dataEntregaVistojDateChooser.setEnabled(false);
            observacaoVistojTextField.setEnabled(true);
        }
    }//GEN-LAST:event_vistoTravelMatejCheckBoxItemStateChanged

    private void vistoClientejCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vistoClientejCheckBoxItemStateChanged
        if(vistoClientejCheckBox.isSelected()){
            dataEntregaVistojDateChooser.setEnabled(false);
        }
    }//GEN-LAST:event_vistoClientejCheckBoxItemStateChanged

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

    private void numeroSemanaSegurosjTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldFocusGained
        if (numeroSemanaSegurosjTextField.isEnabled()){
            if (dataInicioSegurojDateChooser.getDate()!=null){
                if (dataTerminoSegurojDateChooser.getDate()!=null){
                    Integer dias = Formatacao.calcularNumeroSemanas(dataInicioSegurojDateChooser.getDate(),dataTerminoSegurojDateChooser.getDate());
                    numeroSemanaSegurosjTextField.setText(dias.toString());
                }
            }else {
                JOptionPane.showMessageDialog(rootPane, "Data Inicio do Seguro Inválida");
            }
        }
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldFocusGained

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
        if (linha >= 0) {
            listaProdutoOrcamentoBean.get(linha).setApagar(true);
            if (listaProdutoOrcamentoBean.get(linha).isSeguro()) {
                seguroViagemNaojRadioButton.setSelected(true);
            }
            if (listaProdutoOrcamentoBean.get(linha).isVisto()) {
                vistoTravelMatejCheckBox.setSelected(false);
            }
            listaProdutoOrcamentoApagarBean.add(listaProdutoOrcamentoBean.get(linha));
            listaProdutoOrcamentoBean.remove(linha);
            calcularValorTotalOrcamento();
            carregarModelOrcamentoProduto();
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
            salvarAupair();
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
                if (this.aupair.getIdaupair()!=null){
                    if (vendaAlterada!=null){
                        verificarDadosAlterado();
                    }
                }
                emitirEmailGerencial();
                verificarAlteracaoCambio();
            }
            JOptionPane.showMessageDialog(rootPane, "Au Pair Salvo com Sucesso");
            telaConsulta.setModel();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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

    private void numeroSemanaSegurosjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldFocusLost
         if (dataInicioSegurojDateChooser.getDate()!=null){
            if (numeroSemanaSegurosjTextField.getText().length()>0){
                dataTerminoSegurojDateChooser.setDate(Formatacao.calcularDataFinal(dataInicioSegurojDateChooser.getDate(), Integer.parseInt(numeroSemanaSegurosjTextField.getText())));
            }
        }
        if ((dataTerminoSegurojDateChooser.getDate()==null) && (numeroSemanaSegurosjTextField.getText().length()==0)){
            JOptionPane.showMessageDialog(rootPane, "Preencha numero de Semanas e/ou data término");
            numeroSemanaSegurosjTextField.requestFocus();
        }
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldFocusLost

    private void cursosjTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneMouseClicked
    }//GEN-LAST:event_cursosjTabbedPaneMouseClicked

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

    private void numeroSemanaSegurosjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldKeyTyped
      
        String caracteres = "0987654321";
        if (evt.getKeyChar() != '\b') {
            if (!caracteres.contains(evt.getKeyChar() + "")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldKeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new FrmConsultaCliente(usuarioLogadoBean, this);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void selecionarSeguradorajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarSeguradorajButtonActionPerformed
        if (numeroSemanaSegurosjTextField.getText().length()>0){
            new FrmConsultaValoresSeguro(usuarioLogadoBean, this);
        }else {
            JOptionPane.showMessageDialog(paisjComboBox, "Informe o número de semanas para o seguro");
            dataInicioSegurojDateChooser.requestFocus();
        }
    }//GEN-LAST:event_selecionarSeguradorajButtonActionPerformed

    private void dataInicio01jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataInicio01jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataInicio01jDateChooserFocusGained

    private void dataTermino01jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataTermino01jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataTermino01jDateChooserFocusGained

    private void amigoSimjCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_amigoSimjCheckBoxItemStateChanged
        if (amigoSimjCheckBox.isSelected()){
            nomeconhecidojTextField.setEnabled(true);
            enderecoConhecidojTextField.setEnabled(true);
            foneConhecidojTextField.setEnabled(true);
            relacaoconhecidojTextField1.setEnabled(true);
        }else if (amigoNaojCheckBox.isSelected()){
            nomeconhecidojTextField.setEnabled(false);
            enderecoConhecidojTextField.setEnabled(false);
            foneConhecidojTextField.setEnabled(false);
            relacaoconhecidojTextField1.setEnabled(false);
            nomeconhecidojTextField.setText("");
            enderecoConhecidojTextField.setText("");
            foneConhecidojTextField.setText("");
            relacaoconhecidojTextField1.setText("");
        }
    }//GEN-LAST:event_amigoSimjCheckBoxItemStateChanged

    private void condicaoPagamentojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_condicaoPagamentojComboBoxItemStateChanged

    }//GEN-LAST:event_condicaoPagamentojComboBoxItemStateChanged

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

    private void saldoReceberjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoReceberjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoReceberjTextFieldKeyTyped

    private void saldoParcelarjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoParcelarjTextFieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoParcelarjTextFieldKeyTyped

    private void meioPagamentojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meioPagamentojComboBoxItemStateChanged
        
    }//GEN-LAST:event_meioPagamentojComboBoxItemStateChanged

    private void valorParcelamentojTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_valorParcelamentojTextFieldFocusLost
        if (valorParcelamentojTextField.getText().length()>0){
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

    private void valorParcelajTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorParcelajTextFieldKeyPressed
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
    }//GEN-LAST:event_valorParcelajTextFieldKeyPressed

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

    private void numeroParcelasjComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_numeroParcelasjComboBoxItemStateChanged
        if (valorParcelamentojTextField.getText().length()>0){
            float valor = Formatacao.formatarStringfloat(valorParcelamentojTextField.getText());
            valorParcelamentojTextField.setText(Formatacao.formatarFloatString(valor));
            int numero = Integer.parseInt(numeroParcelasjComboBox.getSelectedItem().toString());
            float vParcela = valor / numero;
            valorParcelajTextField.setText(Formatacao.formatarFloatString(vParcela));
        }// TODO add your handling code here:
    }//GEN-LAST:event_numeroParcelasjComboBoxItemStateChanged

    private void cursosjTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneStateChanged
        if (cursosjTabbedPane.getSelectedIndex() == 3) {
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
            
            
            valorEstrangeira = 0.0f;
            valorReal = 0.0f;
            if (seguroViagem != null) {
                ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
                Produtosorcamento produto = produtoOrcamentoController.consultar(usuarioLogadoBean.getParametrosprodutos().getSeguroOrcamento());
                ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                pob.setIdOrcamentoProdutoOrcamento(0);
                pob.setDescricaoProdutoOrcamento(produto.getDescricao());
                pob.setIdProdutoOrcamento(produto.getIdprodutosOrcamento());
                if (valorSegurojTextField.getText().length()>0){
                    pob.setValorMoedaEstrangeira(0.0f);
                    valorEstrangeira = pob.getValorMoedaEstrangeira();
                    valorReal = Formatacao.formatarStringfloat(valorSegurojTextField.getText());
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
            calcularValorTotalOrcamento();
            carregarModelOrcamentoProduto();
        }
    }//GEN-LAST:event_cursosjTabbedPaneStateChanged

    private void buscaBancojButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscaBancojButton4ActionPerformed
        new FrmCalculoJuros(this, valorTotal);
    }//GEN-LAST:event_buscaBancojButton4ActionPerformed

    private void telefoneEmergenciajCheckBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_telefoneEmergenciajCheckBoxItemStateChanged
        telefoneEmergenciajTextField.setText("");
        telefoneEmergenciajTextField.requestFocus();
    }//GEN-LAST:event_telefoneEmergenciajCheckBoxItemStateChanged

    private void telefoneEmergenciajTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefoneEmergenciajTextFieldFocusLost
        caracteres = "0987654321-()";
    }//GEN-LAST:event_telefoneEmergenciajTextFieldFocusLost

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

    private void telefoneEmergenciajTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefoneEmergenciajTextFieldKeyReleased

    }//GEN-LAST:event_telefoneEmergenciajTextFieldKeyReleased

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

    private void dataVencimentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataVencimentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentojDateChooserFocusGained

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new FrmConsultaValoresAupair(usuarioLogadoBean, this);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void numeroSemanaSegurosjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroSemanaSegurosjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroSemanaSegurosjTextFieldActionPerformed

    private void valorSegurojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorSegurojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorSegurojTextFieldActionPerformed

    private void descricaoAupairjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descricaoAupairjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descricaoAupairjTextFieldActionPerformed

    private void amigoSimjCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigoSimjCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amigoSimjCheckBoxActionPerformed

    private void planosegurojTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planosegurojTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_planosegurojTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup TranferbuttonGroup;
    private javax.swing.JCheckBox amigoNaojCheckBox;
    private javax.swing.JCheckBox amigoSimjCheckBox;
    private javax.swing.JButton buscaBancojButton3;
    private javax.swing.JButton buscaBancojButton4;
    private javax.swing.JRadioButton cartaoVTMNaojRadioButton;
    private javax.swing.JRadioButton cartaoVTMSimjRadioButton;
    private javax.swing.ButtonGroup cartaoVTMbuttonGroup;
    private javax.swing.JComboBox condicaoPagamentojComboBox;
    private javax.swing.ButtonGroup conhecidobuttonGroup;
    private javax.swing.JTextField cursojTextField;
    private javax.swing.JTabbedPane cursosjTabbedPane;
    private com.toedter.calendar.JDateChooser dataEntregaVistojDateChooser;
    private com.toedter.calendar.JDateChooser dataInicio01jDateChooser;
    private com.toedter.calendar.JDateChooser dataInicioSegurojDateChooser;
    private com.toedter.calendar.JDateChooser dataTermino01jDateChooser;
    private com.toedter.calendar.JDateChooser dataTerminoSegurojDateChooser;
    private com.toedter.calendar.JDateChooser dataVencimentojDateChooser;
    private javax.swing.JTextField descricaoAupairjTextField;
    private javax.swing.JTextField duracaoCursojTextField;
    private javax.swing.JTextField emailConatoEmergenciajTextField;
    private javax.swing.JTextField enderecoConhecidojTextField;
    private javax.swing.JTextField foneConhecidojTextField;
    private javax.swing.JTextField idioma01jTextField;
    private javax.swing.JTextField idioma02jTextField;
    private javax.swing.JTextField idioma03jTextField;
    private javax.swing.JTextField instituicaojTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
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
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
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
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox meioPagamentojComboBox;
    private javax.swing.JComboBox moedaCambiojComboBox;
    private javax.swing.JComboBox moedaCartaoVTMjComboBox;
    private javax.swing.JComboBox nivel01jComboBox;
    private javax.swing.JComboBox nivel02jComboBox;
    private javax.swing.JComboBox nivel03jComboBox;
    private javax.swing.JTextField nivelEstudojTextField;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTextField nomeContatoEmergenciajTextField;
    private javax.swing.JTextField nomeconhecidojTextField;
    private javax.swing.JTextField numeroCartaoVTMjTextField;
    private javax.swing.JComboBox numeroParcelasjComboBox;
    private javax.swing.JTextField numeroSemanaSegurosjTextField;
    private javax.swing.JTextArea obsTMjTextArea;
    private javax.swing.JTextField observacaoPassagemAereajTextField;
    private javax.swing.JTextField observacaoVistojTextField;
    private javax.swing.JTextArea observacoesjTextArea;
    private javax.swing.JTextField ocupacaoAlunojTextField;
    private javax.swing.JComboBox paisjComboBox;
    private javax.swing.JTable parcelamentojTable;
    private javax.swing.ButtonGroup passagemAereabuttonGroup;
    private javax.swing.JCheckBox passagemClientejCheckBox;
    private javax.swing.JCheckBox passagemTravelMatejCheckBox;
    private javax.swing.JTextField periodoCursojTextField;
    private javax.swing.JTextField planosegurojTextField;
    private javax.swing.JComboBox possuiJurosjComboBox;
    private javax.swing.JComboBox produtoOrcaemntojComboBox;
    private javax.swing.JTable produtoOrcamentojTable;
    private javax.swing.JTextField relacaoEmergenciajTextField;
    private javax.swing.JTextField relacaoconhecidojTextField1;
    private javax.swing.JTextField saldoParcelarjTextField;
    private javax.swing.JTextField saldoReceberjTextField;
    private javax.swing.JTextField seguradorajTextField;
    private javax.swing.JRadioButton seguroViagemNaojRadioButton;
    private javax.swing.JRadioButton seguroViagemSemjRadioButton;
    private javax.swing.ButtonGroup seguroViagembuttonGroup;
    private javax.swing.JButton selecionarSeguradorajButton;
    private javax.swing.ButtonGroup solicitacaoVistobuttonGroup;
    private javax.swing.JCheckBox telefoneEmergenciajCheckBox;
    private javax.swing.JTextField telefoneEmergenciajTextField;
    private javax.swing.ButtonGroup temAlergiabuttonGroup;
    private javax.swing.JComboBox tipoParcelamentojComboBox;
    private javax.swing.JTextField totalPagarjTextField;
    private javax.swing.JTextField valorCambiojTextField;
    private javax.swing.JTextField valorJurosjTextField;
    private javax.swing.JTextField valorOrcamentoFormajTextField;
    private javax.swing.JTextField valorParcelajTextField;
    private javax.swing.JTextField valorParcelamentojTextField;
    private javax.swing.JTextField valorProdutosMoedaEstrangeirajTextField;
    private javax.swing.JTextField valorProdutosMoedaRealjTextField;
    private javax.swing.JTextField valorSegurojTextField;
    private javax.swing.JTextField valorTotalOrcamentojTextField;
    private javax.swing.JCheckBox vistoClientejCheckBox;
    private javax.swing.JCheckBox vistoTravelMatejCheckBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            nomeClientejTextField.setText(cliente.getNome());
        }
    }
    
    public void carregarInicializacao(int idVenda){
        if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
            telefoneEmergenciajCheckBox.setText("8-Telefone");
        } else {
            telefoneEmergenciajCheckBox.setText("9-Telefone");
        }
        carregarModelOrcamentoProduto();
        carregarListaProdutos();
        carregarComboMoedas();
        if (idVenda>0){
            carregarObjetos(idVenda);
        }else{
            consultaCambio=true;
        }
    }
    
    public void carregarListaProdutos(){
        ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
        List<Viewprodutosfiltro> lista = produtoOrcamentoController.listarFiltroProdutosOrcamento(usuarioLogadoBean.getParametrosprodutos().getAupair());
        if (lista==null){
            lista = new ArrayList<Viewprodutosfiltro>();
        }
        produtoOrcaemntojComboBox = Formatacao.preencherComobox(lista, produtoOrcaemntojComboBox, false, null);
    }
    
    
    public void carregarModelOrcamentoProduto(){
        if (listaProdutoOrcamentoBean==null){
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

    @Override
    public void setCambio(Float valorCambio) {
        valorCambiojTextField.setText(Formatacao.formatarFloatString(valorCambio));
        this.valorCambio = valorCambio;
        cambioAlterado = "Não";
    }
    
    public void salvarVendas(String situacao){
        if (venda==null){
            venda = new Vendas();
            venda.setDataVenda(new Date());
            venda.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            venda.setUnidadenegocio(usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio());
            novaFicha = true;
        }else {
            if (venda.getSituacao().equalsIgnoreCase("PROCESSO")){
                venda.setDataVenda(new Date());
            }
        }
        VendasController vendasController = new VendasController();       
        venda.setCliente(cliente.getIdcliente());
        venda.setCambio(cambio.getIdcambio());
        venda.setProdutos(usuarioLogadoBean.getParametrosprodutos().getAupair());
        venda.setObstm(obsTMjTextArea.getText());
        venda.setVendasMatriz("S");
        venda.setSituacao(situacao);
        venda.setValor(Formatacao.formatarStringfloat(valorTotalOrcamentojTextField.getText()));
        venda.setFornecedor(valorAupair.getFornecedorcidade().getFornecedor().getIdfornecedor());
        venda.setFornecedorcidade(valorAupair.getFornecedorcidade());
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
        formaPagamento.setObservacoes(observacoesjTextArea.getText());
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
            seguroViagem.setValoresseguro(valoresSeguro);
            seguroViagem.setPaisDestino(valoresSeguro.getFornecedorcidade().getCidade().getPais().getNome());
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
    
    
    public void salvarAupair(){
        if (this.aupair==null){
            aupair = new Aupair();
        }
        aupair.setPaisinteresse(paisjComboBox.getSelectedItem().toString());
        if(amigoSimjCheckBox.isSelected()){
            aupair.setPossuiAmigosPais("Sim");
            aupair.setNomeAmigo(nomeconhecidojTextField.getText());
            aupair.setFoneAmigo(foneConhecidojTextField.getText());
            aupair.setEndercoAmigo(enderecoConhecidojTextField.getText());
            aupair.setRelacaoAmigo(relacaoconhecidojTextField1.getText());
        }else if(amigoNaojCheckBox.isSelected()){
            aupair.setPossuiAmigosPais("Não");
        }
        aupair.setNivelEstudo(nivelEstudojTextField.getText());
        aupair.setOcupacao(ocupacaoAlunojTextField.getText());
        aupair.setInituicaoEstuda(instituicaojTextField.getText());
        aupair.setCurso(cursojTextField.getText());
        aupair.setDuracaoCurso(duracaoCursojTextField.getText());
        aupair.setCursandoPeriodo(periodoCursojTextField.getText());
        aupair.setIdioma01(idioma01jTextField.getText());
        aupair.setIdioma02(idioma02jTextField.getText());
        aupair.setIdioma03(idioma03jTextField.getText());
        aupair.setNivelIdioma01(nivel01jComboBox.getSelectedItem().toString());
        aupair.setNivelIdioma02(nivel02jComboBox.getSelectedItem().toString());
        aupair.setNivelIdioma03(nivel03jComboBox.getSelectedItem().toString());
        aupair.setDataInicioPretendida01(dataInicio01jDateChooser.getDate());
        aupair.setDataTerminoPretendida01(dataTermino01jDateChooser.getDate());
        if (cartaoVTMSimjRadioButton.isSelected()){
            aupair.setCartaoVTM("Sim");
        }else if (cartaoVTMNaojRadioButton.isSelected()){
            aupair.setCartaoVTM("Não");
        }
        aupair.setNumeroCartao(numeroCartaoVTMjTextField.getText());
        aupair.setMoedaCartao(moedaCartaoVTMjComboBox.getSelectedItem().toString());
        if (passagemTravelMatejCheckBox.isSelected()){
            aupair.setTipoPassagem("Através TravelMate");
        }
        if (passagemClientejCheckBox.isSelected()){
            aupair.setTipoPassagem("Cliente providenciará");
        }
        aupair.setObservacaoPassagem(observacaoPassagemAereajTextField.getText());
        if (vistoTravelMatejCheckBox.isSelected()){
            aupair.setTipoSolicitacaoVisto("Atraves da TravelMate");
        }
        if (vistoClientejCheckBox.isSelected()){
            aupair.setTipoSolicitacaoVisto("Cliente providenciará");
        }
        if (vistoClientejCheckBox.isSelected()){
            aupair.setTipoSolicitacaoVisto("Cliente providenciará");
            aupair.setObservacaoVisto("");
        }else {
            aupair.setTipoSolicitacaoVisto("Através da TravelMate");
            aupair.setObservacaoVisto(observacaoVistojTextField.getText());
            aupair.setDataEntregaDocumentosVistos(dataEntregaVistojDateChooser.getDate());
        }
        aupair.setNomeContatoEmergencia(nomeContatoEmergenciajTextField.getText());
        aupair.setFoneContatoEmergencia(telefoneEmergenciajTextField.getText());
        aupair.setEmailContatoEmergencia(emailConatoEmergenciajTextField.getText());
        aupair.setRelacaoContatoEmergencia(relacaoEmergenciajTextField.getText());
        aupair.setDataInscricao(new Date());
        aupair.setValoresAupair(valorAupair.getIdvaloresAupair());
        aupair.setVendas(venda.getIdvendas());
        AupairController aupairsController = new AupairController();
        aupair = aupairsController.salvar(aupair);
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

            AupairController aupairController = new AupairController();
            this.aupair = aupairController.consultarAupair(idVenda);
            if (aupair != null) {
                carregarAupairAlteracao();
                carregarCamposAupair();
                if (aupair.getValoresAupair() > 0) {
                    ValorAupairController valorAupairController = new ValorAupairController();
                    this.valorAupair = valorAupairController.consultar(aupair.getValoresAupair());
                    descricaoAupairjTextField.setText(this.valorAupair.getDescricao());
                }
            }
        }

        

        SeguroViagemController seguroViagemController = new SeguroViagemController();
        this.seguroViagem = seguroViagemController.consultar(idVenda);
        if (seguroViagem != null) {
            if (seguroViagem.getPossuiSeguro().equalsIgnoreCase("Sim")) {
                carregarSeguro();
            }
        }
        carregarVisto();
        FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
        this.formaPagamento = formaPagamentoController.consultar(idVenda);
        if (formaPagamento != null) {
            carregarCamposFormaPagamento();
        }
        OrcamentoController orcamentoController = new OrcamentoController();
        orcamento = orcamentoController.consultar(idVenda);
        if (orcamento != null) {
            carregarOrcamento();
            carregarCambio();
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
                }
                carregarModelOrcamentoProduto();
                calcularValorTotalOrcamento();
            }
        }
        consultaCambio = true;
    }

    @Override
    public void liberarAltercaoCambio(Acesso acesso) {
        if (acesso!=null){
           new FrmAlterarValorCambio(this, true, this, acesso, usuarioLogadoBean.getUsuario().getIdusuario(), cambio.getValor());
        }else {
            JOptionPane.showMessageDialog(rootPane, "Acesso Negado");
        }
    }
    
    
   
    public void carregarCamposAupair(){
       obsTMjTextArea.setText(venda.getObstm());
        nomeClientejTextField.setText(cliente.getNome());
        paisjComboBox.setSelectedItem(aupair.getPaisinteresse());
        if (aupair.getPossuiAmigosPais().equalsIgnoreCase("sim")){
           amigoSimjCheckBox.setSelected(true);
       }else amigoNaojCheckBox.setSelected(true);
       paisjComboBox.setSelectedItem(aupair.getPaisinteresse());
       nomeconhecidojTextField.setText(aupair.getNomeAmigo());
       foneConhecidojTextField.setText(aupair.getFoneAmigo());
       enderecoConhecidojTextField.setText(aupair.getEndercoAmigo());
       relacaoconhecidojTextField1.setText(aupair.getRelacaoAmigo());
       nivelEstudojTextField.setText(aupair.getNivelEstudo());
       ocupacaoAlunojTextField.setText(aupair.getOcupacao());
       instituicaojTextField.setText(aupair.getInituicaoEstuda());
       cursojTextField.setText(aupair.getCurso());
       duracaoCursojTextField.setText(aupair.getDuracaoCurso());
       periodoCursojTextField.setText(aupair.getCursandoPeriodo());
       idioma01jTextField.setText(aupair.getIdioma01());
       idioma02jTextField.setText(aupair.getIdioma02());
       idioma03jTextField.setText(aupair.getIdioma03());
       nivel01jComboBox.setSelectedItem(aupair.getNivelIdioma01());
       nivel02jComboBox.setSelectedItem(aupair.getNivelIdioma02());
       nivel03jComboBox.setSelectedItem(aupair.getNivelIdioma03());
       dataInicio01jDateChooser.setDate(aupair.getDataInicioPretendida01());
       dataTermino01jDateChooser.setDate(aupair.getDataTerminoPretendida01());
        if (aupair.getCartaoVTM().equalsIgnoreCase("Sim")){
            cartaoVTMSimjRadioButton.setSelected(true);
        }else if (aupair.getCartaoVTM().equalsIgnoreCase("Não")){
            cartaoVTMNaojRadioButton.setSelected(false);
        }
        numeroCartaoVTMjTextField.setText(aupair.getNumeroCartao());
        moedaCartaoVTMjComboBox.setSelectedItem(aupair.getMoedaCartao());
        if (aupair.getTipoPassagem().equalsIgnoreCase("Através TravelMate")){
            passagemTravelMatejCheckBox.setSelected(true);
        }else if (aupair.getTipoPassagem().equalsIgnoreCase("Cliente providenciará")){
            passagemClientejCheckBox.setSelected(true);
        }
        observacaoPassagemAereajTextField.setText(aupair.getObservacaoPassagem());
        if (aupair.getTipoSolicitacaoVisto().equalsIgnoreCase("Através da TravelMate")){
            vistoTravelMatejCheckBox.setSelected(true);
        }else if (aupair.getTipoSolicitacaoVisto().equalsIgnoreCase("Cliente providenciará")){
            vistoClientejCheckBox.setSelected(true);
        }
        nomeContatoEmergenciajTextField.setText(aupair.getNomeContatoEmergencia());
        telefoneEmergenciajTextField.setText(aupair.getFoneContatoEmergencia());
        emailConatoEmergenciajTextField.setText(aupair.getEmailContatoEmergencia());
        relacaoEmergenciajTextField.setText(aupair.getRelacaoContatoEmergencia()); 
    }
    
    public void carregarCamposFormaPagamento(){
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
    
    public void carregarSeguro(){
        valoresSeguro = seguroViagem.getValoresseguro();
        seguroViagemSemjRadioButton.setSelected(true);
        seguradorajTextField.setText(seguroViagem.getSeguradora());
        valorSegurojTextField.setText(Formatacao.formatarFloatString(seguroViagem.getValorSeguro()));
        valorSeguro = seguroViagem.getValorSeguro();
        planosegurojTextField.setText(seguroViagem.getPlano());
        dataInicioSegurojDateChooser.setDate(seguroViagem.getDataInicio());
        dataTerminoSegurojDateChooser.setDate(seguroViagem.getDataTermino());
        numeroSemanaSegurosjTextField.setText(String.valueOf(seguroViagem.getNumeroSemanas()));
        seguradorajTextField.setText(valoresSeguro.getFornecedorcidade().getFornecedor().getNome());
    }
    
    public void carregarVisto(){
        vistoTravelMatejCheckBox.setSelected(true);
        dataEntregaVistojDateChooser.setDate(aupair.getDataEntregaDocumentosVistos());
        observacaoVistojTextField.setText(aupair.getObservacaoVisto());
    }
    
    public void carregarOrcamento(){
        valorCambio = orcamento.getValorCambio();
        cambioAlterado = orcamento.getCambioAlterado();
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

    
    public String validarDados(){
        String msg ="";
        if (valorAupair==null){
            msg = msg + "Campo Valor Au Pair não selecionado\r\n";
        }
        if (nomeClientejTextField.getText().length()==0){
            msg = msg + "Campo cliente não selecionado\r\n";
        }
        if (cursojTextField.getText().length()==0){
            msg = msg + "Curso não informado\r\n";
        }
        if (seguroViagemSemjRadioButton.isSelected()){
            if (seguradorajTextField.getText().length()==0){
                msg = msg + "Seguradora não informada\r\n";
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
        }
        double saldoParcelar = Formatacao.formatarStringfloat(saldoParcelarjTextField.getText());
        if (saldoParcelar>0){
            msg = msg + "Forma de Pagamento possui saldo a parcelar em aberto\r\n";
        }
        if (paisjComboBox.getSelectedItem().toString().equalsIgnoreCase("Selecione País")){
            msg = msg + "Selecione País\r\n";
        }
        return msg;
    }

    public void emitirEmailGerencial() {
        EnviarEmailBean email = new EnviarEmailBean();
        if (novaFicha) {
            if (aupair.getPaisinteresse().equalsIgnoreCase("Caregiver")) {
                email.setTitulo("Nova Ficha de Au Pair");
            } else {
                email.setTitulo("Nova Ficha de Au Pair");
            }
            email.setTipoAviso("Inclusão");
            email.setDataInclusao(Formatacao.ConvercaoDataPadrao(venda.getDataVenda()));
            email.setValor(Formatacao.formatarFloatString(venda.getValor()));
            Moedas moeda = (Moedas) moedaCambiojComboBox.getSelectedItem();
            email.setCambio(Formatacao.formatarFloatString(cambio.getValor()));
            email.setSiglaCambio(moeda.getSigla());
        } else {
            if (aupair.getPaisinteresse().equalsIgnoreCase("Caregiver")) {
                email.setTitulo("Ficha de Au Pair Canadá Alterada");
            } else {
                email.setTitulo("Ficha de Au Pair Alterada");
            }
            email.setTipoAviso("Alteração");
            email.setDataAlteracao(Formatacao.ConvercaoDataPadrao(new Date()));
            email.setDadosAlterados(dadosAlterado);
        }
        if (venda.getVendasMatriz().equalsIgnoreCase("S")){
            email.setTipoVenda("Venda pela Matriz");
        }else email.setTipoVenda("Venda pela Loja");
        if (valorAupair.getFornecedor()!=null){
            email.setNomeEscola(valorAupair.getFornecedor().getNome());
        }
        email.setUnidadeNegocio(usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia());
        email.setNomeCliente(cliente.getNome());
        email.setDatainicio(Formatacao.ConvercaoDataPadrao(aupair.getDataInicioPretendida01()));
        email.setConsultor(usuarioLogadoBean.getUsuario().getNome());
        email.setObsTM(aupair.getObstm());
        email.setIdProduto(usuarioLogadoBean.getParametrosprodutos().getAupair());
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
        cliente.setDataInicio(aupair.getDataInicioPretendida01());
        cliente.setDataTermino(aupair.getDataTerminoPretendida01());
        ClienteController clienteController = new ClienteController();
        cliente = clienteController.salvar(cliente);
    }
    
    public void verificarAlteracaoCambio(){
        if (cambioAlterado.equalsIgnoreCase("sim")){
            Formatacao.VerificarCambioalterado(valorCambio, "Au Pair", cliente.getNome(), 
                    usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), usuarioLogadoBean.getUsuario().getNome(), this.venda.getProdutos(), Formatacao.formatarFloatString(this.venda.getValor()));
        }
    }
    
    public void salvarControle() {
        AupairController aupairController = new AupairController();
        Controleaupair controle = aupairController.consultarControleAupair(this.venda.getIdvendas());
        if (controle == null) {
            controle = new Controleaupair();
            controle.setVendas(venda.getIdvendas());
            controle.setFinalizado("Processo");
            controle.setJobGuarante("Não");
            controle.setDataInicioJobOffer("Não");
            controle.setDataTerminoJobOffer("Não");
            controle.setEmailListaDocoumentos("Não");
            controle.setFichaContratoOriginal("Não");
            controle.setInformativoOriginal("Não");
            controle.setAtestadoOriginal("Não");
            controle.setCopiaPPTColorida("Não");
            controle.setCopiaRGCPF("Não");
            controle.setFotoDS("Nào");
            controle.setDs160("Não");
            controle.setVc("Não");
            controle.setCartaoApresentacao("Não");
            controle.setCartaoRecomendacao("Não");
            controle.setAtestado2SMEOriginal("Não");
            controle.setAtestadoSaude("Não");
            controle.setAntecedentesCrimianis("Não");
            controle.setSleeptestecorrigido("Não");
            controle.setSkype(" ");
            controle.setNumeroPassaporte(" ");
            controle.setStatusPrograma(" ");
            controle.setSponsor(" ");
            controle.setCidadeSponsor(" ");
            controle.setEmpregador(" ");
            controle.setStatusProcesso(" ");
            controle.setObservacoes(" ");
            controle.setSituacao("Processo");
            controle = aupairController.salvar(controle);
        }
    }
    
    @Override
    public void setValorJuros(Float valorJuros) {
        valorJurosjTextField.setText(Formatacao.formatarFloatString(valorJuros));
        valorJurosjTextField.requestFocus();
    }
    
    public void limitarJText(){
    nomeconhecidojTextField.setDocument(new LimiteTextoJedit(100));
    foneConhecidojTextField.setDocument(new LimiteTextoJedit(14));
    enderecoConhecidojTextField.setDocument(new LimiteTextoJedit(200));
    relacaoconhecidojTextField1.setDocument(new LimiteTextoJedit(50));
    nivelEstudojTextField.setDocument(new LimiteTextoJedit(50));
    ocupacaoAlunojTextField.setDocument(new LimiteTextoJedit(50));
    instituicaojTextField.setDocument(new LimiteTextoJedit(50));
    cursojTextField.setDocument(new LimiteTextoJedit(50));
    duracaoCursojTextField.setDocument(new LimiteTextoJedit(50));
    periodoCursojTextField.setDocument(new LimiteTextoJedit(50));
    idioma01jTextField.setDocument(new LimiteTextoJedit(45));
    idioma02jTextField.setDocument(new LimiteTextoJedit(45));
    idioma03jTextField.setDocument(new LimiteTextoJedit(45));
    observacaoPassagemAereajTextField.setDocument(new LimiteTextoJedit(45));
    nomeContatoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
    telefoneEmergenciajTextField.setDocument(new LimiteTextoJedit(14));
    emailConatoEmergenciajTextField.setDocument(new LimiteTextoJedit(100));
    relacaoEmergenciajTextField.setDocument(new LimiteTextoJedit(45));
    seguradorajTextField.setDocument(new LimiteTextoJedit(100));
    planosegurojTextField.setDocument(new LimiteTextoJedit(50)); 
    numeroCartaoVTMjTextField.setDocument(new LimiteTextoJedit(45));
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
    
    public void carregarValorAupair() {
        if (valorAupair != null) {
            if (valorCambio > 0) {
                if (listaProdutoOrcamentoBean == null) {
                    listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
                }
                apagarProdutoAupair();
                float valorEstrangeira = valorAupair.getValorgross();
                float valorReal = valorAupair.getValorgross() * cambio.getValor();
                if (valorAupair.getProdutosorcamento() != null) {
                    ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                    pob.setIdOrcamentoProdutoOrcamento(0);
                    pob.setDescricaoProdutoOrcamento(valorAupair.getProdutosorcamento().getDescricao());
                    pob.setIdProdutoOrcamento(valorAupair.getProdutosorcamento().getIdprodutosOrcamento());
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
    
    public void apagarProdutoAupair() {
        if (listaProdutoOrcamentoBean != null) {
            for (int i = 0; i < listaProdutoOrcamentoBean.size(); i++) {
                if (listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento() == (valorAupair.getProdutosorcamento().getIdprodutosOrcamento())) {
                    listaProdutoOrcamentoBean.remove(i);
                }
            }
        }
    }

    @Override
    public void setValores(Valoresaupair valorAupair) {
        if (valorAupair != null) {
            this.valorAupair = valorAupair;
            descricaoAupairjTextField.setText(valorAupair.getDescricao());
            CambioController cambioController = new CambioController();
            Moedas moedas = valorAupair.getMoedas();
            if (moedas != null) {
                moedaCambiojComboBox.setSelectedItem(moedas);
                carregarValorAupair();
            }
        }
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
    
    public void calcularComissao() {
        VendasComissaoController vendasComissaoController = new VendasComissaoController();
        Vendascomissao vendasComissao = vendasComissaoController.getVendaComissao(venda.getIdvendas(), usuarioLogadoBean.getParametrosprodutos().getCursos());
        if (vendasComissao != null) {
            if (vendasComissao.getPaga().equalsIgnoreCase("Não")) {
                ComissaoAuPair cc = new ComissaoAuPair(usuarioLogadoBean, venda, listaProdutoOrcamentoBean, valorCambio, valorAupair, listaParcelamento, aupair.getDataInicioPretendida01(), aupair.getDataInicioPretendida01(), vendasComissao);
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
            valorSeguro = numero * valores.getValorgross();
            valorSegurojTextField.setText(Formatacao.formatarFloatString(valorSeguro));
        }
    }
    
    public void carregarAupairAlteracao(){
        aupairAlterado = new Aupair();
        aupairAlterado.setCartaoVTM(aupair.getCartaoVTM());
        aupairAlterado.setControle(aupair.getControle());
        aupairAlterado.setCursandoPeriodo(aupair.getCursandoPeriodo());
        aupairAlterado.setCurso(aupair.getCurso());
        aupairAlterado.setDataInicioPretendida01(aupair.getDataInicioPretendida01());
        aupairAlterado.setDataInicioPretendida02(aupair.getDataInicioPretendida02());
        aupairAlterado.setDataInscricao(aupair.getDataInscricao());
        aupairAlterado.setDataTerminoPretendida01(aupair.getDataTerminoPretendida01());
        aupairAlterado.setDataTerminoPretendida02(aupair.getDataTerminoPretendida02());
        aupairAlterado.setDuracaoCurso(aupair.getDuracaoCurso());
        aupairAlterado.setEmailContatoEmergencia(aupair.getEmailContatoEmergencia());
        aupairAlterado.setEndercoAmigo(aupair.getEndercoAmigo());
        aupairAlterado.setFoneAmigo(aupair.getFoneAmigo());
        aupairAlterado.setFoneContatoEmergencia(aupair.getFoneContatoEmergencia());
        aupairAlterado.setIdaupair(aupair.getIdaupair());
        aupairAlterado.setIdioma01(aupair.getIdioma01());
        aupairAlterado.setIdioma02(aupair.getIdioma02());
        aupairAlterado.setIdioma03(aupair.getIdioma03());
        aupairAlterado.setInituicaoEstuda(aupair.getInituicaoEstuda());
        aupairAlterado.setMoedaCartao(aupair.getMoedaCartao());
        aupairAlterado.setNivelEstudo(aupair.getNivelEstudo());
        aupairAlterado.setNivelIdioma01(aupair.getNivelIdioma01());
        aupairAlterado.setNivelIdioma02(aupair.getNivelIdioma02());
        aupairAlterado.setNivelIdioma03(aupair.getNivelIdioma03());
        aupairAlterado.setNomeAmigo(aupair.getNomeAmigo());
        aupairAlterado.setNomeContatoEmergencia(aupair.getNomeContatoEmergencia());
        aupairAlterado.setNumeroCartao(aupair.getNumeroCartao());
        aupairAlterado.setObservacaoPassagem(aupair.getObservacaoPassagem());
        aupairAlterado.setObstm(aupair.getObstm());
        aupairAlterado.setOcupacao(aupair.getOcupacao());
        aupairAlterado.setPaisinteresse(aupair.getPaisinteresse());
        aupairAlterado.setPossuiAmigosPais(aupair.getPossuiAmigosPais());
        aupairAlterado.setRelacaoAmigo(aupair.getRelacaoAmigo());
        aupairAlterado.setRelacaoContatoEmergencia(aupair.getRelacaoContatoEmergencia());
        aupairAlterado.setTipoPassagem(aupair.getTipoPassagem());
        aupairAlterado.setTipoSolicitacaoVisto(aupair.getTipoSolicitacaoVisto());
        aupairAlterado.setValoresAupair(aupair.getValoresAupair());
        aupairAlterado.setVendas(aupair.getVendas());
    }
    
    
    public void verificarDadosAlterado() {
        dadosAlterado="";
        if (aupair.getCartaoVTM()!= null) {
            if (!aupair.getCartaoVTM().equals(aupairAlterado.getCartaoVTM())) {
                dadosAlterado = "Cartão VTM : " + aupair.getCartaoVTM() + " | " + aupairAlterado.getCartaoVTM() + "<br></br>";
            }
        }
        if (aupair.getControle()!= null) {
            if (!aupair.getControle().equalsIgnoreCase(aupairAlterado.getControle())) {
                dadosAlterado = dadosAlterado + "Controle : " + aupair.getControle() + " | " + aupairAlterado.getControle() + "<br></br>";
            }
        }
        if (aupair.getCursandoPeriodo()!= null) {
            if (!aupair.getCursandoPeriodo().equalsIgnoreCase(aupairAlterado.getCursandoPeriodo())) {
                dadosAlterado = dadosAlterado + "Cursando Período : " + aupair.getCursandoPeriodo() + " | " + aupairAlterado.getCursandoPeriodo() + "<br></br>";
            }
        }
        if (aupair.getCurso()!= null) {
            if (!aupair.getCurso().equalsIgnoreCase(aupairAlterado.getCurso())) {
                dadosAlterado = dadosAlterado + "Curso : " + aupair.getCurso() + " | " + aupairAlterado.getCurso() + "<br></br>";
            }
        }
        if (aupair.getDataInicioPretendida01()!= null) {
            if (!aupair.getDataInicioPretendida01().equals(aupairAlterado.getDataInicioPretendida01())) {
                dadosAlterado = dadosAlterado + "Data Início Pretendida 01 : " + Formatacao.ConvercaoDataPadrao(aupair.getDataInicioPretendida01()) + " | " + Formatacao.ConvercaoDataPadrao(aupairAlterado.getDataInicioPretendida01()) + "<br></br>";
            }
        }
        if (aupair.getDataInicioPretendida02()!= null) {
            if (!aupair.getDataInicioPretendida02().equals(aupairAlterado.getDataInicioPretendida02())) {
                dadosAlterado = dadosAlterado + "Data Início Pretendida 02 : " + Formatacao.ConvercaoDataPadrao(aupair.getDataInicioPretendida02()) + " | " + Formatacao.ConvercaoDataPadrao(aupairAlterado.getDataInicioPretendida02()) + "<br></br>";
            }
        }
        if (aupair.getDataTerminoPretendida01()!= null) {
            if (!aupair.getDataTerminoPretendida01().equals(aupairAlterado.getDataTerminoPretendida01())) {
                dadosAlterado = dadosAlterado + "Data Termino Pretendida 01 : " + Formatacao.ConvercaoDataPadrao(aupair.getDataTerminoPretendida01()) + " | " + Formatacao.ConvercaoDataPadrao(aupairAlterado.getDataTerminoPretendida01()) + "<br></br>";
            }
        }
        if (aupair.getDataTerminoPretendida02()!= null) {
            if (!aupair.getDataTerminoPretendida02().equals(aupairAlterado.getDataTerminoPretendida02())) {
                dadosAlterado = dadosAlterado + "Data Termino Pretendida 02 : " + Formatacao.ConvercaoDataPadrao(aupair.getDataTerminoPretendida02()) + " | " + Formatacao.ConvercaoDataPadrao(aupairAlterado.getDataTerminoPretendida02()) + "<br></br>";
            }
        }
        if (aupair.getDuracaoCurso()!= null) {
            if (!aupair.getDuracaoCurso().equalsIgnoreCase(aupairAlterado.getDuracaoCurso())) {
                dadosAlterado = dadosAlterado + "Duração do Curso : " + aupair.getDuracaoCurso() + " | " + aupairAlterado.getDuracaoCurso() + "<br></br>";
            }
        }
        if (aupair.getEmailContatoEmergencia()!= null) {
            if (!aupair.getEmailContatoEmergencia().equalsIgnoreCase(aupairAlterado.getEmailContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Email Contato de Emergencia : " + aupair.getEmailContatoEmergencia() + " | " + aupairAlterado.getEmailContatoEmergencia() + "<br></br>";
            }
        }
        if (aupair.getEndercoAmigo()!= null) {
            if (!aupair.getEndercoAmigo().equalsIgnoreCase(aupairAlterado.getEndercoAmigo())) {
                dadosAlterado = dadosAlterado + "Endereço Amigo : " + aupair.getEndercoAmigo() + " | " + aupairAlterado.getEndercoAmigo() + "<br></br>";
            }
        }
        if (aupair.getFoneAmigo()!= null) {
            if (!aupair.getFoneAmigo().equalsIgnoreCase(aupairAlterado.getFoneAmigo())) {
                dadosAlterado = dadosAlterado + "Telefone Amigo : " + aupair.getFoneAmigo() + " | " + aupairAlterado.getFoneAmigo() + "<br></br>";
            }
        }
        if (aupair.getFoneContatoEmergencia()!= null) {
            if (!aupair.getFoneContatoEmergencia().equals(aupairAlterado.getFoneContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Telefone de Contato Emergencia : " + aupair.getFoneContatoEmergencia() + " | " + aupairAlterado.getFoneContatoEmergencia() + "<br></br>";
            }
        }
        if (aupair.getIdioma01()!= null) {
            if (!aupair.getIdioma01().equalsIgnoreCase(aupairAlterado.getIdioma01())) {
                dadosAlterado = dadosAlterado + "Idioma 01: " + aupair.getIdioma01() + " | " + aupairAlterado.getIdioma01() + "<br></br>";
            }
        }
        if (aupair.getIdioma02()!= null) {
            if (!aupair.getIdioma02().equalsIgnoreCase(aupairAlterado.getIdioma02())) {
                dadosAlterado = dadosAlterado + "Idioma 02: " + aupair.getIdioma02() + " | " + aupairAlterado.getIdioma02() + "<br></br>";
            }
        }
        if (aupair.getIdioma03()!= null) {
            if (!aupair.getIdioma03().equalsIgnoreCase(aupairAlterado.getIdioma03())) {
                dadosAlterado = dadosAlterado + "Idioma 03 : " + aupair.getIdioma03() + " | " + aupairAlterado.getIdioma03() + "<br></br>";
            }
        }
        if (aupair.getInituicaoEstuda()!= null) {
            if (!aupair.getInituicaoEstuda().equalsIgnoreCase(aupairAlterado.getInituicaoEstuda())) {
                dadosAlterado = dadosAlterado + "Instituição Aonde Estuda :" + aupair.getInituicaoEstuda() + " | " + aupairAlterado.getInituicaoEstuda() + "<br></br>";
            }
        }
        if (aupair.getMoedaCartao()!= null) {
            if (!aupair.getMoedaCartao().equalsIgnoreCase(aupairAlterado.getMoedaCartao())) {
                dadosAlterado = dadosAlterado + "Moeda Cartão VTM :" + aupair.getMoedaCartao() + " | " + aupairAlterado.getMoedaCartao() + "<br></br>";
            }
        }
        if (aupair.getNivelEstudo()!= null) {
            if (!aupair.getNivelEstudo().equalsIgnoreCase(aupairAlterado.getNivelEstudo())) {
                dadosAlterado = dadosAlterado + "Nivel de Estudo :" + aupair.getNivelEstudo() + " | " + aupairAlterado.getNivelEstudo() + "<br></br>";
            }
        }
        
        if (aupair.getNivelIdioma01()!= null) {
            if (!aupair.getNivelIdioma01().equalsIgnoreCase(aupairAlterado.getNivelIdioma01())) {
                dadosAlterado = dadosAlterado + "Nivel de Idioma 01 :" + aupair.getNivelIdioma01() + " | " + aupairAlterado.getNivelIdioma01() + "<br></br>";
            }
        }
        if (aupair.getNivelIdioma02()!= null) {
            if (!aupair.getNivelIdioma02().equalsIgnoreCase(aupairAlterado.getNivelIdioma02())) {
                dadosAlterado = dadosAlterado + "Nivel de Idioma 02 :" + aupair.getNivelIdioma02() + " | " + aupairAlterado.getNivelIdioma02() + "<br></br>";
            }
        }
        if (aupair.getNivelIdioma03()!= null) {
            if (!aupair.getNivelIdioma03().equalsIgnoreCase(aupairAlterado.getNivelIdioma03())) {
                dadosAlterado = dadosAlterado + "Nivel de Idioma 03 :" + aupair.getNivelIdioma03() + " | " + aupairAlterado.getNivelIdioma03() + "<br></br>";
            }
        }
        if (aupair.getNomeContatoEmergencia()!= null) {
            if (!aupair.getNomeContatoEmergencia().equalsIgnoreCase(aupairAlterado.getNomeContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Nome Contato de Emergencia : " + aupair.getNomeContatoEmergencia() + " | " + aupairAlterado.getNomeContatoEmergencia() + "<br></br>";
            }
        }
        if (aupair.getNomeAmigo()!= null) {
            if (!aupair.getNomeAmigo().equalsIgnoreCase(aupairAlterado.getNomeAmigo())) {
                dadosAlterado = dadosAlterado + "Nome Amigo :" + aupair.getNomeAmigo() + " | " + aupairAlterado.getNomeAmigo() + "<br></br>";
            }
        }
        if (aupair.getNumeroCartao()!= null) {
            if (!aupair.getNumeroCartao().equalsIgnoreCase(aupairAlterado.getNumeroCartao())) {
                dadosAlterado = dadosAlterado + "Nome Contato de Emergencia : " + aupair.getNumeroCartao() + " | " + aupairAlterado.getNumeroCartao() + "<br></br>";
            }
        }
        
        if (aupair.getObstm()!= null) {
            if (!aupair.getObstm().equalsIgnoreCase(aupairAlterado.getObstm())) {
                dadosAlterado = dadosAlterado + "Obs TM : " + aupair.getObstm() + " | " + aupairAlterado.getObstm() + "<br></br>";
            }
        }
        if (aupair.getRelacaoContatoEmergencia()!= null) {
            if (!aupair.getRelacaoContatoEmergencia().equalsIgnoreCase(aupairAlterado.getRelacaoContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Relação Contato de Emergencia : " + aupair.getRelacaoContatoEmergencia() + " | " + aupairAlterado.getRelacaoContatoEmergencia() + "<br></br>";
            }
        }
        if (aupair.getOcupacao()!= null) {
            if (!aupair.getOcupacao().equalsIgnoreCase(aupairAlterado.getOcupacao())) {
                dadosAlterado = dadosAlterado + "Ocupação : " + aupair.getOcupacao() + " | " + aupairAlterado.getOcupacao() + "<br></br>";
            }
        }
        if (aupair.getPaisinteresse()!= null) {
            if (!aupair.getPaisinteresse().equalsIgnoreCase(aupairAlterado.getPaisinteresse())) {
                dadosAlterado = dadosAlterado + "País de Interesse : " + aupair.getPaisinteresse() + " | " + aupairAlterado.getPaisinteresse() + "<br></br>";
            }
        }
        if (aupair.getPossuiAmigosPais()!= null) {
            if (!aupair.getPossuiAmigosPais().equalsIgnoreCase(aupairAlterado.getPossuiAmigosPais())) {
                dadosAlterado = dadosAlterado + "Possui amigos no País : " + aupair.getPossuiAmigosPais() + " | " + aupairAlterado.getPossuiAmigosPais() + "<br></br>";
            }
        }
        if (aupair.getRelacaoAmigo()!= null) {
            if (!aupair.getRelacaoAmigo().equalsIgnoreCase(aupairAlterado.getRelacaoAmigo())) {
                dadosAlterado = dadosAlterado + "Relação Amigo : " + aupair.getRelacaoAmigo() + " | " + aupairAlterado.getRelacaoAmigo() + "<br></br>";
            }
        }
        if (aupair.getTipoPassagem()!= null) {
            if (!aupair.getTipoPassagem().equalsIgnoreCase(aupairAlterado.getTipoPassagem())) {
                dadosAlterado = dadosAlterado + "Tipo Passagem : " + aupair.getTipoPassagem() + " | " + aupairAlterado.getTipoPassagem() + "<br></br>";
            }
        }
        if (aupair.getTipoSolicitacaoVisto()!= null) {
            if (!aupair.getTipoSolicitacaoVisto().equalsIgnoreCase(aupairAlterado.getTipoSolicitacaoVisto())) {
                dadosAlterado = dadosAlterado + "Tipo Visto Consular : " + aupair.getTipoSolicitacaoVisto() + " | " + aupairAlterado.getTipoSolicitacaoVisto() + "<br></br>";
            }
        }
        
        if (valorVendaAlterar != venda.getValor()) {
                dadosAlterado = dadosAlterado + "Valor Total : " + Formatacao.formatarFloatString(venda.getValor()) + " | " + Formatacao.formatarFloatString(valorVendaAlterar) + "<br></br>";
        }
    }
    
    private void calcularImpostoRemessa() {
        ProdutoRemessaController produtoRemessaController = new ProdutoRemessaController();
        List<Produtoremessa> listaProdutoRemessa = produtoRemessaController.listar(usuarioLogadoBean.getParametrosprodutos().getAupair());
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
                ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
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
}
