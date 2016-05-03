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
@Table(name = "formapagamento")
public class Formapagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idformaPagamento")
    private Integer idformaPagamento;
    @Column(name = "condicao")
    private String condicao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorOrcamento")
    private Float valorOrcamento;
    @Column(name = "possuiJuros")
    private String possuiJuros;
    @Column(name = "valorJuros")
    private Float valorJutos;
    @Column(name = "valorTotal")
    private Float valorTotal;
    @Column(name = "valordesconto")
    private Float valordesconto;
    @Column(name = "observacoes")
    private String observacoes;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Formapagamento() {
    }

    public Formapagamento(Integer idformaPagamento) {
        this.idformaPagamento = idformaPagamento;
    }

    public Integer getIdformaPagamento() {
        return idformaPagamento;
    }

    public void setIdformaPagamento(Integer idformaPagamento) {
        this.idformaPagamento = idformaPagamento;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }

    public Float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Float getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(Float valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }

    

    public String getPossuiJuros() {
        return possuiJuros;
    }

    public void setPossuiJuros(String possuiJuros) {
        this.possuiJuros = possuiJuros;
    }

    public Float getValordesconto() {
        return valordesconto;
    }

    public void setValordesconto(Float valordesconto) {
        this.valordesconto = valordesconto;
    }

    


    public Float getValorJutos() {
        return valorJutos;
    }

    public void setValorJutos(Float valorJutos) {
        this.valorJutos = valorJutos;
    }


    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idformaPagamento != null ? idformaPagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Formapagamento)) {
            return false;
        }
        Formapagamento other = (Formapagamento) object;
        if ((this.idformaPagamento == null && other.idformaPagamento != null) || (this.idformaPagamento != null && !this.idformaPagamento.equals(other.idformaPagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Formapagamento[ idformaPagamento=" + idformaPagamento + " ]";
    }
    
}
