import java.sql.*;

public class DBConnection0 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trainingcentredb", "root", "");
            System.out.println("!!! DB Connected !!!");
             Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("CALL Check_Student('St002')");
            String StudentId,StudentName,Address,Email;
            int age;
            while (resultSet.next()) {
                StudentId = resultSet.getString(1);
                StudentName = resultSet.getString(2);
                age = resultSet.getInt(3);
                Address = resultSet.getString(4);
                Email = resultSet.getString(5);
                System.out.println(StudentId+"\t"+StudentName+"\t"+age+"\t"+Address+"\t"+Email);
            }
            // resultSet = statement.executeQuery("CALL StudentEntry('St111','KyawKyaw',10,'Home','Kyaw@email.com')");
            // resultSet = statement.executeQuery("CALL StEntryRemove('St111')");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
