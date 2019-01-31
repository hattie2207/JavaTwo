package calculatorOne;

import java.awt.*;
import java.awt.event.*;

public class CalculatorMain {

	public static void main(String[] args) {

		Frame f = new Frame();
		TextField t1 = new TextField(10);
		TextField t2 = new TextField(10);
		TextField t3 = new TextField(20);
		Label l1 = new Label("First Number :");
		Label l2 = new Label("Second Number :");
//		Label l3 = new Label("+");
		Label l4 = new Label("Result :");
		Button b1 = new Button("=");	
		Button b2 = new Button("+");
		Button b3 = new Button("-");
		Button b4 = new Button("x");
		Button b5 = new Button("/");
		FlowLayout f1 = new FlowLayout();
		EventHandler e = new EventHandler(t1, t2, t3);
		b1.addActionListener(e);		

		b2.addActionListener( new ActionListener(){

			public void actionPerformed(ActionEvent x) {

				try {
					int result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
					String output = Integer.toString(result);
					t3.setText(output);
				}catch(Exception e) {
					
					String errorMessage = "Error: " + e.getMessage();
					t3.setText(errorMessage);
				}

			}

		});

		b3.addActionListener( new ActionListener(){

			public void actionPerformed(ActionEvent x) {

				try {
					int result = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
					String output = Integer.toString(result);
					t3.setText(output);
				}catch(Exception e) {
					
					String errorMessage = "Error: " + e.getMessage();
					t3.setText(errorMessage);
				}

			}

		});

		b4.addActionListener( new ActionListener(){

			public void actionPerformed(ActionEvent x) {

				try {
					int result = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
					String output = Integer.toString(result);
					t3.setText(output);
				}catch(Exception e) {
					
					String errorMessage = "Error: " + e.getMessage();
					t3.setText(errorMessage);
				}

			}

		});

		b5.addActionListener( new ActionListener(){

			public void actionPerformed(ActionEvent x) {

				try {
					int result = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
					String output = Integer.toString(result);
					t3.setText(output);
				}catch(Exception e) {
					
					String errorMessage = "Error: " + e.getMessage();
					t3.setText(errorMessage);
				}

			}

		});

		f.setLayout(f1);
		f.add(l1);
		f.add(t1);
		//f.add(l3);
		f.add(l2);
		f.add(t2);	
		//f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);
		f.add(l4);
		f.add(t3);
		f.setSize(800, 400);
		f.setVisible(true);

	}

}
