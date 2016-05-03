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
@Table(name = "controleaupair")
public class Controleaupair implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontroleAuPair")
    private Integer idcontroleAuPair;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Column(name = "numeroPassaporte")
    private String numeroPassaporte;
    @Column(name = "skype")
    private String skype;
    @Column(name = "sponsor")
    private String sponsor;
    @Column(name = "docanexado")
    private String docanexado;
    @Column(name = "cidadeSponsor")
    private String cidadeSponsor;
    @Column(name = "empregador")
    private String empregador;
    @Column(name = "jobGuarante")
    private String jobGuarante;
    @Column(name = "dataInicioJobOffer")
    private String dataInicioJobOffer;
    @Column(name = "dataTerminoJobOffer")
    private String dataTerminoJobOffer;
    @Column(name = "emailListaDocoumentos")
    private String emailListaDocoumentos;
    @Column(name = "FichaContratoOriginal")
    private String fichaContratoOriginal;
    @Column(name = "informativoOriginal")
    private String informativoOriginal;
    @Column(name = "atestadoOriginal")
    private String atestadoOriginal;
    @Column(name = "copiaPPTColorida")
    private String copiaPPTColorida;
    @Column(name = "copiaRGCPF")
    private String copiaRGCPF;
    @Column(name = "fotoDS")
    private String fotoDS;
    @Column(name = "ds160")
    private String ds160;
    @Column(name = "vc")
    private String vc;
    @Column(name = "sleeptestecorrigido")
    private String sleeptestecorrigido;
    @Column(name = "cartaoApresentacao")
    private String cartaoApresentacao;
    @Column(name = "cartaoRecomendacao")
    private String cartaoRecomendacao;
    @Column(name = "atestado2SMEOriginal")
    private String atestado2SMEOriginal;
    @Column(name = "atestadoSaude")
    private String atestadoSaude;
    @Column(name = "antecedentesCrimianis")
    private String antecedentesCrimianis;
    @Column(name = "dataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Column(name = "statusProcesso")
    private String statusProcesso;
    @Column(name = "statusPrograma")
    private String statusPrograma;
    @Lob
    @Column(name = "observacoes")
    private String observacoes;
    @Column(name = "finalizado")
    private String finalizado;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "lista01")
    private String lista01;
    @Column(name = "lista02")
    private String lista02;
    @Column(name = "lista03")
    private String lista03;
    @Column(name = "transition")
    private String transition;
    @Column(name = "dataEnvioApp")
    @Temporal(TemporalType.DATE)
    private Date dataEnvioApp;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Controleaupair() {
    }

    public Controleaupair(Integer idcontroleAuPair) {
        this.idcontroleAuPair = idcontroleAuPair;
    }

    public Integer getIdcontroleAuPair() {
        return idcontroleAuPair;
    }

    public void setIdcontroleAuPair(Integer idcontroleAuPair) {
        this.idcontroleAuPair = idcontroleAuPair;
    }

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    public Date getDataEmbarque() {
        return dataEmbarque;
    }

    public void setDataEmbarque(Date dataEmbarque) {
        this.dataEmbarque = dataEmbarque;
    }

    public String getNumeroPassaporte() {
        return numeroPassaporte;
    }

    public void setNumeroPassaporte(String numeroPassaporte) {
        this.numeroPassaporte = numeroPassaporte;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getCidadeSponsor() {
        return cidadeSponsor;
    }

    public void setCidadeSponsor(String cidadeSponsor) {
        this.cidadeSponsor = cidadeSponsor;
    }

    public String getEmpregador() {
        return empregador;
    }

    public void setEmpregador(String empregador) {
        this.empregador = empregador;
    }

    public String getJobGuarante() {
        return jobGuarante;
    }

    public void setJobGuarante(String jobGuarante) {
        this.jobGuarante = jobGuarante;
    }

    public String getDataInicioJobOffer() {
        return dataInicioJobOffer;
    }

    public void setDataInicioJobOffer(String dataInicioJobOffer) {
        this.dataInicioJobOffer = dataInicioJobOffer;
    }

    public String getDataTerminoJobOffer() {
        return dataTerminoJobOffer;
    }

    public void setDataTerminoJobOffer(String dataTerminoJobOffer) {
        this.dataTerminoJobOffer = dataTerminoJobOffer;
    }

    public String getEmailListaDocoumentos() {
        return emailListaDocoumentos;
    }

    public void setEmailListaDocoumentos(String emailListaDocoumentos) {
        this.emailListaDocoumentos = emailListaDocoumentos;
    }

    public String getFichaContratoOriginal() {
        return fichaContratoOriginal;
    }

    public void setFichaContratoOriginal(String fichaContratoOriginal) {
        this.fichaContratoOriginal = fichaContratoOriginal;
    }

    public String getInformativoOriginal() {
        return informativoOriginal;
    }

    public void setInformativoOriginal(String informativoOriginal) {
        this.informativoOriginal = informativoOriginal;
    }

    public String getAtestadoOriginal() {
        return atestadoOriginal;
    }

    public void setAtestadoOriginal(String atestadoOriginal) {
        this.atestadoOriginal = atestadoOriginal;
    }

    public String getCopiaPPTColorida() {
        return copiaPPTColorida;
    }

    public void setCopiaPPTColorida(String copiaPPTColorida) {
        this.copiaPPTColorida = copiaPPTColorida;
    }

    public String getCopiaRGCPF() {
        return copiaRGCPF;
    }

    public void setCopiaRGCPF(String copiaRGCPF) {
        this.copiaRGCPF = copiaRGCPF;
    }

    public String getFotoDS() {
        return fotoDS;
    }

    public void setFotoDS(String fotoDS) {
        this.fotoDS = fotoDS;
    }

    public String getDs160() {
        return ds160;
    }

    public void setDs160(String ds160) {
        this.ds160 = ds160;
    }

    public String getVc() {
        return vc;
    }

    public void setVc(String vc) {
        this.vc = vc;
    }

    public String getSleeptestecorrigido() {
        return sleeptestecorrigido;
    }

    public void setSleeptestecorrigido(String sleeptestecorrigido) {
        this.sleeptestecorrigido = sleeptestecorrigido;
    }

    public String getCartaoApresentacao() {
        return cartaoApresentacao;
    }

    public void setCartaoApresentacao(String cartaoApresentacao) {
        this.cartaoApresentacao = cartaoApresentacao;
    }

    public String getCartaoRecomendacao() {
        return cartaoRecomendacao;
    }

    public void setCartaoRecomendacao(String cartaoRecomendacao) {
        this.cartaoRecomendacao = cartaoRecomendacao;
    }

    public String getAtestado2SMEOriginal() {
        return atestado2SMEOriginal;
    }

    public void setAtestado2SMEOriginal(String atestado2SMEOriginal) {
        this.atestado2SMEOriginal = atestado2SMEOriginal;
    }

    public String getAtestadoSaude() {
        return atestadoSaude;
    }

    public void setAtestadoSaude(String atestadoSaude) {
        this.atestadoSaude = atestadoSaude;
    }

    public String getAntecedentesCrimianis() {
        return antecedentesCrimianis;
    }

    public void setAntecedentesCrimianis(String antecedentesCrimianis) {
        this.antecedentesCrimianis = antecedentesCrimianis;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getStatusProcesso() {
        return statusProcesso;
    }

    public void setStatusProcesso(String statusProcesso) {
        this.statusProcesso = statusProcesso;
    }

    public String getStatusPrograma() {
        return statusPrograma;
    }

    public void setStatusPrograma(String statusPrograma) {
        this.statusPrograma = statusPrograma;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(String finalizado) {
        this.finalizado = finalizado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getLista01() {
        return lista01;
    }

    public void setLista01(String lista01) {
        this.lista01 = lista01;
    }

    public String getLista02() {
        return lista02;
    }

    public void setLista02(String lista02) {
        this.lista02 = lista02;
    }

    public String getLista03() {
        return lista03;
    }

    public void setLista03(String lista03) {
        this.lista03 = lista03;
    }

    public String getTransition() {
        return transition;
    }

    public void setTransition(String transition) {
        this.transition = transition;
    }

    public Date getDataEnvioApp() {
        return dataEnvioApp;
    }

    public void setDataEnvioApp(Date dataEnvioApp) {
        this.dataEnvioApp = dataEnvioApp;
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
        hash += (idcontroleAuPair != null ? idcontroleAuPair.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controleaupair)) {
            return false;
        }
        Controleaupair other = (Controleaupair) object;
        if ((this.idcontroleAuPair == null && other.idcontroleAuPair != null) || (this.idcontroleAuPair != null && !this.idcontroleAuPair.equals(other.idcontroleAuPair))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Controleaupair[ idcontroleAuPair=" + idcontroleAuPair + " ]";
    }
    
}
