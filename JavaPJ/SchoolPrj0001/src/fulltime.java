public class fulltime extends teacher{
    public fulltime(String name, String address,String phno, String major) {
        super(name, address, phno, major);
    }
    @Override
    public int Salary(int hour){
        return hour * 10;
    }
}
