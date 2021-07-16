package ch02;

public class _18_ForEx {
	public static void main(String[] args) {

		// 2~20까지의 짝수 합계
		
		int sum=0;
		
		for (int even=2; even<=20; even+=2) {
			System.out.println("sum: " + sum + ", even: " + even + " = " + (sum+=even));
		}
		System.out.println("2부터 20까지의 짝수의 합은 " + sum);
	}

}
