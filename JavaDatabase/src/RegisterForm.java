import java.awt.*;
import java.awt.event.*;

public class RegisterForm {

	public static void main(String[] args) {
		
		ConnectionHandler conn = new ConnectionHandler();

		Frame f = new Frame("Registeration Form");
		f.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		Label l1 = new Label("Register Number :");
		Label l2 = new Label("Name :");
		Label l3 = new Label("Marks :");
		Label l4 = new Label("");
		Label l5 = new Label("");
		Label l6 = new Label("");
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		
		Button b1 = new Button("Save");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(!t1.getText().equals("") && !t2.getText().equals("") && !t3.getText().equals("")) {
					
					l4.setText("");
					l5.setText("");
					l6.setText("");				
					
					try {
						
						int regno = Integer.parseInt(t1.getText());
						String name = t2.getText();
						int marks = Integer.parseInt(t3.getText());
						
						String query = "INSERT INTO school VALUES(" + regno + ", '" + name + "', " + marks + ")";
						conn.sendQuery(query);
						
					}catch(Exception error) {
						error.printStackTrace();
					}
					
				}
				else {
					
					if(t1.getText().equals("")) {
						l4.setText("Missing");
					}
					else {
						l4.setText("");
					}
					
					if(t2.getText().equals("")) {
						l5.setText("Missing");
					}
					else {
						l5.setText("");
					}
					
					if(t3.getText().equals("")) {
						l6.setText("Missing");
					}
					else {
						l6.setText("");
					}
				}
				
			}
		});

		GridLayout g1 = new GridLayout(4, 3);
		f.setLayout(g1);	
		f.add(l1);
		f.add(t1);
		f.add(l4);
		f.add(l2);
		f.add(t2);
		f.add(l5);
		f.add(l3);
		f.add(t3);
		f.add(l6);
		f.add(b1);

		f.setSize(500, 200);
		f.setVisible(true);
		
	}
}
