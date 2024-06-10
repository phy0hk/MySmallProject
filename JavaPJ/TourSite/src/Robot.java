public class Robot implements Greetable{
    private String model;
    public Robot(String model){
        super();
        this.model = model;
    }
    @Override
    public void greet(){
        System.out.println(model+" Robot is speaking");
    }
    @Override
    public String toString() {
        return "Robot [model = "+model+"]";
    }
}
