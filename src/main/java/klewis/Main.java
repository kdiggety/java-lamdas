package klewis;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Print list of Integers as a comma-separated list
		String s =
		Arrays.asList(1, 2, 3, 4, 6)
			  .stream()
			  .map(n -> n.toString())
			  .collect(Collectors.joining(", "));
		System.out.println(s);
	}

}
