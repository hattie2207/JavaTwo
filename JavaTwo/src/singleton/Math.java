package singleton;

public class Math {
	
	static Math x;
	private int a;
	
	private Math() {}	

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	public static Math createObject() {
		
		if (x == null) {
			x = new Math();
		}
		
		return x;
	}

}
