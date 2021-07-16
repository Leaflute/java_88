package ch09;

import java.util.ArrayList;

// p420
// 선착순

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String data) {
		arrayQueue.add(data);	// 큐의 맨 뒤에 추가
	}
	
	public String deQueue() {
		int len = arrayQueue.size();
		if(len==0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		return(arrayQueue.remove(0)); // 0번째 자료를 배열에서 제거
	}
}

public class _12_QueueTest {
	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());	// A
		System.out.println(queue.deQueue());	// B
		System.out.println(queue.deQueue());	// C
		
	}
}
