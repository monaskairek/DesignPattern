package Adapter;

public class Adapter implements ClientInterface {
	private LagacyClass expensive = new LagacyClass();

	@Override
	public void request() {
		System.out.println("i adapted to new changes im better and faster than the legacy class");
		expensive.existingRequests();
	}
}
