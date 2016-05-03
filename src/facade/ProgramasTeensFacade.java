/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ProgramasTeensDao;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import model.Controleprogramasteens;
import model.Programasteens;
import model.view.Viewcontroleprogramasteens;


/**
 *
 * @author Wolverine
 */
public class ProgramasTeensFacade {
    
    ProgramasTeensDao programasTeenssDao;
    
    public Programasteens salvar(Programasteens programasTeens) throws SQLException{
        programasTeenssDao = new ProgramasTeensDao();
        return programasTeenssDao.salvar(programasTeens);
    }
    
   
    public Programasteens consultarProgramasteens(int idVenda) throws SQLException {
        programasTeenssDao = new ProgramasTeensDao();
        return programasTeenssDao.consultarProgramasTeens(idVenda);
    }
    
    public void excluir(int idCurso) throws SQLException{
        programasTeenssDao= new ProgramasTeensDao();
        programasTeenssDao.excluir(idCurso);
    }
    
    public Controleprogramasteens salvar(Controleprogramasteens controle) throws SQLException{
        programasTeenssDao= new ProgramasTeensDao();
        return programasTeenssDao.salvar(controle);
    }
    
    public void excluirControleProgramasTeens(Controleprogramasteens controle) throws SQLException{
        programasTeenssDao= new ProgramasTeensDao();
        programasTeenssDao.excluirControleProgramasTeens(controle);
    }
    
    public Controleprogramasteens consultarControleProgramasTeens(int idVendas) throws SQLException {
        programasTeenssDao= new ProgramasTeensDao();
        return programasTeenssDao.consultarControleProgramasTeens(idVendas);
    }
    
    public List<Viewcontroleprogramasteens> consultaControleProgramasTeens(String sql) throws SQLException{
        programasTeenssDao= new ProgramasTeensDao();
        return programasTeenssDao.consultaControleProgramasTeens(sql);
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        programasTeenssDao= new ProgramasTeensDao();
        return programasTeenssDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
    public List<Controleprogramasteens> consultarControleProgramasTeensList(int idVendas) throws SQLException {
        programasTeenssDao = new ProgramasTeensDao();
        return programasTeenssDao.consultarControleProgramasTeensList(idVendas);
    }
    
}
