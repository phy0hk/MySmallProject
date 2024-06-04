public class Bird implements Movable{
    int NumbersOfWings;
    public Bird(int wings){
        NumbersOfWings = wings;
    }
    @Override
    public String toString() {
        return "Birds [Number Of Wings = "+NumbersOfWings+"]";
    }
    public void move(){
        System.out.println("Birds move by Flying.....");
    }
}
