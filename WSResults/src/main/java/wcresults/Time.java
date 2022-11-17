package wcresults;

import java.util.Random;

public class Time {
    private int codigo;
    private String nome;
    private Boolean oficial;
    
    //construtor
    public Time(int codigo, String nome, Boolean oficial) {
        this.codigo = codigo;
        this.nome = nome;
        this.oficial = oficial;
    }
    
    //getters and setters

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getOficial() {
        return oficial;
    }

    public void setOficial(Boolean oficial) {
        this.oficial = oficial;
    }
    
    Random random = new Random(32);
}
