package calculatorFour;

import java.awt.*;
import java.awt.event.*;

public class OperatorEvent implements ActionListener{

	TextField t1, t2;
	String operator;
	int num1, num2, result;
	InputEvent i1;

	public OperatorEvent(TextField t1, InputEvent i1) {

		this.t1 = t1;
		this.i1 = i1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			Button btn = (Button) e.getSource();
			operator = btn.getLabel();	

			num1 = Integer.parseInt(t1.getText());
			t1.setText("");	

//			if(i1.pressed == true) num2 = Integer.parseInt(i1.t1.getText());
//
//			try {
//				switch(operator) {
//
//				case "+":
//					result = num1 + num2;
//					break;
//				case "-":
//					result = num1 - num2;
//					break;
//				case "x":
//					result = num1 * num2;
//					break;
//				case "/":
//					result = num1 / num2;
//					break;
//				}
//
//				t1.setText(String.valueOf(result));	
//
//			}catch(Exception error) {
//
//				t1.setText("Error Message: " + error.getMessage());
//
//			}


		}catch(Exception error) {

			t1.setText("Error Message: " + error.getMessage());

		}	
	}
}
