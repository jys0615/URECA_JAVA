package ch17_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AOV3 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("hi");
		list.add("hello");
		list.add("how are you");
		list.add("i am fine");
		list.add("thank you");

		Stream<String> stream = list.stream();

		System.out.print("forEach : ");
		stream.forEach(s->System.out.print(s + ",\t"));
		System.out.println("\n");

		System.out.print("sorted forEach : ");
		list.stream().sorted().forEach(s->System.out.print(s + ",\t"));
		System.out.println("\n");

		System.out.print("map forEach : ");
		list.stream().map(s->s.length()).forEach(n->System.out.print(n + ",\t"));
		System.out.println("\n");

		System.out.print("map filter forEach : ");
		list.stream().map(s->s.length()).filter(n->n>5).forEach(n->System.out.print(n + ",\t"));
		System.out.println("\n");

		System.out.print("filter forEach : ");
		list.stream().filter(s->s.length() > 5).forEach(n->System.out.print(n + ",\t"));
		System.out.println("\n");

	} // main

}
