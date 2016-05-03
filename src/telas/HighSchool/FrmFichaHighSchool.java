/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.HighSchool;

import com.toedter.calendar.JTextFieldDateEditor;
import controller.CambioController;
import controller.ClienteController;
import controller.ContasReceberController;
import controller.FollowupController;
import controller.FormaPagamentoController;
import controller.HighSchoolController;
import controller.InvoicesController;
import controller.OrcamentoController;
import controller.ParcelamentoPagamentoController;
import controller.ProdutoOrcamentoController;
import controller.ProdutoRemessaController;
import controller.ValorHighSchoolController;
import controller.VendasComissaoController;
import controller.VendasController;
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
import model.Controlehighschool;
import model.Formapagamento;
import model.Fornecedorcidade;
import model.Highschool;
import model.Invoices;
import model.Moedas;
import model.Orcamento;
import model.Orcamentoprodutosorcamento;
import model.Parcelamentopagamento;
import model.Produtoremessa;
import model.Produtos;
import model.Produtosorcamento;
import model.Seguroviagem;
import model.Valoreshighschool;
import model.Vendas;
import model.Vendascomissao;
import model.view.Viewprodutosfiltro;
import telas.Cliente.FrmConsultaCliente;
import telas.Comissao.ComissaoCursos;
import telas.Comissao.ComissaoHighSchool;
import telas.Cursos.ConsultaParcelamentoPagamentoTableModel;
import telas.Fornecedor.FrmConsultaFornecedor;
import telas.HighSchool.Valores.FrmConsultaValoresHighSchool;
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
public class FrmFichaHighSchool extends javax.swing.JFrame implements IHighSchool{
    
    private String datePattern;
    private String maskPattern;
    private char placeHolder;
    private Vendas venda;
    private Vendas vendaAlterada;
    private Formapagamento formaPagamento;
    private Produtos produto;
    private Cliente cliente;
    private Orcamento orcamento;
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoBean;
    private List<ProdutoOrcamentoBean> listaProdutoOrcamentoApagarBean;
    private Highschool highSchool;
    private Highschool highSchoolAlterado;
    private UsuarioLogadoBean usuarioLogadoBean;
    private OrcamentoProdutoTableModel modelOrcamentoProduto;
    private String  cambioAlterado = "Não";
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
    private IConsultaHighSchool telaConsulta;
    private Fornecedorcidade fornecedorCidade;
    private Date dataCambio;
    private ConsultaParcelamentoPagamentoTableModel modelParcelamento;
    private List<Parcelamentopagamento> listaParcelamento;
    private boolean novaFicha = false;
    private String caracteres = "0987654321-()";
    private String situacao="PROCESSO";
    private Valoreshighschool valoreshighschool;
    private float valorVendaAlterar=0.0f;
    private String dadosAlterado;
    private Seguroviagem seguroViagem;
    private Seguroviagem seguroViagemAlterado;
    
    

    /**
     * Creates new form FrmFichaCursos
     */
    public FrmFichaHighSchool(int idVenda, UsuarioLogadoBean usuarioLogado,IConsultaHighSchool telaConsulta, Date dataCambio) {
        this.telaConsulta = telaConsulta;
        this.usuarioLogadoBean = usuarioLogado;
        this.dataCambio = dataCambio;
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

        jLabel66 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cursosjTabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        nomeClientejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cidadejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        quandoreprovoujTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nomeIrmao02jTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        seriejTextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        estadojComboBox = new javax.swing.JComboBox();
        jLabel51 = new javax.swing.JLabel();
        reprovadojComboBox = new javax.swing.JComboBox();
        jLabel69 = new javax.swing.JLabel();
        nomeIrmao03jTextField = new javax.swing.JTextField();
        escolajTextField = new javax.swing.JTextField();
        dnIrmao02jDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
            maskPattern, placeHolder));
    dnIrmao03jDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel12 = new javax.swing.JLabel();
dnIrmao01jDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    nomeIrmao01jTextField = new javax.swing.JTextField();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    cpfPaijFormattedTextField = new javax.swing.JFormattedTextField();
    rgPaijTextField = new javax.swing.JTextField();
    dataNascimentoPaijDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
        maskPattern, placeHolder));
jLabel16 = new javax.swing.JLabel();
cpfMaejFormattedTextField = new javax.swing.JFormattedTextField();
rgMaejTextField = new javax.swing.JTextField();
jLabel17 = new javax.swing.JLabel();
dataNascimentoMaejDateChooser = new com.toedter.calendar.JDateChooser(null, null, datePattern, new JTextFieldDateEditor(datePattern,
    maskPattern, placeHolder));
    jLabel18 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jPanel20 = new javax.swing.JPanel();
    jLabel71 = new javax.swing.JLabel();
    idioma01jTextField = new javax.swing.JTextField();
    jLabel84 = new javax.swing.JLabel();
    idioma02jTextField = new javax.swing.JTextField();
    jLabel85 = new javax.swing.JLabel();
    idioma03jTextField = new javax.swing.JTextField();
    escolaidioma03jTextField = new javax.swing.JTextField();
    jLabel86 = new javax.swing.JLabel();
    escolaidioma02jTextField = new javax.swing.JTextField();
    jLabel87 = new javax.swing.JLabel();
    escolaidioma01jTextField = new javax.swing.JTextField();
    jLabel88 = new javax.swing.JLabel();
    jLabel89 = new javax.swing.JLabel();
    tempoidioma01jTextField = new javax.swing.JTextField();
    jLabel90 = new javax.swing.JLabel();
    tempoidioma02jTextField = new javax.swing.JTextField();
    jLabel91 = new javax.swing.JLabel();
    tempoidioma03jTextField = new javax.swing.JTextField();
    nivelidioma03jComboBox = new javax.swing.JComboBox();
    jLabel92 = new javax.swing.JLabel();
    nivelidioma02jComboBox = new javax.swing.JComboBox();
    jLabel93 = new javax.swing.JLabel();
    nivelidioma01jComboBox = new javax.swing.JComboBox();
    jLabel94 = new javax.swing.JLabel();
    jPanel21 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    paisjTextField = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    programaescolajTextField = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    duracaojTextField = new javax.swing.JTextField();
    iniciojTextField = new javax.swing.JTextField();
    jLabel7 = new javax.swing.JLabel();
    jButton7 = new javax.swing.JButton();
    selecionarValorHighSchooljButton = new javax.swing.JButton();
    jPanel23 = new javax.swing.JPanel();
    jLabel75 = new javax.swing.JLabel();
    nomeContatoEmergenciajTextField2 = new javax.swing.JTextField();
    jLabel76 = new javax.swing.JLabel();
    emailConatoEmergenciajTextField2 = new javax.swing.JTextField();
    jLabel78 = new javax.swing.JLabel();
    relacaoEmergenciajTextField2 = new javax.swing.JTextField();
    telefoneEmergenciajCheckBox = new javax.swing.JCheckBox();
    telefoneEmergenciajTextField = new javax.swing.JTextField();
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
    jPanel22 = new javax.swing.JPanel();
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
    jLabel34 = new javax.swing.JLabel();
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
jButton8 = new javax.swing.JButton();
jButton9 = new javax.swing.JButton();
jScrollPane2 = new javax.swing.JScrollPane();
parcelamentojTable = new javax.swing.JTable();
jPanel4 = new javax.swing.JPanel();
jScrollPane3 = new javax.swing.JScrollPane();
observacoesjTextArea = new javax.swing.JTextArea();
jPanel19 = new javax.swing.JPanel();
jScrollPane4 = new javax.swing.JScrollPane();
obsTMjTextArea = new javax.swing.JTextArea();
jLabel35 = new javax.swing.JLabel();
jPanel17 = new javax.swing.JPanel();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton();

jLabel66.setText("jLabel66");

setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
setTitle("Ficha de High School");

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

    jLabel5.setText("Cidade");

    jLabel4.setText("Reprovado?");

    quandoreprovoujTextField2.setEnabled(false);

    jLabel8.setText("Nome do Irmão");

    jLabel9.setText("Data Nascimento");

    jLabel10.setText("Nome do Irmão");

    jLabel11.setText("Data Nascimento");

    jLabel30.setText("Nome do Irmão");

    jLabel31.setText("Escola onde estuda");

    jLabel32.setText("Série / Grau");

    estadojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" }));

    jLabel51.setText("Estado");

    reprovadojComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Não", "Sim" }));
    reprovadojComboBox.addItemListener(new java.awt.event.ItemListener() {
        public void itemStateChanged(java.awt.event.ItemEvent evt) {
            reprovadojComboBoxItemStateChanged(evt);
        }
    });

    jLabel69.setText("Se \"Sim\", quando ?");

    dnIrmao02jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dnIrmao02jDateChooserFocusGained(evt);
        }
    });

    dnIrmao03jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dnIrmao03jDateChooserFocusGained(evt);
        }
    });

    jLabel12.setText("Data Nascimento");

    dnIrmao01jDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dnIrmao01jDateChooserFocusGained(evt);
        }
    });

    jLabel13.setText("Nº CPF Pai");

    jLabel14.setText("Nº RG Pai");

    jLabel15.setText("Data Nascimento Pai");

    dataNascimentoPaijDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataNascimentoPaijDateChooserFocusGained(evt);
        }
    });

    jLabel16.setText("Nº CPF Mãe");

    jLabel17.setText("Nº RG Mãe");

    dataNascimentoMaejDateChooser.addFocusListener(new java.awt.event.FocusAdapter() {
        public void focusGained(java.awt.event.FocusEvent evt) {
            dataNascimentoMaejDateChooserFocusGained(evt);
        }
    });

    jLabel18.setText("Data Nascimento Mãe");

    javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
    jPanel18.setLayout(jPanel18Layout);
    jPanel18Layout.setHorizontalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomeIrmao01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(dnIrmao01jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(escolajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nomeIrmao02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nomeIrmao03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(1, 17, Short.MAX_VALUE))
                                .addComponent(dnIrmao02jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dnIrmao03jDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(seriejTextField)))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addGap(372, 372, 372))
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cidadejTextField)
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel51)
                                .addComponent(estadojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(reprovadojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createSequentialGroup()
                                    .addGap(56, 56, 56)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel18Layout.createSequentialGroup()
                                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel14)
                                                .addGroup(jPanel18Layout.createSequentialGroup()
                                                    .addGap(6, 6, 6)
                                                    .addComponent(jLabel17))
                                                .addComponent(rgPaijTextField)
                                                .addComponent(rgMaejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(60, 60, 60)
                                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(dataNascimentoMaejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(dataNascimentoPaijDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(quandoreprovoujTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
            .addContainerGap())
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel16)
                .addComponent(jLabel13)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cpfMaejFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(cpfPaijFormattedTextField, javax.swing.GroupLayout.Alignment.LEADING)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel18Layout.setVerticalGroup(
        jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel18Layout.createSequentialGroup()
            .addGap(11, 11, 11)
            .addComponent(jLabel1)
            .addGap(5, 5, 5)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(nomeClientejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButton1))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jLabel9))
            .addGap(1, 1, 1)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dnIrmao01jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(nomeIrmao01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10)
                .addComponent(jLabel11))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addComponent(nomeIrmao02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel30)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nomeIrmao03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addComponent(dnIrmao02jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel12)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dnIrmao03jDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel32)
                .addComponent(jLabel31))
            .addGap(6, 6, 6)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(seriejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(escolajTextField))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel51)
                .addComponent(jLabel5))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(cidadejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(estadojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cpfPaijFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel18Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(dataNascimentoPaijDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cpfMaejFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dataNascimentoMaejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel4))
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addComponent(jLabel14)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rgPaijTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel17)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(rgMaejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel69)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(reprovadojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(quandoreprovoujTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(44, 44, 44))
    );

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Informações Estudante", jPanel2);

    jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Idioma"));

    jLabel71.setText("Idioma");

    jLabel84.setText("Idioma");

    jLabel85.setText("Idioma");

    jLabel86.setText("Escola");

    jLabel87.setText("Escola");

    jLabel88.setText("Escola");

    jLabel89.setText("Tempo");

    jLabel90.setText("Tempo");

    jLabel91.setText("Tempo");

    nivelidioma03jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ótimo", "Bom", "Regular", "Ruim" }));

    jLabel92.setText("Nível");

    nivelidioma02jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ótimo", "Bom", "Regular", "Ruim" }));

    jLabel93.setText("Nível");

    nivelidioma01jComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ótimo", "Bom", "Regular", "Ruim" }));

    jLabel94.setText("Nível");

    javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
    jPanel20.setLayout(jPanel20Layout);
    jPanel20Layout.setHorizontalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(idioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel85)))
                .addComponent(jLabel71)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(idioma02jTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(idioma01jTextField, javax.swing.GroupLayout.Alignment.LEADING)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87)
                    .addComponent(escolaidioma02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel88)
                .addComponent(escolaidioma01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86)
                    .addComponent(escolaidioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel90)
                    .addComponent(tempoidioma02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel89)
                .addComponent(tempoidioma01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91)
                    .addComponent(tempoidioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel94)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel92, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGap(97, 97, 97))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(nivelidioma03jComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 110, Short.MAX_VALUE)
                    .addComponent(nivelidioma02jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nivelidioma01jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel20Layout.setVerticalGroup(
        jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel20Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(nivelidioma01jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel94)
                            .addGap(26, 26, 26)))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel93)
                            .addGap(26, 26, 26))
                        .addComponent(nivelidioma02jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel92)
                            .addGap(26, 26, 26))
                        .addComponent(nivelidioma03jComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tempoidioma01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel89)
                            .addGap(26, 26, 26)))
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel90)
                            .addGap(26, 26, 26))
                        .addComponent(tempoidioma02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel91)
                            .addGap(26, 26, 26))
                        .addComponent(tempoidioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addComponent(jLabel84)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(idioma02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel85))
                        .addGroup(jPanel20Layout.createSequentialGroup()
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(escolaidioma01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idioma01jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel88)
                                        .addComponent(jLabel71))
                                    .addGap(26, 26, 26)))
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel20Layout.createSequentialGroup()
                                    .addComponent(jLabel87)
                                    .addGap(26, 26, 26))
                                .addComponent(escolaidioma02jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel86)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(escolaidioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(idioma03jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Programa"));

    jLabel2.setText("País");

    paisjTextField.setEditable(false);

    jLabel3.setText("Programa/Escola");

    programaescolajTextField.setEditable(false);

    jLabel6.setText("Duração");

    duracaojTextField.setEditable(false);

    iniciojTextField.setEditable(false);

    jLabel7.setText("Início");

    jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    jButton7.setText("Selecionar");
    jButton7.setToolTipText("Selecionar Escola");
    jButton7.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton7ActionPerformed(evt);
        }
    });

    selecionarValorHighSchooljButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/selecionar.png"))); // NOI18N
    selecionarValorHighSchooljButton.setText("Selecionar");
    selecionarValorHighSchooljButton.setToolTipText("Selecionar Valores");
    selecionarValorHighSchooljButton.setEnabled(false);
    selecionarValorHighSchooljButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            selecionarValorHighSchooljButtonActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
    jPanel21.setLayout(jPanel21Layout);
    jPanel21Layout.setHorizontalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(duracaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(paisjTextField)
                                .addComponent(iniciojTextField))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(selecionarValorHighSchooljButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel21Layout.createSequentialGroup()
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel21Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(172, 172, 172)
                            .addComponent(jLabel2))
                        .addComponent(programaescolajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel21Layout.setVerticalGroup(
        jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel21Layout.createSequentialGroup()
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel3)
                .addComponent(jLabel2))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(programaescolajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton7)
                .addComponent(paisjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(duracaojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(iniciojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(selecionarValorHighSchooljButton))
            .addGap(23, 23, 23))
    );

    jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Contato de Emergência no Brasil"));

    jLabel75.setText("Nome");

    jLabel76.setText("E-mail");

    jLabel78.setText("Relação");

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

    javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
    jPanel23.setLayout(jPanel23Layout);
    jPanel23Layout.setHorizontalGroup(
        jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel23Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(emailConatoEmergenciajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(relacaoEmergenciajTextField2))
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nomeContatoEmergenciajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel76)
                        .addComponent(jLabel75))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(telefoneEmergenciajTextField)
                        .addGroup(jPanel23Layout.createSequentialGroup()
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel78)
                                .addComponent(telefoneEmergenciajCheckBox))
                            .addGap(0, 104, Short.MAX_VALUE)))))
            .addContainerGap())
    );
    jPanel23Layout.setVerticalGroup(
        jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel23Layout.createSequentialGroup()
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(jLabel75)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(nomeContatoEmergenciajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel23Layout.createSequentialGroup()
                    .addComponent(telefoneEmergenciajCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(telefoneEmergenciajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel76)
                .addComponent(jLabel78))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(emailConatoEmergenciajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(relacaoEmergenciajTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(38, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Informações Complentares", jPanel3);

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
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(127, 127, 127))
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

    jLabel49.setText("Valor Câmbio");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel46)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(produtoOrcaemntojComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorProdutosMoedaEstrangeirajTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel55)
                        .addComponent(valorProdutosMoedaRealjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(170, 170, 170))
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    cursosjTabbedPane.addTab("Produtos", jPanel12);

    jPanel22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

    jLabel34.setText("Saldo a Parcelar");

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

    javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
    jPanel22.setLayout(jPanel22Layout);
    jPanel22Layout.setHorizontalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel22Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel53))
            .addGap(18, 18, 18)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel54))
            .addGap(18, 18, 18)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel64))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(buscaBancojButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel56))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68)))
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel33)
                        .addComponent(saldoReceberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34))))
            .addContainerGap())
    );
    jPanel22Layout.setVerticalGroup(
        jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel22Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel53)
                .addComponent(jLabel54)
                .addComponent(jLabel56)
                .addComponent(jLabel64)
                .addComponent(jLabel68))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(condicaoPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorOrcamentoFormajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(possuiJurosjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorJurosjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPagarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(buscaBancojButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addComponent(jLabel34)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(saldoParcelarjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel22Layout.createSequentialGroup()
                    .addComponent(jLabel33)
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
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipoParcelamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(meioPagamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tipoParcelamentojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel63)
                        .addComponent(jLabel61))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dataVencimentojDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/adicionar.png"))); // NOI18N
    jButton8.setText("Adicionar");
    jButton8.setToolTipText("Adicionar forma de pagamento");
    jButton8.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton8ActionPerformed(evt);
        }
    });

    jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/excluir.png"))); // NOI18N
    jButton9.setText("Excluir");
    jButton9.setToolTipText("Excluir forma de pagamento");
    jButton9.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton9ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
    jPanel24.setLayout(jPanel24Layout);
    jPanel24Layout.setHorizontalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(jButton8)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22))
    );
    jPanel24Layout.setVerticalGroup(
        jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton8)
                .addComponent(jButton9))
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
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel15Layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addGap(140, 140, 140)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel15Layout.setVerticalGroup(
        jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel15Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Obs", jPanel4);

    obsTMjTextArea.setColumns(20);
    obsTMjTextArea.setRows(5);
    jScrollPane4.setViewportView(obsTMjTextArea);

    jLabel35.setText("Observações que serão enviadas ao Departamento Responsável e ao Departamento Financeiro da TravelMate");

    javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
    jPanel19.setLayout(jPanel19Layout);
    jPanel19Layout.setHorizontalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addComponent(jLabel35)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addContainerGap())
    );
    jPanel19Layout.setVerticalGroup(
        jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel35)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addContainerGap())
    );

    cursosjTabbedPane.addTab("Obs TM", jPanel19);

    jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

    jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
    jButton5.setText("Confirmar");
    jButton5.setToolTipText("Confirma Cadastro da Ficha de High School");
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
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(99, 99, 99))
        .addComponent(cursosjTabbedPane)
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(cursosjTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 510, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void valorProdutosMoedaEstrangeirajTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valorProdutosMoedaEstrangeirajTextFieldKeyTyped
        if (evt.getKeyChar()=='.'){
            evt.setKeyChar(',');
        }
        String caracteres = "0987654321-,";
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
        if (linha>=0){
            listaProdutoOrcamentoBean.get(linha).setApagar(true);
           listaProdutoOrcamentoApagarBean.add(listaProdutoOrcamentoBean.get(linha));
            listaProdutoOrcamentoBean.remove(linha);
            calcularValorTotalOrcamento();
            carregarModelOrcamentoProduto();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            salvarHighSchool();
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
                if (this.highSchool.getIdhighschool()!=null){
                    if (vendaAlterada!=null){
                        verificarDadosAlterado();
                    }
                }
                emitirEmailGerencial();
                verificarAlteracaoCambio();
            }
            JOptionPane.showMessageDialog(rootPane, "High School Salvo com Sucesso");
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

    private void cursosjTabbedPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cursosjTabbedPaneMouseClicked
        
    }//GEN-LAST:event_cursosjTabbedPaneMouseClicked

    private void dnIrmao02jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnIrmao02jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dnIrmao02jDateChooserFocusGained

    private void dnIrmao03jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnIrmao03jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dnIrmao03jDateChooserFocusGained

    private void dnIrmao01jDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dnIrmao01jDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dnIrmao01jDateChooserFocusGained

    private void reprovadojComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_reprovadojComboBoxItemStateChanged
        if (reprovadojComboBox.getSelectedItem().toString().equalsIgnoreCase("Sim")){
            quandoreprovoujTextField2.setEnabled(true);
        }else quandoreprovoujTextField2.setEnabled(false);
    }//GEN-LAST:event_reprovadojComboBoxItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new FrmConsultaFornecedor(usuarioLogadoBean, this, usuarioLogadoBean.getParametrosprodutos().getHighSchool());
    }//GEN-LAST:event_jButton7ActionPerformed

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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
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
        }}else JOptionPane.showMessageDialog(rootPane, msg);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
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
    }//GEN-LAST:event_jButton9ActionPerformed

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
        if (cursosjTabbedPane.getSelectedIndex() == 2) {
            if (listaProdutoOrcamentoBean == null) {
                listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
            }
            calcularValorTotalOrcamento();
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

    private void selecionarValorHighSchooljButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarValorHighSchooljButtonActionPerformed
        new FrmConsultaValoresHighSchool(usuarioLogadoBean, fornecedorCidade, this);
    }//GEN-LAST:event_selecionarValorHighSchooljButtonActionPerformed

    private void dataVencimentojDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataVencimentojDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataVencimentojDateChooserFocusGained

    private void dataNascimentoPaijDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascimentoPaijDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoPaijDateChooserFocusGained

    private void dataNascimentoMaejDateChooserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dataNascimentoMaejDateChooserFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_dataNascimentoMaejDateChooserFocusGained

    /**
     * @param args the command line arguments
     */
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscaBancojButton3;
    private javax.swing.JButton buscaBancojButton4;
    private javax.swing.JTextField cidadejTextField;
    private javax.swing.JComboBox condicaoPagamentojComboBox;
    private javax.swing.JFormattedTextField cpfMaejFormattedTextField;
    private javax.swing.JFormattedTextField cpfPaijFormattedTextField;
    private javax.swing.JTabbedPane cursosjTabbedPane;
    private com.toedter.calendar.JDateChooser dataNascimentoMaejDateChooser;
    private com.toedter.calendar.JDateChooser dataNascimentoPaijDateChooser;
    private com.toedter.calendar.JDateChooser dataVencimentojDateChooser;
    private com.toedter.calendar.JDateChooser dnIrmao01jDateChooser;
    private com.toedter.calendar.JDateChooser dnIrmao02jDateChooser;
    private com.toedter.calendar.JDateChooser dnIrmao03jDateChooser;
    private javax.swing.JTextField duracaojTextField;
    private javax.swing.JTextField emailConatoEmergenciajTextField2;
    private javax.swing.JTextField escolaidioma01jTextField;
    private javax.swing.JTextField escolaidioma02jTextField;
    private javax.swing.JTextField escolaidioma03jTextField;
    private javax.swing.JTextField escolajTextField;
    private javax.swing.JComboBox estadojComboBox;
    private javax.swing.JTextField idioma01jTextField;
    private javax.swing.JTextField idioma02jTextField;
    private javax.swing.JTextField idioma03jTextField;
    private javax.swing.JTextField iniciojTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
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
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JComboBox meioPagamentojComboBox;
    private javax.swing.JComboBox moedaCambiojComboBox;
    private javax.swing.JComboBox nivelidioma01jComboBox;
    private javax.swing.JComboBox nivelidioma02jComboBox;
    private javax.swing.JComboBox nivelidioma03jComboBox;
    private javax.swing.JTextField nomeClientejTextField;
    private javax.swing.JTextField nomeContatoEmergenciajTextField2;
    private javax.swing.JTextField nomeIrmao01jTextField;
    private javax.swing.JTextField nomeIrmao02jTextField;
    private javax.swing.JTextField nomeIrmao03jTextField;
    private javax.swing.JComboBox numeroParcelasjComboBox;
    private javax.swing.JTextArea obsTMjTextArea;
    private javax.swing.JTextArea observacoesjTextArea;
    private javax.swing.JTextField paisjTextField;
    private javax.swing.JTable parcelamentojTable;
    private javax.swing.JComboBox possuiJurosjComboBox;
    private javax.swing.JComboBox produtoOrcaemntojComboBox;
    private javax.swing.JTable produtoOrcamentojTable;
    private javax.swing.JTextField programaescolajTextField;
    private javax.swing.JTextField quandoreprovoujTextField2;
    private javax.swing.JTextField relacaoEmergenciajTextField2;
    private javax.swing.JComboBox reprovadojComboBox;
    private javax.swing.JTextField rgMaejTextField;
    private javax.swing.JTextField rgPaijTextField;
    private javax.swing.JTextField saldoParcelarjTextField;
    private javax.swing.JTextField saldoReceberjTextField;
    private javax.swing.JButton selecionarValorHighSchooljButton;
    private javax.swing.JTextField seriejTextField;
    private javax.swing.JCheckBox telefoneEmergenciajCheckBox;
    private javax.swing.JTextField telefoneEmergenciajTextField;
    private javax.swing.JTextField tempoidioma01jTextField;
    private javax.swing.JTextField tempoidioma02jTextField;
    private javax.swing.JTextField tempoidioma03jTextField;
    private javax.swing.JComboBox tipoParcelamentojComboBox;
    private javax.swing.JTextField totalPagarjTextField;
    private javax.swing.JTextField valorCambiojTextField;
    private javax.swing.JTextField valorJurosjTextField;
    private javax.swing.JTextField valorOrcamentoFormajTextField;
    private javax.swing.JTextField valorParcelajTextField;
    private javax.swing.JTextField valorParcelamentojTextField;
    private javax.swing.JTextField valorProdutosMoedaEstrangeirajTextField;
    private javax.swing.JTextField valorProdutosMoedaRealjTextField;
    private javax.swing.JTextField valorTotalOrcamentojTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void getCliente(Cliente cliente) {
        if (cliente!=null){
            this.cliente = cliente;
            nomeClientejTextField.setText(cliente.getNome());
        }
    }
    
    public void carregarInicializacao(int idVenda){
        carregarModelOrcamentoProduto();
        carregarListaProdutos();
        carregarComboMoedas();
        if (usuarioLogadoBean.getUnidadeNegocio().getDigitosTelefone() == 9) {
            telefoneEmergenciajCheckBox.setText("8-Telefone");
        } else {
            telefoneEmergenciajCheckBox.setText("9-Telefone");
        }
        if (idVenda>0){
            carregarObjetos(idVenda);
        }else{
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
            consultaCambio=true;
        }
    }
    
    public void carregarListaProdutos(){
        ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();
        List<Viewprodutosfiltro> lista = produtoOrcamentoController.listarFiltroProdutosOrcamento(usuarioLogadoBean.getParametrosprodutos().getHighSchool());
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
        if (usuarioLogadoBean.getParametrosprodutos().isRemessaativa()) {
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
        List<Produtoremessa> listaProdutoRemessa = produtoRemessaController.listar(usuarioLogadoBean.getParametrosprodutos().getHighSchool());
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
                telas.HighSchool.ProdutoOrcamentoBean pob = new telas.HighSchool.ProdutoOrcamentoBean();
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
            this.venda.setDataVenda(new Date());
            venda.setUnidadenegocio(usuarioLogadoBean.getUnidadeNegocio().getIdunidadeNegocio());
            venda.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            novaFicha=true;
        }else {
            if (venda.getSituacao().equalsIgnoreCase("PROCESSO")){
                venda.setDataVenda(new Date());
            }
        }
        VendasController vendasController = new VendasController();    
        venda.setCambio(cambio.getIdcambio());
        venda.setSituacao(situacao);
        venda.setCliente(cliente.getIdcliente());
        venda.setProdutos(usuarioLogadoBean.getParametrosprodutos().getHighSchool());
        venda.setObstm(obsTMjTextArea.getText());
        venda.setVendasMatriz("S");
        venda.setFornecedor(fornecedorCidade.getFornecedor().getIdfornecedor());
        venda.setFornecedorcidade(fornecedorCidade);
        venda.setValor(Formatacao.formatarStringfloat(valorTotalOrcamentojTextField.getText()));
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
    
    
    
    
    public void salvarHighSchool(){
        if (this.highSchool==null){
            highSchool = new Highschool();
        }
        highSchool.setNomeIrmao01(nomeIrmao01jTextField.getText());
        highSchool.setDnIrmao01(dnIrmao01jDateChooser.getDate());
        highSchool.setNomeIrmao02(nomeIrmao02jTextField.getText());
        highSchool.setDnIrmao02(dnIrmao02jDateChooser.getDate());
        highSchool.setNomeirmao03(nomeIrmao03jTextField.getText());
        highSchool.setDnIrmao03(dnIrmao03jDateChooser.getDate());
        highSchool.setNomeEscola(escolajTextField.getText());
        highSchool.setSerie(seriejTextField.getText());
        highSchool.setCidadeEscola(cidadejTextField.getText());
        highSchool.setEstadoEscola(estadojComboBox.getSelectedItem().toString());
        highSchool.setReprovadoEscola(reprovadojComboBox.getSelectedItem().toString());
        highSchool.setQuandoReprovado(quandoreprovoujTextField2.getText());
        highSchool.setIdioma01(idioma01jTextField.getText());
        highSchool.setIdioma02(idioma02jTextField.getText());
        highSchool.setIdioma03(idioma03jTextField.getText());
        highSchool.setCpfpai(cpfPaijFormattedTextField.getText());
        highSchool.setRgpai(rgPaijTextField.getText());
        highSchool.setDatanascimentopai(dataNascimentoPaijDateChooser.getDate());
        highSchool.setCpfmae(cpfMaejFormattedTextField.getText());
        highSchool.setRgmae(rgMaejTextField.getText());
        highSchool.setDatanascimentomae(dataNascimentoMaejDateChooser.getDate());
        highSchool.setEscolaIdioma01(escolaidioma01jTextField.getText());
        highSchool.setEscolaIdioma02(escolaidioma02jTextField.getText());
        highSchool.setEscolaIdioma03(escolaidioma03jTextField.getText());
        highSchool.setTempoIdioma01(tempoidioma01jTextField.getText());
        highSchool.setTempoIdioma02(tempoidioma02jTextField.getText());
        highSchool.setTempoIdioma03(tempoidioma03jTextField.getText());
        highSchool.setNivelIdioma01(nivelidioma01jComboBox.getSelectedItem().toString());
        highSchool.setNivelIdioma02(nivelidioma02jComboBox.getSelectedItem().toString());
        highSchool.setNivelIdioma03(nivelidioma03jComboBox.getSelectedItem().toString());
        highSchool.setPaisIntercambio(paisjTextField.getText());
        highSchool.setEscolaIntercambio(programaescolajTextField.getText());
        highSchool.setDuracaoIntercambio(duracaojTextField.getText());
        highSchool.setDataInicio(iniciojTextField.getText());
        highSchool.setNomeContatoEmergencia(nomeContatoEmergenciajTextField2.getText());
        highSchool.setFoneContatoEmergencia(telefoneEmergenciajTextField.getText());
        highSchool.setEmailConatoEmergencia(emailConatoEmergenciajTextField2.getText());
        highSchool.setRelacaoContatoEmergencia(relacaoEmergenciajTextField2.getText());
        highSchool.setFornecedor(valoreshighschool.getFornecedorcidade().getFornecedor().getIdfornecedor());
        highSchool.setControle("Processo");
        highSchool.setVendas(venda.getIdvendas());
        highSchool.setValoresHighSchool(valoreshighschool.getIdvaloresHighSchool());
        HighSchoolController highSchoolController = new HighSchoolController();
        highSchool = highSchoolController.salvar(highSchool);
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
            this.fornecedorCidade = venda.getFornecedorcidade();
             ClienteController clienteController = new ClienteController();
             this.cliente = clienteController.consultar(venda.getCliente());
            
            HighSchoolController highSchoolController = new HighSchoolController();
            this.highSchool = highSchoolController.consultarHighschool(idVenda);
            if(highSchool !=null){
                carregarHighSchoolAlteracao();
                carregarCamposHighSchool();
            }            
           
            FormaPagamentoController formaPagamentoController = new FormaPagamentoController();
            this.formaPagamento = formaPagamentoController.consultar(idVenda);
            if (formaPagamento!=null){
                carregarCamposFormaPagamento();
            }
           
            
            OrcamentoController orcamentoController = new OrcamentoController();
            orcamento = orcamentoController.consultar(idVenda);
            if (orcamento!=null){
                carregarOrcamento();
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
                        pob.setNovo(false);
                        pob.setTipo(listaOrcametoProduto.get(i).getTipo());
                        listaProdutoOrcamentoBean.add(pob);
                    }
                }
                carregarModelOrcamentoProduto();
                calcularValorTotalOrcamento();
            }
            ValorHighSchoolController valorHighSchoolController = new ValorHighSchoolController();
            valoreshighschool = valorHighSchoolController.consultar(highSchool.getValoresHighSchool());
            setValores(valoreshighschool);
            consultaCambio=true;
        }
    }
    
    public void carregarCamposHighSchool(){
       obsTMjTextArea.setText(venda.getObstm());
        nomeClientejTextField.setText(cliente.getNome());
        nomeIrmao01jTextField.setText(highSchool.getNomeIrmao01());
        nomeIrmao02jTextField.setText(highSchool.getNomeIrmao02());
        nomeIrmao03jTextField.setText(highSchool.getNomeirmao03());
        dnIrmao01jDateChooser.setDate(highSchool.getDnIrmao01());
        dnIrmao02jDateChooser.setDate(highSchool.getDnIrmao02());
        dnIrmao03jDateChooser.setDate(highSchool.getDnIrmao03());
        cpfPaijFormattedTextField.setText(highSchool.getCpfpai());
        rgPaijTextField.setText(highSchool.getRgpai());
        dataNascimentoPaijDateChooser.setDate(highSchool.getDatanascimentopai());
        cpfMaejFormattedTextField.setText(highSchool.getCpfmae());
        rgMaejTextField.setText(highSchool.getRgmae());
        dataNascimentoMaejDateChooser.setDate(highSchool.getDatanascimentomae());
        escolajTextField.setText(highSchool.getNomeEscola());
        seriejTextField.setText(highSchool.getSerie());
        cidadejTextField.setText(highSchool.getCidadeEscola());
        estadojComboBox.setSelectedItem(highSchool.getEstadoEscola());
        reprovadojComboBox.setSelectedItem(highSchool.getReprovadoEscola());
        quandoreprovoujTextField2.setText(highSchool.getQuandoReprovado());
        idioma01jTextField.setText(highSchool.getIdioma01());
        idioma02jTextField.setText(highSchool.getIdioma02());
        idioma03jTextField.setText(highSchool.getIdioma03());
        escolaidioma01jTextField.setText(highSchool.getEscolaIdioma01());
        escolaidioma02jTextField.setText(highSchool.getEscolaIdioma02());
        escolaidioma03jTextField.setText(highSchool.getEscolaIdioma03());
        tempoidioma01jTextField.setText(highSchool.getTempoIdioma01());
        tempoidioma02jTextField.setText(highSchool.getTempoIdioma02());
        tempoidioma03jTextField.setText(highSchool.getTempoIdioma03());
        nivelidioma01jComboBox.setSelectedItem(highSchool.getNivelIdioma01());
        nivelidioma02jComboBox.setSelectedItem(highSchool.getNivelIdioma02());
        nivelidioma03jComboBox.setSelectedItem(highSchool.getNivelIdioma03());
        paisjTextField.setText(highSchool.getPaisIntercambio());
        programaescolajTextField.setText(highSchool.getEscolaIntercambio());
        duracaojTextField.setText(highSchool.getDuracaoIntercambio());
        iniciojTextField.setText(highSchool.getDataInicio());
        nomeContatoEmergenciajTextField2.setText(highSchool.getNomeContatoEmergencia());
        telefoneEmergenciajTextField.setText(highSchool.getFoneContatoEmergencia());
        emailConatoEmergenciajTextField2.setText(highSchool.getEmailConatoEmergencia());
        relacaoEmergenciajTextField2.setText(highSchool.getRelacaoContatoEmergencia());
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
        if (nomeClientejTextField.getText().length()==0){
            msg = msg + "Campo cliente não selecionado\r\n";
        }
        if (fornecedorCidade==null){
            msg = msg + "Escola/Instituição não informada\r\n";
        }
        double saldoParcelar = Formatacao.formatarStringfloat(saldoParcelarjTextField.getText());
        if (saldoParcelar>0){
            msg = msg + "Forma de Pagamento possui saldo a parcelar em aberto\r\n";
        }
        if (valoreshighschool==null){
            msg = msg + "Valor do High School não definido\r\n";
        }
        return msg;
    }
    
    
    @Override
    public void setFornecedorCidade(Fornecedorcidade fornecedorCidade) {
        if (fornecedorCidade!=null){
            this.fornecedorCidade = fornecedorCidade;
            programaescolajTextField.setText(fornecedorCidade.getFornecedor().getNome());
            paisjTextField.setText(fornecedorCidade.getCidade().getPais().getNome());
            selecionarValorHighSchooljButton.setEnabled(true);
        }
    }
    
    
    public void emitirEmailGerencial() {
        EnviarEmailBean email = new EnviarEmailBean();
        if (novaFicha) {
            email.setTitulo("Nova Ficha de High School");
            email.setTipoAviso("Inclusão");
            email.setDataInclusao(Formatacao.ConvercaoDataPadrao(venda.getDataVenda()));
            email.setValor(Formatacao.formatarFloatString(venda.getValor()));
            Moedas moeda = (Moedas) moedaCambiojComboBox.getSelectedItem();
            email.setCambio(Formatacao.formatarFloatString(cambio.getValor()));
            email.setSiglaCambio(moeda.getSigla());
        } else {
            email.setTitulo("Ficha de High School Alterada");
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
        email.setDatainicio(highSchool.getDataInicio());
        email.setConsultor(usuarioLogadoBean.getUsuario().getNome());
        email.setObsTM(venda.getObstm());
        email.setIdProduto(usuarioLogadoBean.getParametrosprodutos().getHighSchool());
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
        ClienteController clienteController = new ClienteController();
        cliente = clienteController.salvar(cliente);
    }
    
    public void verificarAlteracaoCambio(){
        if (cambioAlterado.equalsIgnoreCase("sim")){
            Formatacao.VerificarCambioalterado(valorCambio, "High School", cliente.getNome(), 
                    usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), usuarioLogadoBean.getUsuario().getNome(), this.venda.getProdutos(), Formatacao.formatarFloatString(this.venda.getValor()));
        }
    }
    
    public void salvarControle() {
        HighSchoolController highSchoolController = new HighSchoolController();
        Controlehighschool controle = highSchoolController.consultarControleHighSchool(this.venda.getIdvendas());
        if (controle == null) {
            controle = new Controlehighschool();
            controle.setVisto("Não");
            controle.setContrato("Não");
            controle.setDocumentacao("Não");
            controle.setFamilia("Não");
            controle.setCidadeDestino(" ");
            controle.setBonus(" ");
            controle.setObservacoes(" ");
            controle.setFinalizado("Processo");
            controle.setSituacao("Processo");
            controle.setVendas(venda.getIdvendas());
            controle = highSchoolController.salvar(controle);
            salvarInvoice(controle.getIdcontroleHighSchool());
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
    
    @Override
    public void setValorJuros(Float valorJuros) {
        valorJurosjTextField.setText(Formatacao.formatarFloatString(valorJuros));
        valorJurosjTextField.requestFocus();
    }

    @Override
    public void setValores(Valoreshighschool valoreshighschool) {
        if (valoreshighschool!=null){
            this.valoreshighschool = valoreshighschool;
            iniciojTextField.setText(valoreshighschool.getInicio());
            duracaojTextField.setText(valoreshighschool.getDuracao());
            CambioController cambioController = new CambioController();
            Moedas moedas = valoreshighschool.getMoedas();
            if (moedas!=null){
                moedaCambiojComboBox.setSelectedItem(moedas);
                carregarValorHighSchool();
            }
        }
    }
    
    public void apagarProdutoHighSchool(){
        if (listaProdutoOrcamentoBean!=null){
            for(int i=0;i<listaProdutoOrcamentoBean.size();i++){
                if (listaProdutoOrcamentoBean.get(i).getIdProdutoOrcamento()==(valoreshighschool.getProdutosorcamento().getIdprodutosOrcamento())){
                    listaProdutoOrcamentoBean.remove(i);
                }
            }
        }
    }
    
    public void carregarValorHighSchool() {
        if (valoreshighschool != null) {
            if (valorCambio > 0) {
                if (listaProdutoOrcamentoBean == null) {
                    listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoBean>();
                }
                apagarProdutoHighSchool();
                float valorEstrangeira = valoreshighschool.getValorgross();
                float valorReal = valoreshighschool.getValorgross()* cambio.getValor();
                ProdutoOrcamentoController produtoOrcamentoController = new ProdutoOrcamentoController();                
                if (valoreshighschool.getProdutosorcamento() != null) {
                    ProdutoOrcamentoBean pob = new ProdutoOrcamentoBean();
                    pob.setIdOrcamentoProdutoOrcamento(0);
                    pob.setDescricaoProdutoOrcamento(valoreshighschool.getProdutosorcamento().getDescricao());
                    pob.setIdProdutoOrcamento(valoreshighschool.getProdutosorcamento().getIdprodutosOrcamento());
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
    public void limitarJText(){
        nomeIrmao01jTextField.setDocument(new LimiteTextoJedit(100));
        nomeIrmao02jTextField.setDocument(new LimiteTextoJedit(100));
        nomeIrmao03jTextField.setDocument(new LimiteTextoJedit(100));
        escolajTextField.setDocument(new LimiteTextoJedit(100));
        seriejTextField.setDocument(new LimiteTextoJedit(30));
        cidadejTextField.setDocument(new LimiteTextoJedit(50)); 
        idioma01jTextField.setDocument(new LimiteTextoJedit(50));
        escolaidioma01jTextField.setDocument(new LimiteTextoJedit(100));
        tempoidioma01jTextField.setDocument(new LimiteTextoJedit(50));
        idioma02jTextField.setDocument(new LimiteTextoJedit(50));        
        escolaidioma02jTextField.setDocument(new LimiteTextoJedit(100));        
        tempoidioma02jTextField.setDocument(new LimiteTextoJedit(50));        
        idioma03jTextField.setDocument(new LimiteTextoJedit(50));
        escolaidioma03jTextField.setDocument(new LimiteTextoJedit(100));        
        tempoidioma03jTextField.setDocument(new LimiteTextoJedit(50));
        nomeContatoEmergenciajTextField2.setDocument(new LimiteTextoJedit(100));        
        telefoneEmergenciajTextField.setDocument(new LimiteTextoJedit(14));
        emailConatoEmergenciajTextField2.setDocument(new LimiteTextoJedit(100));        
        relacaoEmergenciajTextField2.setDocument(new LimiteTextoJedit(50));        
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
    
    public void calcularComissao() {
        VendasComissaoController vendasComissaoController = new VendasComissaoController();
        Vendascomissao vendasComissao = vendasComissaoController.getVendaComissao(venda.getIdvendas(), usuarioLogadoBean.getParametrosprodutos().getCursos());
        if (vendasComissao != null) {
            if (vendasComissao.getPaga().equalsIgnoreCase("Não")) {
                ComissaoHighSchool cc = new ComissaoHighSchool(usuarioLogadoBean, venda, listaProdutoOrcamentoBean, cambio, valoreshighschool, listaParcelamento, highSchool.getDataInicio(), new Date(), vendasComissao);
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
    
    public void carregarHighSchoolAlteracao(){
        highSchoolAlterado = new Highschool();
        highSchoolAlterado.setCidadeEscola(highSchool.getCidadeEscola());
        highSchoolAlterado.setControle(highSchool.getControle());
        highSchoolAlterado.setCpfmae(highSchool.getCpfmae());
        highSchoolAlterado.setCpfpai(highSchool.getCpfpai());
        highSchoolAlterado.setDataInicio(highSchool.getDataInicio());
        highSchoolAlterado.setDatanascimentomae(highSchool.getDatanascimentomae());
        highSchoolAlterado.setDatanascimentopai(highSchool.getDatanascimentopai());
        highSchoolAlterado.setDnIrmao01(highSchool.getDnIrmao01());
        highSchoolAlterado.setDnIrmao02(highSchool.getDnIrmao01());
        highSchoolAlterado.setDnIrmao03(highSchool.getDnIrmao03());
        highSchoolAlterado.setDuracaoIntercambio(highSchool.getDuracaoIntercambio());
        highSchoolAlterado.setEmailConatoEmergencia(highSchool.getEmailConatoEmergencia());
        highSchoolAlterado.setEscolaIdioma01(highSchool.getEscolaIdioma01());
        highSchoolAlterado.setEscolaIdioma02(highSchool.getEscolaIdioma02());
        highSchoolAlterado.setEscolaIdioma03(highSchool.getEscolaIdioma03());
        highSchoolAlterado.setEscolaIntercambio(highSchool.getEscolaIntercambio());
        highSchoolAlterado.setEstadoEscola(highSchool.getEstadoEscola());
        highSchoolAlterado.setFoneContatoEmergencia(highSchool.getFoneContatoEmergencia());
        highSchoolAlterado.setFornecedor(highSchool.getFornecedor());
        highSchoolAlterado.setIdhighschool(highSchool.getIdhighschool());
        highSchoolAlterado.setIdioma01(highSchool.getIdioma01());
        highSchoolAlterado.setIdioma02(highSchool.getIdioma02());
        highSchoolAlterado.setIdioma03(highSchool.getIdioma03());
        highSchoolAlterado.setNivelIdioma01(highSchool.getNivelIdioma01());
        highSchoolAlterado.setNivelIdioma02(highSchool.getNivelIdioma02());
        highSchoolAlterado.setNivelIdioma03(highSchool.getNivelIdioma03());
        highSchoolAlterado.setNomeContatoEmergencia(highSchool.getNomeContatoEmergencia());
        highSchoolAlterado.setNomeEscola(highSchool.getNomeEscola());
        highSchoolAlterado.setNomeIrmao01(highSchool.getNomeIrmao01());
        highSchoolAlterado.setNomeIrmao02(highSchool.getNomeIrmao02());
        highSchoolAlterado.setNomeirmao03(highSchool.getNomeirmao03());
        highSchoolAlterado.setObstm(highSchool.getObstm());
        highSchoolAlterado.setPaisIntercambio(highSchool.getPaisIntercambio());
        highSchoolAlterado.setQuandoReprovado(highSchool.getQuandoReprovado());
        highSchoolAlterado.setRelacaoContatoEmergencia(highSchool.getRelacaoContatoEmergencia());
        highSchoolAlterado.setReprovadoEscola(highSchool.getReprovadoEscola());
        highSchoolAlterado.setRgmae(highSchool.getRgmae());
        highSchoolAlterado.setRgpai(highSchool.getRgpai());
        highSchoolAlterado.setSerie(highSchool.getSerie());
        highSchoolAlterado.setTempoIdioma01(highSchool.getTempoIdioma01());
        highSchoolAlterado.setTempoIdioma02(highSchool.getTempoIdioma02());
        highSchoolAlterado.setTempoIdioma03(highSchool.getTempoIdioma03());
        highSchoolAlterado.setValoresHighSchool(highSchool.getValoresHighSchool());
        highSchoolAlterado.setVendas(highSchool.getVendas());
    }
    
    
    public void verificarDadosAlterado() {
        dadosAlterado="";
        if (highSchool.getCidadeEscola()!= null) {
            if (!highSchool.getCidadeEscola().equals(highSchoolAlterado.getCidadeEscola())) {
                dadosAlterado = "Cidade Escola : " + highSchool.getCidadeEscola() + " | " + highSchoolAlterado.getCidadeEscola() + "<br></br>";
            }
        }
        if (highSchool.getCpfmae()!= null) {
            if (!highSchool.getCpfmae().equalsIgnoreCase(highSchoolAlterado.getCpfmae())) {
                dadosAlterado = dadosAlterado + "CPF Mãe : " + highSchool.getCpfmae() + " | " + highSchoolAlterado.getCpfmae() + "<br></br>";
            }
        }
        if (highSchool.getCpfpai()!= null) {
            if (!highSchool.getCpfpai().equalsIgnoreCase(highSchoolAlterado.getCpfpai())) {
                dadosAlterado = dadosAlterado + "CPF Pai : " + highSchool.getCpfpai() + " | " + highSchoolAlterado.getCpfpai() + "<br></br>";
            }
        }
        if (highSchool.getDataInicio()!= null) {
            if (!highSchool.getDataInicio().equalsIgnoreCase(highSchoolAlterado.getDataInicio())) {
                dadosAlterado = dadosAlterado + "Data de Início : " + highSchool.getDataInicio() + " | " + highSchoolAlterado.getDataInicio() + "<br></br>";
            }
        }
        if (highSchool.getDatanascimentomae()!= null) {
            if (!highSchool.getDatanascimentomae().equals(highSchoolAlterado.getDatanascimentomae())) {
                dadosAlterado = dadosAlterado + "Data de Nascimento Mãe : " + Formatacao.ConvercaoDataPadrao(highSchool.getDatanascimentomae()) + " | " + Formatacao.ConvercaoDataPadrao(highSchoolAlterado.getDatanascimentomae()) + "<br></br>";
            }
        }
        if (highSchool.getDatanascimentopai()!= null) {
            if (!highSchool.getDatanascimentopai().equals(highSchoolAlterado.getDatanascimentopai())) {
                dadosAlterado = dadosAlterado + "Data de Nascimento Pai : " + Formatacao.ConvercaoDataPadrao(highSchool.getDatanascimentopai()) + " | " + Formatacao.ConvercaoDataPadrao(highSchoolAlterado.getDatanascimentopai()) + "<br></br>";
            }
        }
        if (highSchool.getDnIrmao01()!= null) {
            if (!highSchool.getDnIrmao01().equals(highSchoolAlterado.getDnIrmao01())) {
                dadosAlterado = dadosAlterado + "Data de Nascimento Irmão 01 : " + Formatacao.ConvercaoDataPadrao(highSchool.getDnIrmao01()) + " | " + Formatacao.ConvercaoDataPadrao(highSchoolAlterado.getDnIrmao01()) + "<br></br>";
            }
        }
        if (highSchool.getDnIrmao02()!= null) {
            if (!highSchool.getDnIrmao02().equals(highSchoolAlterado.getDnIrmao02())) {
                dadosAlterado = dadosAlterado + "Data de Nascimento Irmão 02 : " + Formatacao.ConvercaoDataPadrao(highSchool.getDnIrmao02()) + " | " + Formatacao.ConvercaoDataPadrao(highSchoolAlterado.getDnIrmao02()) + "<br></br>";
            }
        }
        if (highSchool.getDnIrmao03()!= null) {
            if (!highSchool.getDnIrmao03().equals(highSchoolAlterado.getDnIrmao03())) {
                dadosAlterado = dadosAlterado + "Data de Nascimento Irmão 03 : " + Formatacao.ConvercaoDataPadrao(highSchool.getDnIrmao03()) + " | " + Formatacao.ConvercaoDataPadrao(highSchoolAlterado.getDnIrmao03()) + "<br></br>";
            }
        }
        if (highSchool.getDuracaoIntercambio()!= null) {
            if (!highSchool.getDuracaoIntercambio().equalsIgnoreCase(highSchoolAlterado.getDuracaoIntercambio())) {
                dadosAlterado = dadosAlterado + "Duração de Intercâmbio : " + highSchool.getDuracaoIntercambio() + " | " + highSchoolAlterado.getDuracaoIntercambio() + "<br></br>";
            }
        }
        if (highSchool.getEmailConatoEmergencia()!= null) {
            if (!highSchool.getEmailConatoEmergencia().equalsIgnoreCase(highSchoolAlterado.getEmailConatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Email Contato de Emergencia : " + highSchool.getEmailConatoEmergencia() + " | " + highSchoolAlterado.getEmailConatoEmergencia() + "<br></br>";
            }
        }
        if (highSchool.getFoneContatoEmergencia()!= null) {
            if (!highSchool.getFoneContatoEmergencia().equals(highSchoolAlterado.getFoneContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Telefone de Contato Emergencia : " + highSchool.getFoneContatoEmergencia() + " | " + highSchoolAlterado.getFoneContatoEmergencia() + "<br></br>";
            }
        }
        if (highSchool.getEscolaIdioma01()!= null) {
            if (!highSchool.getEscolaIdioma01().equalsIgnoreCase(highSchoolAlterado.getEscolaIdioma01())) {
                dadosAlterado = dadosAlterado + "Escola de Idioma 01 : " + highSchool.getEscolaIdioma01() + " | " + highSchoolAlterado.getEscolaIdioma01() + "<br></br>";
            }
        }
        if (highSchool.getEscolaIdioma02()!= null) {
            if (!highSchool.getEscolaIdioma02().equalsIgnoreCase(highSchoolAlterado.getEscolaIdioma02())) {
                dadosAlterado = dadosAlterado + "Escola de Idioma 02 : " + highSchool.getEscolaIdioma02() + " | " + highSchoolAlterado.getEscolaIdioma02() + "<br></br>";
            }
        }
        if (highSchool.getEscolaIdioma03()!= null) {
            if (!highSchool.getEscolaIdioma03().equalsIgnoreCase(highSchoolAlterado.getEscolaIdioma03())) {
                dadosAlterado = dadosAlterado + "Escola de Idioma 03 : " + highSchool.getEscolaIdioma03() + " | " + highSchoolAlterado.getEscolaIdioma03() + "<br></br>";
            }
        }
        if (highSchool.getEscolaIntercambio()!= null) {
            if (!highSchool.getEscolaIntercambio().equalsIgnoreCase(highSchoolAlterado.getEscolaIntercambio())) {
                dadosAlterado = dadosAlterado + "Escola onde irá fazer Intercâmbio : " + highSchool.getEscolaIntercambio() + " | " + highSchoolAlterado.getEscolaIntercambio() + "<br></br>";
            }
        }
        if (highSchool.getEstadoEscola()!= null) {
            if (!highSchool.getEstadoEscola().equalsIgnoreCase(highSchoolAlterado.getEstadoEscola())) {
                dadosAlterado = dadosAlterado + "Estado da Escola : " + highSchool.getEstadoEscola() + " | " + highSchoolAlterado.getEstadoEscola() + "<br></br>";
            }
        }
        if (highSchool.getIdioma01()!= null) {
            if (!highSchool.getIdioma01().equalsIgnoreCase(highSchoolAlterado.getIdioma01())) {
                dadosAlterado = dadosAlterado + "Idioma 01 : " + highSchool.getIdioma01() + " | " + highSchoolAlterado.getIdioma01() + "<br></br>";
            }
        }
        if (highSchool.getIdioma02()!= null) {
            if (!highSchool.getIdioma02().equalsIgnoreCase(highSchoolAlterado.getIdioma02())) {
                dadosAlterado = dadosAlterado + "Idioma 02 : " + highSchool.getIdioma02() + " | " + highSchoolAlterado.getIdioma02() + "<br></br>";
            }
        }
        if (highSchool.getIdioma03()!= null) {
            if (!highSchool.getIdioma03().equalsIgnoreCase(highSchoolAlterado.getIdioma03())) {
                dadosAlterado = dadosAlterado + "Idioma 03 : " + highSchool.getIdioma03() + " | " + highSchoolAlterado.getIdioma03() + "<br></br>";
            }
        }
        if (highSchool.getNivelIdioma01()!= null) {
            if (!highSchool.getNivelIdioma01().equalsIgnoreCase(highSchoolAlterado.getNivelIdioma01())) {
                dadosAlterado = dadosAlterado + "Nivel Idioma 01 : " + highSchool.getNivelIdioma01() + " | " + highSchoolAlterado.getNivelIdioma01() + "<br></br>";
            }
        }
        if (highSchool.getNivelIdioma02()!= null) {
            if (!highSchool.getNivelIdioma02().equalsIgnoreCase(highSchoolAlterado.getNivelIdioma02())) {
                dadosAlterado = dadosAlterado + "Nivel Idioma 02 : " + highSchool.getNivelIdioma02() + " | " + highSchoolAlterado.getNivelIdioma02() + "<br></br>";
            }
        }
        if (highSchool.getNivelIdioma03()!= null) {
            if (!highSchool.getNivelIdioma03().equalsIgnoreCase(highSchoolAlterado.getNivelIdioma03())) {
                dadosAlterado = dadosAlterado + "Nivel Idioma 03 : " + highSchool.getNivelIdioma03() + " | " + highSchoolAlterado.getNivelIdioma03() + "<br></br>";
            }
        }
        if (highSchool.getNomeContatoEmergencia()!= null) {
            if (!highSchool.getNomeContatoEmergencia().equalsIgnoreCase(highSchoolAlterado.getNomeContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Nome Contato de Emergencia : " + highSchool.getNomeContatoEmergencia() + " | " + highSchoolAlterado.getNomeContatoEmergencia() + "<br></br>";
            }
        }
        if (highSchool.getNomeIrmao01()!= null) {
            if (!highSchool.getNomeIrmao01().equalsIgnoreCase(highSchoolAlterado.getNomeIrmao01())) {
                dadosAlterado = dadosAlterado + "Nome Irmão 01 : " + highSchool.getNomeIrmao01() + " | " + highSchoolAlterado.getNomeIrmao01() + "<br></br>";
            }
        }
        if (highSchool.getNomeIrmao02()!= null) {
            if (!highSchool.getNomeIrmao02().equalsIgnoreCase(highSchoolAlterado.getNomeIrmao02())) {
                dadosAlterado = dadosAlterado + "Nome Irmão 02 : " + highSchool.getNomeIrmao02() + " | " + highSchoolAlterado.getNomeIrmao02() + "<br></br>";
            }
        }
        if (highSchool.getNomeirmao03()!= null) {
            if (!highSchool.getNomeirmao03().equalsIgnoreCase(highSchoolAlterado.getNomeirmao03())) {
                dadosAlterado = dadosAlterado + "Nome Irmão 03 : " + highSchool.getNomeirmao03() + " | " + highSchoolAlterado.getNomeirmao03() + "<br></br>";
            }
        }
        if (highSchool.getObstm()!= null) {
            if (!highSchool.getObstm().equalsIgnoreCase(highSchoolAlterado.getObstm())) {
                dadosAlterado = dadosAlterado + "Obs TM : " + highSchool.getObstm() + " | " + highSchoolAlterado.getObstm() + "<br></br>";
            }
        }
        if (highSchool.getRelacaoContatoEmergencia()!= null) {
            if (!highSchool.getRelacaoContatoEmergencia().equalsIgnoreCase(highSchoolAlterado.getRelacaoContatoEmergencia())) {
                dadosAlterado = dadosAlterado + "Relação Contato de Emergencia : " + highSchool.getRelacaoContatoEmergencia() + " | " + highSchoolAlterado.getRelacaoContatoEmergencia() + "<br></br>";
            }
        }
        if (highSchool.getPaisIntercambio()!= null) {
            if (!highSchool.getPaisIntercambio().equalsIgnoreCase(highSchoolAlterado.getPaisIntercambio())) {
                dadosAlterado = dadosAlterado + "País do Intercâmbio : " + highSchool.getPaisIntercambio() + " | " + highSchoolAlterado.getPaisIntercambio() + "<br></br>";
            }
        }
        if (highSchool.getSerie()!= null) {
            if (!highSchool.getSerie().equalsIgnoreCase(highSchoolAlterado.getSerie())) {
                dadosAlterado = dadosAlterado + "Serie : " + highSchool.getSerie() + " | " + highSchoolAlterado.getSerie() + "<br></br>";
            }
        }
        if (highSchool.getRgmae()!= null) {
            if (!highSchool.getRgmae().equalsIgnoreCase(highSchoolAlterado.getRgmae())) {
                dadosAlterado = dadosAlterado + "RG Mãe : " + highSchool.getRgmae() + " | " + highSchoolAlterado.getRgmae() + "<br></br>";
            }
        }
        if (highSchool.getRgpai()!= null) {
            if (!highSchool.getRgpai().equalsIgnoreCase(highSchoolAlterado.getRgpai())) {
                dadosAlterado = dadosAlterado + "RG Pai : " + highSchool.getRgpai() + " | " + highSchoolAlterado.getRgpai() + "<br></br>";
            }
        }
        if (highSchool.getTempoIdioma01()!= null) {
            if (!highSchool.getTempoIdioma01().equalsIgnoreCase(highSchoolAlterado.getTempoIdioma01())) {
                dadosAlterado = dadosAlterado + "Tempo Idioma 01 : " + highSchool.getTempoIdioma01() + " | " + highSchoolAlterado.getTempoIdioma01() + "<br></br>";
            }
        }
        if (highSchool.getTempoIdioma02()!= null) {
            if (!highSchool.getTempoIdioma02().equalsIgnoreCase(highSchoolAlterado.getTempoIdioma02())) {
                dadosAlterado = dadosAlterado + "Tempo Idioma 02 : " + highSchool.getTempoIdioma02() + " | " + highSchoolAlterado.getTempoIdioma02() + "<br></br>";
            }
        }
        if (highSchool.getTempoIdioma03()!= null) {
            if (!highSchool.getTempoIdioma03().equalsIgnoreCase(highSchoolAlterado.getTempoIdioma03())) {
                dadosAlterado = dadosAlterado + "Tempo Idioma 03 : " + highSchool.getTempoIdioma03() + " | " + highSchoolAlterado.getTempoIdioma03() + "<br></br>";
            }
        }
        
        if (valorVendaAlterar != venda.getValor()) {
                dadosAlterado = dadosAlterado + "Valor Total : " + Formatacao.formatarFloatString(venda.getValor()) + " | " + Formatacao.formatarFloatString(valorVendaAlterar) + "<br></br>";
        }
    }
}


