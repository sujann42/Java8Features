package lambdas;

import java.util.ArrayList;

import java.util.List;

public class ForEachLambda {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Sam");
		myList.add("Harry");
		myList.add("Moni");
		
		myList.forEach((a) -> System.out.println(a));
		
		

	}

}
