package Java8;

import java.util.Optional;

public class OptionalArray {

	public static void main(String[] args) {
		String[] stringTest = new String[10];		
		stringTest[5] = "5th String";		
		Optional<String> nullCheck = Optional.ofNullable(stringTest[5]);
		{
			if (nullCheck.isPresent()) {
				System.out.println(stringTest[5]);

			} else {
				System.out.println("values not available..");
			}
		}
	}
}
