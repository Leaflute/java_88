package ch14;

public class _01_MyThread extends Thread {
	
	/*
	 * 멀티 태스킹
	 * 여러 개의 어플리케이션을 동시에 실행해서 컴퓨터 시스템의 성능을 높이기 위한 기법
	 * (음악을 들으면서 운동, 문서 편집하면서 인터넷에서 파일을 다운로드)
	 * 태스크
	 * 하나의 업무처리 단위
	 * 
	 * 멀티스레딩 
	 * 병렬작업을 하나의 어플리케이션 안에서 동시에 하는 것을 말한다.
	 * 
	 * 스레드
	 * 각각의 작업, 실행 흐름
	 * 
	 * 멀티스레딩의 장점
	 * - CPU의 사용률을 향상시킨다.
	 * - 자원을 보다 효율적으로 사용할 수 있다.
	 * - 사용자에 대한 응답성이 향상된다.
	 * - 작업이 분리되어서 코드가 간결해진다.
	 * 
	 * Thread 문법
	 * 1) Thread 클래스를 상속하기 - run() 메서드 오버라이드
	 * 2) Runnable 인터페이스를 구현하는 방법 - run() 메서드를 오버라이드
	 * 
	 */
	
	// Thread 클래스 상속하기
	
	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
	}
}