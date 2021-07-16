package test;

public class _04_WhileEx {
	public static void main(String[] args){
	
	int dan = 2;
	int result = 0;
	
	while (dan <=9) {
		System.out.println("=== " + dan + "단 ===");
		System.out.println("==========");
		int i = 1;
		while (i <= 9){
			result = dan * i;
			System.out.println(dan + " * " + i + " = " + result);
			i++;
		}
		dan++; // 누락
	}




	}
}