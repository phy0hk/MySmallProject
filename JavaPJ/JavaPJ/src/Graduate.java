public class Graduate extends Student{
    private String thesisTitle;
    public Graduate(int id,String name,double gpa,String thesisTitle){
        super(id,name,id);
        this.thesisTitle = thesisTitle;
    }
    public String getThesisTitle(){
        
    }
}
