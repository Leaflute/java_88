package ch13;

// p465
// @FunctionalInterface : 함수형 인터페이스
// 내부에 하나의 메서드만 가능하며(람다식은 메서드 이름이 없는 익명함수로 구현) 둘 이상일시 컴파일러가 오류를 띄운다
@FunctionalInterface
public interface _01_StringConcat {
	public void makeString(String s1, String s2);
}
