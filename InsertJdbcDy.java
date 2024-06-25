import java.sql.*;

public class InsertJdbcDy {
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

            //set the values to query
            pstmt.setString(1, "Deep Deshmukh");
            pstmt.setString(2, "Karanja");
            pstmt.executeUpdate();
            System.out.println("Inserted the Data");
            con.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
