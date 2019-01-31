package calculatorTwo;

import java.awt.*;
import java.awt.event.*;

public class CalculatorMain {

	public static void main(String[] args) {

		Frame f1 = new Frame();
		GridLayout g1 = new GridLayout(4, 1);
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("x");
		Button b4 = new Button("/");
		
		Frame f2 = new Frame();
		GridLayout g2 = new GridLayout(4, 2);
		Label l1 = new Label("First Number :");
		Label l2 = new Label("Second Number :");
		Label l3 = new Label("Result :");
		Label l4 = new Label("");
		Button b5 = new Button("Add");
		Button b6 = new Button("Subtract");
		Button b7 = new Button("Mutiply");
		Button b8 = new Button("Divide");
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f2.setTitle("Addition");
				f2.setLayout(g2);
				f2.add(l1);
				f2.add(t1);
				f2.add(l2);
				f2.add(t2);
				f2.add(l4);
				f2.add(b5);
				f2.add(l3);
				f2.add(t3);
				f2.setSize(400, 400);
				f2.setVisible(true);

				b5.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						try {
							int result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
							String output = Integer.toString(result);
							t3.setText(output);
						}catch(Exception error) {

							String errorMessage = "Error: " + error.getMessage();
							t3.setText(errorMessage);
						}

					}
				});		

			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f2.setTitle("Subtraction");
				f2.setLayout(g2);
				f2.add(l1);
				f2.add(t1);
				f2.add(l2);
				f2.add(t2);
				f2.add(l4);
				f2.add(b6);
				f2.add(l3);
				f2.add(t3);
				f2.setSize(400, 400);
				f2.setVisible(true);

				b6.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						try {
							int result = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
							String output = Integer.toString(result);
							t3.setText(output);
						}catch(Exception error) {

							String errorMessage = "Error: " + error.getMessage();
							t3.setText(errorMessage);
						}

					}
				});

			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f2.setTitle("Mutiplication");
				f2.setLayout(g2);
				f2.add(l1);
				f2.add(t1);
				f2.add(l2);
				f2.add(t2);
				f2.add(l4);
				f2.add(b7);
				f2.add(l3);
				f2.add(t3);
				f2.setSize(400, 400);
				f2.setVisible(true);

				b7.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						try {
							int result = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
							String output = Integer.toString(result);
							t3.setText(output);
						}catch(Exception error) {

							String errorMessage = "Error: " + error.getMessage();
							t3.setText(errorMessage);
						}

					}
				});

			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				f2.setTitle("Division");
				f2.setLayout(g2);
				f2.add(l1);
				f2.add(t1);
				f2.add(l2);
				f2.add(t2);
				f2.add(l4);
				f2.add(b8);
				f2.add(l3);
				f2.add(t3);
				f2.setSize(400, 400);
				f2.setVisible(true);

				b8.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						try {
							int result = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
							String output = Integer.toString(result);
							t3.setText(output);
						}catch(Exception error) {

							String errorMessage = "Error: " + error.getMessage();
							t3.setText(errorMessage);
						}

					}
				});

			}
		});
		
		f1.setLayout(g1);
		f1.add(b1);
		f1.add(b2);
		f1.add(b3);
		f1.add(b4);
		f1.setSize(400, 400);
		f1.setVisible(true);

	}


}
