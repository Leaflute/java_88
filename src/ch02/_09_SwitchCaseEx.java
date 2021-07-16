package ch02;

import java.util.Scanner;

public class _09_SwitchCaseEx {
	public static void main(String[] args) {
		// test2
		/*
		 * 학점구하기
		 * 
		 * 1. 점수는 score 변수, 학점은 grade 변수
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F   	
		 * 3. 결과 => 콘솔창 입력
		 */
		
	// _05_IfEx를 Switch Case 적용	
	int score = 0;
	char grade = ' ';
	
	Scanner scan = new Scanner(System.in);
	System.out.print("점수를 입력하세요.");
	
	score = scan.nextInt();
    if ((score > 100) || (score < 0))  {
    	System.out.println("잘못된 입력입니다.");
    	} else {
    		switch (score / 10) {
    			case 6 : grade = 68;
    				break;
    			case 7 : grade = 67;
    				break;
    			case 8 : grade = 66;
    				break;	
    			case 9 : 
    			case 10 : grade = 65;
    				break;
    			default : grade = 70;		
    				break;
    		}
    	System.out.println("점수: " + score + ", 학점: " + grade);
    	}
	scan.close();
	}
}