package Bridge;

public class client {

	public static void main(String[] args) {
		Abstraction A = new refinement1();
		A.operation(); 
		Abstraction B = new refinement2();
		B.operation();
	}
}
