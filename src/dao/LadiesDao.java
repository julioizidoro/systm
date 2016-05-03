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
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.Controleladies;
import model.Ladies;
import model.view.Viewcontroleladies;
import model.view.Viewvendasladies;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class LadiesDao {
    
    private EntityManager manager;
    
    public Ladies salvar(Ladies ladies) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        ladies = manager.merge(ladies);
        //fechando uma transação
        manager.getTransaction().commit();
        return ladies;
    }
    
   
    
    public Ladies consultarLadies(int idVenda) throws SQLException {
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery("select l from Ladies l where l.vendas=" + idVenda);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Ladies) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idLadies) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Ladies ladies = manager.find(Ladies.class, idLadies);
        manager.remove(ladies);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public List<Viewvendasladies> listaViewVendasLadies(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
         manager.getTransaction().commit();
        return q.getResultList();
        
    }
    
    public Controleladies salvar(Controleladies controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controle = manager.merge(controle);
        //fechando uma transação
        manager.getTransaction().commit();
        return controle;
    }
    
    public void excluirControleLadies(Controleladies controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controleladies controlehighschool = manager.find(Controleladies.class, controle.getIdcontroleLadies());
        manager.remove(controlehighschool);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controleladies consultarControleLadies(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controleladies c where c.vendas=" + idVendas);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Controleladies) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Viewcontroleladies> consultaControleLadies(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, int idUnidade) throws IOException {
        try {
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try {String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
                com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexao, usuario, senha);
                com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) conn.createStatement();

                stm.execute("USE systm"); //Nome do DATABASE A SER ACESSADO  
                String sql =null;
                if (idUnidade==0){
                    sql = "Select * from viewExportarControleLadies";
                }else sql = "Select * from viewExportarControleLadies where idUnidadeNegocio=" + idUnidade;
                rs = stm.executeQuery(sql);
                //GiroProdutoController giroProdutoController = new GiroProdutoController();
                
                    StringBuffer contenu; //// acho que seria melhor usar o StringBuilder
                    contenu = new StringBuffer("");
                    ResultSetMetaData rsMeta = rs.getMetaData();
                    for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
                    contenu.append(rsMeta.getColumnLabel(i) + "\t"); /// nesta linha imprime somente os nome dos campos da tabela  
                }
                contenu.append("\n"); // e temos que colocar todos os dados no StringBuffer  
                rs.beforeFirst();
                while (rs.next()) {
                    for (int i = 1; i <= rsMeta.getColumnCount(); i++) {
                        contenu.append(rs.getString(i) + "\t"); /// aqui mostra todos os dados  
                    }
                    contenu.append("\n");

                } //fim do while  
                //agora, salvando o StringBuffer no arquivo  
                FileWriter excelFile = new FileWriter(caminhoSalvarExcel); // nome do arquivo  
                excelFile.write(new String(contenu)); //aqui ele passa a String para salvar  
                excelFile.close();
                JOptionPane.showMessageDialog(null, "Controle Exportador com Sucesso");
                return rs;
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
}
