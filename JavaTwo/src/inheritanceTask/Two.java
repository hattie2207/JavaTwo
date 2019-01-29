package inheritanceTask;

public class Two extends One{
		
	public void go() {
		
		System.out.println("ABC");
	}
	
	public static void main(String[] args) {
		
		//You can assign child class to parent's reference 
		//You can also call inherited method from parent but you can't call the child method
		One reference = new Two();		
		reference.message();
//		reference.go();
		
	}

}
