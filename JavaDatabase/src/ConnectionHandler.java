import java.sql.*;

public class ConnectionHandler {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qac", "root", "");
			Statement stmt = conn.createStatement();
//			stmt.executeUpdate("INSERT INTO school VALUES(2, 'Tom', 40)");
			ResultSet rec = stmt.executeQuery("SELECT * FROM school");
			while(rec.next()) {
				System.out.println(rec.getInt(1));
				System.out.println(rec.getString(2));
				System.out.println(rec.getInt(3));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
