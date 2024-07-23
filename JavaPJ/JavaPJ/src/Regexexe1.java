public class Regexexe1 {
    public static void main(String[] args) {
        String input = "DoB-June 15 2000";
        String DoBPattern = "DoB-\\w+.+{3,8}\\s\\d+.+{1,2}\\s\\d+.+{4}";
        System.out.println(input+">"+input.matches(DoBPattern));
    }
}
