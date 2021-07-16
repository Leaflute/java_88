package ch08;

// p370
// str1, str2는 동적메모리 공간인 힙메모리 주소이다.
// String, Integer 클래스는 equals(), hashCode()가 미리 재정의되어있다.
public class _06_StringTest1 {
	public static void main(String[] args) {
		
		String str1 = new String("abc"); 
		String str2 = new String("abc");
		
		System.out.println(str1 == str2);	// 실제 주소값은 다르다 false
		System.out.println(str1.equals(str2));	// true 자동으로 재정의된 equals이기 때문에 같다
		
		String str3 = "abc";	//상수 풀에 들어감
		String str4 = "abc";
		
		System.out.println(str3 == str4);	// true
		System.out.println(str3.equals(str4));	// true
	}

}
