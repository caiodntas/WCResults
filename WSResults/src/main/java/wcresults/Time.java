package wcresults;

public class Time {
    private int id;
    private String nome;
    private int grupo;

    //construtor
    public Time(int id, String nome, int grupo) {
        this.id = id;
        this.nome = nome;
        this.grupo = grupo;
    }

    public Time(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getGrupo() {
        return grupo;
    }
    
    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }
    
    /*public void importarOficiais(){
        //LIMPAR TABELA DE TIMES PARA RECEBER NOVOS
        String cleanTable = "DELETE * FROM time_table";
        
        //GRUPO A
        String inserirQatar = "INSERT INTO time_table (nome, grupo) VALUES ('Qatar', 'A')";
        String inserirEquador = "INSERT INTO time_table (nome, grupo) VALUES ('Equador', 'A')";
        String inserirSenegal = "INSERT INTO time_table (nome, grupo) VALUES ('Senegal', 'A')";
        String inserirHolanda = "INSERT INTO time_table (nome, grupo) VALUES ('Holanda', 'A')";
        //GRUPO B
        String inserirInglaterra = "INSERT INTO time_table (nome, grupo) VALUES ('Inglaterra', 'B')";
        String inserirIrã = "INSERT INTO time_table (nome, grupo) VALUES ('Irã', 'B')";
        String inserirEstadosUnidos = "INSERT INTO time_table (nome, grupo) VALUES ('Estados Unidos', 'B')";
        String inserirPaisDeGales = "INSERT INTO time_table (nome, grupo) VALUES ('País de Gales ', 'B')";
        //GRUPO C
        String inserirArgentina = "INSERT INTO time_table (nome, grupo) VALUES ('Argentina', 'C')";
        String inserirArabiaSaudita = "INSERT INTO time_table (nome, grupo) VALUES ('Arábia Saudita', 'C')";
        String inserirMexico = "INSERT INTO time_table (nome, grupo) VALUES ('México', 'C')";
        String inserirPolonia = "INSERT INTO time_table (nome, grupo) VALUES ('Polônia ', 'C')";
        //GRUPO D
        String inserirFranca = "INSERT INTO time_table (nome, grupo) VALUES ('França', 'D')";
        String inserirAustralia = "INSERT INTO time_table (nome, grupo) VALUES ('Austrália', 'D')";
        String inserirDinamarca = "INSERT INTO time_table (nome, grupo) VALUES ('Dinamarca', 'D')";
        String inserirTunisia = "INSERT INTO time_table (nome, grupo) VALUES ('Tunísia', 'D')";
        //GRUPO E
        String inserirEspanha = "INSERT INTO time_table (nome, grupo) VALUES ('Espanha', 'E')";
        String inserirCostaRica = "INSERT INTO time_table (nome, grupo) VALUES ('Costa Rica', 'E')";
        String inserirAlemanha = "INSERT INTO time_table (nome, grupo) VALUES ('Alemanha', 'E')";
        String inserirJapao = "INSERT INTO time_table (nome, grupo) VALUES ('Japão', 'E')";
        //GRUPO F
        String inserirBelgica = "INSERT INTO time_table (nome, grupo) VALUES ('Bélgica', 'F')";
        String inserirCanada = "INSERT INTO time_table (nome, grupo) VALUES ('Canadá', 'F')";
        String inserirMarrocos = "INSERT INTO time_table (nome, grupo) VALUES ('Marrocos', 'F')";
        String inserirCroacia = "INSERT INTO time_table (nome, grupo) VALUES ('Croácia', 'F')";
        //GRUPO G
        String inserirBrasil = "INSERT INTO time_table (nome, grupo) VALUES ('Brasil', 'G')";
        String inserirServia = "INSERT INTO time_table (nome, grupo) VALUES ('Sérvia', 'G')";
        String inserirSuica = "INSERT INTO time_table (nome, grupo) VALUES ('Suíça', 'G')";
        String inserirCamaroes = "INSERT INTO time_table (nome, grupo) VALUES ('Camarões', 'G')";
        //GRUPO H
        String inserirPortugal = "INSERT INTO time_table (nome, grupo) VALUES ('Portugal', 'H')";
        String inserirGana = "INSERT INTO time_table (nome, grupo) VALUES ('Gana', 'H')";
        String inserirUruguai = "INSERT INTO time_table (nome, grupo) VALUES ('Uruguai', 'H')";
        String inserirRepublicaDaCoreia = "INSERT INTO time_table (nome, grupo) VALUES ('República da Coreia', 'H')";
        }*/
}
