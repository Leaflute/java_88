package homework;

public class _ForExDiamond {
	public static void main(String[] args) {
		
		
		// i = 줄바꿈
		// j = 공백 생성 관계식
		// k = 별 생성  관계식
		// 공백은 무조건 왼쪽에 생성되어야 하므로 j에 관계된 for문 뒤에 동렬로 k에 관계된 for문을 생성
		// 이렇게하면 j,k와 i와의 관계만 생각하면 됨
		
		int i, j, k;
		
// 1-1		
//		*
//		**
//		***
//		****
//		*****
//		******
		
		for (i=1; i<=6; i++) {                 // 6줄 생성
			for (k=1; k<=i; k++) {             // k<=i면 *을 출력을 반복
				System.out.print("*");
			}
			System.out.println();
		}
		
		
// 1-2		
//		******
//		*****
//		****
//		***
//		**
//		*
		
		System.out.println();
		
		for (i=1; i<=6; i++) {                  // 6줄 생성     
			for (k=6; k>=i; k--) {              // *이 6부터 하나씩 줄어들어야하므로  
				System.out.print("*");			// k>=1일때까지 *출력하며 k는 6에서 감소
			}
			System.out.println();
		}
		

// 2-1
//	     	 *
//	    	**
//	   	   ***
//	  	  ****
//	 	 *****
//		******
		
		System.out.println();
		
		for (i=1; i<=6; i++) {					// 6줄 생성
			for (j=5; j>=i; j--) {				// j는 5부터 1까지 감소
				System.out.print(" ");
			} for (k=1; k<=i; k++) {			// k는 1부터 6까지 증가
				System.out.print("*");
			}
			System.out.println();
		}

		
// 2-2		
//		******
//		 *****
//		  ****
//		   ***
//		    **
//		     *
		
		System.out.println();
		
		for (i=1; i<=6; i++) {				// 6줄 생성
			for (j=0; j<i-1; j++) {			// i줄일때 j의 개수값 i-1
				System.out.print(" ");
			} for (k=1; k<=7-i; k++) {		// i줄일때 k의 개수값 7-i
				System.out.print("*");
			}
			System.out.println();
			
		}
		
// 3		
//		      *
//		     ***
//		    *****
//		   *******
//		  *********
//		 ***********
//		  *********
//		   *******
//		    *****
//		     ***
//		      *
		
		
		System.out.println();		
		
		// 윗삼각형
		for (i=1; i<=6; i++) {				// 6줄 생성
			for (j=5; j>=i; j--) {			// 2-1과 동일
				System.out.print(" ");				
			} for (k=1; k<=2*i-1; k++) {	// i가 증가할때 별의 갯수는 2k-1만큼 생성
				System.out.print("*");
			}
			System.out.println();	
		}
		
		
		// 아랫삼각형
		for (i=1; i<=5; i++) {				// 5줄 생성
			for (j=0; j<=i-1; j++) {		// 2-2 조건식인데 첫행 시작부터 공백이 하나 더 생겨야하므로 등호 추가
				System.out.print(" ");
			} for (k=1; k<=11-2*i; k++) {	// i가 증가할때 별의 갯수는 11-2i개만큼 생성
				System.out.print("*");				
			}
			System.out.println();	
		}
	}
}
