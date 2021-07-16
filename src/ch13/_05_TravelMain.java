package ch13;

import java.util.ArrayList;
import java.util.List;

// p482
public class _05_TravelMain {
	public static void main(String[] args) {
		
		List<_05_TravelCustomer> customerList = new ArrayList<>();
		customerList.add(new _05_TravelCustomer("유나얼",38,100));
		customerList.add(new _05_TravelCustomer("박효신",40,75));
		customerList.add(new _05_TravelCustomer("김범수",42,50));

		System.out.println("-- 명단 추가된 순서대로 출력 --");
		customerList.stream().map(c -> c.getName()).forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// mapToInt() : map의 값을 int로 형변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용: " + total);
		
		System.out.println("-- 20세 이상 고객 명단 정렬해 출력 --");
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.print(s + " "));
		
	}
}
