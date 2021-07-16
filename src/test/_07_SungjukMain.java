package test;

public class _07_SungjukMain {
	public static void main(String[] args){
		
		int kor = 70;
		int eng = 80;
		int math = 90;
	
		// 참조변수 선언
		_07_Sungjuk grade01 = new _07_Sungjuk();
	
		// setter
		grade01.setKor(kor);
		grade01.setEng(eng);
		grade01.setMath(math);
	
		// 성적 호출 후 출력
		System.out.println("==== 성적표 ====");
		System.out.println("=============");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng); 
		System.out.println("수학: " + math);
		System.out.println("총점: " + grade01.getTotal());
		System.out.println("평균: " + grade01.getAvg());
	}
}