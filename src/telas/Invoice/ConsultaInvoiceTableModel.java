/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package telas.Invoice;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Date;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;
import model.view.Viewconsultainvoice;
import util.Formatacao;

/**
 *
 * @author Wolverine
 */
public class ConsultaInvoiceTableModel extends AbstractTableModel {

    private List<Viewconsultainvoice> listaInvoice;
    private String[] colunas = {"Situação", "Prioridade", "Nome do Cliente", "Data Previsão", "Valor NET", "Valor Crédito", "Data Pagto", "Produto", "Fornecedor"};
    private Date dataVencimento;
    private float valorInvoice;

    public ConsultaInvoiceTableModel(List<Viewconsultainvoice> listaInvoice) {
        this.listaInvoice = listaInvoice;
    }

    @Override
    public int getRowCount() {
        return listaInvoice.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return carregarImagem(rowIndex);
        }else if (columnIndex==1){
            return listaInvoice.get(rowIndex).getPrioridade();
        } else if (columnIndex == 2) {
            return listaInvoice.get(rowIndex).getNomeCliente();
        } else if (columnIndex == 3) {
            return listaInvoice.get(rowIndex).getDataPrevistaPagamento();
        } else if (columnIndex == 4) {
            return Formatacao.formatarFloatString(valorInvoice);
        } else if (columnIndex == 5) {
            return Formatacao.formatarFloatString(listaInvoice.get(rowIndex).getValorcredito());
        } else if (columnIndex == 6) {
            return listaInvoice.get(rowIndex).getDataPagamentoInvoice();
        } else if (columnIndex == 7) {
            return listaInvoice.get(rowIndex).getDescricao();
        } else {
            return listaInvoice.get(rowIndex).getNomeFornecedor();
        }
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (columnIndex == 0) {
            return Image.class;
        }else if (columnIndex==1){
            return String.class;
        } else if (columnIndex == 2) {
            return String.class;
        } else if (columnIndex == 3) {
            return Date.class;
        } else if (columnIndex == 4) {
            return String.class;
        }else if (columnIndex == 5) {
            return String.class;
        } else if (columnIndex == 6) {
            return Date.class;
        } else if (columnIndex == 7) {
            return String.class;
        } else {
            return String.class;
        }
    }

    public Icon carregarImagem(int linha) {
        valorInvoice = 0.0f;
        if (listaInvoice.get(linha).getDataPagamentoInvoice() != null) {
            dataVencimento = listaInvoice.get(linha).getDataPagamentoInvoice();
        } else {
            dataVencimento = listaInvoice.get(linha).getDataPrevistaPagamento();
        }
        if (listaInvoice.get(linha).getValorPagamentoInvoice() > 0) {
            valorInvoice = listaInvoice.get(linha).getValorPagamentoInvoice();
        } else {
            valorInvoice = listaInvoice.get(linha).getValorPrevistoInvoice();
        }
        if (dataVencimento != null) {
            if (dataVencimento.before(new Date())) {
                URL urlVermelha = this.getClass().getResource("/imagens/bolas/bolaVerde.png");
                Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlVermelha);
                ImageIcon imagem = new ImageIcon(imagemTitulo);
                return imagem;
            } else {
                if (dataVencimento.before(new Date())) {
                    URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaVermelha.png");
                    Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
                    ImageIcon imagem = new ImageIcon(imagemTitulo);
                    return imagem;
                } else {
                    URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
                    Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
                    ImageIcon imagem = new ImageIcon(imagemTitulo);
                    return imagem;
                }
            }
        } else {
            URL urlAmarela = this.getClass().getResource("/imagens/bolas/bolaAmarela.png");
            Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(urlAmarela);
            ImageIcon imagem = new ImageIcon(imagemTitulo);
            return imagem;
        }
    }
}
