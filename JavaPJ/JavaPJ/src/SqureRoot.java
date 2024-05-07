import java.util.Scanner;

public class SqureRoot {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in);) {
            System.out.println("Enter number: ");
            double g = scanner.nextDouble();
            double sqrt = Math.sqrt(g);
            System.out.printf("Squre root of %.2f is %.2f%n", g, sqrt);
        } catch (Exception e) {
            System.out.println("Error occur...");
            System.out.println(e.getStackTrace());
        }
    }
}
