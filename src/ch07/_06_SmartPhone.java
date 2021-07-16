package ch07;

public class _06_SmartPhone extends _06_PDA implements _06_Mobile, _06_MP3 {

	@Override
	public void play() {
		System.out.println("음악을 튼다.");
	}

	@Override
	public void stop() {
		System.out.println("음악을 끈다.");
	}

	@Override
	public void sendSMS() {
		System.out.println("문자를 보내다.");
	}

	@Override
	public void receiveSMS() {
		System.out.println("문자를 받다.");
	}

}
