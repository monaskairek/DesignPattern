package Strategy;

public class Context {
	strategy strategy;
	boolean hungary;
	boolean thirsty;

	public Context() {
		hungary = false;
		thirsty = false;
	}

	public strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(strategy strategy) {
		this.strategy = strategy;
	}

	public boolean isHungary() {
		return hungary;
	}

	public void setHungary(boolean hungary) {
		this.hungary = hungary;
	}

	public boolean isThirsty() {
		return thirsty;
	}

	public void setThirsty(boolean thirsty) {
		this.thirsty = thirsty;
	}

	public void excuteAlgorithm() {
		policy policy = new policy(this);
		policy.configure();
		policy.context.getStrategy().performStrategy();
	}
}
