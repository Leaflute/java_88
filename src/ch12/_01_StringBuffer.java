package ch12;

public class _01_StringBuffer {
	public static void main(String[] args) {
		/*
		 * StringBuffer: 문자열을 추가하거나 변경할 때 주로 사용하는 자료형이다.
		 * - 추가 : append()
		 * - 삽입 : insert(시작위치, 문자열) 특정위치에 원하는 문자열을 삽입
		 * - subString(시작위치, 끝위치) : 시작위치에서 끝 위치 -1까지의 공백포함 문자열을 추출한다. index는 0부터 시작하며 끝 위치보다 작아야한다.
		 * - toString() : 메서드를 이용해서 String형으로 변환.
		 */
		
		// StringBuffer 클래스 호출
		StringBuffer sb = new StringBuffer();
		
		// 추가
		sb.append("즐겁게 ");
		sb.append("플젝하고 ");
		sb.append("좋은 회사 ");
		sb.append("입사하자 ");
		
		System.out.println("sb: " + sb);
		System.out.println("sb.toString(): " + sb.toString());
		
		// 삽입
		sb.insert(9, "진짜 진짜 ");
		System.out.println("삽입 후: " + sb);
		
		// subString
		System.out.println("추출: " + sb.substring(4, 8));
		
		
	}
}
