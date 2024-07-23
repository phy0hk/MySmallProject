import java.util.Comparator;

public class student extends School{
    String email;
    String Student_ID;
    public student(String name, String address,String phno,String email,String Student_ID) {
        super(name, address, phno);
        this.email = email;
        this.Student_ID = Student_ID;
    }
    public void takeexam(){
        System.out.println("Just taking a exam!!");
    }
    public void doAssignment(){
        System.out.println("Do Homework you son of a gun!!");
    }
    // @Override
    // public int compareTo(student o) {
    //     return name.compareTo(o.name);
    // }
}
class SortByName implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return o1.name.compareTo(o2.name);
    }
}
class SortByStudentID implements Comparator<student>{
    @Override
    public int compare(student o1, student o2) {
        return o1.Student_ID.compareTo(o2.Student_ID);
    }
}
