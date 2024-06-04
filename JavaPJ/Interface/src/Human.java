public class Human implements Movable{
    private String name;
    private int age;
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human [name = "+name+", age = "+age+"]";
    }
    public void move(){
        System.out.println("Human move by walking......");
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}