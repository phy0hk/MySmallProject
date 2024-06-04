public class App {
    public static void main(String[] args) throws Exception {
        Banking ac0 = new Account("KZH", 100000);
        System.out.println(ac0.deposit(1000));
        ac0.balance();
        System.out.println(ac0);

        Banking ac1 = new FixedAccound("LMT", 200000, 1);
        ac1.interest();
        System.out.println(ac1);

        Banking ac2 = new Saving("PHK", 100000000, 2);
        ac2.interest();
        System.out.println(ac2);
    }
}
