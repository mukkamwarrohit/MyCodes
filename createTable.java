import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class createTable {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/dbname", "root", "0000");

            String query="Create table Rohit(name varchar(100),age int,gender varchar(1))";

            Statement stmt=con.createStatement();
            int i=stmt.executeUpdate(query);

            if (i>0) {
                System.out.println("Succesfully create the table");
            }else{
                System.out.println("Failed");
            }
    }    
}
