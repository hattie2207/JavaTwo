import java.sql.*;

public class ConnectionHandler {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qac", "root", "");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into school values(2, 'Tom', 40)");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
