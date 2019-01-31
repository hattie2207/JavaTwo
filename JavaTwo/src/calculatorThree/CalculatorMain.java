package calculatorThree;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorMain {	

	public static void main(String[] args) {

		Frame f1 = new Frame();
		GridLayout g1 = new GridLayout(4, 1);
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("x");
		Button b4 = new Button("/");
		Calculator calc = new Calculator();

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				calc.setOperation("Addition");

			}
		});
		
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				calc.setOperation("Subtraction");

			}
		});
		
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				calc.setOperation("Multiplication");

			}
		});
		
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {				
				calc.setOperation("Division");

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
