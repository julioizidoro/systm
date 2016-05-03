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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Arquivos;
import model.Ftpdados;
import model.Tipoarquivo;
import telas.Aupair.Controle.IControleAupair;
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
import util.Formatacao;
import util.Ftp;
import util.LimiteTextoJedit;

/**
 *
 * @author Wolverine
 */
public class FrmCadastarArquivo extends javax.swing.JFrame implements ICliente{
    
    private UsuarioLogadoBean usuarioLogadoBean;
    private ICliente telaCliente;
    private Arquivos arquivo;
    int idVenda;
    String nomeCliente;
    private int idControle;
    private int idUnidade;
    private String nomeArquivoLocal;
    private String nomeArquivoFTP;
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
     * Creates new form FrmCadastarArquivo
     */
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleTrainee tela) {
        telaTrainee = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleVoluntariado tela) {
        telaVoluntariado = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleWork tela) {
        telaWork = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleVistos tela) {
        telaVistos = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleSeguro tela) {
        telaSeguro = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleHighSchool tela) {
        telaHighSchool = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleCurso tela) {
        telaControleCurso = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleAupair tela) {
        telaAupair = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleLadies tela) {
        telaLadies = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
    }
    
    public FrmCadastarArquivo(UsuarioLogadoBean usuarioLogadoBean, ICliente telaCliente, int idVenda, String nomeCliente, int idControle, int idUnidade, IControleProgramasTeens tela) {
        telaProgramasTeens = tela;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.idVenda = idVenda;
        this.idUnidade =idUnidade;
        this.nomeCliente = nomeCliente;
        this.telaCliente = telaCliente;
        this.idControle = idControle;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        limitarJText();
        carregarComboBox();
        setVisible(true);
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
        jLabel2 = new javax.swing.JLabel();
        nomeArquivojTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tipojComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        observacaoArquivojTextField = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Arquivo");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Tipo Arquivo");

        jLabel2.setText("Nome do Arquivo");

        jButton1.setText("Carregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Observação Arquivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nomeArquivojTextField)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(observacaoArquivojTextField))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tipojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeArquivojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(observacaoArquivojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton2.setText("Confirmar");
        jButton2.setToolTipText("Confirmar Arquivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setToolTipText("Cancela Arquivo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String msg = validarDados();
        if (msg.length() < 5) {
            Tipoarquivo tipo = (Tipoarquivo) tipojComboBox.getSelectedItem();
            this.arquivo.setTipoArquivo(tipo.getIdtipoArquivo());
            this.arquivo.setDataInclusao(new Date());
            this.arquivo.setObservacao(observacaoArquivojTextField.getText());
            this.arquivo.setVenda(this.idVenda);
            this.arquivo.setUsuario(usuarioLogadoBean.getUsuario().getIdusuario());
            if (salvarArquivoFTP()) {
                ArquivosController arquivosController = new ArquivosController();
                arquivosController.salvar(arquivo);
                verifcarTipoArquivo(tipo.getDescricao());
                telaCliente.setModel();
                if (tipo.getUnidade().equalsIgnoreCase("Sim")) {
                    Formatacao.emitirEmailArquivo(tipo.getDescricao(), nomeCliente, 0, usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), usuarioLogadoBean.getUsuario().getNome(), this.idUnidade);
                }
                Formatacao.emitirEmailArquivo(tipo.getDescricao(), nomeCliente, tipo.getIdtipoArquivo(), usuarioLogadoBean.getUnidadeNegocio().getNomeFantasia(), usuarioLogadoBean.getUsuario().getNome(), 0);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, msg);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed
  
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nomeArquivoLocal="";
        nomeArquivoFTP="";
        new FrmCarregarArquivo(this);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line argumentss
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField nomeArquivojTextField;
    private javax.swing.JTextField observacaoArquivojTextField;
    private javax.swing.JComboBox tipojComboBox;
    // End of variables declaration//GEN-END:variables

    @Override
    public void setModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setArquivo(File arquivo) {
        if (arquivo!=null){
            String cami = arquivo.getAbsolutePath();
            cami = Formatacao.getCaminho(cami);
            String idv = String.valueOf(idVenda);
            String nome = arquivo.getName();
            nomeArquivoFTP = idVenda+"_"+nome;
            nomeArquivoLocal= cami + "\\" + nome;
            nomeArquivojTextField.setText(nome);
            this.arquivo = new Arquivos();
//            try {
//                this.arquivo.setArquivo(gerarArquivoBase(arquivo));
                this.arquivo.setNomeArquivo(nome);
//            } catch (IOException ex) {
//                Logger.getLogger(FrmCadastarArquivo.class.getName()).log(Level.SEVERE, null, ex);
//                JOptionPane.showMessageDialog(rootPane, "Erro Carregar Arquivo " + ex);
//            }
        }
    }
    
    public byte[] gerarArquivoBase(File file) throws IOException {
        InputStream is = new FileInputStream(file);
        byte[] xml = new byte[(int) file.length()];
        int offset = 0;
        int numRead = 0;
        while (offset < xml.length
                && (numRead = is.read(xml, offset, xml.length - offset)) >= 0) {
            offset += numRead;
        }
        return xml;
    }
    
    public String validarDados(){
        String msg = "";
        if (arquivo==null){
            msg = msg + "Não existe arquivo para adicionar\b\n";
        }
//        if (arquivo!=null){
//            if (arquivo.getArquivo()==null){
//                msg = msg + "Arquivo fisíco não carregado\b\n";
//            }
//        }
        String tipo = tipojComboBox.getSelectedItem().toString();
        if (tipo.equalsIgnoreCase(" nenhum")){
            msg =msg + "Tipo de 'arquivo não informado\b\n";
        }
        if (arquivo.getNomeArquivo().length()>200){
            msg = msg = "Nome do Arquivo muito grande";
        }
        return msg;
    }
    
    public void carregarComboBox(){
        String sql;
        if (usuarioLogadoBean.getUsuario().getTipo().equalsIgnoreCase("unidade")){
            sql = "select t from Tipoarquivo t where t.unidade='Sim' order by t.descricao";
        }else sql = "select t from Tipoarquivo t order by t.descricao";
        ArquivosController arquivosController = new ArquivosController();
        List<Tipoarquivo> lista = arquivosController.listarArquivos(sql);
        if (lista!=null){
            for (int i=0;i<lista.size();i++){
                tipojComboBox.addItem(lista.get(i));
            }
        }
    }
    public void limitarJText(){
        nomeArquivojTextField.setDocument(new LimiteTextoJedit(200));
    }
    
    public void verifcarTipoArquivo(String tipoArquivo){
        if (telaControleCurso!=null){
            telaControleCurso.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaAupair!=null){
            telaAupair.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaHighSchool!=null){
            telaHighSchool.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaLadies!=null){
            telaLadies.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaProgramasTeens!=null){
            telaProgramasTeens.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaTrainee!=null){
            telaTrainee.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaVoluntariado!=null){
            telaVoluntariado.setDocAnexado(tipoArquivo, idVenda, idControle);
        }else if (telaWork!=null){
            telaWork.setDocAnexado(tipoArquivo, idVenda, idControle);
        }
    }
    
    public boolean salvarArquivoFTP(){
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
            String msg = ftp.enviarArquivo(nomeArquivoLocal, nomeArquivoFTP);
            JOptionPane.showMessageDialog(rootPane, msg);
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastarArquivo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro Salvar Arquivo " + ex);
        }
        try {
           ftp.desconectar();
        } catch (IOException ex) {
            Logger.getLogger(FrmCadastarArquivo.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(rootPane, "Erro desconectar FTP " +ex);
        }
        return false;
    }
}
