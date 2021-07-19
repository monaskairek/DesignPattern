package Strategy;

public class client {
	
	public static void main (String[]args) {
		Context context = new Context();
		context.setHungary(true);
		context.setThirsty(false);
		context.excuteAlgorithm();
	}
}
