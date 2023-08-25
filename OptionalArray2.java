package Java8;

import java.util.Optional;

public class OptionalArray2 {
	public static void main(String[] args)
	{
	String testS = "Dips";
	Optional<String> opt = Optional.ofNullable(testS);
	if(opt.isPresent())
	{
		System.out.println( "value is : " + testS);
	}
	else
	{
		System.out.println("value is : " + testS);
	}
}

}