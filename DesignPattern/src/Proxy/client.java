package Proxy;

public class client {

	public static void main(String[] args) {
		int age = 13;
		proxy prox = new proxy(age);
		prox.request();
	}
}
