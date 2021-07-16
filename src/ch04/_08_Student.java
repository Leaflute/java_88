package ch04;


// p175 객체간 협력
public class _08_Student {
	
	// 멤버변수
	public String studentName; 
	public int grade; // 학년
	public int money; // 학생 보유금
	
	// 디폴트 생성자
	public _08_Student() {}
	
	// 매개변수 생성자
	public _08_Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	// 매개변수를 통해 주소값을 전달받음
	// 멤버메서드 - 버스를 타다
	public void takeBus(_08_Bus bus) {
		// _08_Bus bus = new _08_Bus();
		bus.take(1000);
		this.money -= 1000;
	}
	
	// 멤버메서드 - 지하철을 타다
	public void takeSubway(_08_Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	// 멤버메서드 - 택시를 타다
	public void takeTaxi(_08_Taxi taxi) {
		taxi.take(7000);
		this.money -= 7000;
	}
	
	public void showInfo() {
		System.out.println(studentName + "의 남은 돈은 " + money + "입니다.");
	}
}
