package calculatorFour;

import java.awt.*;
import java.awt.event.*;

public class InputEvent implements ActionListener {

	TextField t1;
	int num1; 

	public InputEvent(TextField t1) {

		this.t1 = t1;		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Button btn = (Button) e.getSource();		
		String text = t1.getText();		
		t1.setText(text + btn.getLabel());		

	}
}
