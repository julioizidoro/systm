/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Arquivo;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Tipoarquivo;

/**
 *
 * @author Wolverine
 */
public class ConsultarTipoArquivoTableModel extends AbstractTableModel{
    
    private List<Tipoarquivo> listaTipo;
    private String[] colunas ={" Tipo de Arquivo"};

    public ConsultarTipoArquivoTableModel(List<Tipoarquivo> listaTipo) {
        this.listaTipo = listaTipo;
    }

    @Override
    public int getRowCount() {
        return listaTipo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return listaTipo.get(rowIndex).getDescricao();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    
    
}
