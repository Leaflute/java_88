package ch01;

public class _01_VariableEx {

	public static void main(String[] args) {
		
		// 변수는 소문자로 시작한다.
		System.out.println("*** 변수 ***");
		System.out.println("변수 : 프로그래밍에서 값(Data)을 저장하기 위한 공간");
		
		String name = "김태희"; // 자료형 변수명 = 값;
		System.out.println("이름 : " + name);
		
		// String name2 = "나도웅";
		name = "나도웅";
		System.out.println("이름 : " + name);
		
	    int age = 35;
		System.out.println("나이 : " + age);
	    
	    String email = "boris0070@naver.com";
	    System.out.println("E-mail : " + email);
	    
	    String adress = "서울특별시 은평구 백련산로4길";
	    System.out.println("주소 : " + adress);
				
	}
}
