package ch06;

// 부모클래스
public class _01_Animal {
	
	// 멤버변수
	private String kind;
	private int legs;
	
	// 디폴트 생성자
	public _01_Animal() {
	}
	
	// 매개변수 생성자
	public _01_Animal(String kind, int legs) {
		this.kind = kind;
		this.legs = legs;
	}
	
	// 멤버메서드 setter getter
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getLegs() {
		return legs;
	}
	
	// 멤버메서드 (공통)
	
	public void eat() {
		System.out.println(kind + "는 밥을 먹는다");
	}
	
	public void sleep() {
		System.out.println(kind + "는 잠을 잔다~~");
	}
	
	public void play() {
		System.out.println(kind + "는 혼자 잘논다★");
	}
	
	// printInfo()
	public void printInfo() {
		System.out.println(kind + "는 다리가 " + legs + "개이다.");
	}
}
