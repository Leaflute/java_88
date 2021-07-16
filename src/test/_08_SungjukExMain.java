package test;
	public class _08_SungjukExMain{
		
		public static void main(String[] args){
			
		// new
		_08_SungjukEx lee = new _08_SungjukEx();  // 참조변수 숫자시작 불가

		// setter
		lee.setKor(100);          // 참조변수 대신에 클래스명을 씀
		lee.setEng(98);
		lee.setMath(88);

		// 매개변수 포함 new
		_08_SungjukEx kim = new _08_SungjukEx(89,98,78);
			
		// printInfo()
		lee.printInfo();
		System.out.println("------------------------------");
		kim.printInfo();
	}

}