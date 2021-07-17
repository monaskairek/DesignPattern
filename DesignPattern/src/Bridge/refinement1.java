package Bridge;

public class refinement1 extends Abstraction {

	public refinement1() {
		super();
		
	}

	@Override
	public void operation() {
		implementation = new implemntor1();	
		implementation.concrretimplementation();
	}

}
