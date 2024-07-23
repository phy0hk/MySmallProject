/**
 * School
 */
/**
 * School
 */
public abstract class School {
    String name;
    String address;
    String phno;
    public School(String name,String address,String phno){
        this.name = name;
        this.address = address;
        this.phno = phno;
    }
    public String getAddress() {
        return address;
    }
    public String getName() {
        return name;
    }
    public String getPhno() {
        return phno;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
    @Override
    public String toString() {
        return "Name : "+ name+"\nAddress : "+address+"\nPhone Number : "+ phno;
    }
    protected abstract void doAssignment();
    protected abstract void takeexam();
}