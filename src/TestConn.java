import java.sql.Connection;
import java.sql.DriverManager;

public class TestConn {
  @SuppressWarnings({ "CallToPrintStackTrace", "UseSpecificCatch" })
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver"); // ← awaken the driver

      String url = System.getenv("DB_URL");
      String user = System.getenv("DB_USER");
      String pass = System.getenv("DB_PASS");

      Connection conn = DriverManager.getConnection(url, user, pass);

      System.out.println("Link established.");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
