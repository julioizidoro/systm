/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import dao.ArquivosDao;
import java.sql.SQLException;
import java.util.List;
import model.Arquivos;
import model.Tipoarquivo;
import model.Tipoarquivousuario;
import model.view.Viewconsultaarquivo;
import model.view.Viewtipoarquivousuario;

/**
 *
 * @author Wolverine
 */
public class ArquivosFacade {
    
    ArquivosDao arquivosDao;
    
    public Arquivos salvar(Arquivos arquivo) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.salvar(arquivo);
    }
    
    public Arquivos consultar(int idArquivo) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.consultar(idArquivo);
    }
    
    public List<Viewconsultaarquivo> listar(String sql) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.listar(sql);
    }
    
    public void excluir(int idArquivo) throws SQLException{
        arquivosDao = new ArquivosDao();
        arquivosDao.excluir(idArquivo);
    }
    
    
    
    public List<Tipoarquivo> listarArquivos(String sql) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.listarArquivos(sql);
        
    }
    
    public Tipoarquivo salvar(Tipoarquivo tipo) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.salvar(tipo);
    }
    
    public Tipoarquivousuario salvar(Tipoarquivousuario tipo) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.salvar(tipo);
    }
    
    public List<Viewtipoarquivousuario> listarTipoUsuario(int idTipo) throws SQLException{
        arquivosDao = new ArquivosDao();
        return arquivosDao.listarTipoUsuario(idTipo);
    }
    
}
