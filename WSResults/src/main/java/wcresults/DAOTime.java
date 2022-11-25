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

            /*String exp = rs.getString("nome");
            RowId exp2 = rs.getRowId(2);
            
            while (rs.next()){
                time.setNome( rs.getString("nome"));
            }*/
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


