package Java8;

import java.util.ArrayList;

public class lambdaCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.stream().sorted((a1, a2) -> (a2 > a1) ? -1 : (a1 < a2) ? 1 : 0);
		System.out.println(al);
	}
}
