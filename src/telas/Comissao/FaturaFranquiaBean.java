/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Comissao;

import controller.FaturaFranquiasController;
import java.util.List;
import model.Faturafranquias;
import model.Parcelamentopagamento;
import model.Vendascomissao;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class FaturaFranquiaBean {
    
    private Faturafranquias fatura;
    private UsuarioLogadoBean usuarioLogadoBean;

    public FaturaFranquiaBean(Vendascomissao vendascomissao, List<Parcelamentopagamento> listaParcelamento, UsuarioLogadoBean usuarioLogadoBean) {
        fatura = new Faturafranquias();
        this.usuarioLogadoBean = usuarioLogadoBean;
        veriricarFaturaFranquia(vendascomissao.getIdvendascomissao());
        fatura.setVendascomissao(vendascomissao);
        gerarFaturaFranquias(listaParcelamento);
    }
    
    public void veriricarFaturaFranquia(int idVendasComissao){
        FaturaFranquiasController faturaFranquiasController = new FaturaFranquiasController();
        fatura = faturaFranquiasController.getFaturaFranquia(idVendasComissao);
        if (fatura!=null){
            faturaFranquiasController.excluir(fatura.getIdfaturafranquias());
        }
        fatura=new Faturafranquias();
    }
    
    public void gerarFaturaFranquias(List<Parcelamentopagamento> listaParcelamento){
        Float liquido = 0.0f;
        Float pagoMatriz = 0.0f;
        if ((fatura.getVendascomissao().getVendas().getProdutos() != usuarioLogadoBean.getParametrosprodutos().getSeguroPrivado())
                && (fatura.getVendascomissao().getVendas().getProdutos() != usuarioLogadoBean.getParametrosprodutos().getSeguroGovernamental())) {
            for (int i = 0; i < listaParcelamento.size(); i++) {
                if (listaParcelamento.get(i).getTipoParcelmaneto().equalsIgnoreCase("Matriz")) {
                    pagoMatriz = pagoMatriz + listaParcelamento.get(i).getValorParcelamento();
                }
            }
        } else {
            pagoMatriz = 0.0f;
        }
        Float taxaTM = fatura.getVendascomissao().getTaxatm()/2;
        Float comissao = fatura.getVendascomissao().getComissaofraquia();
        Float desagio = fatura.getVendascomissao().getDesagio()/2;
        Float descontoMatriz = fatura.getVendascomissao().getDescontotm()/2;
        Float valorTotal = fatura.getVendascomissao().getVendas().getValor();
        liquido = comissao + taxaTM - desagio - descontoMatriz - valorTotal + pagoMatriz;
        fatura.setPagomatriz(pagoMatriz);
        fatura.setLiquidopagar(liquido);
        FaturaFranquiasController faturaFranquiasController = new FaturaFranquiasController();
        faturaFranquiasController.salvar(fatura);
    }
}
