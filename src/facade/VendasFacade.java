/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.VendasDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Vendas;
import model.view.Viewvendascurso;
import model.view.Viewvendashighschool;
import model.view.Viewvendasprogramasteens;
import model.view.Viewvendastrainee;
import model.view.Viewvendasvoluntariado;




/**
 *
 * @author Wolverine
 */
public class VendasFacade {
    
    VendasDao vendasDao;
    
    public Vendas salvar(Vendas venda) throws SQLException{
        vendasDao = new  VendasDao();
        return vendasDao.salvar(venda);
    }
    
    public Vendas consultarVendas(int idVenda) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.consultarVendas(idVenda);
    }
    
    public List<Viewvendascurso> listaViewVendasCursos(String sql) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.listaViewVendasCursos(sql);
    }
    
    public List<Viewvendashighschool> listaViewVendasHighSchool(String sql) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.listaViewVendasHighSchool(sql);
    }
    
    public List<Viewvendasprogramasteens> listaViewVendasProgramasTeens(String sql) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.listaViewVendasProgramasTeens(sql);
    }
    
    public void excluir(int idVenda) throws SQLException{
        vendasDao = new VendasDao();
        vendasDao.excluir(idVenda);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        vendasDao = new VendasDao();
        return vendasDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, sql);
    }
    
    public List<Viewvendasvoluntariado> listaViewVendasVoluntariado(String sql) throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.listaViewVendasVoluntariado(sql);
    }
    public List<Viewvendastrainee> listaViewVendasTrainee(String sql) throws SQLException{
        vendasDao= new VendasDao();
        return  vendasDao.listaViewVendasTrainee(sql);
    }
    
    public List<Vendas> lista() throws SQLException{
        vendasDao = new VendasDao();
        return vendasDao.lista();
    }
}
