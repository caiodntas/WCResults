package wcresults;
import java.util.Random;

public class Grupo {
    
    int times[] = new int [32];
    
    Random r = new Random();
    int vaga1 = 0;
    int vaga2 = 0;
    int vaga3 = 0;
    int vaga4 = 0;
    int vaga5 = 0;
    int vaga6 = 0;
    int vaga7 = 0;
    int vaga8 = 0;
    
    int time = 0;
    
    while (Time < 32) {
        int grupo = r.nextInt(8)+1;
        switch (grupo) {
            case 1:
                if (vaga1 < 4) {
                times [time] = "A";
                vaga1++; time++;}
            break;
        }
    }
}    

