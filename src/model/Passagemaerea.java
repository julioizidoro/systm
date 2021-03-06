/*
 * To change this template, choose Tools | Templates
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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "passagemaerea")
public class Passagemaerea implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpassagemAerea")
    private Integer idpassagemAerea;
    @Column(name = "localizador")
    private String localizador;
    @Column(name = "ciaAerea")
    private String ciaAerea;
    @Column(name = "formaPagamento")
    private String formaPagamento;
    @Column(name = "cidadeDestino")
    private String cidadeDestino;
    @Column(name = "paisDestino")
    private String paisDestino;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Column(name = "dataVolta")
    @Temporal(TemporalType.DATE)
    private Date dataVolta;
    @Column(name = "pax01")
    private String pax01;
    @Column(name = "pax02")
    private String pax02;
    @Column(name = "pax03")
    private String pax03;
    @Column(name = "pax04")
    private String pax04;
    @Column(name = "pax05")
    private String pax05;
    @Column(name = "pax06")
    private String pax06;
    @Lob
    @Column(name = "observacoes")
    private String observacoes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Column(name = "referencia")
    private String referencia;
    @Column(name = "intinerario")
    private String intinerario;
    @Column(name = "tuadtme")
    private Float tuadtme;
    @Column(name = "tuadtml")
    private Float tuadtml;
    @Column(name = "atendente")
    private String atendente;
    @Column(name = "tuchdme")
    private Float tuchdme;
    @Column(name = "tuchdml")
    private Float tuchdml;
    @Column(name = "tuinfme")
    private Float tuinfme;
    @Column(name = "tuinfml")
    private Float tuinfml;
    @Column(name = "teme")
    private Float teme;
    @Column(name = "dataEmissao")
    @Temporal(TemporalType.DATE)
    private Date dataEmissao;
    @Column(name = "teml")
    private Float teml;
    @Column(name = "tenac")
    private Float tenac;
    @Column(name = "tome")
    private Float tome;
    @Column(name = "toml")
    private Float toml;
    @Column(name = "totalop")
    private Float totalop;
    @Column(name = "taxas")
    private Float taxas;
    @Column(name = "geral")
    private Float geral;
    @Column(name = "titularcartao")
    private String titularcartao;
    @Column(name = "bandeira")
    private String bandeira;
    @Column(name = "numerocartao")
    private String numerocartao;
    @Column(name = "valiade")
    private String valiade;
    @Column(name = "codigoseguranca")
    private String codigoseguranca;
    @Column(name = "autorizacao")
    private String autorizacao;
    @Column(name = "valorentrada")
    private Float valorentrada;
    @Column(name = "numeroparcelas")
    private Integer numeroparcelas;
    @Column(name = "valorparcela")
    private Float valorparcela;
    @Column(name = "pax7")
    private String pax7;
    @Column(name = "pax8")
    private String pax8;
    @Column(name = "tipopax1")
    private String tipopax1;
    @Column(name = "tipopax2")
    private String tipopax2;
    @Column(name = "tipopax3")
    private String tipopax3;
    @Column(name = "tipopax4")
    private String tipopax4;
    @Column(name = "tipopax5")
    private String tipopax5;
    @Column(name = "tipopax6")
    private String tipopax6;
    @Column(name = "tipopax7")
    private String tipopax7;
    @Column(name = "tipopax8")
    private String tipopax8;
    @Column(name = "dataNascimentopax01")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax01;
    @Column(name = "dataNascimentopax02")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax02;
    @Column(name = "dataNascimentopax03")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax03;
    @Column(name = "dataNascimentopax04")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax04;
    @Column(name = "dataNascimentopax05")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax05;
    @Column(name = "dataNascimentopax06")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax06;
    @Column(name = "dataNascimentopax07")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax07;
    @Column(name = "dataNascimentopax08")
    @Temporal(TemporalType.DATE)
    private Date dataNascimentopax08;
    @Column(name = "cpf01")
    private String cpf01;
    @Column(name = "cpf02")
    private String cpf02;
    @Column(name = "cpf03")
    private String cpf03;
    @Column(name = "cpf04")
    private String cpf04;
    @Column(name = "cpf05")
    private String cpf05;
    @Column(name = "cpf06")
    private String cpf06;
    @Column(name = "cpf07")
    private String cpf07;
    @Column(name = "cpf08")
    private String cpf08;
    @Column(name = "totalTaxaEmbarqueEstrangeira")
    private Float totalTaxaEmbarqueEstrangeira;
    @Column(name = "totalTaxaEmbarqueNacionall")
    private Float totalTaxaEmbarqueNacionall;
    
    @Column(name = "totalOPTaxas")
    private Float totalOPTaxas;
    
    @Column(name = "vendas_idvendas")
    private int vendas;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;

    public Passagemaerea() {
    }

    public Passagemaerea(Integer idpassagemAerea) {
        this.idpassagemAerea = idpassagemAerea;
    }

    public Integer getIdpassagemAerea() {
        return idpassagemAerea;
    }

    public void setIdpassagemAerea(Integer idpassagemAerea) {
        this.idpassagemAerea = idpassagemAerea;
    }

    public String getLocalizador() {
        return localizador;
    }

    public Float getTotalOPTaxas() {
        return totalOPTaxas;
    }

    public void setTotalOPTaxas(Float totalOPTaxas) {
        this.totalOPTaxas = totalOPTaxas;
    }

    

    public void setLocalizador(String localizador) {
        this.localizador = localizador;
    }

    public String getCiaAerea() {
        return ciaAerea;
    }

    public void setCiaAerea(String ciaAerea) {
        this.ciaAerea = ciaAerea;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public Float getTotalTaxaEmbarqueEstrangeira() {
        return totalTaxaEmbarqueEstrangeira;
    }

    public void setTotalTaxaEmbarqueEstrangeira(Float totalTaxaEmbarqueEstrangeira) {
        this.totalTaxaEmbarqueEstrangeira = totalTaxaEmbarqueEstrangeira;
    }

    public Float getTotalTaxaEmbarqueNacionall() {
        return totalTaxaEmbarqueNacionall;
    }

    public void setTotalTaxaEmbarqueNacionall(Float totalTaxaEmbarqueNacionall) {
        this.totalTaxaEmbarqueNacionall = totalTaxaEmbarqueNacionall;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getPaisDestino() {
        return paisDestino;
    }

    public void setPaisDestino(String paisDestino) {
        this.paisDestino = paisDestino;
    }

    public Date getDataNascimentopax01() {
        return dataNascimentopax01;
    }

    public void setDataNascimentopax01(Date dataNascimentopax01) {
        this.dataNascimentopax01 = dataNascimentopax01;
    }

    public Date getDataNascimentopax02() {
        return dataNascimentopax02;
    }

    public void setDataNascimentopax02(Date dataNascimentopax02) {
        this.dataNascimentopax02 = dataNascimentopax02;
    }

    public Date getDataNascimentopax03() {
        return dataNascimentopax03;
    }

    public void setDataNascimentopax03(Date dataNascimentopax03) {
        this.dataNascimentopax03 = dataNascimentopax03;
    }

    public Date getDataNascimentopax04() {
        return dataNascimentopax04;
    }

    public void setDataNascimentopax04(Date dataNascimentopax04) {
        this.dataNascimentopax04 = dataNascimentopax04;
    }

    public Date getDataNascimentopax05() {
        return dataNascimentopax05;
    }

    public void setDataNascimentopax05(Date dataNascimentopax05) {
        this.dataNascimentopax05 = dataNascimentopax05;
    }

    public Date getDataNascimentopax06() {
        return dataNascimentopax06;
    }

    public void setDataNascimentopax06(Date dataNascimentopax06) {
        this.dataNascimentopax06 = dataNascimentopax06;
    }

    public Date getDataNascimentopax07() {
        return dataNascimentopax07;
    }

    public void setDataNascimentopax07(Date dataNascimentopax07) {
        this.dataNascimentopax07 = dataNascimentopax07;
    }

    public Date getDataNascimentopax08() {
        return dataNascimentopax08;
    }

    public void setDataNascimentopax08(Date dataNascimentopax08) {
        this.dataNascimentopax08 = dataNascimentopax08;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public Date getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(Date dataVolta) {
        this.dataVolta = dataVolta;
    }

    public String getPax01() {
        return pax01;
    }

    public void setPax01(String pax01) {
        this.pax01 = pax01;
    }

    public String getPax02() {
        return pax02;
    }

    public void setPax02(String pax02) {
        this.pax02 = pax02;
    }

    public String getPax03() {
        return pax03;
    }

    public void setPax03(String pax03) {
        this.pax03 = pax03;
    }

    public String getPax04() {
        return pax04;
    }

    public void setPax04(String pax04) {
        this.pax04 = pax04;
    }

    public String getPax05() {
        return pax05;
    }

    public void setPax05(String pax05) {
        this.pax05 = pax05;
    }

    public String getPax06() {
        return pax06;
    }

    public void setPax06(String pax06) {
        this.pax06 = pax06;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Float getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Float valorCambio) {
        this.valorCambio = valorCambio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getIntinerario() {
        return intinerario;
    }

    public void setIntinerario(String intinerario) {
        this.intinerario = intinerario;
    }

    public Float getTuadtme() {
        return tuadtme;
    }

    public void setTuadtme(Float tuadtme) {
        this.tuadtme = tuadtme;
    }

    public Float getTuadtml() {
        return tuadtml;
    }

    public void setTuadtml(Float tuadtml) {
        this.tuadtml = tuadtml;
    }

    public String getAtendente() {
        return atendente;
    }

    public void setAtendente(String atendente) {
        this.atendente = atendente;
    }

    public Float getTuchdme() {
        return tuchdme;
    }

    public void setTuchdme(Float tuchdme) {
        this.tuchdme = tuchdme;
    }

    public Float getTuchdml() {
        return tuchdml;
    }

    public void setTuchdml(Float tuchdml) {
        this.tuchdml = tuchdml;
    }

    public Float getTuinfme() {
        return tuinfme;
    }

    public void setTuinfme(Float tuinfme) {
        this.tuinfme = tuinfme;
    }

    public Float getTuinfml() {
        return tuinfml;
    }

    public void setTuinfml(Float tuinfml) {
        this.tuinfml = tuinfml;
    }

    public Float getTeme() {
        return teme;
    }

    public void setTeme(Float teme) {
        this.teme = teme;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Float getTeml() {
        return teml;
    }

    public void setTeml(Float teml) {
        this.teml = teml;
    }

    public Float getTenac() {
        return tenac;
    }

    public void setTenac(Float tenac) {
        this.tenac = tenac;
    }

    public Float getTome() {
        return tome;
    }

    public void setTome(Float tome) {
        this.tome = tome;
    }

    public Float getToml() {
        return toml;
    }

    public void setToml(Float toml) {
        this.toml = toml;
    }

    public Float getTotalop() {
        return totalop;
    }

    public void setTotalop(Float totalop) {
        this.totalop = totalop;
    }

    public Float getTaxas() {
        return taxas;
    }

    public void setTaxas(Float taxas) {
        this.taxas = taxas;
    }

    public Float getGeral() {
        return geral;
    }

    public void setGeral(Float geral) {
        this.geral = geral;
    }

    public String getTitularcartao() {
        return titularcartao;
    }

    public void setTitularcartao(String titularcartao) {
        this.titularcartao = titularcartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getValiade() {
        return valiade;
    }

    public void setValiade(String valiade) {
        this.valiade = valiade;
    }

    public String getCodigoseguranca() {
        return codigoseguranca;
    }

    public void setCodigoseguranca(String codigoseguranca) {
        this.codigoseguranca = codigoseguranca;
    }

    public String getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String autorizacao) {
        this.autorizacao = autorizacao;
    }

    public Float getValorentrada() {
        return valorentrada;
    }

    public void setValorentrada(Float valorentrada) {
        this.valorentrada = valorentrada;
    }

    public Integer getNumeroparcelas() {
        return numeroparcelas;
    }

    public void setNumeroparcelas(Integer numeroparcelas) {
        this.numeroparcelas = numeroparcelas;
    }

    public Float getValorparcela() {
        return valorparcela;
    }

    public void setValorparcela(Float valorparcela) {
        this.valorparcela = valorparcela;
    }

    public String getPax7() {
        return pax7;
    }

    public void setPax7(String pax7) {
        this.pax7 = pax7;
    }

    public String getPax8() {
        return pax8;
    }

    public void setPax8(String pax8) {
        this.pax8 = pax8;
    }

    public String getTipopax1() {
        return tipopax1;
    }

    public void setTipopax1(String tipopax1) {
        this.tipopax1 = tipopax1;
    }

    public String getTipopax2() {
        return tipopax2;
    }

    public void setTipopax2(String tipopax2) {
        this.tipopax2 = tipopax2;
    }

    public String getTipopax3() {
        return tipopax3;
    }

    public void setTipopax3(String tipopax3) {
        this.tipopax3 = tipopax3;
    }

    public String getTipopax4() {
        return tipopax4;
    }

    public void setTipopax4(String tipopax4) {
        this.tipopax4 = tipopax4;
    }

    public String getTipopax5() {
        return tipopax5;
    }

    public void setTipopax5(String tipopax5) {
        this.tipopax5 = tipopax5;
    }

    public String getTipopax6() {
        return tipopax6;
    }

    public void setTipopax6(String tipopax6) {
        this.tipopax6 = tipopax6;
    }

    public String getTipopax7() {
        return tipopax7;
    }

    public void setTipopax7(String tipopax7) {
        this.tipopax7 = tipopax7;
    }

    public String getTipopax8() {
        return tipopax8;
    }

    public void setTipopax8(String tipopax8) {
        this.tipopax8 = tipopax8;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getCpf01() {
        return cpf01;
    }

    public void setCpf01(String cpf01) {
        this.cpf01 = cpf01;
    }

    public String getCpf02() {
        return cpf02;
    }

    public void setCpf02(String cpf02) {
        this.cpf02 = cpf02;
    }

    public String getCpf03() {
        return cpf03;
    }

    public void setCpf03(String cpf03) {
        this.cpf03 = cpf03;
    }

    public String getCpf04() {
        return cpf04;
    }

    public void setCpf04(String cpf04) {
        this.cpf04 = cpf04;
    }

    public String getCpf05() {
        return cpf05;
    }

    public void setCpf05(String cpf05) {
        this.cpf05 = cpf05;
    }

    public String getCpf06() {
        return cpf06;
    }

    public void setCpf06(String cpf06) {
        this.cpf06 = cpf06;
    }

    public String getCpf07() {
        return cpf07;
    }

    public void setCpf07(String cpf07) {
        this.cpf07 = cpf07;
    }

    public String getCpf08() {
        return cpf08;
    }

    public void setCpf08(String cpf08) {
        this.cpf08 = cpf08;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpassagemAerea != null ? idpassagemAerea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passagemaerea)) {
            return false;
        }
        Passagemaerea other = (Passagemaerea) object;
        if ((this.idpassagemAerea == null && other.idpassagemAerea != null) || (this.idpassagemAerea != null && !this.idpassagemAerea.equals(other.idpassagemAerea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Passagemaerea[ idpassagemAerea=" + idpassagemAerea + " ]";
    }
    
}
