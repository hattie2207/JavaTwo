package thisTask;

public class What {
	
	int x;
	public void one() {
		int x;
		x = 15;
		
		//this = reference to current address of x variable member 
		this.x = 25; 
		
		//increment local variable and print
		System.out.println(++x);
		
	}
	
	public void show() {
		
		//print x variable member
		System.out.println(x);
	}

}
