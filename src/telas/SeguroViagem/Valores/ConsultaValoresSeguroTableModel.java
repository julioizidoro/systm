/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package telas.SeguroViagem.Valores;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Valoresseguro;
import model.view.Viewconsultavaloreswork;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaValoresSeguroTableModel extends AbstractTableModel{
    
    private List<Valoresseguro> listaValor;
    private String[] colunas ={"Período", "Valor", "Moeda"};

    public ConsultaValoresSeguroTableModel(List<Valoresseguro> listaValor) {
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
            return listaValor.get(rowIndex).getPlano();
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
         }else return String.class;
    }
}
