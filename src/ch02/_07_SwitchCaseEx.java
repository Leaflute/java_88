package ch02;

import java.util.Scanner;

public class _07_SwitchCaseEx {
	public static void main(String[] args) {
		/*
		 * 조건
		 * switch(조건) {            // 조건 : 조건식, 변수 
		 *  case 값1 : 수행문1;
		 *  		break;
		 *  case 값2 : 수행문2;
		 *  		break;
		 *  case 값3 : 수행문3;
		 *  		break;
		 *  default : 수행문4;
		 * 
		 * }
		 */
		
		// ranking에 따른 메달 색깔 출력
		// 1: 금메달 2: 은메달  3: 동메달  그 외: 참가상
		String medal = "";
		int ranking = 4;
		
		switch(ranking) {
			case 1 : medal = "금메달";
				break;
			case 2 : medal ="은메달";
				break;
			case 3 : medal = "동메달";
				break;
			default : medal = "참가상";
				break;
		}
		System.out.println(medal + "입니다.");
		
		char medal2 = ' ';
		int ranking2 = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("순위를 입력하세요 : ");
		
		ranking2 = input.nextInt();
		
		switch(ranking2) {
			case 1 : medal2 = 'G';			
				break;
			case 2 : medal2 = 'S';
				break;
			case 3 : medal2 = 'B';
				break;
			default : medal2 = 'N';
				break;
		}
		System.out.println(medal2 + "입니다.");
		input.close();
		
	}

}
