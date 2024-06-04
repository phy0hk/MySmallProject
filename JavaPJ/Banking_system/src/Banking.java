public abstract class Banking {
    String name;
    double balance;
    double amount;
    public Banking(String name,double balance){
        this.name = name;
        this.balance = balance;
    }
    public void balance(){
        System.out.println("Balance: "+balance);
    }
    public abstract double withdraw(double amount);
    public abstract double deposit(double amount);
    public abstract double interest();

    @Override
    public String toString() {
        return "Name: "+name+",\n Balance:"+balance;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public double getBalance() {
        return balance;
    }
    public String getName() {
        return name;
    }public void setBalance(double balance) {
        this.balance = balance;
    }public void setName(String name) {
        this.name = name;
    }
}
