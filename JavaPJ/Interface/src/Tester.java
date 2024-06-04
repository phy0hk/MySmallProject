/**
 * Tester
 */
public class Tester {
    public static void main(String[] args) {
        Human h = new Human("Mary", 18);
        Car c = new Car("n-334", "1234");
        Bird b = new Bird(10);
        Movable n[] = { h, c, b };
        for (Movable mo : n) {
            System.out.println(mo);
            mo.move();
        }
        System.out.println(h.getName());
    }

}