/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wcresults;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TimesTableModel extends AbstractTableModel {

    private List<Time> times;
    private String[] colunas = {"ID", "NOME", "GRUPO"};

    public TimesTableModel() throws Exception {
        DAOTime dao = new DAOTime();
        this.times = dao.buscarTimes();
    }

    @Override
    public int getRowCount() {
        return times.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.times.get(rowIndex).getId();
            case 1:
                return this.times.get(rowIndex).getNome();
            case 2:
                return this.times.get(rowIndex).getGrupo();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

}
