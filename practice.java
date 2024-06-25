import java.sql.*;

public class practice {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/jdbc";

    // Database credentials
    static final String USER = "root";
    static final String PASS = "0000";

    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            for (int i = 1; i <= 5; i++) {
                String sql = "INSERT INTO tab (tId, tName, tCity) VALUES (?, ?, ?)";
                stmt = conn.prepareStatement(sql);
                stmt.setInt(1, i);
                stmt.setString(2, "Employee " + i);
                stmt.setString(3, "City " + i);
                stmt.executeUpdate();
                System.out.println("Inserted record " + i);
            }
            String updateSql = "UPDATE tab SET tCity = ? WHERE tId = ?";
            stmt = conn.prepareStatement(updateSql);
            stmt.setString(1, "New York");
            stmt.setInt(2, 2);
            int rowsUpdated = stmt.executeUpdate();
            System.out.println("Updated " + rowsUpdated + " row(s)");
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }  // end try
        System.out.println("Goodbye!");
    }
}
