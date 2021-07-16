package ch03;

public class _03_CarMain {
	public static void main(String[] args) {
		
		//인스턴스 생성
		_03_Car car = new _03_Car(); 
		
		// 멤버변수 초기화
//		car.company = "Mercedes Benz";
//		car.model = "e300";
//		car.speed = 245;
//		car.color = "silver";
		
		// setter를 통해 멤버변수 초기화
		car.setCompany("Mercedes Benz");
		car.setModel("e300");
		car.setSpeed(245);
		car.setColor("silver");
		
		//메서드 호출 - 출력
		car.showInfo();
	}
}
