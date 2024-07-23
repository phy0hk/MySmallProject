public class RegexExc2 {
    public static void main(String[] args) {
        String input = "Hello! I am John. How are you?";
        String out[] = input.split("[!?\\. ]");
        for(String d:out){
            System.out.println("Data: "+d);
        }
    }
}
