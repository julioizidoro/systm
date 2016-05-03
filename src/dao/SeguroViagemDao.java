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
import model.Controleseguro;
import model.Seguroviagem;
import model.view.Viewcontroleseguro;
import model.view.Viewvendasseguro;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class SeguroViagemDao {
    
    private EntityManager manager;
    
    public Seguroviagem salvar(Seguroviagem seguroViagem) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        seguroViagem = manager.merge(seguroViagem);
        //fechando uma transação
        manager.getTransaction().commit();
        return seguroViagem;
    }
    
    public Seguroviagem consultar(int idVenda) throws SQLException{
         manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery("select s from Seguroviagem s where s.vendas=" + idVenda);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  (Seguroviagem) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idSeguroViagem) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Seguroviagem seguroViagem = manager.find(Seguroviagem.class, idSeguroViagem);
        //fechando uma transação
        manager.remove(seguroViagem);
        manager.getTransaction().commit();
    }
    
    public List<Viewvendasseguro> listar(String sql) throws SQLException{
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        return q.getResultList();
    }
    
    public Controleseguro salvar(Controleseguro controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controle = manager.merge(controle);
        //fechando uma transação
        manager.getTransaction().commit();
        return controle;
    }
    
    public void excluirControleSeguro(Controleseguro controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controleseguro controleseguro = manager.find(Controleseguro.class, controle.getIdcontroleSeguro());
        manager.remove(controleseguro);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controleseguro
         consultarControleSeguro(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
          manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controleseguro c where c.vendas=" + idVendas);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Controleseguro) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Viewcontroleseguro> consultaControleSeguro(String sql) throws SQLException{
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
                    sql = "Select * from viewExportarControleSeguro";
                }else sql = "Select * from viewExportarControleSeguro where idUnidadeNegocio=" + idUnidade;
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
    
    public List<Controleseguro> consultarControleSeguroList(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controleseguro c where c.vendas=" + idVendas);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
}
