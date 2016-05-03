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
import model.Vendas;
import model.view.Viewvendascurso;
import model.view.Viewvendashighschool;
import model.view.Viewvendasprogramasteens;
import model.view.Viewvendastrainee;
import model.view.Viewvendasvoluntariado;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class VendasDao {
    
    private EntityManager manager;
    
    public Vendas salvar(Vendas venda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        venda = manager.merge(venda);
        //fechando uma transação
        manager.getTransaction().commit();
        return venda;
    }
    
    public Vendas consultarVendas(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Vendas venda = manager.find(Vendas.class, idVenda);
        //fechando uma transação
        manager.getTransaction().commit();
        return venda;
    }
    
    public List<Viewvendascurso> listaViewVendasCursos(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        int t = q.getResultList().size();
        return q.getResultList();
    }
    
    public List<Viewvendashighschool> listaViewVendasHighSchool(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Viewvendasvoluntariado> listaViewVendasVoluntariado(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Viewvendastrainee> listaViewVendasTrainee(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public List<Viewvendasprogramasteens> listaViewVendasProgramasTeens(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public void excluir(int idVenda) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Vendas venda = manager.find(Vendas.class, idVenda);
        manager.remove(venda);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public ResultSet ExportarExcel(String nomeRelatorio, String local, String porta, String senha, String banco, String usuario, String caminhoSalvarExcel, String sql) throws IOException {
        try {
            ResultSet rs;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            try {String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
                com.mysql.jdbc.Connection conn = (com.mysql.jdbc.Connection) DriverManager.getConnection(conexao, usuario, senha);
                com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) conn.createStatement();

                stm.execute("USE systm"); //Nome do DATABASE A SER ACESSADO  
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
                JOptionPane.showMessageDialog(null, "Relatorio Gerado");
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
    
    public Vendas vendaCliente(int idCliente) throws SQLException{
        
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery("Select v from Vendas v where v.cliente=" + idCliente);
        manager.getTransaction().commit();
        if (q.getResultList().size()>0){
            return (Vendas) q.getResultList().get(0);
        }
        return null;
    }
    
    public List<Vendas> lista() throws SQLException{
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        //Query q = manager.createQuery("Select v from Vendas v where v.fornecedorcidade.idfornecedorcidade=1");
         Query q = manager.createQuery("Select v from Vendas v where v.dataVenda>='2015-11-01' and v.dataVenda<='2015-11-30");
         manager.getTransaction().commit();
        return q.getResultList();
    }
    
    
    
}
