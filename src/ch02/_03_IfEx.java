package ch02;

public class _03_IfEx {
	public static void main(String[] args) {
		
		// score가 60점 이상이면 "합격", 60점 미만이면 "불합격", 40점 미만이면 "과락"을 result 변수에 출력
		int score = 20;
		String result = "";
		
		if (score >= 60) {
			result = "합격";
		} else if((score >= 40) && (score < 60)) {           // 40~59
			result = "불합격";
		} else {
			result = "과락";
		}
		System.out.println(score + "점: " + result);
		
		/*
 		 * 연산
 		 *  6. 삼항연산자 : 항이 3개인 연산자를 의미
 		 *  			 결과 = 조건식? 결과1 : 결과2;
 		 *  			 조건식이 참이면 결과 1을 수행해서 결과 대입, 거짓이면 결과 2를 수행해서 대입
 		 */
 		score = 90;
 		
 		// 결과 = 조건식 ? 참결과 : 거짓결과
 		String resultStr = (score >= 60) ? "합격" : "불합격";
 		System.out.println("합격여부 : " + resultStr); // 합격여부 : 합격
 		
		// 3항 연산자를 이용해서 출력 (마지막 항은 if문의 else와 같은 역할)
		result = (score >= 60) ? "합격" : ((score >= 40) ? "불합격" : "과락"); 
		System.out.println(score + "점: " + result);
		

	}

}
