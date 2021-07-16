package ch06;

public class _03_Main {
	public static void main(String[] args) {
		
		// 참조변수
		_03_Manager manager = new _03_Manager();
		_03_Sawon sawon = new _03_Sawon();
		
		// setter
		manager.setSabun("0000");
		manager.setName("엄복동");
		manager.setDeptName("인사부");
		manager.setSalary(90000000);
		manager.setBonus(900000);
		manager.printInfo();			// 재정의(오버라이드) 부모 클래스와 자식 메서드에 동일한 이름의 메서드가 있으면 자식 메서드만 실행
		
		System.out.println("----------");
		sawon.setSabun("0001");
		sawon.setName("이여름");
		sawon.setDeptName("총무부");
		sawon.setSalary(60000000);
		sawon.setSudang(500000);
		sawon.printInfo();
		
	}
}
