import java.sql.*;

public class Sql {

    public static void main(String[] args) throws Exception {

        //Class.forName("org.postgresql.Driver");

        String url ="http://localhost:8080/?pgsql=postgres&username=feli&db=Umuzi";
            String user = "feli";
            String password = "passfeli";



        try {
            // Open a connection
            System.out.println("Connecting to a selected database...");
            Connection connection = DriverManager.getConnection(url,user,password);
            System.out.println("Connected database successfully...");


            //Query
            System.out.println("Creating statement...");
            Statement myStmt = connection.createStatement();


            String sql = "SELECT * FROM Customers";
            String sql1 = "SELECT FirstName, LastName FROM Customers";
            String sql2 = "SELECT FirstName FROM Customers WHERE CustomerID=1;";
            String sql3 = " UPDATE Customers SET FirstName='Lerato Mabitso' WHERE CustomerID=1";
            String sql4 = "DELETE FROM Customers WHERE CustomerID=2";
            String sql5 = "SELECT COUNT(Status) FROM Orders";
            String sql6 = "SELECT MAX(Amount) FROM Payments";

            ResultSet rs = myStmt.executeQuery(sql);
            ResultSet rs1 = myStmt.executeQuery(sql1);
            ResultSet rs2 = myStmt.executeQuery(sql2);
            ResultSet rs3 = myStmt.executeQuery(sql3);
            ResultSet rs4 = myStmt.executeQuery(sql4);
            ResultSet rs5 = myStmt.executeQuery(sql5);
            ResultSet rs6 = myStmt.executeQuery(sql6);

            while(rs.next()){
                //Retrieve by column name
                String first = rs.getString("firstname");

                //Display values
                System.out.println("FirstName: " + first);
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }





    }

}
