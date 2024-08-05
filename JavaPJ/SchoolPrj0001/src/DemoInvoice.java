public class DemoInvoice {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println();
        Invoice payableItem = new Invoice("02995", "Laptop", 2, 375.00);
        System.out.println(payableItem);
    }
}