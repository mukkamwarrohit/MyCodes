import java.sql.Connection;
import java.sql.DriverManager;

class conn{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("mysql:jdbc://localhost:3306/dbname", "root", "0000");

            if (con.isClosed()) {
                System.out.println("Connection failed");
            }else{
                System.out.println("Successful");
            }
    }
    catch(Exception e){
        System.out.print(e.getMessage());
    }
    }
}