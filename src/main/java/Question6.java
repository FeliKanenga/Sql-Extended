import java.sql.*;

public class Question6 {
    public static void main(String[] args) {


        //Class.forName("org.postgresql.Driver");
        String message = "Question failed";
        String url = "jdbc:postgresql://localhost:8080/Umuzi";
        String user = "feli";
        String password = "passfeli";
        try {
            // Open a connection
            System.out.println("Connecting to a selected database...");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected database successfully...");


            //Query
            System.out.println("Creating statement...Question 1");
            Statement myStmt = connection.createStatement();


            String sql = "SELECT COUNT(Status) FROM Orders";

            ResultSet rs = myStmt.executeQuery(sql);


            while (rs.next()) {
                //Retrieve by column name and display values

                System.out.println("The number of Not Shipped Orders is = " + rs.getString("COUNT"));

            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(message);
        }
    }




}
