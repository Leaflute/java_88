package ch03;

public class _04_Worker {
	
	// setter, getter => DTO(Data Transfer object)
	
	// 기본생성자(없어도 됨)
	public _04_Worker() {}
	
	// 멤버변수 - 속성
	private String sabun;     //  사번: 1001
	private String name;	  //  이름: 박명수
	private int salary;		  //  급여: 100000	
	
	// 멤버메서드 - setter - 값을 받아 멤버변수에 설정
	// 1. main 에서 값 전달 -> 2. 매개변수 -> 3. 멤버변수
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public void setSalary(int salary) {
		this.salary = salary;
	}			
	
	// getter - 멤버변수의 값을 반환
	public String getSabun() {
		return sabun;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	// 멤버메서드 - 출력
	public void printInfo() {
		System.out.println("사번: " + sabun);
		System.out.println("이름: " + name);
		System.out.println("일급: " + salary);		

	}
}
