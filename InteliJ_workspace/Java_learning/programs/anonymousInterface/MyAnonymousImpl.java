package anonymousInterface;

interface MyAnonymousInterface {
	// anonymous interface can have 2 or more than 2 methods unlike functional interface which have only one abstract method.
	void switchOn();
	void switchOff();
}

public class MyAnonymousImpl implements MyAnonymousInterface {
	@Override
	public void switchOn() {
		System.out.println("Switching on");
	}

	@Override
	public void switchOff() {
		System.out.println("Switching off");
	}

	public static void main(String[] args) {
		MyAnonymousInterface myAnonymous = new MyAnonymousImpl();
		myAnonymous.switchOn();
		myAnonymous.switchOff();
	}
}
