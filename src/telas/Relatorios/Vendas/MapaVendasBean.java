/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Relatorios.Vendas;

import java.util.Date;

/**
 *
 * @author Wolverine
 */
public class MapaVendasBean {
    
    private Date datVenda;
    private int idVenda; 
    private String nomeCliente;
    private String produto;
    private String fornecedor; 
    private String consultor; 
    private String unidadeNegócio; 
    private String moeda; 
    private float cambio; 
    private float valorBruto;

    public Date getDatVenda() {
        return datVenda;
    }

    public void setDatVenda(Date datVenda) {
        this.datVenda = datVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getConsultor() {
        return consultor;
    }

    public void setConsultor(String consultor) {
        this.consultor = consultor;
    }

    public String getUnidadeNegócio() {
        return unidadeNegócio;
    }

    public void setUnidadeNegócio(String unidadeNegócio) {
        this.unidadeNegócio = unidadeNegócio;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }

    public float getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(float valorBruto) {
        this.valorBruto = valorBruto;
    }
    
    
    
}
