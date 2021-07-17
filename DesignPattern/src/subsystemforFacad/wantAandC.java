package subsystemforFacad;

import Facade.facade;

public class wantAandC {
	public facade f;
	public wantAandC () {
		 f = new facade();
	}
	public void IneedAandC() {
		f.Afunction();
		f.Cfunction();
	}
	public static void main(String[] args) {
		wantAandC AandC = new wantAandC();
		AandC.IneedAandC();
	}
}
