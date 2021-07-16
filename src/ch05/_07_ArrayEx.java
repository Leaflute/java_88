package ch05;

public class _07_ArrayEx {
	public static void main(String[] args) {
		   /*
	       * *** 성적표 ***
	       * ================================
	       * 번호   국어   영어   수학   총점   평균   학점
	       * ================================
	       *  1   100  100  100  300  100  A
	       *  2    90   90   90  270   90  A
	       *  3    70   70   70  210   70  C
	       *  4   70  100  100  300  100  A
	       *  5   60  100  100  300  100  A
	       *  ==============================
	       *  과목합계  390  390  390   
	       *  
	       *  평균 : 소수점 이하 둘째자리
	       *  2찬원배열명 => scores  국,영,수 점수는 주어진 값
	       *  총점(sum),  평균(avg), 학점, 과목합계(korTot, engTot, mathTot)는 직접계산
	       */
	      
	      int[][] scores = {
	            {100, 100, 100}   
	           , {90, 90, 90}   
	           , {70, 70, 70}   
	           , {70, 100, 100}   
	           , {60, 100, 100}   
	      };
	      int korTot = 0;
	      int engTot = 0;
	      int mathTot = 0;
	      	      
	      System.out.println("*** 성적표 ***");
	      System.out.println("====================================");
	      System.out.println("번호  국어    영어     수학      총점       평균    학점");
	      System.out.println("====================================");
	      
	      for(int i=0; i<scores.length; i++) {
    		  System.out.print(i+1 + "   ");
	    	  for(int j=0; j<scores[i].length; j++) {
	    		  System.out.print(scores[i][j]);
	    		  if (100 == scores[i][j]) {
	    			  System.out.print("*  ");
	    		  } else {
	    			  System.out.print("    ");
	    		  }
	    	  }	  
	    	  
		      int sum = 0;
			  sum = scores[i][0] + scores[i][1] + scores[i][2];
			  System.out.print(sum);
			  if (270 <=  sum) {
    			  System.out.print("! ");
    		  } else {
    			  System.out.print("  ");
    		  }
			  
		      double avg;
		      avg = sum/3.0;
	    	  System.out.printf("%6.2f", avg);
	    	  System.out.print("  ");
	    	  
	    	  char ch;
	    	  switch((int)avg/10){
	    	  		case 10 :
	    	  		case 9 : ch = 'A';
	    	  			break;
	    	  		case 8 : ch = 'B';
	    	  			break;
	    	  		case 7 : ch = 'C';
	    	  			break;
	    	  		case 6 : ch = 'D';
	    	  			break;
	    	  		default : ch = 'F';	
	    	  }
	    	  System.out.print(ch);
	    	  System.out.println();
	    	  korTot += scores[i][0];
	    	  engTot += scores[i][1];
	    	  mathTot += scores[i][2];
	      }
	      
	      System.out.println("====================================");
	      System.out.print("과목별 총점 ");
	      System.out.print(korTot + " " + engTot + " " + mathTot);
	      
	}
}
