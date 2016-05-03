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
@Table(name = "viewfornecedor")
public class Viewfornecedor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    @Id
    private int idfornecedor;
    @Column(name = "nome")
    private String nome;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "pais")
    private String pais;
    @Basic(optional = false)
    @Column(name = "idfornecedorProduto")
    private int idfornecedorProduto;
    @Basic(optional = false)
    @Column(name = "produtos_idprodutos")
    private int produtosIdprodutos;

    public Viewfornecedor() {
    }

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getIdfornecedorProduto() {
        return idfornecedorProduto;
    }

    public void setIdfornecedorProduto(int idfornecedorProduto) {
        this.idfornecedorProduto = idfornecedorProduto;
    }

    public int getProdutosIdprodutos() {
        return produtosIdprodutos;
    }

    public void setProdutosIdprodutos(int produtosIdprodutos) {
        this.produtosIdprodutos = produtosIdprodutos;
    }
    
}
