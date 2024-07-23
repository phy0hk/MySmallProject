import java.util.Scanner;

public class PutInTheBox {
    public static void main(String[] args) {
        double NumsOfStick = InputText("Enter Number of Sticks :");
        System.out.println(CalcCorB("can", NumsOfStick));
        System.out.println(CalcCorB("box", NumsOfStick));
    }



    
    public static double InputText(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextDouble();   
    }



    public static String CalcCorB(String CorB,double NOS){
        if (CorB.equalsIgnoreCase("can")) {
            return "Numbers of cans"+Math.ceil(NOS/3);    
        }
        if (CorB.equalsIgnoreCase("box")) {
            return "Numbers of box"+Math.ceil(NOS/3/5);
        }
        return "null";
    }
}
