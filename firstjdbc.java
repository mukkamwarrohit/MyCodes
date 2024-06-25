import java.sql.*;
class firstjdbc{
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //Creating a connection
            String url="jdbc:mysql://localhost:3306/jdbc";
            String username="root";
            String password="0000";
            Connection con=DriverManager.getConnection(url,username,password);
            if(con.isClosed()){
                System.out.println("Connection is Closed");
            }
            else{
                System.out.println("Connection is Connected");
            }

            String queeru="insert into adit(id,ron) values(?,?)";

            PreparedStatement stmt=con.prepareStatement(queeru);
            stmt.setInt(1, 1001);
            stmt.setString(2, "rohit");

            int i=stmt.executeUpdate();
            

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
} 