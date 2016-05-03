/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "historicocursos")
public class Historicocursos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idhistoricocursos")
    private Integer idhistoricocursos;
    @Column(name = "data")
    @Temporal(TemporalType.DATE)
    private Date data;
    @JoinColumn(name = "vendas_idvendas", referencedColumnName = "idvendas")
    @ManyToOne(optional = false)
    private Vendas vendas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "historicocursos")
    private List<Itensalteradoscurso> itensalteradoscursoList;

    public Historicocursos() {
    }

    public Historicocursos(Integer idhistoricocursos) {
        this.idhistoricocursos = idhistoricocursos;
    }

    public Integer getIdhistoricocursos() {
        return idhistoricocursos;
    }

    public void setIdhistoricocursos(Integer idhistoricocursos) {
        this.idhistoricocursos = idhistoricocursos;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Vendas getVendas() {
        return vendas;
    }

    public void setVendas(Vendas vendas) {
        this.vendas = vendas;
    }

    public List<Itensalteradoscurso> getItensalteradoscursoList() {
        return itensalteradoscursoList;
    }

    public void setItensalteradoscursoList(List<Itensalteradoscurso> itensalteradoscursoList) {
        this.itensalteradoscursoList = itensalteradoscursoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idhistoricocursos != null ? idhistoricocursos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Historicocursos)) {
            return false;
        }
        Historicocursos other = (Historicocursos) object;
        if ((this.idhistoricocursos == null && other.idhistoricocursos != null) || (this.idhistoricocursos != null && !this.idhistoricocursos.equals(other.idhistoricocursos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Historicocursos[ idhistoricocursos=" + idhistoricocursos + " ]";
    }
    
}
