public class parttime extends teacher{
    public parttime(String name, String address,String phno, String major) {
        super(name, address, phno, major);
    }  
    @Override
    public int Salary(int hour){
        return hour * 8;
    }
}
