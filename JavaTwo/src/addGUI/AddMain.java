package addGUI;

import java.awt.*;

public class AddMain {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		TextField t1 = new TextField(10);
		TextField t2 = new TextField(10);
		TextField t3 = new TextField(10);
		Label l1 = new Label("First Number :");
		Label l2 = new Label("Second Number :");
		Label l3 = new Label("+");
		Label l4 = new Label("Result :");
		Button b1 = new Button("=");
		FlowLayout f1 = new FlowLayout();
		EventHandler e = new EventHandler(t1, t2, t3);
		b1.addActionListener(e);
		
		
		f.setLayout(f1);
		f.add(l1);
		f.add(t1);
		f.add(l3);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(l4);
		f.add(t3);
		f.setSize(800, 400);
		f.setVisible(true);
		
	}

}
