package ch06;

// 부모클래스
public class _04_Employee {

	// 4. 멤버변수
	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	// 디폴트 생성자
	public _04_Employee() {
		System.out.println("부모 디폴트 생성자");
	}
	
	// 3. 매개변수 생성자
	public _04_Employee(String sabun, String name, String deptName, int salary) {
		System.out.println("부모 매개변수 생성자");
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	// 멤버메서드(setter, getter)
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public String getSabun() {
		return sabun;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setdeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getdeptName() {
		return deptName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	// 5-1. 출력
	public void showInfo() {
		System.out.println("사번: " + sabun + "\n이름: " + name + "\n부서명: " + deptName + "\n급여: " + salary);
	}
	
}
