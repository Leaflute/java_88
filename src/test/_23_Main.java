package test;

import java.util.Scanner;

public class _23_Main {
	
	static Scanner input = new Scanner(System.in);	// 클래스 위로 집어넣음
	
	public static void main(String[] args){

		_23_Student student = new _23_Student();

		try {
			student = callStudentInfo();
			student.printStudentInfo();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			input.close();
		}
		System.out.println("정상종료되었습니다.");
	}
	
	// callStudentInfo
	static _23_Student callStudentInfo() throws Exception {
		
		String name = callName();
		int score = callScore();

		_23_Student student = new _23_Student(name, score);
		return student;
	}

	// callName
	static String callName() throws _23_InvalidNameException {
		System.out.print("이름 입력: ");
		String inputName = input.next();
		if (inputName.length() < 2) {
			_23_InvalidNameException wrongName = new _23_InvalidNameException();
			wrongName.setWrongName(inputName);
			wrongName.showWrongName();
			throw new _23_InvalidNameException("이름은 두 자 이하일 수 없습니다.");
		} else {
			return inputName;
		}
	}
	
	// callScore
	public static int callScore() throws _23_InvalidScoreException {	// callScore() ()위치 틀림
		System.out.print("자바 점수 입력: ");
		int inputScore = input.nextInt();
		if (inputScore < 0) {
			_23_InvalidScoreException wrongScore = new _23_InvalidScoreException();
			wrongScore.setWrongScore(inputScore);
			wrongScore.showWrongScore();
			throw new _23_InvalidScoreException("점수는 음수입력일 수 없습니다.");
		} else {
			return inputScore;
		}
	}
}