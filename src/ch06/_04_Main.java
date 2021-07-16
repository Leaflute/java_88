package ch06;

public class _04_Main {
	public static void main(String[] args) {
		
		// 1. 자식 매개변수 생성자 호출 => 전체 멤버변수 초기화
		System.out.println("-------- 사원 정보 --------");
		_04_Sawon sawon = new _04_Sawon();	// 부모 디폴트 생성자, 자식 디폴트 생성자
		sawon.showInfo();
		
		_04_Sawon sawon2 = new _04_Sawon("0a01", "김두한", "영업부", 800000, 90000);	//부모 디폴트 생성자, 자식 매개변수 생성자 호출
		sawon2.showInfo();
		
		System.out.println("-------- 매니저 정보 --------");
		_04_Manager man = new _04_Manager("0b01", "심영", "총무부", 1000000, 150000);
		man.showInfo();
	}
}
