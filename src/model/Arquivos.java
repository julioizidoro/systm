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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "arquivos")
public class Arquivos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idarquivos")
    private Integer idarquivos;
    @Column(name = "dataInclusao")
    @Temporal(TemporalType.DATE)
    private Date dataInclusao;
    @Column(name = "nomeArquivo")
    private String nomeArquivo;
    @Column(name = "usuario_idusuario")
    private int usuario;
    @Column(name = "vendas_idvendas")
    private int venda;
    @Column(name = "tipoArquivo_idtipoArquivo")
    private int tipoArquivo;
    @Column(name = "observacao")
    private String observacao;
    
    
    

    public Arquivos() {
    }
    
    public Arquivos(Integer idarquivos) {
        this.idarquivos = idarquivos;
    }

    public Integer getIdarquivos() {
        return idarquivos;
    }

    public void setIdarquivos(Integer idarquivos) {
        this.idarquivos = idarquivos;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Date dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public int getVenda() {
        return venda;
    }

    public void setVenda(int venda) {
        this.venda = venda;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    
    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getTipoArquivo() {
        return tipoArquivo;
    }

    public void setTipoArquivo(int tipoArquivo) {
        this.tipoArquivo = tipoArquivo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idarquivos != null ? idarquivos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arquivos)) {
            return false;
        }
        Arquivos other = (Arquivos) object;
        if ((this.idarquivos == null && other.idarquivos != null) || (this.idarquivos != null && !this.idarquivos.equals(other.idarquivos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getNomeArquivo();
    }
    
}
