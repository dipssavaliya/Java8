package Java8;


public class lambdatwointerface2 {

	interface opertn
	{
		int operation(int a,int b);
	}
	
	public static void main(String[] args)
	{
		opertn multi = (a,b)->(a*b);
		opertn sum =(a,b)->(a+b);
		multi.operation(4, 5);
		sum.operation(4, 6);
			
	}
}
