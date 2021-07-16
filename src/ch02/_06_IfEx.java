package ch02;

import java.util.Scanner;

public class _06_IfEx {
	public static void main(String[] args) {
		
		/*
		 * 입장료
		 * 
		 * age : 나이 입력받는다
		 * charge : 요금
		 * grade : 단계
		 * 
		 * ~8세   -> grade = "미취학 아동", charge = 1000
		 * ~13세 -> grade = "초등학생", charge = 2000
		 * ~19세 -> grade = "청소년, charge = 3000
		 * ~64세 -> grade = "일반인, ADULT_CHARGE : 4000선언 => charge 대입
		 * 65~ -> grade = "경로우대", ADULT_CHARGE의 20% 할인 => charge 대입
		 *
		 * 출력형식 => 나이 : 5세이며, grade : 미취학아동, 입장료 : 1000원
		 * 
		 */
		
		final int ADULT_CHARGE = 4000;
		int age = 0;
		int charge = 0;
		String grade = "";
		
		System.out.print("나이를 입력하세요. ");
		Scanner input = new Scanner(System.in);
		age = input.nextInt();
		if (age<=0) { 
			System.out.println("나이를 다시 입력하세요.");
		} else {
			if (age<=8) {
				grade = "미취학 아동";
				charge = 1000;
			} else if (age<=13) {
				grade = "초등학생";
				charge = 2000;
			} else if (age<=19) {
				grade = "청소년";
				charge = 3000;
			} else if (age>=65) {	
				grade = "경로우대";
				// 명시적 형변환
				charge = (int)(ADULT_CHARGE * 0.8F); // int = int * float = (int)(float * float); 
			} else {	
				grade = "일반인";
				charge = ADULT_CHARGE;
			}
			System.out.println("나이는 " + age +"세이며, " + grade + "(으)로 " + charge + "의 입장료가 부가된다.");
			input.close();	
		}

	}
}

//나이를 입력하세요. 70
//나이70세이며, 경로우대(으)로 3200의 입장료가 부가된다
