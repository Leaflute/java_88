package test ;

public class _08_SungjukEx{
	
	// 멤버변수
	int kor;
	int eng;
	int math;

	//default 생성자
	public _08_SungjukEx(){}
	
	//매개변수 생성자
	public _08_SungjukEx(int kor, int eng, int math){
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// getter, setter
	public int getKor(){
		return kor;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public int getEng(){
		return eng;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public int getMath(){
		return math;
	}
	public void setMath(int math){
		this.math = math;
	}

	// getTotal() 메서드
	public int getTotal(){
		return kor + eng + math;
	}

	// getAvg() 메서드
	public double getAvg(){
		return getTotal()/3.0;
	}

	// getGrade() 메서드
	public char getGrade(){
		char ch = ' ';
		switch ((int)getAvg()/10) {
			case 10 :
			case 9 : ch = 65;       //return은 문장 마지막에 옴
				break;
			case 8 : ch = 66;
				break;
			case 7 : ch = 67;
				break;
			case 6 : ch = 68;		
				break;
			default : ch = 70;
		}
		return ch;
	}

	// printInfo() 메서드
	public void printInfo(){
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + getTotal());
		System.out.print("학점 :");
		System.out.printf("%6.2f",getAvg());
		System.out.println();
		System.out.println("학점 : " + getGrade()); 
	}
}