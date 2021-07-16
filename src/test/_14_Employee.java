package test;

public class _14_Employee{

	// 멤버변수
	private String sabun;
	private String name;
	private String deptName;
	private int salary;

	// 디폴트 생성자
	public _14_Employee(){}

	// 매개변수 생성자
	public _14_Employee(String sabun, String name, String deptName, int salary){
		this.sabun = sabun;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
	}

	// 멤버메서드 setter getter
	public void setSabun(String sabun){
		this.sabun = sabun;
	}
	public String getSabun(){
		return sabun;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setDeptName(String deptName){
		this.deptName = deptName;
	}
	public String getDeptName(){
		return deptName;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public int getSalary(){
		return salary;
	}

	// printInfo()
	public void printInfo(){
		System.out.println("사번: "  + sabun + "\n이름: " + name + "\n부서: " + deptName + "\n월급: " + salary);
	}
}	