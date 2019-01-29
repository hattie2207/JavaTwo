package abstractTask;

public class MathTwo extends Math {

	@Override
	public void add(int a, int b) {
		int result = a + b;
		System.out.println(result);
		
	}

	@Override
	public void sub(int a, int b) {
		int result = a - b;
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		
		//Now that we override all abstract classes from Math, we can create an object
		MathTwo m = new MathTwo();
		m.add(2, 3);
		
	}

}
