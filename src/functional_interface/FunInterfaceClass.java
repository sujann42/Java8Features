package functional_interface;

//Single abstract method interface. 
//Can contain any number of static and default methods.
interface Sayable{
	void say(String msg);
	// It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}

//A functional interface can extends another interface only when it does not have any abstract method.
interface Doable extends Sayable{
	void doIt();
	
}
public class FunInterfaceClass implements Sayable{
	

	public static void main(String[] args) {
		
		FunInterfaceClass f = new FunInterfaceClass();
		f.say("This is me");
		

	}

	@Override
	public void say(String msg) {
		System.out.println(msg);
		
	}

}
