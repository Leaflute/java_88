package ch08;

// studentlee.equals(studentSang)이 동일하도록 예제
// p358 + p361 + p365 => hashCode() 오버라이드해서 studentID 리턴

//물리적 동일(주소 동일) : 1000 1000   .. 100, 이상원  => Object의 equals() : 주소값 비교 => 물리적 동일 :  "==", 오버라이드 안된 equals()
//논리적 동일(값 동일)    : 2000          ... 100, 이상원  => 오버라이드         :  값 비교 => 논리적 동일(값 동일) :  오버라이드된 equals()

public class _02_StudentMain {
	public static void main(String[] args) {
		
		_02_Student studentLee = new _02_Student(100, "이상원");
		_02_Student studentLee2 = studentLee;	// 주소 복사
		_02_Student studentSang = new _02_Student(100, "이상원");
		
		// equals 체크
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같다.");
		} else {
			System.out.println("studentLee와 studentLee2의 주소는 다르다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2는 동일하다.");
		} else {
			System.out.println("studentLee와 studentLee2는 동일하지 않다.");
		}
		
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentSang의 주소는 같다.");
		} else {
			System.out.println("studentLee와 studentSang의 주소는 다르다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentSang는 동일하다.");
		} else {
			System.out.println("studentLee와 studentSang는 동일하지 않다.");	// 재정의된 equals에 의해 논리적으로 동일
		}
		
		// hashCode 체크
		System.out.println("studentLee의 hashCode: " + studentLee.hashCode());	// 재정의된 hashCode에 의해 studentID를 반환
		System.out.println("studentSang의 hashCode: " + studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값: " + System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값: " + System.identityHashCode(studentSang));

	}

}
