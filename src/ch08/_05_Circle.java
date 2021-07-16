package ch08;

/*
 * 마커 인터페이스: 구현할 메서드가 없는 인터페이스
 * Cloneable : 객체를 복제할 때 사용하는 인터페이스이며 구현할 메서드가 없음
 * 하지만 clone()을 하지 않으면 복제되지 않음
 */

// p367
public class _05_Circle implements Cloneable {
	
	_05_Point point;
	int radius;
	
	// 매개변수 생성자
	public _05_Circle(int x, int y, int radius) {
		this.radius = radius;
		point = new _05_Point(x,y);
	}
	
	// toString
	@Override 
	public String toString() {
		return "원점은 " + point + "이고, 반지름은 " + radius + "입니다.";
	}
	
	// 복제 메서드
	// CloneNotSupportedException : 클래스의  clone() 메서드가 지원되지 않았을 경우의 예외클래스
	@Override
	public Object clone() throws CloneNotSupportedException {	// throws : 상위메서드에게 예외를 떠넘김
		return super.clone(); 	// super : Object
	}
}
