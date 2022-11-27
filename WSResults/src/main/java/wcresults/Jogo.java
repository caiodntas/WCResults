
package wcresults;

public class Jogo {
    int golsTime1;
    int golsTime2;
    
    //construtor
    public Jogo(int golsTime1, int golsTime2) {
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }
    
    //getters and setters

    public int getGolsTime1() {
        return golsTime1;
    }

    public void setGolsTime1(int golsTime1) {
        this.golsTime1 = golsTime1;
    }

    public int getGolsTime2() {
        return golsTime2;
    }

    public void setGolsTime2(int golsTime2) {
        this.golsTime2 = golsTime2;
    }
}
