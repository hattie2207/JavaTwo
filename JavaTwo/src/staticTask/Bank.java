package staticTask;

public class Bank {
	
	static int dollar;
	static {
		//initialise once when object is created for the first time
		dollar = 95;
	}
	
	public void setDollar(int a) {
		dollar = a;
	}
	
	public void amount(int x) {
		System.out.println(x * dollar);
	}

}
