/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.view;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewprodutosfiltro")
public class Viewprodutosfiltro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idfiltroOrcamentoProduto")
    @Id
    private int idfiltroOrcamentoProduto;
    @Basic(optional = false)
    @Column(name = "idProdutosOrcamento")
    private int idProdutosOrcamento;
    @Column(name = "descricaoProdutosOrcamento")
    private String descricaoProdutosOrcamento;
    @Basic(optional = false)
    @Column(name = "idprodutos")
    private int idprodutos;
    @Column(name = "descricaoProdutos")
    private String descricaoProdutos;

    public Viewprodutosfiltro() {
    }

    public int getIdfiltroOrcamentoProduto() {
        return idfiltroOrcamentoProduto;
    }

    public void setIdfiltroOrcamentoProduto(int idfiltroOrcamentoProduto) {
        this.idfiltroOrcamentoProduto = idfiltroOrcamentoProduto;
    }

    public int getIdProdutosOrcamento() {
        return idProdutosOrcamento;
    }

    public void setIdProdutosOrcamento(int idProdutosOrcamento) {
        this.idProdutosOrcamento = idProdutosOrcamento;
    }

    public String getDescricaoProdutosOrcamento() {
        return descricaoProdutosOrcamento;
    }

    public void setDescricaoProdutosOrcamento(String descricaoProdutosOrcamento) {
        this.descricaoProdutosOrcamento = descricaoProdutosOrcamento;
    }

    public int getIdprodutos() {
        return idprodutos;
    }

    public void setIdprodutos(int idprodutos) {
        this.idprodutos = idprodutos;
    }

    public String getDescricaoProdutos() {
        return descricaoProdutos;
    }

    public void setDescricaoProdutos(String descricaoProdutos) {
        this.descricaoProdutos = descricaoProdutos;
    }

    @Override
    public String toString() {
        return this.descricaoProdutosOrcamento;
    }
    
    
    
}
