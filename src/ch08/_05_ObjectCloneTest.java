package ch08;

// p366
public class _05_ObjectCloneTest {
	 public static void main(String[] args) throws CloneNotSupportedException {
		 
		 _05_Circle circle = new _05_Circle(10, 20, 30);
		 System.out.println(circle);	// circle.toString
		 
		 _05_Circle copyCircle = (_05_Circle)circle.clone();	// 복제메서드로서 반환형이 Object형이므로 다운캐스팅
		 System.out.println(copyCircle);	// copyCircle.toString
		 
		 System.out.println(System.identityHashCode(circle));
		 System.out.println(System.identityHashCode(copyCircle));
		 
		 // 인스턴스를 복제하면, 멤버변수와 멤버메서드는 같지만 실제 주소값은 다르다.
	}
}
