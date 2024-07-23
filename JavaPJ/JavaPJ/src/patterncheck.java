public class patterncheck {
    public static void main(String[] args) {
        String pattern = "[0-9]{1,}";
        String input = "09039491";

        System.out.println(input+">"+input.matches(pattern));

        input = "ldjsaf1-94r";
        System.out.println(input+">"+input.matches(pattern));

        String nrcPattern = "[0-9]{1,2}\\/[A-z]{6,12}\\([A-Z]\\)[0-9]{6}";
        String nrc = "12/Ahsana(N)266355";

        System.out.println(nrc +">"+nrc.matches(nrcPattern));

        String emailPattern = "[\\w\\.]+@\\w+.\\w+";
        String email = "goodgameman@hotmail.com";
        System.out.println(email+">"+email.matches(emailPattern));

        String text0= "1 2, 1 3#, 5, 8, 9# 7";
        String data[] = text0.split("[,#] *");
    }
}
