/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ContasReceber;

import controller.ClienteController;
import controller.ContasReceberController;
import facade.ContasReceberFacade;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import model.Cliente;
import model.Contasreceber;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class FrmConsultaContasReceber extends javax.swing.JFrame {
    
    private List<Contasreceber> listaContas;
    private ContasReceberTableModel modelContas;
    private UsuarioLogadoBean usuarioLogadoBean;

    /**
     * Creates new form FrmConsultaContasReceber
     */
    public FrmConsultaContasReceber(int idVendas, UsuarioLogadoBean usuarioLogadoBean) {
        this.usuarioLogadoBean = usuarioLogadoBean;
        initComponents();
         URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        carregarListaContasReceber(idVendas);
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
        contasjTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        contasjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(contasjTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton1.setText("Gerar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton2.setText("Fechar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int linha = contasjTable.getSelectedRow();
        if (linha>=0){
            gerarClasseBoleto(listaContas.get(linha));
        }else JOptionPane.showMessageDialog(rootPane, "Selecione um conta");
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable contasjTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public void carregarListaContasReceber(int idVendas){
        ContasReceberController contasReceberController = new ContasReceberController();
        Date dataVencimento=new Date();
        try {
            dataVencimento = Formatacao.SomarDiasDatas(new Date(), 10);
        } catch (Exception ex) {
            Logger.getLogger(FrmConsultaContasReceber.class.getName()).log(Level.SEVERE, null, ex);
        }
        String sData = Formatacao.ConvercaoDataSql(dataVencimento);
        String sql = "Select c From Contasreceber c where c.vendas.idvendas=" + idVendas + " and c.tipodocumento='Boleto' and c.datavencimento<'" +
                sData + "' and c.numeroparcelas=1 and c.valorpago=0";
        listaContas = contasReceberController.listar(sql);
        if (listaContas==null){
            listaContas = new ArrayList<Contasreceber>();
        }
        modelContas = new ContasReceberTableModel(listaContas);
        contasjTable.setModel(modelContas);
        DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.RIGHT);
        contasjTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        contasjTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        contasjTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
        contasjTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        contasjTable.repaint();
    }
    
    public void gerarClasseBoleto(Contasreceber conta) {
        ClienteController clienteController = new ClienteController();
        Cliente cliente = clienteController.consultar(conta.getVendas().getCliente());
        DadosBoletoBean dadosBoletoBean = new DadosBoletoBean();
        dadosBoletoBean.setAgencias(usuarioLogadoBean.getUnidadeNegocio().getBanco().getAgencia());
        dadosBoletoBean.setCarteiras(usuarioLogadoBean.getUnidadeNegocio().getBanco().getCarteira());
        dadosBoletoBean.setCnpjCedente(usuarioLogadoBean.getUnidadeNegocio().getCnpj());
        dadosBoletoBean.setCodigoVenda(conta.getVendas().getIdvendas());
        dadosBoletoBean.setDataDocumento(new Date());
        dadosBoletoBean.setDigitoAgencias(usuarioLogadoBean.getUnidadeNegocio().getBanco().getDigioagencia());
        dadosBoletoBean.setDigitoContas(usuarioLogadoBean.getUnidadeNegocio().getBanco().getDigitoconta());
        dadosBoletoBean.setDataVencimento(conta.getDatavencimento());
        dadosBoletoBean.setNomeCedente(usuarioLogadoBean.getUnidadeNegocio().getRazaoSocial());
        dadosBoletoBean.setNomeSacado(cliente.getNome());
        dadosBoletoBean.setNumeroContas(usuarioLogadoBean.getUnidadeNegocio().getBanco().getConta());
        dadosBoletoBean.setNumeroDocumentos(Formatacao.gerarNumeroDocumentoBoleto(conta.getNumerodocumento(), String.valueOf(conta.getNumeroparcelas())));
        dadosBoletoBean.setValor(Formatacao.converterFloatBigDecimal(conta.getValorparcela()));
        dadosBoletoBean.setNossoNumeros(dadosBoletoBean.getNumeroDocumentos());
//        dadosBoletoBean.setEnderecoSacado(new Endereco());
//        dadosBoletoBean.getEnderecoSacado().setBairro(cliente.getBairro());
//        dadosBoletoBean.getEnderecoSacado().setCep(cliente.getCep());
//        dadosBoletoBean.getEnderecoSacado().setComplemento(cliente.getComplemento());
//        dadosBoletoBean.getEnderecoSacado().setLocalidade(cliente.getCidade());
//        dadosBoletoBean.getEnderecoSacado().setLogradouro(cliente.getTipologradouro() + " " + cliente.getLogradouro());
//        dadosBoletoBean.getEnderecoSacado().setNumero(cliente.getNumero());
//        dadosBoletoBean.getEnderecoSacado().setUF(UnidadeFederativa.valueOfSigla(cliente.getEstado()));
//        dadosBoletoBean.setValorJuros(calcularMultaJuros(conta.getValorparcela(), usuarioLogadoBean.getUnidadeNegocio().getBanco().getValorjuros()));
//        dadosBoletoBean.setValorMulta(calcularMultaJuros(conta.getValorparcela(), usuarioLogadoBean.getUnidadeNegocio().getBanco().getValormulta()));
//        dadosBoletoBean.criarBoleto();
        ContasReceberController contasReceberController = new ContasReceberController();
        conta.setNossonumero(dadosBoletoBean.getNossoNumeros());
        conta.setDataEmissao(new Date());
        conta.setBoletogerado("SIM");
        contasReceberController.salvar(conta);
        //dadosBoletoBean.gerarBoletoPDF(dadosBoletoBean.getBoleto(), conta.getNumerodocumento());
    }
    
    public String calcularMultaJuros(float valor, float percentual){
        Float calculo = valor * (percentual/100);
        String scalculo = Formatacao.formatarFloatString(calculo);
        return scalculo;
    }


}
