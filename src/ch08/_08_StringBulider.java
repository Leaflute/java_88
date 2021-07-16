package ch08;

/* p373
 * StringBuffer와 StringBulider는 내부에 변경가능한 char[]를 변수를 가지고 있다
 * 문자열 변경시 기존에 사용하던 char[] 배열이 확장되므로 추가 메모리를 사용하지 않음
 * StrinfBuffer클래스는 문자열이 안전하게 변경되도록 보장하지만 StringBuilder클래스는 보장하지 않음
 * 
 */

 public class _08_StringBulider {
	 public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);	// String으로부터 StringBuilder를 생성
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun??");
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		// 문자열을 추가해도 주소값이 같음
		
		javaStr = buffer.toString();	// String 클래스로 변환해 주소가 변경됨
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소: " + System.identityHashCode(javaStr));
	}

}
