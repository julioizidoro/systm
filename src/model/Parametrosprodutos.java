/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "parametrosprodutos")
public class Parametrosprodutos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idparametrosProdutos")
    private Integer idparametrosProdutos;
    @Column(name = "visto")
    private Integer visto;
    @Column(name = "cursos")
    private Integer cursos;
    @Column(name = "seguroPrivado")
    private Integer seguroPrivado;
    @Column(name = "vistoOrcamento")
    private Integer vistoOrcamento;
    @Column(name = "seguroOrcamento")
    private Integer seguroOrcamento;
    @Column(name = "highSchool")
    private Integer highSchool;
    @Column(name = "pacotes")
    private Integer pacotes;
    @Column(name = "programasTeens")
    private Integer programasTeens;
    @Column(name = "passagem")
    private Integer passagem;
    @Column(name = "passagemTaxa")
    private Integer passagemTaxa;
    @Column(name = "passagemTaxaTM")
    private Integer passagemTaxaTM;
    @Column(name = "ladies")
    private Integer ladies;
    @Column(name = "aupair")
    private Integer aupair;
    @Column(name = "work")
    private Integer work;
    @Column(name = "fornecedor")
    private int fornecedor;
    @Column(name = "emailCambio01")
    private String emailCambio01;
    @Column(name = "emailCambio02")
    private String emailCambio02;
    @Column(name = "emailCambio03")
    private String emailCambio03;
    @Column(name = "passagemTarifa")
    private int passagemTarifa;
    @Column(name = "seguroGovernamental")
    private int seguroGovernamental;
    @Column(name = "valorTaxaTM")
    private float valorTaxaTM;
    @Column(name = "trainee")
    private int trainee;
    @Column(name = "voluntariado")
    private int voluntariado;
    @Column(name = "emailCotacao")
    private String emailCotacao;
    @Column(name = "descontomatriz")
    private int descontomatriz;
    @Column(name = "idplanocontas")
    private int idplanocontas;
    @Column(name = "cartao01")
    private float cartao01;
    @Column(name = "cartao02")
    private float cartao02;
    @Column(name = "cartao07")
    private float cartao07;
    @Column(name = "boletos")
    private float boletos;
    @Column(name = "juros")
    private float juros;
    @Column(name = "cartaodebito")
    private float cartaodebito;
    @Column(name = "descontoloja")
    private int descontoloja;
    @Column(name = "percentualremessa")
    private float percentualremessa;
    @Column(name = "remessaativa")
    private boolean remessaativa;
    @Column(name = "produtoremessa")
    private int produtoremessa;
    
    public Parametrosprodutos() {
    }

    public Parametrosprodutos(Integer idparametrosProdutos) {
        this.idparametrosProdutos = idparametrosProdutos;
    }

    public Integer getIdparametrosProdutos() {
        return idparametrosProdutos;
    }

    public String getEmailCambio01() {
        return emailCambio01;
    }

    public String getEmailCotacao() {
        return emailCotacao;
    }

    public int getDescontomatriz() {
        return descontomatriz;
    }

    public void setDescontomatriz(int descontomatriz) {
        this.descontomatriz = descontomatriz;
    }


    public void setEmailCotacao(String emailCotacao) {
        this.emailCotacao = emailCotacao;
    }

    public void setEmailCambio01(String emailCambio01) {
        this.emailCambio01 = emailCambio01;
    }

    public String getEmailCambio02() {
        return emailCambio02;
    }

    public void setEmailCambio02(String emailCambio02) {
        this.emailCambio02 = emailCambio02;
    }

    public int getTrainee() {
        return trainee;
    }

    public void setTrainee(int trainee) {
        this.trainee = trainee;
    }

    public int getVoluntariado() {
        return voluntariado;
    }

    public void setVoluntariado(int voluntariado) {
        this.voluntariado = voluntariado;
    }


    public String getEmailCambio03() {
        return emailCambio03;
    }

    public int getPassagemTarifa() {
        return passagemTarifa;
    }

    public float getValorTaxaTM() {
        return valorTaxaTM;
    }

    public void setValorTaxaTM(float valorTaxaTM) {
        this.valorTaxaTM = valorTaxaTM;
    }

    public void setPassagemTarifa(int passagemTarifa) {
        this.passagemTarifa = passagemTarifa;
    }

    public void setEmailCambio03(String emailCambio03) {
        this.emailCambio03 = emailCambio03;
    }

    public int getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(int fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setIdparametrosProdutos(Integer idparametrosProdutos) {
        this.idparametrosProdutos = idparametrosProdutos;
    }

    public Integer getWork() {
        return work;
    }

    public void setWork(Integer work) {
        this.work = work;
    }

    public Integer getVisto() {
        return visto;
    }

    public Integer getHighSchool() {
        return highSchool;
    }

    public Integer getLadies() {
        return ladies;
    }

    public void setLadies(Integer ladies) {
        this.ladies = ladies;
    }

    public Integer getAupair() {
        return aupair;
    }

    public void setAupair(Integer aupair) {
        this.aupair = aupair;
    }

    public void setHighSchool(Integer highSchool) {
        this.highSchool = highSchool;
    }

    public void setVisto(Integer visto) {
        this.visto = visto;
    }

    public Integer getPacotes() {
        return pacotes;
    }

    public Integer getPassagem() {
        return passagem;
    }

    public void setPassagem(Integer passagem) {
        this.passagem = passagem;
    }

    public Integer getPassagemTaxa() {
        return passagemTaxa;
    }

    public void setPassagemTaxa(Integer passagemTaxa) {
        this.passagemTaxa = passagemTaxa;
    }

    public Integer getPassagemTaxaTM() {
        return passagemTaxaTM;
    }

    public void setPassagemTaxaTM(Integer passagemTaxaTM) {
        this.passagemTaxaTM = passagemTaxaTM;
    }

    public void setPacotes(Integer pacotes) {
        this.pacotes = pacotes;
    }

    public Integer getProgramasTeens() {
        return programasTeens;
    }

    public void setProgramasTeens(Integer programasTeens) {
        this.programasTeens = programasTeens;
    }

    public Integer getCursos() {
        return cursos;
    }

    public void setCursos(Integer cursos) {
        this.cursos = cursos;
    }

    public Integer getSeguroPrivado() {
        return seguroPrivado;
    }

    public void setSeguroPrivado(Integer seguroPrivado) {
        this.seguroPrivado = seguroPrivado;
    }

    public int getSeguroGovernamental() {
        return seguroGovernamental;
    }

    public void setSeguroGovernamental(int seguroGovernamental) {
        this.seguroGovernamental = seguroGovernamental;
    }

    public int getIdplanocontas() {
        return idplanocontas;
    }

    public void setIdplanocontas(int idplanocontas) {
        this.idplanocontas = idplanocontas;
    }

    

    public Integer getVistoOrcamento() {
        return vistoOrcamento;
    }

    public void setVistoOrcamento(Integer vistoOrcamento) {
        this.vistoOrcamento = vistoOrcamento;
    }

    public Integer getSeguroOrcamento() {
        return seguroOrcamento;
    }

    public void setSeguroOrcamento(Integer seguroOrcamento) {
        this.seguroOrcamento = seguroOrcamento;
    }

    public float getCartao01() {
        return cartao01;
    }

    public void setCartao01(float cartao01) {
        this.cartao01 = cartao01;
    }

    public float getCartao02() {
        return cartao02;
    }

    public void setCartao02(float cartao02) {
        this.cartao02 = cartao02;
    }

    public float getCartao07() {
        return cartao07;
    }

    public void setCartao07(float cartao07) {
        this.cartao07 = cartao07;
    }

    public float getBoletos() {
        return boletos;
    }

    public void setBoletos(float boletos) {
        this.boletos = boletos;
    }

    

    public float getJuros() {
        return juros;
    }

    public void setJuros(float juros) {
        this.juros = juros;
    }

    public float getCartaodebito() {
        return cartaodebito;
    }

    public void setCartaodebito(float cartaodebito) {
        this.cartaodebito = cartaodebito;
    }

    public int getDescontoloja() {
        return descontoloja;
    }

    public void setDescontoloja(int descontoloja) {
        this.descontoloja = descontoloja;
    }

    public float getPercentualremessa() {
        return percentualremessa;
    }

    public void setPercentualremessa(float percentualremessa) {
        this.percentualremessa = percentualremessa;
    }

    public boolean isRemessaativa() {
        return remessaativa;
    }

    public void setRemessaativa(boolean remessaativa) {
        this.remessaativa = remessaativa;
    }

    public int getProdutoremessa() {
        return produtoremessa;
    }

    public void setProdutoremessa(int produtoremessa) {
        this.produtoremessa = produtoremessa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idparametrosProdutos != null ? idparametrosProdutos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Parametrosprodutos)) {
            return false;
        }
        Parametrosprodutos other = (Parametrosprodutos) object;
        if ((this.idparametrosProdutos == null && other.idparametrosProdutos != null) || (this.idparametrosProdutos != null && !this.idparametrosProdutos.equals(other.idparametrosProdutos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Parametrosprodutos[ idparametrosProdutos=" + idparametrosProdutos + " ]";
    }
    
}
