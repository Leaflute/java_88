package ch06;

// 자식클래스
public class _02_PoliceCar extends _02_Car {
	
	// 기본생성자
	public _02_PoliceCar() {}
	
	// 멤버메서드 (고유)
	public void siren() {
		System.out.println(kind + " 사이렌을 울리다");
	}
}


