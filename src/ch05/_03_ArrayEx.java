package ch05;

public class _03_ArrayEx {
	 public static void main(String[] args) {
		 
		 // 자료형[] 배열명 = new 자료형[];
		 _03_Book[] library = new _03_Book[5];
		 
		 library[0] = new _03_Book("해리 포터", "조앤 K. 롤링");	
		 library[1] = new _03_Book("유년기의 끝", "아서 C. 클라크");
		 library[2] = new _03_Book("삼국지연의", "나관중");
		 library[3] = new _03_Book("유토피아", "토마스 모어");
		 library[4] = new _03_Book("논어", "공자");
		 
		 for (int i=0; i < library.length; i++) {
			 library[i].showBookInfo();
			 System.out.println(library[i]); // 각 배열요소의 인스턴스 주소값
		 }
		 
	}
}
