package test;

public class _06_WorkerMain {
	public static void main(String[] args){

	int sabun = 202101;
	String name = "김점순";
	int age = 25;


	_06_Worker memberKim = new _06_Worker();
	
	// setter를 이용한 값 설정
	// 출력
	memberKim.setSabun(sabun);
	memberKim.setName(name);
	memberKim.setAge(age);
	memberKim.showInfo();

	System.out.println("-----------------------");
	
	// 매개변수 생성자를 이용한 값 설정
	// 출력
	_06_Worker memberHong = new _06_Worker(202001, "홍길동", 27);
	memberHong.showInfo();

	}
} 