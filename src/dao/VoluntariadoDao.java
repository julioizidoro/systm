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
import model.Controlecursos;
import model.Controlevoluntariado;
import model.Voluntariado;
import model.view.Viewcontrolecursos;
import model.view.Viewcontrolevoluntariado;
import Singleton.ConexaoSingleton;

/**
 *
 * @author Wolverine
 */
public class VoluntariadoDao {
    
    private EntityManager manager;
    
    public Voluntariado salvar(Voluntariado voluntariado) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        voluntariado = manager.merge(voluntariado);
        //fechando uma transação
        manager.getTransaction().commit();
        return voluntariado;
    }
    
   
    
    public Voluntariado consultar(int idVenda) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select v from Voluntariado v where v.vendas=" + idVenda);
       manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Voluntariado) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idVoluntariado) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Voluntariado voluntariado = manager.find(Voluntariado.class, idVoluntariado);
        manager.remove(voluntariado);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    
    
    public void excluirControleVoluntariado(Controlevoluntariado controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controlevoluntariado controleVoluntariado = manager.find(Controlevoluntariado.class, controle.getIdcontrolevoluntariado());
        manager.remove(controleVoluntariado);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    
    
    
    
    
    public List<Viewcontrolevoluntariado> consultarControleVoluntariado(String sql) throws SQLException {
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        Query q = manager.createQuery(sql);
        manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public Controlevoluntariado salvar(Controlevoluntariado controlevoluntariado) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controlevoluntariado = manager.merge(controlevoluntariado);
        //fechando uma transação
        manager.getTransaction().commit();
        return controlevoluntariado;
    }
    
    public Controlevoluntariado consultarControleVoluntariado(int idVendas, int idControle) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controlevoluntariado c where c.vendas=" + idVendas + "  and c.idcontroleCursos=" + idControle);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Controlevoluntariado) q.getResultList().get(0);
        } else {
            return null;
        }
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
                    sql = "Select * from viewExportarControleVoluntariado";
                }else sql = "Select * from viewExportarControleVoluntariado where idUnidadeNegocio=" + idUnidade;
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
    
    public List<Controlevoluntariado> consultarControleVoluntariado(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controlevoluntariado c where c.vendas=" + idVendas);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
}
