
public class Two extends One {
	
	public void go() {
		
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		Two x = new Two();
		x.go();
	}

}
