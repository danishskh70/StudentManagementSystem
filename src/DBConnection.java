import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

  // Private constructor to prevent instantiation
  private DBConnection() {
  }

  public static Connection getConnection() {
    try {
      // Load the driver
      Class.forName("com.mysql.cj.jdbc.Driver");

      // Read credentials from environment variables
      String url = System.getenv("DB_URL");
      String user = System.getenv("DB_USER");
      String pass = System.getenv("DB_PASS");

      // Connect using env variables
      return DriverManager.getConnection(url, user, pass);

    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
}
