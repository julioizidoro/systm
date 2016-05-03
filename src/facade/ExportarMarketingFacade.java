/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.ExportarMarketingDao;
import java.io.IOException;
import java.sql.ResultSet;

/**
 *
 * @author Wolverine
 */
public class ExportarMarketingFacade {
    
    ExportarMarketingDao exportarMarketingDao;
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        exportarMarketingDao = new ExportarMarketingDao();
        return exportarMarketingDao.ExportarExcel(nomeRelatorio, local, porta, senha, banco, usuario, caminhoSalvarExcel, idUnidade);
    }
    
}
