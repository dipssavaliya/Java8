package Java8;

import java.util.*;
import java.util.stream.Collectors;

class ListItems {
	private Integer key;
	private String value;

	public ListItems(Integer id, String name) {
		this.key = id;
		this.value = name;
	}

	public Integer getKey() {
		return key;
	}

	public String getValue() {
		return value;
	}
}

public class ListToMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		List<ListItems> list = new ArrayList<ListItems>();
		list.add(new ListItems(1, "A"));
		list.add(new ListItems(2, "B"));
		list.add(new ListItems(3, "C"));
		list.forEach((n)->map.put(n.getKey(),n.getValue()));
		list.stream().collect(Collectors.toMap(ListItems::getKey, ListItems::getValue));
		
	}
}
