package Java8;

interface lam3
{
	void fun(String z);
}

public class LambdaSample3 {
	
	public static void main(String[] args)
	{
		lam3 lm = (s)->System.out.println(s);
				lm.fun("Dipali");
	}

}
