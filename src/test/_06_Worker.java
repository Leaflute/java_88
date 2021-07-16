package test;

public class _06_Worker {
	// 멤버 변수
	private int sabun;
	private String name;
	private int age;
	
	// 기본 생성자
	public _06_Worker(){}

	// 매개변수 생성자        
	public _06_Worker(int sabun, String name, int age) {
		 this.sabun = sabun;     // this.xxx 누락
		 this.name = name;		  // this.xxx 누락
		 this.age = age;		 // this.xxx 누락		
	}

	// setter 멤버 메서드
	public void setSabun(int sabun){
		this.sabun = sabun;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}

	// showInfo(){출력}
	public void showInfo(){
		System.out.println("사번 : " + sabun);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
}