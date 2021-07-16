package ch04;

public class _02_Sungjuk {

	private int korScore;
	private int engScore;
	private int mathScore;
	
	// 기본생성자
	/*
	 * 생성자는 클래스를 생성할때만 호출한다.
	 * 생성자 이름은 클래스이름과 동일, 생성자는 반환값이 없음
	 * 컴파일할 때 컴파일러가 자동으로 생성자를 만들어준다.
	 * 하지만 매개변수 생성자가 존재하면 컴파일러가 자동으로 생성자를 만들지 않는다.
	 */
	public _02_Sungjuk() {}
	
	// 매개변수생성자
	public _02_Sungjuk(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	// setter로 값을 설정
	
	// getTotal() - 3 과목 합계
	
	// getAvg() - 3 과목 평균
	
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}	
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}	
	
	
	
	public int getTotal(){
		return korScore + engScore + mathScore;
	}
	
	public int getAvg() {
		return getTotal()/3;
	}
	
	
}
