package Observer;

import java.util.HashSet;
import java.util.Set;

public class Subject {
	Set<Observer> observers;

	public Subject() {
		observers = new HashSet<>();
	}

	public void addObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyO() {
		observers.forEach(o -> o.onUpdate());
	}
}