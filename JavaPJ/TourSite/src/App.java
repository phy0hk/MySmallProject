public class App {
    public static void main(String[] args) throws Exception {
        Robot r = new Robot("G-3000");
        TourSite t = new TourSite("Land of Disney");
        Greetable g[] = {r,t};
        for(Greetable greeting:g){
            System.out.println(greeting);
            greeting.greet();
        }
    }
}
