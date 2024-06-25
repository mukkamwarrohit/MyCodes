import java.sql.*;
class InsertJdbc{
    public static void main(String[] args) {
        try{
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //Creating a connection
            String url="jdbc:mysql://localhost:3306/jdbc";
            String username="root";
            String password="0000";
            Connection con=DriverManager.getConnection(url,username,password);
            
            //Create a Query
            String q="create table tab(tID int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(200))";

            //create a Statement
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created in Database");


        }catch(Exception e){
            e.printStackTrace();
        }
    }
}