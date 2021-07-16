package test;

public class _23_InvalidScoreException extends Exception {

	private int wrongScore;

	// 생성자
	public _23_InvalidScoreException() {}				// 기본 생성자 누락
	public _23_InvalidScoreException(String message){	// String 누락
		super(message);
	}

	// setter getter
	public void setWrongScore(int wrongScore){
		this.wrongScore = wrongScore;
	}
	public int getWrongScore(){
		return wrongScore;
	}

	// shwWrongScore
	public void showWrongScore(){
		System.out.println("잘못된 점수 입력! " + wrongScore);
	}
}