package ch08;

// p371
public class _07_StringTest2 {
	   // value 변수 : private final char[] value => final이므로 한번 생성된 문자열은 변경되지 않는다.
	   // 따라서 값이 변경되거나 추가시 새로운 문자열이 생성된다.
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: " + System.identityHashCode(javaStr));
		
		// concat() 메서드는 문자열을 연결함
		javaStr = javaStr.concat(androidStr);	// 새로이 인스턴스가 생성된다
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소 값: " + System.identityHashCode(javaStr));
	}
}
