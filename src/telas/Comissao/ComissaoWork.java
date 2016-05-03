/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Comissao;

import controller.ProdutoController;
import controller.UnidadeNegocioController;
import controller.UsuarioController;
import controller.VendasComissaoController;
import java.util.Date;
import java.util.List;
import model.Parametrosprodutos;
import model.Parcelamentopagamento;
import model.Produtos;
import model.Unidadenegocio;
import model.Usuario;
import model.Valoreswork;
import model.Vendas;
import model.Vendascomissao;

import telas.Usuarios.UsuarioLogadoBean;
import telas.Work.ProdutoOrcamentoBean;
import util.Formatacao;


/**
 *
 * @author Wolverine
 */
public class ComissaoWork {

   
    
    //Valor bruto dos produtos comissionaveis
    private float valorBruto; //ok
    private float comissaoLoja; //ok
    private float descontoMatriz; //ok
    private float TaxaTM; //ok
    private float custoFinanceiro=100.0f; //ok
    private Parametrosprodutos parametros;
    private Produtos produto;
    private Vendas venda;
    private Vendascomissao vendasComissao;
    private UsuarioLogadoBean usuarioLogadoBean;
    private Valoreswork valoresWork; 
    private List<ProdutoOrcamentoBean> listaProdutosGeral;
    private float valorGross;
    private float valorNet;
    private float cambioVenda;
    private List<Parcelamentopagamento> listaParcelamento;
    private Date dataInicioPrograma;
    private float descontoLoja;
    private float valorComissionavel;
    private Date dataInico;
    
    public ComissaoWork(UsuarioLogadoBean usuarioLogadoBean, Vendas venda, List<ProdutoOrcamentoBean> listaProdutosGeral, float valorCambio, Valoreswork valoresWork, List<Parcelamentopagamento> listaParcelamento, Date dataInicioPrograma, Date dataInicio,Vendascomissao vendascomissao) {
        this.vendasComissao = vendascomissao;
        this.venda = venda;
        this.dataInico = dataInicio;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.listaProdutosGeral = listaProdutosGeral;
        this.valoresWork = valoresWork;
        this.cambioVenda = valorCambio;
        this.listaParcelamento = listaParcelamento;
        this.dataInicioPrograma = dataInicioPrograma;
        getParametros();
        calcularDescontoMatriz();
        calcularDescontoLoja();
        conversaoValores();
        calcularDesagio();
        calcularValorComissional();
        calcularComissaoLoja();
        calcularTaxaTM();
        calcularComissao();
    }
    
    public void conversaoValores(){
        valorNet= valoresWork.getValornet() * cambioVenda;
        valorGross = valoresWork.getValorgross() * cambioVenda;
    }
    
    

   
    public void getParametros(){
        ProdutoController produtoController = new ProdutoController();
        produto = produtoController.consultar(usuarioLogadoBean.getParametrosprodutos().getWork());
    }
    
    public void calcularValorComissional(){
        valorBruto = venda.getValor();
        valorComissionavel = valorGross;
    }

    
    public void calcularComissaoLoja() {
        comissaoLoja = 0.0f;
        if (usuarioLogadoBean.getUnidadeNegocio().getTipo().equalsIgnoreCase("Premium")) {
            comissaoLoja = valoresWork.getComissaopremium() * cambioVenda;
        } else {
            comissaoLoja = valoresWork.getComissaoexpress() * cambioVenda;
        }
        comissaoLoja = comissaoLoja - descontoLoja;
    }
    
    public void calcularDescontoMatriz(){
        if (listaProdutosGeral!=null){
            descontoMatriz=0.0f;
            int codDM = usuarioLogadoBean.getParametrosprodutos().getDescontomatriz();
            for (int i=0;i<listaProdutosGeral.size();i++){
                int codBean = listaProdutosGeral.get(i).getIdProdutoOrcamento();
                if (codDM==codBean){
                    descontoMatriz=listaProdutosGeral.get(i).getValorMoedaReal();
                    descontoMatriz = descontoMatriz * -1;
                }
            }
        }
    }
    
    public void calcularTaxaTM(){
        if (listaProdutosGeral!=null){
            TaxaTM=0.0f;
            int codDM = usuarioLogadoBean.getParametrosprodutos().getPassagemTaxaTM();
            for (int i=0;i<listaProdutosGeral.size();i++){
                int codBean = listaProdutosGeral.get(i).getIdProdutoOrcamento();
                if (codDM==codBean){
                    TaxaTM=listaProdutosGeral.get(i).getValorMoedaReal();
                }
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
        vendasComissao.setDescontotm(descontoLoja);
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
        VendasComissaoController vendasComissaoController = new VendasComissaoController();
        vendasComissao = vendasComissaoController.salvar(vendasComissao);
        FaturaFranquiaBean faturaFranquias = new FaturaFranquiaBean(vendasComissao, listaParcelamento, usuarioLogadoBean);
    }
    
    public float calcularComissaoTM(){
        float comTM = valorGross - valorNet;
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
    
    public void calcularDescontoLoja(){
        if (listaProdutosGeral!=null){
            descontoLoja=0.0f;
            int codDL = usuarioLogadoBean.getParametrosprodutos().getDescontoloja();
            for (int i=0;i<listaProdutosGeral.size();i++){
                int codBean = listaProdutosGeral.get(i).getIdProdutoOrcamento();
                if (codDL==codBean){
                    descontoLoja=listaProdutosGeral.get(i).getValorMoedaReal();
                    descontoLoja = descontoLoja * -1;
                }
            }
        }
    }
}
