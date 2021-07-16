package test;

import java.util.Scanner;

public class _02_SwitchCaseEx {
	public static void main(String[] args){
	
	int score = 0; 
	char grade = ' '; 
	
	Scanner input = new Scanner(System.in);
	System.out.print("점수를 입력하시오.  : ");
	score = input.nextInt();
	
	if ((score > 100)||(score < 0)) {
		System.out.println("잘못된 입력입니다.");
	} else {
		switch (score/10) {
			case 9 : case 10 : grade = 'A';
				break;
			case 8 : grade = 'B';
				break;
			case 7 : grade = 'C';
				break;
			case 6 : grade = 'D';
				break;
			default : grade = 'F';
		}
	System.out.println("점수 : " + score + " , 학점 : " + grade);
	}
	input.close();

	}
}