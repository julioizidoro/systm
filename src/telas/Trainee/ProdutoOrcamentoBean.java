/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Trainee;

/**
 *
 * @author Wolverine
 */
public class ProdutoOrcamentoBean {
    
    private int idProdutoOrcamento;
    private String descricaoProdutoOrcamento;
    private float valorMoedaEstrangeira;
    private float valorMoedaReal;
    private boolean seguro;
    private boolean visto;
    private boolean apagar;
    private boolean novo;
    private int idOrcamentoProdutoOrcamento;
    private int adicionado =0;
    private String tipo;

    public int getIdProdutoOrcamento() {
        return idProdutoOrcamento;
    }

    public void setIdProdutoOrcamento(int idProdutoOrcamento) {
        this.idProdutoOrcamento = idProdutoOrcamento;
    }

    public String getDescricaoProdutoOrcamento() {
        return descricaoProdutoOrcamento;
    }

    public void setDescricaoProdutoOrcamento(String descricaoProdutoOrcamento) {
        this.descricaoProdutoOrcamento = descricaoProdutoOrcamento;
    }

    public float getValorMoedaEstrangeira() {
        return valorMoedaEstrangeira;
    }

    public int getAdicionado() {
        return adicionado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setAdicionado(int adicionado) {
        this.adicionado = adicionado;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public int getIdOrcamentoProdutoOrcamento() {
        return idOrcamentoProdutoOrcamento;
    }

    public void setIdOrcamentoProdutoOrcamento(int idOrcamentoProdutoOrcamento) {
        this.idOrcamentoProdutoOrcamento = idOrcamentoProdutoOrcamento;
    }

    public void setValorMoedaEstrangeira(float valorMoedaEstrangeira) {
        this.valorMoedaEstrangeira = valorMoedaEstrangeira;
    }

    public float getValorMoedaReal() {
        return valorMoedaReal;
    }

    public void setValorMoedaReal(float valorMoedaReal) {
        this.valorMoedaReal = valorMoedaReal;
    }

    public boolean isSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public boolean isVisto() {
        return visto;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }

    public boolean isApagar() {
        return apagar;
    }

    public void setApagar(boolean apagar) {
        this.apagar = apagar;
    }
    
    
    
    
}
