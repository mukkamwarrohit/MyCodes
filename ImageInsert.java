import java.sql.*;
import java.io.*;
public class ImageInsert {
    public static void main(String[] args) {
        try{
            Class.forName("com.sql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "0000");

            String q="insert into images(pic) values(?)";
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            FileInputStream fis=new FileInputStream("pan.jpg");   
            
            pstmt.setBinaryStream(1, fis,fis.available());
            
            pstmt.executeUpdate();
            System.out.println("Image Updated");
            
            
            
            con.close();


        }catch(Exception e){
            System.out.println("Error..!");
        }
    }
    
}
