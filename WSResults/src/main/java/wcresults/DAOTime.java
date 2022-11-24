package wcresults;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class DAOTime {
    public boolean exibirTime (Time time) throws Exception {
        String sql = "SELECT * FROM time_table WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public boolean buscarTimeID (Time time) throws Exception {
        String sql = "SELECT * FROM time_table WHERE id = '" + time.getId() + "'" ;
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    
    public boolean exibirGrupo (Time time) throws Exception {
        String sql = "SELECT * FROM time_table WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
   public void buscarIdENome () throws Exception {
       
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
    
    public List <Time> buscarTimes() throws Exception {
        String sql = "SELECT id, nome FROM time_table";
        List <Time> times = new ArrayList<>();
        try (Connection c = ConnectionFactory.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    times.add(new Time (id, nome));
                }
            } 
        }
        return times;
    }
    
    public void atribuirTimesOficiais(Time time) throws Exception {
        String sql = "UPDATE time_table SET nome = 'Qatar' AND grupo = 1 WHERE id = 1";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.setString(2, Integer.toString(time.getGrupo()));
            ps.execute();
            ps.close();
            }
    }
}    


