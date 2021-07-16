package ch07;

/*
 * 참조 자료형 
 * class, array, interface 
 * 참조 변수를 가짐
 */

public class _09_InterfaceEx {
	public static void main(String[] args) {
		A09 a09 = new A09();
		a09.autoPlay(new B09());	// I09 i09 = new B09();
		a09.autoPlay(new C09());
	}
}

class A09 {
	public void autoPlay(I09 i09) {		// 다형성이 적용된  call by reference
		// 인터페이스의 추상메서드 호출
		i09.play();
	}
}

interface I09 {
	public void play();
}

class B09 implements I09 {

	@Override
	public void play() {
		System.out.println("B09클래스 - play()");
	}
}

class C09 implements I09{

	@Override
	public void play() {
		System.out.println("C09클래스 - play()");
	}
}