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
@Table(name = "viewconsultaarquivo")
public class Viewconsultaarquivo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idarquivos")
    @Id
    private int idarquivos;
    @Column(name = "dataInclusao")
    @Temporal(TemporalType.DATE)
    private Date dataInclusao;
    @Column(name = "nomeArquivo")
    private String nomeArquivo;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "vendas_idvendas")
    private int vendasIdvendas;
    @Basic(optional = false)
    @Column(name = "usuario_idusuario")
    private int usuarioIdusuario;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "unidade")
    private String unidade;

    public Viewconsultaarquivo() {
    }

    public int getIdarquivos() {
        return idarquivos;
    }

    public void setIdarquivos(int idarquivos) {
        this.idarquivos = idarquivos;
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

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVendasIdvendas() {
        return vendasIdvendas;
    }

    public void setVendasIdvendas(int vendasIdvendas) {
        this.vendasIdvendas = vendasIdvendas;
    }

    public int getUsuarioIdusuario() {
        return usuarioIdusuario;
    }

    public void setUsuarioIdusuario(int usuarioIdusuario) {
        this.usuarioIdusuario = usuarioIdusuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
