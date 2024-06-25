import java.sql.*;


public class sample {
    public static void main(String[] args) {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "0000");
        if(con.isClosed()){
            System.out.println("Connection failed!");

        }
        else{
            System.out.println("Connection Established");
        }

        // String q="delete from rohit where tId=1";

        // Statement stmt=con.createStatement();

        // int result=stmt.executeUpdate(q);


        // String q1="select * from rohit";
        // Statement stmt=con.createStatement();

        // ResultSet set=stmt.executeQuery(q1);

        // while (set.next()) {
        //     set.getString("tID");
        // }

        String q="Insert into table values(?,?,?)";


        PreparedStatement pstmt=con.prepareStatement(q);
        pstmt.setInt(1, 1);
        pstmt.setString(2, "rohit");
        pstmt.setString(3, "M");

        int s=pstmt.executeUpdate();





        }catch(Exception e){
            System.out.println(e);
        }
    }
}
