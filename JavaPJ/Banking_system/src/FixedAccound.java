public class FixedAccound extends Banking {
int NumbersOfYear;
    public FixedAccound(String name, double balance,int NumbersOfYear) {
        super(name, balance);
        this.NumbersOfYear = NumbersOfYear;
    }
    @Override
    public double withdraw(double amount) {
        System.out.println("FixedAccount Can't Be Withdraw!");
        return balance;
    }
    @Override
    public double deposit(double amount) {
        return this.balance = balance + amount;
    }
    @Override
    public double interest() {
        double interestRate = 0.096;
        for(int i=1;i<=NumbersOfYear;i++){
            this.balance = balance + (balance*interestRate);
        }
        return balance;
    }
}
