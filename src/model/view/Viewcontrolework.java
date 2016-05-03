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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewcontrolework")
public class Viewcontrolework implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcontroleWork")
    @Id
    private int idcontroleWork;
    @Column(name = "dataEmbarque")
    @Temporal(TemporalType.DATE)
    private Date dataEmbarque;
    @Size(max = 50)
    @Column(name = "numeroPassaporte")
    private String numeroPassaporte;
    @Size(max = 100)
    @Column(name = "skype")
    private String skype;
    @Size(max = 100)
    @Column(name = "sponsor")
    private String sponsor;
    @Size(max = 100)
    @Column(name = "cidadeSponsor")
    private String cidadeSponsor;
    @Size(max = 100)
    @Column(name = "empregador")
    private String empregador;
    @Size(max = 3)
    @Column(name = "jobGuarante")
    private String jobGuarante;
    @Size(max = 3)
    @Column(name = "dataInicioJobOffer")
    private String dataInicioJobOffer;
    @Size(max = 3)
    @Column(name = "dataTerminoJobOffer")
    private String dataTerminoJobOffer;
    @Size(max = 3)
    @Column(name = "emailListaDocoumentos")
    private String emailListaDocoumentos;
    @Size(max = 3)
    @Column(name = "FichaContratoOriginal")
    private String fichaContratoOriginal;
    @Size(max = 3)
    @Column(name = "informativoOriginal")
    private String informativoOriginal;
    @Size(max = 3)
    @Column(name = "atestadoOriginal")
    private String atestadoOriginal;
    @Size(max = 3)
    @Column(name = "copiaPPTColorida")
    private String copiaPPTColorida;
    @Size(max = 3)
    @Column(name = "copiaRGCPF")
    private String copiaRGCPF;
    @Size(max = 3)
    @Column(name = "fotoDS")
    private String fotoDS;
    @Size(max = 3)
    @Column(name = "ds160")
    private String ds160;
    @Size(max = 3)
    @Column(name = "vc")
    private String vc;
    @Size(max = 3)
    @Column(name = "sleeptestecorrigido")
    private String sleeptestecorrigido;
    @Size(max = 3)
    @Column(name = "cartaoApresentacao")
    private String cartaoApresentacao;
    @Size(max = 3)
    @Column(name = "cartaoRecomendacao")
    private String cartaoRecomendacao;
    @Size(max = 3)
    @Column(name = "atestado2SMEOriginal")
    private String atestado2SMEOriginal;
    @Size(max = 3)
    @Column(name = "atestadoSaude")
    private String atestadoSaude;
    @Size(max = 3)
    @Column(name = "antecedentesCrimianis")
    private String antecedentesCrimianis;
    @Column(name = "dataRetorno")
    @Temporal(TemporalType.DATE)
    private Date dataRetorno;
    @Size(max = 50)
    @Column(name = "statusProcesso")
    private String statusProcesso;
    @Size(max = 50)
    @Column(name = "statusPrograma")
    private String statusPrograma;
    @Lob
    @Size(max = 16777215)
    @Column(name = "observacoes")
    private String observacoes;
    @Size(max = 50)
    @Column(name = "finalizado")
    private String finalizado;
    @Size(max = 20)
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idVendas")
    private int idVendas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idCliente")
    private int idCliente;
    @Size(max = 100)
    @Column(name = "nomeCliente")
    private String nomeCliente;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="E-mail inválido")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 14)
    @Column(name = "foneCelular")
    private String foneCelular;
    @Size(max = 50)
    @Column(name = "cidadeEndereco")
    private String cidadeEndereco;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Size(max = 9)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 45)
    @Column(name = "rg")
    private String rg;
    @Size(max = 100)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUnidadeNegocio")
    private int idUnidadeNegocio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Size(max = 100)
    @Column(name = "nomeConsultor")
    private String nomeConsultor;
    @Size(max = 50)
    @Column(name = "tipo")
    private String tipo;
    @Size(max = 100)
    @Column(name = "intituicaoEstuda")
    private String intituicaoEstuda;
    @Size(max = 50)
    @Column(name = "cursoEstuda")
    private String cursoEstuda;
    @Size(max = 45)
    @Column(name = "idioma01")
    private String idioma01;
    @Size(max = 45)
    @Column(name = "nivelidioma01")
    private String nivelidioma01;
    @Size(max = 50)
    @Column(name = "clima")
    private String clima;
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
    @Size(max = 100)
    @Column(name = "campanheiroViagem01")
    private String campanheiroViagem01;
    @Size(max = 30)
    @Column(name = "controle")
    private String controle;
    @Size(max = 100)
    @Column(name = "nomeFornecedor")
    private String nomeFornecedor;

    public Viewcontrolework() {
    }

    public int getIdcontroleWork() {
        return idcontroleWork;
    }

    public void setIdcontroleWork(int idcontroleWork) {
        this.idcontroleWork = idcontroleWork;
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

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public int getIdVendas() {
        return idVendas;
    }

    public void setIdVendas(int idVendas) {
        this.idVendas = idVendas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneCelular() {
        return foneCelular;
    }

    public void setFoneCelular(String foneCelular) {
        this.foneCelular = foneCelular;
    }

    public String getCidadeEndereco() {
        return cidadeEndereco;
    }

    public void setCidadeEndereco(String cidadeEndereco) {
        this.cidadeEndereco = cidadeEndereco;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public int getIdUnidadeNegocio() {
        return idUnidadeNegocio;
    }

    public void setIdUnidadeNegocio(int idUnidadeNegocio) {
        this.idUnidadeNegocio = idUnidadeNegocio;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNomeConsultor() {
        return nomeConsultor;
    }

    public void setNomeConsultor(String nomeConsultor) {
        this.nomeConsultor = nomeConsultor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIntituicaoEstuda() {
        return intituicaoEstuda;
    }

    public void setIntituicaoEstuda(String intituicaoEstuda) {
        this.intituicaoEstuda = intituicaoEstuda;
    }

    public String getCursoEstuda() {
        return cursoEstuda;
    }

    public void setCursoEstuda(String cursoEstuda) {
        this.cursoEstuda = cursoEstuda;
    }

    public String getIdioma01() {
        return idioma01;
    }

    public void setIdioma01(String idioma01) {
        this.idioma01 = idioma01;
    }

    public String getNivelidioma01() {
        return nivelidioma01;
    }

    public void setNivelidioma01(String nivelidioma01) {
        this.nivelidioma01 = nivelidioma01;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
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

    public String getCampanheiroViagem01() {
        return campanheiroViagem01;
    }

    public void setCampanheiroViagem01(String campanheiroViagem01) {
        this.campanheiroViagem01 = campanheiroViagem01;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }
    
}
