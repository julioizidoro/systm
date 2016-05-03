/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.FollowUp;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.view.Viewcosultafollowup;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaFollowupTableModel extends AbstractTableModel{
    
    private List<Viewcosultafollowup> listaFollowup;
    private String[] colunas ={"Status", "Nome", "Próximo Evento", "Próximo Contato", "Nível Interesse", "Unidade"};

    public ConsultaFollowupTableModel(List<Viewcosultafollowup> listaFollowup) {
        this.listaFollowup = listaFollowup;
    }

    @Override
    public int getRowCount() {
        return listaFollowup.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex==0){
            return carregarImagem(listaFollowup.get(rowIndex).getDataProximoContato());
        }else if (columnIndex==1){
            return listaFollowup.get(rowIndex).getNome();
        }else if (columnIndex==2){
            return listaFollowup.get(rowIndex).getSituacao();
        }else if (columnIndex==3){
            return listaFollowup.get(rowIndex).getDataProximoContato();
        }else if (columnIndex==4){
            return listaFollowup.get(rowIndex).getNivelInteresse();
        }else return listaFollowup.get(rowIndex).getNomeFantasia();
    }
    
    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex==0){
             return Image.class;
         }else if (columnIndex==1){
             return  String.class;
         }else if (columnIndex==2){
             return String.class;
         }else if (columnIndex==3){
             return Date.class;
         }else if (columnIndex==4){
             return String.class;
         }else return String.class;
    }
    
    public String verificarStatus(Date data) {
        if (data != null) {
            Date ndata = new Date();
            String sData = Formatacao.ConvercaoDataPadrao(ndata);
            ndata = Formatacao.ConvercaoStringDataBrasil(sData);
            if (data.equals(ndata)){
                return "HOJE";
            }else if (data.before(ndata)) {
                return "ATRASADO";
            } else if (data.after(new Date())) {
                return "EM DIA";
            }
        }
        return "ERRO";
    }
    
    public Icon carregarImagem(Date data) {
        String situacao = verificarStatus(data);
        if (situacao.equalsIgnoreCase("HOJE")) {
            URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else if (situacao.equalsIgnoreCase("EM DIA")) {
            URL urlVerde = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVerde);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        } else {
            URL urlPreta = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlPreta);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        }
    }
}
