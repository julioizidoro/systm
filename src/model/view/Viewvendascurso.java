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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewvendascurso")
public class Viewvendascurso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "dataVenda")
    @Temporal(TemporalType.DATE)
    private Date dataVenda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valorVenda")
    private Float valorVenda;
    @Column(name = "valor")
    private Float valor;
    @Column(name = "situacao")
    private String situacao;
    @Column(name = "nomeCurso")
    private String nomeCurso;
    @Column(name = "escola")
    private String escola;
    @Basic(optional = false)
    @Column(name = "idcursos")
    private int idcursos;
    @Column(name = "cidade")
    private String cidade;
    @Column(name = "pais")
    private String pais;
    @Column(name = "aulassemana")
    private Integer aulassemana;
    @Column(name = "numerosenamas")
    private Integer numerosenamas;
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
    @Column(name = "tipoquarto")
    private String tipoquarto;
    @Column(name = "refeicoes")
    private String refeicoes;
    @Column(name = "adicionais")
    private String adicionais;
    @Column(name = "datachegada")
    @Temporal(TemporalType.DATE)
    private Date datachegada;
    @Column(name = "dataSaida")
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    @Column(name = "familiacomcrianca")
    private String familiacomcrianca;
    @Column(name = "tipoDuracao")
    private String tipoDuracao;
    @Column(name = "familiacomanimais")
    private String familiacomanimais;
    @Column(name = "fumante")
    private String fumante;
    @Column(name = "vegetariano")
    private String vegetariano;
    @Column(name = "hobbies")
    private String hobbies;
    @Column(name = "possuiAlergia")
    private String possuiAlergia;
    @Column(name = "quaisalergias")
    private String quaisalergias;
    @Column(name = "solicitacoesespeciais")
    private String solicitacoesespeciais;
    @Column(name = "caratovtm")
    private String caratovtm;
    @Column(name = "numerocartaovtm")
    private String numerocartaovtm;
    @Column(name = "moedacartaovtm")
    private String moedacartaovtm;
    @Column(name = "transferin")
    private String transferin;
    @Column(name = "transferouto")
    private String transferouto;
    @Column(name = "passagemaerea")
    private String passagemaerea;
    @Column(name = "observacaopassagemaerea")
    private String observacaopassagemaerea;
    @Column(name = "vistoconsular")
    private String vistoconsular;
    @Column(name = "dataEntregadocumentosvistos")
    @Temporal(TemporalType.DATE)
    private Date dataEntregadocumentosvistos;
    @Column(name = "observacaovisto")
    private String observacaovisto;
    @Column(name = "nomecontatoemergencia")
    private String nomecontatoemergencia;
    @Column(name = "fonecontatoemergencia")
    private String fonecontatoemergencia;
    @Column(name = "emalcontatoemergencia")
    private String emalcontatoemergencia;
    @Column(name = "relacaocontatoemergencia")
    private String relacaocontatoemergencia;
    @Column(name = "dataInscricaCurso")
    @Temporal(TemporalType.DATE)
    private Date dataInscricaCurso;
    @Column(name = "idioma")
    private String idioma;
    @Column(name = "nivelIdioma")
    private String nivelIdioma;
    @Column(name = "razaoSocial")
    private String razaoSocial;
    @Column(name = "nomeFantasia")
    private String nomeFantasia;
    @Column(name = "tipologradourounidadeNegocio")
    private String tipologradourounidadeNegocio;
    @Column(name = "logradourounidadeNegocio")
    private String logradourounidadeNegocio;
    @Column(name = "nuemrounidadeNegocio")
    private String nuemrounidadeNegocio;
    @Column(name = "complementounidadeNegocio")
    private String complementounidadeNegocio;
    @Column(name = "bairrounidadeNegocio")
    private String bairrounidadeNegocio;
    @Column(name = "cidadeunidadeNegocio")
    private String cidadeunidadeNegocio;
    @Column(name = "estadounidadeNegocio")
    private String estadounidadeNegocio;
    @Column(name = "cepunidadeNegocio")
    private String cepunidadeNegocio;
    @Column(name = "cnpjunidadeNegocio")
    private String cnpjunidadeNegocio;
    @Column(name = "nomeCliente")
    private String nomeCliente;
    @Column(name = "dataNascimento")
    @Temporal(TemporalType.DATE)
    private Date dataNascimento;
    @Column(name = "paisnascimento")
    private String paisnascimento;
    @Column(name = "cidadenascimento")
    private String cidadenascimento;
    @Column(name = "rg")
    private String rg;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "numeropassaporte")
    private String numeropassaporte;
    @Column(name = "dataExpedicaoPassaporte")
    @Temporal(TemporalType.DATE)
    private Date dataExpedicaoPassaporte;
    @Column(name = "validadePassaporte")
    @Temporal(TemporalType.DATE)
    private Date validadePassaporte;
    @Column(name = "clientetipologradouro")
    private String clientetipologradouro;
    @Column(name = "clientelogradouro")
    private String clientelogradouro;
    @Column(name = "clientenumero")
    private String clientenumero;
    @Column(name = "clientebairro")
    private String clientebairro;
    @Column(name = "clientecidade")
    private String clientecidade;
    @Column(name = "clienteestado")
    private String clienteestado;
    @Column(name = "clientecep")
    private String clientecep;
    @Column(name = "clientecpf")
    private String clientecpf;
    @Column(name = "clientepais")
    private String clientepais;
    @Column(name = "foneresidencial")
    private String foneresidencial;
    @Column(name = "fonecelular")
    private String fonecelular;
    @Column(name = "fonecomercial")
    private String fonecomercial;
    @Column(name = "profissao")
    private String profissao;
    @Column(name = "emailcliente")
    private String emailcliente;
    @Column(name = "escolaridade")
    private String escolaridade;
    @Column(name = "nomeUsuario")
    private String nomeUsuario;
    @Column(name = "NomeUnidade")
    private String nomeUnidade;
    @Column(name = "dataCambio")
    @Temporal(TemporalType.DATE)
    private Date dataCambio;
    @Column(name = "valorCambio")
    private Float valorCambio;
    @Column(name = "descricaoMoedas")
    private String descricaoMoedas;
    @Basic(optional = false)
    @Column(name = "idcambio")
    private int idcambio;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "idvendas")
    @Id
    private int idvendas;
    @Column(name = "Obstm")
    private String Obstm;
    @Column(name = "idcliente")
    private int idcliente;
    @Column(name = "idusuario")
    private int idusuario;
    @Column(name = "idUnidade")
    private int idUnidade;
    @Column(name = "habilitarsegundocurso")
    private String habilitarsegundocurso;
    
    
    
    
    
    
    

    public Viewvendascurso() {
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public String getObstm() {
        return Obstm;
    }

    public void setObstm(String Obstm) {
        this.Obstm = Obstm;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public int getIdUnidade() {
        return idUnidade;
    }

    public void setIdUnidade(int idUnidade) {
        this.idUnidade = idUnidade;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public String getHabilitarsegundocurso() {
        return habilitarsegundocurso;
    }

    public void setHabilitarsegundocurso(String habilitarsegundocurso) {
        this.habilitarsegundocurso = habilitarsegundocurso;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getIdcursos() {
        return idcursos;
    }

    public void setIdcursos(int idcursos) {
        this.idcursos = idcursos;
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

    public Integer getAulassemana() {
        return aulassemana;
    }

    public void setAulassemana(Integer aulassemana) {
        this.aulassemana = aulassemana;
    }

    public Integer getNumerosenamas() {
        return numerosenamas;
    }

    public void setNumerosenamas(Integer numerosenamas) {
        this.numerosenamas = numerosenamas;
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

    public String getTipoquarto() {
        return tipoquarto;
    }

    public void setTipoquarto(String tipoquarto) {
        this.tipoquarto = tipoquarto;
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

    public Date getDatachegada() {
        return datachegada;
    }

    public void setDatachegada(Date datachegada) {
        this.datachegada = datachegada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public String getFamiliacomcrianca() {
        return familiacomcrianca;
    }

    public void setFamiliacomcrianca(String familiacomcrianca) {
        this.familiacomcrianca = familiacomcrianca;
    }

    public String getTipoDuracao() {
        return tipoDuracao;
    }

    public void setTipoDuracao(String tipoDuracao) {
        this.tipoDuracao = tipoDuracao;
    }

    public String getFamiliacomanimais() {
        return familiacomanimais;
    }

    public void setFamiliacomanimais(String familiacomanimais) {
        this.familiacomanimais = familiacomanimais;
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

    public String getQuaisalergias() {
        return quaisalergias;
    }

    public void setQuaisalergias(String quaisalergias) {
        this.quaisalergias = quaisalergias;
    }

    public String getSolicitacoesespeciais() {
        return solicitacoesespeciais;
    }

    public void setSolicitacoesespeciais(String solicitacoesespeciais) {
        this.solicitacoesespeciais = solicitacoesespeciais;
    }

    public String getCaratovtm() {
        return caratovtm;
    }

    public void setCaratovtm(String caratovtm) {
        this.caratovtm = caratovtm;
    }

    public String getNumerocartaovtm() {
        return numerocartaovtm;
    }

    public void setNumerocartaovtm(String numerocartaovtm) {
        this.numerocartaovtm = numerocartaovtm;
    }

    public String getMoedacartaovtm() {
        return moedacartaovtm;
    }

    public void setMoedacartaovtm(String moedacartaovtm) {
        this.moedacartaovtm = moedacartaovtm;
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

    public String getPassagemaerea() {
        return passagemaerea;
    }

    public void setPassagemaerea(String passagemaerea) {
        this.passagemaerea = passagemaerea;
    }

    public String getObservacaopassagemaerea() {
        return observacaopassagemaerea;
    }

    public void setObservacaopassagemaerea(String observacaopassagemaerea) {
        this.observacaopassagemaerea = observacaopassagemaerea;
    }

    public String getVistoconsular() {
        return vistoconsular;
    }

    public void setVistoconsular(String vistoconsular) {
        this.vistoconsular = vistoconsular;
    }

    public Date getDataEntregadocumentosvistos() {
        return dataEntregadocumentosvistos;
    }

    public void setDataEntregadocumentosvistos(Date dataEntregadocumentosvistos) {
        this.dataEntregadocumentosvistos = dataEntregadocumentosvistos;
    }

    public String getObservacaovisto() {
        return observacaovisto;
    }

    public void setObservacaovisto(String observacaovisto) {
        this.observacaovisto = observacaovisto;
    }

    public String getNomecontatoemergencia() {
        return nomecontatoemergencia;
    }

    public void setNomecontatoemergencia(String nomecontatoemergencia) {
        this.nomecontatoemergencia = nomecontatoemergencia;
    }

    public String getFonecontatoemergencia() {
        return fonecontatoemergencia;
    }

    public void setFonecontatoemergencia(String fonecontatoemergencia) {
        this.fonecontatoemergencia = fonecontatoemergencia;
    }

    public String getEmalcontatoemergencia() {
        return emalcontatoemergencia;
    }

    public void setEmalcontatoemergencia(String emalcontatoemergencia) {
        this.emalcontatoemergencia = emalcontatoemergencia;
    }

    public String getRelacaocontatoemergencia() {
        return relacaocontatoemergencia;
    }

    public void setRelacaocontatoemergencia(String relacaocontatoemergencia) {
        this.relacaocontatoemergencia = relacaocontatoemergencia;
    }

    public Date getDataInscricaCurso() {
        return dataInscricaCurso;
    }

    public void setDataInscricaCurso(Date dataInscricaCurso) {
        this.dataInscricaCurso = dataInscricaCurso;
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

    public void setNivelIdioma(String nivelIdioma) {
        this.nivelIdioma = nivelIdioma;
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
