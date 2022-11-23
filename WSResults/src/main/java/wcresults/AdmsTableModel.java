/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wcresults;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AdmsTableModel extends AbstractTableModel {

    private List<Administrador> adms;
    private String[] colunas = {"ID", "LOGIN", "SENHA"};

    public AdmsTableModel() throws Exception {
        DAOAdm dao = new DAOAdm();
        this.adms = dao.buscarAdms();
    }

    @Override
    public int getRowCount() {
        return adms.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.adms.get(rowIndex).getId();
            case 1:
                return this.adms.get(rowIndex).getLogin();
            case 2:
                return this.adms.get(rowIndex).getSenha();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }

}
