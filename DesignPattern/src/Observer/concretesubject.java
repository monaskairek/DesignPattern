package Observer;

public class concretesubject extends Subject {
	int state;

	public concretesubject() {
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyO();
	}

}
