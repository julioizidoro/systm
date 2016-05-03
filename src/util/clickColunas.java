/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;
import telas.Aupair.Controle.IControleAupair;
import telas.Cursos.Controle.IControleCurso;
import telas.HighSchool.Controle.IControleHighSchool;
import telas.Invoice.Iinvoice;
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
public class clickColunas extends MouseAdapter{
    
    private IControleCurso telaControleCursos;
    private IControleAupair telaAupair;
    private IControleLadies telaLadies;
    private IControleProgramasTeens telaProgramasTeens;
    private IControleHighSchool telaHighSchool;
    private IControleSeguro telaSeguro;
    private IControleVistos telaVistos;
    private IControleWork telaWork;
    private Iinvoice telaInvoice;
    private IControleVoluntariado telaControleVoluntariado;
    private IControleTrainee telaControleTrainee;

    public clickColunas(IControleCurso tela) {
        this.telaControleCursos = tela;
    }
    
    public clickColunas(Iinvoice tela) {
        this.telaInvoice = tela;
    }
    
    public clickColunas(IControleAupair tela) {
        this.telaAupair = tela;
    }
    
    public clickColunas(IControleHighSchool tela) {
        this.telaHighSchool = tela;
    }
    
    public clickColunas(IControleLadies tela) {
        this.telaLadies = tela;
    }
    
    
    public clickColunas(IControleProgramasTeens tela) {
        this.telaProgramasTeens = tela;
    }
    
    public clickColunas(IControleSeguro tela) {
        this.telaSeguro = tela;
    }
    
    public clickColunas(IControleVistos tela) {
        this.telaVistos = tela;
    }
    
    public clickColunas(IControleWork tela) {
        this.telaWork = tela;
    }
    
    public clickColunas(IControleVoluntariado tela) {
        this.telaControleVoluntariado = tela;
    }
    
     public clickColunas(IControleTrainee tela) {
        this.telaControleTrainee = tela;
    }
    
        
        
    
    public void mouseClicked(MouseEvent evt) {
        JTable table = ((JTableHeader) evt.getSource()).getTable();
        TableColumnModel colModel = table.getColumnModel();

        // índice da coluna cujo titulo foi clicado
        int vColIndex = colModel.getColumnIndexAtX(evt.getX());
        int mColIndex = table.convertColumnIndexToModel(vColIndex);

        if (vColIndex == -1) {
            return;
        }
        if (telaControleCursos!=null){
            telaControleCursos.setNumeroColuna(mColIndex);
        }else if (telaAupair!=null){
            telaAupair.setNumeroColuna(mColIndex);
        }else if (telaHighSchool!=null){
            telaHighSchool.setNumeroColuna(mColIndex);
        }else if (telaLadies!=null){
            telaLadies.setNumeroColuna(mColIndex);
        }else if (telaProgramasTeens!=null){
            telaProgramasTeens.setNumeroColuna(mColIndex);
        }else if (telaSeguro!=null){
            telaSeguro.setNumeroColuna(mColIndex);
        }else if (telaVistos!=null){
            telaVistos.setNumeroColuna(mColIndex);
        }else if (telaWork!=null){
            telaWork.setNumeroColuna(mColIndex);
        }else if (telaControleVoluntariado!=null){
            telaControleVoluntariado.setNumeroColuna(mColIndex);
        }else if (telaControleTrainee!=null){
            telaControleTrainee.setNumeroColuna(mColIndex);
        }
    }
}
    

