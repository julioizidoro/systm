/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "fornecedorcomissaocursoproduto")
public class Fornecedorcomissaocursoproduto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfornecedorcomissaocursoproduto")
    private Integer idfornecedorcomissaocursoproduto;
    @JoinColumn(name = "fornecedorcomissaocurso_idfornecedorcomissao", referencedColumnName = "idfornecedorcomissao")
    @ManyToOne(optional = false)
    private Fornecedorcomissaocurso fornecedorcomissaocurso;
    @JoinColumn(name = "produtosOrcamento_idprodutosOrcamento", referencedColumnName = "idprodutosOrcamento")
    @ManyToOne(optional = false)
    private Produtosorcamento produtosorcamento;

    public Fornecedorcomissaocursoproduto() {
    }

    public Fornecedorcomissaocursoproduto(Integer idfornecedorcomissaocursoproduto) {
        this.idfornecedorcomissaocursoproduto = idfornecedorcomissaocursoproduto;
    }

    public Integer getIdfornecedorcomissaocursoproduto() {
        return idfornecedorcomissaocursoproduto;
    }

    public void setIdfornecedorcomissaocursoproduto(Integer idfornecedorcomissaocursoproduto) {
        this.idfornecedorcomissaocursoproduto = idfornecedorcomissaocursoproduto;
    }

    public Fornecedorcomissaocurso getFornecedorcomissaocurso() {
        return fornecedorcomissaocurso;
    }

    public void setFornecedorcomissaocurso(Fornecedorcomissaocurso fornecedorcomissaocurso) {
        this.fornecedorcomissaocurso = fornecedorcomissaocurso;
    }

    public Produtosorcamento getProdutosorcamento() {
        return produtosorcamento;
    }

    public void setProdutosorcamento(Produtosorcamento produtosorcamento) {
        this.produtosorcamento = produtosorcamento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfornecedorcomissaocursoproduto != null ? idfornecedorcomissaocursoproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fornecedorcomissaocursoproduto)) {
            return false;
        }
        Fornecedorcomissaocursoproduto other = (Fornecedorcomissaocursoproduto) object;
        if ((this.idfornecedorcomissaocursoproduto == null && other.idfornecedorcomissaocursoproduto != null) || (this.idfornecedorcomissaocursoproduto != null && !this.idfornecedorcomissaocursoproduto.equals(other.idfornecedorcomissaocursoproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Fornecedorcomissaocursoproduto[ idfornecedorcomissaocursoproduto=" + idfornecedorcomissaocursoproduto + " ]";
    }
    
}
