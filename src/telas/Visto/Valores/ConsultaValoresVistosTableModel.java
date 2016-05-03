/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.Visto.Valores;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Valoresvistos;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaValoresVistosTableModel extends AbstractTableModel{
    
    private List<Valoresvistos> listaValor;
    private String[] colunas ={"País", "Categoria", "Valor R$"};

    public ConsultaValoresVistosTableModel(List<Valoresvistos> listaValor) {
        this.listaValor = listaValor;
    }

    @Override
    public int getRowCount() {
        return listaValor.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return listaValor.get(rowIndex).getFornecedorcidade().getCidade().getPais().getNome();
        }else if (columnIndex==1){
            return listaValor.get(rowIndex).getCategoria();
        }else return Formatacao.formatarFloatString(listaValor.get(rowIndex).getValorgross());
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
             return String.class;
         }else return String.class;
    }
    
}
