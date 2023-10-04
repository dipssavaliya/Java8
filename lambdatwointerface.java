package Java8;


public class lambdatwointerface {

	interface OperationInterface
	{
		int operation(int a, int b);
	}

	int checkOperation(int a, int b, OperationInterface inf)
	{
		return(inf.operation(a, b));
	}
	
	
	public static void main(String[] args)
	{
		OperationInterface sum =(int x, int y)->x+y;
		OperationInterface multiply =(int x, int y)->x*y;
		System.out.println(sum.operation(3, 4));	
		lambdatwointerface obj = new lambdatwointerface();
		System.out.println(obj.checkOperation(2,3, sum));
		System.out.println(obj.checkOperation(2,3, multiply));		
	}
}
