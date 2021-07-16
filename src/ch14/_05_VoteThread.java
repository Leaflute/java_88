package ch14;

import java.util.Random;

// 지역별 개표율 현황
public class _05_VoteThread implements Runnable {

	int sum = 0; // 총 개표율
	int targetNum = 100;
	Random random = new Random();	// 개표율 속도
	
	@Override
	public void run() {
		StringBuffer sb = new StringBuffer();	// *모양의 그래프를 출력 => 개표율을 *의 개수로 표현
		
		while(true) {
			sum += random.nextInt(10);	// 10까지의 난수발생 숫자를 누적시킴
			sb.delete(0, sb.length());	// 초기화, *의 길이만큼
			
			if(sum >= targetNum) {
				sum = 100;
				for (int i=0; i<sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() +" 개표율: " + sum + "\t" + sb);
				break;
			} else {
				System.out.println(Thread.currentThread().getName() +" 개표율: " + sum + "\t" + sb);

			}
			
			try {	// sleep(1000밀리초) : 1초
				Thread.sleep(500);	// 0.5초 	// cpu의 시간을 다른 스레드에게 넘겨주는 효율적인 방법이다. 현 작업을 중지하고 넘겨준다.
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
