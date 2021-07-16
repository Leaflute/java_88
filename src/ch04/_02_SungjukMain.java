package ch04;

public class _02_SungjukMain {
	public static void main(String[] args) {
	
		// 인스턴스 생성
		_02_Sungjuk sung = new _02_Sungjuk();
		
		int kor = 100;
		int eng = 92;
		int math = 96;
		
		// 방법1.setter
		sung.setKorScore(kor);
		sung.setEngScore(eng);
		sung.setMathScore(math);
		
		// 방법2.매개변수 생성자를 이용해 값 설정
		_02_Sungjuk sungjuk = new _02_Sungjuk(kor, eng, math);
		
		// 국영수 총점 평균
		System.out.println("*** 성적 출력 ***");
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sung.getTotal());
		System.out.println("총점 : " + sung.getAvg());
		
		System.out.println("*** 성적 출력 ***");
		
		System.out.println("총점 : " + sungjuk.getTotal());
		System.out.println("총점 : " + sungjuk.getAvg());
	}
	
}
