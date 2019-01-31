package calculatorThree;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame {

	TextField t1,t2,t3;
	Label l1,l2,l3,l4;
	Button b1;
	GridLayout g1;

	public Calculator() {

		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();
		l1 = new Label("First Number :");
		l2 = new Label("Second Number :");
		l3 = new Label();
		
		l4 = new Label("Result :");
		b1 = new Button();
		g1 = new GridLayout(4,2);
		setLayout(g1);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(b1);
		add(l4);
		add(t3);
		setSize(400, 400);		

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					String title = getTitle();

					int a,b,c = 0;
					a = Integer.parseInt(t1.getText());
					b = Integer.parseInt(t2.getText());


					switch(title) {

					case "Addition":
						c = a + b;
						break;
					case "Subtraction":
						c = a - b;
						break;
					case "Multiplication":
						c = a * b;
						break;
					case "Division":
						c = a / b;
						break;
					}

					t3.setText(String.valueOf(c));
					
				}catch(Exception error) {

					t3.setText(error.getMessage());

				}
			}
		});

	}

	public void setOperation(String title) {

		setTitle(title);

		switch(title) {

		case "Addition":
			b1.setLabel("+");
			break;
		case "Subtraction":
			b1.setLabel("-");
			break;
		case "Multiplication":
			b1.setLabel("x");
			break;
		case "Division":
			b1.setLabel("/");
			break;
		default: 
			b1.setLabel("");
			break;
		}

		setVisible(true);
	}

}