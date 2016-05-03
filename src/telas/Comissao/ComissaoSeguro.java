/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Comissao;

import controller.CambioController;
import controller.ProdutoController;
import controller.UnidadeNegocioController;
import controller.UsuarioController;
import controller.VendasComissaoController;
import java.util.Date;
import java.util.List;
import model.Cambio;
import model.Parcelamentopagamento;
import model.Produtos;
import model.Seguroviagem;
import model.Unidadenegocio;
import model.Usuario;
import model.Vendas;
import model.Vendascomissao;
import telas.Usuarios.UsuarioLogadoBean;
import util.Formatacao;


/**
 *
 * @author Wolverine
 */
public class ComissaoSeguro {

   
    
    //Valor bruto dos produtos comissionaveis
    private float valorBruto; //ok
    private float comissaoLoja; //ok
    private float descontoMatriz; //ok
    private float TaxaTM; //ok
    private float custoFinanceiro=100.0f; //ok
    private Produtos produto;
    private Vendas venda;
    private Vendascomissao vendasComissao;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Seguroviagem seguroviagem;
    private float valorGross;
    private float valorNet;
    private Cambio cambioSeguro;
    private List<Parcelamentopagamento> listaParcelamento;
    private Date dataInicioPrograma;
    private float descontoLoja;
    private float valorComissionavel;
    private Date dataInico;
    
    public ComissaoSeguro(UsuarioLogadoBean usuarioLogadoBean, Vendas venda, Seguroviagem seguroviagem, List<Parcelamentopagamento> listaParcelamento, Date dataInicioPrograma, float descontoMatriz, float descontoLoja, Date dataInicio, Vendascomissao vendascomissao, Date dataCambio) {
        this.vendasComissao = vendascomissao;
        this.venda = venda;
        this.dataInico = dataInicio;
        this.descontoMatriz = descontoMatriz;
        this.descontoLoja = descontoLoja;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.seguroviagem = seguroviagem;
        this.listaParcelamento = listaParcelamento;
        this.dataInicioPrograma = dataInicioPrograma;
        getParametros();
        carregarCambioSeguro(dataCambio);
        conversaoValoresSeguro();
        calcularDesagio();
        calcularValorComissional();
        calcularComissaoLoja();
        calcularComissao();
    }
    
    public void conversaoValoresSeguro(){
        valorGross = (seguroviagem.getValoresseguro().getValorgross() * cambioSeguro.getValor()) * seguroviagem.getNumeroSemanas();
        valorNet = (seguroviagem.getValoresseguro().getValornet() * cambioSeguro.getValor()) * seguroviagem.getNumeroSemanas();
    }
    
    

   
    public void getParametros(){
        ProdutoController produtoController = new ProdutoController();
        produto = produtoController.consultar(usuarioLogadoBean.getParametrosprodutos().getSeguroPrivado());
    }
    
    public void calcularValorComissional(){
        valorBruto = valorGross;
        valorComissionavel = valorGross - valorNet;
    }

    
    public void calcularComissaoLoja() {
        comissaoLoja = 0.0f;
        if (valorBruto > 0) {
            if (usuarioLogadoBean.getUnidadeNegocio().getTipo().equalsIgnoreCase("Premium")) {
                comissaoLoja = (seguroviagem.getValoresseguro().getComissaopremium() * cambioSeguro.getValor())  * seguroviagem.getNumeroSemanas();
            } else {
                comissaoLoja = (seguroviagem.getValoresseguro().getComissaoexpress() * cambioSeguro.getValor()) * seguroviagem.getNumeroSemanas();
            }
        }
    }
    
