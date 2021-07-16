package ch01;

public class _09_PrintEx {
	public static void main(String[] args) {
		
		/*
		 * printf(형식지정자, 값 또는 변수)
		 * - 형식지정자 
		 * %d : 정수를 출럭한다. 예) System.out.printf("%d", 10);
		 * %f : 실수를 출력한다. 예) System.out.printf("%f", 3.14f); // 실수 6자리
		 * %c : 한 문자를 출력한다. 예) System.out.printf("%c", 'a');
		 * %s : 문자열을 출력한다. 예)  System.out.printf("%s", "Good Luck");
		 */
		
		double value = 1.0/3.0;
		System.out.println("value: " + value);	
		System.out.printf("%f",+ value);
		System.out.println();
		System.out.println();
		
		// printf(%전체자릿수.나머지자릿수f", value); => 자릿수 부족시 공백으로 채운다
		// 0.33
		System.out.printf("%6.2f", value);  // 앞의 두 자리가 공백으로 채워짐
		
		System.out.println();
		System.out.printf("%s", "20210520");
	}

}
