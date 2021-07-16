package ch14;

public class _04_Thread {
	public static void main(String[] args) {
		System.out.println("현재 수행되고 있는 쓰레드 이름: " + Thread.currentThread().getName());	//main
		System.out.println("쓰레드의 최소 우선순위값  " + Thread.MIN_PRIORITY);
		System.out.println("쓰레드의 최대 우선순위값  " + Thread.MAX_PRIORITY);
		System.out.println("쓰레드의 중간 우선순위값  " + Thread.NORM_PRIORITY);
		System.out.println("현재 수행중인 쓰레드의 우선순위 " + Thread.currentThread().getPriority());

	}
}
