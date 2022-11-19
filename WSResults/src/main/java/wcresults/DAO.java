package wcresults;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAO {
    public boolean existeAdm (Administrador administrador) throws Exception {
        String sql = "SELECT * FROM wc_results WHERE login = ? AND senha = ?";
        try (Connection c = ConnectionFactory.obtemConexao();
            PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, administrador.getLogin());
            ps.setString(2, administrador.getSenha());
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }
}    


