/**
 * Document
 */
public class Document implements InterfacePrint{
    String text ;
     Document(String text){
        this.text = text;
    }
    @Override
    public void print() {
        System.out.println(text); 
    }
}