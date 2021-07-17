package Facade;

public class facade {

	public A a;
	public B b;
	public C c;

	public facade() {
		a = new A();
		b = new B();
		c = new C();
	}

	public void Afunction() {
		a.Afunction();
	}

	public void Bfunction() {
		b.Bfunction();
	}

	public void Cfunction() {
		c.Cfunction();
	}
}
