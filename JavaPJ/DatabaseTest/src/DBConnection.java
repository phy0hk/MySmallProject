import java.sql.*;

public class DBConnection {
    
    public static void main(String[] args){
        Connection connection = null;
        // connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingcentredb","root","");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            System.out.println("!!! DB Connected !!!");
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "CALL `ShowBatchDB`");
            int BatchCode,Duration,CourseFee,NetIncome,ExpectedIncome,CourseCode;
            String Date;
            System.out.println("BatchCode StartingDate Duration CourseFee Netincome ExpectedIncome Coursecode");
            while (resultSet.next()) {
                BatchCode = resultSet.getInt(1);
                Date = resultSet.getString(2);
                Duration = resultSet.getInt(3);
                CourseFee = resultSet.getInt(4);
                NetIncome = resultSet.getInt(5);
                ExpectedIncome = resultSet.getInt(6);
                CourseCode = resultSet.getInt(7);
                System.out.println("|"+BatchCode+"|\t|"+Date+"|\t\t|"+Duration+"|\t|"+CourseFee+"|\t|"+NetIncome+"|\t|"+ExpectedIncome+"|\t\t|"+CourseCode);
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}