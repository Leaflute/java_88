package ch06;

// 자식클래스
public class _04_Manager extends _04_Employee {

	// 멤버변수
	private int bonus;
	
	// 디폴트 생성자
	public _04_Manager() {}
	
	// 매개변수 생성자
	public _04_Manager(String sabun, String name, String deptName, int salary, int bonus) {
		super(sabun, name, deptName, salary);
		System.out.println("자식 매개변수 생성자 호출");
		this.bonus = bonus;
	}
	
	// setter getter
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	// 재정의 및 출력
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("보너스: " + bonus);
	}
}
