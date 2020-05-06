import java.sql.*;

public class Sql {

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


            String sql = "SELECT * FROM Customers";
            String sql1 = "SELECT FirstName, LastName FROM Customers";
            String sql2 = "SELECT FirstName FROM Customers WHERE CustomerID=1;";
            String sql3 = " UPDATE Customers SET FirstName='Lerato Mabitso' WHERE CustomerID=1";
            String sql4 = "DELETE FROM Customers WHERE CustomerID=2";
            String sql5 = "SELECT COUNT(Status) FROM Orders";
            String sql6 = "SELECT MAX(Amount) FROM Payments";

            ResultSet rs = myStmt.executeQuery(sql);

            while(rs.next()){
                //Retrieve by column name and display values

                System.out.println(rs.getString("CustomerID")+", "
                        +rs.getString("FirstName")+", "+rs.getString("LastName")+", "
                        +rs.getString("Gender")+", "+rs.getString("Address")+", "
                        +rs.getString("Phone")+", "+rs.getString("Email")+", "
                        +rs.getString("City")+", "+rs.getString("country"));
            }
            rs.close();
        } catch (SQLException e) {
            System.out.println(message);
        }








    }

}
