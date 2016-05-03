/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Arquivo;

import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewconsultaarquivo;

/**
 *
 * @author Wolverine
 */
public class ConsultarArquivosTableModel extends AbstractTableModel{
    
    private List<Viewconsultaarquivo> listaArquivos;
    private String[] colunas ={"Tipo Arquivo", " Data Inclusão", "Nome do Arquivo"};

    public ConsultarArquivosTableModel(List<Viewconsultaarquivo> listaArquivos) {
        this.listaArquivos = listaArquivos;
    }

    @Override
    public int getRowCount() {
        return listaArquivos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaArquivos.get(rowIndex).getDescricao();
        }else if (columnIndex==1){
            return listaArquivos.get(rowIndex).getDataInclusao();
        }else return listaArquivos.get(rowIndex).getNomeArquivo();
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
             return  Date.class;
         }else return String.class;
    }
}
