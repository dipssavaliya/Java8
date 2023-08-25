package java8;

public interface MyFunctionalInterface {

	public void m1();
	public default  void m2() {
		System.out.println("M2 Printed");
	}
	public default void m3()
	{
		System.out.println("M3 Printed");
	}
	static void m4() {
		System.out.println("static printed");
	}
}
