package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StudentInfo
{
	Integer id;
	String name;
	String book;
	Integer price;
	
	StudentInfo(Integer id, String name, String book, Integer price)
	{
		this.id=id;
		this.name=name;
		this.book=book;
		this.price=price;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + "]";
	}
	
}
public class java8Compare {
	
	public static void main(String[] args)
	{
		List<Integer> list = List.of(2,3,4,5,67,8);
	//	list.stream().filter(a->a>3).filter(a->a%2==0).forEach(System.out::println);
		//list to array --arrays.sort()
		
		//list.stream().sorted().forEach(System.out::println);;
	//	list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		Stream<String> streams = Stream.of("DiPALI","TUSHAR");
		//streams.map(s->s.charAt(2)).forEach(System.out::println);
	//	streams.flatMap(s->Stream.of(s.charAt(2))).forEach(System.out::println);
		
		List<StudentInfo> listOfStudent =  new ArrayList<>();
		listOfStudent.add(new StudentInfo(1, "Dipali","java",90));
		listOfStudent.add(new StudentInfo(2, "Tushar","java",300));
		listOfStudent.add(new StudentInfo(3, "Dipali1","ffv9",1000));
		Comparator<StudentInfo> st = new Comparator<StudentInfo>() {
			
			@Override
			public int compare(StudentInfo o1, StudentInfo o2) {
				if(o2.price>o1.price) return 1;
				else if(o1.price>o2.price) return -1;
				else return 0;
			}
		};
		listOfStudent.stream().filter(p->p.book.equals("java")).sorted(st).forEach(System.out::println);
		
		
		
//		TreeSet<StudentInfo> set = new TreeSet<StudentInfo>((p1,p2)->p1.name.compareTo(p2.name));
//		set.add(new StudentInfo(1, "Dipali"));
//		set.add(new StudentInfo(2, "Tushar"));
//		set.add(new StudentInfo(3, "Dipali1"));
		//System.out.println(set);
		
		Map<Integer,List<String>> map = new HashMap<>();
		map.put(1,Arrays.asList("a","b","c"));
		map.put(2,Arrays.asList("W","D","B"));
	//	map.entrySet().stream().flatMap(a->a.getValue().stream()).collect(Collectors.toList()).forEach(System.out::println);
		
 		//listOfStudent.stream().sorted((p1,p2)->p1.name.compareTo(p2.name)).forEach(System.out::println);
		//listOfStudent.stream().sorted((p1,p2)->p2.name.compareTo(p1.name)).forEach(System.out::println);
		
	}

}
