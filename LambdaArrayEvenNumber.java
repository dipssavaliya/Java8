package Java8;

import java.util.ArrayList;

public class LambdaArrayEvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.forEach(n -> {
			if (n % 2 == 0)
				System.out.println(n);
		});
	}
}
