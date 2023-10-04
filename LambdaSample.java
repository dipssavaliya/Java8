package Java8;

interface lamb {
	public void fun(int x);
}

public class LambdaSample {

	public static void main(String[] args) {
		lamb b = (x)->System.out.println(x);
		b.fun(7);
	}

}
