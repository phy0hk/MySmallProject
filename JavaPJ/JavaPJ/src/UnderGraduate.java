public class UnderGraduate extends Student{
    private String year;
    public UnderGraduate(int id,String name,double gpa){
        super(id,name,gpa);
        this.year = year;
    }
    public String getYear(){
        return year;
    }
    public void setYear(String year){
        this.year = year;
    }
}
