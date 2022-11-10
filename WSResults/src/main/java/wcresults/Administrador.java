package wcresults;

public class Administrador {
    private String nome;
    private String login;
    private String senha;

    //redefinir construtor
    public Administrador(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    //metodos de acesso (getters) e métodos modificadores (setters)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
    
    //matheus é uma puta
}
