package java8;

import java.util.Optional;

public class optionalDemo {
	
	public static void main(String[] args)
	{
		
		Integer a =0;
		Integer b = 10;
		
		Optional<Integer> a1 = Optional.ofNullable(a);
		Optional<Integer> b1 = Optional.ofNullable(b);
		
		
		System.out.println("sum is : "+optionalDemo.sum(a1,b1));
	}
	public static Integer sum(Optional<Integer> a, Optional<Integer> b)
	{
		System.out.println("value1 is present : "+a.isPresent());
		System.out.println("value2 is present : "+b.isPresent());
		
		Integer value1 = a.orElse(0);
		Integer value2 = b.get();
		return value1+value2;
		
		
	}
}
