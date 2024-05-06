public class ErrorHandle {
    public static void main(String[] args) {
        try{
            String text = "two";
            int base = Integer.parseInt(text);
            int result = 256/base ;
            System.out.println("Result"  + result);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
    }
}
