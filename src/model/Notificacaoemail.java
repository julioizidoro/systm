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
@Table(name = "notificacaoemail")
public class Notificacaoemail implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idnotificacaoEmail")
    private Integer idnotificacaoEmail;
    @Column(name = "tipoAviso")
    private String tipoAviso;
    @Column(name = "produtos_idprodutos")
    private int produtos;
    @Column(name = "usuario_idusuario")
    private int usuario;

    public Notificacaoemail() {
    }

    public Integer getIdnotificacaoEmail() {
        return idnotificacaoEmail;
    }

    public void setIdnotificacaoEmail(Integer idnotificacaoEmail) {
        this.idnotificacaoEmail = idnotificacaoEmail;
    }


    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public String getTipoAviso() {
        return tipoAviso;
    }

    public void setTipoAviso(String tipoAviso) {
        this.tipoAviso = tipoAviso;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idnotificacaoEmail != null ? idnotificacaoEmail.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Notificacaoemail)) {
            return false;
        }
        Notificacaoemail other = (Notificacaoemail) object;
        if ((this.idnotificacaoEmail == null && other.idnotificacaoEmail != null) || (this.idnotificacaoEmail != null && !this.idnotificacaoEmail.equals(other.idnotificacaoEmail))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Notificaoemail[ idnotificaoEmail=" + idnotificacaoEmail + " ]";
    }
    
}
