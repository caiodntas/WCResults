package wcresults;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String usuario = "root";
    private String senha = "anima123";
    private String host = "localhost";
    private String porta = "3306";
    private String bd = "wc_results";

    public Connection obtemConexao (){
        try{
            Connection c = DriverManager.getConnection("jdbc:mysql://" + host + ":" + porta + "/" + bd, usuario, senha);
            return c;
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
