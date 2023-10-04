package Java8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class flatMapTest {
	
	    public static void main(String[] args) 
	    { 
	  
	        // Creating a List of Strings 
	        List<String> list = Arrays.asList("Geeks", "GFG", 
	                                 "GebsforGeeks", "gfg"); 
	        Map<String,String> test = new HashMap<String, String>();
	        test.put("key","value1");
	        test.put("key2", "value2");
	        
	  
	        // Using Stream flatMap(Function mapper) 
	        list.stream().flatMap(str -> Stream.of(str.substring(0, 3))).forEach(System.out::println);
	        
	        
	    } 
	} 


