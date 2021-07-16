package ch07;

// 자식클래스
public abstract class _01_Laptop extends _01_Computer {

	@Override
	public void display() {
		System.out.println("_01_Laptop - display()");
	}

	// 추상메서드 typing();이 구현이 되지 않았으므로 abstract 클래스가 된다.
}
