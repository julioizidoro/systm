/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.swing.JOptionPane;
import model.Relanaliseconsultor;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class RelAnaliseConsultorDao {
    
    private EntityManager manager;
    
    public Relanaliseconsultor salvar(Relanaliseconsultor relanaliseconsultor) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        relanaliseconsultor = manager.merge(relanaliseconsultor);
        //fechando uma transação
        manager.getTransaction().commit();
        return relanaliseconsultor;
    }
    
    public void apagar(String local, String porta, String senha, String banco, String usuario) throws IOException {
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexao, usuario, senha);
            com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) conn.createStatement();
            stm.execute("USE systm"); 
            String sql = "Drop table relAnaliseConsultor";
            rs = stm.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(RelAnaliseConsultorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crair(String local, String porta, String senha, String banco, String usuario) throws IOException {
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
            com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexao, usuario, senha);
            com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) conn.createStatement();
            stm.execute("USE systm"); 
            String sql = "CREATE TABLE `relanaliseconsultor` (\r\n" +
                         "`idrelAnaliseConsultor` int(11) NOT NULL AUTO_INCREMENT,\r\n" +
                         "`nomeConsultor` varchar(100) DEFAULT NULL,\r\n" +
                         "`unidade` varchar(100) DEFAULT NULL,\r\n" +
                         "`numeroAtendimentos` int(11) DEFAULT NULL,\r\n"+
                         "`numeroVendasFechadas` int(11) DEFAULT NULL,\r\n"+
                         "PRIMARY KEY (`idrelAnaliseConsultor`)\r\n" +
                         ") ENGINE=InnoDB DEFAULT CHARSET=utf8;";
            rs = stm.executeQuery(sql);
        } catch (Exception ex) {
            Logger.getLogger(RelAnaliseConsultorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
