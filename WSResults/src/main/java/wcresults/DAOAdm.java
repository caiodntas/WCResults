package wcresults;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOAdm {
    public boolean existeAdm (Administrador administrador) throws Exception {
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
    
    public boolean existeAdm1 (Administrador administrador) throws Exception {
        String sql = "SELECT * FROM adm_table WHERE login = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
    
    public void excluirAdm(Administrador administrador) throws Exception {
        String sql = "DELETE FROM adm_table WHERE id = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setInt(1, administrador.getId());
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
    
    public List <Administrador> buscarAdms() throws Exception {
        String sql = "SELECT id, login, senha FROM adm_table";
        List <Administrador> adms = new ArrayList<>();
        try ( Connection c = ConnectionFactory.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql)) {
            try ( ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String login = rs.getString("login");
                    String senha = rs.getString("senha");
                    adms.add(new Administrador(id, login, senha));
                }
            }
        }
        return adms;
    }
    
    public Administrador[] obterAdministradores() throws SQLException {
        String sql = "SELECT id FROM adm_table";
        try (Connection c = ConnectionFactory.obtemConexao();
        PreparedStatement ps = c.prepareStatement(sql,
        ResultSet.TYPE_SCROLL_INSENSITIVE,
        ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = ps.executeQuery()){
            int totalDeAdms = rs.last()? rs.getRow() : 0;
            Administrador [] adms = new Administrador [totalDeAdms];
            rs.beforeFirst();
            int contador = 0;
            
            while (rs.next()) {
                int id = rs.getInt("id");
                adms[contador++] = new Administrador (id); 
                
            } return adms;
        }
    }
    
}    



