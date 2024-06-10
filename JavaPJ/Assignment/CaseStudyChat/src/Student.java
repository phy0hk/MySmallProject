package Assignment.CaseStudyChat.src;

public class Student {
    String name,classCode;
    public Student(String name,String classCode){
        this.name = name;
        this.classCode = classCode;
    }
    public void reply(Student l) {
        System.out.println(l.getName()+"");
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
