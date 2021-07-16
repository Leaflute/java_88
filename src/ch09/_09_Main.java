package ch09;

public class _09_Main {
	public static void main(String[] args) {
		
		/*
		 * [면접]
		 * - Generic 
		 * 여러 참조 자료형이 쓰일 수 있는 곳에 특정 자료형을 지정하지 않고
		 * Generic 클래스의 인스턴스 생성시점에 어떤 자료형을 사용할 것인지 지정하는 방식
		 * 
		 * - 제네릭 클래스의 선언
		 * 클래스명<매개변수 자료형 알파벳 대문자> 
		 * T(type parameter), E(elements), K(key), V(value), N(number)
		 * 
		 * - 제네릭 클래스의 활용
		 * 인스턴스 생성(new)시 reference type을 대입해 자료 타입을 확정해 사용함.
		 * 
		 * - 제네릭을 구현하면 형변환을 하지 않아도 된다.(다형성 적용과 다운 캐스팅에 신경쓸 필요가 없음)
		 * 
		 * - 제네릭 클래스와 static 
		 * T의 자료형이 정해지는 순간은 제네릭 클래스의 인스턴스가 생성되는 순간임
		 * 따라서 static은 T의 자료형이 결정되는 시점보다 빠르기 때문에 인스턴스 생성시점에 static에 들어가지 않으면 활용불가
		 */	
		 
		_09_GenericPrinter<_09_Powder> powderP = new _09_GenericPrinter<_09_Powder>();
		powderP.setMaterial(new _09_Powder());	// _09_Powder material = new _09_Powder(); , 다형성을 적용할 필요가 없음
		
		_09_Powder powder = powderP.getMaterial();	 
		powder.doPrinting();	// 다운캐스팅이 필요 없음
		System.out.println(powder.toString());
		
		_09_GenericPrinter<_09_Plastic> plasticP = new _09_GenericPrinter<_09_Plastic>();
		plasticP.setMaterial(new _09_Plastic());
		
		_09_Plastic plastic = plasticP.getMaterial();
		plastic.doPrinting();
		System.out.println(plastic.toString());
	}
}
