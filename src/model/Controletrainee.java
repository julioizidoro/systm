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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import model.Vendas;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "controletrainee")
@NamedQueries({
    @NamedQuery(name = "Controletrainee.findAll", query = "SELECT c FROM Controletrainee c")})
public class Controletrainee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcontroletrainee")
    private Integer idcontroletrainee;
    @Size(max = 3)
    @Column(name = "resume")
    private String resume;
    @Size(max = 100)
    @Column(name = "empregador1")
    private String empregador1;
    @Size(max = 100)
    @Column(name = "empregador2")
    private String empregador2;
    @Size(max = 100)
    @Column(name = "empregador3")
    private String empregador3;
    @Column(name = "documentacao")
    private String documentacao;
    @Column(name = "status")
    private String status;
    @Column(name = "docanexado")
    private String docanexado;
    @Size(max = 3)
    @Column(name = "trainingplain")
    private String trainingplain;
    @Size(max = 3)
    @Column(name = "vistos")
    private String vistos;
    @Size(max = 3)
    @Column(name = "colocacao")
    private String colocacao;
    @Size(max = 3)
    @Column(name = "orientacao")
    private String orientacao;
    @Column(name = "dataembarque")
    @Temporal(TemporalType.DATE)
    private Date dataembarque;
    @Size(max = 50)
    @Column(name = "situacao")
    private String situacao;
    @JoinColumn(name = "vendas_idvendas", referencedColumnName = "idvendas")
    @ManyToOne(optional = false)
    private Vendas vendas;

    public Controletrainee() {
    }

    public Controletrainee(Integer idcontroletrainee) {
        this.idcontroletrainee = idcontroletrainee;
    }

    public Integer getIdcontroletrainee() {
        return idcontroletrainee;
    }

    public void setIdcontroletrainee(Integer idcontroletrainee) {
        this.idcontroletrainee = idcontroletrainee;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public String getEmpregador1() {
        return empregador1;
    }

    public void setEmpregador1(String empregador1) {
        this.empregador1 = empregador1;
    }

    public String getEmpregador2() {
        return empregador2;
    }

    public String getColocacao() {
        return colocacao;
    }

    public void setColocacao(String colocacao) {
        this.colocacao = colocacao;
    }

    public void setEmpregador2(String empregador2) {
        this.empregador2 = empregador2;
    }

    public String getEmpregador3() {
        return empregador3;
    }

    public void setEmpregador3(String empregador3) {
        this.empregador3 = empregador3;
    }

    public String getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDocanexado() {
        return docanexado;
    }

    public void setDocanexado(String docanexado) {
        this.docanexado = docanexado;
    }

    


    public String getTrainingplain() {
        return trainingplain;
    }

    public void setTrainingplain(String trainingplain) {
        this.trainingplain = trainingplain;
    }

    public String getVistos() {
        return vistos;
    }

    public void setVistos(String vistos) {
        this.vistos = vistos;
    }

    public String getOrientacao() {
        return orientacao;
    }

    public void setOrientacao(String orientacao) {
        this.orientacao = orientacao;
    }

    public Date getDataembarque() {
        return dataembarque;
    }

    public void setDataembarque(Date dataembarque) {
        this.dataembarque = dataembarque;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontroletrainee != null ? idcontroletrainee.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Controletrainee)) {
            return false;
        }
        Controletrainee other = (Controletrainee) object;
        if ((this.idcontroletrainee == null && other.idcontroletrainee != null) || (this.idcontroletrainee != null && !this.idcontroletrainee.equals(other.idcontroletrainee))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.view.Controletrainee[ idcontroletrainee=" + idcontroletrainee + " ]";
    }
    
}
