package Java8;
import java.util.*;
import java.util.Map.Entry;

public class MapExample 
{
	
	public static void main(String[] args) {
		
		TreeMap<String, String> testmap = new TreeMap<String, String>();
		testmap.put("test1","testVal1");
		testmap.put("test2", "testVal2");
		for(Entry<String, String> test: testmap.entrySet())
		{
			System.out.println(test);
			
		}
		
	}

}
