package trading.connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    static Connection conn = null;

    private DBConnection() {
    }

    public static Connection getDBConnection() {

        try {
            if (conn == null) {
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/trade", "root", "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                  //System.out.println(conn);
        return conn;
    }
}