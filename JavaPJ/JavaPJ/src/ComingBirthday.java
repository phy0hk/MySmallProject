import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ComingBirthday {
    public static void main(String[] args) {
        System.out.println("Enter Your Birthday in dd-mm-yyyy (Eg. 1-1-2000)");
        ComingBirthdayCalculator();
    }


    public static void ComingBirthdayCalculator(){
        Scanner scanner = new Scanner(System.in);
        String birthdayIn = scanner.next();
        String splitBD[] = birthdayIn.split("-");
        if (splitBD[0].length()<2) {
            splitBD[0] = "0"+splitBD[0];
        }
        if (splitBD[1].length()<2) {
            splitBD[1] = "0"+splitBD[1];
        }
        LocalDate Birthday = LocalDate.parse(splitBD[2]+"-"+splitBD[1]+"-"+splitBD[0]);
        LocalDate date = LocalDate.now();
        Period age = Period.between(Birthday, date);
        System.out.println("You're "+age.getYears()+" years old You'll Become "+(12-age.getYears()+1)+" years old in "+((int)Math.abs(age.getMonths()))+" months and "+(age.getDays())+" days");
        scanner.close();
    }
}
