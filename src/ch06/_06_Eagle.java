package ch06;

// 자식클래스
public class _06_Eagle extends _06_Animal {
	
	// 디폴트 생성자
	public _06_Eagle() {}
	
	@Override  // 부모의 메서드를 재정의
	public void move() {
		System.out.println("독수리가 난다.");
	}
	public void flying() {
		System.out.println("독수리가 날갯짓한다.");
	}

}
