package calculatorOne;

import java.awt.*;
import java.awt.event.*;

public class EventHandler implements ActionListener{
	
	TextField t1, t2, t3;
	
	public EventHandler(TextField t1, TextField t2, TextField t3) {
		
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		int result = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
		String output = Integer.toString(result);
		
		t3.setText(output);
		
	}

}
