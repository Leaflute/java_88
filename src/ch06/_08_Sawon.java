package ch06;

// 자식클래스
public class _08_Sawon extends _08_Employee {
	
	// 멤버변수
	private int sudang;	// 수당
	
	// 디폴트 생성자
	public _08_Sawon() {
		super();	// 부모 디폴트 생성자 먼저 호출

	}
	
	// 매개변수 생성자
	public _08_Sawon(String sabun, String name, String deptName, int salary, int sudang) { 
		//  2. 자식의 매개변수 생성자가 부모의 매개변수 생성자 호출
		super(sabun, name, deptName, salary); // 항상 첫 번째 줄에 와야함
		this.sudang = sudang;
	}
	
	// 멤버메서드(setter, getter)
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public int getSudang() {
		return sudang;
	}
	
	public void calSudang() {
		System.out.println("연수당: " + (12*super.getSalary()+this.sudang));
	}
	
	@Override
	public void showInfo() {
		// 5-1. 호출
		super.showInfo();	// 부모참조변수.멤버메서드
		System.out.println("수당: " + sudang);
	}
}
