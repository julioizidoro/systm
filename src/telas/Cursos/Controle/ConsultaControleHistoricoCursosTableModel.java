/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Cursos.Controle;

import java.util.Date;
import java.util.List;
import model.Historicocursos;

/**
 *
 * @author Julio
 */
public class ConsultaControleHistoricoCursosTableModel {
     private List<Historicocursos> listaHistoricoCursos;
    private String[] colunas ={"Data", "Venda"};

    public ConsultaControleHistoricoCursosTableModel(List<Historicocursos> listahistoricoCursos) {
        this.listaHistoricoCursos = listahistoricoCursos;
    }

   
    public int getRowCount() {
        return listaHistoricoCursos.size();
    }

    
    public int getColumnCount() {
        return colunas.length;
    }

    
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaHistoricoCursos.get(rowIndex).getData();
        }else{
            return listaHistoricoCursos.get(rowIndex).getVendas();
        }
    }
    
   
    public String getColumnName(int column) {
        return colunas[column];
    }

    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Date.class;
         }else{
             return  String.class;
         }
    }
}

