/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "fornecedorproduto")
public class Fornecedorproduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfornecedorProduto")
    private Integer idfornecedorProduto;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;
    @Column(name = "produtos_idprodutos")
    private int produtos;

    public Fornecedorproduto() {
    }

    public Fornecedorproduto(Integer idfornecedorProduto) {
        this.idfornecedorProduto = idfornecedorProduto;
    }

    public Integer getIdfornecedorProduto() {
        return idfornecedorProduto;
    }

    public void setIdfornecedorProduto(Integer idfornecedorProduto) {
        this.idfornecedorProduto = idfornecedorProduto;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedorProduto != null ? idfornecedorProduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedorproduto)) {
            return false;
        }
        Fornecedorproduto other = (Fornecedorproduto) object;
        if ((this.idfornecedorProduto == null && other.idfornecedorProduto != null) || (this.idfornecedorProduto != null && !this.idfornecedorProduto.equals(other.idfornecedorProduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Fornecedorproduto[ idfornecedorProduto=" + idfornecedorProduto + " ]";
    }
    
}
