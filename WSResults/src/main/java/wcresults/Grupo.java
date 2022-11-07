package wcresults;

public class Grupo {
    private String nome;
    private int codigo;
    
    //construtor
    public Grupo(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }
    
    //Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
       
}
