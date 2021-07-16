package ch03;

public class _03_Car {
	
	// 멤버변수
	private String company;
	private String model;
	private int speed;
	private String color;
	
	// 생성자
	public _03_Car() {}
	
	// setter - 값을 설정
	// String company = "Mercedes Benz";
	public void setCompany(String company) {   // (String company) 매개변수
		this.company = company;    // this의 의미는 "현재 클래스의"
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	// 멤버메서드
	public void showInfo() {
		System.out.println("회사 : " + this.company);
		System.out.println("모델명 : " + model);
		System.out.println("최고속도 : " + speed + "km/h");
		System.out.println("색상 : " + color);
	}
		
}
