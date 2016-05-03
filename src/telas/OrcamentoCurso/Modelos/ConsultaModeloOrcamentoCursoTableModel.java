/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.OrcamentoCurso.Modelos;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewmodeloorcamento;

/**
 *
 * @author Wolverine
 */
public class ConsultaModeloOrcamentoCursoTableModel extends AbstractTableModel{
    
    private List<Viewmodeloorcamento> listaModelo;
    private String[] colunas ={"Nome do Modelo", "Usuário", "Unidade Negócio"};

    public ConsultaModeloOrcamentoCursoTableModel(List<Viewmodeloorcamento> listaModelo) {
        this.listaModelo = listaModelo;
    }

    @Override
    public int getRowCount() {
        return listaModelo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaModelo.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaModelo.get(rowIndex).getNomeUsuario();
        }else return listaModelo.get(rowIndex).getNomeFantasia();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return String.class;
         }else if (columnIndex==1){
             return  String.class;
         }else return String.class;
    }
    
}
