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
}
