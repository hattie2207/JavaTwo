import java.sql.*;

public class ConnectionHandler {
	
	public void sendQuery(String query) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qac", "root", "");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);
			ResultSet rec = stmt.executeQuery("SELECT * FROM school");
			while(rec.next()) {
				System.out.print(rec.getInt(1) + " ");
				System.out.print(rec.getString(2) + " ");
				System.out.print(rec.getInt(3) + "\n");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/qac", "root", "");
//			Statement stmt = conn.createStatement();
//			stmt.executeUpdate(query);
//			ResultSet rec = stmt.executeQuery("SELECT * FROM school");
//			while(rec.next()) {
//				System.out.print(rec.getInt(1) + " ");
//				System.out.print(rec.getString(2) + " ");
//				System.out.print(rec.getInt(3) + "\n");
//			}
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
	}

}
