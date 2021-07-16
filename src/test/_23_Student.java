package test;

public class _23_Student {
	
	private String name;
	private int score;

	// 생성자
	public _23_Student() {}
	public _23_Student(String name, int score){
		this.name = name;
		this.score = score;
	}

	// setter getter
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setScore(int Score){
		this.score = score;
	}
	public int getScore(){
		return score;	
	}

	// printStudentInfo
	public void printStudentInfo(){
		System.out.println("이름: " + name + "\n자바 점수: " + score); 
	}
}