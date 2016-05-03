/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmLocalizarArquivo.java
 *
 * Created on 15/03/2011, 11:47:17
 */

package telas;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.net.URL;
import telas.Aupair.Controle.IControleAupair;
import telas.Cursos.Controle.IControleCurso;
import telas.ExportarMarketing.IExportarMarketing;
import telas.HighSchool.Controle.IControleHighSchool;
import telas.Invoice.Iinvoice;
import telas.Ladies.Controle.IControleLadies;
import telas.ProgramasTeens.Controle.IControleProgramasTeens;
import telas.Relatorios.Vendas.IMapaVendas;
import telas.SeguroViagem.IControleSeguro;
import telas.Trainee.Controle.IControleTrainee;
import telas.Visto.IControleVistos;
import telas.Voluntariado.Controle.IControleVoluntariado;
import telas.Work.Controle.IControleWork;


/**
 *
 * @author wolverine
 */
public class FrmSalvarAquivo extends javax.swing.JFrame {
    
    private IControleCurso telaControleCurso;
    private IMapaVendas telaMapaVendas;
    private IControleWork telaControleWork;
    private IControleAupair telaControleAupair;
    private IControleHighSchool telaControleHighSchool;
    private IControleProgramasTeens telaControleProgramasTeens;
    private IControleLadies telaControleLadies;
    private IControleVistos telaControleVistos;
    private IControleSeguro telaControleSeguro;
    private Iinvoice telaInvoice;
    private IControleVoluntariado telaControleVoluntariado;
    private IControleTrainee telaControleTrainee;
    private IExportarMarketing telaExportarMarketing;

  
    /** Creates new form FrmLocalizarArquivo */
    public FrmSalvarAquivo(IControleCurso telaControleCurso) {
        this.telaControleCurso = telaControleCurso;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleLadies telaControleLadies) {
        this.telaControleLadies = telaControleLadies;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleSeguro telaControleSeguro) {
        this.telaControleSeguro = telaControleSeguro;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    public FrmSalvarAquivo(IControleProgramasTeens telaControleProgramasTeens) {
        this.telaControleProgramasTeens = telaControleProgramasTeens;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleWork telaControleWork) {
        this.telaControleWork = telaControleWork;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleAupair telaControleAupair) {
        this.telaControleAupair = telaControleAupair;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleHighSchool telaControleHighSchool) {
        this.telaControleHighSchool = telaControleHighSchool;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IMapaVendas telaMapaVendas) {
        this.telaMapaVendas = telaMapaVendas;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleVistos telaControleVistos) {
        this.telaControleVistos = telaControleVistos;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(Iinvoice telaInvoice) {
        this.telaInvoice = telaInvoice;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    
    public FrmSalvarAquivo(IControleVoluntariado telaControleVoluntariado) {
        this.telaControleVoluntariado = telaControleVoluntariado;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IControleTrainee telaControleTrainee) {
        this.telaControleTrainee = telaControleTrainee;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public FrmSalvarAquivo(IExportarMarketing telaExportarMarketing) {
        this.telaExportarMarketing = telaExportarMarketing;
        initComponents();
        carregarjFileChooser.setFileFilter(null);
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        carregarjFileChooser = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Salvar Arquivo");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        carregarjFileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
        carregarjFileChooser.setCurrentDirectory(null);
        carregarjFileChooser.setDialogTitle("");
        carregarjFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carregarjFileChooserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carregarjFileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(carregarjFileChooser, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void carregarjFileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carregarjFileChooserActionPerformed
        File f = carregarjFileChooser.getSelectedFile();
        if (f != null) {
            String nomeArquivo = f.getName();
            String caminho = f.getAbsolutePath();
            if (telaControleCurso != null) {
                telaControleCurso.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaMapaVendas != null) {
                telaMapaVendas.exportarExecel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleWork != null) {
                telaControleWork.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleAupair != null) {
                telaControleAupair.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleHighSchool != null) {
                telaControleHighSchool.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleProgramasTeens != null) {
                telaControleProgramasTeens.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleLadies != null) {
                telaControleLadies.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleVistos != null) {
                telaControleVistos.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            } else if (telaControleSeguro != null) {
                telaControleSeguro.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            }else if (telaInvoice !=null){
                telaInvoice.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            }else if (telaControleVoluntariado !=null){
                telaControleVoluntariado.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            }else if (telaControleTrainee !=null){
                telaControleTrainee.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            }else if (telaExportarMarketing!=null){
                telaExportarMarketing.exportarExcel(f.getPath() + ".xls", nomeArquivo + ".xls");
            }
        }
        this.dispose();
    }//GEN-LAST:event_carregarjFileChooserActionPerformed

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser carregarjFileChooser;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
