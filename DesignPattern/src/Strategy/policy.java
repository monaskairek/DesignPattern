package Strategy;

public class policy {
	Context context;

	public policy(Context context) {
		this.context = context;
	}

	public void configure() {

		if (context.isThirsty()) {
			context.setStrategy(new StrategyA());
		} else if (context.isHungary()) {
			context.setStrategy(new StrategyB());
		}
	}
}
