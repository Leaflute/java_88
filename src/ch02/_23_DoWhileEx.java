package ch02;

import java.util.Scanner;

public class _23_DoWhileEx {
	public static void main(String[] args) {
		
		// 월을 입력
		// 월입력[1~12] : 입력월 출력
		// 범위초과(12보다 크거나, 1보다 작으면) => ~월은 입력이 잘못되었습니다. 다시 입력하세요~
		
		int month = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("월 입력하세요. ");
		
			do {
				month = input.nextInt();
				if(month>12||month<1) {
					System.out.print(month + "월은 입력이 잘못되었습니다. 다시 입력하세요. ");
//						continue;
				} else {
					System.out.println(month + "월입니다.");
						break;
				}	
			} while (true);
		
		input.close();
	}
}
