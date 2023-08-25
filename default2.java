package Java8;

interface testD {
	public default void print() {
		System.out.println("printed default method");
	}
	public void drwa();
}

public class default2 {
	public static void main(String[] args) {
		testD d1 = () -> {
			System.out.println("draw called");
		};
		d1.print();
	}

}
