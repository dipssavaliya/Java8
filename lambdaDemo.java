package java8;

public class lambdaDemo {
	public static void main(String[] args) {
		MyFunctionalInterface interfdemo = () -> {
			System.out.println("This is test from M1");
		};
		interfdemo.m1();
	}
}
