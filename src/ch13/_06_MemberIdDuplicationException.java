package ch13;

// RuntimeException을 상속받지 않으면 에러 발생
public class _06_MemberIdDuplicationException extends RuntimeException {

	public _06_MemberIdDuplicationException(String message) {
		super(message);
	}
	
}