    public void calcularComissao(){
        if (vendasComissao==null){
            vendasComissao = new Vendascomissao();
        }
        vendasComissao.setComissaoemissor(0.0f);
        vendasComissao.setComissaofraquia(0.0f);
        vendasComissao.setComissaogerente(0.0f);
        vendasComissao.setComissaoterceiros(0.0f);
        vendasComissao.setDescontoloja(0.0f);
        vendasComissao.setVendas(venda);
        vendasComissao.setValorbruto(valorBruto);
        vendasComissao.setComissaotm(calcularComissaoTM());
        vendasComissao.setTaxatm(TaxaTM);
        vendasComissao.setValorfornecedor(valorBruto - (vendasComissao.getComissaotm() + vendasComissao.getTaxatm()));
        vendasComissao.setDescontotm(descontoMatriz);
        vendasComissao.setDescontoloja(descontoLoja);
        vendasComissao.setDesagio(custoFinanceiro);
        vendasComissao.setProdutos(produto);
        vendasComissao.setValorcomissionavel(valorComissionavel);
        vendasComissao.setComissaofraquia(calcularComissaoFranquia());
        vendasComissao.setComissaogerente(calcularComissaoGerente());
        vendasComissao.setComissaoemissor(calcularComissaoEmissor());
        vendasComissao.setLiquidofranquia(vendasComissao.getComissaofraquia() - vendasComissao.getComissaoemissor());
        vendasComissao.setComissaofranquiabruta(comissaoLoja);
        UsuarioController usuarioController = new UsuarioController();
        Usuario usuario = usuarioController.consultar(produto.getIdgerente());
        vendasComissao.setUsuario(usuario);
        vendasComissao.setPrevisaopagamento(Formatacao.calcularPrevisaoPagamentoFornecedor(dataInicioPrograma, produto.getIdprodutos(), usuarioLogadoBean.getParametrosprodutos().getWork()));
        vendasComissao.setLiquidovendas(calcularTotalComissao());
        salvarComissao();
    }
    
    public void salvarComissao(){
        vendasComissao.setPaga("Não");
        vendasComissao.setTerceiros(1);
        vendasComissao.setUsuario(usuarioLogadoBean.getUsuario());
        VendasComissaoController vendasComissaoController = new VendasComissaoController();
        vendasComissao = vendasComissaoController.salvar(vendasComissao);
        //FaturaFranquiaBean faturaFranquias = new FaturaFranquiaBean(vendasComissao, listaParcelamento, usuarioLogadoBean);
    }
    
    public float calcularComissaoTM(){
        float comTM =0.0f;
        comTM = valorGross - valorNet;
        return comTM;
    }
    
    public float calcularComissaoGerente(){
        float comGerente=0.0f;
        float base=0.0f;
        if (produto.getComissaogerente()>0){
            base = vendasComissao.getComissaotm() + vendasComissao.getTaxatm();
            base = base - (vendasComissao.getDescontotm() + vendasComissao.getComissaoterceiros() + vendasComissao.getDesagio() + vendasComissao.getComissaofraquia());
            Double perGerente = produto.getComissaogerente()/100;
            comGerente = base * perGerente.floatValue();
        }
        return comGerente;
    }
    
    public float calcularComissaoEmissor(){
        float comEmissor=0.0f;
        float base=0.0f;
        UnidadeNegocioController unidadeNegocioController = new UnidadeNegocioController();
        Unidadenegocio unidadenegocio = unidadeNegocioController.consultar(venda.getUnidadenegocio());
        if (unidadenegocio.getPerconsultor()>0){
            Double perEmissor = usuarioLogadoBean.getUnidadeNegocio().getPerconsultor()/100;
            comEmissor =vendasComissao.getComissaofraquia() * perEmissor.floatValue();
        }
        return comEmissor;
    }
    
    public float calcularComissaoFranquia() {
        float comFq = 0.0f;
        float sub = 0.0f;
        float som = 0.0f;
        som = this.comissaoLoja;
        if (vendasComissao.getTaxatm() > 0) {
            som = som + (vendasComissao.getTaxatm() / 2);
        }
        if (custoFinanceiro > 0) {
            sub = sub + (custoFinanceiro / 2);
        }
        if (vendasComissao.getDescontotm() > 0) {
            sub = sub + (vendasComissao.getDescontotm() / 2);
        }
        if (vendasComissao.getDescontoloja() > 0) {
            sub = sub + vendasComissao.getDescontoloja();
        }
        comFq = som - sub;
        return comFq;
    }
    
    public float calcularTotalComissao(){
        float somar = vendasComissao.getComissaotm() + vendasComissao.getTaxatm() + vendasComissao.getDescontoloja();
        float subtrair = vendasComissao.getDescontotm() + vendasComissao.getComissaogerente() + vendasComissao.getComissaofraquia() + vendasComissao.getDesagio();
        return somar - subtrair;
    }
    
    public void calcularDesagio(){
        DesagiosBean desagioBean = new DesagiosBean(usuarioLogadoBean, listaParcelamento);
        custoFinanceiro = desagioBean.getBoleto() + desagioBean.getCartao() + desagioBean.getJuros() + desagioBean.getCartaoDebito();
    }
    
    public void carregarCambioSeguro(Date dataCambio){
        CambioController cambioController = new CambioController();
        cambioSeguro = cambioController.consultarCambioMoeda(Formatacao.ConvercaoDataSql(dataCambio), seguroviagem.getValoresseguro().getMoedas().getIdmoedas());
    }
}
