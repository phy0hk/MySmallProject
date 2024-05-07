import java.util.Scanner;

public class MarkCheck2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your mark:");
        int mark = s.nextInt();
        try{
            check(mark);
        }catch(InvalidMarkException e){
            System.out.println("Exception occur...");
            System.out.println(e.toString());
        }
        s.close();
    }
    public static void check(int mark) throws InvalidMarkException{
        if(mark<0 || mark>100){
            throw new InvalidMarkException();
        }
        if(mark>39){
            System.out.println("Pass");
        }
    }
}
class InvalidMarkException extends Exception{
    public String toString(){
        return "Given mark is not in valid range(0-100)";
    }
}

