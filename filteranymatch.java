package Java8;

import java.util.Arrays;
import java.util.List;

public class filteranymatch {

	public static void main(String[] args) {
		List<Integer> lst = Arrays.asList(3, 4, 5, 6);
		System.out.println(lst.stream().anyMatch(a->a%2==0));
		lst.stream().filter(a->a%2==0).forEach(System.out::println);;
	}
}
