package ch06;

public class _01_Main {
	public static void main(String[] args) {
		
		// cat 자식 클래스 정보 출력
		
		// 메모리생성
		_01_Dog dog = new _01_Dog();
		_01_Cat cat = new _01_Cat();
		
		// 변수 대입
		dog.setKind("댕댕이");
		dog.setLegs(4);
		cat.setKind("껄룩이");
		cat.setLegs(4);
		
		// 강아지
		dog.printInfo();	// 공통
		dog.eat();		// 공통
		dog.sleep();	// 공통
		dog.play();		// 공통
		dog.bark();		// 고유

		// 고양이
		cat.printInfo();
		cat.eat();
		cat.sleep();
		cat.play();
		cat.cry();

	}
}
