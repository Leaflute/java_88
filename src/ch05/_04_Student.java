package ch05;

public class _04_Student {
	
		//멤버변수
		private String name;
		private int age;
		private String email;
		
		//디폴트 생성자
		public _04_Student() {}
		
		//매개변수 생성자
		public _04_Student(String name, int age, String email) {
			this.name = name;
			this.age = age;
			this.email = email;
		}
		
		//멤버메서드(setter,getter)
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getEmail() {
			return email;
		}
		//멤버메서드(showInfo)
		public void showInfo() {
			System.out.println("이름: " + name + ", 나이: " + age + ", 이메일: " + email);
		}
		
}
