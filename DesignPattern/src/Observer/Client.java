package Observer;

public class Client {
	public static void main(String[] args) {
		concretesubject test = new concretesubject();
		Observer observer1 = new concreteObserver1(test);
		Observer observer2 = new concreteObserver2(test);
		test.setState(5);
		test.setState(6);
	}
}
