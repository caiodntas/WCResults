package wcresults;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAOTime {
    public boolean exibirTabelaTime (Time time) throws Exception {
        String sql = "SELECT * FROM time_table";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public void atualizarTime(Time time) throws Exception {
        String sql = "UPDATE time_table SET nome = ? WHERE nome = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.execute();
            ps.close();
            }
    }
    
    public List <Time> buscarTimes(Time time) throws Exception {
        String sql = "SELECT id, nome FROM time_table WHERE id = ?";
        List <Time> times = new ArrayList<>();
        try (Connection c = ConnectionFactory.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql)){
        ps.setInt (1, time.getId());
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                    int id = rs.getInt("ID");
                    String nome = rs.getString("NOME DO TIME");
                    times.add(new Time (id, nome));
                }
            } 
        }
        return times;
    }
    
    public void atribuirTimesOficiais(Time time) throws Exception {
        String sql = "UPDATE time_table SET nome = 'Qatar' AND grupo = 'A' WHERE id = 1 ";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.setString(2, Integer.toString(time.getGrupo()));
            ps.execute();
            ps.close();
            }
    }
}    


