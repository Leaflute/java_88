package ch02;

import java.util.Scanner;

public class _08_SwitchCaseEx {
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
		 *  default : 수행문사;
		 * 
		 * }
		 */	
		
		// 숫자 num 기준 => str : 
		// 예 1 : 하나 , 2~4 : 두서넛, 5~6 : 대여섯, 그 외 : 많음
		
		int num = 0;
		String str = "";
		
		Scanner input = new Scanner(System.in);
		System.out.print("숫자를 입력하세요.");
		num = input.nextInt();
		
		switch(num) {
			case 1 : str = "하나";
				break;
			case 2 : case 3 : case 4 : str = "두서넛"; 
				break;
			case 5 : case 6 : str = "대여섯";
				break;
			default : str = "많음";	
		}
		System.out.println(num + "은(는) " + str + "입니다.");
		input.close();
		
	}
	
}
