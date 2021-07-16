package ch08;

public class _09_Main {
	public static void main(String[] args) throws ClassNotFoundException {
		
		_09_Person person = new _09_Person();
		Class pClass1 = person.getClass();	// Object의 getclass메서드 호출
		System.out.println(pClass1.getName());
		
		Class pClass2 = _09_Person.class;	// class 파일 대입
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("ch08._09_Person");	// forName()을 쓸 때 예외처리를 하지 않으면 오류 발생
		System.out.println(pClass3.getName());
	}

}
