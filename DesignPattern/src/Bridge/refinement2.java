package Bridge;

public class refinement2 extends Abstraction {

	@Override
	public void operation() {
		implementation = new Implementor2();
		implementation.concrretimplementation();
		
	}

}
