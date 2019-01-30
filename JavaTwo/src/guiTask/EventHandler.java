package guiTask;

import java.awt.*;
import java.awt.event.*;


public class EventHandler implements ActionListener {
	
	TextField t;
	
	public EventHandler(TextField x) {
		
		t = x;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

		t.setText("Hello");
		System.out.println("Button Clicked");
		
	}
	


}
