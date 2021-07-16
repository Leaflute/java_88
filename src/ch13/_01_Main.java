package ch13;

// p467
public class _01_Main {
	public static void main(String[] args) {
		
		String s1 = "Good";
		String s2 = "Luck";
		
		// 인터페이스명 참조변수 = (매개변수1, 매개변수2, ..) -> 구현부;
		_01_StringConcat concat = (x, y) -> System.out.println(x + " " + y);
		concat.makeString(s1, s2);
	}
}
