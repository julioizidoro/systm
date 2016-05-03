/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Produto;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.view.Viewnotificacaoemail;

/**
 *
 * @author Wolverine
 */
public class ConsultaUsuarioTableModel extends AbstractTableModel{
    
    private List<Viewnotificacaoemail> listaUusarios;
    private String[] colunas ={"Nome", "Cargo", "email"};

    public ConsultaUsuarioTableModel(List<Viewnotificacaoemail> listaUusarios) {
        this.listaUusarios = listaUusarios;
    }

    @Override
    public int getRowCount() {
        return listaUusarios.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex==0){
            return listaUusarios.get(rowIndex).getNome();
        }else if (columnIndex==1){
            return listaUusarios.get(rowIndex).getCargo();
        }else return listaUusarios.get(rowIndex).getEmail();
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
