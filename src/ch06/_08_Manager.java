package ch06;

// 자식클래스
public class _08_Manager extends _08_Employee {

	// 멤버변수
	private int bonus;
	
	// 디폴트 생성자
	public _08_Manager() {
		super();
	}
	
	// 매개변수 생성자
	public _08_Manager(String sabun, String name, String deptName, int salary, int bonus) {
		super(sabun, name, deptName, salary);
		this.bonus = bonus;
	}
	
	// setter getter
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	public void calBonus() {
		// 연보너스 : salary * 1.2 + bonus
		System.out.println("연보너스: " + (12*super.getSalary()+this.bonus));
	} 
	//
	public void showInfo() {
		super.showInfo();
		System.out.println("보너스: " + bonus);
	}
}
