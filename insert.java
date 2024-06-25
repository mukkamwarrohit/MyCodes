import java.sql.*;
import java.util.Scanner;

public class insert {
    public static void main(String[] args) throws Exception {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/dbname", "root", "0000");

            Scanner sc=new Scanner(System.in);

            System.out.println("Enter name");
            String name=sc.nextLine();

            System.out.println("enter age");
            int age=sc.nextInt();

            System.out.println("Gemder");
            String g=sc.nextLine();



            String query="insert into  Rohit(name ,age ,gender) values (?,?,?)";

            PreparedStatement stmt=con.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setInt(2, age);
            stmt.setString(3, g);
    }   
}
