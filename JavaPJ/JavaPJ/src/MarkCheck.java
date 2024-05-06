import java.util.Scanner;

public class MarkCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your mark:")  ;
        int mark = s.nextInt();

        if(mark<0 || mark>100){
            throw new IllegalArgumentException("Invalid Mark!");
        }
        if (mark>39) {
            System.out.println("Pass");
        }
        s.close();
    }
}
