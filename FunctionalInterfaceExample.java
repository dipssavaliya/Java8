
interface sayable{  
    void say(String msg);   // abstract method  
}  

interface Doable extends sayable{  
    // Invalid '@FunctionalInterface' annotation; Doable is not a functional interface  
    void doIt();  
}  

public class FunctionalInterfaceExample implements Doable {
	public void say(String msg) {
		System.out.println(msg);
	}

	public static void main(String[] args) {
		FunctionalInterfaceExample fie = new FunctionalInterfaceExample();
		fie.say("Hello there");
	}

	@Override
	public void doIt() {
		// TODO Auto-generated method stub
		
	}

}