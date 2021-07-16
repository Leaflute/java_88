package ch03;

public class _04_WorkerMain {
	public static void main(String[] args) {
		
		// 인스턴스 생성
		_04_Worker mSPark = new _04_Worker();
		
		// setter
		mSPark.setSabun("1001");
		mSPark.setName("박명수");
		mSPark.setSalary(100000);
		
		// printInfo 호출로 출력
//		mSPark.printInfo();
		
		// getter호출
		System.out.println("사번: " + mSPark.getSabun());
		System.out.println("이름: " + mSPark.getName());
		System.out.println("일급: " + mSPark.getSalary());
	} 
}
