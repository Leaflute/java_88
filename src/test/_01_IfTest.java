package test;

import java.util.Scanner;

public class _01_IfTest {
   public static void main(String[] args) {    // () -> [] 로 수정
   
   int eval = 0;
   char result = ' ';
      
   Scanner input = new Scanner(System.in);
   System.out.print("실적확인: ");
   eval = input.nextInt();
   
   if (eval >= 90) {
      result = 65;
   } else if (eval >= 80) {
      result = 66;      
   } else if (eval >= 70) {
      result = 67;
   } else if (eval >= 60) {
      result = 68;
   } else {
      result = 70;
   }
   
   System.out.println("실적점수: " + eval + ", 평가 : " + result);
   input.close();
   
   }
}