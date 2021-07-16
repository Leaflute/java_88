package ch08;

// p379
public class _09_Person {
	
	private String name;
	private int age;
	
	public _09_Person() {}
	
	public _09_Person(String name) {					//생성자 오버로드
		this.name = name;
	}
	
	public _09_Person(String name, int age) {			//생성자 오버로드
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
