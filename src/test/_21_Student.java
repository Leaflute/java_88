package test;

public class _21_Student {

	private int studentId;
	private String name;
	private String email;
	
	public _21_Student(){}
	public _21_Student(int studentId, String name, String email){
		this.studentId = studentId;
		this.name = name;
		this.email = email;
	}

	public void setStudentId(int studentId){
		this.studentId = studentId;
	}
	public int getStudentId(){
		return studentId;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return email;
	}
	
	@Override
	public String toString(){
		return "학번: " + studentId + ", 이름: " + name + ", 이메일: " + email;
	}
}