package Java8;

interface defaultM {
	public default void testMethod() {
		System.out.println("This is default");
	}

	public void draw();
}

public class defaultMethods {

	public static void main(String[] args) {
		defaultM m = () -> {
			System.out.println("inside main");
		};
		m.testMethod();
	}
}
