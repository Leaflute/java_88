package ch12;

import java.util.ArrayList;
import java.util.List;

public class _03_Main {
	public static void main(String[] args) {
		
		// 매개변수 생성자를 통해 값 전달
		_03_Enum cat = new _03_Enum(Animal.CAT, "단또");
		_03_Enum dog = new _03_Enum(Animal.DOG, "댕댕");
		_03_Enum fish = new _03_Enum(Animal.FISH, "붕어");
		
		// 리스트에 담는다.
		List<_03_Enum> list = new ArrayList<_03_Enum>();
		list.add(cat);
		list.add(dog);
		list.add(fish);
		
		// 향상된 for문으로 출력
		for (_03_Enum e : list) {
			System.out.println(e);
		}
	}
}
