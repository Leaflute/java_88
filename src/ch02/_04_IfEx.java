package ch02;

import java.util.Scanner;

public class _04_IfEx {

	public static void main(String[] args) {

		/*
		 * 학점구하기
		 * 
		 * 1. 점수는 score 변수, 학점은 grade 변수
		 * 2. 점수가 90점 이상이면 A
		 *    점수가 80점 이상이면 B
		 *    점수가 70점 이상이면 C
		 *    점수가 60점 이상이면 D
		 *    점수가 60점 미만이면 F   	
		 * 3. 결과 => 점수 : 80 , 학점 : B
		 */
		
		int score = 0;
		char grade = ' ';
		
		// Heap메모리에  Scanner(객체 즉, 인스턴스)를 생성하고, 
		// 그 주소값을 input에 대입하라
		// 클래스명 참조변수 = new 클래스명(System.in);
	    Scanner scan = new Scanner(System.in);
	    
		// 참조변수.메서드명
		// nextInt() : 콘솔에서 입력받은 정수를 읽어들임
	    System.out.print("성적입력 : ");
	    score = scan.nextInt();
	    
		if (score >= 90) {
			grade = 65;
	    } else if(score >= 80) {
	    	grade = 66;
        } else if(score >= 70) {
        	grade = 67;
        } else if(score >= 60) {
        	grade = 68;
        } else {
        	grade = 70;
        }
		
		// 항상 수행이 되는 부분
		System.out.println("점수 : " + score + ", 학점 : " + grade);
		scan.close();		
    }
}