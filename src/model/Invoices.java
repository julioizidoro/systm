/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "invoices")
public class Invoices implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idinvoices")
    private Integer idinvoices;
    @Column(name = "dataPrevistaPagamento")
    @Temporal(TemporalType.DATE)
    private Date dataPrevistaPagamento;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorPrevistoInvoice")
    private Float valorPrevistoInvoice;
    @Column(name = "dataPagamentoInvoice")
    @Temporal(TemporalType.DATE)
    private Date dataPagamentoInvoice;
    @Column(name = "valorPagamentoInvoice")
    private Float valorPagamentoInvoice;
    @Column(name = "valorPago")
    private Float valorPago;
    @Column(name = "cambioPagamento")
    private Float cambioPagamento;
    @Column(name = "taxa")
    private Float taxa;
    @Column(name = "ganhoperda")
    private Float ganhoperda;
    @Column(name = "ganhoCambio")
    private Float ganhoCambio;
    @Column(name = "valorcredito")
    private Float valorcredito;
    @Column(name = "obscredito")
    private String obscredito;
    @Column(name = "vendas_idvendas")
    private int vendas;
    @Column(name = "prioridade")
    private String prioridade;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "controle")
    private int controle;
    @Column(name = "produtos_idprodutos")
    private int produtos;
    @Column(name = "datarecebimentocomprovante")
    @Temporal(TemporalType.DATE)
    private Date datarecebimentocomprovante;
    
    
    
    
    public Invoices() {
    }

    public Invoices(Integer idinvoices) {
        this.idinvoices = idinvoices;
    }

    public Integer getIdinvoices() {
        return idinvoices;
    }

    public Float getTaxa() {
        return taxa;
    }

    public void setTaxa(Float taxa) {
        this.taxa = taxa;
    }

    public Date getDatarecebimentocomprovante() {
        return datarecebimentocomprovante;
    }

    public void setDatarecebimentocomprovante(Date datarecebimentocomprovante) {
        this.datarecebimentocomprovante = datarecebimentocomprovante;
    }

    public void setIdinvoices(Integer idinvoices) {
        this.idinvoices = idinvoices;
    }

    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
    }

    public Date getDataPrevistaPagamento() {
        return dataPrevistaPagamento;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void setDataPrevistaPagamento(Date dataPrevistaPagamento) {
        this.dataPrevistaPagamento = dataPrevistaPagamento;
    }

    public Float getValorPrevistoInvoice() {
        return valorPrevistoInvoice;
    }

    public void setValorPrevistoInvoice(Float valorPrevistoInvoice) {
        this.valorPrevistoInvoice = valorPrevistoInvoice;
    }

    public Date getDataPagamentoInvoice() {
        return dataPagamentoInvoice;
    }

    public Float getValorcredito() {
        return valorcredito;
    }

    public void setValorcredito(Float valorcredito) {
        this.valorcredito = valorcredito;
    }

    public String getObscredito() {
        return obscredito;
    }

    public void setObscredito(String obscredito) {
        this.obscredito = obscredito;
    }

    public void setDataPagamentoInvoice(Date dataPagamentoInvoice) {
        this.dataPagamentoInvoice = dataPagamentoInvoice;
    }

    public Float getValorPagamentoInvoice() {
        return valorPagamentoInvoice;
    }

    public void setValorPagamentoInvoice(Float valorPagamentoInvoice) {
        this.valorPagamentoInvoice = valorPagamentoInvoice;
    }

    public Float getCambioPagamento() {
        return cambioPagamento;
    }

    public void setCambioPagamento(Float cambioPagamento) {
        this.cambioPagamento = cambioPagamento;
    }

    public Float getGanhoperda() {
        return ganhoperda;
    }

    public void setGanhoperda(Float ganhoperda) {
        this.ganhoperda = ganhoperda;
    }

    public Float getGanhoCambio() {
        return ganhoCambio;
    }

    public void setGanhoCambio(Float ganhoCambio) {
        this.ganhoCambio = ganhoCambio;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idinvoices != null ? idinvoices.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.idinvoices == null && other.idinvoices != null) || (this.idinvoices != null && !this.idinvoices.equals(other.idinvoices))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Invoices[ idinvoices=" + idinvoices + " ]";
    }
    
}
