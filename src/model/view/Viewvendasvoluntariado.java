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
@Table(name = "viewvendasvoluntariado")
public class Viewvendasvoluntariado implements Serializable {
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
    @Column(name = "idvoluntariado")
    private int idvoluntariado;
    @Size(max = 50)
    @Column(name = "idiomaEstudar")
    private String idiomaEstudar;
    @Size(max = 50)
    @Column(name = "nivelIdiomaEstudar")
    private String nivelIdiomaEstudar;
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
    @Column(name = "dataMatriculaCursoEstuda")
    @Temporal(TemporalType.DATE)
    private Date dataMatriculaCursoEstuda;
    @Column(name = "dataEstimadaTerminoCursoEstuda")
    @Temporal(TemporalType.DATE)
    private Date dataEstimadaTerminoCursoEstuda;
    @Size(max = 50)
    @Column(name = "volprofissao")
    private String volprofissao;
    @Size(max = 50)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 200)
    @Column(name = "descricaoCargo")
    private String descricaoCargo;
    @Size(max = 100)
    @Column(name = "outrasHabilidade")
    private String outrasHabilidade;
    @Size(max = 100)
    @Column(name = "curso")
    private String curso;
    @Column(name = "aulasporSemana")
    private Integer aulasporSemana;
    @Column(name = "numeroSemanas")
    private Integer numeroSemanas;
    @Column(name = "dataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Column(name = "dataTermino")
    @Temporal(TemporalType.DATE)
    private Date dataTermino;
    @Size(max = 50)
    @Column(name = "tipoAcomodacao")
    private String tipoAcomodacao;
    @Column(name = "numeroSemanasAcomodacao")
    private Integer numeroSemanasAcomodacao;
    @Size(max = 50)
    @Column(name = "tipoQuarto")
    private String tipoQuarto;
    @Size(max = 50)
    @Column(name = "refeicoes")
    private String refeicoes;
    @Size(max = 100)
    @Column(name = "adicionais")
    private String adicionais;
    @Column(name = "dataChegadaAcomodacao")
    @Temporal(TemporalType.DATE)
    private Date dataChegadaAcomodacao;
    @Column(name = "dataPartidaAcomodacao")
    @Temporal(TemporalType.DATE)
    private Date dataPartidaAcomodacao;
    @Size(max = 15)
    @Column(name = "familiaCrianca")
    private String familiaCrianca;
    @Size(max = 15)
    @Column(name = "familiaAnimais")
    private String familiaAnimais;
    @Size(max = 3)
    @Column(name = "fumante")
    private String fumante;
    @Size(max = 3)
    @Column(name = "vegetariano")
    private String vegetariano;
    @Size(max = 200)
    @Column(name = "hobbies")
    private String hobbies;
    @Size(max = 3)
    @Column(name = "possuiAlergia")
    private String possuiAlergia;
    @Size(max = 200)
    @Column(name = "quaisAlergias")
    private String quaisAlergias;
    @Size(max = 100)
    @Column(name = "solicitacoesEspeciais")
    private String solicitacoesEspeciais;
    @Size(max = 3)
    @Column(name = "transferin")
    private String transferin;
    @Size(max = 3)
    @Column(name = "transferout")
    private String transferout;
    @Column(name = "dataChegadaTransfer")
    @Temporal(TemporalType.DATE)
    private Date dataChegadaTransfer;
    @Size(max = 45)
    @Column(name = "voo")
    private String voo;
    @Size(max = 50)
    @Column(name = "ciaerea")
    private String ciaerea;
    @Size(max = 5)
    @Column(name = "horario")
    private String horario;
    @Size(max = 200)
    @Column(name = "projetoVoluntariado")
    private String projetoVoluntariado;
    @Column(name = "dataInicioVoluntariado")
    @Temporal(TemporalType.DATE)
    private Date dataInicioVoluntariado;
    @Column(name = "dataTerminoVoluntariado")
    @Temporal(TemporalType.DATE)
    private Date dataTerminoVoluntariado;
    @Size(max = 200)
    @Column(name = "experienciaVoluntariado")
    private String experienciaVoluntariado;
    @Size(max = 200)
    @Column(name = "motivoVoluntariado")
    private String motivoVoluntariado;
    @Size(max = 3)
    @Column(name = "deficienciaFisica")
    private String deficienciaFisica;
    @Size(max = 3)
    @Column(name = "possuiProblemaSaude")
    private String possuiProblemaSaude;
    @Size(max = 100)
    @Column(name = "descricaoProblemaSaude")
    private String descricaoProblemaSaude;
    @Size(max = 3)
    @Column(name = "tratamentoMedico")
    private String tratamentoMedico;
    @Size(max = 100)
    @Column(name = "descricaoMedico")
    private String descricaoMedico;
    @Size(max = 3)
    @Column(name = "tratamentoDrogas")
    private String tratamentoDrogas;
    @Size(max = 100)
    @Column(name = "descricaoDrogas")
    private String descricaoDrogas;
    @Size(max = 3)
    @Column(name = "fezCirurgia")
    private String fezCirurgia;
    @Size(max = 100)
    @Column(name = "descricaoCirurgia")
    private String descricaoCirurgia;
    @Size(max = 100)
    @Column(name = "dietaEspecifica")
    private String dietaEspecifica;
    @Size(max = 3)
    @Column(name = "cartaoVTM")
    private String cartaoVTM;
    @Size(max = 45)
    @Column(name = "numerocartaoVTM")
    private String numerocartaoVTM;
    @Size(max = 45)
    @Column(name = "meodaCartaoVTM")
    private String meodaCartaoVTM;
    @Size(max = 3)
    @Column(name = "seguroViagem")
    private String seguroViagem;
    @Size(max = 100)
    @Column(name = "seguradora")
    private String seguradora;
    @Size(max = 50)
    @Column(name = "planoSeguro")
    private String planoSeguro;
    @Column(name = "dataInicioSeguro")
    @Temporal(TemporalType.DATE)
    private Date dataInicioSeguro;
    @Column(name = "dataTerminoSeguro")
    @Temporal(TemporalType.DATE)
    private Date dataTerminoSeguro;
    @Column(name = "numeroSemanasSeguro")
    private Integer numeroSemanasSeguro;
    @Size(max = 50)
    @Column(name = "passagemAerea")
    private String passagemAerea;
    @Size(max = 100)
    @Column(name = "observacaoPassagem")
    private String observacaoPassagem;
    @Size(max = 50)
    @Column(name = "vistoConsular")
    private String vistoConsular;
    @Size(max = 100)
    @Column(name = "observacaoVistoConsultar")
    private String observacaoVistoConsultar;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vendas_idvendas")
    private int vendasIdvendas;
    @Column(name = "dataEntregaDocumentoVisto")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaDocumentoVisto;
    @Size(max = 100)
    @Column(name = "nivelFitness")
    private String nivelFitness;
    @Size(max = 30)
    @Column(name = "controle")
    private String controle;
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

    public Viewvendasvoluntariado() {
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

    public int getIdvoluntariado() {
        return idvoluntariado;
    }

    public void setIdvoluntariado(int idvoluntariado) {
        this.idvoluntariado = idvoluntariado;
    }

    public String getIdiomaEstudar() {
        return idiomaEstudar;
    }

    public void setIdiomaEstudar(String idiomaEstudar) {
        this.idiomaEstudar = idiomaEstudar;
    }

    public String getNivelIdiomaEstudar() {
        return nivelIdiomaEstudar;
    }

    public void setNivelIdiomaEstudar(String nivelIdiomaEstudar) {
        this.nivelIdiomaEstudar = nivelIdiomaEstudar;
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

    public Date getDataMatriculaCursoEstuda() {
        return dataMatriculaCursoEstuda;
    }

    public void setDataMatriculaCursoEstuda(Date dataMatriculaCursoEstuda) {
        this.dataMatriculaCursoEstuda = dataMatriculaCursoEstuda;
    }

    public Date getDataEstimadaTerminoCursoEstuda() {
        return dataEstimadaTerminoCursoEstuda;
    }

    public void setDataEstimadaTerminoCursoEstuda(Date dataEstimadaTerminoCursoEstuda) {
        this.dataEstimadaTerminoCursoEstuda = dataEstimadaTerminoCursoEstuda;
    }

    public String getVolprofissao() {
        return volprofissao;
    }

    public void setVolprofissao(String volprofissao) {
        this.volprofissao = volprofissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricaoCargo() {
        return descricaoCargo;
    }

    public void setDescricaoCargo(String descricaoCargo) {
        this.descricaoCargo = descricaoCargo;
    }

    public String getOutrasHabilidade() {
        return outrasHabilidade;
    }

    public void setOutrasHabilidade(String outrasHabilidade) {
        this.outrasHabilidade = outrasHabilidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getAulasporSemana() {
        return aulasporSemana;
    }

    public void setAulasporSemana(Integer aulasporSemana) {
        this.aulasporSemana = aulasporSemana;
    }

    public Integer getNumeroSemanas() {
        return numeroSemanas;
    }

    public void setNumeroSemanas(Integer numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
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

    public Integer getNumeroSemanasAcomodacao() {
        return numeroSemanasAcomodacao;
    }

    public void setNumeroSemanasAcomodacao(Integer numeroSemanasAcomodacao) {
        this.numeroSemanasAcomodacao = numeroSemanasAcomodacao;
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

    public Date getDataChegadaAcomodacao() {
        return dataChegadaAcomodacao;
    }

    public void setDataChegadaAcomodacao(Date dataChegadaAcomodacao) {
        this.dataChegadaAcomodacao = dataChegadaAcomodacao;
    }

    public Date getDataPartidaAcomodacao() {
        return dataPartidaAcomodacao;
    }

    public void setDataPartidaAcomodacao(Date dataPartidaAcomodacao) {
        this.dataPartidaAcomodacao = dataPartidaAcomodacao;
    }

    public String getFamiliaCrianca() {
        return familiaCrianca;
    }

    public void setFamiliaCrianca(String familiaCrianca) {
        this.familiaCrianca = familiaCrianca;
    }

    public String getFamiliaAnimais() {
        return familiaAnimais;
    }

    public void setFamiliaAnimais(String familiaAnimais) {
        this.familiaAnimais = familiaAnimais;
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

    public String getTransferin() {
        return transferin;
    }

    public void setTransferin(String transferin) {
        this.transferin = transferin;
    }

    public String getTransferout() {
        return transferout;
    }

    public void setTransferout(String transferout) {
        this.transferout = transferout;
    }

    public Date getDataChegadaTransfer() {
        return dataChegadaTransfer;
    }

    public void setDataChegadaTransfer(Date dataChegadaTransfer) {
        this.dataChegadaTransfer = dataChegadaTransfer;
    }

    public String getVoo() {
        return voo;
    }

    public void setVoo(String voo) {
        this.voo = voo;
    }

    public String getCiaerea() {
        return ciaerea;
    }

    public void setCiaerea(String ciaerea) {
        this.ciaerea = ciaerea;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getProjetoVoluntariado() {
        return projetoVoluntariado;
    }

    public void setProjetoVoluntariado(String projetoVoluntariado) {
        this.projetoVoluntariado = projetoVoluntariado;
    }

    public Date getDataInicioVoluntariado() {
        return dataInicioVoluntariado;
    }

    public void setDataInicioVoluntariado(Date dataInicioVoluntariado) {
        this.dataInicioVoluntariado = dataInicioVoluntariado;
    }

    public Date getDataTerminoVoluntariado() {
        return dataTerminoVoluntariado;
    }

    public void setDataTerminoVoluntariado(Date dataTerminoVoluntariado) {
        this.dataTerminoVoluntariado = dataTerminoVoluntariado;
    }

    public String getExperienciaVoluntariado() {
        return experienciaVoluntariado;
    }

    public void setExperienciaVoluntariado(String experienciaVoluntariado) {
        this.experienciaVoluntariado = experienciaVoluntariado;
    }

    public String getMotivoVoluntariado() {
        return motivoVoluntariado;
    }

    public void setMotivoVoluntariado(String motivoVoluntariado) {
        this.motivoVoluntariado = motivoVoluntariado;
    }

    public String getDeficienciaFisica() {
        return deficienciaFisica;
    }

    public void setDeficienciaFisica(String deficienciaFisica) {
        this.deficienciaFisica = deficienciaFisica;
    }

    public String getPossuiProblemaSaude() {
        return possuiProblemaSaude;
    }

    public void setPossuiProblemaSaude(String possuiProblemaSaude) {
        this.possuiProblemaSaude = possuiProblemaSaude;
    }

    public String getDescricaoProblemaSaude() {
        return descricaoProblemaSaude;
    }

    public void setDescricaoProblemaSaude(String descricaoProblemaSaude) {
        this.descricaoProblemaSaude = descricaoProblemaSaude;
    }

    public String getTratamentoMedico() {
        return tratamentoMedico;
    }

    public void setTratamentoMedico(String tratamentoMedico) {
        this.tratamentoMedico = tratamentoMedico;
    }

    public String getDescricaoMedico() {
        return descricaoMedico;
    }

    public void setDescricaoMedico(String descricaoMedico) {
        this.descricaoMedico = descricaoMedico;
    }

    public String getTratamentoDrogas() {
        return tratamentoDrogas;
    }

    public void setTratamentoDrogas(String tratamentoDrogas) {
        this.tratamentoDrogas = tratamentoDrogas;
    }

    public String getDescricaoDrogas() {
        return descricaoDrogas;
    }

    public void setDescricaoDrogas(String descricaoDrogas) {
        this.descricaoDrogas = descricaoDrogas;
    }

    public String getFezCirurgia() {
        return fezCirurgia;
    }

    public void setFezCirurgia(String fezCirurgia) {
        this.fezCirurgia = fezCirurgia;
    }

    public String getDescricaoCirurgia() {
        return descricaoCirurgia;
    }

    public void setDescricaoCirurgia(String descricaoCirurgia) {
        this.descricaoCirurgia = descricaoCirurgia;
    }

    public String getDietaEspecifica() {
        return dietaEspecifica;
    }

    public void setDietaEspecifica(String dietaEspecifica) {
        this.dietaEspecifica = dietaEspecifica;
    }

    public String getCartaoVTM() {
        return cartaoVTM;
    }

    public void setCartaoVTM(String cartaoVTM) {
        this.cartaoVTM = cartaoVTM;
    }

    public String getNumerocartaoVTM() {
        return numerocartaoVTM;
    }

    public void setNumerocartaoVTM(String numerocartaoVTM) {
        this.numerocartaoVTM = numerocartaoVTM;
    }

    public String getMeodaCartaoVTM() {
        return meodaCartaoVTM;
    }

    public void setMeodaCartaoVTM(String meodaCartaoVTM) {
        this.meodaCartaoVTM = meodaCartaoVTM;
    }

    public String getSeguroViagem() {
        return seguroViagem;
    }

    public void setSeguroViagem(String seguroViagem) {
        this.seguroViagem = seguroViagem;
    }

    public String getSeguradora() {
        return seguradora;
    }

    public void setSeguradora(String seguradora) {
        this.seguradora = seguradora;
    }

    public String getPlanoSeguro() {
        return planoSeguro;
    }

    public void setPlanoSeguro(String planoSeguro) {
        this.planoSeguro = planoSeguro;
    }

    public Date getDataInicioSeguro() {
        return dataInicioSeguro;
    }

    public void setDataInicioSeguro(Date dataInicioSeguro) {
        this.dataInicioSeguro = dataInicioSeguro;
    }

    public Date getDataTerminoSeguro() {
        return dataTerminoSeguro;
    }

    public void setDataTerminoSeguro(Date dataTerminoSeguro) {
        this.dataTerminoSeguro = dataTerminoSeguro;
    }

    public Integer getNumeroSemanasSeguro() {
        return numeroSemanasSeguro;
    }

    public void setNumeroSemanasSeguro(Integer numeroSemanasSeguro) {
        this.numeroSemanasSeguro = numeroSemanasSeguro;
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

    public String getVistoConsular() {
        return vistoConsular;
    }

    public void setVistoConsular(String vistoConsular) {
        this.vistoConsular = vistoConsular;
    }

    public String getObservacaoVistoConsultar() {
        return observacaoVistoConsultar;
    }

    public void setObservacaoVistoConsultar(String observacaoVistoConsultar) {
        this.observacaoVistoConsultar = observacaoVistoConsultar;
    }

    public int getVendasIdvendas() {
        return vendasIdvendas;
    }

    public void setVendasIdvendas(int vendasIdvendas) {
        this.vendasIdvendas = vendasIdvendas;
    }

    public Date getDataEntregaDocumentoVisto() {
        return dataEntregaDocumentoVisto;
    }

    public void setDataEntregaDocumentoVisto(Date dataEntregaDocumentoVisto) {
        this.dataEntregaDocumentoVisto = dataEntregaDocumentoVisto;
    }

    public String getNivelFitness() {
        return nivelFitness;
    }

    public void setNivelFitness(String nivelFitness) {
        this.nivelFitness = nivelFitness;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
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
