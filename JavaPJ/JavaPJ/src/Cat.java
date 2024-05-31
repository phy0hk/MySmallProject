public class Cat extends Animal {
    private int age;

    public Cat(String name, String color,int age) {
        super(name, color);
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "Dog[Name: "+getName()+" Color: "+getColor()+" Weight: "+age;
    }
    public void makeSound() {
        System.out.println("Cat says Meow Meow");
    }public int getAge() {
        return age;
    }public void setAge(int age) {
        this.age = age;
    }

}
