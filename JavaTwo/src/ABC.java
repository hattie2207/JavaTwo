
public class ABC {
	
	static int x;
	
	public static void hello() {
		System.out.println("Hello World");
	}
	
	public static void go() {
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		ABC.hello();
		ABC.go();
		
	}
	

}
