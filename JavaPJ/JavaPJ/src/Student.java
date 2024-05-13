import java.util.jar.Attributes.Name;

public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(int id,String name,double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public Student(int id,double gpa){
        this(id,"",gpa);
    }
    public String getName(){
        return name;
    }
    public void Name(String name)
    {
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getGPA(){
        return gpa;
    }
    public void setGPA(double gpa){
        this.gpa = gpa;
    }
    public String toString(){
        return "Student-ID "+id+"\nName "+name+"\nGPA"+gpa;
    }
}
