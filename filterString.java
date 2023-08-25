package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class filterString {
	
	public static void main(String[] args)
	{
		List<String> test = Arrays.asList("Dipali","Dipali1","Element","like");
		test.stream().filter(s->s.startsWith("Dip")).forEach(System.out::println);
		
		String[] myArray = "I am Dipali".split(" ");
		Stream<String> myStream = Stream.of(myArray);
		
		
		
		myStream.forEach(System.out::println);
	}

}
