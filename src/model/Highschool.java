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
@Table(name = "highschool")
public class Highschool implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhighschool")
    private Integer idhighschool;
    @Column(name = "nomeIrmao01")
    private String nomeIrmao01;
    @Column(name = "dnIrmao01")
    @Temporal(TemporalType.DATE)
    private Date dnIrmao01;
    @Column(name = "nomeIrmao02")
    private String nomeIrmao02;
    @Column(name = "dnIrmao02")
    @Temporal(TemporalType.DATE)
    private Date dnIrmao02;
    @Column(name = "nomeirmao03")
    private String nomeirmao03;
    @Column(name = "dnIrmao03")
    @Temporal(TemporalType.DATE)
    private Date dnIrmao03;
    @Column(name = "nomeEscola")
    private String nomeEscola;
    @Column(name = "serie")
    private String serie;
    @Column(name = "cidadeEscola")
    private String cidadeEscola;
    @Column(name = "estadoEscola")
    private String estadoEscola;
    @Column(name = "reprovadoEscola")
    private String reprovadoEscola;
    @Column(name = "quandoReprovado")
    private String quandoReprovado;
    @Column(name = "idioma01")
    private String idioma01;
    @Column(name = "escolaIdioma01")
    private String escolaIdioma01;
    @Column(name = "tempoIdioma01")
    private String tempoIdioma01;
    @Column(name = "nivelIdioma01")
    private String nivelIdioma01;
    @Column(name = "idioma02")
    private String idioma02;
    @Column(name = "escolaIdioma02")
    private String escolaIdioma02;
    @Column(name = "tempoIdioma02")
    private String tempoIdioma02;
    @Column(name = "nivelIdioma02")
    private String nivelIdioma02;
    @Column(name = "idioma03")
    private String idioma03;
    @Column(name = "escolaIdioma03")
    private String escolaIdioma03;
    @Column(name = "tempoIdioma03")
    private String tempoIdioma03;
    @Column(name = "nivelIdioma03")
    private String nivelIdioma03;
    @Column(name = "paisIntercambio")
    private String paisIntercambio;
    @Column(name = "escolaIntercambio")
    private String escolaIntercambio;
    @Column(name = "duracaoIntercambio")
    private String duracaoIntercambio;
    @Column(name = "dataInicio")
    private String dataInicio;
    @Column(name = "nomeContatoEmergencia")
    private String nomeContatoEmergencia;
    @Column(name = "foneContatoEmergencia")
    private String foneContatoEmergencia;
    @Column(name = "emailConatoEmergencia")
    private String emailConatoEmergencia;
    @Column(name = "relacaoContatoEmergencia")
    private String relacaoContatoEmergencia;
    @Column(name = "vendas_idvendas")
    private int vendas;
    @Column(name = "fornecedor_idfornecedor")
    private int fornecedor;
    @Column(name = "obstm")
    private String obstm;
    @Column(name = "valoresHighSchool_idvaloresHighSchool")
    private int valoresHighSchool;
    @Column(name = "controle")
    private String controle;
    @Column(name = "cpfpai")
    private String cpfpai;
    @Column(name = "rgpai")
    private String rgpai;
    @Column(name = "datanascimentopai")
    @Temporal(TemporalType.DATE)
    private Date datanascimentopai;
    @Column(name = "cpfmae")
    private String cpfmae;
    @Column(name = "rgmae")
    private String rgmae;
    @Column(name = "datanascimentomae")
    @Temporal(TemporalType.DATE)
    private Date datanascimentomae;
    
    
    public Highschool() {
    }

    public Highschool(Integer idhighschool) {
        this.idhighschool = idhighschool;
    }

    public Integer getIdhighschool() {
        return idhighschool;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public void setIdhighschool(Integer idhighschool) {
        this.idhighschool = idhighschool;
    }

    public String getNomeIrmao01() {
        return nomeIrmao01;
    }

    public int getVendas() {
        return vendas;
    }

    public String getObstm() {
        return obstm;
    }

    public String getCpfpai() {
        return cpfpai;
    }

    public void setCpfpai(String cpfpai) {
        this.cpfpai = cpfpai;
    }

    public String getRgpai() {
        return rgpai;
    }

    public void setRgpai(String rgpai) {
        this.rgpai = rgpai;
    }

    
    public String getCpfmae() {
        return cpfmae;
    }

    public void setCpfmae(String cpfmae) {
        this.cpfmae = cpfmae;
    }

    public String getRgmae() {
        return rgmae;
    }

    public void setRgmae(String rgmae) {
        this.rgmae = rgmae;
    }

    public Date getDatanascimentopai() {
        return datanascimentopai;
    }

    public void setDatanascimentopai(Date datanascimentopai) {
        this.datanascimentopai = datanascimentopai;
    }

    public Date getDatanascimentomae() {
        return datanascimentomae;
    }

    public void setDatanascimentomae(Date datanascimentomae) {
        this.datanascimentomae = datanascimentomae;
    }


    public int getValoresHighSchool() {
        return valoresHighSchool;
    }

    public void setValoresHighSchool(int valoresHighSchool) {
        this.valoresHighSchool = valoresHighSchool;
    }

    public void setObstm(String obstm) {
        this.obstm = obstm;
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

    public void setNomeIrmao01(String nomeIrmao01) {
        this.nomeIrmao01 = nomeIrmao01;
    }

    public Date getDnIrmao01() {
        return dnIrmao01;
    }

    public void setDnIrmao01(Date dnIrmao01) {
        this.dnIrmao01 = dnIrmao01;
    }

    public String getNomeIrmao02() {
        return nomeIrmao02;
    }

    public void setNomeIrmao02(String nomeIrmao02) {
        this.nomeIrmao02 = nomeIrmao02;
    }

    public Date getDnIrmao02() {
        return dnIrmao02;
    }

    public void setDnIrmao02(Date dnIrmao02) {
        this.dnIrmao02 = dnIrmao02;
    }

    public String getNomeirmao03() {
        return nomeirmao03;
    }

    public void setNomeirmao03(String nomeirmao03) {
        this.nomeirmao03 = nomeirmao03;
    }

    public Date getDnIrmao03() {
        return dnIrmao03;
    }

    public void setDnIrmao03(Date dnIrmao03) {
        this.dnIrmao03 = dnIrmao03;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCidadeEscola() {
        return cidadeEscola;
    }

    public void setCidadeEscola(String cidadeEscola) {
        this.cidadeEscola = cidadeEscola;
    }

    public String getEstadoEscola() {
        return estadoEscola;
    }

    public void setEstadoEscola(String estadoEscola) {
        this.estadoEscola = estadoEscola;
    }

    public String getReprovadoEscola() {
        return reprovadoEscola;
    }

    public void setReprovadoEscola(String reprovadoEscola) {
        this.reprovadoEscola = reprovadoEscola;
    }

    public String getQuandoReprovado() {
        return quandoReprovado;
    }

    public void setQuandoReprovado(String quandoReprovado) {
        this.quandoReprovado = quandoReprovado;
    }

    public String getIdioma01() {
        return idioma01;
    }

    public void setIdioma01(String idioma01) {
        this.idioma01 = idioma01;
    }

    public String getEscolaIdioma01() {
        return escolaIdioma01;
    }

    public void setEscolaIdioma01(String escolaIdioma01) {
        this.escolaIdioma01 = escolaIdioma01;
    }

    public String getTempoIdioma01() {
        return tempoIdioma01;
    }

    public void setTempoIdioma01(String tempoIdioma01) {
        this.tempoIdioma01 = tempoIdioma01;
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

    public String getEscolaIdioma02() {
        return escolaIdioma02;
    }

    public void setEscolaIdioma02(String escolaIdioma02) {
        this.escolaIdioma02 = escolaIdioma02;
    }

    public String getTempoIdioma02() {
        return tempoIdioma02;
    }

    public void setTempoIdioma02(String tempoIdioma02) {
        this.tempoIdioma02 = tempoIdioma02;
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

    public String getEscolaIdioma03() {
        return escolaIdioma03;
    }

    public void setEscolaIdioma03(String escolaIdioma03) {
        this.escolaIdioma03 = escolaIdioma03;
    }

    public String getTempoIdioma03() {
        return tempoIdioma03;
    }

    public void setTempoIdioma03(String tempoIdioma03) {
        this.tempoIdioma03 = tempoIdioma03;
    }

    public String getNivelIdioma03() {
        return nivelIdioma03;
    }

    public void setNivelIdioma03(String nivelIdioma03) {
        this.nivelIdioma03 = nivelIdioma03;
    }

    public String getPaisIntercambio() {
        return paisIntercambio;
    }

    public void setPaisIntercambio(String paisIntercambio) {
        this.paisIntercambio = paisIntercambio;
    }

    public String getEscolaIntercambio() {
        return escolaIntercambio;
    }

    public void setEscolaIntercambio(String escolaIntercambio) {
        this.escolaIntercambio = escolaIntercambio;
    }

    public String getDuracaoIntercambio() {
        return duracaoIntercambio;
    }

    public void setDuracaoIntercambio(String duracaoIntercambio) {
        this.duracaoIntercambio = duracaoIntercambio;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
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

    public String getEmailConatoEmergencia() {
        return emailConatoEmergencia;
    }

    public void setEmailConatoEmergencia(String emailConatoEmergencia) {
        this.emailConatoEmergencia = emailConatoEmergencia;
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
        hash += (idhighschool != null ? idhighschool.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Highschool)) {
            return false;
        }
        Highschool other = (Highschool) object;
        if ((this.idhighschool == null && other.idhighschool != null) || (this.idhighschool != null && !this.idhighschool.equals(other.idhighschool))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Highschool[ idhighschool=" + idhighschool + " ]";
    }
    
}
