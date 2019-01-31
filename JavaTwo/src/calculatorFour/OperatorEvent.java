package calculatorFour;

import java.awt.*;
import java.awt.event.*;

public class OperatorEvent implements ActionListener{

	TextField t1;
	String operator;
	int num1;

	public OperatorEvent(TextField t1) {

		this.t1 = t1;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			Button btn = (Button) e.getSource();
			num1 = Integer.parseInt(t1.getText());
			t1.setText("");
			operator = btn.getLabel();			

		}catch(Exception error) {

			t1.setText("Error Message: " + error.getMessage());

		}	
	}
}
