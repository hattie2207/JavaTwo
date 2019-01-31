package exceptionTask;

public class exceptionTwo {
	
	public static void main(String[] args) {
		
		int a, b, c = 0;
		
		try {
			
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c  = a / b;
			System.out.println("Result: " + c);
			
		}catch(IndexOutOfBoundsException e) {			
			System.out.println("Please enter 2 numbers");
			
		}catch(NumberFormatException e) {			
			System.out.println("Please enter number value only");
			
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide number by zero");
			
		}finally {
			System.out.println("Hello");
			
		}
	}

}
