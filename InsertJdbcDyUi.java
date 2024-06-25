import java.io.*;
import java.sql.*;

public class InsertJdbcDyUi {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

            //Creating a connection
            String url="jdbc:mysql://localhost:3306/jdbc";
            String username="root";
            String password="0000";
            Connection con=DriverManager.getConnection(url,username,password);

            //Create a query
            String q="insert into tab(tName,tCity) values(?,?)";

            //get the PreparedStatement object
            PreparedStatement pstmt=con.prepareStatement(q);
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            
            //adding user inputed Data
            System.out.println("Enter Name:");
            String name=br.readLine();
            System.out.println("Enter City:");
            String city=br.readLine();

            //set the values to query
            for(int i=0;i<5;i++){
            pstmt.setString(1, name);
            pstmt.setString(2, city);
            pstmt.executeUpdate();
            System.out.println("Inserted the Data");
            }
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
