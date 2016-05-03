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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "modeloprodutoorcamentocurso")
@NamedQueries({
    @NamedQuery(name = "Modeloprodutoorcamentocurso.findAll", query = "SELECT m FROM Modeloprodutoorcamentocurso m")})
public class Modeloprodutoorcamentocurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprodutoOrcamentoCurso")
    private Integer idprodutoOrcamentoCurso;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorMoedaEstrangeira")
    private Float valorMoedaEstrangeira;
    @Column(name = "valorMoedaNacional")
    private Float valorMoedaNacional;
    @Column(name = "produtosOrcamento_idprodutosOrcamento")
    private int produtosOrcamento;
    @Column(name = "modeloOrcamentoCurso_idorcamentoCurso")
    private int modeloOrcamentoCurso;
    
    
    

    public Modeloprodutoorcamentocurso() {
    }

    public Modeloprodutoorcamentocurso(Integer idprodutoOrcamentoCurso) {
        this.idprodutoOrcamentoCurso = idprodutoOrcamentoCurso;
    }

    public Integer getIdprodutoOrcamentoCurso() {
        return idprodutoOrcamentoCurso;
    }

    public void setIdprodutoOrcamentoCurso(Integer idprodutoOrcamentoCurso) {
        this.idprodutoOrcamentoCurso = idprodutoOrcamentoCurso;
    }

    public Float getValorMoedaEstrangeira() {
        return valorMoedaEstrangeira;
    }

    public void setValorMoedaEstrangeira(Float valorMoedaEstrangeira) {
        this.valorMoedaEstrangeira = valorMoedaEstrangeira;
    }

    public Float getValorMoedaNacional() {
        return valorMoedaNacional;
    }

    public void setValorMoedaNacional(Float valorMoedaNacional) {
        this.valorMoedaNacional = valorMoedaNacional;
    }

    public int getProdutosOrcamento() {
        return produtosOrcamento;
    }

    public void setProdutosOrcamento(int produtosOrcamento) {
        this.produtosOrcamento = produtosOrcamento;
    }

    public int getModeloOrcamentoCurso() {
        return modeloOrcamentoCurso;
    }

    public void setModeloOrcamentoCurso(int modeloOrcamentoCurso) {
        this.modeloOrcamentoCurso = modeloOrcamentoCurso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprodutoOrcamentoCurso != null ? idprodutoOrcamentoCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Modeloprodutoorcamentocurso)) {
            return false;
        }
        Modeloprodutoorcamentocurso other = (Modeloprodutoorcamentocurso) object;
        if ((this.idprodutoOrcamentoCurso == null && other.idprodutoOrcamentoCurso != null) || (this.idprodutoOrcamentoCurso != null && !this.idprodutoOrcamentoCurso.equals(other.idprodutoOrcamentoCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Modeloprodutoorcamentocurso[ idprodutoOrcamentoCurso=" + idprodutoOrcamentoCurso + " ]";
    }
    
}
