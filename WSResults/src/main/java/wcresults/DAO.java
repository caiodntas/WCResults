package wcresults;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
Import javax.swing.JOptionPane;

public class DAO {
    public boolean exibirAdm (Administrador administrador) throws Exception {
        String sql = "SELECT * FROM adm_table WHERE login = ? AND senha = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.setString(2, administrador.getSenha());
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


