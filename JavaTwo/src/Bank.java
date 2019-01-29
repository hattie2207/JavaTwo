
public class Bank {
	
	static int dollar;
	
	public static void amount(int a) {
		System.out.println("Amount: " + a * dollar);
		
	}
	
	public static void setDollar(int a) {
		dollar = a;
	}
	
	public static void main(String[] args) {
		
//		Bank HSBC, Barclays;
//		HSBC = new Bank();
//		Barclays = new Bank();
//		HSBC.setDollar(10);
//		Barclays.amount(2);
//		Barclays.setDollar(20);
//		HSBC.amount(3);
//		Barclays.amount(3);
			
		setDollar(20);
		amount(2);
		
	}

}
 