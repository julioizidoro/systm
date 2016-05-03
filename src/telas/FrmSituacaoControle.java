/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas;

import controller.AupairController;
import controller.CursosController;
import controller.HighSchoolController;
import controller.LadiesController;
import controller.ProgramasTeensController;
import controller.SeguroViagemController;
import controller.TraineeController;
import controller.VistosController;
import controller.VoluntariadoController;
import controller.WorkTravelController;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import model.Controleaupair;
import model.Controlecursos;
import model.Controlehighschool;
import model.Controleladies;
import model.Controlepacotes;
import model.Controleprogramasteens;
import model.Controleseguro;
import model.Controletrainee;
import model.Controlevistos;
import model.Controlevoluntariado;
import model.Controlework;
import telas.Aupair.Controle.IControleAupair;
import telas.Cursos.Controle.IControleCurso;
import telas.HighSchool.Controle.IControleHighSchool;
import telas.Ladies.Controle.IControleLadies;
import telas.ProgramasTeens.Controle.IControleProgramasTeens;
import telas.SeguroViagem.IControleSeguro;
import telas.Trainee.Controle.IControleTrainee;
import telas.Visto.IControleVistos;
import telas.Voluntariado.Controle.IControleVoluntariado;
import telas.Work.Controle.IControleWork;

/**
 *
 * @author Wolverine
 */
public class FrmSituacaoControle extends javax.swing.JFrame {
    
    private Controlecursos controleCurso;
    private Controleaupair controleAupair;
    private Controlehighschool controleHighSchool;
    private Controleladies controleLadies;
    private Controleprogramasteens controleProgramasTeens;
    private Controlepacotes controlePacotes;
    private Controleseguro controleSeguro;
    private Controlevistos controleVistos;
    private Controlework controleWork;
    private Controlevoluntariado controleVoluntariado;
    private Controletrainee controleTrainee;
    
    private IControleCurso telaCurso;
    private IControleAupair telaAupair;
    private IControleLadies telaLadies;
    private IControleProgramasTeens telaProgramasTeens;
    private IControleHighSchool telaHighSchool;
    private IControleSeguro telaSeguro;
    private IControleVistos telaVistos;
    private IControleWork telaWork;
    private IControleVoluntariado telaVoluntariado;
    private IControleTrainee telaTrainee;

    /**
     * Creates new form FrmSituacaoControleCurso
     */
    public FrmSituacaoControle(Controlecursos controle, IControleCurso telaCurso) {
        this.controleCurso = controle;
        this.telaCurso = telaCurso;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }

