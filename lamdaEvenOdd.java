package Java8;

interface check
{
	boolean isEven(int t, int d);
}
public class lamdaEvenOdd {
	
	public static void main(String[] args) {
	check c = (a,b) -> (a%b)==0?true:false;
	boolean flag=c.isEven(6, 8);
	System.out.println(flag);
	}
}
