public abstract class Animal {
    private String name,color;

    public Animal(String name,String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Animal [name=" +name+" color="+color+"]";        
    }
    public String getColor() {
        return color;
    }public void setColor(String color) {
        this.color = color;
    }public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public abstract void makeSound();
}
