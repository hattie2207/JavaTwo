package drawing;

public class Draw {
	
	public static void drawSomething(Drawing reference) {
		
		reference.doDrawing();
	}

	public static void main(String[] args) {
	
		Circle c = new Circle();
		Line l = new Line();
		
		drawSomething(c);
		drawSomething(l);
		
	}
}
