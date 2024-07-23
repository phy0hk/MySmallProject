public class TestStatic {
    int a = 4;
    static int b = 5;

    void display(){
        System.out.println("Non static method a: "+a);
        show();
        System.out.println("Non static method b: "+b);
    }
    static void show(){
        System.out.println("static method b: "+b);
    }
    public static void main(String[] args) {
        TestStatic ts = new TestStatic();
        new TestStatic().display();
        show();
new Testing().info();
    }
    public static class Testing{
        int c = 6;
        static int d = 8;
        void info(){
            System.out.println("Non static method c:" + c);
            System.out.println("Non static method d: "+ d);
        }
        static void info2(){
            System.out.println("I am batman!!!!");
            System.out.println("Wa na ta te wa ka te nai");
        }
    }
}
