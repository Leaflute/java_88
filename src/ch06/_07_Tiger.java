package ch06;

// 자식클래스
public class _07_Tiger extends _07_Animal {
	
	// 디폴트 생성자
	public _07_Tiger() {}
	
	@Override  // 부모의 메서드를 재정의
	public void move() {
		System.out.println("호랑이가 네 발로 뛴다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 한다");
	}

}
