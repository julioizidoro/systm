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
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import model.Controlecursos;
import model.Cursos;
import model.view.Viewcontrolecursos;
import Singleton.ConexaoSingleton;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class CursosDao {
    
    private EntityManager manager;
    
    public Cursos salvar(Cursos curso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        curso = manager.merge(curso);
        //fechando uma transação
        manager.getTransaction().commit();
        return curso;
    }
    
   
    
    public Cursos consultarCursos(int idVenda) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Cursos c where c.vendas=" + idVenda);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Cursos) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public void excluir(int idCurso) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Cursos curso = manager.find(Cursos.class, idCurso);
        manager.remove(curso);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controlecursos salvar(Controlecursos controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        controle = manager.merge(controle);
        //fechando uma transação
        manager.getTransaction().commit();
        return controle;
    }
    
    public void excluirControleCurso(Controlecursos controle) throws SQLException{
        manager = ConexaoSingleton.getConexao();
        //abrindo uma transação
        manager.getTransaction().begin();
        Controlecursos controlecursos = manager.find(Controlecursos.class, controle.getIdcontroleCursos());
        manager.remove(controlecursos);
        //fechando uma transação
        manager.getTransaction().commit();
    }
    
    public Controlecursos consultarControleCursos(int idVendas, int idControle) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controlecursos c where c.vendas=" + idVendas + "  and c.idcontroleCursos=" + idControle);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return (Controlecursos) q.getResultList().get(0);
        } else {
            return null;
        }
    }
    
    public List<Controlecursos> consultarControleCursosList(int idVendas) throws SQLException {
        manager = ConexaoSingleton.getConexao();
         manager.getTransaction().begin();
        Query q = manager.createQuery("select c from Controlecursos c where c.vendas=" + idVendas);
         manager.getTransaction().commit();
        if (q.getResultList().size() > 0) {
            return  q.getResultList();
        } else {
            return null;
        }
    }
    
    public List<Viewcontrolecursos> consultaControleCursos(String sql) throws SQLException{
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
                    sql = "Select * from viewExportarControleCursos";
                }else sql = "Select * from viewExportarControleCursos where idUnidadeNegocio=" + idUnidade;
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
    
    public void gerarSitaucaoEmbarcado() throws SQLException {
        manager = ConexaoSingleton.getConexao();
        manager.getTransaction().begin();
        String data = Formatacao.ConvercaoDataSql(new Date());
        String sql = "Update controlecursos set situacao='Embarcado' where situacao='Processo'  and dataEmbarque<='" + data + "'";
        Query q = manager.createNativeQuery(sql);
        q.executeUpdate();
        manager.getTransaction().commit();
    }
}
