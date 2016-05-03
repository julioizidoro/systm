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
@Table(name = "cursos")
public class Cursos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcursos")
    private Integer idcursos;
    @Column(name = "indiomaEstudar")
    private String indiomaEstudar;
    @Column(name = "nivelIdiomaEstudar")
    private String nivelIdiomaEstudar;
    @Column(name = "nomeCurso")
    private String nomeCurso;
    @Column(name = "escola")
    private String escola;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "pais")
    private String pais;
    @Column(name = "tipoDuracao")
    private String tipoDuracao;
    @Column(name = "aulassemana")
    private Double aulassemana;
    @Column(name = "numeroSenamas")
    private Integer numeroSenamas;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataTermino")
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    @Column(name = "tipoAcomodacao")
    private String tipoAcomodacao;
    @Column(name = "numeroSemanasAcamodacao")
    private Integer numeroSemanasAcamodacao;
    @Column(name = "tipoQuarto")
    private String tipoQuarto;
    @Column(name = "refeicoes")
    private String refeicoes;
    @Column(name = "adicionais")
    private String adicionais;
    @Column(name = "dataChegada")
    @Temporal(TemporalType.DATE)
    private Date dataChegada;
    @Column(name = "dataSaida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "familiacomCrianca")
    private String familiacomCrianca;
    @Column(name = "familiacomAnimais")
    private String familiacomAnimais;
    @Column(name = "fumante")
    private String fumante;
    @Column(name = "vegetariano")
    private String vegetariano;
    @Column(name = "hobbies")
    private String hobbies;
    @Column(name = "possuiAlergia")
    private String possuiAlergia;
    @Column(name = "quaisAlergias")
    private String quaisAlergias;
    @Column(name = "solicitacoesEspeciais")
    private String solicitacoesEspeciais;
    @Column(name = "caratoVTM")
    private String caratoVTM;
    @Column(name = "numeroCartaoVTM")
    private String numeroCartaoVTM;
    @Column(name = "moedaCartaoVTM")
    private String moedaCartaoVTM;
    @Column(name = "transferin")
    private String transferin;
    @Column(name = "transferouto")
    private String transferouto;
    @Column(name = "passagemAerea")
    private String passagemAerea;
    @Column(name = "observacaoPassagemAerea")
    private String observacaoPassagemAerea;
    @Column(name = "vistoConsular")
    private String vistoConsular;
    @Column(name = "dataEntregaDocumentosVistos")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaDocumentosVistos;
    @Column(name = "observacaoVisto")
    private String observacaoVisto;
    @Column(name = "nomeContatoEmergencia")
    private String nomeContatoEmergencia;
    @Column(name = "foneContatoEmergencia")
    private String foneContatoEmergencia;
    @Column(name = "emalContatoEmergencia")
    private String emalContatoEmergencia;
    @Column(name = "relacaoContatoEmergencia")
    private String relacaoContatoEmergencia;
    @Column(name = "dataInscricao")
    @Temporal(TemporalType.DATE)
    private Date dataInscricao;
    @Column(name = "idioma")
    private String idioma;
    @Column(name = "nivelIdioma")
    private String nivelIdioma;
    @Column(name = "controle")
    private String controle;
    @Column(name = "vendas_idvendas")
    private int vendas;
//    @Column(name = "fornecedor_idfornecedor")
//    private int fornecedor;
    
    @Column(name = "habilitarSegundoCurso")
    private String habilitarSegundoCurso;
    @Column(name = "sCurso")
    private String sCurso;
    @Column(name = "sDataInicio")
    @Temporal(TemporalType.DATE)
    private Date sDataInicio;
    @Column(name = "sDataTermino")
    @Temporal(TemporalType.DATE)
    private Date sDataTermino;
    @Column(name = "sNumeroSemanas")
    private int sNumeroSemanas;
    @Column(name = "sTipoCargaHoraria")
    private String sTipoCargaHoraria;
    @Column(name = "sCargaHoraria")
    private double sCargaHoraria;
    
    @Column(name = "seguradoraGovernamental")
    private String seguradoraGovernamental;
    @Column(name = "numeroMeses")
    private int numeroMeses;
    @Column(name = "possuiSeguroGovernamental")
    private String possuiSeguroGovernamental;
    @Column(name = "valorSeguroGovernamental")
    private float valorSeguroGovernamental;
    
    
    
    
    
    

    public Cursos() {
    }

    public Cursos(Integer idcursos) {
        this.idcursos = idcursos;
    }

    public Integer getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(Integer idcursos) {
        this.idcursos = idcursos;
    }

    public String getIndiomaEstudar() {
        return indiomaEstudar;
    }

    public void setIndiomaEstudar(String indiomaEstudar) {
        this.indiomaEstudar = indiomaEstudar;
    }

    public String getNivelIdiomaEstudar() {
        return nivelIdiomaEstudar;
    }

    public void setNivelIdiomaEstudar(String nivelIdiomaEstudar) {
        this.nivelIdiomaEstudar = nivelIdiomaEstudar;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNivelIdioma() {
        return nivelIdioma;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(String tipoDuracao) {
        this.tipoDuracao = tipoDuracao;
    }

    public void setNivelIdioma(String nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
    }


    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getEscola() {
        return escola;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }


    public Integer getNumeroSenamas() {
        return numeroSenamas;
    }

    public void setNumeroSenamas(Integer numeroSenamas) {
        this.numeroSenamas = numeroSenamas;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getTipoAcomodacao() {
        return tipoAcomodacao;
    }

    public void setTipoAcomodacao(String tipoAcomodacao) {
        this.tipoAcomodacao = tipoAcomodacao;
    }

    public Integer getNumeroSemanasAcamodacao() {
        return numeroSemanasAcamodacao;
    }

    public void setNumeroSemanasAcamodacao(Integer numeroSemanasAcamodacao) {
        this.numeroSemanasAcamodacao = numeroSemanasAcamodacao;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getRefeicoes() {
        return refeicoes;
    }

    public void setRefeicoes(String refeicoes) {
        this.refeicoes = refeicoes;
    }

    public String getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String adicionais) {
        this.adicionais = adicionais;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        this.dataChegada = dataChegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFamiliacomCrianca() {
        return familiacomCrianca;
    }

    public void setFamiliacomCrianca(String familiacomCrianca) {
        this.familiacomCrianca = familiacomCrianca;
    }

    public String getFamiliacomAnimais() {
        return familiacomAnimais;
    }

    public void setFamiliacomAnimais(String familiacomAnimais) {
        this.familiacomAnimais = familiacomAnimais;
    }

    public String getFumante() {
        return fumante;
    }

    public void setFumante(String fumante) {
        this.fumante = fumante;
    }

    public String getVegetariano() {
        return vegetariano;
    }

    public void setVegetariano(String vegetariano) {
        this.vegetariano = vegetariano;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPossuiAlergia() {
        return possuiAlergia;
    }

    public void setPossuiAlergia(String possuiAlergia) {
        this.possuiAlergia = possuiAlergia;
    }

    public String getQuaisAlergias() {
        return quaisAlergias;
    }

    public void setQuaisAlergias(String quaisAlergias) {
        this.quaisAlergias = quaisAlergias;
    }

    public String getSolicitacoesEspeciais() {
        return solicitacoesEspeciais;
    }

    public void setSolicitacoesEspeciais(String solicitacoesEspeciais) {
        this.solicitacoesEspeciais = solicitacoesEspeciais;
    }

    public String getCaratoVTM() {
        return caratoVTM;
    }

    public void setCaratoVTM(String caratoVTM) {
        this.caratoVTM = caratoVTM;
    }

    public String getNumeroCartaoVTM() {
        return numeroCartaoVTM;
    }

    public void setNumeroCartaoVTM(String numeroCartaoVTM) {
        this.numeroCartaoVTM = numeroCartaoVTM;
    }

    public String getMoedaCartaoVTM() {
        return moedaCartaoVTM;
    }

    public void setMoedaCartaoVTM(String moedaCartaoVTM) {
        this.moedaCartaoVTM = moedaCartaoVTM;
    }

    public String getTransferin() {
        return transferin;
    }

    public void setTransferin(String transferin) {
        this.transferin = transferin;
    }

    public String getTransferouto() {
        return transferouto;
    }

    public void setTransferouto(String transferouto) {
        this.transferouto = transferouto;
    }

    public String getPassagemAerea() {
        return passagemAerea;
    }

    public void setPassagemAerea(String passagemAerea) {
        this.passagemAerea = passagemAerea;
    }

    public String getObservacaoPassagemAerea() {
        return observacaoPassagemAerea;
    }

    public void setObservacaoPassagemAerea(String observacaoPassagemAerea) {
        this.observacaoPassagemAerea = observacaoPassagemAerea;
    }

    public String getVistoConsular() {
        return vistoConsular;
    }

    public void setVistoConsular(String vistoConsular) {
        this.vistoConsular = vistoConsular;
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

    public String getNomeContatoEmergencia() {
        return nomeContatoEmergencia;
    }

    public void setNomeContatoEmergencia(String nomeContatoEmergencia) {
        this.nomeContatoEmergencia = nomeContatoEmergencia;
    }

    public String getFoneContatoEmergencia() {
        return foneContatoEmergencia;
    }

    public void setFoneContatoEmergencia(String foneContatoEmergencia) {
        this.foneContatoEmergencia = foneContatoEmergencia;
    }

    public String getEmalContatoEmergencia() {
        return emalContatoEmergencia;
    }

    public void setEmalContatoEmergencia(String emalContatoEmergencia) {
        this.emalContatoEmergencia = emalContatoEmergencia;
    }

    public String getRelacaoContatoEmergencia() {
        return relacaoContatoEmergencia;
    }

    public void setRelacaoContatoEmergencia(String relacaoContatoEmergencia) {
        this.relacaoContatoEmergencia = relacaoContatoEmergencia;
    }

    public Date getDataInscricao() {
        return dataInscricao;
    }

    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }

    public String getHabilitarSegundoCurso() {
        return habilitarSegundoCurso;
    }

    public void setHabilitarSegundoCurso(String habilitarSegundoCurso) {
        this.habilitarSegundoCurso = habilitarSegundoCurso;
    }

    public String getsCurso() {
        return sCurso;
    }

    public void setsCurso(String sCurso) {
        this.sCurso = sCurso;
    }

    public Date getsDataInicio() {
        return sDataInicio;
    }

    public void setsDataInicio(Date sDataInicio) {
        this.sDataInicio = sDataInicio;
    }

    public Date getsDataTermino() {
        return sDataTermino;
    }

    public void setsDataTermino(Date sDataTermino) {
        this.sDataTermino = sDataTermino;
    }

    public int getsNumeroSemanas() {
        return sNumeroSemanas;
    }

    public void setsNumeroSemanas(int sNumeroSemanas) {
        this.sNumeroSemanas = sNumeroSemanas;
    }

    public String getsTipoCargaHoraria() {
        return sTipoCargaHoraria;
    }

    public void setsTipoCargaHoraria(String sTipoCargaHoraria) {
        this.sTipoCargaHoraria = sTipoCargaHoraria;
    }

    public Double getAulassemana() {
        return aulassemana;
    }

    public void setAulassemana(Double aulassemana) {
        this.aulassemana = aulassemana;
    }

    public double getsCargaHoraria() {
        return sCargaHoraria;
    }

    public void setsCargaHoraria(double sCargaHoraria) {
        this.sCargaHoraria = sCargaHoraria;
    }


    public String getSeguradoraGovernamental() {
        return seguradoraGovernamental;
    }

    public void setSeguradoraGovernamental(String seguradoraGovernamental) {
        this.seguradoraGovernamental = seguradoraGovernamental;
    }

    public int getNumeroMeses() {
        return numeroMeses;
    }

    public void setNumeroMeses(int numeroMeses) {
        this.numeroMeses = numeroMeses;
    }

    public String getPossuiSeguroGovernamental() {
        return possuiSeguroGovernamental;
    }

    public void setPossuiSeguroGovernamental(String possuiSeguroGovernamental) {
        this.possuiSeguroGovernamental = possuiSeguroGovernamental;
    }

    public float getValorSeguroGovernamental() {
        return valorSeguroGovernamental;
    }

    public void setValorSeguroGovernamental(float valorSeguroGovernamental) {
        this.valorSeguroGovernamental = valorSeguroGovernamental;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcursos != null ? idcursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cursos)) {
            return false;
        }
        Cursos other = (Cursos) object;
        if ((this.idcursos == null && other.idcursos != null) || (this.idcursos != null && !this.idcursos.equals(other.idcursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Cursos[ idcursos=" + idcursos + " ]";
    }
    
}
