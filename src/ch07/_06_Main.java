package ch07;

public class _06_Main {
	public static void main(String[] args) {
		
		_06_SmartPhone sm = new _06_SmartPhone();
		sm.receiveSMS();
		sm.sendSMS();
		sm.calculate(1, 2);
		sm.play();
		sm.stop();
		
		System.out.println("===다형성적용===");
		_06_MP3 mp3 = new _06_SmartPhone();
		mp3.play();
		mp3.play();
		
		// 다운캐스팅
		_06_SmartPhone mobile = (_06_SmartPhone)mp3;
		mobile.sendSMS();
		mobile.receiveSMS();
	}
}
