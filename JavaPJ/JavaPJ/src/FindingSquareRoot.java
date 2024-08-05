import java.util.InputMismatchException;
import java.util.Scanner;

public class FindingSquareRoot {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
        System.out.println("Enter a number : ");
        double no = scanner.nextDouble();

        double sqt = Math.sqrt(no);
        System.out.printf("Square root of %.2f is %.2f ",no,sqt);
        } catch (InputMismatchException e) {
            System.out.println("Enter number only.......");
        } catch(IllegalArgumentException e){
            System.out.println("Enter positive number only......");
        }
 
    }
}
