package wcresults;

public class Time {
    private int id;
    private String nome;
    private int grupo;
    private int gols;

    //construtor
    public Time(int id, String nome, int grupo) {
        this.id = id;
        this.nome = nome;
        this.grupo = grupo;
    }
    
    public Time(int id, String nome, int grupo, int gols) {
        this.id = id;
        this.nome = nome;
        this.grupo = grupo;
        this.gols = gols;
    }

    public Time(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    public Time(String nome) {
        this.nome = nome;
    }
    
    public Time(int id) {
        this.id = id;
    }
    public Time() {

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

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }
    
    @Override
    public String toString() {
        return this.nome;
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
        String inserirIr?? = "INSERT INTO time_table (nome, grupo) VALUES ('Ir??', 'B')";
        String inserirEstadosUnidos = "INSERT INTO time_table (nome, grupo) VALUES ('Estados Unidos', 'B')";
        String inserirPaisDeGales = "INSERT INTO time_table (nome, grupo) VALUES ('Pa??s de Gales ', 'B')";
        //GRUPO C
        String inserirArgentina = "INSERT INTO time_table (nome, grupo) VALUES ('Argentina', 'C')";
        String inserirArabiaSaudita = "INSERT INTO time_table (nome, grupo) VALUES ('Ar??bia Saudita', 'C')";
        String inserirMexico = "INSERT INTO time_table (nome, grupo) VALUES ('M??xico', 'C')";
        String inserirPolonia = "INSERT INTO time_table (nome, grupo) VALUES ('Pol??nia ', 'C')";
        //GRUPO D
        String inserirFranca = "INSERT INTO time_table (nome, grupo) VALUES ('Fran??a', 'D')";
        String inserirAustralia = "INSERT INTO time_table (nome, grupo) VALUES ('Austr??lia', 'D')";
        String inserirDinamarca = "INSERT INTO time_table (nome, grupo) VALUES ('Dinamarca', 'D')";
        String inserirTunisia = "INSERT INTO time_table (nome, grupo) VALUES ('Tun??sia', 'D')";
        //GRUPO E
        String inserirEspanha = "INSERT INTO time_table (nome, grupo) VALUES ('Espanha', 'E')";
        String inserirCostaRica = "INSERT INTO time_table (nome, grupo) VALUES ('Costa Rica', 'E')";
        String inserirAlemanha = "INSERT INTO time_table (nome, grupo) VALUES ('Alemanha', 'E')";
        String inserirJapao = "INSERT INTO time_table (nome, grupo) VALUES ('Jap??o', 'E')";
        //GRUPO F
        String inserirBelgica = "INSERT INTO time_table (nome, grupo) VALUES ('B??lgica', 'F')";
        String inserirCanada = "INSERT INTO time_table (nome, grupo) VALUES ('Canad??', 'F')";
        String inserirMarrocos = "INSERT INTO time_table (nome, grupo) VALUES ('Marrocos', 'F')";
        String inserirCroacia = "INSERT INTO time_table (nome, grupo) VALUES ('Cro??cia', 'F')";
        //GRUPO G
        String inserirBrasil = "INSERT INTO time_table (nome, grupo) VALUES ('Brasil', 'G')";
        String inserirServia = "INSERT INTO time_table (nome, grupo) VALUES ('S??rvia', 'G')";
        String inserirSuica = "INSERT INTO time_table (nome, grupo) VALUES ('Su????a', 'G')";
        String inserirCamaroes = "INSERT INTO time_table (nome, grupo) VALUES ('Camar??es', 'G')";
        //GRUPO H
        String inserirPortugal = "INSERT INTO time_table (nome, grupo) VALUES ('Portugal', 'H')";
        String inserirGana = "INSERT INTO time_table (nome, grupo) VALUES ('Gana', 'H')";
        String inserirUruguai = "INSERT INTO time_table (nome, grupo) VALUES ('Uruguai', 'H')";
        String inserirRepublicaDaCoreia = "INSERT INTO time_table (nome, grupo) VALUES ('Rep??blica da Coreia', 'H')";
        }*/
}
