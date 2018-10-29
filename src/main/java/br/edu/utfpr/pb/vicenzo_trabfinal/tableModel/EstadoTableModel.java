package br.edu.utfpr.pb.vicenzo_trabfinal.tableModel;

import br.edu.utfpr.pb.vicenzo_trabfinal.model.Estado;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class EstadoTableModel extends AbstractTableModel{
    private List<Estado> lista;
    private String[] columns = {"Código", "Nome", "Sigla"};

    public EstadoTableModel() {
        lista = new ArrayList<>();
    }

    public EstadoTableModel(List<Estado> lista) {
        this.lista = lista;
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return lista.get(rowIndex).getId();
            case 1: 
                return lista.get(rowIndex).getDescricao();
            case 2: 
                return lista.get(rowIndex).getSigla();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column)
    {
        return columns[column];
    }
    
    public void removeRow(int rowIndex){
        this.lista.remove(rowIndex);
        this.fireTableRowsDeleted(rowIndex, rowIndex);
    }
}
