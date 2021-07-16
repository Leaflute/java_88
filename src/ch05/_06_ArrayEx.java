package ch05;

public class _06_ArrayEx {
	public static void main(String[] args) {
		
		// p219 다차원배열
		
		int[][] arr = {
						{1,2,3}, // 0행
						{4,5,6}	// 1행
		};
		
		for(int i=0; i<2; i++) {  		// i -> 열의 길이
			for (int j=0; j<3; j++) {  	// j -> 행의 길이
					System.out.println(arr[i][j]);				
			}
			System.out.println();
		}
		
		System.out.println("----------------");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);				
			}
			System.out.println();
		}
		
		
	}
}
