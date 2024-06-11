import java.util.Arrays;

public class MarkRecord implements Comparable<MarkRecord>{
    private String StdName;
    private String Subject;
    private Integer Mark;

    public MarkRecord(String StdName,String Subject,int Mark){
        this.StdName = StdName;
        this.Subject = Subject;
        this.Mark = Mark;
    }
    @Override
    public String toString() {
        return String.format("Student(%s , %d)",StdName,Mark);
    }
    @Override
    public int compareTo(MarkRecord o) {
        return o.Mark.compareTo(Mark);
    }
    public static void main(String[] args) {
        MarkRecord gg[] = {
        new MarkRecord("John", "IT", 58),
        new MarkRecord("Paul", "Japan", 64),
        new MarkRecord("Mary", "English", 87),
        new MarkRecord("Simon", "Math", 41),
        new MarkRecord("Jack", "Chemistry", 75)
    };
    Arrays.sort(gg);

    for(MarkRecord gg0 : gg){
        System.out.println(gg0);
    }
}
}
