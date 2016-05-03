/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;
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

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "grupoacesso")
public class Grupoacesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idgrupoAcesso")
    private Integer idgrupoAcesso;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "acesso_idacesso")
    private int acesso;
    
    public Grupoacesso() {
    }

    public Grupoacesso(Integer idgrupoAcesso) {
        this.idgrupoAcesso = idgrupoAcesso;
    }

    public Integer getIdgrupoAcesso() {
        return idgrupoAcesso;
    }

    public void setIdgrupoAcesso(Integer idgrupoAcesso) {
        this.idgrupoAcesso = idgrupoAcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAcesso() {
        return acesso;
    }

    public void setAcesso(int acesso) {
        this.acesso = acesso;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupoAcesso != null ? idgrupoAcesso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupoacesso)) {
            return false;
        }
        Grupoacesso other = (Grupoacesso) object;
        if ((this.idgrupoAcesso == null && other.idgrupoAcesso != null) || (this.idgrupoAcesso != null && !this.idgrupoAcesso.equals(other.idgrupoAcesso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getDescricao();
    }

}
