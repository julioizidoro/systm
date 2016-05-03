/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import model.Controletrainee;
import model.Trainee;
import model.view.Viewcontroletrainee;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class TraineeDao {
    
    private EntityManager manager;
    
    public Trainee salvar(Trainee trainee) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        trainee = manager.merge(trainee);
        //fechando uma transação
        manager.getTransaction().commit();
        return trainee;
    }
    
   
    
    public Trainee consultar(int idVenda) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Trainee v where v.vendas=" + idVenda);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Trainee) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idTrainee) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Trainee trainee = manager.find(Trainee.class, idTrainee);
        manager.remove(trainee);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controletrainee salvar(Controletrainee controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controle = manager.merge(controle);
        //fechando uma transação
        manager.getTransaction().commit();
        return controle;
    }
    
    public void excluirControleTrainee(Controletrainee controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controletrainee controletrainee = manager.find(Controletrainee.class, controle.getIdcontroletrainee());
        manager.remove(controletrainee);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controletrainee consultarControleTrainee(int idVendas, int idControle) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controletrainee c where c.vendas=" + idVendas + "  and c.idcontroletrainee=" + idControle);
       manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Controletrainee) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Controletrainee> consultarControleTraineeList(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controletrainee c where c.vendas=" + idVendas);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public List<Viewcontroletrainee> consultaControleTrainee(String sql) throws SQLException{
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
                    sql = "Select * from viewExportarControleTainee";
                }else sql = "Select * from viewExportarControleTrainee where idUnidadeNegocio=" + idUnidade;
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
                JOptionPane.showMessageDialog(null, "Controle Exportado com Sucesso");
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
