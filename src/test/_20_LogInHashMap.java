package test;

import java.util.Scanner;
import java.util.HashMap;

public class _20_LogInHashMap {
	public static void main(String[] args){

			HashMap<String, String> map = new HashMap<String, String>();
	
			// 멤버 추가
			map.put("hong", "hong1234");
			map.put("kim", "kim1234");
			map.put("lee", "lee1234");
			map.put("park", "park1234");
			map.put("na", "na1234");	
	
			Scanner sc = new Scanner(System.in);
	
			// 로그인
			do {
				System.out.print("아이디: ");
				String id = sc.next();
				System.out.print("비밀번호: ");
				String pwd = sc.next();
				
				if (id.equals("Q")||id.equals("q")){
					System.out.println("종료합니다.");
					break;
				} else {
					if (map.containsKey(id)){
						if(map.get(id).equals(pwd)) {
							System.out.println("로그인 성공");
							break;
						} else {
							System.out.println("비밀번호가 틀렸습니다.");
						}	
					} else {
						System.out.println("존재하지 않는 아이디입니다.");
					}
				} 
			} while (true);	// 위치 틀림
	}	
}
	