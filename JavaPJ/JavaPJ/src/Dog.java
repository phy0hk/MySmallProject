public class Dog extends Animal {
    private int weight;

    public Dog(String name, String color,int weight) {
        super(name, color);
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        return "Dog[Name: "+getName()+", Color: "+getColor()+", Weight: "+weight;
    }
    public void makeSound() {
        System.out.println("Dog says Woff Woff");
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
