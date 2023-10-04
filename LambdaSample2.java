package Java8;

interface lamd
{
	void fun(int x1);
}

public class LambdaSample2 {

	public static void main(String[] args) {
		lamd d =(x)-> System.out.println(x);
		d.fun(8);
	}

}
