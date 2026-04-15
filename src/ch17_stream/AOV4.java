package ch17_stream;

import java.util.ArrayList;
import java.util.List;

public class AOV4 {

	public static void main(String[] args) {

		List<AProduct> list = new ArrayList<>();
		list.add( new AProduct("새우깡", 100, 1500) );
		list.add( new AProduct("신라면", 500, 1000) );
		list.add( new AProduct("사이다", 300, 2000) );

		System.out.print("Product Name : ");
		list.stream().map(p->p.getName()).forEach(s->System.out.print(s + ",\t"));
		System.out.println("\n");

		System.out.print("Product Total Stock : ");
		System.out.println( list.stream().mapToInt(p->p.getStock()).sum() + "개\n");

		System.out.print("Product Total Price : ");
		System.out.println( list.stream().mapToInt(p->p.getStock() * p.getPrice()).sum() + "원\n");

		System.out.print("300개 이상 재고가 있는 제품 : ");
		list.stream()	.filter(p->p.getStock() >= 300)
						.map(p->p.getName())
						.sorted()
						.forEach(s->System.out.print(s + ",\t"));
		System.out.println("\n");

	} // main

}
