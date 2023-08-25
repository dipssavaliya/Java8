package Java8;

import java.util.Optional;

public class OptionalArray1 {

	public static void main(String[] args)
	{
		String test = null;
		Optional<String> check = Optional.ofNullable(test);
		if(check.isPresent())
		{
			System.out.println("values are available");
		}
		else
		{
			System.out.println("values are not available");
		}
		
	}
	
}
