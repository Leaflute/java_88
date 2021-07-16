package ch06;

// 자식클래스
public class _05_VipMember extends _05_Member {

		// 멤버변수
		private String level; // vip
		
		// 디폴트 생성자
		public _05_VipMember() {}
		
		// 매개변수 생성자
		public _05_VipMember(String id, String pwd, String name, String level) {
			super(id, pwd, name);
			this.level = level;
		}
		
		// showInfo
		public void showInfo() {
			super.showInfo();
			System.out.print("\t등급: " + level);
		}
		
}
