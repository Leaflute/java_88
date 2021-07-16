package ch10;

import java.util.Scanner;

public class _08_Main {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		_08_MemberInfo member = new _08_MemberInfo();
		try {
			member = readMemberInfo();
			member.showMemberInfo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} finally {
			input.close();
		}
		System.out.println("정상종료");
		
	}
	
	// throw를 main까지 떠넘기기
	static _08_MemberInfo readMemberInfo() throws Exception {
	
		String name = readName();
		int age = readAge();
		_08_MemberInfo member = new _08_MemberInfo(name, age);
		return member;
	}
	
	// 이름 입력후 예외 throw
	public static String readName() throws _08_InvalidNameException {
		System.out.print("이름 입력: ");
		String name = input.next();
		if(name.length()<2) {
			_08_InvalidNameException ine = new _08_InvalidNameException();
			ine.setWrongName(name);
			ine.showWrongName();
			throw new _08_InvalidNameException("이름은 2자 이상이어야 합니다.");
		} else {
			return name;
		}
	}
	
	// 나이 입력 후 예외 throw
	public static int readAge() throws _08_InvalidAgeException {
		System.out.print("나이 입력: ");
		int age = input.nextInt();
		if(age<0) {
			_08_InvalidAgeException iae = new _08_InvalidAgeException();
			iae.setWrongAge(age);
			iae.showWrongAge();
			throw new _08_InvalidAgeException("나이는 0세 이상이어야합니다.");
		} else {
			return age;
		}
	}
	
}
