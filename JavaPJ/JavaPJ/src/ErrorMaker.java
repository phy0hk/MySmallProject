public class ErrorMaker {
    public static void main(String[] args) {
        try{
            String text = "zero";
            int x = Integer.parseInt(text);
            int r = 45/x;
            System.out.println(r);
        }catch(NumberFormatException e){
            System.out.println("Use numeric value only!");
        }catch(ArithmeticException e){
            System.out.println("Cannot use'0' to divide a number.");
        }catch(Exception e){
            System.out.println("Unexpected exception occur...");
            System.out.println(e);
        }finally{
            System.out.println("Finally clause always execute...");
        }
    }
}
