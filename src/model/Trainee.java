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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "trainee")
public class Trainee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtrainee")
    private Integer idtrainee;
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
    @Size(max = 100)
    @Column(name = "possuiAlergias")
    private String possuiAlergias;
    @Size(max = 30)
    @Column(name = "controle")
    private String controle;
    @JoinColumn(name = "valorestrainee_idvalorestrainee", referencedColumnName = "idvalorestrainee")
    @ManyToOne(optional = false)
    private Valorestrainee valorestrainee;
    @Column(name = "vendas_idvendas")
    private int vendas;

    public Trainee() {
    }

    public Trainee(Integer idtrainee) {
        this.idtrainee = idtrainee;
    }

    public Integer getIdtrainee() {
        return idtrainee;
    }

    public void setIdtrainee(Integer idtrainee) {
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

    public String getPossuiAlergias() {
        return possuiAlergias;
    }

    public void setPossuiAlergias(String possuiAlergias) {
        this.possuiAlergias = possuiAlergias;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public Valorestrainee getValorestrainee() {
        return valorestrainee;
    }

    public void setValorestrainee(Valorestrainee valorestrainee) {
        this.valorestrainee = valorestrainee;
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
        hash += (idtrainee != null ? idtrainee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainee)) {
            return false;
        }
        Trainee other = (Trainee) object;
        if ((this.idtrainee == null && other.idtrainee != null) || (this.idtrainee != null && !this.idtrainee.equals(other.idtrainee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Trainee[ idtrainee=" + idtrainee + " ]";
    }
    
}
