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
    
    while (time < 32) {
        int grupo = r.nextInt(8)+1;
        switch (grupo) {
            case 1:
                if (vaga1 < 4) {
                times [time] = 1;
                vaga1++; time++;}
            break;
            case 2:
                if (vaga2 < 4) {
                times [time] = 1;
                vaga2++; time++;}
            break;
            case 3:
                if (vaga3 < 4) {
                times [time] = 1;
                vaga3++; time++;}
            break;
            case 4:
                if (vaga4 < 4) {
                times [time] = 1;
                vaga4++; time++;}
            break;
            case 5:
                if (vaga5 < 4) {
                times [time] = 1;
                vaga5++; time++;}
            break;
            case 6:
                if (vaga6 < 4) {
                times [time] = 1;
                vaga6++; time++;}
            break;
            case 7:
                if (vaga7 < 4) {
                times [time] = 1;
                vaga7++; time++;}
            break;
            case 8:
                if (vaga8 < 4) {
                times [time] = 1;
                vaga8++; time++;}
            break;
        }
    }
}    

