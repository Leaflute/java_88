package ch08;

// p364
public class _04_HashCodeTest {
	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.hashCode());	// String 클래스에서 재정의된 hashCode
		System.out.println(str2.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.hashCode());		// Integr 클래스에서 재정의된 hashCode
		System.out.println(i2.hashCode());
	}
}
