/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoCurso;

import controller.OrcamentoCursoController;
import controller.OrcamentoCursoFormaPagamentoController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Orcamentocurso;
import model.Orcamentocursoformapagamento;
import model.Produtoorcamentocurso;
import model.Produtosorcamento;

/**
 *
 * @author Wolverine
 */
public class DuplicarOrcamentoBean {
    
    private Orcamentocurso orcamento;
    private List<ProdutoOrcamentoCursoBean> listaProdutoOrcamentoBean;
    private Orcamentocursoformapagamento formaPagamento;

    public DuplicarOrcamentoBean(int idOrcamento) {
        carregarOrcamento(idOrcamento);
        if (orcamento!=null){
            carregarListaProdutos(idOrcamento);
            carregarFormaPagamento(idOrcamento);
        }
    }

    public Orcamentocurso getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Orcamentocurso orcamento) {
        this.orcamento = orcamento;
    }

    public List<ProdutoOrcamentoCursoBean> getListaProdutoOrcamentoBean() {
        return listaProdutoOrcamentoBean;
    }

    public void setListaProdutoOrcamentoBean(List<ProdutoOrcamentoCursoBean> listaProdutoOrcamentoBean) {
        this.listaProdutoOrcamentoBean = listaProdutoOrcamentoBean;
    }

   

    public Orcamentocursoformapagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(Orcamentocursoformapagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public void carregarOrcamento(int idOrcamento){
        OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
        Orcamentocurso novo = orcamentoCursoController.consultar(idOrcamento);
        if (novo!=null){
            orcamento = new Orcamentocurso();
            orcamento.setAulasSemana(novo.getAulasSemana());
            orcamento.setCambio(novo.getCambio());
            orcamento.setCambioAlterado(novo.getCambioAlterado());
            orcamento.setCliente(0);
            orcamento.setCurso(novo.getCurso());
            orcamento.setData(new Date());
            orcamento.setDataInicio(novo.getDataInicio());
            orcamento.setDataTermino(novo.getDataTermino());
            orcamento.setDuracaoAcomodacao(novo.getDuracaoAcomodacao());
            orcamento.setFornecedor(novo.getFornecedor());
            orcamento.setFornecedorcidade(novo.getFornecedorcidade());
            orcamento.setIdCurso(0);
            orcamento.setIdioma(novo.getIdioma());
            orcamento.setMaterialDidatico(novo.getMaterialDidatico());
            orcamento.setNivelIdioma(novo.getNivelIdioma());
            orcamento.setNumeroSemanas(novo.getNumeroSemanas());
            orcamento.setObservacao(novo.getObservacao());
            orcamento.setOutrasTaxas(novo.getOutrasTaxas());
            orcamento.setPassagemAerea(novo.getPassagemAerea());
            orcamento.setRefeicoes(novo.getRefeicoes());
            orcamento.setSedexInternacional(novo.getSedexInternacional());
            orcamento.setSeguroSaude(novo.getSeguroSaude());
            orcamento.setSituacao(novo.getSituacao());
            orcamento.setTipoAcomodacao(novo.getTipoAcomodacao());
            orcamento.setTipoDuracao(novo.getTipoDuracao());
            orcamento.setTipoQuarto(novo.getTipoQuarto());
            orcamento.setTransfer(novo.getTransfer());
            orcamento.setUnidadenegocio(novo.getUnidadenegocio());
            orcamento.setValor(novo.getValor());
            orcamento.setValorCambio(novo.getValorCambio());
            orcamento.setVistoConsular(novo.getVistoConsular());
        }
    }
    
    public void carregarListaProdutos(int idOrcamento) {
        OrcamentoCursoController orcamentoCursoController = new OrcamentoCursoController();
        List<Produtoorcamentocurso> listaOrcametoProduto = orcamentoCursoController.listarProdutoOrcamentoCurso(idOrcamento);
        listaProdutoOrcamentoBean = new ArrayList<ProdutoOrcamentoCursoBean>();
        if (listaOrcametoProduto != null) {
            for (int i = 0; i < listaOrcametoProduto.size(); i++) {
                Produtosorcamento prod = orcamentoCursoController.consultarProdutoOrcamentoCurso(listaOrcametoProduto.get(i).getProdutosOrcamento());
                ProdutoOrcamentoCursoBean pob = new ProdutoOrcamentoCursoBean();
                pob.setDescricaoProdutoOrcamento(prod.getDescricao());
                pob.setIdProdutoOrcamento(prod.getIdprodutosOrcamento());
                pob.setValorMoedaEstrangeira(listaOrcametoProduto.get(i).getValorMoedaEstrangeira());
                pob.setValorMoedaReal(listaOrcametoProduto.get(i).getValorMoedaNacional());
                pob.setIdProdutoOrcamentoCurso(listaOrcametoProduto.get(i).getIdprodutoOrcamentoCurso());
                pob.setApagar(false);
                pob.setNovo(false);
                listaProdutoOrcamentoBean.add(pob);
            }
        }
    }
    
    public void carregarFormaPagamento(int idOrcamento){
        OrcamentoCursoFormaPagamentoController orcamentoCursoFormaPagamentoController = new OrcamentoCursoFormaPagamentoController();
        Orcamentocursoformapagamento novo = orcamentoCursoFormaPagamentoController.consultar(idOrcamento);
        formaPagamento = new Orcamentocursoformapagamento();
        if (novo!=null){
            formaPagamento.setAVista(novo.getAVista());
            formaPagamento.setFinaciamento(novo.getFinaciamento());
            formaPagamento.setNumeroParcelas02(novo.getNumeroParcelas02());
            formaPagamento.setNumeroParcelas03(novo.getNumeroParcelas03());
            formaPagamento.setNumeroParcelasFinanciamento(novo.getNumeroParcelasFinanciamento());
            formaPagamento.setOrcamento(novo.getOrcamento());
            formaPagamento.setPercentualEntrada2(novo.getPercentualEntrada2());
            formaPagamento.setPercentualEntrada3(novo.getPercentualEntrada3());
            formaPagamento.setPercentualSaldo2(novo.getPercentualSaldo2());
            formaPagamento.setPercentualSaldo3(novo.getPercentualSaldo3());
            formaPagamento.setValorEntrada2(novo.getValorEntrada2());
            formaPagamento.setValorEntrada3(novo.getValorEntrada3());
            formaPagamento.setValorParcela02(novo.getValorParcela02());
            formaPagamento.setValorParcela03(novo.getValorParcela03());
            formaPagamento.setValorSaldo2(novo.getValorSaldo2());
            formaPagamento.setValorSaldo3(novo.getValorSaldo3());
            formaPagamento.setaVista(novo.getaVista());
        }
    }
    
    
    
    
}
