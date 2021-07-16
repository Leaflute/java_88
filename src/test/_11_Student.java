package test;

	public class _11_Student{

	private String studentID;
	private String name;
	private int age;
	private String hobby;
	
	public _11_Student(){}
	
	public _11_Student(String studentID, String name, int age, String hobby) {
		this.studentID = studentID;				// this.구문 생략
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	
	public void setStudentID(String studentID){
		this.studentID = studentID;              //대소문자 구분
	}

	public String getStudentID(){
		return studentID;						//;생략
	}

	public void setName(String name){
		this.name = name;	
	}

	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}

	public int getAge(){
		return age;
	}

	public void setHobby(String hobby){
		this.hobby = hobby;
	}

	public String getHobby(){
		return hobby;
	}

	public void showInfo(){
		System.out.println("학번: " + studentID);
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("취미: " + hobby);
	}

}