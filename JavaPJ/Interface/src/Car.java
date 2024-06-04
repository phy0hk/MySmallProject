/**
 * Car
 */
public class Car implements Movable{
    private String engine,model;
    public Car(String engine,String model){
        this.engine= engine;
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car [ Engine = "+engine+", Model = "+model+"]";
    }
    public void move(){
        System.out.println("Cars move by using wheels ......");
    }
}