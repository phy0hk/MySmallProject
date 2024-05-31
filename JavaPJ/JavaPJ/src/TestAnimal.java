public class TestAnimal{
    public static void main(String[] args){
        Animal a1 = new Dog("Jetli","Black",30);
        Animal a2 = new Dog("Jetli","Black",30);
        System.out.println(a1);
        System.out.println(a2);
    
        a1.makeSound();
        a2.makeSound();
    }
}