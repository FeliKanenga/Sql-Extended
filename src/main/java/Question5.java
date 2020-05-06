import java.sql.*;

public class Question5 {
    public static void main(String[] args)  {

        //Class.forName("org.postgresql.Driver");
        String message = "Question failed";
        String url ="jdbc:postgresql://localhost:8080/Umuzi";
        String user = "feli";
        String password = "passfeli";



        try {
            // Open a connection
            System.out.println("Connecting to a selected database...");
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected database successfully...");


            //Query
            System.out.println("Creating statement...Question 1");
            Statement myStmt = connection.createStatement();

            String sql = "DELETE FROM Customers WHERE CustomerID=2";


           myStmt.executeQuery(sql);

            System.out.println("Delete successful");

        } catch (SQLException e) {
            System.out.println(message);
        }

    }
}
