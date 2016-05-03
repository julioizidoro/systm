/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.ProgramasTeens.Controle;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.view.Viewcontroleprogramasteens;

/**
 *
 * @author Wolverine
 */
public class ConsultaControleProgramasTeensTableModel extends AbstractTableModel{
    
    private List<Viewcontroleprogramasteens> listaVendas;
    private String[] colunas ={"Situação", "Data Embarque", "Data Inscrição", "Nome Cliente","E-mail", "Telefone", "Unidade", "Consultor", "Semeste Ínicio", "País Destino"};

    public ConsultaControleProgramasTeensTableModel(List<Viewcontroleprogramasteens> listaVendas) {
        this.listaVendas = listaVendas;
    }

    @Override
    public int getRowCount() {
        return listaVendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return carregarImagem(listaVendas.get(rowIndex).getSituacao());
        }else if (columnIndex==1){
            return listaVendas.get(rowIndex).getDataEmbarque();
        }else if (columnIndex==2){
            return listaVendas.get(rowIndex).getDataVenda();
        }else if (columnIndex==3){
            return listaVendas.get(rowIndex).getNomeCliente();
        }else if (columnIndex==4){
            return listaVendas.get(rowIndex).getEmail();
        }else if (columnIndex==5){
            return listaVendas.get(rowIndex).getFoneCelular();
        }else if (columnIndex==6){
            return listaVendas.get(rowIndex).getNomeFantasia();
        }else if (columnIndex==7){
            return listaVendas.get(rowIndex).getNomeConsultor();
        }else if (columnIndex==8){
            return listaVendas.get(rowIndex).getDataInicioCurso();
        }else return listaVendas.get(rowIndex).getPaisCurso();
            
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
            return Icon.class;
        }else if (columnIndex==1){
             return Date.class;
         }else if (columnIndex==2){
             return Date.class;
         }else if (columnIndex==3){
             return  String.class;
         }else if (columnIndex==4){
             return  String.class;
         }else if (columnIndex==5){
             return String.class;
         }else if (columnIndex==6){
             return String.class;
         }else if (columnIndex==7){
             return String.class;
         }else if (columnIndex==8){
             return Date.class;
         }else return String.class;
    }
    
    public Icon carregarImagem(String situacao) {
        if (situacao.equalsIgnoreCase("Processo")) {
            URL urlAzul = this.getClass().getResource("/imagens/bolas/bolaAzul.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAzul);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("Standby")) {
            URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("Embarcado")) {
            URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            URL urlPreta = this.getClass().getResource("/imagens/bolas/bolaPreta.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlPreta);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        }
    }
}
