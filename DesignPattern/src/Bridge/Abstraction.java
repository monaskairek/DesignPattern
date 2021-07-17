package Bridge;

public abstract class Abstraction {
	implementor implementation;

	public Abstraction() {
	}

	public implementor getImplementation() {
		return implementation;
	}

	public void setImplementation(implementor implementation) {
		this.implementation = implementation;
	}

	abstract void operation();
}
