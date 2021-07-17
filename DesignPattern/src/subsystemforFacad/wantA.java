package subsystemforFacad;

import Facade.facade;

public class wantA {
	public facade f = new facade();

	public void IneedA() {
		f.Afunction();
	}

	public static void main(String[] args) {
		wantA a = new wantA();
		a.IneedA();
	}
}
