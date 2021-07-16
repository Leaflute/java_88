package test;

public class _14_Manager extends _14_Employee {

	// 멤버변수
	private double bonus;	// int 타입 -> double타입

	// 기본 생성자
	public _14_Manager(){}

	// 매개변수 생성자
	public _14_Manager(String sabun, String name, String deptName, int salary){
		super(sabun, name, deptName, salary);
	}

	// 멤버메서드 setter getter
	public void setBonus(int bonus){
		this.bonus = bonus;
	}
	public int getBonus(int bonus){
		return bonus;
	}

	//  receiveBonus()
	public void receiveBonus(){
		switch (super.getDeptName()){
		case "기획실" :
		bonus = super.getSalary()*0.05;
			break;
		case "전산실" :
		bonus = super.getSalary()*0.1;
			break;
		case "영업부" :
		bonus = super.getSalary()*0.15;
			break;
		default : 
			break;
		}
		System.out.println("부서 수당: " + bonus);
	}
	// printInfo()	
	@Override
	public void printInfo(){
		super.printInfo();

	}
}