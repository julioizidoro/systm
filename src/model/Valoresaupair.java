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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "valoresaupair")
@NamedQueries({
    @NamedQuery(name = "Valoresaupair.findAll", query = "SELECT v FROM Valoresaupair v")})
public class Valoresaupair implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idvaloresAupair")
    private Integer idvaloresAupair;
    @Size(max = 100)
    @Column(name = "descricao")
    private String descricao;
    @Size(max = 100)
    @Column(name = "inicio")
    private String inicio;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorgross")
    private Float valorgross;
    @Column(name = "valornet")
    private Float valornet;
    @Size(max = 10)
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "comissaopremium")
    private Float comissaopremium;
    @Column(name = "comissaoexpress")
    private Float comissaoexpress;
    @JoinColumn(name = "produtosOrcamento_idprodutosOrcamento", referencedColumnName = "idprodutosOrcamento")
    @ManyToOne(optional = false)
    private Produtosorcamento produtosorcamento;
    @JoinColumn(name = "moedas_idmoedas1", referencedColumnName = "idmoedas")
    @ManyToOne(optional = false)
    private Moedas moedas;
    @JoinColumn(name = "moedas_idmoedas", referencedColumnName = "idmoedas")
    @ManyToOne(optional = false)
    private Moedas moedas1;
    @JoinColumn(name = "fornecedorcidade_idfornecedorcidade", referencedColumnName = "idfornecedorcidade")
    @ManyToOne(optional = false)
    private Fornecedorcidade fornecedorcidade;
    @JoinColumn(name = "fornecedor_idfornecedor", referencedColumnName = "idfornecedor")
    @ManyToOne(optional = false)
    private Fornecedor fornecedor;

    public Valoresaupair() {
    }

    public Valoresaupair(Integer idvaloresAupair) {
        this.idvaloresAupair = idvaloresAupair;
    }

    public Integer getIdvaloresAupair() {
        return idvaloresAupair;
    }

    public void setIdvaloresAupair(Integer idvaloresAupair) {
        this.idvaloresAupair = idvaloresAupair;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public Float getValorgross() {
        return valorgross;
    }

    public void setValorgross(Float valorgross) {
        this.valorgross = valorgross;
    }

    public Float getValornet() {
        return valornet;
    }

    public void setValornet(Float valornet) {
        this.valornet = valornet;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Float getComissaopremium() {
        return comissaopremium;
    }

    public void setComissaopremium(Float comissaopremium) {
        this.comissaopremium = comissaopremium;
    }

    public Float getComissaoexpress() {
        return comissaoexpress;
    }

    public void setComissaoexpress(Float comissaoexpress) {
        this.comissaoexpress = comissaoexpress;
    }

    public Produtosorcamento getProdutosorcamento() {
        return produtosorcamento;
    }

    public void setProdutosorcamento(Produtosorcamento produtosorcamento) {
        this.produtosorcamento = produtosorcamento;
    }

    public Moedas getMoedas() {
        return moedas;
    }

    public void setMoedas(Moedas moedas) {
        this.moedas = moedas;
    }

    public Moedas getMoedas1() {
        return moedas1;
    }

    public void setMoedas1(Moedas moedas1) {
        this.moedas1 = moedas1;
    }

    public Fornecedorcidade getFornecedorcidade() {
        return fornecedorcidade;
    }

    public void setFornecedorcidade(Fornecedorcidade fornecedorcidade) {
        this.fornecedorcidade = fornecedorcidade;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvaloresAupair != null ? idvaloresAupair.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Valoresaupair)) {
            return false;
        }
        Valoresaupair other = (Valoresaupair) object;
        if ((this.idvaloresAupair == null && other.idvaloresAupair != null) || (this.idvaloresAupair != null && !this.idvaloresAupair.equals(other.idvaloresAupair))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Valoresaupair[ idvaloresAupair=" + idvaloresAupair + " ]";
    }
    
}
