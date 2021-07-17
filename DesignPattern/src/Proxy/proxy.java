package Proxy;

public class proxy extends subject {
	realSubject realSubject;
	int age;

	public proxy(int age) {
		realSubject = new realSubject();
		this.age = age;
	}

	@Override
	void request() {
		if (allowed(age)) {
			realSubject.request();
		} else
			realSubject.isdoingSomething();
	}

	@Override
	boolean isdoingSomething() {
		return realSubject.isdoingSomething();
	}

	boolean allowed(int age) {
		return age > 18;
	}

}
