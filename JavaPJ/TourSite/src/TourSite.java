/**
 * TourSite
 */
public class TourSite implements Greetable{
    private String location;
    public TourSite(String location){
        super();
        this.location = location;
    }
    @Override
    public void greet() {
        System.out.println("Greeting from "+ location);
    }
    @Override
    public String toString() {
        return "TourSite [Location = "+location+"]";
    }
}