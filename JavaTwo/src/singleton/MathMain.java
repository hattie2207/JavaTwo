package singleton;

public class MathMain {
	
	public static void main(String[] args) {		 
		
		Math a,b,c;
		
		//Share the same object
		a = Math.createObject();
		b = Math.createObject();
		c = Math.createObject();
		
		a.setA(3);
		System.out.println("A: " + a.getA() + " B: " + b.getA() + " C: " + c.getA());
		
		
	}

}
