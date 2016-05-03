/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.swing.JRViewer;
import Singleton.ConexaoSingleton;
import telas.OrcamentoProdutos.OrcamentoProdutoBean;
import telas.OrcamentoProdutos.Relatorio.RelOrcamentoProdutoBean;


/**
 *
 * @author Acer
 */
public final class relatoriosJasper {

    private String url;
    private Map parameters = new HashMap();
    private String banco;
    private String local;
    private String senha;
    String usuario;
    String porta;
    
    

    public relatoriosJasper(String url, Map parameters) {
        carregarBancoDados();
        this.url = url;
        this.parameters = parameters;
        gerarRelatorios();
    }
    
    public relatoriosJasper(String url, Map parameters, boolean data) {
        this.url = url;
        this.parameters = parameters;
        gerarRelatoriosDS();
    }
    
    private void carregarBancoDados() {

        String localIni = System.getProperty("user.dir");
        localIni = localIni + "/systm.properties";
        File file = new File(localIni);
        Properties props = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            //lê os dados que estão no arquivo
            props.load(fis);
            fis.close();
        } catch (IOException ex) {
            Logger.getLogger(ConexaoSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
        banco = props.getProperty("banco");
        local = props.getProperty("local");
        senha = props.getProperty("senha");
        usuario = props.getProperty("usuario");
        porta = props.getProperty("porta");

    }

    public void gerarRelatorios(){
        URL is = this.getClass().getClassLoader().getResource(url);
        String conexao = "jdbc:mysql://" + local + ":" + porta + "/" + banco;
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(conexao,  usuario,senha);
            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", false);
            viewer.setSize(1024, 768);
            viewer.setLocationRelativeTo(null);

            
            JasperReport relatoriosJasper = (JasperReport) JRLoader.loadObject(is);
            this.parameters.put("REPORT_CONNECTION", conn);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatoriosJasper, this.parameters);
            JRViewer jrViewer = new JRViewer(jasperPrint);
            //JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer);
            viewer.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o relatório " + ex);
            ex.printStackTrace();

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }
    
    public void gerarRelatoriosDS(){
        URL is = this.getClass().getClassLoader().getResource(url);
        Connection conn = null;
        try {

            JDialog viewer = new JDialog(new javax.swing.JFrame(), "Visualização do Relatório", false);
            viewer.setSize(1024, 768);
            viewer.setLocationRelativeTo(null);

            
            JasperReport relatoriosJasper = (JasperReport) JRLoader.loadObject(is);
            this.parameters.put("REPORT_CONNECTION", conn);
            
            List<OrcamentoProdutoBean> listaTodas =RelOrcamentoProdutoBean.getLista();
            JRBeanCollectionDataSource ds = new JRBeanCollectionDataSource(listaTodas);
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(relatoriosJasper, this.parameters, ds);
            JRViewer jrViewer = new JRViewer(jasperPrint);
            //JasperViewer jrViewer = new JasperViewer(jasperPrint, true);
            viewer.getContentPane().add(jrViewer);
            viewer.setVisible(true);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar o relatório " + ex);
            ex.printStackTrace();

        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }

    }

}
