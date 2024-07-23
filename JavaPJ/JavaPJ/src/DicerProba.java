import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class DicerProba {
    public static void main(String[] args) {
        double ProbaArr[] = {0,0,0,0,0,0,0,0,0,0,0,0};
        Random random = new Random();
        for (int i = 0; i <= 100000; i++) {
            int dice1 = random.nextInt(6)+1;
            int dice2 = random.nextInt(6)+1;
            int totalDice = dice1 + dice2;
            ProbaArr[(int)totalDice-1] += 1;
        }
        for (int i = 1; i < 12; i++) {
            ProbaArr[i] = (ProbaArr[i]*100)/100000;
            System.out.println("DiceNum "+(i+1)+ ": "+ ProbaArr[i]+"%");
        }
        
    }
}
