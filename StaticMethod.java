package Java8;

@FunctionalInterface
interface staticM
{
	public void mStaticMethod();
	public static void draw()
	{
		System.out.println("Draw method");
	}
}

public class StaticMethod {
	public static void print()
	{
		System.out.println("print instance method");
	}
	public static void main(String[] args)
	{
	
		staticM d = StaticMethod :: print;
		d.mStaticMethod();	
		staticM.draw();
		
	}
	
}
