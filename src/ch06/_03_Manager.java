package ch06;

// 자식클래스
public class _03_Manager extends _03_Employee {
	
	// 멤버변수
	private int bonus;
	
	// 기본생성자
	public _03_Manager(){}
	
	// 매개변수생성자
	public _03_Manager(int bonus){
		this.bonus = bonus;
	}
	
	// setter() getter()
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public int getBonus() {
		return bonus;
	}
	
	/*
	 * p250 [면접] 오버로드 vs 오버라이드
	 * @Override 어노테이션 : "이 메서드는 재정의된 메서드입니다."라고 컴파일러에게 명확히 알려주는 역할을 한다.
	 * 오버라이딩(=재정의)
	 * 자식 클래스의 메서드가 부모클래스의 메서드를 오버라이드(재정의)한다
	 * 상속에서 부모클래스의 메서드를 변경하고자 할 때 사용한다
	 * 메서드 이름, 매개변수, 매개변수 자료형, 반환형까지 모두 동일해야 한다.(동일하지 않으면 컴파일러가 다른 컴파일러로 인식한다.)
	 * 호출시 오버라이드한 자식메서드가 호출된다.
	 * 오버라이드 목적: 부모클래스의 메서드를 변경해서 자식쪽에서 호출하고자 함
	 * 사전적인 의미: 부모메서드의 기능을 무시한다.
	 * 
	 */
	
	@Override // 재정의
	// printInfo()
	public void printInfo() {
		/*
		 * p244
		 * super : 부모의 참조변수
		 * 하위클래스에서 상위클래스로 접근할 때 사용
		 * 하위클래스는 상위클래스의 주소, 즉 참조값을 알고있음
		 * 예)super.printInfo();
		 * 상위클래스의 생성자를 호출할 때도 사용한다.
		 * 예)super();
		 * 예)super(sabun, name, deptName, salary);
		 * 참고) this : 자기자신의 주소값
		 */
		
		super.printInfo();	// super : 부모 생성자
		System.out.println("보너스: " + bonus);
	}

}
