package test;

public class _14_Sawon extends _14_Employee {

	// 멤버변수
	private double sudang;	// int타입 -> double타입 

	// 기본 생성자
	public _14_Sawon(){}

	// 매개변수 생성자
	public _14_Sawon(String sabun, String name, String deptName, int salary){
		super(sabun, name, deptName, salary);
	}

	// 멤버메서드 setter getter
	public void setSudang(int sudang){
		this.sudang= sudang;
	}
	public int getBonus(int sudang){
		return sudang;
	}

	//  receiveSudang()
	public void receiveSudang(){
		if (super.getDeptName() == "기획부") {
			sudang = super.getSalary()*0.05;
		} else if (super.getDeptName() == "전산실") {
			sudang = super.getSalary()*0.1;
		} else if (super.getDeptName() == "영업부") {
			sudang = super.getSalary()*0.15;
		}
		System.out.println("부서 수당: " + sudang);
	}	// 누락
	
	// printInfo()	
	@Override
	public void printInfo(){
		super.printInfo();
	}
}