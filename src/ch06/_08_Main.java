package ch06;

public class _08_Main {
	public static void main(String[] args) {
		
		// 1. 자식 매개변수 생성자 호출
		// p.260
		
		_08_Employee emp1 = new _08_Manager("a1234", "조조", "총무부", 8000000, 60000);
		emp1.showInfo();
		if (emp1 instanceof _08_Manager) {
			_08_Manager manager = (_08_Manager)emp1;
			manager.calBonus();
		}	
		
		allPrintInfo(new _08_Manager("a1234", "조조", "총무부", 8000000, 60000));
		System.out.println();
		allPrintInfo(new _08_Sawon("b1234", "손권", "회계부", 7000000, 30000));
	}
	
	public static void allPrintInfo(_08_Employee employee){
		employee.showInfo();
		if (employee instanceof _08_Manager) {
			_08_Manager manager = (_08_Manager)employee;
			manager.calBonus();
		} else if (employee instanceof _08_Sawon) {
			_08_Sawon sawon = (_08_Sawon)employee;
			sawon.calSudang();
		}
	}
}
