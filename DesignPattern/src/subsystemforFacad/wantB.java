package subsystemforFacad;

import Facade.facade;

public class wantB {
	public facade f = new facade();
	public void IneedB() {
		f.Bfunction();
	}
	public static void main(String[] args) {
		wantB b = new wantB();
		b.IneedB();;
	}
}
