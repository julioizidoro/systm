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
@Table(name = "viewvendastrainee")
public class Viewvendastrainee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorVenda")
    private Float valorVenda;
    @Column(name = "valor")
    private Float valor;
    @Size(max = 20)
    @Column(name = "situacao")
    private String situacao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idtrainee")
    private int idtrainee;
    @Size(max = 100)
    @Column(name = "nomeContatoEmergencia")
    private String nomeContatoEmergencia;
    @Size(max = 14)
    @Column(name = "foneContatoEmergencia")
    private String foneContatoEmergencia;
    @Size(max = 100)
    @Column(name = "emailContatoEmergencia")
    private String emailContatoEmergencia;
    @Size(max = 50)
    @Column(name = "relacaoContatoEmergencia")
    private String relacaoContatoEmergencia;
    @Size(max = 100)
    @Column(name = "instituicaoEstuda")
    private String instituicaoEstuda;
    @Size(max = 50)
    @Column(name = "cursoEstuda")
    private String cursoEstuda;
    @Size(max = 50)
    @Column(name = "duracaoCursoEstuda")
    private String duracaoCursoEstuda;
    @Size(max = 50)
    @Column(name = "periodoCursoEstuda")
    private String periodoCursoEstuda;
    @Size(max = 50)
    @Column(name = "nivelEstudo")
    private String nivelEstudo;
    @Size(max = 100)
    @Column(name = "ocupacao")
    private String ocupacao;
    @Column(name = "quantoAnosEstudaIngles")
    private Integer quantoAnosEstudaIngles;
    @Size(max = 10)
    @Column(name = "notaSlepTest")
    private String notaSlepTest;
    @Size(max = 25)
    @Column(name = "nivelIngles")
    private String nivelIngles;
    @Size(max = 100)
    @Column(name = "descricaoAreaEstudo")
    private String descricaoAreaEstudo;
    @Size(max = 3)
    @Column(name = "problemaSaude")
    private String problemaSaude;
    @Size(max = 200)
    @Column(name = "descricaoProblemaSaude")
    private String descricaoProblemaSaude;
    @Size(max = 3)
    @Column(name = "fuma")
    private String fuma;
    @Column(name = "primeiraDataChegada")
    @Temporal(TemporalType.DATE)
    private Date primeiraDataChegada;
    @Column(name = "ultimaDataChegada")
    @Temporal(TemporalType.DATE)
    private Date ultimaDataChegada;
    @Column(name = "UltimaDataRetorno")
    @Temporal(TemporalType.DATE)
    private Date ultimaDataRetorno;
    @Size(max = 3)
    @Column(name = "foiCondebado")
    private String foiCondebado;
    @Size(max = 3)
    @Column(name = "inspencaoPassado")
    private String inspencaoPassado;
    @Size(max = 3)
    @Column(name = "possuiTatuagem")
    private String possuiTatuagem;
    @Size(max = 3)
    @Column(name = "testeDrogas")
    private String testeDrogas;
    @Size(max = 3)
    @Column(name = "trabalhoj1")
    private String trabalhoj1;
    @Size(max = 50)
    @Column(name = "quantoTrabalho")
    private String quantoTrabalho;
    @Size(max = 50)
    @Column(name = "duracaoProgramaTrabalho")
    private String duracaoProgramaTrabalho;
    @Size(max = 50)
    @Column(name = "programaReponsavelEUA")
    private String programaReponsavelEUA;
    @Size(max = 100)
    @Column(name = "empresa")
    private String empresa;
    @Size(max = 50)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 50)
    @Column(name = "numeroSocialSecurity")
    private String numeroSocialSecurity;
    @Size(max = 100)
    @Column(name = "colocacaoEmpresa01")
    private String colocacaoEmpresa01;
    @Size(max = 100)
    @Column(name = "colocacaoEmpresa02")
    private String colocacaoEmpresa02;
    @Size(max = 100)
    @Column(name = "colocacaoCidade01")
    private String colocacaoCidade01;
    @Size(max = 100)
    @Column(name = "colocacaoCidade02")
    private String colocacaoCidade02;
    @Size(max = 50)
    @Column(name = "colocacaoCargo01")
    private String colocacaoCargo01;
    @Size(max = 50)
    @Column(name = "colocacaoCargo02")
    private String colocacaoCargo02;
    @Lob
    @Size(max = 16777215)
    @Column(name = "objetivosPrograma")
    private String objetivosPrograma;
    @Lob
    @Size(max = 16777215)
    @Column(name = "escolheuPrograma")
    private String escolheuPrograma;
    @Lob
    @Size(max = 16777215)
    @Column(name = "descrevaCargaHoraria")
    private String descrevaCargaHoraria;
    @Lob
    @Size(max = 16777215)
    @Column(name = "empresaContratar")
    private String empresaContratar;
    @Size(max = 50)
    @Column(name = "passagemAerea")
    private String passagemAerea;
    @Size(max = 100)
    @Column(name = "observacaoPassagem")
    private String observacaoPassagem;
    @Size(max = 30)
    @Column(name = "controle")
    private String controle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vendas_idvendas")
    private int vendasIdvendas;
    @Size(max = 100)
    @Column(name = "razaoSocial")
    private String razaoSocial;
    @Size(max = 100)
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Size(max = 10)
    @Column(name = "tipologradourounidadeNegocio")
    private String tipologradourounidadeNegocio;
    @Size(max = 100)
    @Column(name = "logradourounidadeNegocio")
    private String logradourounidadeNegocio;
    @Size(max = 10)
    @Column(name = "nuemrounidadeNegocio")
    private String nuemrounidadeNegocio;
    @Size(max = 50)
    @Column(name = "complementounidadeNegocio")
    private String complementounidadeNegocio;
    @Size(max = 50)
    @Column(name = "bairrounidadeNegocio")
    private String bairrounidadeNegocio;
    @Size(max = 100)
    @Column(name = "cidadeunidadeNegocio")
    private String cidadeunidadeNegocio;
    @Size(max = 2)
    @Column(name = "estadounidadeNegocio")
    private String estadounidadeNegocio;
    @Size(max = 9)
    @Column(name = "cepunidadeNegocio")
    private String cepunidadeNegocio;
    @Size(max = 18)
    @Column(name = "cnpjunidadeNegocio")
    private String cnpjunidadeNegocio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcliente")
    private int idcliente;
    @Size(max = 100)
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Size(max = 50)
    @Column(name = "paisnascimento")
    private String paisnascimento;
    @Size(max = 50)
    @Column(name = "cidadenascimento")
    private String cidadenascimento;
    @Size(max = 45)
    @Column(name = "rg")
    private String rg;
    @Size(max = 9)
    @Column(name = "sexo")
    private String sexo;
    @Size(max = 50)
    @Column(name = "numeropassaporte")
    private String numeropassaporte;
    @Column(name = "dataExpedicaoPassaporte")
    @Temporal(TemporalType.DATE)
    private Date dataExpedicaoPassaporte;
    @Column(name = "validadePassaporte")
    @Temporal(TemporalType.DATE)
    private Date validadePassaporte;
    @Size(max = 20)
    @Column(name = "clientetipologradouro")
    private String clientetipologradouro;
    @Size(max = 100)
    @Column(name = "clientelogradouro")
    private String clientelogradouro;
    @Size(max = 30)
    @Column(name = "clientenumero")
    private String clientenumero;
    @Size(max = 50)
    @Column(name = "clientebairro")
    private String clientebairro;
    @Size(max = 50)
    @Column(name = "clientecidade")
    private String clientecidade;
    @Size(max = 2)
    @Column(name = "clienteestado")
    private String clienteestado;
    @Size(max = 9)
    @Column(name = "clientecep")
    private String clientecep;
    @Size(max = 14)
    @Column(name = "clientecpf")
    private String clientecpf;
    @Size(max = 50)
    @Column(name = "clientepais")
    private String clientepais;
    @Size(max = 14)
    @Column(name = "foneresidencial")
    private String foneresidencial;
    @Size(max = 14)
    @Column(name = "fonecelular")
    private String fonecelular;
    @Size(max = 14)
    @Column(name = "fonecomercial")
    private String fonecomercial;
    @Size(max = 50)
    @Column(name = "profissao")
    private String profissao;
    @Size(max = 100)
    @Column(name = "emailcliente")
    private String emailcliente;
    @Size(max = 50)
    @Column(name = "escolaridade")
    private String escolaridade;
    @Size(max = 100)
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Obstm")
    private String obstm;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idUnidade")
    private int idUnidade;
    @Size(max = 100)
    @Column(name = "NomeUnidade")
    private String nomeUnidade;
    @Column(name = "dataCambio")
    @Temporal(TemporalType.DATE)
    private Date dataCambio;
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Size(max = 50)
    @Column(name = "descricaoMoedas")
    private String descricaoMoedas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idcambio")
    private int idcambio;
    @Size(max = 10)
    @Column(name = "sigla")
    private String sigla;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvendas")
    @Id
    private int idvendas;

    public Viewvendastrainee() {
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(Float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getIdtrainee() {
        return idtrainee;
    }

    public void setIdtrainee(int idtrainee) {
        this.idtrainee = idtrainee;
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

    public String getInstituicaoEstuda() {
        return instituicaoEstuda;
    }

    public void setInstituicaoEstuda(String instituicaoEstuda) {
        this.instituicaoEstuda = instituicaoEstuda;
    }

    public String getCursoEstuda() {
        return cursoEstuda;
    }

    public void setCursoEstuda(String cursoEstuda) {
        this.cursoEstuda = cursoEstuda;
    }

    public String getDuracaoCursoEstuda() {
        return duracaoCursoEstuda;
    }

    public void setDuracaoCursoEstuda(String duracaoCursoEstuda) {
        this.duracaoCursoEstuda = duracaoCursoEstuda;
    }

    public String getPeriodoCursoEstuda() {
        return periodoCursoEstuda;
    }

    public void setPeriodoCursoEstuda(String periodoCursoEstuda) {
        this.periodoCursoEstuda = periodoCursoEstuda;
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

    public Integer getQuantoAnosEstudaIngles() {
        return quantoAnosEstudaIngles;
    }

    public void setQuantoAnosEstudaIngles(Integer quantoAnosEstudaIngles) {
        this.quantoAnosEstudaIngles = quantoAnosEstudaIngles;
    }

    public String getNotaSlepTest() {
        return notaSlepTest;
    }

    public void setNotaSlepTest(String notaSlepTest) {
        this.notaSlepTest = notaSlepTest;
    }

    public String getNivelIngles() {
        return nivelIngles;
    }

    public void setNivelIngles(String nivelIngles) {
        this.nivelIngles = nivelIngles;
    }

    public String getDescricaoAreaEstudo() {
        return descricaoAreaEstudo;
    }

    public void setDescricaoAreaEstudo(String descricaoAreaEstudo) {
        this.descricaoAreaEstudo = descricaoAreaEstudo;
    }

    public String getProblemaSaude() {
        return problemaSaude;
    }

    public void setProblemaSaude(String problemaSaude) {
        this.problemaSaude = problemaSaude;
    }

    public String getDescricaoProblemaSaude() {
        return descricaoProblemaSaude;
    }

    public void setDescricaoProblemaSaude(String descricaoProblemaSaude) {
        this.descricaoProblemaSaude = descricaoProblemaSaude;
    }

    public String getFuma() {
        return fuma;
    }

    public void setFuma(String fuma) {
        this.fuma = fuma;
    }

    public Date getPrimeiraDataChegada() {
        return primeiraDataChegada;
    }

    public void setPrimeiraDataChegada(Date primeiraDataChegada) {
        this.primeiraDataChegada = primeiraDataChegada;
    }

    public Date getUltimaDataChegada() {
        return ultimaDataChegada;
    }

    public void setUltimaDataChegada(Date ultimaDataChegada) {
        this.ultimaDataChegada = ultimaDataChegada;
    }

    public Date getUltimaDataRetorno() {
        return ultimaDataRetorno;
    }

    public void setUltimaDataRetorno(Date ultimaDataRetorno) {
        this.ultimaDataRetorno = ultimaDataRetorno;
    }

    public String getFoiCondebado() {
        return foiCondebado;
    }

    public void setFoiCondebado(String foiCondebado) {
        this.foiCondebado = foiCondebado;
    }

    public String getInspencaoPassado() {
        return inspencaoPassado;
    }

    public void setInspencaoPassado(String inspencaoPassado) {
        this.inspencaoPassado = inspencaoPassado;
    }

    public String getPossuiTatuagem() {
        return possuiTatuagem;
    }

    public void setPossuiTatuagem(String possuiTatuagem) {
        this.possuiTatuagem = possuiTatuagem;
    }

    public String getTesteDrogas() {
        return testeDrogas;
    }

    public void setTesteDrogas(String testeDrogas) {
        this.testeDrogas = testeDrogas;
    }

    public String getTrabalhoj1() {
        return trabalhoj1;
    }

    public void setTrabalhoj1(String trabalhoj1) {
        this.trabalhoj1 = trabalhoj1;
    }

    public String getQuantoTrabalho() {
        return quantoTrabalho;
    }

    public void setQuantoTrabalho(String quantoTrabalho) {
        this.quantoTrabalho = quantoTrabalho;
    }

    public String getDuracaoProgramaTrabalho() {
        return duracaoProgramaTrabalho;
    }

    public void setDuracaoProgramaTrabalho(String duracaoProgramaTrabalho) {
        this.duracaoProgramaTrabalho = duracaoProgramaTrabalho;
    }

    public String getProgramaReponsavelEUA() {
        return programaReponsavelEUA;
    }

    public void setProgramaReponsavelEUA(String programaReponsavelEUA) {
        this.programaReponsavelEUA = programaReponsavelEUA;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNumeroSocialSecurity() {
        return numeroSocialSecurity;
    }

    public void setNumeroSocialSecurity(String numeroSocialSecurity) {
        this.numeroSocialSecurity = numeroSocialSecurity;
    }

    public String getColocacaoEmpresa01() {
        return colocacaoEmpresa01;
    }

    public void setColocacaoEmpresa01(String colocacaoEmpresa01) {
        this.colocacaoEmpresa01 = colocacaoEmpresa01;
    }

    public String getColocacaoEmpresa02() {
        return colocacaoEmpresa02;
    }

    public void setColocacaoEmpresa02(String colocacaoEmpresa02) {
        this.colocacaoEmpresa02 = colocacaoEmpresa02;
    }

    public String getColocacaoCidade01() {
        return colocacaoCidade01;
    }

    public void setColocacaoCidade01(String colocacaoCidade01) {
        this.colocacaoCidade01 = colocacaoCidade01;
    }

    public String getColocacaoCidade02() {
        return colocacaoCidade02;
    }

    public void setColocacaoCidade02(String colocacaoCidade02) {
        this.colocacaoCidade02 = colocacaoCidade02;
    }

    public String getColocacaoCargo01() {
        return colocacaoCargo01;
    }

    public void setColocacaoCargo01(String colocacaoCargo01) {
        this.colocacaoCargo01 = colocacaoCargo01;
    }

    public String getColocacaoCargo02() {
        return colocacaoCargo02;
    }

    public void setColocacaoCargo02(String colocacaoCargo02) {
        this.colocacaoCargo02 = colocacaoCargo02;
    }

    public String getObjetivosPrograma() {
        return objetivosPrograma;
    }

    public void setObjetivosPrograma(String objetivosPrograma) {
        this.objetivosPrograma = objetivosPrograma;
    }

    public String getEscolheuPrograma() {
        return escolheuPrograma;
    }

    public void setEscolheuPrograma(String escolheuPrograma) {
        this.escolheuPrograma = escolheuPrograma;
    }

    public String getDescrevaCargaHoraria() {
        return descrevaCargaHoraria;
    }

    public void setDescrevaCargaHoraria(String descrevaCargaHoraria) {
        this.descrevaCargaHoraria = descrevaCargaHoraria;
    }

    public String getEmpresaContratar() {
        return empresaContratar;
    }

    public void setEmpresaContratar(String empresaContratar) {
        this.empresaContratar = empresaContratar;
    }

    public String getPassagemAerea() {
        return passagemAerea;
    }

    public void setPassagemAerea(String passagemAerea) {
        this.passagemAerea = passagemAerea;
    }

    public String getObservacaoPassagem() {
        return observacaoPassagem;
    }

    public void setObservacaoPassagem(String observacaoPassagem) {
        this.observacaoPassagem = observacaoPassagem;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public int getVendasIdvendas() {
        return vendasIdvendas;
    }

    public void setVendasIdvendas(int vendasIdvendas) {
        this.vendasIdvendas = vendasIdvendas;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getTipologradourounidadeNegocio() {
        return tipologradourounidadeNegocio;
    }

    public void setTipologradourounidadeNegocio(String tipologradourounidadeNegocio) {
        this.tipologradourounidadeNegocio = tipologradourounidadeNegocio;
    }

    public String getLogradourounidadeNegocio() {
        return logradourounidadeNegocio;
    }

    public void setLogradourounidadeNegocio(String logradourounidadeNegocio) {
        this.logradourounidadeNegocio = logradourounidadeNegocio;
    }

    public String getNuemrounidadeNegocio() {
        return nuemrounidadeNegocio;
    }

    public void setNuemrounidadeNegocio(String nuemrounidadeNegocio) {
        this.nuemrounidadeNegocio = nuemrounidadeNegocio;
    }

    public String getComplementounidadeNegocio() {
        return complementounidadeNegocio;
    }

    public void setComplementounidadeNegocio(String complementounidadeNegocio) {
        this.complementounidadeNegocio = complementounidadeNegocio;
    }

    public String getBairrounidadeNegocio() {
        return bairrounidadeNegocio;
    }

    public void setBairrounidadeNegocio(String bairrounidadeNegocio) {
        this.bairrounidadeNegocio = bairrounidadeNegocio;
    }

    public String getCidadeunidadeNegocio() {
        return cidadeunidadeNegocio;
    }

    public void setCidadeunidadeNegocio(String cidadeunidadeNegocio) {
        this.cidadeunidadeNegocio = cidadeunidadeNegocio;
    }

    public String getEstadounidadeNegocio() {
        return estadounidadeNegocio;
    }

    public void setEstadounidadeNegocio(String estadounidadeNegocio) {
        this.estadounidadeNegocio = estadounidadeNegocio;
    }

    public String getCepunidadeNegocio() {
        return cepunidadeNegocio;
    }

    public void setCepunidadeNegocio(String cepunidadeNegocio) {
        this.cepunidadeNegocio = cepunidadeNegocio;
    }

    public String getCnpjunidadeNegocio() {
        return cnpjunidadeNegocio;
    }

    public void setCnpjunidadeNegocio(String cnpjunidadeNegocio) {
        this.cnpjunidadeNegocio = cnpjunidadeNegocio;
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

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getPaisnascimento() {
        return paisnascimento;
    }

    public void setPaisnascimento(String paisnascimento) {
        this.paisnascimento = paisnascimento;
    }

    public String getCidadenascimento() {
        return cidadenascimento;
    }

    public void setCidadenascimento(String cidadenascimento) {
        this.cidadenascimento = cidadenascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNumeropassaporte() {
        return numeropassaporte;
    }

    public void setNumeropassaporte(String numeropassaporte) {
        this.numeropassaporte = numeropassaporte;
    }

    public Date getDataExpedicaoPassaporte() {
        return dataExpedicaoPassaporte;
    }

    public void setDataExpedicaoPassaporte(Date dataExpedicaoPassaporte) {
        this.dataExpedicaoPassaporte = dataExpedicaoPassaporte;
    }

    public Date getValidadePassaporte() {
        return validadePassaporte;
    }

    public void setValidadePassaporte(Date validadePassaporte) {
        this.validadePassaporte = validadePassaporte;
    }

    public String getClientetipologradouro() {
        return clientetipologradouro;
    }

    public void setClientetipologradouro(String clientetipologradouro) {
        this.clientetipologradouro = clientetipologradouro;
    }

    public String getClientelogradouro() {
        return clientelogradouro;
    }

    public void setClientelogradouro(String clientelogradouro) {
        this.clientelogradouro = clientelogradouro;
    }

    public String getClientenumero() {
        return clientenumero;
    }

    public void setClientenumero(String clientenumero) {
        this.clientenumero = clientenumero;
    }

    public String getClientebairro() {
        return clientebairro;
    }

    public void setClientebairro(String clientebairro) {
        this.clientebairro = clientebairro;
    }

    public String getClientecidade() {
        return clientecidade;
    }

    public void setClientecidade(String clientecidade) {
        this.clientecidade = clientecidade;
    }

    public String getClienteestado() {
        return clienteestado;
    }

    public void setClienteestado(String clienteestado) {
        this.clienteestado = clienteestado;
    }

    public String getClientecep() {
        return clientecep;
    }

    public void setClientecep(String clientecep) {
        this.clientecep = clientecep;
    }

    public String getClientecpf() {
        return clientecpf;
    }

    public void setClientecpf(String clientecpf) {
        this.clientecpf = clientecpf;
    }

    public String getClientepais() {
        return clientepais;
    }

    public void setClientepais(String clientepais) {
        this.clientepais = clientepais;
    }

    public String getFoneresidencial() {
        return foneresidencial;
    }

    public void setFoneresidencial(String foneresidencial) {
        this.foneresidencial = foneresidencial;
    }

    public String getFonecelular() {
        return fonecelular;
    }

    public void setFonecelular(String fonecelular) {
        this.fonecelular = fonecelular;
    }

    public String getFonecomercial() {
        return fonecomercial;
    }

    public void setFonecomercial(String fonecomercial) {
        this.fonecomercial = fonecomercial;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmailcliente() {
        return emailcliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getObstm() {
        return obstm;
    }

    public void setObstm(String obstm) {
        this.obstm = obstm;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public void setNomeUnidade(String nomeUnidade) {
        this.nomeUnidade = nomeUnidade;
    }

    public Date getDataCambio() {
        return dataCambio;
    }

    public void setDataCambio(Date dataCambio) {
        this.dataCambio = dataCambio;
    }

    public Float getValorCambio() {
        return valorCambio;
    }

    public void setValorCambio(Float valorCambio) {
        this.valorCambio = valorCambio;
    }

    public String getDescricaoMoedas() {
        return descricaoMoedas;
    }

    public void setDescricaoMoedas(String descricaoMoedas) {
        this.descricaoMoedas = descricaoMoedas;
    }

    public int getIdcambio() {
        return idcambio;
    }

    public void setIdcambio(int idcambio) {
        this.idcambio = idcambio;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIdvendas() {
        return idvendas;
    }

    public void setIdvendas(int idvendas) {
        this.idvendas = idvendas;
    }
    
}
