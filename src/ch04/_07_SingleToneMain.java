package ch04;

public class _07_SingleToneMain {
	public static void main(String[] args) {
		
		// 인스턴스 생성  - 오류 : 디폴트 생성자가 private라 접근 불가
//		_07_Company instance = new _07_Company();
				
		_07_Company instance1 = _07_Company.getInstance();
		_07_Company instance2 = _07_Company.getInstance();
		
		// setter값 설정
		instance1.setCompanyName("애플");
		instance1.setAddress("캘리포니아");
		instance1.setTelno("01000001000");
		instance1.printInfo();
		System.out.println(instance1);
		
		instance2.setCompanyName("삼성");
		instance2.setAddress("서울");
		instance2.setTelno("01000001000");
		instance2.printInfo();
		System.out.println(instance2);
		System.out.println(instance1 == instance2);
	}
}
