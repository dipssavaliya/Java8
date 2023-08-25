package Java8;

interface instance1 {
	public void draw();
}

public class InstanceMethod {
	public void test() {
		System.out.println("test called");
	}
	public static void main(String[] args) {
		InstanceMethod inm = new InstanceMethod();
		instance1 in = inm::test;
		in.draw();
	}
}