    public FrmSituacaoControle(Controleaupair controle, IControleAupair telaAupair) {
        this.controleAupair = controle;
        this.telaAupair = telaAupair;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controlehighschool controle, IControleHighSchool telaHighSchool) {
        this.controleHighSchool = controle;
        this.telaHighSchool = telaHighSchool;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controleladies controle, IControleLadies telaLadies) {
        this.controleLadies = controle;
        this.telaLadies = telaLadies;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    
    public FrmSituacaoControle(Controleprogramasteens controle, IControleProgramasTeens telaProgramasTeens) {
        this.controleProgramasTeens = controle;
        this.telaProgramasTeens = telaProgramasTeens;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controleseguro controle, IControleSeguro telaSeguro) {
        this.controleSeguro = controle;
        this.telaSeguro = telaSeguro;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controlevistos controle, IControleVistos telaVistos) {
        this.controleVistos = controle;
        this.telaVistos = telaVistos;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controlework controle, IControleWork telaWork) {
        this.controleWork = controle;
        this.telaWork = telaWork;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controlevoluntariado controle, IControleVoluntariado telaVoluntariado) {
        this.controleVoluntariado = controle;
        this.telaVoluntariado = telaVoluntariado;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }
    
    public FrmSituacaoControle(Controletrainee controle, IControleTrainee telaTrainee) {
        this.controleTrainee = controle;
        this.telaTrainee = telaTrainee;
        initComponents();
        URL url = this.getClass().getResource("/imagens/logo/logotela.png");
        Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url);
        this.setIconImage(imagemTitulo);
        this.setLocationRelativeTo(null);
        if (controle != null) {
            if (controle.getSituacao().equalsIgnoreCase("Cancelado")) {
                canceladojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Processo")) {
                processojRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Standby")) {
                standbyjRadioButton.setSelected(true);
            } else if (controle.getSituacao().equalsIgnoreCase("Embarcado")) {
                embarcadojRadioButton.setSelected(true);
            }
        }
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        situacaobuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        canceladojRadioButton = new javax.swing.JRadioButton();
        processojRadioButton = new javax.swing.JRadioButton();
        standbyjRadioButton = new javax.swing.JRadioButton();
        embarcadojRadioButton = new javax.swing.JRadioButton();
        grupojRadioButton = new javax.swing.JRadioButton();
        jPanel17 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Situação");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        situacaobuttonGroup.add(canceladojRadioButton);
        canceladojRadioButton.setText("Cancelado");

        situacaobuttonGroup.add(processojRadioButton);
        processojRadioButton.setText("Processo");

        situacaobuttonGroup.add(standbyjRadioButton);
        standbyjRadioButton.setText("Standby");

        situacaobuttonGroup.add(embarcadojRadioButton);
        embarcadojRadioButton.setText("Embarcado");

        situacaobuttonGroup.add(grupojRadioButton);
        grupojRadioButton.setText("Grupo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(canceladojRadioButton)
                            .addComponent(processojRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(standbyjRadioButton)
                            .addComponent(embarcadojRadioButton))
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grupojRadioButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(canceladojRadioButton)
                    .addComponent(standbyjRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(processojRadioButton)
                    .addComponent(embarcadojRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(grupojRadioButton)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/confirmar.png"))); // NOI18N
        jButton5.setText("Confirmar");
        jButton5.setToolTipText("Confirma Situação");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/botozinhos/cancel.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.setToolTipText("Cancela Situação");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(16, 16, 16))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
        if (controleCurso!=null){
            CursosController cursosController = new CursosController();
            if (canceladojRadioButton.isSelected()){
                controleCurso.setSituacao("Cancelado");
            }else if (processojRadioButton.isSelected()){
                controleCurso.setSituacao("Processo");
            }else if (standbyjRadioButton.isSelected()){
                controleCurso.setSituacao("Standby");
            }else if (embarcadojRadioButton.isSelected()){
                controleCurso.setSituacao("Embarcado");
            }else if (grupojRadioButton.isSelected()){
                controleCurso.setSituacao("Grupo");
            }
            cursosController.salvar(controleCurso);
            telaCurso.setModel();
            this.dispose();
        } else if (controleAupair != null) {
            AupairController aupairController = new AupairController();
            if (canceladojRadioButton.isSelected()) {
                controleAupair.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleAupair.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleAupair.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleAupair.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleAupair.setSituacao("Grupo");
            }
            aupairController.salvar(controleAupair);
            telaAupair.setModel();
            this.dispose();
        } else if (controleProgramasTeens != null) {
            ProgramasTeensController programasTeensController = new ProgramasTeensController();
            if (canceladojRadioButton.isSelected()) {
                controleProgramasTeens.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleProgramasTeens.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleCurso.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleProgramasTeens.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleProgramasTeens.setSituacao("Grupo");
            }
            programasTeensController.salvar(controleProgramasTeens);
            telaProgramasTeens.setModel();
            this.dispose();
        } else if (controleLadies != null) {
            LadiesController ladiesController = new LadiesController();
            if (canceladojRadioButton.isSelected()) {
                controleLadies.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleLadies.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleLadies.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleLadies.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleLadies.setSituacao("Grupo");
            }
            ladiesController.salvar(controleLadies);
            telaLadies.setModel();
            this.dispose();
        }else if (controleHighSchool != null) {
            HighSchoolController highSchoolController = new HighSchoolController();
            if (canceladojRadioButton.isSelected()) {
                controleHighSchool.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleHighSchool.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleHighSchool.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleHighSchool.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleHighSchool.setSituacao("Grupo");
            }
            highSchoolController.salvar(controleHighSchool);
            telaHighSchool.setModel();
            this.dispose();
        }else if (controleSeguro != null) {
            SeguroViagemController seguroViagemController = new SeguroViagemController();
            if (canceladojRadioButton.isSelected()) {
                controleSeguro.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleSeguro.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleSeguro.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleSeguro.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleSeguro.setSituacao("Grupo");
            }
            seguroViagemController.salvar(controleSeguro);
            telaSeguro.setModel();
            this.dispose();
        }else if (controleVistos != null) {
            VistosController vistosController = new VistosController();
            if (canceladojRadioButton.isSelected()) {
                controleVistos.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleVistos.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleVistos.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleVistos.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleVistos.setSituacao("Grupo");
            }
            vistosController.salvar(controleVistos);
            telaVistos.setModel();
            this.dispose();
        }else if (controleWork != null) {
            WorkTravelController workTravelController = new WorkTravelController();
            if (canceladojRadioButton.isSelected()) {
                controleWork.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleWork.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleWork.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleWork.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleWork.setSituacao("Grupo");
            }
            workTravelController.salvar(controleWork);
            telaWork.setModel();
            this.dispose();
        }else if (controleVoluntariado != null) {
            VoluntariadoController voluntariadoController = new VoluntariadoController();
            if (canceladojRadioButton.isSelected()) {
                controleVoluntariado.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleVoluntariado.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleVoluntariado.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleVoluntariado.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleVoluntariado.setSituacao("Grupo");
            }
            voluntariadoController.salvar(controleVoluntariado);
            telaVoluntariado.setModel();
            this.dispose();
        }else if (controleTrainee != null) {
            TraineeController traineeController = new TraineeController();
            if (canceladojRadioButton.isSelected()) {
                controleTrainee.setSituacao("Cancelado");
            } else if (processojRadioButton.isSelected()) {
                controleTrainee.setSituacao("Processo");
            } else if (standbyjRadioButton.isSelected()) {
                controleTrainee.setSituacao("Standby");
            } else if (embarcadojRadioButton.isSelected()) {
                controleTrainee.setSituacao("Embarcado");
            } else if (grupojRadioButton.isSelected()) {
                controleTrainee.setSituacao("Grupo");
            }
            traineeController.salvar(controleTrainee);
            telaTrainee.setModel();
            this.dispose();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton canceladojRadioButton;
    private javax.swing.JRadioButton embarcadojRadioButton;
    private javax.swing.JRadioButton grupojRadioButton;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JRadioButton processojRadioButton;
    private javax.swing.ButtonGroup situacaobuttonGroup;
    private javax.swing.JRadioButton standbyjRadioButton;
    // End of variables declaration//GEN-END:variables


}
