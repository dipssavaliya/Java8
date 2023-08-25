package java8;

interface cal {
	int subtract(int m1, int m2);
}

public class Calculator {
	public static void main(String[] args) {
		cal c = (m1, m2) -> m1 - m2;
		System.out.println(c.subtract(4, 3));
	}
}
