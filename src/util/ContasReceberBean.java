/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.ContasReceberController;
import controller.ParametrosProdutosController;
import controller.PlanoContaController;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Contasreceber;
import model.Parametrosprodutos;
import model.Parcelamentopagamento;
import model.Planoconta;
import model.Vendas;
import telas.Usuarios.UsuarioLogadoBean;

/**
 *
 * @author Wolverine
 */
public class ContasReceberBean {
    
    private Vendas venda;
    private List<Parcelamentopagamento> listaParcelas;
    private UsuarioLogadoBean usuarioLogadoBean;
    private List<Contasreceber> listaContas;
    private Planoconta planoConta;

    public ContasReceberBean(Vendas venda, List<Parcelamentopagamento> listaParcelas, UsuarioLogadoBean usuarioLogadoBean) {
        this.venda = venda;
        this.listaParcelas = listaParcelas;
        this.usuarioLogadoBean = usuarioLogadoBean;
        getPlanoConta();
        verificarParcelamento();
    }
    

    
    
    public void verificarParcelamento(){
        this.listaContas = new ArrayList<Contasreceber>();
        for (int i=0;i<listaParcelas.size();i++){
            if (listaParcelas.get(i).getTipoParcelmaneto().equalsIgnoreCase("Matriz")){
                gerarParcelas(listaParcelas.get(i));
            }
        }
        if (listaContas.size()>0){
            salvarContasReceber();
        }
    }
    
    public void gerarParcelas(Parcelamentopagamento parcela){
        String data = Formatacao.ConvercaoDataPadrao(parcela.getDiaVencimento());
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 10);
        String dia = data.substring(0,2);
        int cmes = Integer.parseInt(mes);
        int cano = Integer.parseInt(ano);
        int numeroParcelas=0;
        Float valorParcela=0.0f;
        Date cData;
        if (parcela.getFormaPagamento().equalsIgnoreCase("Financiamento banco")){
        	numeroParcelas=1;
        	valorParcela = parcela.getValorParcelamento();
        	cData = new Date();
        }else  {
        	numeroParcelas = parcela.getNumeroParcelas();
        	valorParcela = parcela.getValorParcela();
        	cData = parcela.getDiaVencimento();
        }
        String numeroParcelasFormatado = "00";
        if (numeroParcelas<10){
            numeroParcelasFormatado = "0" + String.valueOf(numeroParcelas);
        }
        for(int i=0;i<numeroParcelas;i++){
            Contasreceber conta = new Contasreceber();
            conta.setNumerodocumento(String.valueOf(venda.getIdvendas()));
            if (i<9){
                conta.setNumeroparcelas("0" + (String.valueOf(i+1)) + "/" + numeroParcelasFormatado);
            }else {
                conta.setNumeroparcelas((String.valueOf(i+1)) + "/" + numeroParcelasFormatado);
            }
            conta.setValorparcela(valorParcela);
            conta.setDatavencimento(cData);
            conta.setTipodocumento(parcela.getFormaPagamento());
            conta.setBanco(usuarioLogadoBean.getUnidadeNegocio().getBanco());
            conta.setDesagio(0.0f);
            conta.setJuros(0.0f);
            conta.setPlanoconta(this.planoConta);
            conta.setValorpago(0.0f);
            conta.setBoletogerado("N");
            conta.setBoletocancelado(false);
            conta.setBoletoenviado(false);
            conta.setDataalterada(false);
            conta.setBoletoenviado(false);
            conta.setVendas(venda);
            listaContas.add(conta);
            if (cmes==12){
                cmes = 1;
                cano = cano + 1;
            }else {
                cmes=cmes +1;
            }
            if (cmes<10){
                data = dia + "/" + "0" + String.valueOf(cmes) +  "/" + String.valueOf(cano);
            }else {
                data = dia + "/"  + String.valueOf(cmes) +  "/" + String.valueOf(cano);
            }
            cData = Formatacao.ConvercaoStringData(data);
        }
        
    }
    
    public void salvarContasReceber(){
        ContasReceberController contasReceberController = new ContasReceberController();
        for(int i=0;i<listaContas.size();i++){
            contasReceberController.salvar(listaContas.get(i));
        }
    }
    
    public void getPlanoConta(){
        ParametrosProdutosController parametrosProdutosController = new ParametrosProdutosController();
        Parametrosprodutos parametrosprodutos = parametrosProdutosController.consultar();
        PlanoContaController planoContaController = new PlanoContaController();
        planoConta = planoContaController.consultar(parametrosprodutos.getIdplanocontas());
    }
    
    
}
