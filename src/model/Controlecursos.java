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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "controlecursos")
public class Controlecursos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontroleCursos")
    private Integer idcontroleCursos;
    @Column(name = "work")
    private Integer work;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Column(name = "dataEnvioInscricaoEscola")
    @Temporal(TemporalType.DATE)
    private Date dataEnvioInscricaoEscola;
    @Column(name = "pagamentoAcomodacao")
    @Temporal(TemporalType.DATE)
    private Date pagamentoAcomodacao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorAcomodacao")
    private Float valorAcomodacao;
    @Column(name = "previsaoPagamentoAcomodacao")
    @Temporal(TemporalType.DATE)
    private Date previsaoPagamentoAcomodacao;
    @Column(name = "visto")
    private String visto;
    @Column(name = "kitViagem")
    private String kitViagem;
    @Column(name = "orientacaoPreEmbarque")
    private String orientacaoPreEmbarque;
    @Lob
    @Column(name = "LoasObs")
    private String loasObs;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "possuiAcomidacao")
    private String possuiAcomidacao;
    @Column(name = "docanexado")
    private String docanexado;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Controlecursos() {
    }

    public Controlecursos(Integer idcontroleCursos) {
        this.idcontroleCursos = idcontroleCursos;
    }

    public Integer getIdcontroleCursos() {
        return idcontroleCursos;
    }

    public void setIdcontroleCursos(Integer idcontroleCursos) {
        this.idcontroleCursos = idcontroleCursos;
    }

    public Integer getWork() {
        return work;
    }

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public Date getDataEnvioInscricaoEscola() {
        return dataEnvioInscricaoEscola;
    }

    public void setDataEnvioInscricaoEscola(Date dataEnvioInscricaoEscola) {
        this.dataEnvioInscricaoEscola = dataEnvioInscricaoEscola;
    }

    public Date getPagamentoAcomodacao() {
        return pagamentoAcomodacao;
    }

    public void setPagamentoAcomodacao(Date pagamentoAcomodacao) {
        this.pagamentoAcomodacao = pagamentoAcomodacao;
    }

    public Float getValorAcomodacao() {
        return valorAcomodacao;
    }

    public void setValorAcomodacao(Float valorAcomodacao) {
        this.valorAcomodacao = valorAcomodacao;
    }

    public Date getPrevisaoPagamentoAcomodacao() {
        return previsaoPagamentoAcomodacao;
    }

    public void setPrevisaoPagamentoAcomodacao(Date previsaoPagamentoAcomodacao) {
        this.previsaoPagamentoAcomodacao = previsaoPagamentoAcomodacao;
    }

    public String getVisto() {
        return visto;
    }

    public void setVisto(String visto) {
        this.visto = visto;
    }

    public String getKitViagem() {
        return kitViagem;
    }

    public void setKitViagem(String kitViagem) {
        this.kitViagem = kitViagem;
    }

    public String getOrientacaoPreEmbarque() {
        return orientacaoPreEmbarque;
    }

    public void setOrientacaoPreEmbarque(String orientacaoPreEmbarque) {
        this.orientacaoPreEmbarque = orientacaoPreEmbarque;
    }

    public String getLoasObs() {
        return loasObs;
    }

    public void setLoasObs(String loasObs) {
        this.loasObs = loasObs;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getPossuiAcomidacao() {
        return possuiAcomidacao;
    }

    public void setPossuiAcomidacao(String possuiAcomidacao) {
        this.possuiAcomidacao = possuiAcomidacao;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontroleCursos != null ? idcontroleCursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controlecursos)) {
            return false;
        }
        Controlecursos other = (Controlecursos) object;
        if ((this.idcontroleCursos == null && other.idcontroleCursos != null) || (this.idcontroleCursos != null && !this.idcontroleCursos.equals(other.idcontroleCursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Controlecursos[ idcontroleCursos=" + idcontroleCursos + " ]";
    }
    
}
