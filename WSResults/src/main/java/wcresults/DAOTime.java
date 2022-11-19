package wcresults;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DAOTime {
    public boolean exibirTime (Time time) throws Exception {
        String sql = "SELECT * FROM time_table WHERE nome = ? AND grupo = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, time.getNome());
            ps.setString(2, time.getGrupo());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    public void cadastrarAdm(Administrador administrador) throws Exception {
        String sql = "INSERT INTO adm_table(login, senha) VALUES(?,?)";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.setString(2, administrador.getSenha());
            ps.execute();
            ps.close();
            }
    }
    
    public void excluirAdm(Administrador administrador) throws Exception {
        String sql = "DELETE FROM adm_table WHERE login = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.execute();
            ps.close();
        }
    }    
    public void atualizarLoginAdm(Administrador administrador) throws Exception {
        String sql = "UPDATE adm_table SET login = ? WHERE login = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.execute();
            ps.close();
            }
    }
    public void atualizarSenhaAdm(Administrador administrador) throws Exception {
        String sql = "UPDATE adm_table SET senha = ? WHERE login = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.setString(2, administrador.getSenha());
            ps.execute();
            ps.close();
            }
    }
    
    
    
    public int atribuirTimes(int times[]) throws Exception {
        for (time = 0; time < 32; time++)
        update time set.grupo    
    }
}    


