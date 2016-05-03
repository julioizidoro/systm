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
import model.Controlevistos;
import model.Valoresvistos;
import model.Vistos;
import model.view.Viewcontrolevistos;
import model.view.Viewvendasvisto;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class VistosDao {
    
    private EntityManager manager;
    
    public Vistos salvar(Vistos visto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        visto = manager.merge(visto);
        //fechando uma transação
        manager.getTransaction().commit();
        return visto;
    }
    
    public Vistos consultarVistos(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Vistos v where v.vendas=" + idVenda);
       manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Vistos) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idVisto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Vistos visto = manager.find(Vistos.class, idVisto);
        //fechando uma transação
        manager.remove(visto);
        manager.getTransaction().commit();
    }
    
    public List<Viewvendasvisto> listar(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
       manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Controlevistos salvar(Controlevistos controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controle = manager.merge(controle);
        //fechando uma transação
        manager.getTransaction().commit();
        return controle;
    }
    
    public void excluirControleVistos(Controlevistos controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controlevistos controlevistos = manager.find(Controlevistos.class, controle.getIdcontroleVistos());
        manager.remove(controlevistos);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controlevistos consultarControleVistos(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controlevistos c where c.vendas=" + idVendas);
       manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Controlevistos) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Viewcontrolevistos> consultaControleVistos(String sql) throws SQLException{
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
                String sql = null;
                if (idUnidade==0){
                    sql = "Select * from viewExportarControleVistos";
                }else sql = "Select * from viewExportarControleVistos where idUnidadeNegocio=" + idUnidade;
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
    public List<Controlevistos> consultarControleVistosList(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controlevistos c where c.vendas=" + idVendas);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public Valoresvistos salvar(Valoresvistos valoresVisto) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        valoresVisto = manager.merge(valoresVisto);
        //fechando uma transação
        manager.getTransaction().commit();
        return valoresVisto;
    }
    
    public List<Valoresvistos> listar()throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Valoresvistos v where v.situacao='ATIVO'");
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public Valoresvistos consultar(int idvaloresVistos) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Valoresvistos valoresVistos = manager.find(Valoresvistos.class, idvaloresVistos);
        //fechando uma transação
        manager.getTransaction().commit();
        return valoresVistos;
    }
    
}
