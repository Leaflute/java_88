package ch02;

public class _21_ForEx {
	public static void main(String[] args) {
		
		/*
		 * "no pain no gain" 에서 쓰인 문자열의 길이와 n의 개수를 판명하기 
		 */
		
		String str = "no pain no gain";
		int count = 0;
		// str.charAt(i) == 'n' //i는 위치인덱스로 0부터 시작
		// str문자열 중에서'n'이 나오면 count를 증가시킨다.
		
		for (int i=0; i<str.length(); i++) { 
			if (str.charAt(i)!='n') {
				continue;
			}
			count += 1;		
		}
		
		System.out.println("str의 길이: " + str.length()); // 15자
		System.out.println("문장에서 발견된 n의 개수: " + count);
		
	}
}
