package Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class predicateForList {

	public static void main(String[] args) {
		List<Integer> test = new ArrayList<>();
		test.add(23);
		test.add(56);
		test.add(89);
		Predicate<Integer> p = i -> (i == null);
		test=testPredicateLogic(test,p);
	}

	private static <T> List<T> testPredicateLogic(List<Integer> test, Predicate<Integer> p) {
		test.removeIf(p);
		test.stream().filter(p).collect(Collectors.toList());
		return (List<T>) test;
			
	}
}
