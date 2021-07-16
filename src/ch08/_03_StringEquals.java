package ch08;

// p360
public class _03_StringEquals {
	public static void main(String[] args) {
		
		String str1 = new String("abc");	// false
		String str2 = new String("abc");	// true
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1 == i2);		// false
		System.out.println(i1.equals(i2));	// true
	}
}
