import java.util.Arrays;
import java.util.List;

public class Liststream {
	public static void main(String[] args)
	{
		List<String> testList = Arrays.asList("test1","test2","test3");
		testList.stream().forEach(System.out::println);		
		System.out.println(testList.stream().findFirst().toString());
		testList.stream().limit(2).forEach(System.out::println);

	}
	

}
