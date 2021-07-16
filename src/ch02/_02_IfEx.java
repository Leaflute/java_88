package ch02;

public class _02_IfEx {
	public static void main(String[] args) {
		
	int num = -5;
	String result = "";
	
	// (양수/음수/0) 판단
	// 결과출력 => -5는 음수입니다
	
	if (num > 0) {
		result = "양수";
	} else if (num == 0) {
		result = "0";
	} else {
		result = "음수";
	}
	System.out.println(num + "는 " + result + "입니다.");
	}
}
