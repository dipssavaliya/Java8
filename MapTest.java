package Java8;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Map.Entry;


public class MapTest {
	public static void main(String[] args) {
		HashMap<String, String> testMap = new HashMap<String, String>();
		Map<Object, Object> useMap = new HashMap<Object, Object>();
		testMap.put("dipali", "testDips");
		testMap.put("disjh", "testDips1");
	//	testMap.entrySet().stream().filter(t -> (t.getKey().substring(0,3)).equals("dip")).filter(t->t.getKey()).forEach(System.out::println);
		
		
	    useMap = testMap.entrySet().stream().filter(t -> (t.getKey().substring(0,3)).equals("dip")).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); 
	    
	    for(Entry<Object, Object> test: useMap.entrySet())
		{
			System.out.println(test);
			
		}
	}
}
