import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        Database DB = new Database();
        Connection connection = DB.Connect("jdbc:mysql://localhost:3306/trainingcentredb","root","");
        DB.Statement("DELETE FROM `student` WHERE `StudentID`='St011' a", connection,false);
        DB.Statement("CALL ShowStudentDB", connection,true);

    }
}
 