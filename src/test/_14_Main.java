package test;

public class _14_Main {
	public static void main(String[] args){
	
	// 기본생성자 + 다형성
	_14_Employee gang = new _14_Manager();	
	gang.setSabun("E2021001");
	gang.setName("강호동");
	gang.setDeptName("전산실");
	gang.setSalary(30000000);
	gang.printInfo();
	_14_Manager ga = (_14_Manager)gang;
	ga.receiveBonus();

	System.out.println();
	
	// 매개변수생성자 + 다형성
	allPrintInfo(new _14_Sawon("y2020001", "홍길동", "기획실", 25000000));

	}
	
	public static void allPrintInfo(_14_Employee emp){
		emp.printInfo();
		if (emp instanceof _14_Manager){
			_14_Manager man = (_14_Manager)emp;
			man.receiveBonus();
		} else if (emp instanceof _14_Sawon){
			_14_Sawon sa = (_14_Sawon)emp;
			sa.receiveSudang();
		}
	} 

} 