package test;

public class _07_Sungjuk {
	
	// 기본 생성자
	public _07_Sungjuk() {}
	
	// 멤버변수
	private int kor;
	private int eng;
	private int math;

	// setter 메서드
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	
	// getTotal(){}
	public int getTotal(){
		return kor + eng + math;
	}
	// getAvg(){}
	public int getAvg(){
		return getTotal()/3;
	}

}