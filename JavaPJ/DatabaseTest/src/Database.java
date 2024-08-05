import java.sql.*;
public class Database {
    public Connection Connect(String server,String Username,String password){
        Connection connection = null;
         try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection(server, Username, password);
            System.out.println("!!! DB Connected !!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection; 
    }


    //statement //true for get output from select statement //false for not getting output
    public void Statement(String quary,Connection connection,boolean showOutput){
        try {
            Statement statement;
            statement = connection.createStatement();
            if (showOutput) {
            ResultSet resultSet;
            resultSet = statement.executeQuery(quary);
            ResultSetMetaData rsmd = resultSet.getMetaData();
            while (resultSet.next()) {
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {                   
                System.out.print(rsmd.getColumnName(i)+": "+resultSet.getString(i)+ "\t");
                }
                System.out.println();
            }
            resultSet.close();   
            }else{
                statement.execute(quary);
            }
            System.out.println("Quary Success!");
            System.out.println();
            statement.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println();
        }
    }

}
