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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "aupair")
public class Aupair implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idaupair")
    private Integer idaupair;
    @Column(name = "dataInscricao")
    @Temporal(TemporalType.DATE)
    private Date dataInscricao;
    @Column(name = "possuiAmigosPais")
    private String possuiAmigosPais;
    @Column(name = "nomeAmigo")
    private String nomeAmigo;
    @Column(name = "foneAmigo")
    private String foneAmigo;
    @Column(name = "endercoAmigo")
    private String endercoAmigo;
    @Column(name = "relacaoAmigo")
    private String relacaoAmigo;
    @Column(name = "nivelEstudo")
    private String nivelEstudo;
    @Column(name = "ocupacao")
    private String ocupacao;
    @Column(name = "inituicaoEstuda")
    private String inituicaoEstuda;
    @Column(name = "curso")
    private String curso;
    @Column(name = "duracaoCurso")
    private String duracaoCurso;
    @Column(name = "cursandoPeriodo")
    private String cursandoPeriodo;
    @Column(name = "idioma01")
    private String idioma01;
    @Column(name = "nivelIdioma01")
    private String nivelIdioma01;
    @Column(name = "idioma02")
    private String idioma02;
    @Column(name = "nivelIdioma02")
    private String nivelIdioma02;
    @Column(name = "idioma03")
    private String idioma03;
    @Column(name = "nivelIdioma03")
    private String nivelIdioma03;
    @Column(name = "dataInicioPretendida01")
    @Temporal(TemporalType.DATE)
    private Date dataInicioPretendida01;
    @Column(name = "dataInicioPretendida02")
    @Temporal(TemporalType.DATE)
    private Date dataInicioPretendida02;
    @Column(name = "dataTerminoPretendida01")
    @Temporal(TemporalType.DATE)
    private Date dataTerminoPretendida01;
    @Column(name = "dataTerminoPretendida02")
    @Temporal(TemporalType.DATE)
    private Date dataTerminoPretendida02;
    @Column(name = "tipoPassagem")
    private String tipoPassagem;
    @Column(name = "observacaoPassagem")
    private String observacaoPassagem;
    @Column(name = "tipoSolicitacaoVisto")
    private String tipoSolicitacaoVisto;
    @Column(name = "dataEntregaDocumentosVistos")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaDocumentosVistos;
    @Column(name = "observacaoVisto")
    private String observacaoVisto;
    @Column(name = "cartaoVTM")
    private String cartaoVTM;
    @Column(name = "numeroCartao")
    private String numeroCartao;
    @Column(name = "moedaCartao")
    private String moedaCartao;
    @Column(name = "nomeContatoEmergencia")
    private String nomeContatoEmergencia;
    @Column(name = "foneContatoEmergencia")
    private String foneContatoEmergencia;
    @Column(name = "emailContatoEmergencia")
    private String emailContatoEmergencia;
    @Column(name = "relacaoContatoEmergencia")
    private String relacaoContatoEmergencia;
    @Column(name = "paisinteresse")
    private String paisinteresse;
    @Column(name = "vendas_idvendas")
    private int vendas;
    @Column(name = "obstm")
    private String obstm;
    @Column(name = "controle")
    private String controle;
    @Column(name = "valoresAupair_idvaloresAupair")
    private int valoresAupair;

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public Aupair() {
    }

    public Aupair(Integer idaupair) {
        this.idaupair = idaupair;
    }

    public Integer getIdaupair() {
        return idaupair;
    }

    public void setIdaupair(Integer idaupair) {
        this.idaupair = idaupair;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public int getVendas() {
        return vendas;
    }

    public String getObstm() {
        return obstm;
    }

    public void setObstm(String obstm) {
        this.obstm = obstm;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }


    public String getNomeContatoEmergencia() {
        return nomeContatoEmergencia;
    }

    public void setNomeContatoEmergencia(String nomeContatoEmergencia) {
        this.nomeContatoEmergencia = nomeContatoEmergencia;
    }

    public Date getDataEntregaDocumentosVistos() {
        return dataEntregaDocumentosVistos;
    }

    public void setDataEntregaDocumentosVistos(Date dataEntregaDocumentosVistos) {
        this.dataEntregaDocumentosVistos = dataEntregaDocumentosVistos;
    }

    public String getObservacaoVisto() {
        return observacaoVisto;
    }

    public void setObservacaoVisto(String observacaoVisto) {
        this.observacaoVisto = observacaoVisto;
    }

    public String getPaisinteresse() {
        return paisinteresse;
    }

    public void setPaisinteresse(String paisinteresse) {
        this.paisinteresse = paisinteresse;
    }

    public String getPossuiAmigosPais() {
        return possuiAmigosPais;
    }

    public void setPossuiAmigosPais(String possuiAmigosPais) {
        this.possuiAmigosPais = possuiAmigosPais;
    }

    public String getNomeAmigo() {
        return nomeAmigo;
    }

    public void setNomeAmigo(String nomeAmigo) {
        this.nomeAmigo = nomeAmigo;
    }

    public String getFoneAmigo() {
        return foneAmigo;
    }

    public void setFoneAmigo(String foneAmigo) {
        this.foneAmigo = foneAmigo;
    }

    public String getEndercoAmigo() {
        return endercoAmigo;
    }

    public void setEndercoAmigo(String endercoAmigo) {
        this.endercoAmigo = endercoAmigo;
    }

    public String getRelacaoAmigo() {
        return relacaoAmigo;
    }

    public void setRelacaoAmigo(String relacaoAmigo) {
        this.relacaoAmigo = relacaoAmigo;
    }

    public String getNivelEstudo() {
        return nivelEstudo;
    }

    public void setNivelEstudo(String nivelEstudo) {
        this.nivelEstudo = nivelEstudo;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getInituicaoEstuda() {
        return inituicaoEstuda;
    }

    public void setInituicaoEstuda(String inituicaoEstuda) {
        this.inituicaoEstuda = inituicaoEstuda;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(String duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }

    public String getCursandoPeriodo() {
        return cursandoPeriodo;
    }

    public void setCursandoPeriodo(String cursandoPeriodo) {
        this.cursandoPeriodo = cursandoPeriodo;
    }

    public String getIdioma01() {
        return idioma01;
    }

    public void setIdioma01(String idioma01) {
        this.idioma01 = idioma01;
    }

    public String getNivelIdioma01() {
        return nivelIdioma01;
    }

    public void setNivelIdioma01(String nivelIdioma01) {
        this.nivelIdioma01 = nivelIdioma01;
    }

    public String getIdioma02() {
        return idioma02;
    }

    public void setIdioma02(String idioma02) {
        this.idioma02 = idioma02;
    }

    public String getNivelIdioma02() {
        return nivelIdioma02;
    }

    public void setNivelIdioma02(String nivelIdioma02) {
        this.nivelIdioma02 = nivelIdioma02;
    }

    public String getIdioma03() {
        return idioma03;
    }

    public void setIdioma03(String idioma03) {
        this.idioma03 = idioma03;
    }

    public String getNivelIdioma03() {
        return nivelIdioma03;
    }

    public void setNivelIdioma03(String nivelIdioma03) {
        this.nivelIdioma03 = nivelIdioma03;
    }

    public Date getDataInicioPretendida01() {
        return dataInicioPretendida01;
    }

    public void setDataInicioPretendida01(Date dataInicioPretendida01) {
        this.dataInicioPretendida01 = dataInicioPretendida01;
    }

    public Date getDataInicioPretendida02() {
        return dataInicioPretendida02;
    }

    public void setDataInicioPretendida02(Date dataInicioPretendida02) {
        this.dataInicioPretendida02 = dataInicioPretendida02;
    }

    public Date getDataTerminoPretendida01() {
        return dataTerminoPretendida01;
    }

    public void setDataTerminoPretendida01(Date dataTerminoPretendida01) {
        this.dataTerminoPretendida01 = dataTerminoPretendida01;
    }

    public Date getDataTerminoPretendida02() {
        return dataTerminoPretendida02;
    }

    public void setDataTerminoPretendida02(Date dataTerminoPretendida02) {
        this.dataTerminoPretendida02 = dataTerminoPretendida02;
    }

    public String getTipoPassagem() {
        return tipoPassagem;
    }

    public void setTipoPassagem(String tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

    public String getObservacaoPassagem() {
        return observacaoPassagem;
    }

    public void setObservacaoPassagem(String observacaoPassagem) {
        this.observacaoPassagem = observacaoPassagem;
    }

    public String getTipoSolicitacaoVisto() {
        return tipoSolicitacaoVisto;
    }

    public void setTipoSolicitacaoVisto(String tipoSolicitacaoVisto) {
        this.tipoSolicitacaoVisto = tipoSolicitacaoVisto;
    }

    public String getCartaoVTM() {
        return cartaoVTM;
    }

    public void setCartaoVTM(String cartaoVTM) {
        this.cartaoVTM = cartaoVTM;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getMoedaCartao() {
        return moedaCartao;
    }

    public void setMoedaCartao(String moedaCartao) {
        this.moedaCartao = moedaCartao;
    }


    public String getFoneContatoEmergencia() {
        return foneContatoEmergencia;
    }

    public void setFoneContatoEmergencia(String foneContatoEmergencia) {
        this.foneContatoEmergencia = foneContatoEmergencia;
    }

    public int getValoresAupair() {
        return valoresAupair;
    }

    public void setValoresAupair(int valoresAupair) {
        this.valoresAupair = valoresAupair;
    }

    public String getEmailContatoEmergencia() {
        return emailContatoEmergencia;
    }

    public void setEmailContatoEmergencia(String emailContatoEmergencia) {
        this.emailContatoEmergencia = emailContatoEmergencia;
    }

    public String getRelacaoContatoEmergencia() {
        return relacaoContatoEmergencia;
    }

    public void setRelacaoContatoEmergencia(String relacaoContatoEmergencia) {
        this.relacaoContatoEmergencia = relacaoContatoEmergencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idaupair != null ? idaupair.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aupair)) {
            return false;
        }
        Aupair other = (Aupair) object;
        if ((this.idaupair == null && other.idaupair != null) || (this.idaupair != null && !this.idaupair.equals(other.idaupair))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Aupair[ idaupair=" + idaupair + " ]";
    }
    
}
