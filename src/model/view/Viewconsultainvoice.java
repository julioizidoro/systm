/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.view;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewconsultainvoice")
@NamedQueries({
    @NamedQuery(name = "Viewconsultainvoice.findAll", query = "SELECT v FROM Viewconsultainvoice v")})
public class Viewconsultainvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idcliente")
    private int idcliente;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Basic(optional = false)
    @Column(name = "idfornecedor")
    private int idfornecedor;
    @Column(name = "nomeFornecedor")
    private String nomeFornecedor;
    @Basic(optional = false)
    @Column(name = "idunidadeNegocio")
    private int idunidadeNegocio;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "nomeConsultor")
    private String nomeConsultor;
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "idvendas")
    private int idvendas;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Basic(optional = false)
    @Column(name = "idinvoices")
    @Id
    private int idinvoices;
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
    @Column(name = "ganhoperda")
    private Float ganhoperda;
    @Column(name = "ganhoCambio")
    private Float ganhoCambio;
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "valorcredito")
    private Float valorcredito;
    @Column(name = "obscredito")
    private String obscredito;
    @Column(name = "prioridade")
    private String prioridade;

    public Viewconsultainvoice() {
    }

    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(String prioridade) {
        this.prioridade = prioridade;
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

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getIdfornecedor() {
        return idfornecedor;
    }

    public void setIdfornecedor(int idfornecedor) {
        this.idfornecedor = idfornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public int getIdunidadeNegocio() {
        return idunidadeNegocio;
    }

    public void setIdunidadeNegocio(int idunidadeNegocio) {
        this.idunidadeNegocio = idunidadeNegocio;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getNomeConsultor() {
        return nomeConsultor;
    }

    public void setNomeConsultor(String nomeConsultor) {
        this.nomeConsultor = nomeConsultor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdinvoices() {
        return idinvoices;
    }

    public void setIdinvoices(int idinvoices) {
        this.idinvoices = idinvoices;
    }

    public Date getDataPrevistaPagamento() {
        return dataPrevistaPagamento;
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

    public void setDataPagamentoInvoice(Date dataPagamentoInvoice) {
        this.dataPagamentoInvoice = dataPagamentoInvoice;
    }

    public Float getValorPagamentoInvoice() {
        return valorPagamentoInvoice;
    }

    public void setValorPagamentoInvoice(Float valorPagamentoInvoice) {
        this.valorPagamentoInvoice = valorPagamentoInvoice;
    }

    public Float getValorPago() {
        return valorPago;
    }

    public void setValorPago(Float valorPago) {
        this.valorPago = valorPago;
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

    public Float getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Float valorCambio) {
        this.valorCambio = valorCambio;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
    
}
