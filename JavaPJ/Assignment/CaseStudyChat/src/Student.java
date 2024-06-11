package Assignment.CaseStudyChat.src;

public class Student {
    String name,classCode;
    public Student(String name,String classCode){
        this.name = name;
        this.classCode = classCode;
    }
    public void reply(Student s) {
        System.out.println(s.getName()+"");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
