/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Comissao;

import java.util.List;
import model.Parcelamentopagamento;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class DesagiosBean {
    
    private UsuarioLogadoBean usuarioLogadoBean;
    private List<Parcelamentopagamento> listaParcelamento;
    private Float boleto;
    private Float cartao;
    private Float juros;
    private Float cartaoDebito;
    

    public DesagiosBean(UsuarioLogadoBean usuarioLogadoBean, List<Parcelamentopagamento> listaParcelamento) {
        this.cartao=0.0f;
        this.juros=0.0f;
        this.boleto=0.0f;
        this.cartaoDebito=0.0f;
        this.usuarioLogadoBean = usuarioLogadoBean;
        this.listaParcelamento = listaParcelamento;
        verificarDesagios();
    }

    public Float getBoleto() {
        return boleto;
    }

    public void setBoleto(Float boleto) {
        this.boleto = boleto;
    }

    public Float getCartao() {
        return cartao;
    }

    public void setCartao(Float cartao) {
        this.cartao = cartao;
    }

    public Float getJuros() {
        return juros;
    }

    public void setJuros(Float juros) {
        this.juros = juros;
    }

    public Float getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(Float cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }
    
    

    public void verificarDesagios(){
        for(int i=0;i<listaParcelamento.size();i++){
            if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Boleto")){
                calcularDesagioBoleto(listaParcelamento.get(i));
            }else if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Cartão de crédito")){
                calcularDesagioCartao(listaParcelamento.get(i));
            }else if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Cartão de crédito autorizado")){
                
            }else if (listaParcelamento.get(i).getFormaPagamento().equalsIgnoreCase("Cartão débito")){
                
            }
        }
    }
    
    public void calcularDesagioBoleto(Parcelamentopagamento parcela){
        boleto = boleto + (parcela.getNumeroParcelas() * usuarioLogadoBean.getParametrosprodutos().getBoletos());
    }
    
    public void calcularCartaoDebito(Parcelamentopagamento parcela){
        cartaoDebito = cartaoDebito + (parcela.getValorParcelamento()*(usuarioLogadoBean.getParametrosprodutos().getCartaodebito()/100));
    }
    
    public void calcularDesagioCartao(Parcelamentopagamento parcela){
       if (parcela.getNumeroParcelas()==1){
           cartao = cartao + (parcela.getValorParcelamento()* (usuarioLogadoBean.getParametrosprodutos().getCartao01()/100));
       } else if (parcela.getNumeroParcelas()<7){
           cartao = cartao + (parcela.getValorParcelamento()* (usuarioLogadoBean.getParametrosprodutos().getCartao02()/100));
       }else if (parcela.getNumeroParcelas()>=7){
           cartao = cartao + (parcela.getValorParcelamento()* (usuarioLogadoBean.getParametrosprodutos().getCartao07()/100));
       }
    }
}
