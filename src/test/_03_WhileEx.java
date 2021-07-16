package test;

import java.util.Scanner;

public class _03_WhileEx {

	public static void main(String[] args) {
		
	int dan = 2;
	int i  = 1;
	int result = 0;
	
	Scanner input = new Scanner(System.in);
	System.out.print("몇 단을 출력하시겠습니까? ");
	dan = input.nextInt();

	System.out.println("===== " + dan + "단 =====");
		while (i <= 9) {
		result  = dan * i;
		System.out.println(dan + " * " + i + " = " + result);		
		i++;
		}
	input.close();

	}
	
}