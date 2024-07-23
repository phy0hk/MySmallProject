import java.util.Scanner;

public class Pythagora {
    public static void main(String[] args) throws Exception {
        double x1 = InputText("Enter first x position");
        double y1 = InputText("Enter first y position");
        double x2 = InputText("Enter second x position");
        double y2 = InputText("Enter second y position");
        System.out.println(calc(x1, y1, x2, y2));
    }
    
    public static double calc(double x1,double y1,double x2,double y2){
        double h = Math.sqrt(Math.pow(Math.abs(x2-x1), 2) + Math.pow(Math.abs(y2-y1), 2));
        return h;
    }
    public static double InputText(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();
    }
}
