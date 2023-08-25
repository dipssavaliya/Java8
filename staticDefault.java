package Java8;

interface staticDefaultInterface {
	public static void print() {
		System.out.println("Static method called");
	}
	public void draw();
}

public class staticDefault {
	public static void main(String[] args) {

				staticDefaultInterface.print();
	}

}
