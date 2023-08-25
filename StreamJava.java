import java.util.stream.Stream;

public class StreamJava {
	public static void main(String[] args)
	{
	 Stream.Builder<String> builder = Stream.builder(); 
     Stream<String> stream = builder.add("Geeks").build(); 
     stream.forEach(System.out::println); 
	}

}
