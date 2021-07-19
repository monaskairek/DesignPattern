package Observer;

public class concreteObserver1 extends Observer {
	concretesubject concretesubject;

	public concreteObserver1(concretesubject concretesubject) {
		 this.concretesubject=concretesubject;
		concretesubject.addObserver(this);
	}
	@Override
	void onUpdate() {
		// this method shows the number as string
		System.out.println("Observer 1 is updating his view: " + concretesubject.getState());
	}

}
