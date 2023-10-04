package Java8;
import java.util.*;
import java.util.Map.Entry;

public class StreamMapSubString {
	public static void main(String[] args) {
		Map<String, String> test = new HashMap<String, String>();
		test.put("testKey1", "testValues1");
		test.put("tesKey2", "testValues2");
		
		for (Entry<String, String> entry : test.entrySet()) {
			if ((entry.getKey().substring(0, 4)).equals("test")) {
				System.out.println(entry.getKey().substring(0, 2));
				System.out.println(entry.getValue());
			}
		}

	}
}
