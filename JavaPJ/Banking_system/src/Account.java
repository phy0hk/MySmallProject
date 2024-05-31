public class Account extends Banking {

    public Account(String name, double balance) {
        super(name, balance);
        this.name = name;
        this.balance = balance;
    }
    
    @Override
    public double withdraw(double amount) {
        return this.balance = balance - amount;
    }public double deposit(double amount){
        return this.balance = balance + amount;
    }@Override
    public double interest() {
        return balance;
    }
}
