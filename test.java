package java8;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
//first 10 even number
public class test {
	public static void main(String[] args)
	{
		
		List<Integer> num = Arrays.asList(2,3,45,66,66,77,88,22,33,55,99);
		//System.out.print(num);
	
		//Integer  i1 = num.stream().filter(p->p%2==0).limit(10).reduce(0, (a,b)->(a*b));
		long  i1 = num.stream().reduce(1, (a,b)->(a*b));
		//num.stream().mapToInt(x->x).reduce(1, Math::multiplyExact);
	 System.out.print("sum of first 10 even numbers : "+i1);
		
		Set<Integer> set = new HashSet<>();
		num.stream().filter(p->!set.add(p)).collect(Collectors.toSet()).forEach(System.out::println);;
		
		//num.stream().filter(p->p%2==0).map(p->p.sum(p, p)).forEach(System.out::println);
		
		//num.stream().distinct().forEach(System.out::println);
		List<Integer> result = new ArrayList<Integer>();
		for(int i=0;i<num.size();i++) {
			for(int j=i+1;j<num.size();j++)
			{
				if(i+j ==45) {
				result.add(i);
				result.add(j);
			}
		}
	}
		//System.out.print(result.toString());
	}
}
