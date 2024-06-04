public class Saving extends Banking{
    int NumbersOfYear;
    public Saving(String name, double balance,int NumbersOfYear) {
        super(name, balance);
        this.NumbersOfYear = NumbersOfYear;
    }
    @Override
    public double withdraw(double amount) {
        return balance;
    }
    @Override
    public double deposit(double amount) {
        return this.balance = balance + amount;
    }
    @Override
    public double interest() {
        double interestRate = 0.06;
        for(int i=1;i<=NumbersOfYear;i++){
            this.balance = balance + (balance*interestRate);
        }
        return balance;
    }
}
