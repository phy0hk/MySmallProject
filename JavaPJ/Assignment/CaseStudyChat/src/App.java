package Assignment.CaseStudyChat.src;

public class App {
    public static void main(String[] args) throws Exception {
        Student st0 = new Student("KZH","11A2");
        Student st1 = new Student("LMT","11A2");

        st0.reply(st1);
    }
}
