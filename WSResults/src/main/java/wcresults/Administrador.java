package wcresults;

public class Administrador {
    private String login;
    private String senha;

    //redefinir construtor
    public Administrador(String login, String senha) { 
        this.login = login;
        this.senha = senha;
    }
    
    //metodos de acesso (getters) e métodos modificadores (setters)

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public static String cadastrarAdm(String login, String senha) {
        Administrador adm = new Administrador(login, senha);
        adm.setLogin(login);
        adm.setSenha(senha);
        
        return null;
    }
}
