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
@Table(name = "relanaliseconsultor")
public class Relanaliseconsultor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrelAnaliseConsultor")
    private Integer idrelAnaliseConsultor;
    @Column(name = "nomeConsultor")
    private String nomeConsultor;
    @Column(name = "unidade")
    private String unidade;
    @Column(name = "numeroAtendimentos")
    private Integer numeroAtendimentos;
    @Column(name = "numeroVendasFechadas")
    private Integer numeroVendasFechadas;

    public Relanaliseconsultor() {
    }

    public Relanaliseconsultor(Integer idrelAnaliseConsultor) {
        this.idrelAnaliseConsultor = idrelAnaliseConsultor;
    }

    public Integer getIdrelAnaliseConsultor() {
        return idrelAnaliseConsultor;
    }

    public void setIdrelAnaliseConsultor(Integer idrelAnaliseConsultor) {
        this.idrelAnaliseConsultor = idrelAnaliseConsultor;
    }

    public String getNomeConsultor() {
        return nomeConsultor;
    }

    public void setNomeConsultor(String nomeConsultor) {
        this.nomeConsultor = nomeConsultor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public Integer getNumeroAtendimentos() {
        return numeroAtendimentos;
    }

    public void setNumeroAtendimentos(Integer numeroAtendimentos) {
        this.numeroAtendimentos = numeroAtendimentos;
    }

    public Integer getNumeroVendasFechadas() {
        return numeroVendasFechadas;
    }

    public void setNumeroVendasFechadas(Integer numeroVendasFechadas) {
        this.numeroVendasFechadas = numeroVendasFechadas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrelAnaliseConsultor != null ? idrelAnaliseConsultor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relanaliseconsultor)) {
            return false;
        }
        Relanaliseconsultor other = (Relanaliseconsultor) object;
        if ((this.idrelAnaliseConsultor == null && other.idrelAnaliseConsultor != null) || (this.idrelAnaliseConsultor != null && !this.idrelAnaliseConsultor.equals(other.idrelAnaliseConsultor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Relanaliseconsultor[ idrelAnaliseConsultor=" + idrelAnaliseConsultor + " ]";
    }
    
}
