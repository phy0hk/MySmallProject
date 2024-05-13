/**
 * StaticEg
 */
public class StaticEg {
    int b = 10;
    static int a = 40;
    static {
        System.out.println("This is a static block");
    }

    void print() {
        System.out.println(b);
    }

    static void display() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        System.out.println(a);
        display();
        StaticEg obj = new StaticEg();
        obj.print();
    }
}