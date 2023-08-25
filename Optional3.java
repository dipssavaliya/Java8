package Java8;

import java.util.Optional;

public class Optional3 {

	public static void main(String[] args) {
		String testk = null;
		Optional<String> t = Optional.ofNullable(testk);
		if (t.isPresent()) {
			System.out.println("not null");
		} else {
			System.out.println("null");
		}
	}

}
