package Observer;

public class concreteObserver2 extends Observer {
	concretesubject concretesubject;
	public concreteObserver2(concretesubject concretesubject) {
		this.concretesubject = concretesubject;
		concretesubject.addObserver(this);
	}

	@Override
	void onUpdate() {
		// this method shows it as digit
		System.out.println("Observer 2 is updating his view: " + concretesubject.getState());
	}

}
