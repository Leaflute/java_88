package ch06;

public class _03_Employee {
	
	private String sabun;
	private String name;
	private String deptName;
	private int salary;
	
	// 기본 생성자
	public _03_Employee() {}
	
	// 매개변수 생성자
	public _03_Employee(String sabun, String name, String deptName, int salary) {
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}
	
	// getter() setter()
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
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	// printInfo()
	public void printInfo() {
		System.out.println("사번: " + sabun);
		System.out.println("\n이름: " + name);
		System.out.println("부서: " + deptName);
		System.out.println("봉급: " + salary);
	}
}
