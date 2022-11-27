package wcresults;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


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
    
    public String buscarTimeID(Time time) throws Exception {
        String sql = "SELECT nome FROM time_table WHERE id = ?";
        try ( Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            String nome = "";
            ps.setInt(1, time.getId());
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                nome = (rs.getString(2));
            }
            return nome;
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
    
    public List <Time> buscarTimesTela() throws Exception {
        String sql = "SELECT * FROM time_table";
        List <Time> times = new ArrayList<>();
        try ( Connection c = ConnectionFactory.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql)) {
            try ( ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String nome = rs.getString("nome");
                    int grupo = rs.getInt("grupo");
                    times.add(new Time (id, nome, grupo));
                }
            }
        }
        return times;
    }
    
    public Time[] obterTimes() throws Exception {
        String sql = "SELECT * FROM time_table";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql,
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = ps.executeQuery()) {
            int totalDeTimes = rs.last() ? rs.getRow() : 0;
            Time[] times = new Time[totalDeTimes];
            rs.beforeFirst();
            int contador = 0;
            while (rs.next()) {
                int id = rs.getInt("id");
                times[contador++] = new Time(id);
            }
            return times;
        }
    }
    
    public void alterarTime(Time time) {
        String sql = "UPDATE time_table SET nome = ? WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.setInt(2, time.getId());
            ps.execute();
            ps.close();
            }
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar funcionario" + erro);
        }
    }
    
    public List <Time> buscarTimes() throws Exception {
        String sql = "SELECT id, nome FROM time_table";
        ArrayList <Time> times = new ArrayList<>();
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
    
    public List <Time> buscarTimesLista() throws Exception {
        String sql = "SELECT nome FROM time_table";
        ArrayList <Time> timesNomes = new ArrayList<>();
        try (Connection c = ConnectionFactory.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql)){
            try (ResultSet rs = ps.executeQuery()){
                while (rs.next()){
                    String nome = rs.getString("nome");
                    timesNomes.add(new Time (nome));
                }
            }
        }
        return timesNomes;
    }
    
    public Time getTime(int id) throws SQLException {
        String sql = "SELECT nome FROM time_table WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_UPDATABLE)) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            ps.close();
            Time time = new Time();
            //Posicional     o ResultSet na primeria posição
            rs.first();
            time.setId(id);
            time.setNome(rs.getString("nome"));
            return time;
            }
    }
    
    public void atribuirOficiais(Time time) {
        String sql = "UPDATE time_table SET nome = ? AND grupo = ? WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.setInt (2, time.getGrupo());
            ps.setInt(3, time.getId());
            ps.execute();
            ps.close();
            }
        catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Falha ao alterar funcionario" + erro);
        }
    }
    
    public void atribuirTimesOficiais(Time time) throws Exception {
        String sql = "UPDATE time_table SET nome = ? AND grupo = ? WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.setString(2, Integer.toString(time.getGrupo()));
            ps.execute();
            ps.close();
            }
    }
    
}    


