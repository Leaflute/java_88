package test;

import java.util.HashMap;
import java.util.Map;

public class _21_Main_Entry {
	public static void main(String[] args){

		Map<String, _21_Student> map = new HashMap<String, _21_Student>();
		
		// 멤버추가
		map.put("s001", new _21_Student(1, "강감찬", "gang@asdf.com"));		// )괄호 마무리 누락
		map.put("s002", new _21_Student(2, "고담덕", "go@asdf.com"));		
		map.put("s003", new _21_Student(3, "왕건", "wang@asdf.com"));		
		
		// 멤버변경
		map.put("s003", new _21_Student(3, "을지문덕", "eul@asdf.com"));		// 변경에도 put사용

		// 멤버 삭제
		map.remove("s003");

		// 멤버 추가
		map.put("s004", new _21_Student(4, "척준경", "chuk@asdf.com"));

		// 멤버 출력
		for (Map.Entry<String, _21_Student> str : map.entrySet()){
			String key = str.getKey();
			_21_Student stu = str.getValue();
			System.out.println(" key: " + key + " , value: " + stu);
		}
			
		
	}
}