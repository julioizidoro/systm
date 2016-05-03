/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.view;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Wolverine
 */
@Entity
@Table(name = "viewtipoarquivousuario")
public class Viewtipoarquivousuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "idtipoArquivoUsuario")
    @Id
    private int idtipoArquivoUsuario;
    @Basic(optional = false)
    @Column(name = "tipoArquivo_idtipoArquivo")
    private int tipoArquivoidtipoArquivo;
    @Column(name = "nome")
    private String nome;
    @Column(name = "email")
    private String email;

    public Viewtipoarquivousuario() {
    }

    public int getIdtipoArquivoUsuario() {
        return idtipoArquivoUsuario;
    }

    public void setIdtipoArquivoUsuario(int idtipoArquivoUsuario) {
        this.idtipoArquivoUsuario = idtipoArquivoUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTipoArquivoidtipoArquivo() {
        return tipoArquivoidtipoArquivo;
    }

    public void setTipoArquivoidtipoArquivo(int tipoArquivoidtipoArquivo) {
        this.tipoArquivoidtipoArquivo = tipoArquivoidtipoArquivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
