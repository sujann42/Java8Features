package stream_iterating;

import java.util.stream.Stream;

public class IteratingUsingStream {
	public static void main(String[] args) {
		Stream.iterate(15, element -> element + 1)
		.filter(element -> element % 5 == 0)
		.limit(6)
		.forEach(System.out::println);
	}

}
