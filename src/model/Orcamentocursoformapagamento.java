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
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "orcamentocursoformapagamento")
public class Orcamentocursoformapagamento implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idorcamentoCursoFormaPagamento")
    private Integer idorcamentoCursoFormaPagamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "aVista")
    private Float aVista;
    @Column(name = "percentualEntrada2")
    private Double percentualEntrada2;
    @Column(name = "valorEntrada2")
    private Float valorEntrada2;
    @Column(name = "percentualSaldo2")
    private Double percentualSaldo2;
    @Column(name = "valorSaldo2")
    private Float valorSaldo2;
    @Column(name = "percentualEntrada3")
    private Double percentualEntrada3;
    @Column(name = "valorEntrada3")
    private Float valorEntrada3;
    @Column(name = "percentualSaldo3")
    private Double percentualSaldo3;
    @Column(name = "valorSaldo3")
    private Float valorSaldo3;
    @Column(name = "numeroParcelasFinanciamento")
    private int numeroParcelasFinanciamento;
    @Column(name = "finaciamento")
    private Float finaciamento;
    @Column(name = "numeroParcelas02")
    private int numeroParcelas02;
    @Column(name = "valorParcela02")
    private Float valorParcela02; 
    @Column(name = "numeroParcelas03")
    private int numeroParcelas03;
    @Column(name = "valorParcela03")
    private Float valorParcela03; 
    @Column(name = "orcamentoCurso_idorcamentoCurso")
    private int orcamento;

    public Orcamentocursoformapagamento() {
    }

    public Orcamentocursoformapagamento(Integer idorcamentoCursoFormaPagamento) {
        this.idorcamentoCursoFormaPagamento = idorcamentoCursoFormaPagamento;
    }

    public Integer getIdorcamentoCursoFormaPagamento() {
        return idorcamentoCursoFormaPagamento;
    }

    public void setIdorcamentoCursoFormaPagamento(Integer idorcamentoCursoFormaPagamento) {
        this.idorcamentoCursoFormaPagamento = idorcamentoCursoFormaPagamento;
    }

    public Float getAVista() {
        return aVista;
    }

    public void setAVista(Float aVista) {
        this.aVista = aVista;
    }

    public Double getPercentualEntrada2() {
        return percentualEntrada2;
    }

    public int getNumeroParcelas02() {
        return numeroParcelas02;
    }

    public void setNumeroParcelas02(int numeroParcelas02) {
        this.numeroParcelas02 = numeroParcelas02;
    }

    public Float getValorParcela02() {
        return valorParcela02;
    }

    public void setValorParcela02(Float valorParcela02) {
        this.valorParcela02 = valorParcela02;
    }

    public int getNumeroParcelas03() {
        return numeroParcelas03;
    }

    public void setNumeroParcelas03(int numeroParcelas03) {
        this.numeroParcelas03 = numeroParcelas03;
    }

   

    
    public Float getValorParcela03() {
        return valorParcela03;
    }

    public void setValorParcela03(Float valorParcela03) {
        this.valorParcela03 = valorParcela03;
    }

    public int getNumeroParcelasFinanciamento() {
        return numeroParcelasFinanciamento;
    }

    public void setNumeroParcelasFinanciamento(int numeroParcelasFinanciamento) {
        this.numeroParcelasFinanciamento = numeroParcelasFinanciamento;
    }

    public int getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(int orcamento) {
        this.orcamento = orcamento;
    }

    public void setPercentualEntrada2(Double percentualEntrada2) {
        this.percentualEntrada2 = percentualEntrada2;
    }

    public Float getValorEntrada2() {
        return valorEntrada2;
    }

    public void setValorEntrada2(Float valorEntrada2) {
        this.valorEntrada2 = valorEntrada2;
    }

    public Double getPercentualSaldo2() {
        return percentualSaldo2;
    }

    public void setPercentualSaldo2(Double percentualSaldo2) {
        this.percentualSaldo2 = percentualSaldo2;
    }

    public Float getValorSaldo2() {
        return valorSaldo2;
    }

    public void setValorSaldo2(Float valorSaldo2) {
        this.valorSaldo2 = valorSaldo2;
    }

    public Double getPercentualEntrada3() {
        return percentualEntrada3;
    }

    public void setPercentualEntrada3(Double percentualEntrada3) {
        this.percentualEntrada3 = percentualEntrada3;
    }

    public Float getValorEntrada3() {
        return valorEntrada3;
    }

    public void setValorEntrada3(Float valorEntrada3) {
        this.valorEntrada3 = valorEntrada3;
    }

    public Double getPercentualSaldo3() {
        return percentualSaldo3;
    }

    public void setPercentualSaldo3(Double percentualSaldo3) {
        this.percentualSaldo3 = percentualSaldo3;
    }

    public Float getValorSaldo3() {
        return valorSaldo3;
    }

    public void setValorSaldo3(Float valorSaldo3) {
        this.valorSaldo3 = valorSaldo3;
    }

    public Float getFinaciamento() {
        return finaciamento;
    }

    public void setFinaciamento(Float finaciamento) {
        this.finaciamento = finaciamento;
    }

    public Float getaVista() {
        return aVista;
    }

    public void setaVista(Float aVista) {
        this.aVista = aVista;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorcamentoCursoFormaPagamento != null ? idorcamentoCursoFormaPagamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orcamentocursoformapagamento)) {
            return false;
        }
        Orcamentocursoformapagamento other = (Orcamentocursoformapagamento) object;
        if ((this.idorcamentoCursoFormaPagamento == null && other.idorcamentoCursoFormaPagamento != null) || (this.idorcamentoCursoFormaPagamento != null && !this.idorcamentoCursoFormaPagamento.equals(other.idorcamentoCursoFormaPagamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Orcamentocursoformapagamento[ idorcamentoCursoFormaPagamento=" + idorcamentoCursoFormaPagamento + " ]";
    }
    
}
