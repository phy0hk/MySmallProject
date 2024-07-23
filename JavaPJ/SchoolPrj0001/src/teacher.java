public abstract class teacher extends School {
    String major;
    int hour;
    public teacher(String name, String address,String phno,String major) {
        super(name, address, phno);
        this.major = major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public int Salary(int hour){
        return 0;    
    }
}

