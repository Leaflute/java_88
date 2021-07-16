package ch06;

// 자식클래스
public class _07_Human extends _07_Animal {
	
	// 디폴트 생성자
	public _07_Human() {}
	
	@Override  // 부모의 메서드를 재정의
	public void move() {
		System.out.println("사람이 걷는다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽는다.");
	}

}
