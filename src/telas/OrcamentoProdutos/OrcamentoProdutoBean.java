/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.OrcamentoProdutos;

/**
 *
 * @author Wolverine
 */
public class OrcamentoProdutoBean {
    
    private String nomeFornecedor;
    private String cidadeFornecedor;
    private String paisFornecedor;
    private String descricao;
    private String siglaMoeda;
    private Float valorCambio;
    private float valorMoedaEstrangeira;
    private float valorMoedaNacional;

    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getCidadeFornecedor() {
        return cidadeFornecedor;
    }

    public void setCidadeFornecedor(String cidadeFornecedor) {
        this.cidadeFornecedor = cidadeFornecedor;
    }

    public String getPaisFornecedor() {
        return paisFornecedor;
    }

    public void setPaisFornecedor(String paisFornecedor) {
        this.paisFornecedor = paisFornecedor;
    }

    public String getSiglaMoeda() {
        return siglaMoeda;
    }

    public void setSiglaMoeda(String siglaMoeda) {
        this.siglaMoeda = siglaMoeda;
    }

    public Float getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Float valorCambio) {
        this.valorCambio = valorCambio;
    }

    

    

    public float getValorMoedaEstrangeira() {
        return valorMoedaEstrangeira;
    }

    public void setValorMoedaEstrangeira(float valorMoedaEstrangeira) {
        this.valorMoedaEstrangeira = valorMoedaEstrangeira;
    }

    public float getValorMoedaNacional() {
        return valorMoedaNacional;
    }

    public void setValorMoedaNacional(float valorMoedaNacional) {
        this.valorMoedaNacional = valorMoedaNacional;
    }
    
    
    
    
    
    
}
