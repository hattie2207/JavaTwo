import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class NextRecord {

	static ResultSet rec;
	static Statement stmt;
	static Connection conn;

	public static void connect() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/qac", "root", "");
			stmt = conn.createStatement();
			rec = stmt.executeQuery("SELECT * FROM school");


		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		connect();

		Frame f = new Frame("School Records");
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		Label l1 = new Label("Register Number :");
		Label l2 = new Label("Name :");
		Label l3 = new Label("Marks :");
		Label l4 = new Label("Next Record");
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();		

		Button b1 = new Button("Next");
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {	

				try {	
					
					if(rec.next()) {
						t1.setText(rec.getInt(1) + "");
						System.out.println(rec.getInt(1));
						t2.setText(rec.getString(2));
						t3.setText(rec.getInt(3) + "");
					}else {
						l4.setText("Last Record");
					}

				} catch (SQLException error) {
					error.printStackTrace();
				}
			}
		});

		GridLayout grid1 = new GridLayout(4, 2);
		Panel p1 = new Panel();		
		p1.setLayout(grid1);		
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);
		p1.add(b1);		

		f.add(l4, BorderLayout.NORTH);	
		f.add(p1, BorderLayout.CENTER);	
		f.setSize(300, 200);
		f.setVisible(true);

	}

}
